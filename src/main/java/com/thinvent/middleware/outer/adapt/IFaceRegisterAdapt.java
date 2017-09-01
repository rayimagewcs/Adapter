package com.thinvent.middleware.outer.adapt;

import com.thinvent.library.exception.ThinventBaseException;

public interface IFaceRegisterAdapt {
	public String registerFace(String json) throws ThinventBaseException;
	
	public String register(String json) throws ThinventBaseException;
}
