$(document).ready(function(){
	// counters
	(function() {
		var can = true;
		
		if ($('.counters').length > 0) {
			var offset = $('.counters').position().top - $(window).height();
			
			$(window).scroll(function(){
				if (($(window).scrollTop() > offset) & (can)) {
					$('#timer-01').countTo({
						speed: 2000,
						formatter: function (value, options) {
							var value = value.toFixed(options.decimals);
							return value.replace (/(<.*?>)|(.)/g, function (m0, tag, ch) { return tag || ('<span>' + ch + '</span>'); }); 
						}
					});
					$('#timer-02').countTo({
						speed: 2000,
						formatter: function (value, options) {
							var value = value.toFixed(options.decimals);
							return value.replace (/(<.*?>)|(.)/g, function (m0, tag, ch) { return tag || ('<span>' + ch + '</span>'); }); 
						}
					});
					can = false;
				}
			});
		}
	})();
	
    // change hash without page jumping- function generator
    var setHashNoJump = (function(){
        if (window.history && window.history.replaceState){
            // history API supported
            return function setHash (hash){ 
                window.history.replaceState(null,null, '#' + hash);
            };
        } else {
            // no history API - manual fix
            return function setManualHash (hash){ 
                var el = document.getElementById( hash );
                el.id = '';
                window.location.hash = hash;
                el.id = hash;
            };
        }
    })();
    
	// hover integrates-info
	(function() {
		var $item = $('.integrates-info').find('.integrates-list').find('.item'),
			TIMEOUT = 300,
			hoverClass = 'hover';
		
		$item.on({
			mouseenter: function () {
				var $this = $(this);
				
				$this.addClass(hoverClass);
				$(this).find('.more').find('.str').stop().animate({
					'left': '0'
				}, TIMEOUT, function() {
					
				});
			},
			mouseleave: function () {
				var $this = $(this);
				
				$(this).find('.more').find('.str').stop().animate({
					'left': '-100%'
				}, TIMEOUT, function() {
					$this.removeClass(hoverClass);
				});
			}
		});
	})();
	
	$('.about-diagram .popups li > a').mouseenter(function() {
		$(this).parent().find('.box').finish().fadeToggle();
		$(this).parent().finish().toggleClass('open');
		return false;
	}).mouseout(function() {
		$(this).parent().find('.box').finish().fadeOut(300);
		$(this).parent().finish().removeClass('open');
		return false;
	}).click(function() {return false;});
	
	$('.security-page .nav-links a').click(function(e){
		var href = $(this).attr("href"),
			offsetTop = href === "#" ? 0 : $(href).offset().top;
        
        setHashNoJump(href.slice(1));
		$('html, body').stop().animate({ 
			scrollTop: offsetTop
		}, 600);
		e.preventDefault();
	});
	$('.tabs-storage').tabs({
		show: function() {}
	});
	$('#tabs-1').tabs({
		event: 'mouseover'
	});
	$('#tabs-2').tabs({
		event: 'mouseover'
	});
	$('.tabs-install').tabs({
		event: 'mouseover',
		show: 200
	});
	$('.tabs-install .btn').click(function(e){
		var href = $(this).attr("href"),
			offsetTop = href === "#" ? 0 : $(href).offset().top;
		$('html, body').stop().animate({ 
			scrollTop: offsetTop
		}, 600);
		$('.start-area .start-form').addClass('active');
		$('.start-area .start-form .text').attr("placeholder", 'Enter your Email address to install').val('').focus();
		e.preventDefault();
	});
	
	/* new */
	
	$('.production-area .error-block .error-list').each(function() {
		var children_ = $(this).children('li');
		var totalChildren = children_.length;
		var start = 0;
		$('.production-area .error-block .num-02').html(totalChildren);
		children_.each(function() {
			$(this).prepend("<span class='number'>" + (totalChildren - start) + "</span>");
			start++;
		});
		$('.production-area .error-block .error-list a').click (function(){
			var text_ = $(this).find('.date').html();
			$('.production-area .error-block .select .text').html(text_);
			$('.production-area .error-block .error-list').hide();
			var num_li = $(this).parent('li').find('.number').html();
			$('.production-area .error-block .num-01').html(num_li);
			$(this).closest('.error-block').removeClass('open').find('.box').stop().fadeOut(300);
			return false
		});
	});
	
	var revertAllAnimations = function() {
		$('.production-area').find('.info-link').parent().removeClass('open').find('.box').stop().fadeOut(300);
		$('.production-area').find('.error-list').stop().fadeOut(300);
		$('.production-area').find('.values .drop-open').stop().fadeOut(300);
		$('.production-area .nav-list').find('.style-03, .style-04, .style-05').removeClass('active');
		$('.production-area .wrap-01').stop().animate({
			'margin-top': 0
		},800);
		$('.production-area .wrap-02').stop().animate({
			height: 0
		},800, function(){
			$('.production-area .col-right').css({
				"overflow": "visible"
			});
		});
		$('.production-area').find('.info-block').removeClass('open');
	};
	
	var openTextDropdown = function(infoLinkEl) {
		infoLinkEl.parent().addClass('open').find('.box').stop().fadeIn(300);
		infoLinkEl.siblings('.error-list').stop().fadeIn(300);
		infoLinkEl.siblings('.list').find('.drop-open').stop().fadeIn(300);
	}
	
	var toggleInfoLink = function(infoLinkEl, isMouseEnter) {
		if (infoLinkEl.parent().hasClass('open')) {
			if (!isMouseEnter) {
				revertAllAnimations();
			}
		}
		else {
			revertAllAnimations();
			openTextDropdown(infoLinkEl);
		}
		return false;
	};
	
	var toggleScrollAnimation = function(activeState) {
		var height_1 = $('.production-area .col-right .inner').height();
		var height_2 = $('.production-area .col-right .wrap-01').height();
		$('.production-area .wrap-01').stop().animate({
			'margin-top': - height_2 - 11
		},800);
		$('.production-area .wrap-02').stop().animate({
			height: height_1
		},800, function () {
			var tableHeaderEl = $('.production-area .col-right .wrap-02 .values .sub-head.open-link');
			tableHeaderEl.addClass("bright");
			
			setTimeout(function() {
				tableHeaderEl.removeClass("bright");
			}, 700);
		});
		$('.production-area .col-right').css({
			"overflow": "hidden"
		});
	}
	
	var isMainAnimationElement = function(element) {
		return ($('.production-area .info-link a').is(element.target) ||
				$('.production-area .info-link a').has(element.target).length !== 0 ||
				$('.production-area .open-link').is(element.target) ||
				$('.production-area .open-link').has(element.target).length !== 0);
	}
	
	// Targeting the main clickable areas of the page (Headers & hotspots)
	$('.production-area .info-link a').mouseenter(function() {
		toggleInfoLink($(this).parent('.info-link'), true);
		
		return false;
	});
	
	$('.production-area .info-link a').click(function() {
		toggleInfoLink($(this).parent('.info-link'));
		
		return false;
	});
	
	// Targeting the secondary clickable areas of the page (stuff inside the tale)
	$('.production-area .open-link').mouseenter(function() {
		toggleInfoLink($(this).siblings('.info-link'), true);
		
		return false;
	});
	
	$('.production-area .open-link').click(function() {
		toggleInfoLink($(this).siblings('.info-link'));
		
		return false;
	});
	
	// Expanding distributed debugging animation
	$('.production-area .style-01 .open-link, .production-area .style-01 .info-link a').click(function() {
		if ($(this).closest('li').hasClass('open')) {
			$('.production-area .nav-list').find('.style-03, .style-04, .style-05').addClass('active');
		}
		return false;
	});
	
	$('.production-area .style-01 .open-link, .production-area .style-01 .info-link a').mouseenter(function() {
		$('.production-area .nav-list').find('.style-03, .style-04, .style-05').addClass('active');
		return false;
	});
	
	// Expanding reproduce errors animation
	$('.production-area .style-02 .open-link, .production-area .style-02 .info-link a').click(function() {
		if ($(this).closest('li').hasClass('open')) {
			toggleScrollAnimation();
		}
		return false;
	});
	
	$('.production-area .style-02 .open-link, .production-area .style-02 .info-link a').mouseenter(function() {
		toggleScrollAnimation();
		return false;
	});
	
	// The variables
	$('.production-area .info-block .link').click(function() {return false;});
	
	// Making a click on the background close all animations
	if ($('.production-area .error-block .error-list').length > 0)
	{
		$(document).on('mouseup touchend ',function (e) {
			if (!isMainAnimationElement(e)) {
				revertAllAnimations();
			}
		});
	}
	
	$('.fancybox').fancybox({
	    fitToView: false, // avoids scaling the image to fit in the viewport
	    padding: 0,
	    helpers: {
			overlay: {
				locked: false
			},
            media: {
                youtube:{
                    params:{
                        autoplay: 1,
                        vq: 'hd1080'
                    }
                }
            }
		},
	    beforeShow: function () {
	        // set size to (fancybox) img
            var width = parseInt(this.element.attr('fancy-width'),10),
                height = parseInt(this.element.attr('fancy-height'),10),
                integration = this.element.is('[fancy-integration]'),
                customTitle = this.element.siblings('.fancy-title');
            
	        $(".fancybox-image").css({
	            "width": width,
	            "height": height
	        });
	        // set size for parent container
	        this.width = width;
	        this.height = height;
            
            if (integration){
                this.wrap.addClass('integration');
            }
            if (customTitle.length){
                this.title = $('<div class="caption">').html(customTitle.html()).prop('outerHTML');
            }
	    }
	});
	
	(function() {
		var activeItem = $($('.focus-on .tabs-nav .active').children('a').attr('href'));

		$('.focus-on .tabarea .tab').hide();
		activeItem.show();
		
		var closeOpenPopups = function()
		{
			$('.focus-on .tabs-nav li').removeClass('active').removeClass('green');
			$('.focus-on .tabarea .tab').stop().hide();
		}
		
		var showPopup = function(aEl)
		{
			aEl.parent().addClass('active').addClass('green');
			$(aEl.attr('href')).stop().fadeIn(300);
		}
		
		var cycleImage = function()
		{
			var currentSelectedIndex = $('.focus-on .tabs-nav li.active').index();
			
			var newSelectedIndex = (currentSelectedIndex + 1) % $('.focus-on .tabs-nav li').length;
			
			var childIndex = newSelectedIndex + 1; // WHY U DO DIS JQUERY ?!
			
			closeOpenPopups();
			showPopup($('.focus-on .tabs-nav li:nth-child(' + childIndex + ') a'));
		}
		
		$('.focus-on .tabs-nav a').mouseenter(function(){
			if (!($(this).parent().hasClass('active'))) {
				closeOpenPopups();
				showPopup($(this));
			}
			
			return false;
		}).click(function() {return false;});
		
		$('.focus-on .tabarea').click(function(e) {
			if ($('a.sampleTaleLink').is(e.target) ||
				$('a.sampleTaleLink').has(e.target).length !== 0)
			{
				return true;
			}
			
			cycleImage();
			return false;
		});
		/*
		if ($('.focus-on').length){
			$(window).scroll(function() {
				var top_ = $(window).scrollTop(),
					scroll_pos = $('.focus-on').offset().top,
					activeItemParent;
				
				if ( top_ > scroll_pos ) {
					activeItemParent = $('.focus-on .tabs-nav li').eq(4);
				}
				else if ( top_ > scroll_pos -120 ){
					activeItemParent = $('.focus-on .tabs-nav li').eq(3);
				}
				else if ( top_ > scroll_pos -250 ) {
					activeItemParent = $('.focus-on .tabs-nav li').eq(2);
				}
				else if ( top_> scroll_pos -450 ) {
					activeItemParent = $('.focus-on .tabs-nav li').eq(1);
				}
				else {
					activeItemParent = $('.focus-on .tabs-nav li').eq(0);
				}
				activeItemParent.addClass('green').siblings('li').removeClass('green');
			});
		}
		*/
		showPopup($('.focus-on .tabs-nav a').first());
	})();

	$('.monster, .features .developers .items .item').appear();
	$(document.body).on('appear', '.monster, .features .developers .items .item', function() {
		$(this).addClass('show');
	});
	$(document.body).on('disappear', '.monster, .features .developers .items .item', function() {
		$(this).removeClass('show');
	});
	
	var hideAllFeatureTabs = function() {
		$('.error-tab .tabarea .tab').stop().fadeOut(300);
	}
	
	var showFeatureTab = function(liEl) {
		liEl.addClass("active");
		$('.error-tab .tabarea .tab' + $("a", liEl).attr("href")).stop().fadeIn(300);
	}
	
	$('.error-tab .nav-tabs li').mouseenter(function() {
		$(this).siblings('li').removeClass("active");
		hideAllFeatureTabs();
		
		showFeatureTab($(this));
	})
	
	$('.error-tab .nav-tabs li a').click(function(){return false;});
	
	$('.error-tab .tabarea .tab').hide().first().show();
	
	if ($('.features .deployment').length){
		(function() {
		setTimeout(function() {
			var $target = $('.features').find('.deployment'),
				$bubble = $target.find('.bubble'),
				topOffset = $target.offset().top,
				allowAnimation = true;
			
			$(window).scroll(function() {
				var tmp = $(window).scrollTop();
				
				if (tmp >= topOffset - 200) {
					if (allowAnimation) {
						allowAnimation = false;
						$bubble.animate({
							'opacity': 1,
							'margin-bottom': 200
						});
					}
				}
				else {
					if (!allowAnimation) {
						allowAnimation = true;
						$bubble.animate({
							'opacity': 0,
							'margin-bottom': 0
						});
					}
				}
			});
		}, 400);
	})();
	}
	
	if ($('.features .dashboard').length){
		$(window).scroll(function() {
			var top_ = $(window).scrollTop();
			var scroll_pos = $('.features .dashboard').offset().top;
			
			if ( top_ > scroll_pos ) {
				$('.features .dashboard .img-holder').addClass('third').removeClass('first second');
			}
			else if ( top_ > scroll_pos -200 ){
				$('.features .dashboard .img-holder').addClass('second').removeClass('first third');
			}
			else if ( top_ > scroll_pos -400 ) {
				$('.features .dashboard .img-holder').addClass('first').removeClass('second third');
			}
			else {
				$('.features .dashboard .img-holder').removeClass('second third');
			}
		});
		
		$('.hover-targets').on('click', 'a', function(e){
			var self = $(this),
				target = self.closest('.img-holder'),
				targetClass = self.data('class');
				
			target.removeClass('first second third').addClass(targetClass);
			
			return false;
		});
	}
    
    // initialize tabs for the why-takipi page
    // and set hash monitoring 
    (function(){
        var infotabs = $('.info-tabs').tabs({
                event: 'mouseover',
                show: 400,
                activate: function(e, ui){
                    setHashNoJump( ui.newPanel.prop('id').replace(/-section$/i,'') );
                },
                active: window.location.hash ? Math.max($(window.location.hash+'-section').index('.content'),0) : 0
            });
        // handle change of hash from the top menu
        if (infotabs.length){
            $(window).on('hashchange', function(){
                var hash = window.location.hash;
                if (hash){
                    var tabindex = $(hash + '-section').index('.content');
                    if (tabindex > -1){
                        infotabs.tabs('option', 'active', tabindex);
                    }
                }
            });
        }
     })();
	
    
    
	$('.features .logs .visual').on('click', '.link, .click-here',function() {
		$(this).closest('.visual').find('.link, .click-here').hide();
		$('.features .logs .visual .img-02').addClass('active');
		return false;
	});
    
    
	$('.production-area .values .list a').click(function(){
		if ($(this).parents('.values').hasClass('open')) {
			$(this).parents('.values').removeClass('open').find('.drop-open').fadeOut(300);
			$('.production-area').find('.info-link').parent().removeClass('open').find('.box').fadeOut(300);
		}
		return false;
	});
	
	if ($('.form-popup').length){
		customForm.lib.domReady(function(){
			customForm.customForms.replaceAll();
		});
	}
	
	var closeOpenPopups = function() {
		$('.features .developers .list li.active').removeClass('active');
		var openedEl = $('.features .developers .item.open').removeClass('open');
		$(".info-popup", openedEl).stop().fadeOut();
        /*handle the log popup*/
        $('.features .logs .visual').find('.link, .click-here').show();
        $('.features .logs .visual .img-02').removeClass('active');
	}
	
	var openPopup = function(itemEl, name) {
		itemEl.addClass("open");
		$('.features .developers .list li[item=\'' + name + '\']').addClass('active');
		$(".info-popup", itemEl).stop().fadeIn();
	}
	
	var togglePopup = function(name, isMouseOver) {
		itemEl = $('.features .developers .items .item[item=\'' + name + '\']');
		
		if (itemEl.hasClass('open') && !isMouseOver) {
			closeOpenPopups();
		}
		else {
			closeOpenPopups();
			openPopup(itemEl, name);
		}
	}
	
	$('.features .developers .items .img.active').mouseenter(function() {
		togglePopup($(this).parent().attr("item"), true);
		return false;
	});
	
	$('.features .developers .items .img.active').click(function() {
		togglePopup($(this).parent().attr("item"));
		return false;
	});
	
	$('.features .developers .item-opener').mouseenter(function() {
		togglePopup($(this).attr("item"), true);
		return false;
	});
	
	$('.features .developers .item-opener').click(function() {
		togglePopup($(this).attr("item"));
		return false;
	});
    
	$('.features .developers .container').on('mouseleave', closeOpenPopups);
	
	var isFeatureTargetElement = function(element) {
		return ($('.features .developers .info-popup').is(element.target) ||
				$('.features .developers .info-popup').has(element.target).length !== 0 ||
				$('.features .developers .items .img').is(element.target) ||
				$('.features .developers .items .img').has(element.target).length !== 0 ||
				$('.features .developers .item-opener').is(element.target) ||
				$('.features .developers .item-opener').has(element.target).length !== 0 ||
				$('.features .logs .img-02').is(element.target) ||
				$('.features .logs .img-02').has(element.target).length !== 0);
	}
	
	if ($('.features .developers, .features .logs').length > 0)
	{
		$(document).on('mouseup touchend ',function (e) {
			if (!isFeatureTargetElement(e)) {
				closeOpenPopups();
			}
		});
	}
	
	$('.faq-block').hide();
	$('.pricing .buttons .btn-faq').click(function(){
		var this_ = $(this),
			showBlock = $('.faq-block');
		if (this_.hasClass('active')) {
			this_.removeClass('active');
			showBlock.slideUp(300);
		} else{
			this_.addClass('active');
			showBlock.slideDown(300);
		}
		return false;
	});
	$('.pricing .buttons .btn-call').click(function(){
		var numText = $(this).attr('data-number');
		$(this).html(numText);
		return false;
	});
	$('.pricing .buttons .btn-chat').click(function() {
		if (window.$zopim)
		{
			$zopim.livechat.badge.show();
		}
		
		return false;
	});
    
    // handle auto show of schedule Popup
    var schedulerPopup = $('#scheduler-popup-overlay');
	// remove the "&& false" part of the condition below
	// to restore functionality - disabled as part of issue #79
    if(schedulerPopup.length && false){ 
        var delay = 45 * 1000,
            scrollBottomOffset = 0,
            useTimeout = !schedulerPopup.is('.scroll-end'),
            shown = false,
            win = $(window);
        
        schedulerPopup.on('click', 'a.close', function(e){
            e.preventDefault();
            schedulerPopup.removeClass('visible');
            return false;
        });
        
        if (useTimeout){
            // show based on timeout
            setTimeout(function(){
                schedulerPopup.addClass('visible');
            }, delay);
        } else {
            // show when scrolling to bottom
            win.on('scroll.scheduler', function(){
                var fromBottom = $(document).height() - (win.scrollTop() + win.height());
                console.log(fromBottom);
                if ((fromBottom <= scrollBottomOffset)  && !shown){
                    shown = true;
                    schedulerPopup.addClass('visible');
                    win.off('scroll.scheduler');
                }
            });
        }
    }
    
    // handle landing pages form
    var scheduleForm = $('.schedule-form form');
    if (scheduleForm.length){
        // set timezone
        scheduleForm.find(':input[name="user_timezone"]').val(-(new Date()).getTimezoneOffset()/60);

        // handle submit
        scheduleForm.on('submit', function(e){
            e.preventDefault();

            var form = $(this),
                    params = {},
                    all = form.serializeArray();

            $.each(all, function(i,item){
                var name = item.name,
                    value = item.value;

                if (name == 'user_timezone'){
                    params[item.name] = +item.value;
                } else {
                    params[item.name] = item.value;
                }
            });

            $.ajax({
                url: this.action,
                type: 'POST',
                data: JSON.stringify(params),
                contentType:'application/json'
            }).done(function(){
              // show thanks
                scheduleForm.find('.thanks').addClass('visible')
                form[0].reset();
            });

            return false;
        });
    }
    
});