package com.thinvent.middleware.inner.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.thinvent.library.exception.ThinventBaseException;
import com.thinvent.middleware.inner.handler.IFaceRegisterHandler;
import com.thinvent.middleware.inner.handler.IVehicleRegisterHandler;
import com.thinvent.middleware.model.FaceTemplate;
import com.thinvent.middleware.model.VehicleTemplate;

@RestController
@RequestMapping(value = "/register")
public class RegisterController {

	@Autowired
	private IVehicleRegisterHandler vehicleHandler;

	@Autowired
	private IFaceRegisterHandler faceHandler;

	@RequestMapping(value = "/face", method = RequestMethod.POST)
	public void registerFace(FaceTemplate face) throws ThinventBaseException {
		faceHandler.saveFaceTemplate(face);
	}

	@RequestMapping(value = "/vehicle", method = RequestMethod.POST)
	public void registerVehicle(VehicleTemplate Vehicle) throws ThinventBaseException {
		vehicleHandler.saveVehicleTemplate(Vehicle);
	}
}
