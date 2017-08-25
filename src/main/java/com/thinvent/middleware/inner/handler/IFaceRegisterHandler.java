package com.thinvent.middleware.inner.handler;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.model.ThinventTemplate;

public interface IFaceRegisterHandler {
	public void saveFaceTemplate(ThinventTemplate template) throws ThinventBaseException;
}
