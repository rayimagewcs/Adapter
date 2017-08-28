package com.thinvent.middleware.inner.adapt;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.library.mq.entity.Message;

public interface IWarningAdapt {
	public void process(Message message) throws ThinventBaseException;
	
}
