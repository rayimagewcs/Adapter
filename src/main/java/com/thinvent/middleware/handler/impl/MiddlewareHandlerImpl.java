package com.thinvent.middleware.handler.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinvent.middleware.adapt.IMiddlewareAdapt;
import com.thinvent.middleware.handler.IMiddlewareHandler;

@Service
public class MiddlewareHandlerImpl implements IMiddlewareHandler {
	
	@Autowired
	private IMiddlewareAdapt middlewareAdapt;
	
	@Override
	public void receive(String param) {
		
	}
	
	@Override
	public void warning(String warningInfo) {
		middlewareAdapt.processWarning(warningInfo);
		
	}

}
