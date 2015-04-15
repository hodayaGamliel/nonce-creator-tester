/*
 * Release Outside 1.0
 *
 * Copyright (c) 2012 Dor Levi (www.takipi.com)
 *
 * Date: 07/10/2012
 */
ReleaseOutsideItem = function(targets, func, funcTarget, funcArgs, count)
{
	this.targets = targets;
	this.func = func;

	this.funcTarget = (funcTarget != undefined ? funcTarget : null);
	this.funcArgs = funcArgs;
	this.count = (count != undefined ? count : 1);
};
ReleaseOutsideItem.prototype = {
	activate:function()
	{
		if (this.funcTarget != null)
		{
			this.func.apply(this.funcTarget, this.funcArgs);
		}
		else
		{
			this.func(this.funcArgs);
		}
	},
	doProcess:function()
	{
		this.activate();

		if (this.count > 0)
		{
			this.count--;

			return (this.count == 0);
		}
		else
		{
			return false;
		}
	},
	process:function(e)
	{
		for (var i = 0; i < this.targets.length; i++)
		{
			var curTarget = this.targets[i];

			if ((curTarget.is(e.target)) ||
				(curTarget.has(e.target).length !== 0))
			{
				return false;
			}
		}

		return this.doProcess();
	},
	processTarget:function(target)
	{
		for (var i = 0; i < this.targets.length; i++)
		{
			var curTarget = this.targets[i];

			if (curTarget.is(target))
			{
				return this.doProcess();
			}
		}

		return true;
	}
};

TakipiReleaseOutside = function()
{
	this.items = [];
};
TakipiReleaseOutside.prototype = {
	mousedown:function(e)
	{
		var finishedItems = [];

		for (var i = 0; i < this.items.length; i++)
		{
			var curItem = this.items[i];

			if (curItem.process(e))
			{
				finishedItems.push(curItem);
			}
		}

		for (i = 0; i < finishedItems.length; i++)
		{
			this.items.removeValue(finishedItems[i]);
		}
	},
	activateTarget:function(target)
	{
		var finishedItems = [];

		for (var i = 0; i < this.items.length; i++)
		{
			var curItem = this.items[i];

			if (curItem.processTarget(target))
			{
				finishedItems.push(curItem);
			}
		}

		for (i = 0; i < finishedItems.length; i++)
		{
			this.items.removeValue(finishedItems[i]);
		}
	},
	addItem:function(target, func, funcTarget, funcArgs, count)
	{
		this.items.push(new ReleaseOutsideItem([target], func, funcTarget, funcArgs, count));
	},
	addListItem:function(targets, func, funcTarget, funcArgs, count)
	{
		this.items.push(new ReleaseOutsideItem(targets, func, funcTarget, funcArgs, count));
	},
	initialize:function()
	{
		var outsideInst = this;

		$(document).mousedown(function(e) {
			outsideInst.mousedown(e);
		});
	},
	createReleaseOutsideToggle:function(btn, toggled, slide, openCallback)
	{
		var releaseOutside = this;

		btn.attr({"toggle-state":"closed"}).click(function() {
			if ($(this).attr("toggle-state") == "closed")
			{
				$(this).attr({"toggle-state":"opened"});

				if (slide)
				{
					toggled.slideDown();
				}
				else
				{
					toggled.show();
				}

				releaseOutside.addListItem([btn, toggled], function() {
					btn.attr({"toggle-state":"closed"});

					if (slide)
					{
						toggled.slideUp();
					}
					else
					{
						toggled.hide();
					}
				});

				if (openCallback != undefined)
				{
					openCallback();
				}
			}
			else
			{
				releaseOutside.activateTarget(toggled);
			}

			return false;
		});
	}
};

var ReleaseOutsideInst = new TakipiReleaseOutside();
