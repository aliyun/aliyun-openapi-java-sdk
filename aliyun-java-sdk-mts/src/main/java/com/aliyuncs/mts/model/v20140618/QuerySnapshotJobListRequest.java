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

package com.aliyuncs.mts.model.v20140618;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QuerySnapshotJobListRequest extends RpcAcsRequest<QuerySnapshotJobListResponse> {
	   

	private Long resourceOwnerId;

	private String nextPageToken;

	private String startOfJobCreatedTimeRange;

	private String state;

	private String endOfJobCreatedTimeRange;

	private String resourceOwnerAccount;

	private String snapshotJobIds;

	private String ownerAccount;

	private Long maximumPageSize;

	private Long ownerId;

	private String pipelineId;
	public QuerySnapshotJobListRequest() {
		super("Mts", "2014-06-18", "QuerySnapshotJobList");
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

	public String getNextPageToken() {
		return this.nextPageToken;
	}

	public void setNextPageToken(String nextPageToken) {
		this.nextPageToken = nextPageToken;
		if(nextPageToken != null){
			putQueryParameter("NextPageToken", nextPageToken);
		}
	}

	public String getStartOfJobCreatedTimeRange() {
		return this.startOfJobCreatedTimeRange;
	}

	public void setStartOfJobCreatedTimeRange(String startOfJobCreatedTimeRange) {
		this.startOfJobCreatedTimeRange = startOfJobCreatedTimeRange;
		if(startOfJobCreatedTimeRange != null){
			putQueryParameter("StartOfJobCreatedTimeRange", startOfJobCreatedTimeRange);
		}
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
		if(state != null){
			putQueryParameter("State", state);
		}
	}

	public String getEndOfJobCreatedTimeRange() {
		return this.endOfJobCreatedTimeRange;
	}

	public void setEndOfJobCreatedTimeRange(String endOfJobCreatedTimeRange) {
		this.endOfJobCreatedTimeRange = endOfJobCreatedTimeRange;
		if(endOfJobCreatedTimeRange != null){
			putQueryParameter("EndOfJobCreatedTimeRange", endOfJobCreatedTimeRange);
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

	public String getSnapshotJobIds() {
		return this.snapshotJobIds;
	}

	public void setSnapshotJobIds(String snapshotJobIds) {
		this.snapshotJobIds = snapshotJobIds;
		if(snapshotJobIds != null){
			putQueryParameter("SnapshotJobIds", snapshotJobIds);
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

	public Long getMaximumPageSize() {
		return this.maximumPageSize;
	}

	public void setMaximumPageSize(Long maximumPageSize) {
		this.maximumPageSize = maximumPageSize;
		if(maximumPageSize != null){
			putQueryParameter("MaximumPageSize", maximumPageSize.toString());
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

	public String getPipelineId() {
		return this.pipelineId;
	}

	public void setPipelineId(String pipelineId) {
		this.pipelineId = pipelineId;
		if(pipelineId != null){
			putQueryParameter("PipelineId", pipelineId);
		}
	}

	@Override
	public Class<QuerySnapshotJobListResponse> getResponseClass() {
		return QuerySnapshotJobListResponse.class;
	}

}
