package com.thinvent.middleware.inner.handler.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.inner.adapt.IWarningAdapt;
import com.thinvent.middleware.inner.handler.IWarningHandler;

@Service
public class WarningHandlerImpl implements IWarningHandler {
	
	@Autowired
	private IWarningAdapt warningAdapt;
	
	@Override
	public void process(String warningInfo) throws ThinventBaseException {
		warningAdapt.process(warningInfo);
	}
	
}
