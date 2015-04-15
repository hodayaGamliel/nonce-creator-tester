/*
 * Takipi Map 1.0
 * 
 * Copyright (c) 2012 Dor Levi (www.takipi.com)
 *
 * Date: 13/11/2012
 * 
 * A map that generates unique hash values for objects and stores them on those objects.
 * Not very clean, but allows objects to be used as keys without the need to implement .hashCode ans .equals
 */
TakipiMap = function(mapName)
{
	this.mapName = mapName; // This needs to be unique across app
	this.hashProperty = "__hash_" + mapName;
	this.entries = {};
	this.size = 0;
	this.currentHashKey = 0;
};
TakipiMap.prototype = {
	hash:function(value)
	{
		if (value instanceof Object)
		{
			if (value[this.hashProperty])
			{
				return value[this.hashProperty];
			}
			else
			{
				value[this.hashProperty] = "object " + (++this.currentHashKey);
				return value[this.hashProperty];
			}
		}
		else
		{
			return (typeof value) + ' ' + String(value);
		}
	},
	get:function(key)
	{
		var entry = this.entries[this.hash(key)];
		return (typeof entry === 'undefined' ? null : entry.value);
	},
	put:function(key, value)
	{
		var hash = this.hash(key);

		if (this.entries.hasOwnProperty(hash))
		{
			this.entries[hash].value = value;
		}
		else
		{
			var entry = {"key" : key, "value" : value};
			this.entries[hash] = entry;
			
			++this.size;
		}
	},
	remove:function(key)
	{
		var hash = this.hash(key);

		if (this.entries.hasOwnProperty(hash))
		{
			--this.size;
			
			delete this.entries[hash];
		}
	},
	contains:function(key)
	{
		return this.entries.hasOwnProperty(this.hash(key));
	},
	getKeys:function()
	{
		var result = [];
		
		for (var hashKey in this.entries)
		{
			result.push(this.entries[hashKey].key);
		}
		
		return result;
	},
	getValues:function()
	{
		var result = [];
		
		for (var hashKey in this.entries)
		{
			result.push(this.entries[hashKey].value);
		}
		
		return result;
	},
	getEntries:function()
	{
		var result = [];
		
		for (var hashKey in this.entries)
		{
			result.push(this.entries[hashKey]);
		}
		
		return result;
	}
};
