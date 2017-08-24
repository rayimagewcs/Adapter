package com.thinvent.middleware.model;

public class FaceTemplate extends ThinventTemplate {
	private int peopleType;					//人员类型
	private int peopleId;					//人员ID
	private String peopleNum;				//人员证件号
	private float score;					//合规度
	private String featureDate;				//特征数据
	private byte[] thumbnailImage;			//缩略图
	private int templateType;				//模板类型    0.黑名单   1.白名单
	private int thirdPartyId;				//第三方对应的id
	private String thirdPartyIP;			//第三方IP
	
	
}
