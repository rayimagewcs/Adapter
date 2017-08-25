package com.thinvent.middleware.inner.adapt;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.model.ThinventTemplate;

public interface IVehicleAdapt {
	public void saveVehicleTemplate(ThinventTemplate template) throws ThinventBaseException;
	
	public void updateVehicleTemplate(ThinventTemplate template) throws ThinventBaseException;
}
