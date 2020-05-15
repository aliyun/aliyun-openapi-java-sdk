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
public class QueryMediaListByURLRequest extends RpcAcsRequest<QueryMediaListByURLResponse> {
	   

	private Long resourceOwnerId;

	private Boolean includeSummaryList;

	private String fileURLs;

	private Boolean includePlayList;

	private String resourceOwnerAccount;

	private Boolean includeSnapshotList;

	private String ownerAccount;

	private Long ownerId;

	private Boolean includeMediaInfo;
	public QueryMediaListByURLRequest() {
		super("Mts", "2014-06-18", "QueryMediaListByURL");
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

	public Boolean getIncludeSummaryList() {
		return this.includeSummaryList;
	}

	public void setIncludeSummaryList(Boolean includeSummaryList) {
		this.includeSummaryList = includeSummaryList;
		if(includeSummaryList != null){
			putQueryParameter("IncludeSummaryList", includeSummaryList.toString());
		}
	}

	public String getFileURLs() {
		return this.fileURLs;
	}

	public void setFileURLs(String fileURLs) {
		this.fileURLs = fileURLs;
		if(fileURLs != null){
			putQueryParameter("FileURLs", fileURLs);
		}
	}

	public Boolean getIncludePlayList() {
		return this.includePlayList;
	}

	public void setIncludePlayList(Boolean includePlayList) {
		this.includePlayList = includePlayList;
		if(includePlayList != null){
			putQueryParameter("IncludePlayList", includePlayList.toString());
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

	public Boolean getIncludeSnapshotList() {
		return this.includeSnapshotList;
	}

	public void setIncludeSnapshotList(Boolean includeSnapshotList) {
		this.includeSnapshotList = includeSnapshotList;
		if(includeSnapshotList != null){
			putQueryParameter("IncludeSnapshotList", includeSnapshotList.toString());
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

	public Boolean getIncludeMediaInfo() {
		return this.includeMediaInfo;
	}

	public void setIncludeMediaInfo(Boolean includeMediaInfo) {
		this.includeMediaInfo = includeMediaInfo;
		if(includeMediaInfo != null){
			putQueryParameter("IncludeMediaInfo", includeMediaInfo.toString());
		}
	}

	@Override
	public Class<QueryMediaListByURLResponse> getResponseClass() {
		return QueryMediaListByURLResponse.class;
	}

}
