package com.thinvent.middleware.inner.adapt.impl;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.thinvent.library.Constants;
import com.thinvent.library.config.ServiceConfig;
import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.library.mq.entity.Message;
import com.thinvent.library.util.GetPostUtil;
import com.thinvent.middleware.inner.adapt.IWarningAdapt;

@Service
public class WarningAdaptImpl implements IWarningAdapt {
	private String basicUrl = ServiceConfig.getServiceConfig(Constants.adapterBasicService, Constants.messageServiceUrlKey);

	@Override
	public void process(Message message) throws ThinventBaseException {
		String url = basicUrl + "message/push";
		String param = JSON.toJSONString(message.toString());
		GetPostUtil.sendPost(url, param);
	}

}
