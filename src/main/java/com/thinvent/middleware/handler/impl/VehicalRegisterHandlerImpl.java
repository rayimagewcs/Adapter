package com.thinvent.middleware.handler.impl;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.adapt.IVehicalAdapt;
import com.thinvent.middleware.adapt.impl.VehicalAdaptImpl;
import com.thinvent.middleware.handler.IVehicalRegisterHandler;
import com.thinvent.middleware.model.ThinventTemplate;

public class VehicalRegisterHandlerImpl implements IVehicalRegisterHandler {
	public VehicalRegisterHandlerImpl() {
		faceAdapt = new VehicalAdaptImpl();
	}
	
	private IVehicalAdapt faceAdapt;
	
	@Override
	public void registerVehicalTemplate(ThinventTemplate vehicalTemplate) throws ThinventBaseException {
		// TODO Auto-generated method stub
		
	}

}
