package com.jwebmp.core.base.angular.modules;

import com.jwebmp.core.base.angular.services.*;

import java.util.*;

public class OnInitModule implements INgModule<OnInitModule>
{
	@Override
	public Map<String, String> imports()
	{
		return Map.of("OnInit", "@angular/core");
	}
	
}
