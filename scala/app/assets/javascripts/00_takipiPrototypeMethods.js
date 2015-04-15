/*
 * Prototype Methods 1.0
 *
 * Copyright (c) 2012 Dor Levi (www.takipi.com)
 *
 * Date: 11/10/2012
 */
Function.prototype.inherits = function (parent) {
	this.prototype = new parent();
	var d = {};
	var p = this.prototype;
	
	this.prototype.constructor = parent;

	this.prototype.uber = function uber(name) {
		if (!(name in d))
		{
			d[name] = 0;
		}

		var f, r, t = d[name], v = parent.prototype;

		if (t)
		{
			while (t)
			{
				v = v.constructor.prototype;
				t -= 1;
			}

			f = v[name];
		}
		else
		{
			f = p[name];

			if (f == this[name])
			{
				f = v[name];
			}
		}

		d[name] += 1;

		r = f.apply(this, Array.prototype.slice.apply(arguments, [1]));

		d[name] -= 1;

		return r;
	};

    return this;
};
String.prototype.endsWith = function(suffix) {
	return this.indexOf(suffix, this.length - suffix.length) !== -1;
};
String.prototype.startsWith = function(prefix) {
	return this.indexOf(prefix) === 0;
};
String.prototype.insert = function(index, other) {
	return [this.slice(0, index), other, this.slice(index)].join('');
};
String.prototype.fulltrim = function()
{
	return this.replace(/(?:(?:^|\n)\s+|\s+(?:$|\n))/g,'').replace(/\s+/g,' ');
};
String.prototype.contains = function(other)
{
	return this.indexOf(other) !== -1;
};
String.prototype.occurrences = function (substring)
{
	if (this.length == 0)
	{
		return 0;
	}
	else if (substring.length == 0)
	{
		return this.length;
	}

	var result = 0;
	var pos = 0;

	while (true)
	{
		pos = this.indexOf(substring, pos);

		if (pos != -1)
		{
			result++;
			pos += substring.length;
		}
		else
		{
			break;
		}
	}

	return result;
};
if (!String.prototype.format)
{
	String.prototype.format = function() {
		var args = arguments;
		return this.replace(/{(\d+)}/g, function(match, number) {
			return typeof args[number] != 'undefined' ? args[number] : match;
		});
	};
}
if (!Array.prototype.indexOf)
{
	Array.prototype.indexOf= function(what, i){
		i = i || 0;
		var L= this.length;
		while(i< L){
			if(this[i]=== what) return i;
			++i;
		}
		return -1;
	};
}
Array.prototype.removeValue = function()
{
	var what, a= arguments, L= a.length, ax;
	while(L && this.length){
		what= a[--L];
		while((ax= this.indexOf(what))!= -1){
			this.splice(ax, 1);
		}
	}
	return this;
};
Array.prototype.pushAll = function(other)
{
	this.push.apply(this, other);
};
Array.prototype.shuffle = function() {
	var i = this.length, j, tempi, tempj;

	if ( i == 0 ) return this;
	while ( --i )
	{
		j		= Math.floor( Math.random() * ( i + 1 ) );
		tempi	= this[i];
		tempj	= this[j];
		this[i]	= tempj;
		this[j]	= tempi;
	}

	return this;
};
Array.prototype.clone = function() {
	return this.slice(0);
};

Date.prototype.customFormat = function(formatString){
	var YYYY,YY,MMMM,MMM,MM,M,DDDD,DDD,DD,D,hhh,hh,h,mm,m,ss,s,ampm,AMPM,dMod,th;
	var dateObject = this;
	YY = ((YYYY=dateObject.getFullYear())+"").slice(-2);
	MM = (M=dateObject.getMonth()+1)<10?('0'+M):M;
	MMM = (MMMM=["January","February","March","April","May","June","July","August","September","October","November","December"][M-1]).substring(0,3);
	DD = (D=dateObject.getDate())<10?('0'+D):D;
	DDD = (DDDD=["Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"][dateObject.getDay()]).substring(0,3);
	th=(D>=10&&D<=20)?'th':((dMod=D%10)==1)?'st':(dMod==2)?'nd':(dMod==3)?'rd':'th';
	formatString = formatString.replace("#YYYY#",YYYY).replace("#YY#",YY).replace("#MMMM#",MMMM).replace("#MMM#",MMM).replace("#MM#",MM).replace("#M#",M).replace("#DDDD#",DDDD).replace("#DDD#",DDD).replace("#DD#",DD).replace("#D#",D).replace("#th#",th);

	h=(hhh=dateObject.getHours());
	if (h==0) h=24;
	if (h>12) h-=12;
	hh = h<10?('0'+h):h;
	AMPM=(ampm=hhh<12?'am':'pm').toUpperCase();
	mm=(m=dateObject.getMinutes())<10?('0'+m):m;
	ss=(s=dateObject.getSeconds())<10?('0'+s):s;
	return formatString.replace("#hhh#",hhh).replace("#hh#",hh).replace("#h#",h).replace("#mm#",mm).replace("#m#",m).replace("#ss#",ss).replace("#s#",s).replace("#ampm#",ampm).replace("#AMPM#",AMPM);
};
