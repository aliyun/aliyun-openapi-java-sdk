/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.push.model.v20160801;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.push.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class PushRequest extends RpcAcsRequest<PushResponse> {
	   

	private Integer androidNotificationBarType;

	private Integer smsSendPolicy;

	private String body;

	private String deviceType;

	private String pushTime;

	private Integer sendSpeed;

	private String androidPopupActivity;

	private String iOSRemindBody;

	private String androidNotifyType;

	private String androidPopupTitle;

	private String iOSMusic;

	private String iOSApnsEnv;

	private Boolean iOSMutableContent;

	private Integer androidNotificationBarPriority;

	private String expireTime;

	private String iOSNotificationCategory;

	private String androidNotificationXiaomiChannel;

	private Boolean storeOffline;

	private String smsParams;

	private String jobKey;

	private String androidOpenUrl;

	private String androidXiaoMiNotifyBody;

	private String iOSSubtitle;

	private Boolean iOSRemind;

	private String androidMusic;

	private String pushType;

	private String androidExtParameters;

	private Integer iOSBadge;

	private Boolean iOSBadgeAutoIncrement;

	private String androidOpenType;

	private String title;

	private Integer smsDelaySecs;

	private String iOSExtParameters;

	private String smsTemplateName;

	private String androidPopupBody;

	private Boolean iOSSilentNotification;

	private String target;

	private String androidNotificationChannel;

	private Boolean androidRemind;

	private String androidActivity;

	private String smsSignName;

	private Long appKey;

	private String targetValue;

	private String androidXiaoMiActivity;

	private String androidXiaoMiNotifyTitle;
	public PushRequest() {
		super("Push", "2016-08-01", "Push");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getAndroidNotificationBarType() {
		return this.androidNotificationBarType;
	}

	public void setAndroidNotificationBarType(Integer androidNotificationBarType) {
		this.androidNotificationBarType = androidNotificationBarType;
		if(androidNotificationBarType != null){
			putQueryParameter("AndroidNotificationBarType", androidNotificationBarType.toString());
		}
	}

	public Integer getSmsSendPolicy() {
		return this.smsSendPolicy;
	}

	public void setSmsSendPolicy(Integer smsSendPolicy) {
		this.smsSendPolicy = smsSendPolicy;
		if(smsSendPolicy != null){
			putQueryParameter("SmsSendPolicy", smsSendPolicy.toString());
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putQueryParameter("Body", body);
		}
	}

	public String getDeviceType() {
		return this.deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
		if(deviceType != null){
			putQueryParameter("DeviceType", deviceType);
		}
	}

	public String getPushTime() {
		return this.pushTime;
	}

	public void setPushTime(String pushTime) {
		this.pushTime = pushTime;
		if(pushTime != null){
			putQueryParameter("PushTime", pushTime);
		}
	}

	public Integer getSendSpeed() {
		return this.sendSpeed;
	}

	public void setSendSpeed(Integer sendSpeed) {
		this.sendSpeed = sendSpeed;
		if(sendSpeed != null){
			putQueryParameter("SendSpeed", sendSpeed.toString());
		}
	}

	public String getAndroidPopupActivity() {
		return this.androidPopupActivity;
	}

	public void setAndroidPopupActivity(String androidPopupActivity) {
		this.androidPopupActivity = androidPopupActivity;
		if(androidPopupActivity != null){
			putQueryParameter("AndroidPopupActivity", androidPopupActivity);
		}
	}

	public String getIOSRemindBody() {
		return this.iOSRemindBody;
	}

	public void setIOSRemindBody(String iOSRemindBody) {
		this.iOSRemindBody = iOSRemindBody;
		if(iOSRemindBody != null){
			putQueryParameter("iOSRemindBody", iOSRemindBody);
		}
	}

	public String getAndroidNotifyType() {
		return this.androidNotifyType;
	}

	public void setAndroidNotifyType(String androidNotifyType) {
		this.androidNotifyType = androidNotifyType;
		if(androidNotifyType != null){
			putQueryParameter("AndroidNotifyType", androidNotifyType);
		}
	}

	public String getAndroidPopupTitle() {
		return this.androidPopupTitle;
	}

	public void setAndroidPopupTitle(String androidPopupTitle) {
		this.androidPopupTitle = androidPopupTitle;
		if(androidPopupTitle != null){
			putQueryParameter("AndroidPopupTitle", androidPopupTitle);
		}
	}

	public String getIOSMusic() {
		return this.iOSMusic;
	}

	public void setIOSMusic(String iOSMusic) {
		this.iOSMusic = iOSMusic;
		if(iOSMusic != null){
			putQueryParameter("iOSMusic", iOSMusic);
		}
	}

	public String getIOSApnsEnv() {
		return this.iOSApnsEnv;
	}

	public void setIOSApnsEnv(String iOSApnsEnv) {
		this.iOSApnsEnv = iOSApnsEnv;
		if(iOSApnsEnv != null){
			putQueryParameter("iOSApnsEnv", iOSApnsEnv);
		}
	}

	public Boolean getIOSMutableContent() {
		return this.iOSMutableContent;
	}

	public void setIOSMutableContent(Boolean iOSMutableContent) {
		this.iOSMutableContent = iOSMutableContent;
		if(iOSMutableContent != null){
			putQueryParameter("iOSMutableContent", iOSMutableContent.toString());
		}
	}

	public Integer getAndroidNotificationBarPriority() {
		return this.androidNotificationBarPriority;
	}

	public void setAndroidNotificationBarPriority(Integer androidNotificationBarPriority) {
		this.androidNotificationBarPriority = androidNotificationBarPriority;
		if(androidNotificationBarPriority != null){
			putQueryParameter("AndroidNotificationBarPriority", androidNotificationBarPriority.toString());
		}
	}

	public String getExpireTime() {
		return this.expireTime;
	}

	public void setExpireTime(String expireTime) {
		this.expireTime = expireTime;
		if(expireTime != null){
			putQueryParameter("ExpireTime", expireTime);
		}
	}

	public String getIOSNotificationCategory() {
		return this.iOSNotificationCategory;
	}

	public void setIOSNotificationCategory(String iOSNotificationCategory) {
		this.iOSNotificationCategory = iOSNotificationCategory;
		if(iOSNotificationCategory != null){
			putQueryParameter("iOSNotificationCategory", iOSNotificationCategory);
		}
	}

	public String getAndroidNotificationXiaomiChannel() {
		return this.androidNotificationXiaomiChannel;
	}

	public void setAndroidNotificationXiaomiChannel(String androidNotificationXiaomiChannel) {
		this.androidNotificationXiaomiChannel = androidNotificationXiaomiChannel;
		if(androidNotificationXiaomiChannel != null){
			putQueryParameter("AndroidNotificationXiaomiChannel", androidNotificationXiaomiChannel);
		}
	}

	public Boolean getStoreOffline() {
		return this.storeOffline;
	}

	public void setStoreOffline(Boolean storeOffline) {
		this.storeOffline = storeOffline;
		if(storeOffline != null){
			putQueryParameter("StoreOffline", storeOffline.toString());
		}
	}

	public String getSmsParams() {
		return this.smsParams;
	}

	public void setSmsParams(String smsParams) {
		this.smsParams = smsParams;
		if(smsParams != null){
			putQueryParameter("SmsParams", smsParams);
		}
	}

	public String getJobKey() {
		return this.jobKey;
	}

	public void setJobKey(String jobKey) {
		this.jobKey = jobKey;
		if(jobKey != null){
			putQueryParameter("JobKey", jobKey);
		}
	}

	public String getAndroidOpenUrl() {
		return this.androidOpenUrl;
	}

	public void setAndroidOpenUrl(String androidOpenUrl) {
		this.androidOpenUrl = androidOpenUrl;
		if(androidOpenUrl != null){
			putQueryParameter("AndroidOpenUrl", androidOpenUrl);
		}
	}

	public String getAndroidXiaoMiNotifyBody() {
		return this.androidXiaoMiNotifyBody;
	}

	public void setAndroidXiaoMiNotifyBody(String androidXiaoMiNotifyBody) {
		this.androidXiaoMiNotifyBody = androidXiaoMiNotifyBody;
		if(androidXiaoMiNotifyBody != null){
			putQueryParameter("AndroidXiaoMiNotifyBody", androidXiaoMiNotifyBody);
		}
	}

	public String getIOSSubtitle() {
		return this.iOSSubtitle;
	}

	public void setIOSSubtitle(String iOSSubtitle) {
		this.iOSSubtitle = iOSSubtitle;
		if(iOSSubtitle != null){
			putQueryParameter("iOSSubtitle", iOSSubtitle);
		}
	}

	public Boolean getIOSRemind() {
		return this.iOSRemind;
	}

	public void setIOSRemind(Boolean iOSRemind) {
		this.iOSRemind = iOSRemind;
		if(iOSRemind != null){
			putQueryParameter("iOSRemind", iOSRemind.toString());
		}
	}

	public String getAndroidMusic() {
		return this.androidMusic;
	}

	public void setAndroidMusic(String androidMusic) {
		this.androidMusic = androidMusic;
		if(androidMusic != null){
			putQueryParameter("AndroidMusic", androidMusic);
		}
	}

	public String getPushType() {
		return this.pushType;
	}

	public void setPushType(String pushType) {
		this.pushType = pushType;
		if(pushType != null){
			putQueryParameter("PushType", pushType);
		}
	}

	public String getAndroidExtParameters() {
		return this.androidExtParameters;
	}

	public void setAndroidExtParameters(String androidExtParameters) {
		this.androidExtParameters = androidExtParameters;
		if(androidExtParameters != null){
			putQueryParameter("AndroidExtParameters", androidExtParameters);
		}
	}

	public Integer getIOSBadge() {
		return this.iOSBadge;
	}

	public void setIOSBadge(Integer iOSBadge) {
		this.iOSBadge = iOSBadge;
		if(iOSBadge != null){
			putQueryParameter("iOSBadge", iOSBadge.toString());
		}
	}

	public Boolean getIOSBadgeAutoIncrement() {
		return this.iOSBadgeAutoIncrement;
	}

	public void setIOSBadgeAutoIncrement(Boolean iOSBadgeAutoIncrement) {
		this.iOSBadgeAutoIncrement = iOSBadgeAutoIncrement;
		if(iOSBadgeAutoIncrement != null){
			putQueryParameter("iOSBadgeAutoIncrement", iOSBadgeAutoIncrement.toString());
		}
	}

	public String getAndroidOpenType() {
		return this.androidOpenType;
	}

	public void setAndroidOpenType(String androidOpenType) {
		this.androidOpenType = androidOpenType;
		if(androidOpenType != null){
			putQueryParameter("AndroidOpenType", androidOpenType);
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	public Integer getSmsDelaySecs() {
		return this.smsDelaySecs;
	}

	public void setSmsDelaySecs(Integer smsDelaySecs) {
		this.smsDelaySecs = smsDelaySecs;
		if(smsDelaySecs != null){
			putQueryParameter("SmsDelaySecs", smsDelaySecs.toString());
		}
	}

	public String getIOSExtParameters() {
		return this.iOSExtParameters;
	}

	public void setIOSExtParameters(String iOSExtParameters) {
		this.iOSExtParameters = iOSExtParameters;
		if(iOSExtParameters != null){
			putQueryParameter("iOSExtParameters", iOSExtParameters);
		}
	}

	public String getSmsTemplateName() {
		return this.smsTemplateName;
	}

	public void setSmsTemplateName(String smsTemplateName) {
		this.smsTemplateName = smsTemplateName;
		if(smsTemplateName != null){
			putQueryParameter("SmsTemplateName", smsTemplateName);
		}
	}

	public String getAndroidPopupBody() {
		return this.androidPopupBody;
	}

	public void setAndroidPopupBody(String androidPopupBody) {
		this.androidPopupBody = androidPopupBody;
		if(androidPopupBody != null){
			putQueryParameter("AndroidPopupBody", androidPopupBody);
		}
	}

	public Boolean getIOSSilentNotification() {
		return this.iOSSilentNotification;
	}

	public void setIOSSilentNotification(Boolean iOSSilentNotification) {
		this.iOSSilentNotification = iOSSilentNotification;
		if(iOSSilentNotification != null){
			putQueryParameter("iOSSilentNotification", iOSSilentNotification.toString());
		}
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
		if(target != null){
			putQueryParameter("Target", target);
		}
	}

	public String getAndroidNotificationChannel() {
		return this.androidNotificationChannel;
	}

	public void setAndroidNotificationChannel(String androidNotificationChannel) {
		this.androidNotificationChannel = androidNotificationChannel;
		if(androidNotificationChannel != null){
			putQueryParameter("AndroidNotificationChannel", androidNotificationChannel);
		}
	}

	public Boolean getAndroidRemind() {
		return this.androidRemind;
	}

	public void setAndroidRemind(Boolean androidRemind) {
		this.androidRemind = androidRemind;
		if(androidRemind != null){
			putQueryParameter("AndroidRemind", androidRemind.toString());
		}
	}

	public String getAndroidActivity() {
		return this.androidActivity;
	}

	public void setAndroidActivity(String androidActivity) {
		this.androidActivity = androidActivity;
		if(androidActivity != null){
			putQueryParameter("AndroidActivity", androidActivity);
		}
	}

	public String getSmsSignName() {
		return this.smsSignName;
	}

	public void setSmsSignName(String smsSignName) {
		this.smsSignName = smsSignName;
		if(smsSignName != null){
			putQueryParameter("SmsSignName", smsSignName);
		}
	}

	public Long getAppKey() {
		return this.appKey;
	}

	public void setAppKey(Long appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey.toString());
		}
	}

	public String getTargetValue() {
		return this.targetValue;
	}

	public void setTargetValue(String targetValue) {
		this.targetValue = targetValue;
		if(targetValue != null){
			putQueryParameter("TargetValue", targetValue);
		}
	}

	public String getAndroidXiaoMiActivity() {
		return this.androidXiaoMiActivity;
	}

	public void setAndroidXiaoMiActivity(String androidXiaoMiActivity) {
		this.androidXiaoMiActivity = androidXiaoMiActivity;
		if(androidXiaoMiActivity != null){
			putQueryParameter("AndroidXiaoMiActivity", androidXiaoMiActivity);
		}
	}

	public String getAndroidXiaoMiNotifyTitle() {
		return this.androidXiaoMiNotifyTitle;
	}

	public void setAndroidXiaoMiNotifyTitle(String androidXiaoMiNotifyTitle) {
		this.androidXiaoMiNotifyTitle = androidXiaoMiNotifyTitle;
		if(androidXiaoMiNotifyTitle != null){
			putQueryParameter("AndroidXiaoMiNotifyTitle", androidXiaoMiNotifyTitle);
		}
	}

	@Override
	public Class<PushResponse> getResponseClass() {
		return PushResponse.class;
	}

}
