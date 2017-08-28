package com.thinvent.middleware.inner.handler.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinvent.library.config.ServiceConfig;
import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.inner.adapt.IVehicleAdapt;
import com.thinvent.middleware.inner.handler.IVehicleRegisterHandler;
import com.thinvent.middleware.model.ThinventTemplate;
import com.thinvent.middleware.outer.adapt.IVehicleRegisterAdapt;
import com.thinvent.middleware.outer.adapt.impl.VehicleRegisterAdaptImpl;

@Service
public class VehicleRegisterHandlerImpl implements IVehicleRegisterHandler {
	
	@Autowired
	private IVehicleAdapt vehicleAdapt;
	
	private IVehicleRegisterAdapt vehicleRegisterAdapt;

	public VehicleRegisterHandlerImpl() throws Exception {
		String vehicleClass = ServiceConfig.getServiceConfig("middleware.basic", "class.vehicle");
		if (vehicleClass != null && !"".equals(vehicleClass)) {
			vehicleRegisterAdapt = (IVehicleRegisterAdapt) Class.forName(vehicleClass).newInstance();
		} else {
			vehicleRegisterAdapt = new VehicleRegisterAdaptImpl();
		}
	}
	
	@Override
	public void saveVehicleTemplate(ThinventTemplate template) throws ThinventBaseException {
		String result = vehicleRegisterAdapt.registerVehicleTemplate(template);
		if (result != null && !"".equals(result)) {
			vehicleAdapt.saveVehicleTemplate(template);
		}
	}

}
