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
public class CreateAutoSnapshotPolicyRequest extends RpcAcsRequest<CreateAutoSnapshotPolicyResponse> {
	   

	private Long resourceOwnerId;

	private CopyEncryptionConfiguration copyEncryptionConfiguration;

	private Integer copiedSnapshotsRetentionDays;

	private String timePoints;

	private String repeatWeekdays;

	private String resourceGroupId;

	private String storageLocationArn;

	private List<Tag> tags;

	private Boolean enableCrossRegionCopy;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String autoSnapshotPolicyName;

	private Integer retentionDays;

	private String targetCopyRegions;
	public CreateAutoSnapshotPolicyRequest() {
		super("Ecs", "2014-05-26", "CreateAutoSnapshotPolicy", "ecs");
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

	public CopyEncryptionConfiguration getCopyEncryptionConfiguration() {
		return this.copyEncryptionConfiguration;
	}

	public void setCopyEncryptionConfiguration(CopyEncryptionConfiguration copyEncryptionConfiguration) {
		this.copyEncryptionConfiguration = copyEncryptionConfiguration;	
		if (copyEncryptionConfiguration != null) {
			
				putQueryParameter("CopyEncryptionConfiguration.Encrypted" , copyEncryptionConfiguration.getEncrypted());
				putQueryParameter("CopyEncryptionConfiguration.KMSKeyId" , copyEncryptionConfiguration.getKMSKeyId());
				if (copyEncryptionConfiguration.getArn() != null) {
					for (int depth1 = 0; depth1 < copyEncryptionConfiguration.getArn().size(); depth1++) {
						if (copyEncryptionConfiguration.getArn().get(depth1) != null) {
							
								putQueryParameter("CopyEncryptionConfiguration.Arn." + (depth1 + 1) + ".Rolearn" , copyEncryptionConfiguration.getArn().get(depth1).getRolearn());
								putQueryParameter("CopyEncryptionConfiguration.Arn." + (depth1 + 1) + ".RoleType" , copyEncryptionConfiguration.getArn().get(depth1).getRoleType());
								putQueryParameter("CopyEncryptionConfiguration.Arn." + (depth1 + 1) + ".AssumeRoleFor" , copyEncryptionConfiguration.getArn().get(depth1).getAssumeRoleFor());
						}
					}
				}
		}	
	}

	public Integer getCopiedSnapshotsRetentionDays() {
		return this.copiedSnapshotsRetentionDays;
	}

	public void setCopiedSnapshotsRetentionDays(Integer copiedSnapshotsRetentionDays) {
		this.copiedSnapshotsRetentionDays = copiedSnapshotsRetentionDays;
		if(copiedSnapshotsRetentionDays != null){
			putQueryParameter("CopiedSnapshotsRetentionDays", copiedSnapshotsRetentionDays.toString());
		}
	}

	public String getTimePoints() {
		return this.timePoints;
	}

	public void setTimePoints(String timePoints) {
		this.timePoints = timePoints;
		if(timePoints != null){
			putQueryParameter("timePoints", timePoints);
		}
	}

	public String getRepeatWeekdays() {
		return this.repeatWeekdays;
	}

	public void setRepeatWeekdays(String repeatWeekdays) {
		this.repeatWeekdays = repeatWeekdays;
		if(repeatWeekdays != null){
			putQueryParameter("repeatWeekdays", repeatWeekdays);
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

	public String getStorageLocationArn() {
		return this.storageLocationArn;
	}

	public void setStorageLocationArn(String storageLocationArn) {
		this.storageLocationArn = storageLocationArn;
		if(storageLocationArn != null){
			putQueryParameter("StorageLocationArn", storageLocationArn);
		}
	}

	public List<Tag> getTags() {
		return this.tags;
	}

	public void setTags(List<Tag> tags) {
		this.tags = tags;	
		if (tags != null) {
			for (int depth1 = 0; depth1 < tags.size(); depth1++) {
				putQueryParameter("Tag." + (depth1 + 1) + ".Value" , tags.get(depth1).getValue());
				putQueryParameter("Tag." + (depth1 + 1) + ".Key" , tags.get(depth1).getKey());
			}
		}	
	}

	public Boolean getEnableCrossRegionCopy() {
		return this.enableCrossRegionCopy;
	}

	public void setEnableCrossRegionCopy(Boolean enableCrossRegionCopy) {
		this.enableCrossRegionCopy = enableCrossRegionCopy;
		if(enableCrossRegionCopy != null){
			putQueryParameter("EnableCrossRegionCopy", enableCrossRegionCopy.toString());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getAutoSnapshotPolicyName() {
		return this.autoSnapshotPolicyName;
	}

	public void setAutoSnapshotPolicyName(String autoSnapshotPolicyName) {
		this.autoSnapshotPolicyName = autoSnapshotPolicyName;
		if(autoSnapshotPolicyName != null){
			putQueryParameter("autoSnapshotPolicyName", autoSnapshotPolicyName);
		}
	}

	public Integer getRetentionDays() {
		return this.retentionDays;
	}

	public void setRetentionDays(Integer retentionDays) {
		this.retentionDays = retentionDays;
		if(retentionDays != null){
			putQueryParameter("retentionDays", retentionDays.toString());
		}
	}

	public String getTargetCopyRegions() {
		return this.targetCopyRegions;
	}

	public void setTargetCopyRegions(String targetCopyRegions) {
		this.targetCopyRegions = targetCopyRegions;
		if(targetCopyRegions != null){
			putQueryParameter("TargetCopyRegions", targetCopyRegions);
		}
	}

	public static class CopyEncryptionConfiguration {

		private Boolean encrypted;

		private String kMSKeyId;

		private List<ArnItem> arn;

		public Boolean getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(Boolean encrypted) {
			this.encrypted = encrypted;
		}

		public String getKMSKeyId() {
			return this.kMSKeyId;
		}

		public void setKMSKeyId(String kMSKeyId) {
			this.kMSKeyId = kMSKeyId;
		}

		public List<ArnItem> getArn() {
			return this.arn;
		}

		public void setArn(List<ArnItem> arn) {
			this.arn = arn;
		}

		public static class ArnItem {

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

	@Override
	public Class<CreateAutoSnapshotPolicyResponse> getResponseClass() {
		return CreateAutoSnapshotPolicyResponse.class;
	}

}
