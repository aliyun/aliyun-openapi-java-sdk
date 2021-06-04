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
public class CreateDiskRequest extends RpcAcsRequest<CreateDiskResponse> {
	   

	private Long resourceOwnerId;

	private String snapshotId;

	private String clientToken;

	private String encryptAlgorithm;

	private String description;

	private String diskName;

	private String resourceGroupId;

	private String diskCategory;

	private Integer storageSetPartitionNumber;

	private String multiAttach;

	private List<Tag> tags;

	private String advancedFeatures;

	private List<Arn> arns;

	private String dedicatedBlockStorageClusterId;

	private String resourceOwnerAccount;

	private String performanceLevel;

	private String ownerAccount;

	private Long ownerId;

	private String instanceId;

	private String storageSetId;

	private Integer size;

	private Boolean encrypted;

	private String zoneId;

	private String kMSKeyId;
	public CreateDiskRequest() {
		super("Ecs", "2014-05-26", "CreateDisk", "ecs");
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

	public String getSnapshotId() {
		return this.snapshotId;
	}

	public void setSnapshotId(String snapshotId) {
		this.snapshotId = snapshotId;
		if(snapshotId != null){
			putQueryParameter("SnapshotId", snapshotId);
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getDiskName() {
		return this.diskName;
	}

	public void setDiskName(String diskName) {
		this.diskName = diskName;
		if(diskName != null){
			putQueryParameter("DiskName", diskName);
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

	public String getDiskCategory() {
		return this.diskCategory;
	}

	public void setDiskCategory(String diskCategory) {
		this.diskCategory = diskCategory;
		if(diskCategory != null){
			putQueryParameter("DiskCategory", diskCategory);
		}
	}

	public Integer getStorageSetPartitionNumber() {
		return this.storageSetPartitionNumber;
	}

	public void setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
		this.storageSetPartitionNumber = storageSetPartitionNumber;
		if(storageSetPartitionNumber != null){
			putQueryParameter("StorageSetPartitionNumber", storageSetPartitionNumber.toString());
		}
	}

	public String getMultiAttach() {
		return this.multiAttach;
	}

	public void setMultiAttach(String multiAttach) {
		this.multiAttach = multiAttach;
		if(multiAttach != null){
			putQueryParameter("MultiAttach", multiAttach);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public String getAdvancedFeatures() {
		return this.advancedFeatures;
	}

	public void setAdvancedFeatures(String advancedFeatures) {
		this.advancedFeatures = advancedFeatures;
		if(advancedFeatures != null){
			putQueryParameter("AdvancedFeatures", advancedFeatures);
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

	public String getDedicatedBlockStorageClusterId() {
		return this.dedicatedBlockStorageClusterId;
	}

	public void setDedicatedBlockStorageClusterId(String dedicatedBlockStorageClusterId) {
		this.dedicatedBlockStorageClusterId = dedicatedBlockStorageClusterId;
		if(dedicatedBlockStorageClusterId != null){
			putQueryParameter("DedicatedBlockStorageClusterId", dedicatedBlockStorageClusterId);
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

	public String getPerformanceLevel() {
		return this.performanceLevel;
	}

	public void setPerformanceLevel(String performanceLevel) {
		this.performanceLevel = performanceLevel;
		if(performanceLevel != null){
			putQueryParameter("PerformanceLevel", performanceLevel);
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

	public String getStorageSetId() {
		return this.storageSetId;
	}

	public void setStorageSetId(String storageSetId) {
		this.storageSetId = storageSetId;
		if(storageSetId != null){
			putQueryParameter("StorageSetId", storageSetId);
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putQueryParameter("Size", size.toString());
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

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
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

	public static class Tag {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
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
	public Class<CreateDiskResponse> getResponseClass() {
		return CreateDiskResponse.class;
	}

}
