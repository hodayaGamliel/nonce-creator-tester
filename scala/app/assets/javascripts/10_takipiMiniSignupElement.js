buildDefaultMiniSignupForm = function(headerText, btnText, mailPlaceholderText, footerHtmlText, skipHeader, skipFooter)
{
	var headerTextValue = headerText || "Solve monster bugs";
	var btnTextValue = btnText || "Start using Takipi";
	var mailPlaceholderTextValue = mailPlaceholderText || "Enter your mail";
	var footerHtmlTextValue = footerHtmlText || "<div>Java / Scala developers</div><div>Free Trial</div>";

	var headerHtml = "";

	if (!skipHeader)
	{
		headerHtml = '<div class="header">' + headerTextValue + '</div>';
	}

	var footerHtml = "";

	if (!skipFooter)
	{
		footerHtml = '<div class="footer">' + footerHtmlTextValue + '</div>';
	}

	return '<div class="stubSignupElement"> \
				<form class="stubSignupForm"> \
					' + headerHtml + ' \
					<input class="emailInput" type="text" autocomplete="off" placeholder="' + mailPlaceholderTextValue + '"></input> \
					<div class="createStubAccountBtn">' + btnTextValue + '</div> \
				</form> \
				<div class="errorLabel"></div> \
				' + footerHtml + ' \
			</div>';
};

createMiniSignupElementAndForm = function(dialogHolderEl, loginPage, redirectUrl, errorRedirect,
	appUrl, headerText, btnText, mailPlaceholderText, footerHtmlText, skipHeader, skipFooter)
{
	var signupForm = buildDefaultMiniSignupForm(headerText, btnText, mailPlaceholderText, footerHtmlText, skipHeader, skipFooter);
	
	return new TakipiMiniSignupElement(dialogHolderEl, loginPage, redirectUrl, errorRedirect, appUrl, signupForm);
};

createMiniSignupElement = function(dialogHolderEl, loginPage, redirectUrl, errorRedirect, appUrl)
{
	return new TakipiMiniSignupElement(dialogHolderEl, loginPage, redirectUrl, errorRedirect, appUrl, null);
};

multiCreateMiniSignupElement = function(dialogHoldersEl, loginPage, redirectUrl, errorRedirect, appUrl)
{
	dialogHoldersEl.each(function() {
		createMiniSignupElement($(this), loginPage, redirectUrl, errorRedirect, appUrl);
	});
};

TakipiMiniSignupElement = function(dialogHolderEl, loginPage, redirectUrl, errorRedirect, appUrl, signupForm) 
{
	this.dialogHolderEl = dialogHolderEl;
	this.loginPage = loginPage;
	
	if (signupForm)
	{
		this.dialogHolderEl.append(signupForm);
	}
	
	this.emailInputEl = $(".emailInput", this.dialogHolderEl);
	this.errorLabelEl = $(".errorLabel", this.dialogHolderEl);
	this.createBtnEl = $(".createStubAccountBtn", this.dialogHolderEl);

	this.servletUrl = "/app/account/stub/validate";
	this.appUrl = (appUrl ? appUrl : "");
	this.redirectUrl = redirectUrl;
	this.errorRedirect = errorRedirect;
	this.stubPlaceholder = "THATS_WHY_ONE_SHOULD_NEVER_USE_REQUIRED_IN_A_PROTO";
	
	var miniSignupElement = this;
	
	this.createBtnEl.click(function() {
		miniSignupElement.createStubAccount();
		return false;
	});

	this.emailInputEl.keydown(function(event) {
		var keyCode = (event.keyCode ? event.keyCode : event.which);
		
		if (keyCode == 13)
		{
			miniSignupElement.createStubAccount();
			return false;
		}
		
		return true;
	});
	
	this.hideErrorLabel();
};
TakipiMiniSignupElement.prototype = {
	createStubAccount:function()
	{
		this.hideErrorLabel();
		
		if (!this.validateEmail())
		{
			this.showInvalidEmailError();
			return;
		}
		
		var request = {
			"email":this.emailInputEl.val()
		};
		
		this.disableForm();
		
		var createdInAttr = this.dialogHolderEl.attr("createdin");
		var createdIn = (createdInAttr ? window.location + "_" + createdInAttr : window.location);
		
		var miniSignupElement = this;
		
		$.ajax({
			type: "POST",
			url:  this.appUrl + this.servletUrl,
			data: JSON.stringify(request)})
		.success(function(data)
		{
			if (data.is_valid)
			{
				var redirectUrl = miniSignupElement.redirectUrl;

				if (miniSignupElement.isValidRedirectTarget(redirectUrl))
				{
					window.location = redirectUrl +
						"?cs" +															// cs - createStub
						"&ref=" + createdIn +
						"&e=" + miniSignupElement.encodeURLSafeBase64(request.email) +	// e - email
						"&er=" + encodeURIComponent(miniSignupElement.errorRedirect);	// er - error redirect
				}
				else
				{
					miniSignupElement.showServerError();
					miniSignupElement.enableForm();
				}
			}
			else
			{
				miniSignupElement.showEmailExistError();
				miniSignupElement.enableForm();
			}
		})
		.error(function()
		{
			miniSignupElement.showServerError();
			miniSignupElement.enableForm();
		});
	},
	disableForm:function()
	{
		this.emailInputEl.prop("disabled", true);
		this.createBtnEl.addClass("waitForResponse");
	},
	enableForm:function()
	{
		this.emailInputEl.prop("disabled", false);
		this.createBtnEl.removeClass("waitForResponse");
	},
	validateEmail:function()
	{
		var email = this.emailInputEl.val();
		
		return ((email != "") &&
				(this.isValidEmail(email)));
	},
	hideErrorLabel:function()
	{
		this.errorLabelEl.html('').hide();
	},
	showServerError:function()
	{
		this.errorLabelEl.html('Problem with server').show();
	},
	showInvalidEmailError:function()
	{
		this.errorLabelEl.html('Invalid email').show();
	},
	showEmailExistError:function()
	{
		this.errorLabelEl.html('User already exists <a class="loginLink" href="' + this.loginPage + '">Log in</a>').show();
	},
	encodeURLSafeBase64:function(str) // ZZZ: copied from takipiUtilityMethods
	{
		return $.base64.encode(str).replace(/\//g, '.').replace(/\+/g, '_').replace(/\=/g, '-');
	},
	isValidEmail:function(email) // ZZZ: copied from takipiUtilityMethods
	{
		var re = /^(([^<>()[\]\\.,;:\s@\"]+(\.[^<>()[\]\\.,;:\s@\"]+)*)|(\".+\"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/;
		
		return re.test(email);
	},
	isValidRedirectTarget:function(redirectTarget) //NNN: Copied from takipiSessionUtil + session.js
	{
		if (!redirectTarget)
		{
			return false;
		}
		
		if ((typeof redirectTarget != 'string') &&
			(!(redirectTarget instanceof String)))
		{
			return false;
		}
		
		var validRedirectPrefixes = [
			"http://app.takipi.com",
			"https://app.takipi.com",
			"http://www.takipi.com",
			"https://www.takipi.com"
		];
		
		for (var i = 0; i < validRedirectPrefixes.length; i++)
		{
			var prefix = validRedirectPrefixes[i];
			
			if (redirectTarget.indexOf(prefix) == 0)
			{
				return true;
			}
		}
		
		return false;
	}
};
