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

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class PushRequest extends RpcAcsRequest<PushResponse> {
	
	public PushRequest() {
		super("Push", "2016-08-01", "Push");
	}

	private Long appKey;

	private String target;

	private String targetValue;

	private String pushType;

	private String deviceType;

	private String title;

	private String body;

	private String jobKey;

	private String pushTime;

	private String expireTime;

	private Boolean storeOffline;

	private String batchNumber;

	private String androidNotifyType;

	private String androidOpenType;

	private String androidActivity;

	private String androidOpenUrl;

	private String androidXiaoMiActivity;

	private String androidXiaoMiNotifyTitle;

	private String androidXiaoMiNotifyBody;

	private String androidPopupActivity;

	private String androidPopupTitle;

	private String androidPopupBody;

	private String androidMusic;

	private Boolean androidRemind;

	private Integer androidNotificationBarType;

	private Integer androidNotificationBarPriority;

	private String androidExtParameters;

	private String iOSApnsEnv;

	private Boolean iOSRemind;

	private String iOSRemindBody;

	private String iOSMusic;

	private Integer iOSBadge;

	private Boolean iOSSilentNotification;

	private String iOSSubtitle;

	private String iOSNotificationCategory;

	private Boolean iOSMutableContent;

	private String iOSExtParameters;

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

	public String getPushType() {
		return this.pushType;
	}

	public void setPushType(String pushType) {
		this.pushType = pushType;
		putQueryParameter("PushType", pushType);
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
		putQueryParameter("DeviceType", deviceType);
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		putQueryParameter("Title", title);
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		putQueryParameter("Body", body);
	}

	public String getJobKey() {
		return jobKey;
	}

	public void setJobKey(String jobKey) {
		this.jobKey = jobKey;
		putQueryParameter("JobKey", jobKey);
	}

	public String getPushTime() {
		return this.pushTime;
	}

	public void setPushTime(String pushTime) {
		this.pushTime = pushTime;
		putQueryParameter("PushTime", pushTime);
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
		putQueryParameter("ExpireTime", expireTime);
	}

	public Boolean getStoreOffline() {
		return this.storeOffline;
	}

	public void setStoreOffline(Boolean storeOffline) {
		this.storeOffline = storeOffline;
		putQueryParameter("StoreOffline", storeOffline);
	}

	public String getBatchNumber() {
		return this.batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
		putQueryParameter("BatchNumber", batchNumber);
	}

	public String getAndroidNotifyType() {
		return this.androidNotifyType;
	}

	public void setAndroidNotifyType(String androidNotifyType) {
		this.androidNotifyType = androidNotifyType;
		putQueryParameter("AndroidNotifyType", androidNotifyType);
	}

	public String getAndroidOpenType() {
		return this.androidOpenType;
	}

	public void setAndroidOpenType(String androidOpenType) {
		this.androidOpenType = androidOpenType;
		putQueryParameter("AndroidOpenType", androidOpenType);
	}

	public String getAndroidActivity() {
		return this.androidActivity;
	}

	public void setAndroidActivity(String androidActivity) {
		this.androidActivity = androidActivity;
		putQueryParameter("AndroidActivity", androidActivity);
	}

	public String getAndroidOpenUrl() {
		return this.androidOpenUrl;
	}

	public void setAndroidOpenUrl(String androidOpenUrl) {
		this.androidOpenUrl = androidOpenUrl;
		putQueryParameter("AndroidOpenUrl", androidOpenUrl);
	}

	public String getAndroidXiaoMiActivity() {
		return this.androidXiaoMiActivity;
	}

	public void setAndroidXiaoMiActivity(String androidXiaoMiActivity) {
		this.androidXiaoMiActivity = androidXiaoMiActivity;
		putQueryParameter("AndroidXiaoMiActivity", androidXiaoMiActivity);
	}

	public String getAndroidXiaoMiNotifyTitle() {
		return this.androidXiaoMiNotifyTitle;
	}

	public void setAndroidXiaoMiNotifyTitle(String androidXiaoMiNotifyTitle) {
		this.androidXiaoMiNotifyTitle = androidXiaoMiNotifyTitle;
		putQueryParameter("AndroidXiaoMiNotifyTitle", androidXiaoMiNotifyTitle);
	}

	public String getAndroidXiaoMiNotifyBody() {
		return this.androidXiaoMiNotifyBody;
	}

	public void setAndroidXiaoMiNotifyBody(String androidXiaoMiNotifyBody) {
		this.androidXiaoMiNotifyBody = androidXiaoMiNotifyBody;
		putQueryParameter("AndroidXiaoMiNotifyBody", androidXiaoMiNotifyBody);
	}

	public String getAndroidPopupActivity() {
		return this.androidPopupActivity;
	}

	public void setAndroidPopupActivity(String androidPopupActivity) {
		this.androidPopupActivity = androidPopupActivity;
		putQueryParameter("AndroidPopupActivity", androidPopupActivity);
	}

	public String getAndroidPopupTitle() {
		return this.androidPopupTitle;
	}

	public void setAndroidPopupTitle(String androidPopupTitle) {
		this.androidPopupTitle = androidPopupTitle;
		putQueryParameter("AndroidPopupTitle", androidPopupTitle);
	}

	public String getAndroidPopupBody() {
		return this.androidPopupBody;
	}

	public void setAndroidPopupBody(String androidPopupBody) {
		this.androidPopupBody = androidPopupBody;
		putQueryParameter("AndroidPopupBody", androidPopupBody);
	}

	public String getAndroidMusic() {
		return this.androidMusic;
	}

	public void setAndroidMusic(String androidMusic) {
		this.androidMusic = androidMusic;
		putQueryParameter("AndroidMusic", androidMusic);
	}

	public Integer getAndroidNotificationBarType() {
		return this.androidNotificationBarType;
	}

	public void setAndroidNotificationBarType(Integer androidNotificationBarType) {
		this.androidNotificationBarType = androidNotificationBarType;
		putQueryParameter("AndroidNotificationBarType", androidNotificationBarType);
	}

	public Integer getAndroidNotificationBarPriority() {
		return this.androidNotificationBarPriority;
	}

	public void setAndroidNotificationBarPriority(Integer androidNotificationBarPriority) {
		this.androidNotificationBarPriority = androidNotificationBarPriority;
		putQueryParameter("AndroidNotificationBarPriority", androidNotificationBarPriority);
	}

	public String getAndroidExtParameters() {
		return this.androidExtParameters;
	}

	public void setAndroidExtParameters(String androidExtParameters) {
		this.androidExtParameters = androidExtParameters;
		putQueryParameter("AndroidExtParameters", androidExtParameters);
	}

	public Boolean getAndroidRemind() {
		return androidRemind;
	}

	public void setAndroidRemind(Boolean androidRemind) {
		this.androidRemind = androidRemind;
		putQueryParameter("AndroidRemind", androidRemind);
	}

	public String getiOSApnsEnv() {
		return this.iOSApnsEnv;
	}

	public void setiOSApnsEnv(String iOSApnsEnv) {
		this.iOSApnsEnv = iOSApnsEnv;
		putQueryParameter("iOSApnsEnv", iOSApnsEnv);
	}

	public Boolean getiOSRemind() {
		return this.iOSRemind;
	}

	public void setiOSRemind(Boolean iOSRemind) {
		this.iOSRemind = iOSRemind;
		putQueryParameter("iOSRemind", iOSRemind);
	}

	public String getiOSRemindBody() {
		return this.iOSRemindBody;
	}

	public void setiOSRemindBody(String iOSRemindBody) {
		this.iOSRemindBody = iOSRemindBody;
		putQueryParameter("iOSRemindBody", iOSRemindBody);
	}

	public String getiOSMusic() {
		return this.iOSMusic;
	}

	public void setiOSMusic(String iOSMusic) {
		this.iOSMusic = iOSMusic;
		putQueryParameter("iOSMusic", iOSMusic);
	}

	public Integer getiOSBadge() {
		return this.iOSBadge;
	}

	public void setiOSBadge(Integer iOSBadge) {
		this.iOSBadge = iOSBadge;
		putQueryParameter("iOSBadge", iOSBadge);
	}

	public Boolean getiOSSilentNotification() {
		return this.iOSSilentNotification;
	}

	public void setiOSSilentNotification(Boolean iOSSilentNotification) {
		this.iOSSilentNotification = iOSSilentNotification;
		putQueryParameter("iOSSilentNotification", iOSSilentNotification);
	}

	public String getiOSSubtitle() {
		return this.iOSSubtitle;
	}

	public void setiOSSubtitle(String iOSSubtitle) {
		this.iOSSubtitle = iOSSubtitle;
		putQueryParameter("iOSSubtitle", iOSSubtitle);
	}

	public String getiOSNotificationCategory() {
		return this.iOSNotificationCategory;
	}

	public void setiOSNotificationCategory(String iOSNotificationCategory) {
		this.iOSNotificationCategory = iOSNotificationCategory;
		putQueryParameter("iOSNotificationCategory", iOSNotificationCategory);
	}

	public Boolean getiOSMutableContent() {
		return this.iOSMutableContent;
	}

	public void setiOSMutableContent(Boolean iOSMutableContent) {
		this.iOSMutableContent = iOSMutableContent;
		putQueryParameter("iOSMutableContent", iOSMutableContent);
	}

	public String getiOSExtParameters() {
		return this.iOSExtParameters;
	}

	public void setiOSExtParameters(String iOSExtParameters) {
		this.iOSExtParameters = iOSExtParameters;
		putQueryParameter("iOSExtParameters", iOSExtParameters);
	}

	@Override
	public Class<PushResponse> getResponseClass() {
		return PushResponse.class;
	}

}
