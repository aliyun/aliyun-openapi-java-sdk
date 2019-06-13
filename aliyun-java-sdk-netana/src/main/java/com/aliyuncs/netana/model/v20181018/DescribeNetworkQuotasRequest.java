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

/**
 * @author auto create
 * @version 
 */
public class DescribeNetworkQuotasRequest extends RpcAcsRequest<DescribeNetworkQuotasResponse> {
	
	public DescribeNetworkQuotasRequest() {
		super("Netana", "2018-10-18", "DescribeNetworkQuotas", "Netana");
	}

	private Long resourceOwnerId;

	private String product;

	private String quotaPublicityName;

	private String resourceOwnerAccount;

	private String resourceType;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getBizProduct() {
		return this.product;
	}

	public void setBizProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
		}
	}

	/**
	 * @deprecated use getBizProduct instead of this.
	 */
	@Deprecated
	public String getProduct() {
		return this.product;
	}

	/**
	 * @deprecated use setBizProduct instead of this.
	 */
	@Deprecated
	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
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

	@Override
	public Class<DescribeNetworkQuotasResponse> getResponseClass() {
		return DescribeNetworkQuotasResponse.class;
	}

}
