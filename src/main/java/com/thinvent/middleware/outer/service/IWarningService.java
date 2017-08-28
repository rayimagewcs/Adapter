package com.thinvent.middleware.outer.service;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.library.mq.entity.Message;

public interface IWarningService {
	public void process(Message message) throws ThinventBaseException;
	
}
