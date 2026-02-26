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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyCloudAssistantSettingsRequest extends RpcAcsRequest<ModifyCloudAssistantSettingsResponse> {
	   

	private Long resourceOwnerId;

	@SerializedName("agentUpgradeConfig")
	private AgentUpgradeConfig agentUpgradeConfig;

	@SerializedName("ossDeliveryConfig")
	private OssDeliveryConfig ossDeliveryConfig;

	@SerializedName("sessionManagerConfig")
	private SessionManagerConfig sessionManagerConfig;

	private String settingType;

	@SerializedName("slsDeliveryConfig")
	private SlsDeliveryConfig slsDeliveryConfig;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;
	public ModifyCloudAssistantSettingsRequest() {
		super("Ecs", "2014-05-26", "ModifyCloudAssistantSettings", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public AgentUpgradeConfig getAgentUpgradeConfig() {
		return this.agentUpgradeConfig;
	}

	public void setAgentUpgradeConfig(AgentUpgradeConfig agentUpgradeConfig) {
		this.agentUpgradeConfig = agentUpgradeConfig;	
		if (agentUpgradeConfig != null) {
			putQueryParameter("AgentUpgradeConfig" , new Gson().toJson(agentUpgradeConfig));
		}	
	}

	public OssDeliveryConfig getOssDeliveryConfig() {
		return this.ossDeliveryConfig;
	}

	public void setOssDeliveryConfig(OssDeliveryConfig ossDeliveryConfig) {
		this.ossDeliveryConfig = ossDeliveryConfig;	
		if (ossDeliveryConfig != null) {
			putQueryParameter("OssDeliveryConfig" , new Gson().toJson(ossDeliveryConfig));
		}	
	}

	public SessionManagerConfig getSessionManagerConfig() {
		return this.sessionManagerConfig;
	}

	public void setSessionManagerConfig(SessionManagerConfig sessionManagerConfig) {
		this.sessionManagerConfig = sessionManagerConfig;	
		if (sessionManagerConfig != null) {
			putQueryParameter("SessionManagerConfig" , new Gson().toJson(sessionManagerConfig));
		}	
	}

	public String getSettingType() {
		return this.settingType;
	}

	public void setSettingType(String settingType) {
		this.settingType = settingType;
		if(settingType != null){
			putQueryParameter("SettingType", settingType);
		}
	}

	public SlsDeliveryConfig getSlsDeliveryConfig() {
		return this.slsDeliveryConfig;
	}

	public void setSlsDeliveryConfig(SlsDeliveryConfig slsDeliveryConfig) {
		this.slsDeliveryConfig = slsDeliveryConfig;	
		if (slsDeliveryConfig != null) {
			putQueryParameter("SlsDeliveryConfig" , new Gson().toJson(slsDeliveryConfig));
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

	public static class AgentUpgradeConfig {

		@SerializedName("Enabled")
		private Boolean enabled;

		@SerializedName("AllowedUpgradeWindow")
		private List<String> allowedUpgradeWindow;

		@SerializedName("TimeZone")
		private String timeZone;

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public List<String> getAllowedUpgradeWindow() {
			return this.allowedUpgradeWindow;
		}

		public void setAllowedUpgradeWindow(List<String> allowedUpgradeWindow) {
			this.allowedUpgradeWindow = allowedUpgradeWindow;
		}

		public String getTimeZone() {
			return this.timeZone;
		}

		public void setTimeZone(String timeZone) {
			this.timeZone = timeZone;
		}
	}

	public static class OssDeliveryConfig {

		@SerializedName("Enabled")
		private Boolean enabled;

		@SerializedName("BucketName")
		private String bucketName;

		@SerializedName("Prefix")
		private String prefix;

		@SerializedName("EncryptionType")
		private String encryptionType;

		@SerializedName("EncryptionAlgorithm")
		private String encryptionAlgorithm;

		@SerializedName("EncryptionKeyId")
		private String encryptionKeyId;

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getBucketName() {
			return this.bucketName;
		}

		public void setBucketName(String bucketName) {
			this.bucketName = bucketName;
		}

		public String getPrefix() {
			return this.prefix;
		}

		public void setPrefix(String prefix) {
			this.prefix = prefix;
		}

		public String getEncryptionType() {
			return this.encryptionType;
		}

		public void setEncryptionType(String encryptionType) {
			this.encryptionType = encryptionType;
		}

		public String getEncryptionAlgorithm() {
			return this.encryptionAlgorithm;
		}

		public void setEncryptionAlgorithm(String encryptionAlgorithm) {
			this.encryptionAlgorithm = encryptionAlgorithm;
		}

		public String getEncryptionKeyId() {
			return this.encryptionKeyId;
		}

		public void setEncryptionKeyId(String encryptionKeyId) {
			this.encryptionKeyId = encryptionKeyId;
		}
	}

	public static class SessionManagerConfig {

		@SerializedName("SessionManagerEnabled")
		private Boolean sessionManagerEnabled;

		public Boolean getSessionManagerEnabled() {
			return this.sessionManagerEnabled;
		}

		public void setSessionManagerEnabled(Boolean sessionManagerEnabled) {
			this.sessionManagerEnabled = sessionManagerEnabled;
		}
	}

	public static class SlsDeliveryConfig {

		@SerializedName("Enabled")
		private Boolean enabled;

		@SerializedName("ProjectName")
		private String projectName;

		@SerializedName("LogstoreName")
		private String logstoreName;

		public Boolean getEnabled() {
			return this.enabled;
		}

		public void setEnabled(Boolean enabled) {
			this.enabled = enabled;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getLogstoreName() {
			return this.logstoreName;
		}

		public void setLogstoreName(String logstoreName) {
			this.logstoreName = logstoreName;
		}
	}

	@Override
	public Class<ModifyCloudAssistantSettingsResponse> getResponseClass() {
		return ModifyCloudAssistantSettingsResponse.class;
	}

}
