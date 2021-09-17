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

	public List<PushTask> getPushTasks() {
		return this.pushTasks;
	}

	public void setPushTasks(List<PushTask> pushTasks) {
		this.pushTasks = pushTasks;	
		if (pushTasks != null) {
			for (int depth1 = 0; depth1 < pushTasks.size(); depth1++) {
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationBarType" , pushTasks.get(depth1).getAndroidNotificationBarType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".Body" , pushTasks.get(depth1).getBody());
				putBodyParameter("PushTask." + (depth1 + 1) + ".DeviceType" , pushTasks.get(depth1).getDeviceType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".PushTime" , pushTasks.get(depth1).getPushTime());
				putBodyParameter("PushTask." + (depth1 + 1) + ".SendSpeed" , pushTasks.get(depth1).getSendSpeed());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationHuaweiChannel" , pushTasks.get(depth1).getAndroidNotificationHuaweiChannel());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidPopupActivity" , pushTasks.get(depth1).getAndroidPopupActivity());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSRemindBody" , pushTasks.get(depth1).getIOSRemindBody());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotifyType" , pushTasks.get(depth1).getAndroidNotifyType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidPopupTitle" , pushTasks.get(depth1).getAndroidPopupTitle());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidMessageHuaweiCategory" , pushTasks.get(depth1).getAndroidMessageHuaweiCategory());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSMusic" , pushTasks.get(depth1).getIOSMusic());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSApnsEnv" , pushTasks.get(depth1).getIOSApnsEnv());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSMutableContent" , pushTasks.get(depth1).getIOSMutableContent());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationBarPriority" , pushTasks.get(depth1).getAndroidNotificationBarPriority());
				putBodyParameter("PushTask." + (depth1 + 1) + ".ExpireTime" , pushTasks.get(depth1).getExpireTime());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidImageUrl" , pushTasks.get(depth1).getAndroidImageUrl());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationVivoChannel" , pushTasks.get(depth1).getAndroidNotificationVivoChannel());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSNotificationCategory" , pushTasks.get(depth1).getIOSNotificationCategory());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationXiaomiChannel" , pushTasks.get(depth1).getAndroidNotificationXiaomiChannel());
				putBodyParameter("PushTask." + (depth1 + 1) + ".StoreOffline" , pushTasks.get(depth1).getStoreOffline());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidInboxBody" , pushTasks.get(depth1).getAndroidInboxBody());
				putBodyParameter("PushTask." + (depth1 + 1) + ".JobKey" , pushTasks.get(depth1).getJobKey());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidOpenUrl" , pushTasks.get(depth1).getAndroidOpenUrl());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidXiaoMiNotifyBody" , pushTasks.get(depth1).getAndroidXiaoMiNotifyBody());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSSubtitle" , pushTasks.get(depth1).getIOSSubtitle());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidXiaomiBigPictureUrl" , pushTasks.get(depth1).getAndroidXiaomiBigPictureUrl());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSRemind" , pushTasks.get(depth1).getIOSRemind());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSNotificationThreadId" , pushTasks.get(depth1).getIOSNotificationThreadId());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidMusic" , pushTasks.get(depth1).getAndroidMusic());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSNotificationCollapseId" , pushTasks.get(depth1).getIOSNotificationCollapseId());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidMessageHuaweiUrgency" , pushTasks.get(depth1).getAndroidMessageHuaweiUrgency());
				putBodyParameter("PushTask." + (depth1 + 1) + ".PushType" , pushTasks.get(depth1).getPushType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidExtParameters" , pushTasks.get(depth1).getAndroidExtParameters());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSBadge" , pushTasks.get(depth1).getIOSBadge());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidBigBody" , pushTasks.get(depth1).getAndroidBigBody());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSBadgeAutoIncrement" , pushTasks.get(depth1).getIOSBadgeAutoIncrement());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidOpenType" , pushTasks.get(depth1).getAndroidOpenType());
				putBodyParameter("PushTask." + (depth1 + 1) + ".Title" , pushTasks.get(depth1).getTitle());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidRenderStyle" , pushTasks.get(depth1).getAndroidRenderStyle());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSExtParameters" , pushTasks.get(depth1).getIOSExtParameters());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidXiaomiImageUrl" , pushTasks.get(depth1).getAndroidXiaomiImageUrl());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidPopupBody" , pushTasks.get(depth1).getAndroidPopupBody());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidBigPictureUrl" , pushTasks.get(depth1).getAndroidBigPictureUrl());
				putBodyParameter("PushTask." + (depth1 + 1) + ".iOSSilentNotification" , pushTasks.get(depth1).getIOSSilentNotification());
				putBodyParameter("PushTask." + (depth1 + 1) + ".SendChannels" , pushTasks.get(depth1).getSendChannels());
				putBodyParameter("PushTask." + (depth1 + 1) + ".Target" , pushTasks.get(depth1).getTarget());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidBigTitle" , pushTasks.get(depth1).getAndroidBigTitle());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationChannel" , pushTasks.get(depth1).getAndroidNotificationChannel());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidRemind" , pushTasks.get(depth1).getAndroidRemind());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidActivity" , pushTasks.get(depth1).getAndroidActivity());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidNotificationNotifyId" , pushTasks.get(depth1).getAndroidNotificationNotifyId());
				putBodyParameter("PushTask." + (depth1 + 1) + ".TargetValue" , pushTasks.get(depth1).getTargetValue());
				putBodyParameter("PushTask." + (depth1 + 1) + ".AndroidXiaoMiNotifyTitle" , pushTasks.get(depth1).getAndroidXiaoMiNotifyTitle());
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

		private String body;

		private String deviceType;

		private String pushTime;

		private Integer sendSpeed;

		private String androidNotificationHuaweiChannel;

		private String androidPopupActivity;

		private String iOSRemindBody;

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

		private String androidExtParameters;

		private Integer iOSBadge;

		private String androidBigBody;

		private Boolean iOSBadgeAutoIncrement;

		private String androidOpenType;

		private String title;

		private String androidRenderStyle;

		private String iOSExtParameters;

		private String androidXiaomiImageUrl;

		private String androidPopupBody;

		private String androidBigPictureUrl;

		private Boolean iOSSilentNotification;

		private String sendChannels;

		private String target;

		private String androidBigTitle;

		private String androidNotificationChannel;

		private Boolean androidRemind;

		private String androidActivity;

		private Integer androidNotificationNotifyId;

		private String targetValue;

		private String androidXiaoMiNotifyTitle;

		private String androidXiaoMiActivity;

		public Integer getAndroidNotificationBarType() {
			return this.androidNotificationBarType;
		}

		public void setAndroidNotificationBarType(Integer androidNotificationBarType) {
			this.androidNotificationBarType = androidNotificationBarType;
		}

		public String getBody() {
			return this.body;
		}

		public void setBody(String body) {
			this.body = body;
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

		public String getIOSRemindBody() {
			return this.iOSRemindBody;
		}

		public void setIOSRemindBody(String iOSRemindBody) {
			this.iOSRemindBody = iOSRemindBody;
		}

		public String getAndroidNotifyType() {
			return this.androidNotifyType;
		}

		public void setAndroidNotifyType(String androidNotifyType) {
			this.androidNotifyType = androidNotifyType;
		}

		public String getAndroidPopupTitle() {
			return this.androidPopupTitle;
		}

		public void setAndroidPopupTitle(String androidPopupTitle) {
			this.androidPopupTitle = androidPopupTitle;
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

		public String getIOSApnsEnv() {
			return this.iOSApnsEnv;
		}

		public void setIOSApnsEnv(String iOSApnsEnv) {
			this.iOSApnsEnv = iOSApnsEnv;
		}

		public Boolean getIOSMutableContent() {
			return this.iOSMutableContent;
		}

		public void setIOSMutableContent(Boolean iOSMutableContent) {
			this.iOSMutableContent = iOSMutableContent;
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

		public String getAndroidNotificationVivoChannel() {
			return this.androidNotificationVivoChannel;
		}

		public void setAndroidNotificationVivoChannel(String androidNotificationVivoChannel) {
			this.androidNotificationVivoChannel = androidNotificationVivoChannel;
		}

		public String getIOSNotificationCategory() {
			return this.iOSNotificationCategory;
		}

		public void setIOSNotificationCategory(String iOSNotificationCategory) {
			this.iOSNotificationCategory = iOSNotificationCategory;
		}

		public String getAndroidNotificationXiaomiChannel() {
			return this.androidNotificationXiaomiChannel;
		}

		public void setAndroidNotificationXiaomiChannel(String androidNotificationXiaomiChannel) {
			this.androidNotificationXiaomiChannel = androidNotificationXiaomiChannel;
		}

		public Boolean getStoreOffline() {
			return this.storeOffline;
		}

		public void setStoreOffline(Boolean storeOffline) {
			this.storeOffline = storeOffline;
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

		public String getAndroidOpenUrl() {
			return this.androidOpenUrl;
		}

		public void setAndroidOpenUrl(String androidOpenUrl) {
			this.androidOpenUrl = androidOpenUrl;
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

		public String getAndroidXiaomiBigPictureUrl() {
			return this.androidXiaomiBigPictureUrl;
		}

		public void setAndroidXiaomiBigPictureUrl(String androidXiaomiBigPictureUrl) {
			this.androidXiaomiBigPictureUrl = androidXiaomiBigPictureUrl;
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

		public String getAndroidMusic() {
			return this.androidMusic;
		}

		public void setAndroidMusic(String androidMusic) {
			this.androidMusic = androidMusic;
		}

		public String getIOSNotificationCollapseId() {
			return this.iOSNotificationCollapseId;
		}

		public void setIOSNotificationCollapseId(String iOSNotificationCollapseId) {
			this.iOSNotificationCollapseId = iOSNotificationCollapseId;
		}

		public String getAndroidMessageHuaweiUrgency() {
			return this.androidMessageHuaweiUrgency;
		}

		public void setAndroidMessageHuaweiUrgency(String androidMessageHuaweiUrgency) {
			this.androidMessageHuaweiUrgency = androidMessageHuaweiUrgency;
		}

		public String getPushType() {
			return this.pushType;
		}

		public void setPushType(String pushType) {
			this.pushType = pushType;
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

		public String getAndroidBigBody() {
			return this.androidBigBody;
		}

		public void setAndroidBigBody(String androidBigBody) {
			this.androidBigBody = androidBigBody;
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

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
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

		public String getAndroidXiaomiImageUrl() {
			return this.androidXiaomiImageUrl;
		}

		public void setAndroidXiaomiImageUrl(String androidXiaomiImageUrl) {
			this.androidXiaomiImageUrl = androidXiaomiImageUrl;
		}

		public String getAndroidPopupBody() {
			return this.androidPopupBody;
		}

		public void setAndroidPopupBody(String androidPopupBody) {
			this.androidPopupBody = androidPopupBody;
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

		public String getSendChannels() {
			return this.sendChannels;
		}

		public void setSendChannels(String sendChannels) {
			this.sendChannels = sendChannels;
		}

		public String getTarget() {
			return this.target;
		}

		public void setTarget(String target) {
			this.target = target;
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

		public String getAndroidXiaoMiNotifyTitle() {
			return this.androidXiaoMiNotifyTitle;
		}

		public void setAndroidXiaoMiNotifyTitle(String androidXiaoMiNotifyTitle) {
			this.androidXiaoMiNotifyTitle = androidXiaoMiNotifyTitle;
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
