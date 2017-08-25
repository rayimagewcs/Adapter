package com.thinvent.middleware.inner.adapt.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.thinvent.library.Constants;
import com.thinvent.library.config.ServiceConfig;
import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.library.util.GetPostUtil;
import com.thinvent.middleware.inner.adapt.IFaceAdapt;
import com.thinvent.middleware.model.ThinventTemplate;

@Service
public class FaceAdaptImpl implements IFaceAdapt {
	private String basicUrl = ServiceConfig.getServiceConfig("middleware.basic", Constants.apiBasicUrlKey);
	
	public void saveFaceTemplate(ThinventTemplate template) throws ThinventBaseException {
		String url = basicUrl + "template/saveFaceTemplate";
		Map<String, Object> param = new HashMap();
		param.put("template", template);
		GetPostUtil.sendPost(url, param.toString());
	}
	
	public void updateFaceTemplate(ThinventTemplate template) throws ThinventBaseException {
		String url = basicUrl + "template/updateFaceTemplate";
		Map<String, Object> param = new HashMap();
		param.put("template", template);
		GetPostUtil.sendPost(url, param.toString());
	}
}
