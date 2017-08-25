package com.thinvent.middleware.inner.adapt.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.thinvent.library.Constants;
import com.thinvent.library.config.ServiceConfig;
import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.library.mq.entity.Message;
import com.thinvent.library.util.GetPostUtil;
import com.thinvent.middleware.inner.adapt.IWarningAdapt;

@Service
public class WarningAdaptImpl implements IWarningAdapt {
	private String basicUrl = ServiceConfig.getServiceConfig("middleware.basic", Constants.messageServiceUrlKey);

	@Override
	public void process(String warningInfo) throws ThinventBaseException {
		Message msg = new Message(warningInfo);
		String url = basicUrl + "message/send";
		Map<String, Object> param = new HashMap();
		param.put("message", msg);
		GetPostUtil.sendPost(url, param.toString());
	}

}
