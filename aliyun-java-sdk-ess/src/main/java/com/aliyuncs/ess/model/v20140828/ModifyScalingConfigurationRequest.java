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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ModifyScalingConfigurationRequest extends RpcAcsRequest<ModifyScalingConfigurationResponse> {
	
	public ModifyScalingConfigurationRequest() {
		super("Ess", "2014-08-28", "ModifyScalingConfiguration", "ess");
	}

	private String imageId;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private List<String> instanceTypess;

	private Integer internetMaxBandwidthOut;

	private String ramRoleName;

	private String keyPairName;

	private Long ownerId;

	private String systemDiskCategory;

	private String scalingConfigurationName;

	private String tags;

	private String scalingConfigurationId;

	private String userData;

	private String hostName;

	private String instanceName;

	private Integer loadBalancerWeight;

	private Boolean passwordInherit;

	private Integer systemDiskSize;

	private String internetChargeType;

	public String getImageId() {
		return this.imageId;
	}

	public void setImageId(String imageId) {
		this.imageId = imageId;
		if(imageId != null){
			putQueryParameter("ImageId", imageId);
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

	public List<String> getInstanceTypess() {
		return this.instanceTypess;
	}

	public void setInstanceTypess(List<String> instanceTypess) {
		this.instanceTypess = instanceTypess;	
		if (instanceTypess != null) {
			for (int i = 0; i < instanceTypess.size(); i++) {
				putQueryParameter("InstanceTypes." + (i + 1) , instanceTypess.get(i));
			}
		}	
	}

	public Integer getInternetMaxBandwidthOut() {
		return this.internetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
		this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		if(internetMaxBandwidthOut != null){
			putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut.toString());
		}
	}

	public String getRamRoleName() {
		return this.ramRoleName;
	}

	public void setRamRoleName(String ramRoleName) {
		this.ramRoleName = ramRoleName;
		if(ramRoleName != null){
			putQueryParameter("RamRoleName", ramRoleName);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getSystemDiskCategory() {
		return this.systemDiskCategory;
	}

	public void setSystemDiskCategory(String systemDiskCategory) {
		this.systemDiskCategory = systemDiskCategory;
		if(systemDiskCategory != null){
			putQueryParameter("SystemDisk.Category", systemDiskCategory);
		}
	}

	public String getScalingConfigurationName() {
		return this.scalingConfigurationName;
	}

	public void setScalingConfigurationName(String scalingConfigurationName) {
		this.scalingConfigurationName = scalingConfigurationName;
		if(scalingConfigurationName != null){
			putQueryParameter("ScalingConfigurationName", scalingConfigurationName);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	public String getScalingConfigurationId() {
		return this.scalingConfigurationId;
	}

	public void setScalingConfigurationId(String scalingConfigurationId) {
		this.scalingConfigurationId = scalingConfigurationId;
		if(scalingConfigurationId != null){
			putQueryParameter("ScalingConfigurationId", scalingConfigurationId);
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

	public String getHostName() {
		return this.hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
		if(hostName != null){
			putQueryParameter("HostName", hostName);
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public Integer getLoadBalancerWeight() {
		return this.loadBalancerWeight;
	}

	public void setLoadBalancerWeight(Integer loadBalancerWeight) {
		this.loadBalancerWeight = loadBalancerWeight;
		if(loadBalancerWeight != null){
			putQueryParameter("LoadBalancerWeight", loadBalancerWeight.toString());
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

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDisk.Size", systemDiskSize.toString());
		}
	}

	public String getInternetChargeType() {
		return this.internetChargeType;
	}

	public void setInternetChargeType(String internetChargeType) {
		this.internetChargeType = internetChargeType;
		if(internetChargeType != null){
			putQueryParameter("InternetChargeType", internetChargeType);
		}
	}

	@Override
	public Class<ModifyScalingConfigurationResponse> getResponseClass() {
		return ModifyScalingConfigurationResponse.class;
	}

}
