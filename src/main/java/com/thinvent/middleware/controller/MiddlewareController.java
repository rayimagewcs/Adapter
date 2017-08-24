package com.thinvent.middleware.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.handler.IMiddlewareHandler;

@RestController
@RequestMapping(value = "/adapter")
public class MiddlewareController {
	@Autowired
	private IMiddlewareHandler adapterHandler;
	
	@RequestMapping(value="/receive", method = RequestMethod.POST)
	public void receive(@RequestParam(value="param", required = true) String param) throws ThinventBaseException {
		adapterHandler.receive(param);
	}
	
	@RequestMapping(value="/warning", method = RequestMethod.POST)
	public void warning(@RequestParam(value="warning", required = true) String param) throws ThinventBaseException {
		adapterHandler.receive(param);
	}
}
