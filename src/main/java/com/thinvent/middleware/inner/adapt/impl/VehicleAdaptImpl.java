package com.thinvent.middleware.inner.adapt.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.thinvent.library.Constants;
import com.thinvent.library.config.ServiceConfig;
import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.library.util.GetPostUtil;
import com.thinvent.middleware.inner.adapt.IVehicleAdapt;
import com.thinvent.middleware.model.ThinventTemplate;

@Service
public class VehicleAdaptImpl implements IVehicleAdapt {
	private String basicUrl = ServiceConfig.getServiceConfig("middleware.basic", Constants.apiBasicUrlKey);
	
	@Override
	public void saveVehicleTemplate(ThinventTemplate template) throws ThinventBaseException {
		String url = basicUrl + "template/saveVehicleTemplate";
		Map<String, Object> param = new HashMap();
		param.put("template", template);
		GetPostUtil.sendPost(url, param.toString());
	}

	@Override
	public void updateVehicleTemplate(ThinventTemplate template) throws ThinventBaseException {
		String url = basicUrl + "template/updateVehicleTemplate";
		Map<String, Object> param = new HashMap();
		param.put("template", template);
		GetPostUtil.sendPost(url, param.toString());
	}
}
