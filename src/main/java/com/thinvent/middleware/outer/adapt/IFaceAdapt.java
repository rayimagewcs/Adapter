package com.thinvent.middleware.outer.adapt;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.model.ThinventTemplate;

public interface IFaceAdapt {
	public String registerFaceTemplate(ThinventTemplate template) throws ThinventBaseException;
}