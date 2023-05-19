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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest extends RpcAcsRequest<DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse> {
	   

	private String productCode;

	private String amortizationDateStart;

	private String subscriptionType;

	private String costUnitCode;

	private String nextToken;

	private List<String> billUserIdLists;

	private String productDetail;

	private List<String> billOwnerIdLists;

	private String billingCycle;

	private String amortizationDateEnd;

	private List<String> instanceIdLists;

	private Integer maxResults;
	public DescribeInstanceAmortizedCostByAmortizationPeriodDateRequest() {
		super("BssOpenApi", "2017-12-14", "DescribeInstanceAmortizedCostByAmortizationPeriodDate", "bssopenapi");
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
			putBodyParameter("ProductCode", productCode);
		}
	}

	public String getAmortizationDateStart() {
		return this.amortizationDateStart;
	}

	public void setAmortizationDateStart(String amortizationDateStart) {
		this.amortizationDateStart = amortizationDateStart;
		if(amortizationDateStart != null){
			putBodyParameter("AmortizationDateStart", amortizationDateStart);
		}
	}

	public String getSubscriptionType() {
		return this.subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
		if(subscriptionType != null){
			putBodyParameter("SubscriptionType", subscriptionType);
		}
	}

	public String getCostUnitCode() {
		return this.costUnitCode;
	}

	public void setCostUnitCode(String costUnitCode) {
		this.costUnitCode = costUnitCode;
		if(costUnitCode != null){
			putBodyParameter("CostUnitCode", costUnitCode);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken);
		}
	}

	public List<String> getBillUserIdLists() {
		return this.billUserIdLists;
	}

	public void setBillUserIdLists(List<String> billUserIdLists) {
		this.billUserIdLists = billUserIdLists;	
		if (billUserIdLists != null) {
			for (int i = 0; i < billUserIdLists.size(); i++) {
				putBodyParameter("BillUserIdList." + (i + 1) , billUserIdLists.get(i));
			}
		}	
	}

	public String getProductDetail() {
		return this.productDetail;
	}

	public void setProductDetail(String productDetail) {
		this.productDetail = productDetail;
		if(productDetail != null){
			putBodyParameter("ProductDetail", productDetail);
		}
	}

	public List<String> getBillOwnerIdLists() {
		return this.billOwnerIdLists;
	}

	public void setBillOwnerIdLists(List<String> billOwnerIdLists) {
		this.billOwnerIdLists = billOwnerIdLists;	
		if (billOwnerIdLists != null) {
			for (int i = 0; i < billOwnerIdLists.size(); i++) {
				putBodyParameter("BillOwnerIdList." + (i + 1) , billOwnerIdLists.get(i));
			}
		}	
	}

	public String getBillingCycle() {
		return this.billingCycle;
	}

	public void setBillingCycle(String billingCycle) {
		this.billingCycle = billingCycle;
		if(billingCycle != null){
			putBodyParameter("BillingCycle", billingCycle);
		}
	}

	public String getAmortizationDateEnd() {
		return this.amortizationDateEnd;
	}

	public void setAmortizationDateEnd(String amortizationDateEnd) {
		this.amortizationDateEnd = amortizationDateEnd;
		if(amortizationDateEnd != null){
			putBodyParameter("AmortizationDateEnd", amortizationDateEnd);
		}
	}

	public List<String> getInstanceIdLists() {
		return this.instanceIdLists;
	}

	public void setInstanceIdLists(List<String> instanceIdLists) {
		this.instanceIdLists = instanceIdLists;	
		if (instanceIdLists != null) {
			for (int i = 0; i < instanceIdLists.size(); i++) {
				putBodyParameter("InstanceIdList." + (i + 1) , instanceIdLists.get(i));
			}
		}	
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putBodyParameter("MaxResults", maxResults.toString());
		}
	}

	@Override
	public Class<DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse> getResponseClass() {
		return DescribeInstanceAmortizedCostByAmortizationPeriodDateResponse.class;
	}

}
