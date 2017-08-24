package com.thinvent.middleware.adapt.impl;

import org.springframework.stereotype.Service;

import com.thinvent.middleware.adapt.IMiddlewareAdapt;
import com.thinvent.middleware.mq.ThinventProducer;

@Service
public class MiddlewareAdaptImpl implements IMiddlewareAdapt {

	@Override
	public void receive(String param) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void processWarning(String warningInfo) {
		ThinventProducer.sendMessage(warningInfo);
	}

}
