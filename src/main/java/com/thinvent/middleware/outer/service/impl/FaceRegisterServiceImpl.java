package com.thinvent.middleware.outer.service.impl;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.model.ThinventTemplate;
import com.thinvent.middleware.outer.adapt.IFaceAdapt;
import com.thinvent.middleware.outer.adapt.impl.FaceAdaptImpl;
import com.thinvent.middleware.outer.service.IFaceRegisterService;

public class FaceRegisterServiceImpl implements IFaceRegisterService {
	private IFaceAdapt faceAdapt;
	
	public FaceRegisterServiceImpl() {
		faceAdapt = new FaceAdaptImpl();
	}
	
	@Override
	public String registerFaceTemplate(ThinventTemplate template) throws ThinventBaseException {
		return faceAdapt.registerFaceTemplate(template);
	}

}
