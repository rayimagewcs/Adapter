package com.thinvent.middleware.inner.handler;

import com.thinvent.library.exception.ThinventBaseException;

public interface IFaceRegisterHandler {
	public String registerFaceTemplate(String json) throws ThinventBaseException;
	
	public String register(String json) throws ThinventBaseException;
}
