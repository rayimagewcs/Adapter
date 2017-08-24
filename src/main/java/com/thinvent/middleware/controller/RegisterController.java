package com.thinvent.middleware.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thinvent.library.config.ServiceConfig;
import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.handler.IFaceRegisterHandler;
import com.thinvent.middleware.handler.IVehicalRegisterHandler;
import com.thinvent.middleware.handler.impl.FaceRegisterHandlerImpl;
import com.thinvent.middleware.handler.impl.VehicalRegisterHandlerImpl;
import com.thinvent.middleware.model.FaceTemplate;
import com.thinvent.middleware.model.VehicalTemplate;

@RestController
@RequestMapping(value = "/register")
public class RegisterController {
private static IFaceRegisterHandler faceRegister;
	
	private IVehicalRegisterHandler vehicalRegister;
	
	public RegisterController() throws Exception {
		try {
			// 根据配置加载注册人脸、车辆处理实例
			String faceClass = ServiceConfig.getServiceConfig("middleware.basic", "class.face");
			if(faceClass != null && "".equals(faceClass)) {
				faceRegister = (IFaceRegisterHandler) Class.forName(faceClass).newInstance();
			} else {
				faceRegister = new FaceRegisterHandlerImpl();
			}
			
			String vehicalClass = ServiceConfig.getServiceConfig("middleware.basic", "class.vehical");
			if(vehicalClass != null && "".equals(vehicalClass)) {
				vehicalRegister = (IVehicalRegisterHandler) Class.forName(vehicalClass).newInstance();
			} else {
				vehicalRegister = new VehicalRegisterHandlerImpl();
			}
		} catch (InstantiationException e) {
			throw e;
		} catch (IllegalAccessException e) {
			throw e;
		} catch (ClassNotFoundException e) {
			throw e;
		}
	}
	
	@RequestMapping(value = "face", method = RequestMethod.POST)
	public void registerFace(FaceTemplate face) throws ThinventBaseException {
		faceRegister.registerFaceTemplate(face);
	}
	
	@RequestMapping(value = "vehical", method = RequestMethod.POST)
	public void registerVehical(VehicalTemplate vehical) throws ThinventBaseException {
		vehicalRegister.registerVehicalTemplate(vehical);
	}
}
