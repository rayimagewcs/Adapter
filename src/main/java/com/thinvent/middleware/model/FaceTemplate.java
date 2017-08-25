package com.thinvent.middleware.model;

public class FaceTemplate extends ThinventTemplate {
	private int peopleType; // 人员类型
	private int peopleId; // 人员ID
	private String peopleNum; // 人员证件号
	private float score; // 合规度
	private String featureDate; // 特征数据
	private byte[] thumbnailImage; // 缩略图
	private int templateType; // 模板类型 0.黑名单 1.白名单
	private int thirdPartyId; // 第三方对应的id
	private String thirdPartyIP; // 第三方IP

	public int getPeopleType() {
		return peopleType;
	}

	public void setPeopleType(int peopleType) {
		this.peopleType = peopleType;
	}

	public int getPeopleId() {
		return peopleId;
	}

	public void setPeopleId(int peopleId) {
		this.peopleId = peopleId;
	}

	public String getPeopleNum() {
		return peopleNum;
	}

	public void setPeopleNum(String peopleNum) {
		this.peopleNum = peopleNum;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float score) {
		this.score = score;
	}

	public String getFeatureDate() {
		return featureDate;
	}

	public void setFeatureDate(String featureDate) {
		this.featureDate = featureDate;
	}

	public byte[] getThumbnailImage() {
		return thumbnailImage;
	}

	public void setThumbnailImage(byte[] thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public int getTemplateType() {
		return templateType;
	}

	public void setTemplateType(int templateType) {
		this.templateType = templateType;
	}

	public int getThirdPartyId() {
		return thirdPartyId;
	}

	public void setThirdPartyId(int thirdPartyId) {
		this.thirdPartyId = thirdPartyId;
	}

	public String getThirdPartyIP() {
		return thirdPartyIP;
	}

	public void setThirdPartyIP(String thirdPartyIP) {
		this.thirdPartyIP = thirdPartyIP;
	}

}
