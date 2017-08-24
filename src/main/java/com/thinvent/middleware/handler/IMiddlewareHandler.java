package com.thinvent.middleware.handler;

import com.thinvent.library.exception.ThinventBaseException;

public interface IMiddlewareHandler {
	public void receive(String param) throws ThinventBaseException;
	
	public void warning(String warning) throws ThinventBaseException;
}
