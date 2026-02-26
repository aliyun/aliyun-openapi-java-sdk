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

package com.aliyuncs.netana.model.v20181018;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.netana.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkQuotaRequestResultRequest extends RpcAcsRequest<DescribeNetworkQuotaRequestResultResponse> {
	   

	private Long resourceOwnerId;

	private String quotaPublicityName;

	private String quotaRequestId;

	private Integer pageSize;

	private String product;

	private String resourceOwnerAccount;

	private String resourceType;

	private Integer pageNo;
	public DescribeNetworkQuotaRequestResultRequest() {
		super("Netana", "2018-10-18", "DescribeNetworkQuotaRequestResult", "netana");
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

	public String getQuotaPublicityName() {
		return this.quotaPublicityName;
	}

	public void setQuotaPublicityName(String quotaPublicityName) {
		this.quotaPublicityName = quotaPublicityName;
		if(quotaPublicityName != null){
			putQueryParameter("QuotaPublicityName", quotaPublicityName);
		}
	}

	public String getQuotaRequestId() {
		return this.quotaRequestId;
	}

	public void setQuotaRequestId(String quotaRequestId) {
		this.quotaRequestId = quotaRequestId;
		if(quotaRequestId != null){
			putQueryParameter("QuotaRequestId", quotaRequestId);
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

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
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

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	@Override
	public Class<DescribeNetworkQuotaRequestResultResponse> getResponseClass() {
		return DescribeNetworkQuotaRequestResultResponse.class;
	}

}
