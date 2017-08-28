package com.thinvent.middleware.outer.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.library.mq.entity.Message;
import com.thinvent.middleware.inner.adapt.IWarningAdapt;
import com.thinvent.middleware.outer.service.IWarningService;

@Service
public class WarningServiceImpl implements IWarningService {
	
	@Autowired
	private IWarningAdapt warningAdapt;
	
	@Override
	public void process(Message message) throws ThinventBaseException {
		warningAdapt.process(message);
	}
	
}
