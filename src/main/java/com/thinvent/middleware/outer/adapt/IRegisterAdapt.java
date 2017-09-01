package com.thinvent.middleware.outer.adapt;

import com.thinvent.library.exception.ThinventBaseException;

public interface IRegisterAdapt {
	public Object register(String json) throws ThinventBaseException;
}
