package com.thinvent.middleware.model;

import java.util.Date;

public class VehicleTemplate extends ThinventTemplate {
	// private Equipment points; // 识别点
	// private Integer templateFlg = 0; // 是否已经注册模板
	// private Integer pass = 1; // 0表示进入，1表示出去
	//
	// private Integer temporaryFlg; // 是否临时车辆 0：否 1：是
	// private String name; // 拥有者姓名
	// private Integer peopleType = 0; // 人员类型
	//
	// private Integer vehicalTmplateId; // 车辆模板id
	// private Integer templateType; // 模板类型

	private String vehicleCode;// 车牌号
	private Integer direction;// 车辆行进方向 0表示进入，1表示出去
	private Long detectionTime;// 检测时间
	private byte[] image; // 检测图片
	private String vehicleModel; // 型号
	private String featureData; // 特征数据
	private String remark; // 备注
	private Date recognizeTime; // 识别时间
	private String warningTitle;// 报警标题
	private String from; // 告警来源
	private String info; // 告警内容
	private int type; // 告警类型 0：周边报警 1：人员报警 2：行为报警 3：车辆报警
	private Integer illegalFlg = 0; // 0不违规,1表示迟到，2，表示早退

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	public Integer getIllegalFlg() {
		return illegalFlg;
	}

	public void setIllegalFlg(Integer illegalFlg) {
		this.illegalFlg = illegalFlg;
	}

	public String getFeatureData() {
		return featureData;
	}

	public void setFeatureData(String featureData) {
		this.featureData = featureData;
	}

	public String getVehicleCode() {
		return vehicleCode;
	}

	public void setVehicleCode(String vehicleCode) {
		this.vehicleCode = vehicleCode;
	}

	public Integer getDirection() {
		return direction;
	}

	public void setDirection(Integer direction) {
		this.direction = direction;
	}

	public Long getDetectionTime() {
		return detectionTime;
	}

	public void setDetectionTime(Long detectionTime) {
		this.detectionTime = detectionTime;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Date getRecognizeTime() {
		return recognizeTime;
	}

	public void setRecognizeTime(Date recognizeTime) {
		this.recognizeTime = recognizeTime;
	}

	public String getWarningTitle() {
		return warningTitle;
	}

	public void setWarningTitle(String warningTitle) {
		this.warningTitle = warningTitle;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

}
