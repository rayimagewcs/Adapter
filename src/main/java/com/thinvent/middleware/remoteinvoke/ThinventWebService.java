package com.thinvent.middleware.remoteinvoke;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ThinventWebService {
	
	public Object[] invoke(String namespace, String wsdlUrl, String method, Object param) {
		JaxWsDynamicClientFactory factory = JaxWsDynamicClientFactory.newInstance();
		Client client = factory.createClient(wsdlUrl);
		Object[] obj = null;
		try {
			obj = client.invoke(method, param);
		} catch (Exception e) {
			e.printStackTrace();
			log.error("remote invoke fail: ", e);
		}
		
		return obj;
	}
}
