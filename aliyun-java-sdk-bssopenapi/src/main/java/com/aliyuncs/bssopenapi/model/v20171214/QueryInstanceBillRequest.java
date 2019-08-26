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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryInstanceBillRequest extends RpcAcsRequest<QueryInstanceBillResponse> {
	
	public QueryInstanceBillRequest() {
		super("BssOpenApi", "2017-12-14", "QueryInstanceBill");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Boolean isBillingItem;

	private String productCode;

	private Boolean isHideZeroCharge;

	private String subscriptionType;

	private Integer pageSize;

	private String billingCycle;

	private Long ownerId;

	private Integer pageNum;

	private String productType;

	public Boolean getIsBillingItem() {
		return this.isBillingItem;
	}

	public void setIsBillingItem(Boolean isBillingItem) {
		this.isBillingItem = isBillingItem;
		if(isBillingItem != null){
			putQueryParameter("IsBillingItem", isBillingItem.toString());
		}
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

	public Boolean getIsHideZeroCharge() {
		return this.isHideZeroCharge;
	}

	public void setIsHideZeroCharge(Boolean isHideZeroCharge) {
		this.isHideZeroCharge = isHideZeroCharge;
		if(isHideZeroCharge != null){
			putQueryParameter("IsHideZeroCharge", isHideZeroCharge.toString());
		}
	}

	public String getSubscriptionType() {
		return this.subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
		if(subscriptionType != null){
			putQueryParameter("SubscriptionType", subscriptionType);
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

	public String getBillingCycle() {
		return this.billingCycle;
	}

	public void setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
		if(billingCycle != null){
			putQueryParameter("BillingCycle", billingCycle);
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

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getProductType() {
		return this.productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
		if(productType != null){
			putQueryParameter("ProductType", productType);
		}
	}

	@Override
	public Class<QueryInstanceBillResponse> getResponseClass() {
		return QueryInstanceBillResponse.class;
	}

}
