package com.thinvent.middleware.inner.handler.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.inner.adapt.IVehicleAdapt;
import com.thinvent.middleware.inner.handler.IVehicleRegisterHandler;
import com.thinvent.middleware.model.ThinventTemplate;

@Service
public class VehicleRegisterHandlerImpl implements IVehicleRegisterHandler {
	
	@Autowired
	private IVehicleAdapt VehicleAdapt;

	@Override
	public void saveVehicleTemplate(ThinventTemplate template) throws ThinventBaseException {
		VehicleAdapt.saveVehicleTemplate(template);
	}

}
