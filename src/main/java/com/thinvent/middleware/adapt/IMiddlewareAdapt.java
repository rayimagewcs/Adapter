package com.thinvent.middleware.adapt;

public interface IMiddlewareAdapt {
	public void receive(String param);
	
	public void processWarning(String warningInfo);
}
