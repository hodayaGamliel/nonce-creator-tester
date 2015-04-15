
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
		});
		
		resetThreadAnimationState();
		resetHistoryAnimationState();
	}
};
