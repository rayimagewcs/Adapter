package com.thinvent.middleware.inner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.inner.handler.IWarningHandler;

@RestController
@RequestMapping(value = "/warning")
public class WarningController {
	@Autowired
	private IWarningHandler warningHandler;
	
	@RequestMapping(value="/receive", method = RequestMethod.POST)
	public void receive(@RequestParam(value="param", required = true) String param) throws ThinventBaseException {
		warningHandler.process(param);
	}
}
