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

package com.aliyuncs.cams.model.v20200606;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cams.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListProductCatalogRequest extends RpcAcsRequest<ListProductCatalogResponse> {
	   

	private Long resourceOwnerId;

	private String before;

	private Long limit;

	private String after;

	private String resourceOwnerAccount;

	private Long businessId;

	private Long ownerId;

	private String custSpaceId;

	private String fields;
	public ListProductCatalogRequest() {
		super("cams", "2020-06-06", "ListProductCatalog", "cams");
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

	public String getBefore() {
		return this.before;
	}

	public void setBefore(String before) {
		this.before = before;
		if(before != null){
			putQueryParameter("Before", before);
		}
	}

	public Long getLimit() {
		return this.limit;
	}

	public void setLimit(Long limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public String getAfter() {
		return this.after;
	}

	public void setAfter(String after) {
		this.after = after;
		if(after != null){
			putQueryParameter("After", after);
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

	public Long getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
		if(businessId != null){
			putQueryParameter("BusinessId", businessId.toString());
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

	public String getCustSpaceId() {
		return this.custSpaceId;
	}

	public void setCustSpaceId(String custSpaceId) {
		this.custSpaceId = custSpaceId;
		if(custSpaceId != null){
			putQueryParameter("CustSpaceId", custSpaceId);
		}
	}

	public String getFields() {
		return this.fields;
	}

	public void setFields(String fields) {
		this.fields = fields;
		if(fields != null){
			putQueryParameter("Fields", fields);
		}
	}

	@Override
	public Class<ListProductCatalogResponse> getResponseClass() {
		return ListProductCatalogResponse.class;
	}

}
