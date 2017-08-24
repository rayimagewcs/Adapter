package com.thinvent.middleware.handler;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.model.ThinventTemplate;

public interface IFaceRegisterHandler {
	public void registerFaceTemplate(ThinventTemplate template) throws ThinventBaseException;
}
