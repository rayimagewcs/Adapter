package com.thinvent.middleware.outer.service.impl;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.model.ThinventTemplate;
import com.thinvent.middleware.outer.adapt.IVehicleAdapt;
import com.thinvent.middleware.outer.adapt.impl.VehicleAdaptImpl;
import com.thinvent.middleware.outer.service.IVehicleRegisterService;

public class VehicleRegisterServiceImpl implements IVehicleRegisterService {
	public VehicleRegisterServiceImpl() {
		VehicleAdapt = new VehicleAdaptImpl();
	}
	
	private IVehicleAdapt VehicleAdapt;
	
	@Override
	public String registerVehicleTemplate(ThinventTemplate VehicleTemplate) throws ThinventBaseException {
		return VehicleAdapt.registerVehicleTemplate(VehicleTemplate);
	}

}
