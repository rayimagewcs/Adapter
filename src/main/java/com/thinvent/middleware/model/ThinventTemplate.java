package com.thinvent.middleware.model;

import java.util.Date;

public abstract class ThinventTemplate {
	protected int id; 				// 模板id
	protected String featureData; 	// 特征数据
	protected byte[] fullImage; 			// 全景图片
	protected String createUser;	// 创建人
	protected String updateUser;	// 更新人
	protected Date createTime; 		// 创建时间
	protected Date updateTime; 		// 更新时间
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFeatureData() {
		return featureData;
	}

	public void setFeatureData(String featureData) {
		this.featureData = featureData;
	}

	public byte[] getImg() {
		return fullImage;
	}

	public void setImg(byte[] img) {
		this.fullImage = img;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
