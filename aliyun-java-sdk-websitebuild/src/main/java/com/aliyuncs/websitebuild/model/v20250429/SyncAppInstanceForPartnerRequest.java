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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SyncAppInstanceForPartnerRequest extends RpcAcsRequest<SyncAppInstanceForPartnerResponse> {
	   

	@SerializedName("appInstance")
	private AppInstance appInstance;

	private String sourceBizId;

	private String operator;

	private String eventType;

	private String sourceType;
	public SyncAppInstanceForPartnerRequest() {
		super("WebsiteBuild", "2025-04-29", "SyncAppInstanceForPartner");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public AppInstance getAppInstance() {
		return this.appInstance;
	}

	public void setAppInstance(AppInstance appInstance) {
		this.appInstance = appInstance;	
		if (appInstance != null) {
			putQueryParameter("AppInstance" , new Gson().toJson(appInstance));
		}	
	}

	public String getSourceBizId() {
		return this.sourceBizId;
	}

	public void setSourceBizId(String sourceBizId) {
		this.sourceBizId = sourceBizId;
		if(sourceBizId != null){
			putQueryParameter("SourceBizId", sourceBizId);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
		}
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putQueryParameter("EventType", eventType);
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public static class AppInstance {

		@SerializedName("AppType")
		private String appType;

		@SerializedName("Profile")
		private Profile profile;

		@SerializedName("SiteHost")
		private String siteHost;

		@SerializedName("EndTime")
		private String endTime;

		@SerializedName("StartTime")
		private String startTime;

		@SerializedName("UserId")
		private String userId;

		@SerializedName("GmtPublish")
		private String gmtPublish;

		@SerializedName("Deleted")
		private String deleted;

		@SerializedName("Domain")
		private String domain;

		@SerializedName("BizId")
		private String bizId;

		@SerializedName("Name")
		private String name;

		@SerializedName("IconUrl")
		private String iconUrl;

		@SerializedName("GmtDelete")
		private String gmtDelete;

		@SerializedName("Slug")
		private String slug;

		@SerializedName("ThumbnailUrl")
		private String thumbnailUrl;

		@SerializedName("Status")
		private String status;

		public String getAppType() {
			return this.appType;
		}

		public void setAppType(String appType) {
			this.appType = appType;
		}

		public Profile getProfile() {
			return this.profile;
		}

		public void setProfile(Profile profile) {
			this.profile = profile;
		}

		public String getSiteHost() {
			return this.siteHost;
		}

		public void setSiteHost(String siteHost) {
			this.siteHost = siteHost;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getUserId() {
			return this.userId;
		}

		public void setUserId(String userId) {
			this.userId = userId;
		}

		public String getGmtPublish() {
			return this.gmtPublish;
		}

		public void setGmtPublish(String gmtPublish) {
			this.gmtPublish = gmtPublish;
		}

		public String getDeleted() {
			return this.deleted;
		}

		public void setDeleted(String deleted) {
			this.deleted = deleted;
		}

		public String getDomain() {
			return this.domain;
		}

		public void setDomain(String domain) {
			this.domain = domain;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIconUrl() {
			return this.iconUrl;
		}

		public void setIconUrl(String iconUrl) {
			this.iconUrl = iconUrl;
		}

		public String getGmtDelete() {
			return this.gmtDelete;
		}

		public void setGmtDelete(String gmtDelete) {
			this.gmtDelete = gmtDelete;
		}

		public String getSlug() {
			return this.slug;
		}

		public void setSlug(String slug) {
			this.slug = slug;
		}

		public String getThumbnailUrl() {
			return this.thumbnailUrl;
		}

		public void setThumbnailUrl(String thumbnailUrl) {
			this.thumbnailUrl = thumbnailUrl;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public static class Profile {

			@SerializedName("DeployArea")
			private String deployArea;

			@SerializedName("TemplateEtag")
			private String templateEtag;

			@SerializedName("OrderId")
			private String orderId;

			@SerializedName("LxInstanceId")
			private String lxInstanceId;

			@SerializedName("SiteVersion")
			private String siteVersion;

			@SerializedName("TemplateId")
			private String templateId;

			public String getDeployArea() {
				return this.deployArea;
			}

			public void setDeployArea(String deployArea) {
				this.deployArea = deployArea;
			}

			public String getTemplateEtag() {
				return this.templateEtag;
			}

			public void setTemplateEtag(String templateEtag) {
				this.templateEtag = templateEtag;
			}

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
			}

			public String getLxInstanceId() {
				return this.lxInstanceId;
			}

			public void setLxInstanceId(String lxInstanceId) {
				this.lxInstanceId = lxInstanceId;
			}

			public String getSiteVersion() {
				return this.siteVersion;
			}

			public void setSiteVersion(String siteVersion) {
				this.siteVersion = siteVersion;
			}

			public String getTemplateId() {
				return this.templateId;
			}

			public void setTemplateId(String templateId) {
				this.templateId = templateId;
			}
		}
	}

	@Override
	public Class<SyncAppInstanceForPartnerResponse> getResponseClass() {
		return SyncAppInstanceForPartnerResponse.class;
	}

}
