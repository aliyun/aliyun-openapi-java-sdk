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

/**
 * @author auto create
 * @version 
 */
public class QueryUsableSnapshotsRequest extends RpcAcsRequest<QueryUsableSnapshotsResponse> {
	
	public QueryUsableSnapshotsRequest() {
		super("EcsInc", "2016-03-14", "QueryUsableSnapshots", "ecs", "innerAPI");
	}

	private Long resourceOwnerId;

	private String snapshotNickName;

	private String snapshotId;

	private Integer offset;

	private String resourceOwnerAccount;

	private String creationStartTime;

	private String creationEndTime;

	private String ownerAccount;

	private Integer pageSize;

	private Long ownerId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getSnapshotNickName() {
		return this.snapshotNickName;
	}

	public void setSnapshotNickName(String snapshotNickName) {
		this.snapshotNickName = snapshotNickName;
		if(snapshotNickName != null){
			putQueryParameter("SnapshotNickName", snapshotNickName);
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

	public Integer getOffset() {
		return this.offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
		if(offset != null){
			putQueryParameter("Offset", offset.toString());
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

	public String getCreationStartTime() {
		return this.creationStartTime;
	}

	public void setCreationStartTime(String creationStartTime) {
		this.creationStartTime = creationStartTime;
		if(creationStartTime != null){
			putQueryParameter("CreationStartTime", creationStartTime);
		}
	}

	public String getCreationEndTime() {
		return this.creationEndTime;
	}

	public void setCreationEndTime(String creationEndTime) {
		this.creationEndTime = creationEndTime;
		if(creationEndTime != null){
			putQueryParameter("CreationEndTime", creationEndTime);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	@Override
	public Class<QueryUsableSnapshotsResponse> getResponseClass() {
		return QueryUsableSnapshotsResponse.class;
	}

}
