package com.thinvent.middleware.adapt;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.model.ThinventTemplate;

public interface IVehicalAdapt {
	public String registerVehicalTemplate(ThinventTemplate template) throws ThinventBaseException;
}
