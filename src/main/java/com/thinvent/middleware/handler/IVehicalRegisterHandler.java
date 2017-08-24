package com.thinvent.middleware.handler;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.model.ThinventTemplate;

public interface IVehicalRegisterHandler {
	public void registerVehicalTemplate(ThinventTemplate vehicalTemplate) throws ThinventBaseException;
}
