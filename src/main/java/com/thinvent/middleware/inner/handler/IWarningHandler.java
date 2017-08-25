package com.thinvent.middleware.inner.handler;

import com.thinvent.library.exception.ThinventBaseException;

public interface IWarningHandler {
	public void process(String param) throws ThinventBaseException;
	
}
