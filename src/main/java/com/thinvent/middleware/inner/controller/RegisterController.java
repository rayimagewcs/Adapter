package com.thinvent.middleware.inner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.inner.handler.IFaceRegisterHandler;

@RestController
@RequestMapping(value = "/register")
public class RegisterController {

	@Autowired
	private IFaceRegisterHandler faceHandler;
	
	@RequestMapping(value = "/registerFace", method = RequestMethod.POST)
	public String registerFace1(String json) throws ThinventBaseException {
		return faceHandler.registerFaceTemplate(json);
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String registerFace(String json) throws ThinventBaseException {
		return faceHandler.register(json);
	}
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)
	public String register(@RequestParam("json") String json) throws ThinventBaseException {
		return faceHandler.register(json);
	}
}
