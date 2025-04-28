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

package com.aliyuncs.adb.model.v20190315;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.adb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSyncJobListRequest extends RpcAcsRequest<DescribeSyncJobListResponse> {
	   

	private Long resourceOwnerId;

	private Integer pageNumber;

	private String sourceDBClusterId;

	private Integer pageSize;

	private String resourceOwnerAccount;

	private String dBClusterId;

	private String ownerAccount;

	private String sourceDBClusterDescription;

	private Long ownerId;

	private String sourceDBType;

	private Boolean getSourceDetail;
	public DescribeSyncJobListRequest() {
		super("adb", "2019-03-15", "DescribeSyncJobList", "ads");
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getSourceDBClusterId() {
		return this.sourceDBClusterId;
	}

	public void setSourceDBClusterId(String sourceDBClusterId) {
		this.sourceDBClusterId = sourceDBClusterId;
		if(sourceDBClusterId != null){
			putQueryParameter("SourceDBClusterId", sourceDBClusterId);
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

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
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

	public String getSourceDBClusterDescription() {
		return this.sourceDBClusterDescription;
	}

	public void setSourceDBClusterDescription(String sourceDBClusterDescription) {
		this.sourceDBClusterDescription = sourceDBClusterDescription;
		if(sourceDBClusterDescription != null){
			putQueryParameter("SourceDBClusterDescription", sourceDBClusterDescription);
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

	public String getSourceDBType() {
		return this.sourceDBType;
	}

	public void setSourceDBType(String sourceDBType) {
		this.sourceDBType = sourceDBType;
		if(sourceDBType != null){
			putQueryParameter("SourceDBType", sourceDBType);
		}
	}

	public Boolean getGetSourceDetail() {
		return this.getSourceDetail;
	}

	public void setGetSourceDetail(Boolean getSourceDetail) {
		this.getSourceDetail = getSourceDetail;
		if(getSourceDetail != null){
			putQueryParameter("GetSourceDetail", getSourceDetail.toString());
		}
	}

	@Override
	public Class<DescribeSyncJobListResponse> getResponseClass() {
		return DescribeSyncJobListResponse.class;
	}

}
