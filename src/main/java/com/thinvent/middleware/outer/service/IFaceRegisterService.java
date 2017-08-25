package com.thinvent.middleware.outer.service;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.model.ThinventTemplate;

public interface IFaceRegisterService {
	public String registerFaceTemplate(ThinventTemplate template) throws ThinventBaseException;
}
