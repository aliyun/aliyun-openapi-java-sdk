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

package com.aliyuncs.tag.model.v20180828;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.tag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSupportResourceTypesRequest extends RpcAcsRequest<ListSupportResourceTypesResponse> {
	   

	private String productCode;

	private String supportCode;

	private String nextToken;

	private String resourceOwnerAccount;

	private String ownerAccount;

	private String resourceTye;

	private Long ownerId;

	private Integer maxResult;

	private Boolean showItems;
	public ListSupportResourceTypesRequest() {
		super("Tag", "2018-08-28", "ListSupportResourceTypes", "tag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getSupportCode() {
		return this.supportCode;
	}

	public void setSupportCode(String supportCode) {
		this.supportCode = supportCode;
		if(supportCode != null){
			putQueryParameter("SupportCode", supportCode);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
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

	public String getResourceTye() {
		return this.resourceTye;
	}

	public void setResourceTye(String resourceTye) {
		this.resourceTye = resourceTye;
		if(resourceTye != null){
			putQueryParameter("ResourceTye", resourceTye);
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

	public Integer getMaxResult() {
		return this.maxResult;
	}

	public void setMaxResult(Integer maxResult) {
		this.maxResult = maxResult;
		if(maxResult != null){
			putQueryParameter("MaxResult", maxResult.toString());
		}
	}

	public Boolean getShowItems() {
		return this.showItems;
	}

	public void setShowItems(Boolean showItems) {
		this.showItems = showItems;
		if(showItems != null){
			putQueryParameter("ShowItems", showItems.toString());
		}
	}

	@Override
	public Class<ListSupportResourceTypesResponse> getResponseClass() {
		return ListSupportResourceTypesResponse.class;
	}

}
