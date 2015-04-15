TakipiYoutubeManager = function()
{
	this.apiReady = false;
	this.callbacks = [];
};
TakipiYoutubeManager.prototype = {
	addCallback:function(callback)
	{
		if (this.apiReady)
		{
			callback();
		}
		else
		{
			this.callbacks.push(callback);
		}
	},
	apiIsReady:function()
	{
		this.apiReady = true;
		
		for (var i = 0; i < this.callbacks.length; i++)
		{
			this.callbacks[i]();
		}
	},
};

var TakipiYoutubeManagerInst = new TakipiYoutubeManager();

onYouTubeIframeAPIReady = function()
{
	TakipiYoutubeManagerInst.apiIsReady();
};

setYoutubePopupCallback = function(btn)
{
	var youtubeModalPopup = $("#youtubePopup");
	
	var pauseTimeout = null;
	
	var onPlayerStateChange = function(event)
	{
		if (event.data == YT.PlayerState.PLAYING)
		{
			if (pauseTimeout != null)
			{
				clearTimeout(pauseTimeout);
				pauseTimeout = null;
			}
		}
		
		if (event.data == YT.PlayerState.PAUSED)
		{
			if (pauseTimeout == null)
			{
				pauseTimeout = setTimeout(function () {
					EventManagerInst.dispatch(youtubeModalPopup, "CLOSE_MODAL");
				}, 1000);
			}
		}
	};
	
	var markPlayerReady = false;
	
	var onPlayerReady = function()
	{
		markPlayerReady = true;
	};
	
	var playVideo = function()
	{
		if (markPlayerReady)
		{
			ytPlayer.playVideo();
		}
		else
		{
			setTimeout(function () {
				playVideo();
			}, 1000);
		}
		
		return false;
	};
	
	ytPlayer = new YT.Player("ytPlayer", {
		"height":"420",
		"width":"640",
		"videoId": "a-4ftQsoZas",
		"events": {
			"onReady": onPlayerReady,
			"onStateChange": onPlayerStateChange
		}
	});
	
	btn.click(function() {
		ModalManagerInst.pushModal(youtubeModalPopup, true, true, true, 500, function() {
			ytPlayer.pauseVideo();
		});
		
		playVideo();
		
		return false;
	});
};

indexPageYoutubePopupCallback = function()
{
	setYoutubePopupCallback($("a#videoPopupBtn"));
};

initializeIndexYoutubePopup = function()
{
	TakipiYoutubeManagerInst.addCallback(indexPageYoutubePopupCallback);
};

featuresPageYoutubePopupCallback = function()
{
	setYoutubePopupCallback($("a#videoImageBtn"));
};

initializeFeaturesYoutubePopup = function()
{
	TakipiYoutubeManagerInst.addCallback(featuresPageYoutubePopupCallback);
};

getParameterByName = function(name)
{
	name = name.replace(/[\[]/, "\\\[").replace(/[\]]/, "\\\]");
	
	var regexS = "[\\?&]" + name + "=([^&#]*)";
	var regex = new RegExp(regexS);
	var results = regex.exec(window.location.search);
	
	if (results == null)
	{
		return "";
	}
	else
	{
		return decodeURIComponent(results[1].replace(/\+/g, " "));
	}
};

removeURLParameter = function(url, parameter)
{
	var hashLocation = url.indexOf('#');
	
	if (hashLocation < 0)
	{
		hashLocation = url.length;
	}
	
	var urlparts = url.substring(0, hashLocation).split('?');
	
	if (urlparts.length >= 2)
	{
		var prefix = encodeURIComponent(parameter) + '=';
		var parts = urlparts[1].split(/[&;]/g);
		
		for (var i = parts.length - 1; i >= 0; i--)
		{
			if (parts[i].lastIndexOf(prefix, 0) !== -1)
			{
				parts.splice(i, 1);
			}
		}
		
		if (parts.length == 0)
		{
			url = urlparts[0] + url.substring(hashLocation);
		}
		else
		{
			url = urlparts[0] + '?' + parts.join('&') + url.substring(hashLocation);
		}
	}
	
	return url;
};

initializeVideo = function()
{
	var contextEl = $("#videoContext");
	var videoEl = $("video.homeSiteVideo", contextEl);
	var rewindBtn = $("a.rewind", contextEl);
	
	rewindBtn.hide();
	
	var videoElement = videoEl[0];
	
	rewindBtn.click(function() {
		rewindBtn.hide();
		videoElement.play();
		
		return false;
	});
	
	videoElement.addEventListener("ended", function() {
		rewindBtn.fadeIn();
	}, true);
};

initializeBubbles = function(scala)
{
	var EXPAND_ANIMATION_TIME = 200;
	var CONTRACT_ANIMATION_TIME = 200;
	
	var ANIMATION_TIME_S	= 200;
	var ANIMATION_TIME_L	= 500;
	var ANIMATION_TIME_INFO = 1000;
	var ANIMATION_TIME_XL	= 3500;
	
	var content = $("#bubblesHolder");
	
	var codeTreeBubble = $(".codeTreeBubble", content);
	var codeTreeBtn = $(".expandBubble", codeTreeBubble);
	
	var varBubble = $(".varBubble", content);
	var varBtn = $(".expandBubble", varBubble);
	
	var resetCodeTreeAnimationState = function()
	{
		$(".animationPart", codeTreeBubble).hide();
		$(".metro", codeTreeBubble).css({"height":"0px"});
	};
	
	var resetVarAnimationState = function()
	{
		$(".animationPart", varBubble).hide();
	};
	
	var expandTreePhase1 = function()
	{
		codeTreeBtn.addClass("contract");
		
		codeTreeBubble
			.animate(
				{"width":"800px", "height":"420px"},
				EXPAND_ANIMATION_TIME,
				function () {
					expandTreePhase2();
				}
			);
		
		if (!scala)
		{
			$(".backgroundWrapper", codeTreeBubble).fadeIn(EXPAND_ANIMATION_TIME);
		}
	};
	
	var expandTreePhase2 = function()
	{
		$(".infoText", codeTreeBubble)
			.fadeIn(
				ANIMATION_TIME_INFO,
				function() {
					expandTreePhase3();
			});
	};
	
	var expandTreePhase3 = function()
	{
		$(".metro", codeTreeBubble)
			.show()
			.animate(
				{"height":"388px"},
				ANIMATION_TIME_L,
				function () {
					expandTreePhase4();
				}
			);
	};
	
	var expandTreePhase4 = function()
	{
		$(".method1", codeTreeBubble)
			.fadeIn(
				ANIMATION_TIME_S,
				function () {
					expandTreePhase5();
			});
	};
	
	var expandTreePhase5 = function()
	{
		$(".method2", codeTreeBubble)
			.fadeIn(
				ANIMATION_TIME_S,
				function () {
					expandTreePhase6();
			});
	};
	
	var expandTreePhase6 = function()
	{
		$(".method3", codeTreeBubble)
			.fadeIn(
				ANIMATION_TIME_S,
				function () {
					expandTreePhase7();
			});
	};
	
	var expandTreePhase7 = function()
	{
		$(".method4", codeTreeBubble)
			.fadeIn(
				ANIMATION_TIME_S,
				function () {
					expandTreePhase8();
			});
	};
	
	var expandTreePhase8 = function()
	{
		$(".method5", codeTreeBubble)
			.fadeIn(
				ANIMATION_TIME_S,
				function () {
					expandTreePhase9();
			});
	};
	
	var expandTreePhase9 = function()
	{
		$(".method6", codeTreeBubble)
			.fadeIn(
				ANIMATION_TIME_S,
				function () {
					expandTreePhase10();
			});
	};
	
	var expandTreePhase10 = function()
	{
		$(".method7", codeTreeBubble)
			.fadeIn(
				ANIMATION_TIME_S,
				function () {
					expandTreePhase11();
			});
	};
	
	var expandTreePhase11 = function()
	{
		$(".arrow1", codeTreeBubble)
			.fadeIn(
				ANIMATION_TIME_L,
				function() {
					expandTreePhase12();
			});
	};
	
	var expandTreePhase12 = function()
	{
		$(".arrow2", codeTreeBubble)
			.fadeIn(ANIMATION_TIME_L);
	};
	
	var contractTreePhase1 = function()
	{
		if (codeTreeBtn.hasClass("contract"))
		{
			codeTreeBubble.stop();
			$(".animationPart", codeTreeBubble).stop();
			
			codeTreeBtn.addClass("pending");
			
			if (scala)
			{
				codeTreeBubble
					.animate(
						{"width":"256px", "height":"53px"},
						CONTRACT_ANIMATION_TIME,
						function () {
							contractTreePhase2();
						}
				);
			}
			else
			{
				codeTreeBubble
					.animate(
						{"width":"266px", "height":"53px"},
						CONTRACT_ANIMATION_TIME,
						function () {
							contractTreePhase2();
						}
				);
				
				$(".backgroundWrapper", codeTreeBubble).fadeOut(EXPAND_ANIMATION_TIME);
			}
		}
	};
	
	var contractTreePhase2 = function()
	{
		resetCodeTreeAnimationState();
		codeTreeBtn.removeClass("contract").removeClass("pending");
	};
	
	var expandVarPhase1 = function()
	{
		varBtn.addClass("contract");
		
		if (scala)
		{
			varBubble
				.animate(
					{"width":"585px", "height":"295px"},
					EXPAND_ANIMATION_TIME,
					function () {
						expandVarPhase2();
					}
				);
		}
		else
		{
			varBubble
			.animate(
				{"width":"665px", "height":"335px"},
				EXPAND_ANIMATION_TIME,
				function () {
					expandVarPhase2();
				}
			);
			
			$(".backgroundWrapper", varBubble).fadeIn(EXPAND_ANIMATION_TIME);
		}
	};
	
	var expandVarPhase2 = function()
	{
		$(".infoText", varBubble)
			.fadeIn(
				ANIMATION_TIME_INFO,
				function() {
					expandVarPhase3();
			});
	};
	
	var expandVarPhase3 = function()
	{
		$(".codeText", varBubble)
			.fadeIn(
				ANIMATION_TIME_L,
				function() {
					expandVarPhase4();
			});
	};
	
	var expandVarPhase4 = function()
	{
		$(".highlight", varBubble)
			.fadeIn(
				ANIMATION_TIME_L,
				function() {
					expandVarPhase5();
			});
	};
	
	var expandVarPhase5 = function()
	{
		$(".arrows", varBubble)
			.fadeIn(ANIMATION_TIME_L);
	};
	
	var contractVarPhase1 = function()
	{
		if (varBtn.hasClass("contract"))
		{
			varBubble.stop();
			$(".animationPart", varBubble).stop();
			
			varBtn.addClass("pending");
			
			if (scala)
			{
				varBubble
					.animate(
						{"width":"152px", "height":"53px"},
						CONTRACT_ANIMATION_TIME,
						function () {
							contractVarPhase2();
						}
				);
			}
			else
			{
				varBubble
					.animate(
						{"width":"262px", "height":"53px"},
						CONTRACT_ANIMATION_TIME,
						function () {
							contractVarPhase2();
						}
				);
				
				$(".backgroundWrapper", varBubble).fadeOut(EXPAND_ANIMATION_TIME);
			}
		}
	};
	
	var contractVarPhase2 = function()
	{
		resetVarAnimationState();
		varBtn.removeClass("contract").removeClass("pending");
	};
	
	codeTreeBtn.click(function () {
		if (!(codeTreeBtn.hasClass("pending")))
		{
			if (codeTreeBtn.hasClass("contract"))
			{
				contractTreePhase1();
			}
			else
			{
				ReleaseOutsideInst.addItem(codeTreeBubble, contractTreePhase1);
				expandTreePhase1();
			}
		}
		
		return false;
	});
	
	varBtn.click(function () {
		if (!(varBtn.hasClass("pending")))
		{
			if (varBtn.hasClass("contract"))
			{
				contractVarPhase1();
			}
			else
			{
				ReleaseOutsideInst.addItem(varBubble, contractVarPhase1);
				expandVarPhase1();
			}
		}
		
		return false;
	});
	
	resetCodeTreeAnimationState();
	resetVarAnimationState();
	
	if (scala)
	{
		var threadBubble = $(".threadBubble", content);
		var threadBtn = $(".expandBubble", threadBubble);
		
		var historyBubble = $(".historyBubble", content);
		var historyBtn = $(".expandBubble", historyBubble);
		
		var resetThreadAnimationState = function()
		{
			$(".animationPart", threadBubble).hide();
		};
		
		var resetHistoryAnimationState = function()
		{
			$(".animationPart", historyBubble).hide();
			$(".metro", historyBubble).css({"height":"0px", "bottom":"311px"});
		};
		
		var expandThreadPhase1 = function()
		{
			threadBtn.addClass("contract");
			
			threadBubble
				.animate(
					{"width":"720px", "height":"400px"},
					EXPAND_ANIMATION_TIME,
					function () {
						expandThreadPhase2();
					}
				);
		};
		
		var expandThreadPhase2 = function()
		{
			$(".infoText", threadBubble)
				.fadeIn(
					ANIMATION_TIME_INFO,
					function() {
						expandThreadPhase3();
				});
		};
		
		var expandThreadPhase3 = function()
		{
			$(".threadsHeader", threadBubble).fadeIn(ANIMATION_TIME_L);
			
			$(".thread1 *", threadBubble).show();
			$(".thread1", threadBubble)
				.fadeIn(
					ANIMATION_TIME_XL,
					function() {
						expandThreadPhase4();
				});
		};
		
		var expandThreadPhase4 = function()
		{
			$(".thread1", threadBubble)
				.fadeOut(ANIMATION_TIME_L);
			
			$(".thread2 *", threadBubble).show();
			$(".thread2", threadBubble)
				.fadeIn(
					ANIMATION_TIME_XL,
					function() {
						expandThreadPhase5();
				});
		};
		
		var expandThreadPhase5 = function()
		{
			$(".thread2", threadBubble)
				.fadeOut(ANIMATION_TIME_L);
			
			$(".thread3 *", threadBubble).show();
			$(".thread3", threadBubble)
				.fadeIn(ANIMATION_TIME_XL);
		};
		
		var contractThreadPhase1 = function()
		{
			if (threadBtn.hasClass("contract"))
			{
				threadBubble.stop();
				$(".animationPart", threadBubble).stop();
				
				threadBtn.addClass("pending");
				
				threadBubble
					.animate(
						{"width":"182px", "height":"53px"},
						CONTRACT_ANIMATION_TIME,
						function () {
							contractThreadPhase2();
						}
				);
			}
		};
		
		var contractThreadPhase2 = function()
		{
			resetThreadAnimationState();
			threadBtn.removeClass("contract").removeClass("pending");
		};
		
		var expandHistoryPhase1 = function()
		{
			historyBtn.addClass("contract");
			
			historyBubble
				.animate(
					{"width":"660px", "height":"335px"},
					EXPAND_ANIMATION_TIME,
					function () {
						expandHistoryPhase2();
					}
				);
		};
		
		var expandHistoryPhase2 = function()
		{
			$(".infoText", historyBubble)
				.fadeIn(
					ANIMATION_TIME_INFO,
					function() {
						expandHistoryPhase3();
				});
		};
		
		var expandHistoryPhase3 = function()
		{
			$(".metro", historyBubble)
				.show()
				.animate(
					{"height":"256px", "bottom":"55px"},
					ANIMATION_TIME_L,
					function () {
						expandHistoryPhase4();
					}
				);
		};
		
		var expandHistoryPhase4 = function()
		{
			$(".value1", historyBubble)
				.fadeIn(
					ANIMATION_TIME_L,
					function() {
						expandHistoryPhase5();
				});
		};
		
		var expandHistoryPhase5 = function()
		{
			$(".value2", historyBubble)
				.fadeIn(
					ANIMATION_TIME_L,
					function() {
						expandHistoryPhase6();
				});
		};
		
		var expandHistoryPhase6 = function()
		{
			$(".value3", historyBubble)
				.fadeIn(
					ANIMATION_TIME_L,
					function() {
						expandHistoryPhase7();
				});
		};
		
		var expandHistoryPhase7 = function()
		{
			$(".arrow", historyBubble)
				.fadeIn(ANIMATION_TIME_L);
		};
		
		var contractHistoryPhase1 = function()
		{
			if (historyBtn.hasClass("contract"))
			{
				historyBubble.stop();
				$(".animationPart", historyBubble).stop();
				
				historyBtn.addClass("pending");
				
				historyBubble
					.animate(
						{"width":"160px", "height":"53px"},
						CONTRACT_ANIMATION_TIME,
						function () {
							contractHistoryPhase2();
						}
				);
			}
		};
		
		var contractHistoryPhase2 = function()
		{
			resetHistoryAnimationState();
			historyBtn.removeClass("contract").removeClass("pending");
		};
		
		threadBtn.click(function () {
			if (!(threadBtn.hasClass("pending")))
			{
				if (threadBtn.hasClass("contract"))
				{
					contractThreadPhase1();
				}
				else
				{
					ReleaseOutsideInst.addItem(threadBubble, contractThreadPhase1);
					expandThreadPhase1();
				}
			}
			
			return false;
		});
		
		historyBtn.click(function () {
			if (!(historyBtn.hasClass("pending")))
			{
				if (historyBtn.hasClass("contract"))
				{
					contractHistoryPhase1();
				}
				else
				{
					ReleaseOutsideInst.addItem(historyBubble, contractHistoryPhase1);
					expandHistoryPhase1();
				}
			}
			
			return false;
		});
		
		resetThreadAnimationState();
		resetHistoryAnimationState();
	}
};

TakipiContactLink = function(type, url)
{
	this.type = type;
	this.url = url;
};
TakipiContactLink.prototype = {
	render:function()
	{
		var isMail = (this.type == "mail");
		var actualUrl = (isMail ? ("mailto:" + this.url) : this.url);
		
		var linkRender = $(document.createElement('a')).addClass(this.type).attr({"href" : actualUrl});
		
		if (isMail)
		{
			linkRender.attr({"target":"_blank"});
		}
		
		return linkRender;
	}
}; 

TakipiContactAbout = function (name)
{
	this.name = name;
	this.title = "";
	this.text = "";
	this.footerText = "";
	this.imgUrl = "";
	this.links = [];
};
TakipiContactAbout.prototype = {
	addLink:function(type, url)
	{
		this.links.push(new TakipiContactLink(type, url));
	},
	renderImg:function()
	{
		var imgAttr = "url(./img/about/" + this.imgUrl + ")";
		return $(document.createElement('div')).addClass("imgHolder").css({"background-image" : imgAttr});
	},
	renderText:function()
	{
		var textHolder = $(document.createElement('div')).addClass("textHolder");
		
		var titleText = this.name + ((this.title != "") ? (", " + this.title) : "");
		$(document.createElement('div')).addClass("title").text(titleText).appendTo(textHolder);
		$(document.createElement('div')).addClass("text").text(this.text).appendTo(textHolder);
		
		var footerHolder = $(document.createElement('div')).addClass("footerHolder").appendTo(textHolder);
		$(document.createElement('span')).addClass("footerText").text(this.footerText).appendTo(footerHolder);
		
		for (var i = 0; i < this.links.length; i++)
		{
			this.links[i].render().appendTo(footerHolder);
		}
		
		return textHolder;
	},
	renderCodeHeader:function()
	{
		return $(document.createElement('code')).html("takipi.add(<span class=\"value\">\"" + this.name + "\"</span>);");
	},
	renderContactHolder:function(leftSide)
	{
		var contactHolder = $(document.createElement('div')).addClass("contactHolder");
		
		$(document.createElement('div')).addClass("leftCurly").appendTo(contactHolder);
		
		if (leftSide)
		{
			this.renderText().appendTo(contactHolder);
			this.renderImg().appendTo(contactHolder);
		}
		else
		{
			this.renderImg().appendTo(contactHolder);
			this.renderText().appendTo(contactHolder);
		}
		
		$(document.createElement('div')).addClass("rightCurly").appendTo(contactHolder);
		
		if (leftSide)
		{
			contactHolder.addClass("left");
		}
		
		return contactHolder;
	},
	render:function(leftSide)
	{
		var contactWrapper = $(document.createElement('div')).addClass("contactWrapper");
		
		this.renderCodeHeader().appendTo(contactWrapper);
		this.renderContactHolder(leftSide).appendTo(contactWrapper);
		
		return contactWrapper;
	}
};

initializeAboutUs = function()
{
	var contactsList = $("#aboutUsMain .content .contactsList");
	
	var allContacts = [];
	
	var talContact = new TakipiContactAbout("Tal Weiss");
	talContact.title = "CEO";
	talContact.text = "Tal is the CEO at Takipi, responsible for overseeing the company's strategy and operations. Previously, Tal was co-founder and CEO at VisualTao, a Sequoia backed start-up which was acquired by Autodesk in 2009. Following the acquisition, Tal served as the Director responsible for product management, development and social marketing for Autodesk's flagship web and mobile product line used by millions of professional users worldwide. Prior to co-founding VisualTao Tal served as a software architect at IAI Space Industries focusing on real-time satellite tracking systems.";
	talContact.footerText = "In his free time Tal plays Jazz drums.";
	talContact.imgUrl = "img-tal.png";
	talContact.addLink("mail", "tal.weiss@takipi.com");
	talContact.addLink("linkedin", "http://il.linkedin.com/in/talws");
	allContacts.push(talContact);
	
	var irisContact = new TakipiContactAbout("Iris Shoor");
	irisContact.title = "VP Product & Marketing";
	irisContact.text = "Iris is the VP of Product and Marketing at Takipi, responsible for designing and marketing the company's innovative technology. Previously, Iris was co-founder and VP Product at VisualTao, acquired by Autodesk in 2009. Following the acquisition, Iris served as the product line manager for Autodesk's flagship web and mobile product line - bringing it from zero to 10M users in less than two years. Iris holds a B.Arch Cum Laude from the Bezalel Academy of Art and Design in Jerusalem.";
	irisContact.footerText = "In her free time Iris enjoys contemporary art and design.";
	irisContact.imgUrl = "img-iris.png";
	irisContact.addLink("mail", "iris.shoor@takipi.com");
	irisContact.addLink("linkedin", "http://www.linkedin.com/in/irisshoor");
	irisContact.addLink("twitter", "https://twitter.com/IrisShoor");
	irisContact.addLink("blog", "http://www.startupmoon.com/");
	allContacts.push(irisContact);
	
	var tmpContacts = [];
	
	var nivContact = new TakipiContactAbout("Niv Steingarten");
	nivContact.text = "Niv is a senior algorithms developer at Takipi focusing on static analysis and compiler theory. Previously, Niv was principal developer at Autodesk, where he led the development of the company's flagship mobile iOS and Android apps. Prior to that, Niv was employee No.1 at VisualTao. Niv served as security researcher at the prestigious IDF 8200 intelligence unit. Niv has a B.Sc Magna Cum Laude in Computer Science from Tel-Aviv University.";
	nivContact.footerText = "In his free time Niv is a student of languages, working on his German, Spanish and Japanese.";
	nivContact.imgUrl = "img-niv.png";
	nivContact.addLink("mail", "niv.steingarten@takipi.com");
	nivContact.addLink("linkedin", "http://www.linkedin.com/in/nivst");
	nivContact.addLink("twitter", "https://twitter.com/nivstein");
	tmpContacts.push(nivContact);
	
	var dorContact = new TakipiContactAbout("Dor Levi");
	dorContact.text = "Dor is a senior algorithms developer at Takipi focusing on graph theory. Previously, dor was principal developer at Autodesk, where he led the development of the company's flagship 3D mobile graphics engine used by over 10M users worldwide. Prior to that Dor was employee No.2 at VisualTao. Dor was admitted to the Talpoit program (Israel's most prestigouis academic program) and holds a B.Sc Magna Cum Laude in Computer Science from Tel-Aviv University.";
	dorContact.footerText = "In his free time Dor is an avid skydiver.";
	dorContact.imgUrl = "img-dor.png";
	dorContact.addLink("mail", "dor.levi@takipi.com");
	dorContact.addLink("linkedin", "http://www.linkedin.com/in/dorlevi");
	tmpContacts.push(dorContact);
	
	var chenContact = new TakipiContactAbout("Chen Harel");
	chenContact.text = "Chen is a cloud architect at Takipi focusing on scalability and availability. Previously, Chen was a team lead at Autodesk, where he led the development of the company's flagship cloud backend infrastructure, servicing millions of users and complex transactions. Prior to that Chen was a software engineer at VisualTao. Earlier, Chen served as an infrastructure developer at Amdocs (DOX). Chen has a B.Sc in Computer Science and Management from Tel-Aviv University.";
	chenContact.footerText = "In his free time Chen plays Classical piano.";
	chenContact.imgUrl = "img-chen.png";
	chenContact.addLink("mail", "chen.harel@takipi.com");
	chenContact.addLink("linkedin", "http://www.linkedin.com/in/chenh");
	tmpContacts.push(chenContact);
	
	tmpContacts.shuffle();
	allContacts.pushAll(tmpContacts);
	
	var renderLeft = false;
	
	for (var i = 0; i < allContacts.length; i++)
	{
		allContacts[i].render(renderLeft).appendTo(contactsList);
		renderLeft = !renderLeft;
	}
};

initializeFeatures = function()
{
	var content = $("#featuresMain .content");
	
	var mainContent = $(".mainFeaturesContent", content);
	
	if ("onhashchange" in window) { // event supported?
	    window.onhashchange = function () {
	        hashChanged(window.location.hash);
	    }
	}
	else { // event not supported:
	    var storedHash = window.location.hash;
	    window.setInterval(function () {
	        if (window.location.hash != storedHash) {
	            storedHash = window.location.hash;
	            hashChanged(storedHash);
	        }
	    }, 100);
	}

	hashChanged = function()
	{
		var sub = window.location.hash;

		if (sub != "")
		{	
			sub = sub.substring(1);
		}
		
		if (sub != "")
		{
			if (sub.indexOf("?") > 0)
			{
				sub = sub.substring(0, sub.indexOf("?"));
			}

			var selector = $(".featureDesc." + sub, mainContent);
			
			if (selector.length == 1)
			{
				selector.scrollToView(true, 500);
			}
		}		
	}

	window.addEventListener("load", function() {
		hashChanged();
	}, false);
};

initializeGettingStarted = function()
{
	var SECRET_KEY_PARAM = " --sk=<b class=\"red\">Your secret key</b>";
	var INSTALL_TAKIPI_PREFIX_WGET = "wget -O - -o /dev/null http://get.takipi.com | sudo bash /dev/stdin -i{0}";
	var INSTALL_TAKIPI_PREFIX_CURL = "curl -s /dev/null http://get.takipi.com | sudo bash /dev/stdin -i{0}";
	var INSTALL_TAKIPI_PREFIX_WGET_PROXY = "wget -e http_proxy=<b class=\"green\">Your proxy</b> -e https_proxy=<b class=\"green\">Your proxy</b> -O - -o /dev/null http://get.takipi.com | sudo bash /dev/stdin -i{0} --https_proxy=<b class=\"green\">Your proxy</b>";
	var INSTALL_TAKIPI_PREFIX_CURL_PROXY = "curl -x <b class=\"green\">Your proxy</b> -s /dev/null http://get.takipi.com | sudo bash /dev/stdin -i{0} --https_proxy=<b class=\"green\">Your proxy</b>";
	var INSTALL_TAKIPI_POSTFIX_SOURCE = " -d; source /opt/takipi/etc/takipi-auto-agent";

	var content = $("#startingMain .content");
	
	var stepsBtn = $("a.steps", content);
	var stepsContent = $(".stepsContent", content);
	
	var guideBtn = $("a.guide", content);
	var guideContent = $(".guideContent", content);
	
	var installBtn = $("a.install", content);
	var installContent = $(".installationContent", content);
	
	stepsBtn.click(function(){
		if (!($(this).hasClass("active")))
		{
			guideBtn.removeClass("active");
			guideContent.hide();
			installBtn.removeClass("active");
			installContent.hide();
			
			stepsBtn.addClass("active");
			stepsContent.show();
		}
		
		return false;
	});
	
	guideBtn.click(function(){
		if (!($(this).hasClass("active")))
		{
			stepsBtn.removeClass("active");
			stepsContent.hide();
			installBtn.removeClass("active");
			installContent.hide();
			
			guideBtn.addClass("active");
			guideContent.show();
		}
		
		return false;
	});
	
	installBtn.click(function(){
		if (!($(this).hasClass("active")))
		{
			guideBtn.removeClass("active");
			guideContent.hide();
			stepsBtn.removeClass("active");
			stepsContent.hide();
			
			installBtn.addClass("active");
			installContent.show();
		}
		
		return false;
	});
	
	var updateInstallStrings = function(installOptionsEl, updateOnly, proxy)
	{
		var wgetString = null;
		var curlString = null;
		var keyString = (updateOnly ? "" : SECRET_KEY_PARAM);
		
		if (proxy)
		{
			wgetString = INSTALL_TAKIPI_PREFIX_WGET_PROXY.format(keyString);
			curlString = INSTALL_TAKIPI_PREFIX_CURL_PROXY.format(keyString);
		}
		else
		{
			wgetString = INSTALL_TAKIPI_PREFIX_WGET.format(keyString);
			curlString = INSTALL_TAKIPI_PREFIX_CURL.format(keyString);
		}

		wgetString = wgetString + INSTALL_TAKIPI_POSTFIX_SOURCE;
		curlString = curlString + INSTALL_TAKIPI_POSTFIX_SOURCE;

		$("div#wget .commandDiv", installOptionsEl).html(wgetString);
		$("div#curl .commandDiv", installOptionsEl).html(curlString);
	};
	
	$(".installOptions", content).each(function() {
		var installOptionsEl = $(this);
		
		var isUpdate = installOptionsEl.hasClass("update");
		updateInstallStrings(installOptionsEl, isUpdate, false);
		
		$("ul li a", installOptionsEl).click(function(){
			var selectionId = $(this).attr("id");
			
			$("ul li a.current", installOptionsEl).removeClass("current");
			$(".installOption.selected", installOptionsEl).removeClass("selected");
			
			$("ul li a#" + selectionId, installOptionsEl).addClass("current");
			$("> div#" + selectionId, installOptionsEl).addClass("selected");
			
			return false;
		});
		
		$("a.proxy", installOptionsEl).click(function() {
			if ($(this).hasClass("useProxy"))
			{
				$(this).removeClass("useProxy").text("Behind a proxy?");
				updateInstallStrings(installOptionsEl, isUpdate, false);
			}
			else
			{
				$(this).addClass("useProxy").text("Not behind a proxy?");
				updateInstallStrings(installOptionsEl, isUpdate, true);
			}
			
			var currentSelectedId = $("ul li a.current", installOptionsEl).attr("id");
			
			if ((currentSelectedId != "wget") &&
				(currentSelectedId != "curl"))
			{
				$("ul li a#wget", installOptionsEl).click();
			}
			
			return false;
		});
	});
	
	window.addEventListener("load", function() {
		var navigation = getParameterByName("nav");
		
		if (navigation == "guide")
		{		
			guideBtn.click();
			
			var subGuide = getParameterByName("sub");
			
			if (subGuide != "")
			{
				var targetPhaseStr = "div.guidePhase[navLink='" + subGuide + "']";
				var targetPhase = $(targetPhaseStr, content);
				
				if (targetPhase.length > 0)
				{
					targetPhase.scrollToView(true, 500);
				}
			}
		}
		else if (navigation == "breakpoints")
		{
			guideBtn.click();
			
			$(".guide5", content).scrollToView(true, 500);
		}
		else if (navigation == "connecting")
		{
			guideBtn.click();
			
			$(".guide6", content).scrollToView(true, 500);
		}
		else if (navigation == "install")
		{
			installBtn.click();
			
			$(".installationGuide", content).scrollToView(true, 500);
		}
		else if (navigation == "update")
		{
			installBtn.click();
			
			$(".updateGuide", content).scrollToView(true, 500);
		}
	}, false);
	
	// Selects the first button, required by Ophir's Optimizely
	$(".contentHeader a:first-child", content).click();
};

TakipiYoutubePlayersManager = function()
{
	this.pendingPlayers = {};
	this.activePlayers = {};
	this.pendingPlays = {};
};
TakipiYoutubePlayersManager.prototype = {
	addPlayer:function(name, player, ready)
	{
		if (ready)
		{
			this.activePlayers[name] = player;
		}
		else
		{
			this.pendingPlayers[name] = player;
		}
	},
	startPlayer:function(name)
	{
		if (name in this.activePlayers)
		{
			this.activePlayers[name].playVideo();
		}
		else
		{
			this.pendingPlays[name] = name;
		}
	},
	stopAll:function()
	{
		for (var key in this.activePlayers)
		{
			this.activePlayers[key].pauseVideo();
		}
	},
	playerReady:function(name)
	{
		if (name in this.pendingPlayers)
		{
			this.activePlayers[name] = this.pendingPlayers[name];
			delete this.pendingPlayers[name];
			
			if (name in this.pendingPlays)
			{
				delete this.pendingPlays[name];
				this.startPlayer(name);
			}
		}
	},
};

initializeFaq = function()
{
	var content = $("#faqMain .content");
	var categoryIndicator = $(".categoryIndicator", content);
	
	var isLoading = false; 

	var playersManager = new TakipiYoutubePlayersManager();
	
	var createPlayers = function()
	{
		nixYTPlayer = new YT.Player("nixYTPlayer", {
			"height":"420",
			"width":"640",
			"videoId":"JM3ujOhTWl8",
			"events": {
				"onReady":function() {playersManager.playerReady("linux");}
			}
		});
		
		playersManager.addPlayer("linux", nixYTPlayer);
		
		winYTPlayer = new YT.Player("winYTPlayer", {
			"height":"420",
			"width":"640",
			"videoId":"dteASy2cDvQ",
			"events": {
				"onReady":function() {playersManager.playerReady("windows");}
			}
		});
		
		playersManager.addPlayer("windows", winYTPlayer);
		
		osxYTPlayer = new YT.Player("osxYTPlayer", {
			"height":"420",
			"width":"640",
			"videoId":"4KEr-flIOYI",
			"events": {
				"onReady":function() {playersManager.playerReady("osx");}
			}
		});
		
		playersManager.addPlayer("osx", osxYTPlayer);
	};
	
	TakipiYoutubeManagerInst.addCallback(createPlayers);
	
	var moveToTop = function()
	{
		$("body").scrollTop(85);
	};
	
	var scrollToTop = function()
	{
		$("body").animate(
				{"scrollTop": 85},
				500
			);
	};
	
	var displayContent = function(contentName) {
		$("ul.qna", content).removeClass("selected");
		$("ul.qna[category=" + contentName + "]", content).addClass("selected");
	};
	
	$(".categories .category", content).click(function() {
		var categoryEl = $(this);
		
		if ((!categoryEl.hasClass("selected")) ||
			($(".subCategory.selected", categoryEl).size() > 0)) // This makes sure Installation is still clickable
		{
			playersManager.stopAll();
			$(".categories .category", content).removeClass("selected");
			$(".subCategories", content).hide();
			$(".subCategory", content).removeClass("selected");
			
			categoryEl.addClass("selected");
			$(".subCategories", categoryEl).show();
			
			categoryIndicator.css("top", categoryEl.position().top);
			
			var nav = categoryEl.attr("category");

			displayContent(nav);

			if (!isLoading)
			{
				history.pushState(null, null, window.location.pathname + "?nav=" + nav);
				gau_initPageview();
			}

			moveToTop();
		}
		
		return false;
	});
	
	$(".categories .subCategory", content).click(function() {
		var subCategoryEl = $(this);
		
		playersManager.stopAll();
		
		$(".subCategory", content).removeClass("selected");
		
		subCategoryEl.addClass("selected");
		
		var sub = subCategoryEl.attr("category");

		displayContent(sub);
		
		if (!isLoading)
		{
			var parentNav = subCategoryEl.parent().parent().attr("category");

			history.pushState(null, null, window.location.pathname + "?nav=" + parentNav + "&sub=" + sub);
			gau_initPageview();
			
			mixpanelTrack("support_" + parentNav + "_" + sub + "_clicked");
		}
		
		return false;
	});
	
	$("a.faqlink", content).click(function() {
		playersManager.stopAll();
		
		$(".categories div[category='troubleshooting']", content).click();
		
		if ($(this).attr("topic"))
		{
			$("div[topic='" + $(this).attr("topic") + "']", content).scrollToView(true, 500, 150);
		}
		else
		{
			scrollToTop();
		}
		
		return false;
	});
	
	$("a.link.connecting", content).click(function() {
		playersManager.stopAll();
		
		$(".categories div[category='connecting']", content).click();
		
		scrollToTop();
		
		return false;
	});
	
	$("a.link.dialog", content).click(function() {
		playersManager.stopAll();
		
		$(".categories div[category='troubleshooting']", content).click();
		$(".categories div[category='dialog']", content).click();

		scrollToTop();
		
		return false;
	});
	
	$("a.link.secretkey", content).click(function() {
		playersManager.stopAll();
		
		$(".categories div[category='installation']", content).click();
		$(".categories div[category='secretkey']", content).click();
		
		if ($(this).attr("topic"))
		{
			$("div[topic='" + $(this).attr("topic") + "']", content).scrollToView(true, 500, 150);
		}
		else
		{
			scrollToTop();
		}
		
		return false;
	});
	
	$("a.link.scroll", content).click(function() {
		playersManager.stopAll();
		
		var forceShow = (($(this).attr("type") ==  getParameterByName("type")) && (isLoading));
		
		if ((forceShow) ||
			(!($(".connectingInstructions", $(this).parent()).hasClass("active"))))
		{
			$(".connectingInstructions", $(this).parent()).addClass("active");
			
			if (!isLoading)
			{
				history.pushState(null, null, window.location.pathname + "?nav=connecting&sub=" + $(this).attr("sub") + "&type=" + $(this).attr("type"));
			}
		}
		else
		{
			$(".connectingInstructions", $(this).parent()).removeClass("active");
			
			if (!isLoading)
			{
				history.pushState(null, null, window.location.pathname + "?nav=connecting&sub=" + $(this).attr("sub"));
			}
		}
		
		return false;
	});
	
	var installationCategory = $("ul[category='installation']", content);
	
	$("a.installer", installationCategory).click(function() {
		playersManager.stopAll();
		
		$(".categories div[category='" + $(this).attr("installer") + "']", content).click();
		
		if ($(this).attr("type"))
		{
			if ($(this).attr("type") == "movie")
			{
				playersManager.startPlayer($(this).attr("installer"));
			}
			else
			{
				$("ul[category='" + $(this).attr("installer") + "'] div[installer='" + $(this).attr("type") + "']", content).scrollToView(true, 500, 150);
			}
			
			if (!isLoading)
			{
				history.replaceState(null, null, window.location.pathname + "?nav=installation&sub=" + $(this).attr("installer") + "&type=" + $(this).attr("type"));
				gau_initPageview();
			}
		}
		else
		{
			scrollToTop();
		}
		
		return false;
	});
	
	var connectingCategory = $("ul[category='connecting']", content);
	
	$("a.sub", connectingCategory).click(function() {
		playersManager.stopAll();
		
		$(".categories div[category='" + $(this).attr("sub") + "']", content).click();
		
		scrollToTop();
		
		return false;
	});
	
	var secretKeyCategory = $("ul[category='secretkey']", content);
	
	$("a.installers", secretKeyCategory).click(function() {
		playersManager.stopAll();
		
		$(".categories div[category='installation']", content).click();
		
		return false;
	});
	
	window.addEventListener("load", function() {
		// TODO - check if this is good :D
		//changeNav(); 

		setTimeout(function() { // http://stackoverflow.com/a/12214354/359134
			window.addEventListener('popstate', function() {
				changeNav();
			});
	  	}, 0);
	}, false);

	changeNav = function()
	{
		playersManager.stopAll();
		
		isLoading = true;

		var navigation = getParameterByName("nav");
		
		if (navigation == "installation")
		{
			$(".categories .category[category=installation]", content).click();
			
			var sub = getParameterByName("sub");
			
			if (sub != "")
			{
				var type = getParameterByName("type");
				
				var linkSelector = "a.installer[installer='" + sub + "']";
				
				if (type != "")
				{
					linkSelector += "[type='" + type + "']";
				}
				else
				{
					linkSelector += ".main";
				}
				
				$("ul[category='installation'] " + linkSelector, content).click();
			}
		}
		else if (navigation == "general")
		{
			$(".categories .category[category=general]", content).click();
		}
		else if (navigation == "connecting")
		{
			if (window.updateZopimBadgeText)
			{
				updateZopimBadgeText("Need help connecting Takipi?");
			}
			
			$(".categories .category[category=connecting]", content).click();

			var sub = getParameterByName("sub");

			if (sub != "")
			{
				$(".categories div[category='" + sub + "']", content).click();
			}

			var type = getParameterByName("type");
			
			if (type != "")
			{
				$("ul[category='" + sub + "'] a.main.link[type='" + type + "']", content).click().scrollToView(true, 500, 150);
			}
		}
		else if (navigation == "interface")
		{
			$(".categories .category[category=interface]", content).click();
			
			var type = getParameterByName("type");
			
			if (type != "")
			{
				$("ul[category='interface'] div[id='" + type + "']", content).scrollToView(true, 500, 150);
			}
		}
		else if (navigation == "troubleshooting")
		{
			$(".categories .category[category=troubleshooting]", content).click();

			var sub = getParameterByName("sub");

			if (sub != "")
			{
				$(".categories div[category='" + sub + "']", content).click();
			}
			
			var type = getParameterByName("type");
			
			if (type != "")
			{
				var scrollCategory = (sub != "" ? sub : "troubleshooting");
				$("ul[category='" + scrollCategory + "'] div[topic='" + type + "']", content).scrollToView(true, 500, 150);
			}
		}
		
		gau_initPageview();
		
		isLoading = false;
	};
	
	changeNav();
};

mixpanelTrack = function(key, data)
{
	if (mixpanel)
	{
		mixpanel.track(key, data);
	}
	else
	{
		console.log("Mixpanel: \"" + key + "\" = \"" + JSON.stringify(data) + "\"");
	}
};

initSelectCodeElement = function()
{
	$(".code.line").click(function() {
		selectElementText(this);
		
		if (this.innerHTML.indexOf("-agentlib:TakipiAgent" > -1))
		{
			mixpanelTrack("support_agentlib_marked");
		}
		
		return false;
	});
};

selectElementText = function (element, win) {
	win = (win || window);

	var doc = win.document;
	var sel;
	var range;

	if ((win.getSelection) &&
		(doc.createRange))
	{
		sel = win.getSelection();
		range = doc.createRange();
		range.selectNodeContents(element);
		sel.removeAllRanges();
		sel.addRange(range);
	}
	else if (doc.body.createTextRange)
	{
		range = doc.body.createTextRange();
		range.moveToElementText(element);
		range.select();
	}
};

var initShowZopim = function()
{
	$('#showZopimBtn').click(function() {
		if (window.$zopim)
		{
			$zopim.livechat.badge.show();
		}
		
		return false;
	});
};

var updateZopimBadgeText = function(text)
{
	if (window.$zopim)
	{
		$zopim(function () {
			$zopim.livechat.badge.setText(text);
		});
    }
};

initializeSourceAttach = function()
{
	
};

initializeNotifyNewRelic = function(debug)
{
	var urlToUse = (debug ? "http://localhost:8070/app/notifynewrelic" : "https://app.takipi.com/app/notifynewrelic");
	
	$('#notifyNewRelicSubscribe').click(function() {
		$.ajax({
			type: "POST",
			url: urlToUse,
			data: $("#newRelicSubscriber").val()})
			.success(function(data)
			{
				if (data == "true") {
					$('.input-div').hide();
					$('#learnMoreHeaderSpan').text("Done! We'll be in touch.");
				}
			})
			.error(function()
			{
				
			});
			
			return false;
	});
};

initializeScreenShotsPopup = function () {
	var screenshotsPopupEl = $("#screenshotsPopup");
	
	$("a.close", screenshotsPopupEl).click(function () {
		EventManagerInst.dispatch(screenshotsPopupEl, "CLOSE_MODAL");
		
		return false;
	});
	
	$("a.screenshotBtn").click(function () {
		screenshotsPopupEl.attr({"image":$(this).attr("image")});
		ModalManagerInst.pushModal(screenshotsPopupEl, true, true, true, 500);
		
		return false;
	});
};

initializeJobs = function()
{
	var officeImagePopupEl = $("#officeImagePopup");
	
	$("a.close", officeImagePopupEl).click(function(){
		EventManagerInst.dispatch(officeImagePopupEl, "CLOSE_MODAL");
		
		return false;
	});
	
	var imageScrollerEl = createImagesScroller(
			$(".officeImages[office='sf']"), "SF Office",
			["office1", "office2", "office3", "office4", "office5", "office6"]);
	
	$(".img", imageScrollerEl).addClass("clickable").click(function() {
		officeImagePopupEl.attr({"image":$(this).attr("image")});
		ModalManagerInst.pushModal(officeImagePopupEl, true, true, true, 500);
		
		return false;
	});
	
	var imageScrollerEl = createImagesScroller(
			$(".officeImages[office='tlv']"), "TLV Office",
			["office7", "office8", "office9", "office10", "office11", "office12"]);
	
	$(".img", imageScrollerEl).addClass("clickable").click(function() {
		officeImagePopupEl.attr({"image":$(this).attr("image")});
		ModalManagerInst.pushModal(officeImagePopupEl, true, true, true, 500);
		
		return false;
	});
};

createImagesScroller = function(parentEl, headerText, images)
{
	var imageScrollerEl = $(document.createElement('div')).addClass("imageScroller").appendTo(parentEl);
	
	if (headerText)
	{
		$(document.createElement('div')).addClass("header").text(headerText).appendTo(imageScrollerEl);
	}
	
	var imageListEl = $(document.createElement('div')).addClass("imageList").appendTo(imageScrollerEl);
	
	for (var i = 0; i < images.length; i++)
	{
		$(document.createElement('div')).addClass("img").attr({"image":images[i]}).appendTo(imageListEl);
	}
	
	var buttonHolderEl = $(document.createElement('div')).addClass("buttonHolder").appendTo(imageScrollerEl);
	
	var buttonCount = Math.ceil(images.length / 2);
	
	for (i = 0; i < buttonCount; i++)
	{
		var buttonEl = $(document.createElement('a')).addClass("button")
			.attr({"href":"javascript: void(0)", "index":i})
			.click(function() {
				if (!$(this).hasClass("active"))
				{
					$(".active", $(this).parent()).removeClass("active");
					$(this).addClass("active");
					
					var newMargin = ((250 + 20) * (-2)) * $(this).attr("index"); // 140 image width, 20 image padding, 2 images at a time;
					imageListEl.stop(true).animate({"margin-left":newMargin + "px"}, 500);
				}
				
				return false;
			}).appendTo(buttonHolderEl);
		
		if (i == 0)
		{
			buttonEl.addClass("active");
		}
	}
};

initializeBareMiniSignupDialog = function(holderSelector, headerHolderSelector, loginPage, redirectUrl, errorRedirect, appUrl)
{
	var miniSignupEl = $(holderSelector);
	
	createMiniSignupElementAndForm(miniSignupEl, loginPage, redirectUrl, 
		errorRedirect, appUrl, null, null, "Email Address",
		null, true, true);
};

initializeMiniSignupDialog = function(holderSelector, headerHolderSelector, header, footer, loginPage, redirectUrl, errorRedirect, appUrl, createdIn)
{
	var miniSignupEl = $(holderSelector);
	var actualHeader = header || "Start now and discover new data about your server in 5 min";
	var actualFooter = footer || "<div>Free Trial</div><div>&nbsp;</div>";
	
	if (createdIn)
	{
		miniSignupEl.attr({"createdin":createdIn});
	}
	
	createMiniSignupElementAndForm(miniSignupEl, loginPage, redirectUrl, 
		errorRedirect, appUrl, actualHeader, null, "Email Address", actualFooter);
	
	$(".miniSignupFred").css("display", "inline-block").show();
	
	if (!headerHolderSelector)
	{
		return;
	}
	
	var headerMiniSignupEl = $(headerHolderSelector);
	
	if (createdIn)
	{
		headerMiniSignupEl.attr({"createdin":createdIn + "_header"});
	}
	else
	{
		headerMiniSignupEl.attr({"createdin":"header"});
	}
	
	createMiniSignupElementAndForm(headerMiniSignupEl, loginPage, redirectUrl, 
		errorRedirect, appUrl, "", "Get a free server", "Email Address");
};

(function( $ ) {
	$.fn.scrollToView = function(animation, animationDuration, offset, scrollerEl, relativeToDocument) {
		animation = (animation != undefined ? animation : false);
		animationDuration = (animationDuration != undefined ? animationDuration : 100);
		offset = (offset != undefined ? offset : 0);
		scrollerEl = (scrollerEl != undefined ? scrollerEl : $("html, body"));
		
		var elementOffset = (relativeToDocument ? $(this).offset() : $(this).position());
		var scrollOffset = elementOffset.top + offset;
		
		if (animation)
		{
			scrollerEl.animate(
				{"scrollTop": scrollOffset},
				animationDuration
			);
		}
		else
		{
			scrollerEl.scrollTop(scrollOffset);
		}
	};
})( jQuery );
