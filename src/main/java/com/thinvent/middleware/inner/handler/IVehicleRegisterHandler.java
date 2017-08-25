package com.thinvent.middleware.inner.handler;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.model.ThinventTemplate;

public interface IVehicleRegisterHandler {
	public void saveVehicleTemplate(ThinventTemplate template) throws ThinventBaseException;
}
