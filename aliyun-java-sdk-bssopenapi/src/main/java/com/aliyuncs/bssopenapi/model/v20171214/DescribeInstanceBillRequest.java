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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceBillRequest extends RpcAcsRequest<DescribeInstanceBillResponse> {
	   

	private String productCode;

	private Boolean isHideZeroCharge;

	private String subscriptionType;

	private Long billOwnerId;

	private String productType;

	private String nextToken;

	private String billingCycle;

	private Long ownerId;

	private String billingDate;

	private Boolean isBillingItem;

	private String instanceID;

	private String granularity;

	private Integer maxResults;
	public DescribeInstanceBillRequest() {
		super("BssOpenApi", "2017-12-14", "DescribeInstanceBill");
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

	public Long getBillOwnerId() {
		return this.billOwnerId;
	}

	public void setBillOwnerId(Long billOwnerId) {
		this.billOwnerId = billOwnerId;
		if(billOwnerId != null){
			putQueryParameter("BillOwnerId", billOwnerId.toString());
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
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

	public String getBillingDate() {
		return this.billingDate;
	}

	public void setBillingDate(String billingDate) {
		this.billingDate = billingDate;
		if(billingDate != null){
			putQueryParameter("BillingDate", billingDate);
		}
	}

	public Boolean getIsBillingItem() {
		return this.isBillingItem;
	}

	public void setIsBillingItem(Boolean isBillingItem) {
		this.isBillingItem = isBillingItem;
		if(isBillingItem != null){
			putQueryParameter("IsBillingItem", isBillingItem.toString());
		}
	}

	public String getInstanceID() {
		return this.instanceID;
	}

	public void setInstanceID(String instanceID) {
		this.instanceID = instanceID;
		if(instanceID != null){
			putQueryParameter("InstanceID", instanceID);
		}
	}

	public String getGranularity() {
		return this.granularity;
	}

	public void setGranularity(String granularity) {
		this.granularity = granularity;
		if(granularity != null){
			putQueryParameter("Granularity", granularity);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<DescribeInstanceBillResponse> getResponseClass() {
		return DescribeInstanceBillResponse.class;
	}

}
