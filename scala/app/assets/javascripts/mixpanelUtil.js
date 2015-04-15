var MIXPANEL_API_KEY		= '483bb4fc0b55c2aa112d91af0438ab7f';

var mp_old_distinct_id = '';

mp_fill_old_distinct_id = function()
{
	try
	{
		mp_old_distinct_id = getParameterByName("mp");

		if (mp_old_distinct_id.length > 0)
		{
			window.history.replaceState(null, null, removeURLParameter(window.location.href, "mp"));
		}
	}
	catch (err) {}
}

mp_init = function()
{
	mixpanel.init(MIXPANEL_API_KEY, {'loaded': mp_loaded_callback});
};

mp_loaded_callback = function()
{
	mp_set_external_distinct_id();
};

mp_track_site_account_links = function()
{
	mixpanel.track_links("#mainCreateAccountBtn", "Create Account Clicked", {'referrer': document.referrer });
	mixpanel.track_links("#footerCreateAccountBtn", "Footer Create Account Clicked", {'referrer': document.referrer });
};

mp_track_site_pricing_links = function()
{
	mixpanel.track_links("#yearlySavingsPlanBtn", "Yearly Create Account Clicked", {'referrer': document.referrer });
	mixpanel.track_links("#monthlyPlanBtn", "Monthly Create Account Clicked", {'referrer': document.referrer });
};

mp_people_set_once_utm = function()
{
	var campaign_keywords = ['utm_source', 'utm_medium', 'utm_campaign', 'utm_content', 'utm_term'];

	var keywordIndex;

	var props = {};

	for (keywordIndex = 0; keywordIndex < campaign_keywords.length; ++keywordIndex)
	{
		campaignKeyword = campaign_keywords[keywordIndex];
		var campaignKeyWordValue = getParameterByName(campaignKeyword);

		if (campaignKeyWordValue.length > 0)
		{
			props[campaignKeyword] = campaignKeyWordValue;
		}
	}

	if ($.isEmptyObject(props) == false)
	{
		mixpanel.people.set_once(props);
	}
};

mp_people_set_once_start = function()
{
	props = {"First seen": new Date(),
			 "Site first seen": new Date(),
			 "Initial referrer": document.referrer,
			 "Site initial referrer": document.referrer,
			 "Visitor first page": document.location.href,
			 "Site first page": document.location.href};

	mixpanel.people.set_once(props);
};

mp_site_default_init = function()
{
	mp_fill_old_distinct_id();
	mp_init();
	mp_track_site_account_links();
	mp_people_set_once_start();
	mp_people_set_once_utm();
};

mp_site_pricing_init = function()
{
	mp_site_default_init();
	mp_track_site_pricing_links();
};

mp_set_external_distinct_id = function()
{
	try 
	{
		if (mp_old_distinct_id.length > 0) 
		{
			var curDistinctId = mixpanel.get_distinct_id();
			
			if ((curDistinctId != null) && 
				(!curDistinctId.contains("@")))
			{
				// Doesn't so what it should. Creates bogus users in mixpanel
				// Real solution is coming later.
				// mixpanel.identify(mp_old_distinct_id);
			}
		}
	}
	catch (err) {}
};
