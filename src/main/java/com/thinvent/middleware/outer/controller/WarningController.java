package com.thinvent.middleware.outer.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.library.mq.entity.Message;
import com.thinvent.library.mq.entity.Source;
import com.thinvent.middleware.outer.service.IWarningService;

@RestController
@RequestMapping(value = "/warning")
public class WarningController {
	@Autowired
	private IWarningService warningHandler;
	
	@RequestMapping(value="/receive", method = RequestMethod.GET)
	public String getMessage(@RequestParam("message") String msg, HttpServletRequest request) throws ThinventBaseException {
		if(msg != null) {
			System.out.println("message: " + msg);
			// 由中间件获取ip并初始化消息，消息队列不再初始化uuid
			String ip = request.getRemoteAddr();
			Message message = new Message(msg);
			Source src = message.getSource();
			src.setIp(ip);
			warningHandler.process(message);
		}
		return "receive msg";
	}
	
	@RequestMapping(value="/receive", method = RequestMethod.POST)
	public String postMessage(@RequestBody Message message, HttpServletRequest request) throws ThinventBaseException {
		if(message != null) {
			String ip = request.getRemoteAddr();
			Source src = message.getSource();
			src.setIp(ip);
			warningHandler.process(message);
		}
		return "receive msg";
	}
}
