package com.thinvent.middleware.outer.adapt.impl;

import com.thinvent.library.Constants;
import com.thinvent.library.config.ServiceConfig;
import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.outer.adapt.IFaceRegisterAdapt;
import com.thinvent.middleware.remoteinvoke.ThinventWebservice;

public class FaceRegisterAdaptImpl implements IFaceRegisterAdapt {

	@Override
	public String registerFace(String json) throws ThinventBaseException {
		String namespace = ServiceConfig.getServiceConfig(Constants.adapterBasicService, "webservice.firmA.namespace");
		String wsdlUrl = ServiceConfig.getServiceConfig(Constants.adapterBasicService, "webservice.firmA.wsdl");
		String method = ServiceConfig.getServiceConfig(Constants.adapterBasicService, "webservice.firmA.method.face");
		
		Object ret = ThinventWebservice.invoke(namespace, wsdlUrl, method, json);
		return ret.toString();
	}

	@Override
	public String register(String json) throws ThinventBaseException {
		String namespace = ServiceConfig.getServiceConfig(Constants.adapterBasicService, "webservice.firmA.namespace");
		String wsdlUrl = ServiceConfig.getServiceConfig(Constants.adapterBasicService, "webservice.firmA.wsdl");
		String method = ServiceConfig.getServiceConfig(Constants.adapterBasicService, "webservice.firmA.method.face");
		
		Object ret = ThinventWebservice.invoke(namespace, wsdlUrl, method, json);
		return ret.toString();
	}
	
}
