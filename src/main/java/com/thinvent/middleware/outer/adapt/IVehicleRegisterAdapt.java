package com.thinvent.middleware.outer.adapt;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.model.ThinventTemplate;

public interface IVehicleRegisterAdapt {
	public String registerVehicleTemplate(ThinventTemplate template) throws ThinventBaseException;
}
