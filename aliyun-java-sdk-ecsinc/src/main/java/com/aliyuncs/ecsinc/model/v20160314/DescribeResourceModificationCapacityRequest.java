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

package com.aliyuncs.ecsinc.model.v20160314;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class DescribeResourceModificationCapacityRequest extends RpcAcsRequest<DescribeResourceModificationCapacityResponse> {
	
	public DescribeResourceModificationCapacityRequest() {
		super("EcsInc", "2016-03-14", "DescribeResourceModificationCapacity", "ecs", "innerAPI");
	}

	private Long resourceOwnerId;

	private String targetInstanceType;

	private Boolean migrateAcrossZone;

	private String targetSystemDiskCategory;

	private Long aliUid;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long ownerId;

	private List<String> instanceIds;

	private String bid;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getTargetInstanceType() {
		return this.targetInstanceType;
	}

	public void setTargetInstanceType(String targetInstanceType) {
		this.targetInstanceType = targetInstanceType;
		if(targetInstanceType != null){
			putQueryParameter("TargetInstanceType", targetInstanceType);
		}
	}

	public Boolean getMigrateAcrossZone() {
		return this.migrateAcrossZone;
	}

	public void setMigrateAcrossZone(Boolean migrateAcrossZone) {
		this.migrateAcrossZone = migrateAcrossZone;
		if(migrateAcrossZone != null){
			putQueryParameter("MigrateAcrossZone", migrateAcrossZone.toString());
		}
	}

	public String getTargetSystemDiskCategory() {
		return this.targetSystemDiskCategory;
	}

	public void setTargetSystemDiskCategory(String targetSystemDiskCategory) {
		this.targetSystemDiskCategory = targetSystemDiskCategory;
		if(targetSystemDiskCategory != null){
			putQueryParameter("TargetSystemDiskCategory", targetSystemDiskCategory);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
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

	public List<String> getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(List<String> instanceIds) {
		this.instanceIds = instanceIds;	
		if (instanceIds != null) {
			for (int i = 0; i < instanceIds.size(); i++) {
				putQueryParameter("InstanceId." + (i + 1) , instanceIds.get(i));
			}
		}	
	}

	public String getBid() {
		return this.bid;
	}

	public void setBid(String bid) {
		this.bid = bid;
		if(bid != null){
			putQueryParameter("Bid", bid);
		}
	}

	@Override
	public Class<DescribeResourceModificationCapacityResponse> getResponseClass() {
		return DescribeResourceModificationCapacityResponse.class;
	}

}
