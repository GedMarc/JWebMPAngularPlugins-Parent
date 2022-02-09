package com.jwebmp.core.base.angular.services;

import com.guicedee.guicedinjection.interfaces.*;

import java.util.*;

public interface INgProvider<J extends Enum<J> & INgProvider<J>> extends IDefaultService<J>
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
}
