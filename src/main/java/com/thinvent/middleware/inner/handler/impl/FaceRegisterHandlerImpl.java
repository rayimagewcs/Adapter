package com.thinvent.middleware.inner.handler.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.inner.adapt.IFaceAdapt;
import com.thinvent.middleware.inner.handler.IFaceRegisterHandler;
import com.thinvent.middleware.model.ThinventTemplate;

@Service
public class FaceRegisterHandlerImpl implements IFaceRegisterHandler {
	
	@Autowired
	private IFaceAdapt faceAdapt;
	
	@Override
	public void saveFaceTemplate(ThinventTemplate template) throws ThinventBaseException {
		faceAdapt.saveFaceTemplate(template);
	}

}
