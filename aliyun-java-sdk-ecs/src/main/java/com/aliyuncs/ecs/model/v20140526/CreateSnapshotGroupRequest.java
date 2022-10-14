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
public class CreateSnapshotGroupRequest extends RpcAcsRequest<CreateSnapshotGroupResponse> {
	   

	private Long resourceOwnerId;

	private Boolean instantAccess;

	private List<String> excludeDiskIds;

	private String description;

	private String resourceGroupId;

	private Integer instantAccessRetentionDays;

	private List<String> diskIds;

	private List<Tag> tags;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private String instanceId;

	private String name;
	public CreateSnapshotGroupRequest() {
		super("Ecs", "2014-05-26", "CreateSnapshotGroup", "ecs");
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

	public Boolean getInstantAccess() {
		return this.instantAccess;
	}

	public void setInstantAccess(Boolean instantAccess) {
		this.instantAccess = instantAccess;
		if(instantAccess != null){
			putQueryParameter("InstantAccess", instantAccess.toString());
		}
	}

	public List<String> getExcludeDiskIds() {
		return this.excludeDiskIds;
	}

	public void setExcludeDiskIds(List<String> excludeDiskIds) {
		this.excludeDiskIds = excludeDiskIds;	
		if (excludeDiskIds != null) {
			for (int i = 0; i < excludeDiskIds.size(); i++) {
				putQueryParameter("ExcludeDiskId." + (i + 1) , excludeDiskIds.get(i));
			}
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

	public Integer getInstantAccessRetentionDays() {
		return this.instantAccessRetentionDays;
	}

	public void setInstantAccessRetentionDays(Integer instantAccessRetentionDays) {
		this.instantAccessRetentionDays = instantAccessRetentionDays;
		if(instantAccessRetentionDays != null){
			putQueryParameter("InstantAccessRetentionDays", instantAccessRetentionDays.toString());
		}
	}

	public List<String> getDiskIds() {
		return this.diskIds;
	}

	public void setDiskIds(List<String> diskIds) {
		this.diskIds = diskIds;	
		if (diskIds != null) {
			for (int i = 0; i < diskIds.size(); i++) {
				putQueryParameter("DiskId." + (i + 1) , diskIds.get(i));
			}
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

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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
	public Class<CreateSnapshotGroupResponse> getResponseClass() {
		return CreateSnapshotGroupResponse.class;
	}

}
