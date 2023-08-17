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
public class CopySnapshotRequest extends RpcAcsRequest<CopySnapshotResponse> {
	   

	private Long resourceOwnerId;

	private String snapshotId;

	private String destinationRegionId;

	private String resourceGroupId;

	private List<Tag> tags;

	private List<Arn> arns;

	private String resourceOwnerAccount;

	private Long ownerId;

	private String destinationSnapshotName;

	private String destinationSnapshotDescription;

	private Boolean encrypted;

	private Integer retentionDays;

	private String kMSKeyId;

	private String destinationStorageLocationArn;
	public CopySnapshotRequest() {
		super("Ecs", "2014-05-26", "CopySnapshot", "ecs");
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

	public String getDestinationRegionId() {
		return this.destinationRegionId;
	}

	public void setDestinationRegionId(String destinationRegionId) {
		this.destinationRegionId = destinationRegionId;
		if(destinationRegionId != null){
			putQueryParameter("DestinationRegionId", destinationRegionId);
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

	public List<Arn> getArns() {
		return this.arns;
	}

	public void setArns(List<Arn> arns) {
		this.arns = arns;	
		if (arns != null) {
			for (int depth1 = 0; depth1 < arns.size(); depth1++) {
				putQueryParameter("Arn." + (depth1 + 1) + ".RoleType" , arns.get(depth1).getRoleType());
				putQueryParameter("Arn." + (depth1 + 1) + ".Rolearn" , arns.get(depth1).getRolearn());
				putQueryParameter("Arn." + (depth1 + 1) + ".AssumeRoleFor" , arns.get(depth1).getAssumeRoleFor());
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getDestinationSnapshotName() {
		return this.destinationSnapshotName;
	}

	public void setDestinationSnapshotName(String destinationSnapshotName) {
		this.destinationSnapshotName = destinationSnapshotName;
		if(destinationSnapshotName != null){
			putQueryParameter("DestinationSnapshotName", destinationSnapshotName);
		}
	}

	public String getDestinationSnapshotDescription() {
		return this.destinationSnapshotDescription;
	}

	public void setDestinationSnapshotDescription(String destinationSnapshotDescription) {
		this.destinationSnapshotDescription = destinationSnapshotDescription;
		if(destinationSnapshotDescription != null){
			putQueryParameter("DestinationSnapshotDescription", destinationSnapshotDescription);
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

	public Integer getRetentionDays() {
		return this.retentionDays;
	}

	public void setRetentionDays(Integer retentionDays) {
		this.retentionDays = retentionDays;
		if(retentionDays != null){
			putQueryParameter("RetentionDays", retentionDays.toString());
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

	public String getDestinationStorageLocationArn() {
		return this.destinationStorageLocationArn;
	}

	public void setDestinationStorageLocationArn(String destinationStorageLocationArn) {
		this.destinationStorageLocationArn = destinationStorageLocationArn;
		if(destinationStorageLocationArn != null){
			putQueryParameter("DestinationStorageLocationArn", destinationStorageLocationArn);
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

	public static class Arn {

		private String roleType;

		private String rolearn;

		private Long assumeRoleFor;

		public String getRoleType() {
			return this.roleType;
		}

		public void setRoleType(String roleType) {
			this.roleType = roleType;
		}

		public String getRolearn() {
			return this.rolearn;
		}

		public void setRolearn(String rolearn) {
			this.rolearn = rolearn;
		}

		public Long getAssumeRoleFor() {
			return this.assumeRoleFor;
		}

		public void setAssumeRoleFor(Long assumeRoleFor) {
			this.assumeRoleFor = assumeRoleFor;
		}
	}

	@Override
	public Class<CopySnapshotResponse> getResponseClass() {
		return CopySnapshotResponse.class;
	}

}
