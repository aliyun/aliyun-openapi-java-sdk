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

	private String androidNotificationHuaweiChannel;

	private String androidPopupActivity;

	private String iOSRemindBody;

	private Boolean trim;

	private String androidNotifyType;

	private String androidPopupTitle;

	private String androidMessageHuaweiCategory;

	private String iOSMusic;

	private String iOSApnsEnv;

	private Boolean iOSMutableContent;

	private Integer androidNotificationBarPriority;

	private String expireTime;

	private String androidImageUrl;

	private String androidNotificationVivoChannel;

	private String iOSNotificationCategory;

	private String androidNotificationXiaomiChannel;

	private Boolean storeOffline;

	private String smsParams;

	private Double iOSRelevanceScore;

	private Integer androidVivoPushMode;

	private String androidInboxBody;

	private String jobKey;

	private String androidOpenUrl;

	private String androidXiaoMiNotifyBody;

	private String iOSSubtitle;

	private String androidXiaomiBigPictureUrl;

	private Boolean iOSRemind;

	private String iOSNotificationThreadId;

	private String androidMusic;

	private String iOSNotificationCollapseId;

	private String androidMessageHuaweiUrgency;

	private String pushType;

	private String iOSInterruptionLevel;

	private String androidExtParameters;

	private Integer iOSBadge;

	private String androidBigBody;

	private Boolean iOSBadgeAutoIncrement;

	private String androidOpenType;

	private String title;

	private Integer smsDelaySecs;

	private Integer androidRenderStyle;

	private String iOSExtParameters;

	private String androidXiaomiImageUrl;

	private String smsTemplateName;

	private String androidPopupBody;

	private String androidBigPictureUrl;

	private Boolean iOSSilentNotification;

	private String sendChannels;

	private String target;

	private String androidBigTitle;

	private String androidNotificationChannel;

	private Boolean androidRemind;

	private String androidActivity;

	private String smsSignName;

	private Integer androidNotificationNotifyId;

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

	public String getAndroidNotificationHuaweiChannel() {
		return this.androidNotificationHuaweiChannel;
	}

	public void setAndroidNotificationHuaweiChannel(String androidNotificationHuaweiChannel) {
		this.androidNotificationHuaweiChannel = androidNotificationHuaweiChannel;
		if(androidNotificationHuaweiChannel != null){
			putQueryParameter("AndroidNotificationHuaweiChannel", androidNotificationHuaweiChannel);
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

	public Boolean getTrim() {
		return this.trim;
	}

	public void setTrim(Boolean trim) {
		this.trim = trim;
		if(trim != null){
			putQueryParameter("Trim", trim.toString());
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

	public String getAndroidMessageHuaweiCategory() {
		return this.androidMessageHuaweiCategory;
	}

	public void setAndroidMessageHuaweiCategory(String androidMessageHuaweiCategory) {
		this.androidMessageHuaweiCategory = androidMessageHuaweiCategory;
		if(androidMessageHuaweiCategory != null){
			putQueryParameter("AndroidMessageHuaweiCategory", androidMessageHuaweiCategory);
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

	public String getAndroidImageUrl() {
		return this.androidImageUrl;
	}

	public void setAndroidImageUrl(String androidImageUrl) {
		this.androidImageUrl = androidImageUrl;
		if(androidImageUrl != null){
			putQueryParameter("AndroidImageUrl", androidImageUrl);
		}
	}

	public String getAndroidNotificationVivoChannel() {
		return this.androidNotificationVivoChannel;
	}

	public void setAndroidNotificationVivoChannel(String androidNotificationVivoChannel) {
		this.androidNotificationVivoChannel = androidNotificationVivoChannel;
		if(androidNotificationVivoChannel != null){
			putQueryParameter("AndroidNotificationVivoChannel", androidNotificationVivoChannel);
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

	public Double getIOSRelevanceScore() {
		return this.iOSRelevanceScore;
	}

	public void setIOSRelevanceScore(Double iOSRelevanceScore) {
		this.iOSRelevanceScore = iOSRelevanceScore;
		if(iOSRelevanceScore != null){
			putQueryParameter("iOSRelevanceScore", iOSRelevanceScore.toString());
		}
	}

	public Integer getAndroidVivoPushMode() {
		return this.androidVivoPushMode;
	}

	public void setAndroidVivoPushMode(Integer androidVivoPushMode) {
		this.androidVivoPushMode = androidVivoPushMode;
		if(androidVivoPushMode != null){
			putQueryParameter("AndroidVivoPushMode", androidVivoPushMode.toString());
		}
	}

	public String getAndroidInboxBody() {
		return this.androidInboxBody;
	}

	public void setAndroidInboxBody(String androidInboxBody) {
		this.androidInboxBody = androidInboxBody;
		if(androidInboxBody != null){
			putQueryParameter("AndroidInboxBody", androidInboxBody);
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

	public String getAndroidXiaomiBigPictureUrl() {
		return this.androidXiaomiBigPictureUrl;
	}

	public void setAndroidXiaomiBigPictureUrl(String androidXiaomiBigPictureUrl) {
		this.androidXiaomiBigPictureUrl = androidXiaomiBigPictureUrl;
		if(androidXiaomiBigPictureUrl != null){
			putQueryParameter("AndroidXiaomiBigPictureUrl", androidXiaomiBigPictureUrl);
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

	public String getIOSNotificationThreadId() {
		return this.iOSNotificationThreadId;
	}

	public void setIOSNotificationThreadId(String iOSNotificationThreadId) {
		this.iOSNotificationThreadId = iOSNotificationThreadId;
		if(iOSNotificationThreadId != null){
			putQueryParameter("iOSNotificationThreadId", iOSNotificationThreadId);
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

	public String getIOSNotificationCollapseId() {
		return this.iOSNotificationCollapseId;
	}

	public void setIOSNotificationCollapseId(String iOSNotificationCollapseId) {
		this.iOSNotificationCollapseId = iOSNotificationCollapseId;
		if(iOSNotificationCollapseId != null){
			putQueryParameter("iOSNotificationCollapseId", iOSNotificationCollapseId);
		}
	}

	public String getAndroidMessageHuaweiUrgency() {
		return this.androidMessageHuaweiUrgency;
	}

	public void setAndroidMessageHuaweiUrgency(String androidMessageHuaweiUrgency) {
		this.androidMessageHuaweiUrgency = androidMessageHuaweiUrgency;
		if(androidMessageHuaweiUrgency != null){
			putQueryParameter("AndroidMessageHuaweiUrgency", androidMessageHuaweiUrgency);
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

	public String getIOSInterruptionLevel() {
		return this.iOSInterruptionLevel;
	}

	public void setIOSInterruptionLevel(String iOSInterruptionLevel) {
		this.iOSInterruptionLevel = iOSInterruptionLevel;
		if(iOSInterruptionLevel != null){
			putQueryParameter("iOSInterruptionLevel", iOSInterruptionLevel);
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

	public String getAndroidBigBody() {
		return this.androidBigBody;
	}

	public void setAndroidBigBody(String androidBigBody) {
		this.androidBigBody = androidBigBody;
		if(androidBigBody != null){
			putQueryParameter("AndroidBigBody", androidBigBody);
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

	public Integer getAndroidRenderStyle() {
		return this.androidRenderStyle;
	}

	public void setAndroidRenderStyle(Integer androidRenderStyle) {
		this.androidRenderStyle = androidRenderStyle;
		if(androidRenderStyle != null){
			putQueryParameter("AndroidRenderStyle", androidRenderStyle.toString());
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

	public String getAndroidXiaomiImageUrl() {
		return this.androidXiaomiImageUrl;
	}

	public void setAndroidXiaomiImageUrl(String androidXiaomiImageUrl) {
		this.androidXiaomiImageUrl = androidXiaomiImageUrl;
		if(androidXiaomiImageUrl != null){
			putQueryParameter("AndroidXiaomiImageUrl", androidXiaomiImageUrl);
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

	public String getAndroidBigPictureUrl() {
		return this.androidBigPictureUrl;
	}

	public void setAndroidBigPictureUrl(String androidBigPictureUrl) {
		this.androidBigPictureUrl = androidBigPictureUrl;
		if(androidBigPictureUrl != null){
			putQueryParameter("AndroidBigPictureUrl", androidBigPictureUrl);
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

	public String getSendChannels() {
		return this.sendChannels;
	}

	public void setSendChannels(String sendChannels) {
		this.sendChannels = sendChannels;
		if(sendChannels != null){
			putQueryParameter("SendChannels", sendChannels);
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

	public String getAndroidBigTitle() {
		return this.androidBigTitle;
	}

	public void setAndroidBigTitle(String androidBigTitle) {
		this.androidBigTitle = androidBigTitle;
		if(androidBigTitle != null){
			putQueryParameter("AndroidBigTitle", androidBigTitle);
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

	public Integer getAndroidNotificationNotifyId() {
		return this.androidNotificationNotifyId;
	}

	public void setAndroidNotificationNotifyId(Integer androidNotificationNotifyId) {
		this.androidNotificationNotifyId = androidNotificationNotifyId;
		if(androidNotificationNotifyId != null){
			putQueryParameter("AndroidNotificationNotifyId", androidNotificationNotifyId.toString());
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
