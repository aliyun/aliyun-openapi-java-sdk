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
public class ListFpShotNotaryRequest extends RpcAcsRequest<ListFpShotNotaryResponse> {
	   

	private Long resourceOwnerId;

	private String fpDBId;

	private String nextPageToken;

	private String startOfCreatedTimeRange;

	private String endOfCreatedTimeRange;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private Long maximumPageSize;

	private Long ownerId;
	public ListFpShotNotaryRequest() {
		super("Mts", "2014-06-18", "ListFpShotNotary");
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

	public String getFpDBId() {
		return this.fpDBId;
	}

	public void setFpDBId(String fpDBId) {
		this.fpDBId = fpDBId;
		if(fpDBId != null){
			putQueryParameter("FpDBId", fpDBId);
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

	public String getStartOfCreatedTimeRange() {
		return this.startOfCreatedTimeRange;
	}

	public void setStartOfCreatedTimeRange(String startOfCreatedTimeRange) {
		this.startOfCreatedTimeRange = startOfCreatedTimeRange;
		if(startOfCreatedTimeRange != null){
			putQueryParameter("StartOfCreatedTimeRange", startOfCreatedTimeRange);
		}
	}

	public String getEndOfCreatedTimeRange() {
		return this.endOfCreatedTimeRange;
	}

	public void setEndOfCreatedTimeRange(String endOfCreatedTimeRange) {
		this.endOfCreatedTimeRange = endOfCreatedTimeRange;
		if(endOfCreatedTimeRange != null){
			putQueryParameter("EndOfCreatedTimeRange", endOfCreatedTimeRange);
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

	@Override
	public Class<ListFpShotNotaryResponse> getResponseClass() {
		return ListFpShotNotaryResponse.class;
	}

}
