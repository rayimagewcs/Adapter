package com.thinvent.middleware.outer.adapt.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.library.util.JSONUtil;
import com.thinvent.middleware.outer.adapt.IRegisterAdapt;

public class SocketAdapterImpl implements IRegisterAdapt {

	@Override
	public Object register(String json) throws ThinventBaseException {
		JSONObject jsonObj = JSON.parseObject(json);
		String ip = (String) JSONUtil.getAttribute("header.socket.ip", jsonObj);
		String port = (String) JSONUtil.getAttribute("header.socket.port", jsonObj);
		return null;
	}

}
