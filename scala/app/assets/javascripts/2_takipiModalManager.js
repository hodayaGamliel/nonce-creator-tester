/*
 * Modal Manager 1.0
 *
 * Copyright (c) 2012 Dor Levi (www.takipi.com)
 *
 * Date: 10/12/2012
 */
TakipiModalElement = function(element, closeOnModalClick, closeOnEsc, animate, animateDuration, onCloseCallback, onEnterCallback)
{
	this.element = element;
	this.closeOnModalClick = (closeOnModalClick != undefined ? closeOnModalClick : false);
	this.closeOnEsc = (closeOnEsc != undefined ? closeOnEsc : false);
	this.animate = (animate != undefined ? animate : false);
	this.animateDuration = (animateDuration != undefined ? animateDuration : 500);
	this.onCloseCallback = (onCloseCallback != undefined ? onCloseCallback : null);
	this.onEnterCallback = (onEnterCallback != undefined ? onEnterCallback : null);
};

TakipiModalManager = function(baseModalZIndex)
{
	this.modalOverlay = null;
	this.overlayDisplayed = false;
	this.initialized = false;

	this.baseModalZIndex = baseModalZIndex;
	this.modalStack = [];
};
TakipiModalManager.prototype = {
	getModalElement:function(element)
	{
		for (var i = 0; i < this.modalStack.length; i++)
		{
			var curModalElement = this.modalStack[i];

			if (curModalElement.element == element)
			{
				return curModalElement;
			}
		}

		return null;
	},
	closeModal:function(event)
	{
		var modalElement = this.getModalElement(event.target);

		if (modalElement != null)
		{
			this.doCloseModal(modalElement);
		}
	},
	doCloseModal:function(modalElement)
	{
		this.modalStack.removeValue(modalElement);
		EventManagerInst.removeAllTargetTypeListeners(modalElement.element, "CLOSE_MODAL");
		EventManagerInst.removeAllTargetTypeListeners(modalElement.element, "REPOSITION_MODAL");

		if (modalElement.animate)
		{
			modalElement.element.fadeOut(modalElement.animateDuration);
		}
		else
		{
			modalElement.element.hide();
		}

		if (this.modalStack.length == 0)
		{
			this.modalOverlay.css({"z-index" : this.baseModalZIndex});
			this.toggleModalOverlay(false, modalElement.animate, modalElement.animateDuration);
		}
		else
		{
			for (var i = 0; i < this.modalStack.length - 1; i++)
			{
				this.modalStack[i].element.css({"z-index" : this.baseModalZIndex + i});
			}

			var topModalIndex = this.baseModalZIndex + this.modalStack.length;

			this.modalStack[this.modalStack.length - 1].element.css({"z-index" : topModalIndex});
			this.modalOverlay.css({"z-index" : topModalIndex - 1});
		}

		if (modalElement.onCloseCallback != null)
		{
			modalElement.onCloseCallback();
		}

		if (window.resetZopim)
		{
			window.resetZopim();
		}
	},
	repositionModal:function(event)
	{
		var modalElement = this.getModalElement(event.target);

		if (modalElement != null)
		{
			var element = modalElement.element;

			var width = element.width();
			var height = element.height();

			element
				.css({"margin-left" : "-" + (width / 2).toString() + "px",
					  "margin-top" : "-" + (height / 2).toString() + "px"});
		}
	},
	pushModal:function(element, closeOnModalClick, closeOnEsc, animate, animateDuration, onCloseCallback, onEnterCallback)
	{
		var modalElement = this.getModalElement(element);

		if (modalElement == null)
		{
			modalElement = new TakipiModalElement(element, closeOnModalClick, closeOnEsc, animate, animateDuration, onCloseCallback, onEnterCallback);
			EventManagerInst.addEventListener(element, "CLOSE_MODAL", this.closeModal, this);
			EventManagerInst.addEventListener(element, "REPOSITION_MODAL", this.repositionModal, this);
		}
		else
		{
			this.modalStack.removeValue(modalElement);

			for (var i = 0; i < this.modalStack.length; i++)
			{
				this.modalStack[i].element.css({"z-index" : this.baseModalZIndex + i});
			}
		}

		var topModalIndex = this.baseModalZIndex + this.modalStack.length;

		this.modalStack.push(modalElement);

		var width = element.outerWidth();
		var height = element.outerHeight();

		element
			.css({"z-index" : topModalIndex + 1,
				  "position" : "fixed",
				  "left" : "50%",
				  "top" : "50%",
				  "margin-left" : "-" + (width / 2).toString() + "px",
				  "margin-top" : "-" + (height / 2).toString() + "px"});

		this.modalOverlay.css({"z-index" : topModalIndex});

		if (modalElement.animate)
		{
			element.fadeIn(modalElement.animateDuration);
		}
		else
		{
			element.show();
		}

		this.toggleModalOverlay(true, modalElement.animate, modalElement.animateDuration);

		this.updateModalCoverSize();
	},
	updateModalCoverSize:function()
	{
		var restoreOverlay = this.overlayDisplayed;

		this.toggleModalOverlay(false, false, 0);

		this.modalOverlay
			.css({"width" : Math.max($(document).width(), $(window).width()),
				  "height" : Math.max($(document).height(), $(window).height())});

		this.toggleModalOverlay(restoreOverlay, false, 0);
	},
	modalOverlayClicked:function()
	{
		if (this.modalStack.length > 0)
		{
			var topElement = this.modalStack[this.modalStack.length - 1];

			if (topElement.closeOnModalClick)
			{
				EventManagerInst.dispatch(topElement.element, "CLOSE_MODAL");
			}
		}
	},
	toggleModalOverlay:function(showOverlay, animate, animateDuration)
	{
		if (this.overlayDisplayed != showOverlay)
		{
			if (showOverlay)
			{
				if (animate)
				{
					this.modalOverlay.fadeIn(animateDuration);
				}
				else
				{
					this.modalOverlay.show();
				}
			}
			else
			{
				if (animate)
				{
					this.modalOverlay.fadeOut(animateDuration);
				}
				else
				{
					this.modalOverlay.hide();
				}
			}

			this.overlayDisplayed = showOverlay;
		}
	},
	initialize:function(context)
	{
		if (this.initialized)
		{
			return;
		}

		if ((context == undefined) ||
			(context == null))
		{
			context = $("body");
		}

		var modalManager = this;

		this.modalOverlay = $(document.createElement("div"))
								.css({"z-index" : this.baseModalZIndex,
									  "position" : "absolute",
									  "left" : 0,
									  "top" : 0,
									  "background-color" : "#999",
									  "opacity" : ".4"})
								.attr("id", "modalOverlay")
								.appendTo(context)
								.click(function(){
									modalManager.modalOverlayClicked();
									return false;
								})
								.hide();

		this.updateModalCoverSize();

		window.addEventListener("resize", function() {
			modalManager.updateModalCoverSize();
		}, false);

		$(document).on("keyup" , function(event) {
			var code = (event.keyCode ? event.keyCode : event.which);

			if (code == 27) 		// Esc
			{
				modalManager.closeTopModal();
			}
			else if (code == 13) 	// Enter
			{
				modalManager.enterTopModal();
			}

			return false;
		});

		this.initialized = true;
	},
	isEmpty:function()
	{
		return (this.modalStack.length == 0);
	},
	closeAllModals:function()
	{
		while (!this.isEmpty())
		{
			var modalElement = this.modalStack[0];
			this.doCloseModal(modalElement);
		}
	},
	getTopModal:function()
	{
		var topIndex = this.modalStack.length - 1;

		if (topIndex > -1)
		{
			return this.modalStack[topIndex];
		}

		return null;
	},
	closeTopModal:function()
	{
		var topModal = this.getTopModal();

		if ((topModal) &&
			(topModal.closeOnEsc))
		{
			this.doCloseModal(topModal);
		}
	},
	enterTopModal:function()
	{
		var topModal = this.getTopModal();

		if ((topModal) &&
			(topModal.onEnterCallback))
		{
			topModal.onEnterCallback();
		}
	},
};

var ModalManagerInst = new TakipiModalManager(1001);
