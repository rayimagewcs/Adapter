package com.thinvent.middleware.inner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thinvent.library.config.ServiceConfig;
import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.inner.handler.IFaceRegisterHandler;
import com.thinvent.middleware.inner.handler.IVehicleRegisterHandler;
import com.thinvent.middleware.model.FaceTemplate;
import com.thinvent.middleware.model.VehicleTemplate;
import com.thinvent.middleware.outer.service.IFaceRegisterService;
import com.thinvent.middleware.outer.service.IVehicleRegisterService;
import com.thinvent.middleware.outer.service.impl.FaceRegisterServiceImpl;
import com.thinvent.middleware.outer.service.impl.VehicleRegisterServiceImpl;

@RestController
@RequestMapping(value = "/register")
public class RegisterController {
	@Autowired
	private static IFaceRegisterHandler faceHandler;

	@Autowired
	private IVehicleRegisterHandler vehicleHandler;

	private IFaceRegisterService faceRegister;

	private IVehicleRegisterService vehicleRegister;

	public RegisterController() throws Exception {
		try {
			// 根据配置加载注册人脸、车辆处理实例
			String faceClass = ServiceConfig.getServiceConfig("middleware.basic", "class.face");
			if (faceClass != null && "".equals(faceClass)) {
				faceRegister = (IFaceRegisterService) Class.forName(faceClass).newInstance();
			} else {
				faceRegister = new FaceRegisterServiceImpl();
			}

			String VehicleClass = ServiceConfig.getServiceConfig("middleware.basic", "class.Vehicle");
			if (VehicleClass != null && "".equals(VehicleClass)) {
				vehicleRegister = (IVehicleRegisterService) Class.forName(VehicleClass).newInstance();
			} else {
				vehicleRegister = new VehicleRegisterServiceImpl();
			}
		} catch (InstantiationException e) {
			throw e;
		} catch (IllegalAccessException e) {
			throw e;
		} catch (ClassNotFoundException e) {
			throw e;
		}
	}

	@RequestMapping(value = "/face", method = RequestMethod.POST)
	public void registerFace(FaceTemplate face) throws ThinventBaseException {
		String result = faceRegister.registerFaceTemplate(face);
		if (result != null && !"".equals(result)) {
			faceHandler.saveFaceTemplate(face);
		}

	}

	@RequestMapping(value = "/vehicle", method = RequestMethod.POST)
	public void registerVehicle(VehicleTemplate Vehicle) throws ThinventBaseException {
		String result = vehicleRegister.registerVehicleTemplate(Vehicle);
		if (result != null && !"".equals(result)) {
			vehicleHandler.saveVehicleTemplate(Vehicle);
		}
	}
}
