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

	private String deviceType;

	private String pushTime;

	private Integer sendSpeed;

	private String iOSRemindBody;

	private Boolean trim;

	private String androidPopupTitle;

	private String iOSApnsEnv;

	private Integer androidNotificationBarPriority;

	private String expireTime;

	private String androidImageUrl;

	private String androidVivoReceiptId;

	private String iOSNotificationCategory;

	private String androidXiaomiBigPictureUrl;

	private String harmonyCategory;

	private Boolean iOSRemind;

	private String iOSNotificationThreadId;

	private Integer androidHuaweiTargetUserType;

	private String androidMessageHuaweiUrgency;

	private String iOSInterruptionLevel;

	private String androidExtParameters;

	private Integer iOSBadge;

	private Boolean iOSBadgeAutoIncrement;

	private String androidOpenType;

	private String harmonyRemindTitle;

	private String androidBadgeClass;

	private Integer smsDelaySecs;

	private Integer androidRenderStyle;

	private String iOSExtParameters;

	private String androidXiaomiImageUrl;

	private String harmonyUri;

	private String smsTemplateName;

	private String harmonyExtParameters;

	private String androidBigPictureUrl;

	private Boolean iOSSilentNotification;

	private String harmonyNotificationSlotType;

	private String androidBigTitle;

	private String androidNotificationChannel;

	private Boolean androidRemind;

	private String androidActivity;

	private String smsSignName;

	private Integer androidNotificationNotifyId;

	private Long appKey;

	private String targetValue;

	private Integer harmonyBadgeSetNum;

	private String androidXiaoMiNotifyTitle;

	private Integer smsSendPolicy;

	private String body;

	private String androidNotificationHuaweiChannel;

	private String androidPopupActivity;

	private Integer harmonyNotifyId;

	private String harmonyRenderStyle;

	private String androidMessageVivoCategory;

	private String androidNotifyType;

	private String androidMessageHuaweiCategory;

	private String iOSMusic;

	private Boolean iOSMutableContent;

	private String androidNotificationThreadId;

	private Integer androidHonorTargetUserType;

	private String harmonyRemindBody;

	private String androidNotificationVivoChannel;

	private String androidNotificationXiaomiChannel;

	private String harmonyAction;

	private Boolean storeOffline;

	private Double iOSRelevanceScore;

	private String smsParams;

	private Integer androidVivoPushMode;

	private String androidInboxBody;

	private String jobKey;

	private String harmonyReceiptId;

	private String androidOpenUrl;

	private Integer androidBadgeSetNum;

	private String androidXiaoMiNotifyBody;

	private String iOSSubtitle;

	private Boolean harmonyRemind;

	private String androidMusic;

	private Boolean harmonyExtensionPush;

	private String iOSNotificationCollapseId;

	private String pushType;

	private String harmonyExtensionExtraData;

	private String harmonyImageUrl;

	private String androidBigBody;

	private String title;

	private Integer harmonyBadgeAddNum;

	private Boolean harmonyTestMessage;

	private Integer androidBadgeAddNum;

	private String androidHuaweiReceiptId;

	private String androidNotificationHonorChannel;

	private Integer androidTargetUserType;

	private String androidPopupBody;

	private String androidNotificationGroup;

	private String sendChannels;

	private String harmonyActionType;

	private String target;

	private String harmonyInboxContent;

	private String androidXiaoMiActivity;
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

	public String getAndroidPopupTitle() {
		return this.androidPopupTitle;
	}

	public void setAndroidPopupTitle(String androidPopupTitle) {
		this.androidPopupTitle = androidPopupTitle;
		if(androidPopupTitle != null){
			putQueryParameter("AndroidPopupTitle", androidPopupTitle);
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

	public String getAndroidVivoReceiptId() {
		return this.androidVivoReceiptId;
	}

	public void setAndroidVivoReceiptId(String androidVivoReceiptId) {
		this.androidVivoReceiptId = androidVivoReceiptId;
		if(androidVivoReceiptId != null){
			putQueryParameter("AndroidVivoReceiptId", androidVivoReceiptId);
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

	public String getAndroidXiaomiBigPictureUrl() {
		return this.androidXiaomiBigPictureUrl;
	}

	public void setAndroidXiaomiBigPictureUrl(String androidXiaomiBigPictureUrl) {
		this.androidXiaomiBigPictureUrl = androidXiaomiBigPictureUrl;
		if(androidXiaomiBigPictureUrl != null){
			putQueryParameter("AndroidXiaomiBigPictureUrl", androidXiaomiBigPictureUrl);
		}
	}

	public String getHarmonyCategory() {
		return this.harmonyCategory;
	}

	public void setHarmonyCategory(String harmonyCategory) {
		this.harmonyCategory = harmonyCategory;
		if(harmonyCategory != null){
			putQueryParameter("HarmonyCategory", harmonyCategory);
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

	public Integer getAndroidHuaweiTargetUserType() {
		return this.androidHuaweiTargetUserType;
	}

	public void setAndroidHuaweiTargetUserType(Integer androidHuaweiTargetUserType) {
		this.androidHuaweiTargetUserType = androidHuaweiTargetUserType;
		if(androidHuaweiTargetUserType != null){
			putQueryParameter("AndroidHuaweiTargetUserType", androidHuaweiTargetUserType.toString());
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

	public String getHarmonyRemindTitle() {
		return this.harmonyRemindTitle;
	}

	public void setHarmonyRemindTitle(String harmonyRemindTitle) {
		this.harmonyRemindTitle = harmonyRemindTitle;
		if(harmonyRemindTitle != null){
			putQueryParameter("HarmonyRemindTitle", harmonyRemindTitle);
		}
	}

	public String getAndroidBadgeClass() {
		return this.androidBadgeClass;
	}

	public void setAndroidBadgeClass(String androidBadgeClass) {
		this.androidBadgeClass = androidBadgeClass;
		if(androidBadgeClass != null){
			putQueryParameter("AndroidBadgeClass", androidBadgeClass);
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

	public String getHarmonyUri() {
		return this.harmonyUri;
	}

	public void setHarmonyUri(String harmonyUri) {
		this.harmonyUri = harmonyUri;
		if(harmonyUri != null){
			putQueryParameter("HarmonyUri", harmonyUri);
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

	public String getHarmonyExtParameters() {
		return this.harmonyExtParameters;
	}

	public void setHarmonyExtParameters(String harmonyExtParameters) {
		this.harmonyExtParameters = harmonyExtParameters;
		if(harmonyExtParameters != null){
			putQueryParameter("HarmonyExtParameters", harmonyExtParameters);
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

	public String getHarmonyNotificationSlotType() {
		return this.harmonyNotificationSlotType;
	}

	public void setHarmonyNotificationSlotType(String harmonyNotificationSlotType) {
		this.harmonyNotificationSlotType = harmonyNotificationSlotType;
		if(harmonyNotificationSlotType != null){
			putQueryParameter("HarmonyNotificationSlotType", harmonyNotificationSlotType);
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

	public Integer getHarmonyBadgeSetNum() {
		return this.harmonyBadgeSetNum;
	}

	public void setHarmonyBadgeSetNum(Integer harmonyBadgeSetNum) {
		this.harmonyBadgeSetNum = harmonyBadgeSetNum;
		if(harmonyBadgeSetNum != null){
			putQueryParameter("HarmonyBadgeSetNum", harmonyBadgeSetNum.toString());
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

	public Integer getHarmonyNotifyId() {
		return this.harmonyNotifyId;
	}

	public void setHarmonyNotifyId(Integer harmonyNotifyId) {
		this.harmonyNotifyId = harmonyNotifyId;
		if(harmonyNotifyId != null){
			putQueryParameter("HarmonyNotifyId", harmonyNotifyId.toString());
		}
	}

	public String getHarmonyRenderStyle() {
		return this.harmonyRenderStyle;
	}

	public void setHarmonyRenderStyle(String harmonyRenderStyle) {
		this.harmonyRenderStyle = harmonyRenderStyle;
		if(harmonyRenderStyle != null){
			putQueryParameter("HarmonyRenderStyle", harmonyRenderStyle);
		}
	}

	public String getAndroidMessageVivoCategory() {
		return this.androidMessageVivoCategory;
	}

	public void setAndroidMessageVivoCategory(String androidMessageVivoCategory) {
		this.androidMessageVivoCategory = androidMessageVivoCategory;
		if(androidMessageVivoCategory != null){
			putQueryParameter("AndroidMessageVivoCategory", androidMessageVivoCategory);
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

	public Boolean getIOSMutableContent() {
		return this.iOSMutableContent;
	}

	public void setIOSMutableContent(Boolean iOSMutableContent) {
		this.iOSMutableContent = iOSMutableContent;
		if(iOSMutableContent != null){
			putQueryParameter("iOSMutableContent", iOSMutableContent.toString());
		}
	}

	public String getAndroidNotificationThreadId() {
		return this.androidNotificationThreadId;
	}

	public void setAndroidNotificationThreadId(String androidNotificationThreadId) {
		this.androidNotificationThreadId = androidNotificationThreadId;
		if(androidNotificationThreadId != null){
			putQueryParameter("AndroidNotificationThreadId", androidNotificationThreadId);
		}
	}

	public Integer getAndroidHonorTargetUserType() {
		return this.androidHonorTargetUserType;
	}

	public void setAndroidHonorTargetUserType(Integer androidHonorTargetUserType) {
		this.androidHonorTargetUserType = androidHonorTargetUserType;
		if(androidHonorTargetUserType != null){
			putQueryParameter("AndroidHonorTargetUserType", androidHonorTargetUserType.toString());
		}
	}

	public String getHarmonyRemindBody() {
		return this.harmonyRemindBody;
	}

	public void setHarmonyRemindBody(String harmonyRemindBody) {
		this.harmonyRemindBody = harmonyRemindBody;
		if(harmonyRemindBody != null){
			putQueryParameter("HarmonyRemindBody", harmonyRemindBody);
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

	public String getAndroidNotificationXiaomiChannel() {
		return this.androidNotificationXiaomiChannel;
	}

	public void setAndroidNotificationXiaomiChannel(String androidNotificationXiaomiChannel) {
		this.androidNotificationXiaomiChannel = androidNotificationXiaomiChannel;
		if(androidNotificationXiaomiChannel != null){
			putQueryParameter("AndroidNotificationXiaomiChannel", androidNotificationXiaomiChannel);
		}
	}

	public String getHarmonyAction() {
		return this.harmonyAction;
	}

	public void setHarmonyAction(String harmonyAction) {
		this.harmonyAction = harmonyAction;
		if(harmonyAction != null){
			putQueryParameter("HarmonyAction", harmonyAction);
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

	public Double getIOSRelevanceScore() {
		return this.iOSRelevanceScore;
	}

	public void setIOSRelevanceScore(Double iOSRelevanceScore) {
		this.iOSRelevanceScore = iOSRelevanceScore;
		if(iOSRelevanceScore != null){
			putQueryParameter("iOSRelevanceScore", iOSRelevanceScore.toString());
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

	public String getHarmonyReceiptId() {
		return this.harmonyReceiptId;
	}

	public void setHarmonyReceiptId(String harmonyReceiptId) {
		this.harmonyReceiptId = harmonyReceiptId;
		if(harmonyReceiptId != null){
			putQueryParameter("HarmonyReceiptId", harmonyReceiptId);
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

	public Integer getAndroidBadgeSetNum() {
		return this.androidBadgeSetNum;
	}

	public void setAndroidBadgeSetNum(Integer androidBadgeSetNum) {
		this.androidBadgeSetNum = androidBadgeSetNum;
		if(androidBadgeSetNum != null){
			putQueryParameter("AndroidBadgeSetNum", androidBadgeSetNum.toString());
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

	public Boolean getHarmonyRemind() {
		return this.harmonyRemind;
	}

	public void setHarmonyRemind(Boolean harmonyRemind) {
		this.harmonyRemind = harmonyRemind;
		if(harmonyRemind != null){
			putQueryParameter("HarmonyRemind", harmonyRemind.toString());
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

	public Boolean getHarmonyExtensionPush() {
		return this.harmonyExtensionPush;
	}

	public void setHarmonyExtensionPush(Boolean harmonyExtensionPush) {
		this.harmonyExtensionPush = harmonyExtensionPush;
		if(harmonyExtensionPush != null){
			putQueryParameter("HarmonyExtensionPush", harmonyExtensionPush.toString());
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

	public String getPushType() {
		return this.pushType;
	}

	public void setPushType(String pushType) {
		this.pushType = pushType;
		if(pushType != null){
			putQueryParameter("PushType", pushType);
		}
	}

	public String getHarmonyExtensionExtraData() {
		return this.harmonyExtensionExtraData;
	}

	public void setHarmonyExtensionExtraData(String harmonyExtensionExtraData) {
		this.harmonyExtensionExtraData = harmonyExtensionExtraData;
		if(harmonyExtensionExtraData != null){
			putQueryParameter("HarmonyExtensionExtraData", harmonyExtensionExtraData);
		}
	}

	public String getHarmonyImageUrl() {
		return this.harmonyImageUrl;
	}

	public void setHarmonyImageUrl(String harmonyImageUrl) {
		this.harmonyImageUrl = harmonyImageUrl;
		if(harmonyImageUrl != null){
			putQueryParameter("HarmonyImageUrl", harmonyImageUrl);
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

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putQueryParameter("Title", title);
		}
	}

	public Integer getHarmonyBadgeAddNum() {
		return this.harmonyBadgeAddNum;
	}

	public void setHarmonyBadgeAddNum(Integer harmonyBadgeAddNum) {
		this.harmonyBadgeAddNum = harmonyBadgeAddNum;
		if(harmonyBadgeAddNum != null){
			putQueryParameter("HarmonyBadgeAddNum", harmonyBadgeAddNum.toString());
		}
	}

	public Boolean getHarmonyTestMessage() {
		return this.harmonyTestMessage;
	}

	public void setHarmonyTestMessage(Boolean harmonyTestMessage) {
		this.harmonyTestMessage = harmonyTestMessage;
		if(harmonyTestMessage != null){
			putQueryParameter("HarmonyTestMessage", harmonyTestMessage.toString());
		}
	}

	public Integer getAndroidBadgeAddNum() {
		return this.androidBadgeAddNum;
	}

	public void setAndroidBadgeAddNum(Integer androidBadgeAddNum) {
		this.androidBadgeAddNum = androidBadgeAddNum;
		if(androidBadgeAddNum != null){
			putQueryParameter("AndroidBadgeAddNum", androidBadgeAddNum.toString());
		}
	}

	public String getAndroidHuaweiReceiptId() {
		return this.androidHuaweiReceiptId;
	}

	public void setAndroidHuaweiReceiptId(String androidHuaweiReceiptId) {
		this.androidHuaweiReceiptId = androidHuaweiReceiptId;
		if(androidHuaweiReceiptId != null){
			putQueryParameter("AndroidHuaweiReceiptId", androidHuaweiReceiptId);
		}
	}

	public String getAndroidNotificationHonorChannel() {
		return this.androidNotificationHonorChannel;
	}

	public void setAndroidNotificationHonorChannel(String androidNotificationHonorChannel) {
		this.androidNotificationHonorChannel = androidNotificationHonorChannel;
		if(androidNotificationHonorChannel != null){
			putQueryParameter("AndroidNotificationHonorChannel", androidNotificationHonorChannel);
		}
	}

	public Integer getAndroidTargetUserType() {
		return this.androidTargetUserType;
	}

	public void setAndroidTargetUserType(Integer androidTargetUserType) {
		this.androidTargetUserType = androidTargetUserType;
		if(androidTargetUserType != null){
			putQueryParameter("AndroidTargetUserType", androidTargetUserType.toString());
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

	public String getAndroidNotificationGroup() {
		return this.androidNotificationGroup;
	}

	public void setAndroidNotificationGroup(String androidNotificationGroup) {
		this.androidNotificationGroup = androidNotificationGroup;
		if(androidNotificationGroup != null){
			putQueryParameter("AndroidNotificationGroup", androidNotificationGroup);
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

	public String getHarmonyActionType() {
		return this.harmonyActionType;
	}

	public void setHarmonyActionType(String harmonyActionType) {
		this.harmonyActionType = harmonyActionType;
		if(harmonyActionType != null){
			putQueryParameter("HarmonyActionType", harmonyActionType);
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

	public String getHarmonyInboxContent() {
		return this.harmonyInboxContent;
	}

	public void setHarmonyInboxContent(String harmonyInboxContent) {
		this.harmonyInboxContent = harmonyInboxContent;
		if(harmonyInboxContent != null){
			putQueryParameter("HarmonyInboxContent", harmonyInboxContent);
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

	@Override
	public Class<PushResponse> getResponseClass() {
		return PushResponse.class;
	}

}
