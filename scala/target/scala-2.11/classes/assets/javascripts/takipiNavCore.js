initializeSocialPopups = function()
{
	var dogPopup = $("div#dogPopup");
	var dogBtn = $("ul.socialList a.dog");
	
	dogBtn.click(function() {
		ModalManagerInst.pushModal(dogPopup, true, true, true, 500);
		
		return false;
	});
	
	$("a.socialPopupClose", dogPopup).click(function(){
		EventManagerInst.dispatch(dogPopup, "CLOSE_MODAL");
		
		return false;
	});
};

initializeNavigationUserHolderElement = function()
{
	if ($.cookie("takipiIsLoggedIn"))
	{
		var userHolderEl = $("#header .userHolder");
		var username = $.cookie("takipiLoggedInUser");
	
		userHolderEl.empty();
		
		$(document.createElement('div')).addClass("hello navText").html("Hello <b>" + username + "</b>").appendTo(userHolderEl);
		$(document.createElement('a')).addClass("enterApp navBtn").attr({"id":"navigation-app", "href":"https://app.takipi.com/"}).text("Enter app").appendTo(userHolderEl);
	}
};
