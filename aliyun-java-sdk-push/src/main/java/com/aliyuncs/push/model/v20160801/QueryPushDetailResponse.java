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
package com.aliyuncs.push.model.v20160801;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.push.transform.v20160801.QueryPushDetailResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryPushDetailResponse extends AcsResponse {

	private String requestId;

	private Long appKey;

	private String target;

	private String targetValue;

	private String pushType;

	private String deviceType;

	private String title;

	private String body;

	private String pushTime;

	private String expireTime;

	private Integer antiHarassStartTime;

	private Integer antiHarassDuration;

	private Boolean storeOffline;

	private String batchNumber;

	private String provinceId;

	private String iOSApnsEnv;

	private Boolean iOSRemind;

	private String iOSRemindBody;

	private Integer iOSBadge;

	private String iOSMusic;

	private String iOSSubtitle;

	private String iOSNotificationCategory;

	private Boolean iOSMutableContent;

	private String iOSExtParameters;

	private String androidNotifyType;

	private String androidOpenType;

	private String androidActivity;

	private String androidMusic;

	private String androidOpenUrl;

	private String androidXiaoMiActivity;

	private String androidXiaoMiNotifyTitle;

	private String androidXiaoMiNotifyBody;

	private Integer androidNotificationBarType;

	private Integer androidNotificationBarPriority;

	private String androidExtParameters;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getTargetValue() {
		return this.targetValue;
	}

	public void setTargetValue(String targetValue) {
		this.targetValue = targetValue;
	}

	public String getPushType() {
		return this.pushType;
	}

	public void setPushType(String pushType) {
		this.pushType = pushType;
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getPushTime() {
		return this.pushTime;
	}

	public void setPushTime(String pushTime) {
		this.pushTime = pushTime;
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
	}

	public Integer getAntiHarassStartTime() {
		return this.antiHarassStartTime;
	}

	public void setAntiHarassStartTime(Integer antiHarassStartTime) {
		this.antiHarassStartTime = antiHarassStartTime;
	}

	public Integer getAntiHarassDuration() {
		return this.antiHarassDuration;
	}

	public void setAntiHarassDuration(Integer antiHarassDuration) {
		this.antiHarassDuration = antiHarassDuration;
	}

	public Boolean getStoreOffline() {
		return this.storeOffline;
	}

	public void setStoreOffline(Boolean storeOffline) {
		this.storeOffline = storeOffline;
	}

	public String getBatchNumber() {
		return this.batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public String getProvinceId() {
		return this.provinceId;
	}

	public void setProvinceId(String provinceId) {
		this.provinceId = provinceId;
	}

	public String getiOSApnsEnv() {
		return this.iOSApnsEnv;
	}

	public void setiOSApnsEnv(String iOSApnsEnv) {
		this.iOSApnsEnv = iOSApnsEnv;
	}

	public Boolean getiOSRemind() {
		return this.iOSRemind;
	}

	public void setiOSRemind(Boolean iOSRemind) {
		this.iOSRemind = iOSRemind;
	}

	public String getiOSRemindBody() {
		return this.iOSRemindBody;
	}

	public void setiOSRemindBody(String iOSRemindBody) {
		this.iOSRemindBody = iOSRemindBody;
	}

	public Integer getiOSBadge() {
		return this.iOSBadge;
	}

	public void setiOSBadge(Integer iOSBadge) {
		this.iOSBadge = iOSBadge;
	}

	public String getiOSMusic() {
		return this.iOSMusic;
	}

	public void setiOSMusic(String iOSMusic) {
		this.iOSMusic = iOSMusic;
	}

	public String getiOSSubtitle() {
		return this.iOSSubtitle;
	}

	public void setiOSSubtitle(String iOSSubtitle) {
		this.iOSSubtitle = iOSSubtitle;
	}

	public String getiOSNotificationCategory() {
		return this.iOSNotificationCategory;
	}

	public void setiOSNotificationCategory(String iOSNotificationCategory) {
		this.iOSNotificationCategory = iOSNotificationCategory;
	}

	public Boolean getiOSMutableContent() {
		return this.iOSMutableContent;
	}

	public void setiOSMutableContent(Boolean iOSMutableContent) {
		this.iOSMutableContent = iOSMutableContent;
	}

	public String getiOSExtParameters() {
		return this.iOSExtParameters;
	}

	public void setiOSExtParameters(String iOSExtParameters) {
		this.iOSExtParameters = iOSExtParameters;
	}

	public String getAndroidNotifyType() {
		return this.androidNotifyType;
	}

	public void setAndroidNotifyType(String androidNotifyType) {
		this.androidNotifyType = androidNotifyType;
	}

	public String getAndroidOpenType() {
		return this.androidOpenType;
	}

	public void setAndroidOpenType(String androidOpenType) {
		this.androidOpenType = androidOpenType;
	}

	public String getAndroidActivity() {
		return this.androidActivity;
	}

	public void setAndroidActivity(String androidActivity) {
		this.androidActivity = androidActivity;
	}

	public String getAndroidMusic() {
		return this.androidMusic;
	}

	public void setAndroidMusic(String androidMusic) {
		this.androidMusic = androidMusic;
	}

	public String getAndroidOpenUrl() {
		return this.androidOpenUrl;
	}

	public void setAndroidOpenUrl(String androidOpenUrl) {
		this.androidOpenUrl = androidOpenUrl;
	}

	public String getAndroidXiaoMiActivity() {
		return this.androidXiaoMiActivity;
	}

	public void setAndroidXiaoMiActivity(String androidXiaoMiActivity) {
		this.androidXiaoMiActivity = androidXiaoMiActivity;
	}

	public String getAndroidXiaoMiNotifyTitle() {
		return this.androidXiaoMiNotifyTitle;
	}

	public void setAndroidXiaoMiNotifyTitle(String androidXiaoMiNotifyTitle) {
		this.androidXiaoMiNotifyTitle = androidXiaoMiNotifyTitle;
	}

	public String getAndroidXiaoMiNotifyBody() {
		return this.androidXiaoMiNotifyBody;
	}

	public void setAndroidXiaoMiNotifyBody(String androidXiaoMiNotifyBody) {
		this.androidXiaoMiNotifyBody = androidXiaoMiNotifyBody;
	}

	public Integer getAndroidNotificationBarType() {
		return this.androidNotificationBarType;
	}

	public void setAndroidNotificationBarType(Integer androidNotificationBarType) {
		this.androidNotificationBarType = androidNotificationBarType;
	}

	public Integer getAndroidNotificationBarPriority() {
		return this.androidNotificationBarPriority;
	}

	public void setAndroidNotificationBarPriority(Integer androidNotificationBarPriority) {
		this.androidNotificationBarPriority = androidNotificationBarPriority;
	}

	public String getAndroidExtParameters() {
		return this.androidExtParameters;
	}

	public void setAndroidExtParameters(String androidExtParameters) {
		this.androidExtParameters = androidExtParameters;
	}

	@Override
	public QueryPushDetailResponse getInstance(UnmarshallerContext context) {
		return	QueryPushDetailResponseUnmarshaller.unmarshall(this, context);
	}
}
