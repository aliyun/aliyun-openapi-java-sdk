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
public class CreateImagePipelineRequest extends RpcAcsRequest<CreateImagePipelineResponse> {
	   

	private String baseImageType;

	private Long resourceOwnerId;

	private String clientToken;

	private List<String> toRegionIds;

	private Integer internetMaxBandwidthOut;

	private String description;

	private String resourceGroupId;

	private String imageName;

	private Integer systemDiskSize;

	private String instanceType;

	private List<Tag> tags;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String baseImage;

	private String vSwitchId;

	private List<Long> addAccounts;

	private Boolean deleteInstanceOnFailure;

	private String name;

	private String buildContent;
	public CreateImagePipelineRequest() {
		super("Ecs", "2014-05-26", "CreateImagePipeline", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBaseImageType() {
		return this.baseImageType;
	}

	public void setBaseImageType(String baseImageType) {
		this.baseImageType = baseImageType;
		if(baseImageType != null){
			putQueryParameter("BaseImageType", baseImageType);
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public List<String> getToRegionIds() {
		return this.toRegionIds;
	}

	public void setToRegionIds(List<String> toRegionIds) {
		this.toRegionIds = toRegionIds;	
		if (toRegionIds != null) {
			for (int i = 0; i < toRegionIds.size(); i++) {
				putQueryParameter("ToRegionId." + (i + 1) , toRegionIds.get(i));
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getImageName() {
		return this.imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
		if(imageName != null){
			putQueryParameter("ImageName", imageName);
		}
	}

	public Integer getSystemDiskSize() {
		return this.systemDiskSize;
	}

	public void setSystemDiskSize(Integer systemDiskSize) {
		this.systemDiskSize = systemDiskSize;
		if(systemDiskSize != null){
			putQueryParameter("SystemDiskSize", systemDiskSize.toString());
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
			}
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

	public String getBaseImage() {
		return this.baseImage;
	}

	public void setBaseImage(String baseImage) {
		this.baseImage = baseImage;
		if(baseImage != null){
			putQueryParameter("BaseImage", baseImage);
		}
	}

	public String getVSwitchId() {
		return this.vSwitchId;
	}

	public void setVSwitchId(String vSwitchId) {
		this.vSwitchId = vSwitchId;
		if(vSwitchId != null){
			putQueryParameter("VSwitchId", vSwitchId);
		}
	}

	public List<Long> getAddAccounts() {
		return this.addAccounts;
	}

	public void setAddAccounts(List<Long> addAccounts) {
		this.addAccounts = addAccounts;	
		if (addAccounts != null) {
			for (int i = 0; i < addAccounts.size(); i++) {
				putQueryParameter("AddAccount." + (i + 1) , addAccounts.get(i));
			}
		}	
	}

	public Boolean getDeleteInstanceOnFailure() {
		return this.deleteInstanceOnFailure;
	}

	public void setDeleteInstanceOnFailure(Boolean deleteInstanceOnFailure) {
		this.deleteInstanceOnFailure = deleteInstanceOnFailure;
		if(deleteInstanceOnFailure != null){
			putQueryParameter("DeleteInstanceOnFailure", deleteInstanceOnFailure.toString());
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getBuildContent() {
		return this.buildContent;
	}

	public void setBuildContent(String buildContent) {
		this.buildContent = buildContent;
		if(buildContent != null){
			putQueryParameter("BuildContent", buildContent);
		}
	}

	public static class Tag {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<CreateImagePipelineResponse> getResponseClass() {
		return CreateImagePipelineResponse.class;
	}

}
