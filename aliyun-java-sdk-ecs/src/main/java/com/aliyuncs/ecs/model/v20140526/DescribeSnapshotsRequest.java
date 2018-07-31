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

/**
 * @author auto create
 * @version 
 */
public class DescribeSnapshotsRequest extends RpcAcsRequest<DescribeSnapshotsResponse> {
	
	public DescribeSnapshotsRequest() {
		super("Ecs", "2014-05-26", "DescribeSnapshots", "ecs");
	}

	private String tag4Value;

	private Long resourceOwnerId;

	private String tag2Key;

	private String filter2Value;

	private String snapshotIds;

	private String usage;

	private String snapshotLinkId;

	private String snapshotName;

	private String tag3Key;

	private Integer pageNumber;

	private String tag1Value;

	private String resourceGroupId;

	private String filter1Key;

	private Integer pageSize;

	private String diskId;

	private String tag3Value;

	private Boolean dryRun;

	private String tag5Key;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String sourceDiskType;

	private String filter1Value;

	private String filter2Key;

	private Long ownerId;

	private String tag5Value;

	private String tag1Key;

	private String instanceId;

	private Boolean encrypted;

	private String snapshotType;

	private String tag2Value;

	private String tag4Key;

	private String status;

	public String getTag4Value() {
		return this.tag4Value;
	}

	public void setTag4Value(String tag4Value) {
		this.tag4Value = tag4Value;
		if(tag4Value != null){
			putQueryParameter("Tag.4.Value", tag4Value);
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

	public String getTag2Key() {
		return this.tag2Key;
	}

	public void setTag2Key(String tag2Key) {
		this.tag2Key = tag2Key;
		if(tag2Key != null){
			putQueryParameter("Tag.2.Key", tag2Key);
		}
	}

	public String getFilter2Value() {
		return this.filter2Value;
	}

	public void setFilter2Value(String filter2Value) {
		this.filter2Value = filter2Value;
		if(filter2Value != null){
			putQueryParameter("Filter.2.Value", filter2Value);
		}
	}

	public String getSnapshotIds() {
		return this.snapshotIds;
	}

	public void setSnapshotIds(String snapshotIds) {
		this.snapshotIds = snapshotIds;
		if(snapshotIds != null){
			putQueryParameter("SnapshotIds", snapshotIds);
		}
	}

	public String getUsage() {
		return this.usage;
	}

	public void setUsage(String usage) {
		this.usage = usage;
		if(usage != null){
			putQueryParameter("Usage", usage);
		}
	}

	public String getSnapshotLinkId() {
		return this.snapshotLinkId;
	}

	public void setSnapshotLinkId(String snapshotLinkId) {
		this.snapshotLinkId = snapshotLinkId;
		if(snapshotLinkId != null){
			putQueryParameter("SnapshotLinkId", snapshotLinkId);
		}
	}

	public String getSnapshotName() {
		return this.snapshotName;
	}

	public void setSnapshotName(String snapshotName) {
		this.snapshotName = snapshotName;
		if(snapshotName != null){
			putQueryParameter("SnapshotName", snapshotName);
		}
	}

	public String getTag3Key() {
		return this.tag3Key;
	}

	public void setTag3Key(String tag3Key) {
		this.tag3Key = tag3Key;
		if(tag3Key != null){
			putQueryParameter("Tag.3.Key", tag3Key);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getTag1Value() {
		return this.tag1Value;
	}

	public void setTag1Value(String tag1Value) {
		this.tag1Value = tag1Value;
		if(tag1Value != null){
			putQueryParameter("Tag.1.Value", tag1Value);
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

	public String getFilter1Key() {
		return this.filter1Key;
	}

	public void setFilter1Key(String filter1Key) {
		this.filter1Key = filter1Key;
		if(filter1Key != null){
			putQueryParameter("Filter.1.Key", filter1Key);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public String getTag3Value() {
		return this.tag3Value;
	}

	public void setTag3Value(String tag3Value) {
		this.tag3Value = tag3Value;
		if(tag3Value != null){
			putQueryParameter("Tag.3.Value", tag3Value);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getTag5Key() {
		return this.tag5Key;
	}

	public void setTag5Key(String tag5Key) {
		this.tag5Key = tag5Key;
		if(tag5Key != null){
			putQueryParameter("Tag.5.Key", tag5Key);
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

	public String getSourceDiskType() {
		return this.sourceDiskType;
	}

	public void setSourceDiskType(String sourceDiskType) {
		this.sourceDiskType = sourceDiskType;
		if(sourceDiskType != null){
			putQueryParameter("SourceDiskType", sourceDiskType);
		}
	}

	public String getFilter1Value() {
		return this.filter1Value;
	}

	public void setFilter1Value(String filter1Value) {
		this.filter1Value = filter1Value;
		if(filter1Value != null){
			putQueryParameter("Filter.1.Value", filter1Value);
		}
	}

	public String getFilter2Key() {
		return this.filter2Key;
	}

	public void setFilter2Key(String filter2Key) {
		this.filter2Key = filter2Key;
		if(filter2Key != null){
			putQueryParameter("Filter.2.Key", filter2Key);
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

	public String getTag5Value() {
		return this.tag5Value;
	}

	public void setTag5Value(String tag5Value) {
		this.tag5Value = tag5Value;
		if(tag5Value != null){
			putQueryParameter("Tag.5.Value", tag5Value);
		}
	}

	public String getTag1Key() {
		return this.tag1Key;
	}

	public void setTag1Key(String tag1Key) {
		this.tag1Key = tag1Key;
		if(tag1Key != null){
			putQueryParameter("Tag.1.Key", tag1Key);
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

	public Boolean getEncrypted() {
		return this.encrypted;
	}

	public void setEncrypted(Boolean encrypted) {
		this.encrypted = encrypted;
		if(encrypted != null){
			putQueryParameter("Encrypted", encrypted.toString());
		}
	}

	public String getSnapshotType() {
		return this.snapshotType;
	}

	public void setSnapshotType(String snapshotType) {
		this.snapshotType = snapshotType;
		if(snapshotType != null){
			putQueryParameter("SnapshotType", snapshotType);
		}
	}

	public String getTag2Value() {
		return this.tag2Value;
	}

	public void setTag2Value(String tag2Value) {
		this.tag2Value = tag2Value;
		if(tag2Value != null){
			putQueryParameter("Tag.2.Value", tag2Value);
		}
	}

	public String getTag4Key() {
		return this.tag4Key;
	}

	public void setTag4Key(String tag4Key) {
		this.tag4Key = tag4Key;
		if(tag4Key != null){
			putQueryParameter("Tag.4.Key", tag4Key);
		}
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<DescribeSnapshotsResponse> getResponseClass() {
		return DescribeSnapshotsResponse.class;
	}

}
