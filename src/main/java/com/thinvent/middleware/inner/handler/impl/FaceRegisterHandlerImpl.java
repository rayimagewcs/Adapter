package com.thinvent.middleware.inner.handler.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinvent.library.config.ServiceConfig;
import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.inner.adapt.IFaceAdapt;
import com.thinvent.middleware.inner.handler.IFaceRegisterHandler;
import com.thinvent.middleware.model.ThinventTemplate;
import com.thinvent.middleware.outer.adapt.IFaceRegisterAdapt;
import com.thinvent.middleware.outer.adapt.impl.FaceRegisterAdaptImpl;

@Service
public class FaceRegisterHandlerImpl implements IFaceRegisterHandler {
	
	@Autowired
	private IFaceAdapt faceAdapt;
	
	private IFaceRegisterAdapt faceRegisterAdapt;
	
	public FaceRegisterHandlerImpl() throws Exception {
		String faceClass = ServiceConfig.getServiceConfig("middleware.basic", "class.face");
		if (faceClass != null && !"".equals(faceClass)) {
			faceRegisterAdapt = (IFaceRegisterAdapt) Class.forName(faceClass).newInstance();
		} else {
			faceRegisterAdapt = new FaceRegisterAdaptImpl();
		}
	}
	
	@Override
	public void saveFaceTemplate(ThinventTemplate template) throws ThinventBaseException {
		String result = faceRegisterAdapt.registerFaceTemplate(template);
		if (result != null && !"".equals(result)) {
			faceAdapt.saveFaceTemplate(template);
		}
	}
	
}
