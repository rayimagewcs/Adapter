package com.thinvent.middleware.handler.impl;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.adapt.IFaceAdapt;
import com.thinvent.middleware.adapt.impl.FaceAdaptImpl;
import com.thinvent.middleware.handler.IFaceRegisterHandler;
import com.thinvent.middleware.model.ThinventTemplate;

public class FaceRegisterHandlerImpl implements IFaceRegisterHandler {
	public FaceRegisterHandlerImpl() {
		faceAdapt = new FaceAdaptImpl();
	}
	
	private IFaceAdapt faceAdapt;
	
	@Override
	public void registerFaceTemplate(ThinventTemplate template) throws ThinventBaseException {
		// TODO Auto-generated method stub
		
	}

}
