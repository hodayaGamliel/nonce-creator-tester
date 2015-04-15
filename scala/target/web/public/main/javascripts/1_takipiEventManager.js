/*
 * Event Manager 1.0
 *
 * Copyright (c) 2012 Dor Levi (www.takipi.com)
 *
 * Date: 12/11/2012
 */
TakipiEventManager = function()
{
	this.listeners = new TakipiMap("EventManager");
};
TakipiEventManager.prototype = {
	addEventListener:function(target, type, callback, scope)
	{
		var newCallback = {"scope":scope, "callback":callback};

		var targetListeners = {};

		if (this.listeners.contains(target))
		{
			targetListeners = this.listeners.get(target);

			if (type in targetListeners)
			{
				targetListeners[type].push(newCallback);
			}
			else
			{
				targetListeners[type] = [newCallback];
			}
		}
		else
		{
			targetListeners[type] = [newCallback];

			this.listeners.put(target, targetListeners);
		}
	},
	removeAllTargetListeners:function(target)
	{
		this.listeners.remove(target);
	},
	removeAllTargetTypeListeners:function(target, type)
	{
		if (this.listeners.contains(target))
		{
			var targetListeners = this.listeners.get(target);

			if (type in targetListeners)
			{
				delete targetListeners[type];
			}
		}
	},
	removeAllTargetScopeListeners:function(target, scope)
	{
		if (this.listeners.contains(target))
		{
			var targetListeners = this.listeners.get(target);

			for (var type in targetListeners)
			{
				var typedListeners = targetListeners[type];
				var newListeners = [];

				for (var i = 0; i < typedListeners.length; i++)
				{
					var listener = typedListeners[i];

					if (listener.scope != scope)
					{
						newListeners.push(listener);
					}
				}

				targetListeners[type] = newListeners;
			}
		}
	},
	removeEventListener:function(target, type, callback, scope)
	{
		if (this.listeners.contains(target))
		{
			var targetListeners = this.listeners.get(target);

			if (type in targetListeners)
			{
				var typedListeners = targetListeners[type];
				var newListeners = [];

				for (var i = 0; i < typedListeners.length; i++)
				{
					var listener = typedListeners[i];

					if ((listener.scope != scope) ||
						(listener.callback != callback))
					{
						newListeners.push(listener);
					}
				}

				targetListeners[type] = newListeners;
			}
		}
	},
	dispatch:function(target, type)
	{
		if (this.listeners.contains(target))
		{
			var targetListeners = this.listeners.get(target);

			if (type in targetListeners)
			{
				var event = {
						type:type,
						target:target
				};

				var args = [event];

				for (var i = 2; i < arguments.length; i++)
				{
					args.push(arguments[i]);
				}

				var typedListeners = targetListeners[type];

				for (i = 0; i < typedListeners.length; i++)
				{
					var listener = typedListeners[i];

					listener.callback.apply(listener.scope, args);
				}
			}
		}
	}
};

var EventManagerInst = new TakipiEventManager();
