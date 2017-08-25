package com.thinvent.middleware.inner.adapt;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.model.ThinventTemplate;

public interface IFaceAdapt {
	public void saveFaceTemplate(ThinventTemplate template) throws ThinventBaseException;
	
	public void updateFaceTemplate(ThinventTemplate template) throws ThinventBaseException;
}
