package com.thinvent.middleware.outer.service;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.model.ThinventTemplate;

public interface IVehicleRegisterService {
	public String registerVehicleTemplate(ThinventTemplate VehicleTemplate) throws ThinventBaseException;
}
