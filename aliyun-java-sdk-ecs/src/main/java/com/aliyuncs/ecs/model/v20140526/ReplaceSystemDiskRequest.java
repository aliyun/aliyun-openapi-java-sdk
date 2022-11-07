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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReplaceSystemDiskRequest extends RpcAcsRequest<ReplaceSystemDiskResponse> {
	   

	private Long resourceOwnerId;

	private String imageId;

	private String clientToken;

	private String encryptAlgorithm;

	private String securityEnhancementStrategy;

	private String keyPairName;

	private String platform;

	private String password;

	private Boolean passwordInherit;

	private String diskId;

	private List<Arn> arns;

	private String architecture;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String instanceId;

	private Integer systemDiskSize;

	private Boolean encrypted;

	private String kMSKeyId;

	private Boolean useAdditionalService;
	public ReplaceSystemDiskRequest() {
		super("Ecs", "2014-05-26", "ReplaceSystemDisk");
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

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getEncryptAlgorithm() {
		return this.encryptAlgorithm;
	}

	public void setEncryptAlgorithm(String encryptAlgorithm) {
		this.encryptAlgorithm = encryptAlgorithm;
		if(encryptAlgorithm != null){
			putQueryParameter("EncryptAlgorithm", encryptAlgorithm);
		}
	}

	public String getSecurityEnhancementStrategy() {
		return this.securityEnhancementStrategy;
	}

	public void setSecurityEnhancementStrategy(String securityEnhancementStrategy) {
		this.securityEnhancementStrategy = securityEnhancementStrategy;
		if(securityEnhancementStrategy != null){
			putQueryParameter("SecurityEnhancementStrategy", securityEnhancementStrategy);
		}
	}

	public String getKeyPairName() {
		return this.keyPairName;
	}

	public void setKeyPairName(String keyPairName) {
		this.keyPairName = keyPairName;
		if(keyPairName != null){
			putQueryParameter("KeyPairName", keyPairName);
		}
	}

	public String getPlatform() {
		return this.platform;
	}

	public void setPlatform(String platform) {
		this.platform = platform;
		if(platform != null){
			putQueryParameter("Platform", platform);
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

	public Boolean getPasswordInherit() {
		return this.passwordInherit;
	}

	public void setPasswordInherit(Boolean passwordInherit) {
		this.passwordInherit = passwordInherit;
		if(passwordInherit != null){
			putQueryParameter("PasswordInherit", passwordInherit.toString());
		}
	}

	public String getDiskId() {
		return this.diskId;
	}

	public void setDiskId(String diskId) {
		this.diskId = diskId;
		if(diskId != null){
			putQueryParameter("DiskId", diskId);
		}
	}

	public List<Arn> getArns() {
		return this.arns;
	}

	public void setArns(List<Arn> arns) {
		this.arns = arns;	
		if (arns != null) {
			for (int depth1 = 0; depth1 < arns.size(); depth1++) {
				putQueryParameter("Arn." + (depth1 + 1) + ".Rolearn" , arns.get(depth1).getRolearn());
				putQueryParameter("Arn." + (depth1 + 1) + ".RoleType" , arns.get(depth1).getRoleType());
				putQueryParameter("Arn." + (depth1 + 1) + ".AssumeRoleFor" , arns.get(depth1).getAssumeRoleFor());
			}
		}	
	}

	public String getArchitecture() {
		return this.architecture;
	}

	public void setArchitecture(String architecture) {
		this.architecture = architecture;
		if(architecture != null){
			putQueryParameter("Architecture", architecture);
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDisk.Size", systemDiskSize.toString());
		}
	}

	public Boolean getEncrypted() {
		return this.encrypted;
	}

	public void setEncrypted(Boolean encrypted) {
		this.encrypted = encrypted;
		if(encrypted != null){
			putQueryParameter("Encrypted", encrypted.toString());
		}
	}

	public String getKMSKeyId() {
		return this.kMSKeyId;
	}

	public void setKMSKeyId(String kMSKeyId) {
		this.kMSKeyId = kMSKeyId;
		if(kMSKeyId != null){
			putQueryParameter("KMSKeyId", kMSKeyId);
		}
	}

	public Boolean getUseAdditionalService() {
		return this.useAdditionalService;
	}

	public void setUseAdditionalService(Boolean useAdditionalService) {
		this.useAdditionalService = useAdditionalService;
		if(useAdditionalService != null){
			putQueryParameter("UseAdditionalService", useAdditionalService.toString());
		}
	}

	public static class Arn {

		private String rolearn;

		private String roleType;

		private Long assumeRoleFor;

		public String getRolearn() {
			return this.rolearn;
		}

		public void setRolearn(String rolearn) {
			this.rolearn = rolearn;
		}

		public String getRoleType() {
			return this.roleType;
		}

		public void setRoleType(String roleType) {
			this.roleType = roleType;
		}

		public Long getAssumeRoleFor() {
			return this.assumeRoleFor;
		}

		public void setAssumeRoleFor(Long assumeRoleFor) {
			this.assumeRoleFor = assumeRoleFor;
		}
	}

	@Override
	public Class<ReplaceSystemDiskResponse> getResponseClass() {
		return ReplaceSystemDiskResponse.class;
	}

}
