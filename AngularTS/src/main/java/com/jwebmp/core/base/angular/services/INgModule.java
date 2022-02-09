package com.jwebmp.core.base.angular.services;

import com.jwebmp.core.databind.*;

import java.util.*;

public interface INgModule<J extends INgModule<J>> extends IComponent<J>, IConfiguration
{
	/**
	 * Import name, Import location
	 * <p>
	 * npm modules should now be specified inside of components properly with this implementation
	 *
	 * @return
	 */
	default Map<String, String> imports()
	{
		return new HashMap<>();
	}
	
	default List<String> declarations()
	{
		return new ArrayList<>();
	}
	
	default Map<String, String> providers()
	{
		return new HashMap<>();
	}
	
	default List<String> bootstrap()
	{
		return new ArrayList<>();
	}
	
	default Set<String> assets()
	{
		return new HashSet<>();
	}
}
