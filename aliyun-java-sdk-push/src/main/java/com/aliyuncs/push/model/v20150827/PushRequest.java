/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.push.model.v20150827;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PushRequest extends RpcAcsRequest<PushResponse> {
	
	public PushRequest() {
		super("Push", "2015-08-27", "Push");
	}

	private Long appKey;

	private String target;

	private String targetValue;

	private Integer type;

	private String title;

	private Boolean remind;

	private Boolean storeOffline;

	private String body;

	private Integer deviceType;

	private Integer timeOut;

	private String summary;

	private String androidActivity;

	private String xiaomiActivity;

	private String androidOpenUrl;

	private String androidExtParameters;

	private String androidOpenType;

	private String androidMusic;

	private String batchNumber;

	private String iOSMusic;

	private String iOSBadge;

	private String iOSExtParameters;

	private String pushTime;

	private String apnsEnv;

	private String expireTime;

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		putQueryParameter("AppKey", appKey);
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
		putQueryParameter("Target", target);
	}

	public String getTargetValue() {
		return this.targetValue;
	}

	public void setTargetValue(String targetValue) {
		this.targetValue = targetValue;
		putQueryParameter("TargetValue", targetValue);
	}

	public Integer getType() {
		return this.type;
	}

	public void setType(Integer type) {
		this.type = type;
		putQueryParameter("Type", type);
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		putQueryParameter("Title", title);
	}

	public Boolean getRemind() {
		return this.remind;
	}

	public void setRemind(Boolean remind) {
		this.remind = remind;
		putQueryParameter("Remind", remind);
	}

	public Boolean getStoreOffline() {
		return this.storeOffline;
	}

	public void setStoreOffline(Boolean storeOffline) {
		this.storeOffline = storeOffline;
		putQueryParameter("StoreOffline", storeOffline);
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		putQueryParameter("Body", body);
	}

	public Integer getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(Integer deviceType) {
		this.deviceType = deviceType;
		putQueryParameter("DeviceType", deviceType);
	}

	public Integer getTimeOut() {
		return this.timeOut;
	}

	public void setTimeOut(Integer timeOut) {
		this.timeOut = timeOut;
		putQueryParameter("TimeOut", timeOut);
	}

	public String getSummary() {
		return this.summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
		putQueryParameter("Summary", summary);
	}

	public String getAndroidActivity() {
		return this.androidActivity;
	}

	public void setAndroidActivity(String androidActivity) {
		this.androidActivity = androidActivity;
		putQueryParameter("AndroidActivity", androidActivity);
	}

	public String getXiaomiActivity() {
		return this.xiaomiActivity;
	}

	public void setXiaomiActivity(String xiaomiActivity) {
		this.xiaomiActivity = xiaomiActivity;
		putQueryParameter("XiaomiActivity", xiaomiActivity);
	}

	public String getAndroidOpenUrl() {
		return this.androidOpenUrl;
	}

	public void setAndroidOpenUrl(String androidOpenUrl) {
		this.androidOpenUrl = androidOpenUrl;
		putQueryParameter("AndroidOpenUrl", androidOpenUrl);
	}

	public String getAndroidExtParameters() {
		return this.androidExtParameters;
	}

	public void setAndroidExtParameters(String androidExtParameters) {
		this.androidExtParameters = androidExtParameters;
		putQueryParameter("AndroidExtParameters", androidExtParameters);
	}

	public String getAndroidOpenType() {
		return this.androidOpenType;
	}

	public void setAndroidOpenType(String androidOpenType) {
		this.androidOpenType = androidOpenType;
		putQueryParameter("AndroidOpenType", androidOpenType);
	}

	public String getAndroidMusic() {
		return this.androidMusic;
	}

	public void setAndroidMusic(String androidMusic) {
		this.androidMusic = androidMusic;
		putQueryParameter("AndroidMusic", androidMusic);
	}

	public String getBatchNumber() {
		return this.batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
		putQueryParameter("BatchNumber", batchNumber);
	}

	public String getiOSMusic() {
		return this.iOSMusic;
	}

	public void setiOSMusic(String iOSMusic) {
		this.iOSMusic = iOSMusic;
		putQueryParameter("iOSMusic", iOSMusic);
	}

	public String getiOSBadge() {
		return this.iOSBadge;
	}

	public void setiOSBadge(String iOSBadge) {
		this.iOSBadge = iOSBadge;
		putQueryParameter("iOSBadge", iOSBadge);
	}

	public String getiOSExtParameters() {
		return this.iOSExtParameters;
	}

	public void setiOSExtParameters(String iOSExtParameters) {
		this.iOSExtParameters = iOSExtParameters;
		putQueryParameter("iOSExtParameters", iOSExtParameters);
	}

	public String getPushTime() {
		return this.pushTime;
	}

	public void setPushTime(String pushTime) {
		this.pushTime = pushTime;
		putQueryParameter("PushTime", pushTime);
	}

	public String getApnsEnv() {
		return this.apnsEnv;
	}

	public void setApnsEnv(String apnsEnv) {
		this.apnsEnv = apnsEnv;
		putQueryParameter("ApnsEnv", apnsEnv);
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
		putQueryParameter("ExpireTime", expireTime);
	}

	@Override
	public Class<PushResponse> getResponseClass() {
		return PushResponse.class;
	}

}
