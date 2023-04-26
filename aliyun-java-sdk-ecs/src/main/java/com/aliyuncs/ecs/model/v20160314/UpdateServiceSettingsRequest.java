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

package com.aliyuncs.ecs.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateServiceSettingsRequest extends RpcAcsRequest<UpdateServiceSettingsResponse> {
	   

	private String cloudAssistantDeliverySettingsOssBucketName;

	private Long resourceOwnerId;

	@SerializedName("sessionManagerDeliverySetting")
	private SessionManagerDeliverySetting sessionManagerDeliverySetting;

	private String cloudAssistantDeliverySettingsSlsProjectName;

	private String cloudAssistantDeliverySettingsOssKeyPrefix;

	private Boolean cloudAssistantDeliverySettingsSlsEnabled;

	private String cloudAssistantDeliverySettingsSlsLogstoreName;

	private String resourceOwnerAccount;

	private Boolean cloudAssistantDeliverySettingsOssEnabled;

	private String ownerAccount;

	private Long ownerId;
	public UpdateServiceSettingsRequest() {
		super("Ecs", "2016-03-14", "UpdateServiceSettings", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCloudAssistantDeliverySettingsOssBucketName() {
		return this.cloudAssistantDeliverySettingsOssBucketName;
	}

	public void setCloudAssistantDeliverySettingsOssBucketName(String cloudAssistantDeliverySettingsOssBucketName) {
		this.cloudAssistantDeliverySettingsOssBucketName = cloudAssistantDeliverySettingsOssBucketName;
		if(cloudAssistantDeliverySettingsOssBucketName != null){
			putQueryParameter("CloudAssistantDeliverySettings.OssBucketName", cloudAssistantDeliverySettingsOssBucketName);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public SessionManagerDeliverySetting getSessionManagerDeliverySetting() {
		return this.sessionManagerDeliverySetting;
	}

	public void setSessionManagerDeliverySetting(SessionManagerDeliverySetting sessionManagerDeliverySetting) {
		this.sessionManagerDeliverySetting = sessionManagerDeliverySetting;	
		if (sessionManagerDeliverySetting != null) {
			putQueryParameter("SessionManagerDeliverySetting" , new Gson().toJson(sessionManagerDeliverySetting));
		}	
	}

	public String getCloudAssistantDeliverySettingsSlsProjectName() {
		return this.cloudAssistantDeliverySettingsSlsProjectName;
	}

	public void setCloudAssistantDeliverySettingsSlsProjectName(String cloudAssistantDeliverySettingsSlsProjectName) {
		this.cloudAssistantDeliverySettingsSlsProjectName = cloudAssistantDeliverySettingsSlsProjectName;
		if(cloudAssistantDeliverySettingsSlsProjectName != null){
			putQueryParameter("CloudAssistantDeliverySettings.SlsProjectName", cloudAssistantDeliverySettingsSlsProjectName);
		}
	}

	public String getCloudAssistantDeliverySettingsOssKeyPrefix() {
		return this.cloudAssistantDeliverySettingsOssKeyPrefix;
	}

	public void setCloudAssistantDeliverySettingsOssKeyPrefix(String cloudAssistantDeliverySettingsOssKeyPrefix) {
		this.cloudAssistantDeliverySettingsOssKeyPrefix = cloudAssistantDeliverySettingsOssKeyPrefix;
		if(cloudAssistantDeliverySettingsOssKeyPrefix != null){
			putQueryParameter("CloudAssistantDeliverySettings.OssKeyPrefix", cloudAssistantDeliverySettingsOssKeyPrefix);
		}
	}

	public Boolean getCloudAssistantDeliverySettingsSlsEnabled() {
		return this.cloudAssistantDeliverySettingsSlsEnabled;
	}

	public void setCloudAssistantDeliverySettingsSlsEnabled(Boolean cloudAssistantDeliverySettingsSlsEnabled) {
		this.cloudAssistantDeliverySettingsSlsEnabled = cloudAssistantDeliverySettingsSlsEnabled;
		if(cloudAssistantDeliverySettingsSlsEnabled != null){
			putQueryParameter("CloudAssistantDeliverySettings.SlsEnabled", cloudAssistantDeliverySettingsSlsEnabled.toString());
		}
	}

	public String getCloudAssistantDeliverySettingsSlsLogstoreName() {
		return this.cloudAssistantDeliverySettingsSlsLogstoreName;
	}

	public void setCloudAssistantDeliverySettingsSlsLogstoreName(String cloudAssistantDeliverySettingsSlsLogstoreName) {
		this.cloudAssistantDeliverySettingsSlsLogstoreName = cloudAssistantDeliverySettingsSlsLogstoreName;
		if(cloudAssistantDeliverySettingsSlsLogstoreName != null){
			putQueryParameter("CloudAssistantDeliverySettings.SlsLogstoreName", cloudAssistantDeliverySettingsSlsLogstoreName);
		}
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Boolean getCloudAssistantDeliverySettingsOssEnabled() {
		return this.cloudAssistantDeliverySettingsOssEnabled;
	}

	public void setCloudAssistantDeliverySettingsOssEnabled(Boolean cloudAssistantDeliverySettingsOssEnabled) {
		this.cloudAssistantDeliverySettingsOssEnabled = cloudAssistantDeliverySettingsOssEnabled;
		if(cloudAssistantDeliverySettingsOssEnabled != null){
			putQueryParameter("CloudAssistantDeliverySettings.OssEnabled", cloudAssistantDeliverySettingsOssEnabled.toString());
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putQueryParameter("OwnerAccount", ownerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public static class SessionManagerDeliverySetting {

		@SerializedName("OssEnabled")
		private Boolean ossEnabled;

		@SerializedName("OssBucketName")
		private String ossBucketName;

		@SerializedName("OssKeyPrefix")
		private String ossKeyPrefix;

		@SerializedName("OssEncryptionType")
		private String ossEncryptionType;

		@SerializedName("OssEncryptionAlgorithm")
		private String ossEncryptionAlgorithm;

		@SerializedName("OssEncryptionKeyId")
		private String ossEncryptionKeyId;

		@SerializedName("SlsEnabled")
		private Boolean slsEnabled;

		@SerializedName("SlsProjectName")
		private String slsProjectName;

		@SerializedName("SlsLogstoreName")
		private String slsLogstoreName;

		public Boolean getOssEnabled() {
			return this.ossEnabled;
		}

		public void setOssEnabled(Boolean ossEnabled) {
			this.ossEnabled = ossEnabled;
		}

		public String getOssBucketName() {
			return this.ossBucketName;
		}

		public void setOssBucketName(String ossBucketName) {
			this.ossBucketName = ossBucketName;
		}

		public String getOssKeyPrefix() {
			return this.ossKeyPrefix;
		}

		public void setOssKeyPrefix(String ossKeyPrefix) {
			this.ossKeyPrefix = ossKeyPrefix;
		}

		public String getOssEncryptionType() {
			return this.ossEncryptionType;
		}

		public void setOssEncryptionType(String ossEncryptionType) {
			this.ossEncryptionType = ossEncryptionType;
		}

		public String getOssEncryptionAlgorithm() {
			return this.ossEncryptionAlgorithm;
		}

		public void setOssEncryptionAlgorithm(String ossEncryptionAlgorithm) {
			this.ossEncryptionAlgorithm = ossEncryptionAlgorithm;
		}

		public String getOssEncryptionKeyId() {
			return this.ossEncryptionKeyId;
		}

		public void setOssEncryptionKeyId(String ossEncryptionKeyId) {
			this.ossEncryptionKeyId = ossEncryptionKeyId;
		}

		public Boolean getSlsEnabled() {
			return this.slsEnabled;
		}

		public void setSlsEnabled(Boolean slsEnabled) {
			this.slsEnabled = slsEnabled;
		}

		public String getSlsProjectName() {
			return this.slsProjectName;
		}

		public void setSlsProjectName(String slsProjectName) {
			this.slsProjectName = slsProjectName;
		}

		public String getSlsLogstoreName() {
			return this.slsLogstoreName;
		}

		public void setSlsLogstoreName(String slsLogstoreName) {
			this.slsLogstoreName = slsLogstoreName;
		}
	}

	@Override
	public Class<UpdateServiceSettingsResponse> getResponseClass() {
		return UpdateServiceSettingsResponse.class;
	}

}
