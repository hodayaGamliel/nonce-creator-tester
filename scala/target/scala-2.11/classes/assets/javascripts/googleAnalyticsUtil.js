gau_removeUtms = function()
{
  if (window.history &&
  window.history.replaceState &&
  window.location.hash.indexOf("__utma") > 0)
  {
    var newAnchor = window.location.hash.indexOf("__utma");

    var newUrl = window.location.pathname +
          window.location.search +
          window.location.hash.substring(0, newAnchor - 1);

  window.history.replaceState({}, "", newUrl);
  }
};

gas_initialize = function(skipPageview)
{
	_gas.push(['_setAccount', 'UA-29184077-8']);
	_gas.push(['_setAllowLinker', true]);
	_gas.push(['_setAllowAnchor', true]);
	
	_gas.push(['_setDomainName', 'takipi.com']);
	_gas.push(['_setDomainName', 'takipiblog.com']);
	
	_gas.push(['_gasMultiDomain', 'click']);
	_gas.push(['_require', 'inpage_linkid', '//www.google-analytics.com/plugins/ga/inpage_linkid.js']);

	if (skipPageview != true)
	{
		_gas.push(['_trackPageview']);
	}

	_gas.push(['_gasTrackForms']);
	_gas.push(['_gasTrackOutboundLinks']);
	_gas.push(['_gasTrackMaxScroll']);
	_gas.push(['_gasTrackDownloads', {category: 'Installer Downloads', extensions: 'msi'}]);
	_gas.push(['_gasTrackVideo']);
	_gas.push(['_gasTrackAudio']);
	_gas.push(['_gasTrackYoutube', {force: true}]);
	_gas.push(['_gasTrackMailto']);
	_gas.push(gau_removeUtms);
};

gas_initialize = function()
{
  _gas.push(['_setAccount', 'UA-29184077-8']);
  _gas.push(['_setAllowLinker', true]);
  _gas.push(['_setAllowAnchor', true]);
  _gas.push(['_setDomainName', 'takipi.com']);
  _gas.push(['_setDomainName', 'takipiblog.com']);
  _gas.push(['_gasMultiDomain', 'click']);
  _gas.push(['_require', 'inpage_linkid', '//www.google-analytics.com/plugins/ga/inpage_linkid.js']);
  _gas.push(['_trackPageview']);
  _gas.push(['_gasTrackForms']);
  _gas.push(['_gasTrackOutboundLinks']);
  _gas.push(['_gasTrackMaxScroll']);
  _gas.push(['_gasTrackDownloads', {category: 'Installer Downloads', extensions: 'msi'}]);
  _gas.push(['_gasTrackVideo']);
  _gas.push(['_gasTrackAudio']);
  _gas.push(['_gasTrackYoutube', {force: true}]);
  _gas.push(['_gasTrackMailto']);
  _gas.push(gau_removeUtms);
};

gau_initPageview = function()
{
	_gas.push(['_trackPageview']);
};
