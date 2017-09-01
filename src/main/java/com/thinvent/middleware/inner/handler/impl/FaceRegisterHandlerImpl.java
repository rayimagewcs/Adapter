package com.thinvent.middleware.inner.handler.impl;

import org.springframework.stereotype.Service;

import com.thinvent.library.Constants;
import com.thinvent.library.config.ServiceConfig;
import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.inner.handler.IFaceRegisterHandler;
import com.thinvent.middleware.outer.adapt.IFaceRegisterAdapt;
import com.thinvent.middleware.outer.adapt.impl.FaceRegisterAdaptImpl;

@Service
public class FaceRegisterHandlerImpl implements IFaceRegisterHandler {
	
	private IFaceRegisterAdapt faceRegisterAdapt;
	
	public FaceRegisterHandlerImpl() throws Exception {
		String faceClass = ServiceConfig.getServiceConfig(Constants.adapterBasicService, "class.face");
		if (faceClass != null && !"".equals(faceClass)) {
			faceRegisterAdapt = (IFaceRegisterAdapt) Class.forName(faceClass).newInstance();
		} else {
			faceRegisterAdapt = new FaceRegisterAdaptImpl();
		}
	}
	
	@Override
	public String registerFaceTemplate(String json) throws ThinventBaseException {
		return faceRegisterAdapt.registerFace(json);
	}
	
	@Override
	public String register(String json) throws ThinventBaseException {
		return faceRegisterAdapt.register(json);
	}

}
