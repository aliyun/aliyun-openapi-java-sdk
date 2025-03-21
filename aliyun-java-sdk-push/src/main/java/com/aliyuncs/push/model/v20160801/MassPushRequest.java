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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.push.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MassPushRequest extends RpcAcsRequest<MassPushResponse> {
	   

	private String idempotentToken;

	private List<PushTask> pushTasks;

	private Long appKey;
	public MassPushRequest() {
		super("Push", "2016-08-01", "MassPush");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getIdempotentToken() {
		return this.idempotentToken;
	}

	public void setIdempotentToken(String idempotentToken) {
		this.idempotentToken = idempotentToken;
		if(idempotentToken != null){
			putQueryParameter("IdempotentToken", idempotentToken);
		}
	}

	public List<PushTask> getPushTasks() {
		return this.pushTasks;
	}

	public void setPushTasks(List<PushTask> pushTasks) {
		this.pushTasks = pushTasks;	
		if (pushTasks != null) {
			for (int depth1 = 0; depth1 < pushTasks.size(); depth1++) {
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationBarType" , pushTasks.get(depth1).getAndroidNotificationBarType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidMessageOppoNotifyLevel" , pushTasks.get(depth1).getAndroidMessageOppoNotifyLevel());
				putBodyParameter("PushTask." + (depth1 + 1) + ".DeviceType" , pushTasks.get(depth1).getDeviceType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".PushTime" , pushTasks.get(depth1).getPushTime());
				putBodyParameter("PushTask." + (depth1 + 1) + ".SendSpeed" , pushTasks.get(depth1).getSendSpeed());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSRemindBody" , pushTasks.get(depth1).getIOSRemindBody());
				putBodyParameter("PushTask." + (depth1 + 1) + ".Trim" , pushTasks.get(depth1).getTrim());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSLiveActivityAttributesType" , pushTasks.get(depth1).getIOSLiveActivityAttributesType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidPopupTitle" , pushTasks.get(depth1).getAndroidPopupTitle());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSApnsEnv" , pushTasks.get(depth1).getIOSApnsEnv());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationBarPriority" , pushTasks.get(depth1).getAndroidNotificationBarPriority());
				putBodyParameter("PushTask." + (depth1 + 1) + ".ExpireTime" , pushTasks.get(depth1).getExpireTime());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidImageUrl" , pushTasks.get(depth1).getAndroidImageUrl());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidVivoReceiptId" , pushTasks.get(depth1).getAndroidVivoReceiptId());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSNotificationCategory" , pushTasks.get(depth1).getIOSNotificationCategory());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidXiaomiBigPictureUrl" , pushTasks.get(depth1).getAndroidXiaomiBigPictureUrl());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyCategory" , pushTasks.get(depth1).getHarmonyCategory());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSRemind" , pushTasks.get(depth1).getIOSRemind());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSNotificationThreadId" , pushTasks.get(depth1).getIOSNotificationThreadId());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSLiveActivityStaleDate" , pushTasks.get(depth1).getIOSLiveActivityStaleDate());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidHuaweiTargetUserType" , pushTasks.get(depth1).getAndroidHuaweiTargetUserType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSLiveActivityContentState" , pushTasks.get(depth1).getIOSLiveActivityContentState());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidMessageHuaweiUrgency" , pushTasks.get(depth1).getAndroidMessageHuaweiUrgency());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSInterruptionLevel" , pushTasks.get(depth1).getIOSInterruptionLevel());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidExtParameters" , pushTasks.get(depth1).getAndroidExtParameters());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSBadge" , pushTasks.get(depth1).getIOSBadge());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSBadgeAutoIncrement" , pushTasks.get(depth1).getIOSBadgeAutoIncrement());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidOpenType" , pushTasks.get(depth1).getAndroidOpenType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyRemindTitle" , pushTasks.get(depth1).getHarmonyRemindTitle());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidBadgeClass" , pushTasks.get(depth1).getAndroidBadgeClass());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidRenderStyle" , pushTasks.get(depth1).getAndroidRenderStyle());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSExtParameters" , pushTasks.get(depth1).getIOSExtParameters());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSLiveActivityAttributes" , pushTasks.get(depth1).getIOSLiveActivityAttributes());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidXiaomiImageUrl" , pushTasks.get(depth1).getAndroidXiaomiImageUrl());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyUri" , pushTasks.get(depth1).getHarmonyUri());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyExtParameters" , pushTasks.get(depth1).getHarmonyExtParameters());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidBigPictureUrl" , pushTasks.get(depth1).getAndroidBigPictureUrl());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSSilentNotification" , pushTasks.get(depth1).getIOSSilentNotification());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSLiveActivityEvent" , pushTasks.get(depth1).getIOSLiveActivityEvent());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyNotificationSlotType" , pushTasks.get(depth1).getHarmonyNotificationSlotType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidBigTitle" , pushTasks.get(depth1).getAndroidBigTitle());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationChannel" , pushTasks.get(depth1).getAndroidNotificationChannel());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidRemind" , pushTasks.get(depth1).getAndroidRemind());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidActivity" , pushTasks.get(depth1).getAndroidActivity());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationNotifyId" , pushTasks.get(depth1).getAndroidNotificationNotifyId());
				putBodyParameter("PushTask." + (depth1 + 1) + ".TargetValue" , pushTasks.get(depth1).getTargetValue());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyBadgeSetNum" , pushTasks.get(depth1).getHarmonyBadgeSetNum());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidXiaoMiNotifyTitle" , pushTasks.get(depth1).getAndroidXiaoMiNotifyTitle());
				putBodyParameter("PushTask." + (depth1 + 1) + ".Body" , pushTasks.get(depth1).getBody());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationHuaweiChannel" , pushTasks.get(depth1).getAndroidNotificationHuaweiChannel());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidPopupActivity" , pushTasks.get(depth1).getAndroidPopupActivity());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyNotifyId" , pushTasks.get(depth1).getHarmonyNotifyId());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyRenderStyle" , pushTasks.get(depth1).getHarmonyRenderStyle());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidMessageVivoCategory" , pushTasks.get(depth1).getAndroidMessageVivoCategory());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotifyType" , pushTasks.get(depth1).getAndroidNotifyType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidMessageHuaweiCategory" , pushTasks.get(depth1).getAndroidMessageHuaweiCategory());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSMusic" , pushTasks.get(depth1).getIOSMusic());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSMutableContent" , pushTasks.get(depth1).getIOSMutableContent());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSLiveActivityId" , pushTasks.get(depth1).getIOSLiveActivityId());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationThreadId" , pushTasks.get(depth1).getAndroidNotificationThreadId());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidHonorTargetUserType" , pushTasks.get(depth1).getAndroidHonorTargetUserType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyRemindBody" , pushTasks.get(depth1).getHarmonyRemindBody());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationVivoChannel" , pushTasks.get(depth1).getAndroidNotificationVivoChannel());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationXiaomiChannel" , pushTasks.get(depth1).getAndroidNotificationXiaomiChannel());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyAction" , pushTasks.get(depth1).getHarmonyAction());
				putBodyParameter("PushTask." + (depth1 + 1) + ".StoreOffline" , pushTasks.get(depth1).getStoreOffline());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSRelevanceScore" , pushTasks.get(depth1).getIOSRelevanceScore());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidVivoPushMode" , pushTasks.get(depth1).getAndroidVivoPushMode());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidInboxBody" , pushTasks.get(depth1).getAndroidInboxBody());
				putBodyParameter("PushTask." + (depth1 + 1) + ".JobKey" , pushTasks.get(depth1).getJobKey());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyReceiptId" , pushTasks.get(depth1).getHarmonyReceiptId());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSLiveActivityDismissalDate" , pushTasks.get(depth1).getIOSLiveActivityDismissalDate());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidOpenUrl" , pushTasks.get(depth1).getAndroidOpenUrl());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidBadgeSetNum" , pushTasks.get(depth1).getAndroidBadgeSetNum());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidXiaoMiNotifyBody" , pushTasks.get(depth1).getAndroidXiaoMiNotifyBody());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSSubtitle" , pushTasks.get(depth1).getIOSSubtitle());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyRemind" , pushTasks.get(depth1).getHarmonyRemind());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidMusic" , pushTasks.get(depth1).getAndroidMusic());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyExtensionPush" , pushTasks.get(depth1).getHarmonyExtensionPush());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSNotificationCollapseId" , pushTasks.get(depth1).getIOSNotificationCollapseId());
				putBodyParameter("PushTask." + (depth1 + 1) + ".PushType" , pushTasks.get(depth1).getPushType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyExtensionExtraData" , pushTasks.get(depth1).getHarmonyExtensionExtraData());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyImageUrl" , pushTasks.get(depth1).getHarmonyImageUrl());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidBigBody" , pushTasks.get(depth1).getAndroidBigBody());
				putBodyParameter("PushTask." + (depth1 + 1) + ".Title" , pushTasks.get(depth1).getTitle());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyBadgeAddNum" , pushTasks.get(depth1).getHarmonyBadgeAddNum());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyTestMessage" , pushTasks.get(depth1).getHarmonyTestMessage());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidBadgeAddNum" , pushTasks.get(depth1).getAndroidBadgeAddNum());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidHuaweiReceiptId" , pushTasks.get(depth1).getAndroidHuaweiReceiptId());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationHonorChannel" , pushTasks.get(depth1).getAndroidNotificationHonorChannel());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidTargetUserType" , pushTasks.get(depth1).getAndroidTargetUserType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidPopupBody" , pushTasks.get(depth1).getAndroidPopupBody());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationGroup" , pushTasks.get(depth1).getAndroidNotificationGroup());
				putBodyParameter("PushTask." + (depth1 + 1) + ".SendChannels" , pushTasks.get(depth1).getSendChannels());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyActionType" , pushTasks.get(depth1).getHarmonyActionType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".Target" , pushTasks.get(depth1).getTarget());
				putBodyParameter("PushTask." + (depth1 + 1) + ".HarmonyInboxContent" , pushTasks.get(depth1).getHarmonyInboxContent());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidMessageOppoCategory" , pushTasks.get(depth1).getAndroidMessageOppoCategory());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidXiaoMiActivity" , pushTasks.get(depth1).getAndroidXiaoMiActivity());
			}
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

	public static class PushTask {

		private Integer androidNotificationBarType;

		private Integer androidMessageOppoNotifyLevel;

		private String deviceType;

		private String pushTime;

		private Integer sendSpeed;

		private String iOSRemindBody;

		private Boolean trim;

		private String iOSLiveActivityAttributesType;

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

		private Long iOSLiveActivityStaleDate;

		private Integer androidHuaweiTargetUserType;

		private String iOSLiveActivityContentState;

		private String androidMessageHuaweiUrgency;

		private String iOSInterruptionLevel;

		private String androidExtParameters;

		private Integer iOSBadge;

		private Boolean iOSBadgeAutoIncrement;

		private String androidOpenType;

		private String harmonyRemindTitle;

		private String androidBadgeClass;

		private String androidRenderStyle;

		private String iOSExtParameters;

		private String iOSLiveActivityAttributes;

		private String androidXiaomiImageUrl;

		private String harmonyUri;

		private String harmonyExtParameters;

		private String androidBigPictureUrl;

		private Boolean iOSSilentNotification;

		private String iOSLiveActivityEvent;

		private String harmonyNotificationSlotType;

		private String androidBigTitle;

		private String androidNotificationChannel;

		private Boolean androidRemind;

		private String androidActivity;

		private Integer androidNotificationNotifyId;

		private String targetValue;

		private Integer harmonyBadgeSetNum;

		private String androidXiaoMiNotifyTitle;

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

		private String iOSLiveActivityId;

		private String androidNotificationThreadId;

		private Integer androidHonorTargetUserType;

		private String harmonyRemindBody;

		private String androidNotificationVivoChannel;

		private String androidNotificationXiaomiChannel;

		private String harmonyAction;

		private Boolean storeOffline;

		private Double iOSRelevanceScore;

		private Integer androidVivoPushMode;

		private String androidInboxBody;

		private String jobKey;

		private String harmonyReceiptId;

		private Long iOSLiveActivityDismissalDate;

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

		private String androidMessageOppoCategory;

		private String androidXiaoMiActivity;

		public Integer getAndroidNotificationBarType() {
			return this.androidNotificationBarType;
		}

		public void setAndroidNotificationBarType(Integer androidNotificationBarType) {
			this.androidNotificationBarType = androidNotificationBarType;
		}

		public Integer getAndroidMessageOppoNotifyLevel() {
			return this.androidMessageOppoNotifyLevel;
		}

		public void setAndroidMessageOppoNotifyLevel(Integer androidMessageOppoNotifyLevel) {
			this.androidMessageOppoNotifyLevel = androidMessageOppoNotifyLevel;
		}

		public String getDeviceType() {
			return this.deviceType;
		}

		public void setDeviceType(String deviceType) {
			this.deviceType = deviceType;
		}

		public String getPushTime() {
			return this.pushTime;
		}

		public void setPushTime(String pushTime) {
			this.pushTime = pushTime;
		}

		public Integer getSendSpeed() {
			return this.sendSpeed;
		}

		public void setSendSpeed(Integer sendSpeed) {
			this.sendSpeed = sendSpeed;
		}

		public String getIOSRemindBody() {
			return this.iOSRemindBody;
		}

		public void setIOSRemindBody(String iOSRemindBody) {
			this.iOSRemindBody = iOSRemindBody;
		}

		public Boolean getTrim() {
			return this.trim;
		}

		public void setTrim(Boolean trim) {
			this.trim = trim;
		}

		public String getIOSLiveActivityAttributesType() {
			return this.iOSLiveActivityAttributesType;
		}

		public void setIOSLiveActivityAttributesType(String iOSLiveActivityAttributesType) {
			this.iOSLiveActivityAttributesType = iOSLiveActivityAttributesType;
		}

		public String getAndroidPopupTitle() {
			return this.androidPopupTitle;
		}

		public void setAndroidPopupTitle(String androidPopupTitle) {
			this.androidPopupTitle = androidPopupTitle;
		}

		public String getIOSApnsEnv() {
			return this.iOSApnsEnv;
		}

		public void setIOSApnsEnv(String iOSApnsEnv) {
			this.iOSApnsEnv = iOSApnsEnv;
		}

		public Integer getAndroidNotificationBarPriority() {
			return this.androidNotificationBarPriority;
		}

		public void setAndroidNotificationBarPriority(Integer androidNotificationBarPriority) {
			this.androidNotificationBarPriority = androidNotificationBarPriority;
		}

		public String getExpireTime() {
			return this.expireTime;
		}

		public void setExpireTime(String expireTime) {
			this.expireTime = expireTime;
		}

		public String getAndroidImageUrl() {
			return this.androidImageUrl;
		}

		public void setAndroidImageUrl(String androidImageUrl) {
			this.androidImageUrl = androidImageUrl;
		}

		public String getAndroidVivoReceiptId() {
			return this.androidVivoReceiptId;
		}

		public void setAndroidVivoReceiptId(String androidVivoReceiptId) {
			this.androidVivoReceiptId = androidVivoReceiptId;
		}

		public String getIOSNotificationCategory() {
			return this.iOSNotificationCategory;
		}

		public void setIOSNotificationCategory(String iOSNotificationCategory) {
			this.iOSNotificationCategory = iOSNotificationCategory;
		}

		public String getAndroidXiaomiBigPictureUrl() {
			return this.androidXiaomiBigPictureUrl;
		}

		public void setAndroidXiaomiBigPictureUrl(String androidXiaomiBigPictureUrl) {
			this.androidXiaomiBigPictureUrl = androidXiaomiBigPictureUrl;
		}

		public String getHarmonyCategory() {
			return this.harmonyCategory;
		}

		public void setHarmonyCategory(String harmonyCategory) {
			this.harmonyCategory = harmonyCategory;
		}

		public Boolean getIOSRemind() {
			return this.iOSRemind;
		}

		public void setIOSRemind(Boolean iOSRemind) {
			this.iOSRemind = iOSRemind;
		}

		public String getIOSNotificationThreadId() {
			return this.iOSNotificationThreadId;
		}

		public void setIOSNotificationThreadId(String iOSNotificationThreadId) {
			this.iOSNotificationThreadId = iOSNotificationThreadId;
		}

		public Long getIOSLiveActivityStaleDate() {
			return this.iOSLiveActivityStaleDate;
		}

		public void setIOSLiveActivityStaleDate(Long iOSLiveActivityStaleDate) {
			this.iOSLiveActivityStaleDate = iOSLiveActivityStaleDate;
		}

		public Integer getAndroidHuaweiTargetUserType() {
			return this.androidHuaweiTargetUserType;
		}

		public void setAndroidHuaweiTargetUserType(Integer androidHuaweiTargetUserType) {
			this.androidHuaweiTargetUserType = androidHuaweiTargetUserType;
		}

		public String getIOSLiveActivityContentState() {
			return this.iOSLiveActivityContentState;
		}

		public void setIOSLiveActivityContentState(String iOSLiveActivityContentState) {
			this.iOSLiveActivityContentState = iOSLiveActivityContentState;
		}

		public String getAndroidMessageHuaweiUrgency() {
			return this.androidMessageHuaweiUrgency;
		}

		public void setAndroidMessageHuaweiUrgency(String androidMessageHuaweiUrgency) {
			this.androidMessageHuaweiUrgency = androidMessageHuaweiUrgency;
		}

		public String getIOSInterruptionLevel() {
			return this.iOSInterruptionLevel;
		}

		public void setIOSInterruptionLevel(String iOSInterruptionLevel) {
			this.iOSInterruptionLevel = iOSInterruptionLevel;
		}

		public String getAndroidExtParameters() {
			return this.androidExtParameters;
		}

		public void setAndroidExtParameters(String androidExtParameters) {
			this.androidExtParameters = androidExtParameters;
		}

		public Integer getIOSBadge() {
			return this.iOSBadge;
		}

		public void setIOSBadge(Integer iOSBadge) {
			this.iOSBadge = iOSBadge;
		}

		public Boolean getIOSBadgeAutoIncrement() {
			return this.iOSBadgeAutoIncrement;
		}

		public void setIOSBadgeAutoIncrement(Boolean iOSBadgeAutoIncrement) {
			this.iOSBadgeAutoIncrement = iOSBadgeAutoIncrement;
		}

		public String getAndroidOpenType() {
			return this.androidOpenType;
		}

		public void setAndroidOpenType(String androidOpenType) {
			this.androidOpenType = androidOpenType;
		}

		public String getHarmonyRemindTitle() {
			return this.harmonyRemindTitle;
		}

		public void setHarmonyRemindTitle(String harmonyRemindTitle) {
			this.harmonyRemindTitle = harmonyRemindTitle;
		}

		public String getAndroidBadgeClass() {
			return this.androidBadgeClass;
		}

		public void setAndroidBadgeClass(String androidBadgeClass) {
			this.androidBadgeClass = androidBadgeClass;
		}

		public String getAndroidRenderStyle() {
			return this.androidRenderStyle;
		}

		public void setAndroidRenderStyle(String androidRenderStyle) {
			this.androidRenderStyle = androidRenderStyle;
		}

		public String getIOSExtParameters() {
			return this.iOSExtParameters;
		}

		public void setIOSExtParameters(String iOSExtParameters) {
			this.iOSExtParameters = iOSExtParameters;
		}

		public String getIOSLiveActivityAttributes() {
			return this.iOSLiveActivityAttributes;
		}

		public void setIOSLiveActivityAttributes(String iOSLiveActivityAttributes) {
			this.iOSLiveActivityAttributes = iOSLiveActivityAttributes;
		}

		public String getAndroidXiaomiImageUrl() {
			return this.androidXiaomiImageUrl;
		}

		public void setAndroidXiaomiImageUrl(String androidXiaomiImageUrl) {
			this.androidXiaomiImageUrl = androidXiaomiImageUrl;
		}

		public String getHarmonyUri() {
			return this.harmonyUri;
		}

		public void setHarmonyUri(String harmonyUri) {
			this.harmonyUri = harmonyUri;
		}

		public String getHarmonyExtParameters() {
			return this.harmonyExtParameters;
		}

		public void setHarmonyExtParameters(String harmonyExtParameters) {
			this.harmonyExtParameters = harmonyExtParameters;
		}

		public String getAndroidBigPictureUrl() {
			return this.androidBigPictureUrl;
		}

		public void setAndroidBigPictureUrl(String androidBigPictureUrl) {
			this.androidBigPictureUrl = androidBigPictureUrl;
		}

		public Boolean getIOSSilentNotification() {
			return this.iOSSilentNotification;
		}

		public void setIOSSilentNotification(Boolean iOSSilentNotification) {
			this.iOSSilentNotification = iOSSilentNotification;
		}

		public String getIOSLiveActivityEvent() {
			return this.iOSLiveActivityEvent;
		}

		public void setIOSLiveActivityEvent(String iOSLiveActivityEvent) {
			this.iOSLiveActivityEvent = iOSLiveActivityEvent;
		}

		public String getHarmonyNotificationSlotType() {
			return this.harmonyNotificationSlotType;
		}

		public void setHarmonyNotificationSlotType(String harmonyNotificationSlotType) {
			this.harmonyNotificationSlotType = harmonyNotificationSlotType;
		}

		public String getAndroidBigTitle() {
			return this.androidBigTitle;
		}

		public void setAndroidBigTitle(String androidBigTitle) {
			this.androidBigTitle = androidBigTitle;
		}

		public String getAndroidNotificationChannel() {
			return this.androidNotificationChannel;
		}

		public void setAndroidNotificationChannel(String androidNotificationChannel) {
			this.androidNotificationChannel = androidNotificationChannel;
		}

		public Boolean getAndroidRemind() {
			return this.androidRemind;
		}

		public void setAndroidRemind(Boolean androidRemind) {
			this.androidRemind = androidRemind;
		}

		public String getAndroidActivity() {
			return this.androidActivity;
		}

		public void setAndroidActivity(String androidActivity) {
			this.androidActivity = androidActivity;
		}

		public Integer getAndroidNotificationNotifyId() {
			return this.androidNotificationNotifyId;
		}

		public void setAndroidNotificationNotifyId(Integer androidNotificationNotifyId) {
			this.androidNotificationNotifyId = androidNotificationNotifyId;
		}

		public String getTargetValue() {
			return this.targetValue;
		}

		public void setTargetValue(String targetValue) {
			this.targetValue = targetValue;
		}

		public Integer getHarmonyBadgeSetNum() {
			return this.harmonyBadgeSetNum;
		}

		public void setHarmonyBadgeSetNum(Integer harmonyBadgeSetNum) {
			this.harmonyBadgeSetNum = harmonyBadgeSetNum;
		}

		public String getAndroidXiaoMiNotifyTitle() {
			return this.androidXiaoMiNotifyTitle;
		}

		public void setAndroidXiaoMiNotifyTitle(String androidXiaoMiNotifyTitle) {
			this.androidXiaoMiNotifyTitle = androidXiaoMiNotifyTitle;
		}

		public String getBody() {
			return this.body;
		}

		public void setBody(String body) {
			this.body = body;
		}

		public String getAndroidNotificationHuaweiChannel() {
			return this.androidNotificationHuaweiChannel;
		}

		public void setAndroidNotificationHuaweiChannel(String androidNotificationHuaweiChannel) {
			this.androidNotificationHuaweiChannel = androidNotificationHuaweiChannel;
		}

		public String getAndroidPopupActivity() {
			return this.androidPopupActivity;
		}

		public void setAndroidPopupActivity(String androidPopupActivity) {
			this.androidPopupActivity = androidPopupActivity;
		}

		public Integer getHarmonyNotifyId() {
			return this.harmonyNotifyId;
		}

		public void setHarmonyNotifyId(Integer harmonyNotifyId) {
			this.harmonyNotifyId = harmonyNotifyId;
		}

		public String getHarmonyRenderStyle() {
			return this.harmonyRenderStyle;
		}

		public void setHarmonyRenderStyle(String harmonyRenderStyle) {
			this.harmonyRenderStyle = harmonyRenderStyle;
		}

		public String getAndroidMessageVivoCategory() {
			return this.androidMessageVivoCategory;
		}

		public void setAndroidMessageVivoCategory(String androidMessageVivoCategory) {
			this.androidMessageVivoCategory = androidMessageVivoCategory;
		}

		public String getAndroidNotifyType() {
			return this.androidNotifyType;
		}

		public void setAndroidNotifyType(String androidNotifyType) {
			this.androidNotifyType = androidNotifyType;
		}

		public String getAndroidMessageHuaweiCategory() {
			return this.androidMessageHuaweiCategory;
		}

		public void setAndroidMessageHuaweiCategory(String androidMessageHuaweiCategory) {
			this.androidMessageHuaweiCategory = androidMessageHuaweiCategory;
		}

		public String getIOSMusic() {
			return this.iOSMusic;
		}

		public void setIOSMusic(String iOSMusic) {
			this.iOSMusic = iOSMusic;
		}

		public Boolean getIOSMutableContent() {
			return this.iOSMutableContent;
		}

		public void setIOSMutableContent(Boolean iOSMutableContent) {
			this.iOSMutableContent = iOSMutableContent;
		}

		public String getIOSLiveActivityId() {
			return this.iOSLiveActivityId;
		}

		public void setIOSLiveActivityId(String iOSLiveActivityId) {
			this.iOSLiveActivityId = iOSLiveActivityId;
		}

		public String getAndroidNotificationThreadId() {
			return this.androidNotificationThreadId;
		}

		public void setAndroidNotificationThreadId(String androidNotificationThreadId) {
			this.androidNotificationThreadId = androidNotificationThreadId;
		}

		public Integer getAndroidHonorTargetUserType() {
			return this.androidHonorTargetUserType;
		}

		public void setAndroidHonorTargetUserType(Integer androidHonorTargetUserType) {
			this.androidHonorTargetUserType = androidHonorTargetUserType;
		}

		public String getHarmonyRemindBody() {
			return this.harmonyRemindBody;
		}

		public void setHarmonyRemindBody(String harmonyRemindBody) {
			this.harmonyRemindBody = harmonyRemindBody;
		}

		public String getAndroidNotificationVivoChannel() {
			return this.androidNotificationVivoChannel;
		}

		public void setAndroidNotificationVivoChannel(String androidNotificationVivoChannel) {
			this.androidNotificationVivoChannel = androidNotificationVivoChannel;
		}

		public String getAndroidNotificationXiaomiChannel() {
			return this.androidNotificationXiaomiChannel;
		}

		public void setAndroidNotificationXiaomiChannel(String androidNotificationXiaomiChannel) {
			this.androidNotificationXiaomiChannel = androidNotificationXiaomiChannel;
		}

		public String getHarmonyAction() {
			return this.harmonyAction;
		}

		public void setHarmonyAction(String harmonyAction) {
			this.harmonyAction = harmonyAction;
		}

		public Boolean getStoreOffline() {
			return this.storeOffline;
		}

		public void setStoreOffline(Boolean storeOffline) {
			this.storeOffline = storeOffline;
		}

		public Double getIOSRelevanceScore() {
			return this.iOSRelevanceScore;
		}

		public void setIOSRelevanceScore(Double iOSRelevanceScore) {
			this.iOSRelevanceScore = iOSRelevanceScore;
		}

		public Integer getAndroidVivoPushMode() {
			return this.androidVivoPushMode;
		}

		public void setAndroidVivoPushMode(Integer androidVivoPushMode) {
			this.androidVivoPushMode = androidVivoPushMode;
		}

		public String getAndroidInboxBody() {
			return this.androidInboxBody;
		}

		public void setAndroidInboxBody(String androidInboxBody) {
			this.androidInboxBody = androidInboxBody;
		}

		public String getJobKey() {
			return this.jobKey;
		}

		public void setJobKey(String jobKey) {
			this.jobKey = jobKey;
		}

		public String getHarmonyReceiptId() {
			return this.harmonyReceiptId;
		}

		public void setHarmonyReceiptId(String harmonyReceiptId) {
			this.harmonyReceiptId = harmonyReceiptId;
		}

		public Long getIOSLiveActivityDismissalDate() {
			return this.iOSLiveActivityDismissalDate;
		}

		public void setIOSLiveActivityDismissalDate(Long iOSLiveActivityDismissalDate) {
			this.iOSLiveActivityDismissalDate = iOSLiveActivityDismissalDate;
		}

		public String getAndroidOpenUrl() {
			return this.androidOpenUrl;
		}

		public void setAndroidOpenUrl(String androidOpenUrl) {
			this.androidOpenUrl = androidOpenUrl;
		}

		public Integer getAndroidBadgeSetNum() {
			return this.androidBadgeSetNum;
		}

		public void setAndroidBadgeSetNum(Integer androidBadgeSetNum) {
			this.androidBadgeSetNum = androidBadgeSetNum;
		}

		public String getAndroidXiaoMiNotifyBody() {
			return this.androidXiaoMiNotifyBody;
		}

		public void setAndroidXiaoMiNotifyBody(String androidXiaoMiNotifyBody) {
			this.androidXiaoMiNotifyBody = androidXiaoMiNotifyBody;
		}

		public String getIOSSubtitle() {
			return this.iOSSubtitle;
		}

		public void setIOSSubtitle(String iOSSubtitle) {
			this.iOSSubtitle = iOSSubtitle;
		}

		public Boolean getHarmonyRemind() {
			return this.harmonyRemind;
		}

		public void setHarmonyRemind(Boolean harmonyRemind) {
			this.harmonyRemind = harmonyRemind;
		}

		public String getAndroidMusic() {
			return this.androidMusic;
		}

		public void setAndroidMusic(String androidMusic) {
			this.androidMusic = androidMusic;
		}

		public Boolean getHarmonyExtensionPush() {
			return this.harmonyExtensionPush;
		}

		public void setHarmonyExtensionPush(Boolean harmonyExtensionPush) {
			this.harmonyExtensionPush = harmonyExtensionPush;
		}

		public String getIOSNotificationCollapseId() {
			return this.iOSNotificationCollapseId;
		}

		public void setIOSNotificationCollapseId(String iOSNotificationCollapseId) {
			this.iOSNotificationCollapseId = iOSNotificationCollapseId;
		}

		public String getPushType() {
			return this.pushType;
		}

		public void setPushType(String pushType) {
			this.pushType = pushType;
		}

		public String getHarmonyExtensionExtraData() {
			return this.harmonyExtensionExtraData;
		}

		public void setHarmonyExtensionExtraData(String harmonyExtensionExtraData) {
			this.harmonyExtensionExtraData = harmonyExtensionExtraData;
		}

		public String getHarmonyImageUrl() {
			return this.harmonyImageUrl;
		}

		public void setHarmonyImageUrl(String harmonyImageUrl) {
			this.harmonyImageUrl = harmonyImageUrl;
		}

		public String getAndroidBigBody() {
			return this.androidBigBody;
		}

		public void setAndroidBigBody(String androidBigBody) {
			this.androidBigBody = androidBigBody;
		}

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public Integer getHarmonyBadgeAddNum() {
			return this.harmonyBadgeAddNum;
		}

		public void setHarmonyBadgeAddNum(Integer harmonyBadgeAddNum) {
			this.harmonyBadgeAddNum = harmonyBadgeAddNum;
		}

		public Boolean getHarmonyTestMessage() {
			return this.harmonyTestMessage;
		}

		public void setHarmonyTestMessage(Boolean harmonyTestMessage) {
			this.harmonyTestMessage = harmonyTestMessage;
		}

		public Integer getAndroidBadgeAddNum() {
			return this.androidBadgeAddNum;
		}

		public void setAndroidBadgeAddNum(Integer androidBadgeAddNum) {
			this.androidBadgeAddNum = androidBadgeAddNum;
		}

		public String getAndroidHuaweiReceiptId() {
			return this.androidHuaweiReceiptId;
		}

		public void setAndroidHuaweiReceiptId(String androidHuaweiReceiptId) {
			this.androidHuaweiReceiptId = androidHuaweiReceiptId;
		}

		public String getAndroidNotificationHonorChannel() {
			return this.androidNotificationHonorChannel;
		}

		public void setAndroidNotificationHonorChannel(String androidNotificationHonorChannel) {
			this.androidNotificationHonorChannel = androidNotificationHonorChannel;
		}

		public Integer getAndroidTargetUserType() {
			return this.androidTargetUserType;
		}

		public void setAndroidTargetUserType(Integer androidTargetUserType) {
			this.androidTargetUserType = androidTargetUserType;
		}

		public String getAndroidPopupBody() {
			return this.androidPopupBody;
		}

		public void setAndroidPopupBody(String androidPopupBody) {
			this.androidPopupBody = androidPopupBody;
		}

		public String getAndroidNotificationGroup() {
			return this.androidNotificationGroup;
		}

		public void setAndroidNotificationGroup(String androidNotificationGroup) {
			this.androidNotificationGroup = androidNotificationGroup;
		}

		public String getSendChannels() {
			return this.sendChannels;
		}

		public void setSendChannels(String sendChannels) {
			this.sendChannels = sendChannels;
		}

		public String getHarmonyActionType() {
			return this.harmonyActionType;
		}

		public void setHarmonyActionType(String harmonyActionType) {
			this.harmonyActionType = harmonyActionType;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
		}

		public String getHarmonyInboxContent() {
			return this.harmonyInboxContent;
		}

		public void setHarmonyInboxContent(String harmonyInboxContent) {
			this.harmonyInboxContent = harmonyInboxContent;
		}

		public String getAndroidMessageOppoCategory() {
			return this.androidMessageOppoCategory;
		}

		public void setAndroidMessageOppoCategory(String androidMessageOppoCategory) {
			this.androidMessageOppoCategory = androidMessageOppoCategory;
		}

		public String getAndroidXiaoMiActivity() {
			return this.androidXiaoMiActivity;
		}

		public void setAndroidXiaoMiActivity(String androidXiaoMiActivity) {
			this.androidXiaoMiActivity = androidXiaoMiActivity;
		}
	}

	@Override
	public Class<MassPushResponse> getResponseClass() {
		return MassPushResponse.class;
	}

}
