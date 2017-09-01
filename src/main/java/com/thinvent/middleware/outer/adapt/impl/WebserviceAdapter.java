package com.thinvent.middleware.outer.adapt.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.library.util.JSONUtil;
import com.thinvent.middleware.outer.adapt.IRegisterAdapt;

public class WebserviceAdapter implements IRegisterAdapt {

	@Override
	public Object register(String json) throws ThinventBaseException {
		JSONObject jsonObj = JSON.parseObject(json);
		
//		String wsdl = (String) JSONUtil.getAttribute("header.webservice.wsdl", jsonObj);
//		String namespace = (String) JSONUtil.getAttribute("header.webservice.wsdl", jsonObj);
		
//		............
		return null;
	}

}
