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

package com.aliyuncs.imm.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imm.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GenerateWebofficeTokenRequest extends RpcAcsRequest<GenerateWebofficeTokenResponse> {
	   

	private String referer;

	@SerializedName("notification")
	private Notification notification;

	private String password;

	private String projectName;

	@SerializedName("watermark")
	private Watermark watermark;

	private String notifyTopicName;

	private String filename;

	private String sourceURI;

	private Boolean externalUploaded;

	private String userData;

	private Long previewPages;

	private Boolean hidecmb;

	private Boolean cachePreview;

	@SerializedName("permission")
	private Permission permission;

	@SerializedName("credentialConfig")
	private CredentialConfig credentialConfig;

	@SerializedName("user")
	private User user;
	public GenerateWebofficeTokenRequest() {
		super("imm", "2020-09-30", "GenerateWebofficeToken", "imm");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReferer() {
		return this.referer;
	}

	public void setReferer(String referer) {
		this.referer = referer;
		if(referer != null){
			putQueryParameter("Referer", referer);
		}
	}

	public Notification getNotification() {
		return this.notification;
	}

	public void setNotification(Notification notification) {
		this.notification = notification;	
		if (notification != null) {
			putQueryParameter("Notification" , new Gson().toJson(notification));
		}	
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getProjectName() {
		return this.projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
		if(projectName != null){
			putQueryParameter("ProjectName", projectName);
		}
	}

	public Watermark getWatermark() {
		return this.watermark;
	}

	public void setWatermark(Watermark watermark) {
		this.watermark = watermark;	
		if (watermark != null) {
			putQueryParameter("Watermark" , new Gson().toJson(watermark));
		}	
	}

	public String getNotifyTopicName() {
		return this.notifyTopicName;
	}

	public void setNotifyTopicName(String notifyTopicName) {
		this.notifyTopicName = notifyTopicName;
		if(notifyTopicName != null){
			putQueryParameter("NotifyTopicName", notifyTopicName);
		}
	}

	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
		if(filename != null){
			putQueryParameter("Filename", filename);
		}
	}

	public String getSourceURI() {
		return this.sourceURI;
	}

	public void setSourceURI(String sourceURI) {
		this.sourceURI = sourceURI;
		if(sourceURI != null){
			putQueryParameter("SourceURI", sourceURI);
		}
	}

	public Boolean getExternalUploaded() {
		return this.externalUploaded;
	}

	public void setExternalUploaded(Boolean externalUploaded) {
		this.externalUploaded = externalUploaded;
		if(externalUploaded != null){
			putQueryParameter("ExternalUploaded", externalUploaded.toString());
		}
	}

	public String getUserData() {
		return this.userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
		if(userData != null){
			putQueryParameter("UserData", userData);
		}
	}

	public Long getPreviewPages() {
		return this.previewPages;
	}

	public void setPreviewPages(Long previewPages) {
		this.previewPages = previewPages;
		if(previewPages != null){
			putQueryParameter("PreviewPages", previewPages.toString());
		}
	}

	public Boolean getHidecmb() {
		return this.hidecmb;
	}

	public void setHidecmb(Boolean hidecmb) {
		this.hidecmb = hidecmb;
		if(hidecmb != null){
			putQueryParameter("Hidecmb", hidecmb.toString());
		}
	}

	public Boolean getCachePreview() {
		return this.cachePreview;
	}

	public void setCachePreview(Boolean cachePreview) {
		this.cachePreview = cachePreview;
		if(cachePreview != null){
			putQueryParameter("CachePreview", cachePreview.toString());
		}
	}

	public Permission getPermission() {
		return this.permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;	
		if (permission != null) {
			putQueryParameter("Permission" , new Gson().toJson(permission));
		}	
	}

	public CredentialConfig getCredentialConfig() {
		return this.credentialConfig;
	}

	public void setCredentialConfig(CredentialConfig credentialConfig) {
		this.credentialConfig = credentialConfig;	
		if (credentialConfig != null) {
			putQueryParameter("CredentialConfig" , new Gson().toJson(credentialConfig));
		}	
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;	
		if (user != null) {
			putQueryParameter("User" , new Gson().toJson(user));
		}	
	}

	public static class Notification {

		@SerializedName("MNS")
		private MNS mNS;

		@SerializedName("RocketMQ")
		private RocketMQ rocketMQ;

		public MNS getMNS() {
			return this.mNS;
		}

		public void setMNS(MNS mNS) {
			this.mNS = mNS;
		}

		public RocketMQ getRocketMQ() {
			return this.rocketMQ;
		}

		public void setRocketMQ(RocketMQ rocketMQ) {
			this.rocketMQ = rocketMQ;
		}

		public static class MNS {

			@SerializedName("Endpoint")
			private String endpoint;

			@SerializedName("TopicName")
			private String topicName;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}
		}

		public static class RocketMQ {

			@SerializedName("Endpoint")
			private String endpoint;

			@SerializedName("InstanceId")
			private String instanceId;

			@SerializedName("TopicName")
			private String topicName;

			public String getEndpoint() {
				return this.endpoint;
			}

			public void setEndpoint(String endpoint) {
				this.endpoint = endpoint;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getTopicName() {
				return this.topicName;
			}

			public void setTopicName(String topicName) {
				this.topicName = topicName;
			}
		}
	}

	public static class Watermark {

		@SerializedName("Rotate")
		private Float rotate;

		@SerializedName("Horizontal")
		private Long horizontal;

		@SerializedName("FillStyle")
		private String fillStyle;

		@SerializedName("Vertical")
		private Long vertical;

		@SerializedName("Type")
		private Long type;

		@SerializedName("Value")
		private String value;

		@SerializedName("Font")
		private String font;

		public Float getRotate() {
			return this.rotate;
		}

		public void setRotate(Float rotate) {
			this.rotate = rotate;
		}

		public Long getHorizontal() {
			return this.horizontal;
		}

		public void setHorizontal(Long horizontal) {
			this.horizontal = horizontal;
		}

		public String getFillStyle() {
			return this.fillStyle;
		}

		public void setFillStyle(String fillStyle) {
			this.fillStyle = fillStyle;
		}

		public Long getVertical() {
			return this.vertical;
		}

		public void setVertical(Long vertical) {
			this.vertical = vertical;
		}

		public Long getType() {
			return this.type;
		}

		public void setType(Long type) {
			this.type = type;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getFont() {
			return this.font;
		}

		public void setFont(String font) {
			this.font = font;
		}
	}

	public static class Permission {

		@SerializedName("Print")
		private Boolean print;

		@SerializedName("Readonly")
		private Boolean readonly;

		@SerializedName("Rename")
		private Boolean rename;

		@SerializedName("History")
		private Boolean history;

		@SerializedName("Copy")
		private Boolean copy;

		@SerializedName("Export")
		private Boolean export;

		public Boolean getPrint() {
			return this.print;
		}

		public void setPrint(Boolean print) {
			this.print = print;
		}

		public Boolean getReadonly() {
			return this.readonly;
		}

		public void setReadonly(Boolean readonly) {
			this.readonly = readonly;
		}

		public Boolean getRename() {
			return this.rename;
		}

		public void setRename(Boolean rename) {
			this.rename = rename;
		}

		public Boolean getHistory() {
			return this.history;
		}

		public void setHistory(Boolean history) {
			this.history = history;
		}

		public Boolean getCopy() {
			return this.copy;
		}

		public void setCopy(Boolean copy) {
			this.copy = copy;
		}

		public Boolean getExport() {
			return this.export;
		}

		public void setExport(Boolean export) {
			this.export = export;
		}
	}

	public static class CredentialConfig {

		@SerializedName("Chain")
		private List<ChainItem> chain;

		@SerializedName("ServiceRole")
		private String serviceRole;

		@SerializedName("Policy")
		private String policy;

		public List<ChainItem> getChain() {
			return this.chain;
		}

		public void setChain(List<ChainItem> chain) {
			this.chain = chain;
		}

		public String getServiceRole() {
			return this.serviceRole;
		}

		public void setServiceRole(String serviceRole) {
			this.serviceRole = serviceRole;
		}

		public String getPolicy() {
			return this.policy;
		}

		public void setPolicy(String policy) {
			this.policy = policy;
		}

		public static class ChainItem {

			@SerializedName("Role")
			private String role;

			@SerializedName("RoleType")
			private String roleType;

			@SerializedName("AssumeRoleFor")
			private String assumeRoleFor;

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public String getRoleType() {
				return this.roleType;
			}

			public void setRoleType(String roleType) {
				this.roleType = roleType;
			}

			public String getAssumeRoleFor() {
				return this.assumeRoleFor;
			}

			public void setAssumeRoleFor(String assumeRoleFor) {
				this.assumeRoleFor = assumeRoleFor;
			}
		}
	}

	public static class User {

		@SerializedName("Name")
		private String name;

		@SerializedName("Id")
		private String id;

		@SerializedName("Avatar")
		private String avatar;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getAvatar() {
			return this.avatar;
		}

		public void setAvatar(String avatar) {
			this.avatar = avatar;
		}
	}

	@Override
	public Class<GenerateWebofficeTokenResponse> getResponseClass() {
		return GenerateWebofficeTokenResponse.class;
	}

}
