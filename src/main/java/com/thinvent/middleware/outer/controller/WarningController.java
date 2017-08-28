package com.thinvent.middleware.outer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.library.mq.entity.Message;
import com.thinvent.middleware.outer.service.IWarningService;

@RestController
@RequestMapping(value = "/warning")
public class WarningController {
	@Autowired
	private IWarningService warningHandler;
	
	@RequestMapping(value="/receive", method = RequestMethod.POST)
	public void receive(@RequestParam(value="param", required = true) String param,
			HttpServletRequest request) throws ThinventBaseException {
		String ip = request.getRemoteAddr();
		Message message = new Message(param);
		message.setSourceIp(ip);
		warningHandler.process(message);
	}
}
