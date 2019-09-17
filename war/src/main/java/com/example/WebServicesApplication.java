package com.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("ws")
public class WebServicesApplication extends Application {

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Set<Class<?>> getClasses() {
		return new HashSet<>(Arrays.asList(Simple.class));
	}
}