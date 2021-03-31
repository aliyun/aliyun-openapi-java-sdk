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
public class DescribeSplitItemBillRequest extends RpcAcsRequest<DescribeSplitItemBillResponse> {
	   

	private String splitItemID;

	private String productCode;

	private String subscriptionType;

	private String billingCycle;

	private Long ownerId;

	private Long billOwnerId;

	private List<TagFilter> tagFilters;

	private String productType;

	private String instanceID;

	private String nextToken;

	private Integer maxResults;
	public DescribeSplitItemBillRequest() {
		super("BssOpenApi", "2017-12-14", "DescribeSplitItemBill");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSplitItemID() {
		return this.splitItemID;
	}

	public void setSplitItemID(String splitItemID) {
		this.splitItemID = splitItemID;
		if(splitItemID != null){
			putQueryParameter("SplitItemID", splitItemID);
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

	public String getSubscriptionType() {
		return this.subscriptionType;
	}

	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
		if(subscriptionType != null){
			putQueryParameter("SubscriptionType", subscriptionType);
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

	public Long getBillOwnerId() {
		return this.billOwnerId;
	}

	public void setBillOwnerId(Long billOwnerId) {
		this.billOwnerId = billOwnerId;
		if(billOwnerId != null){
			putQueryParameter("BillOwnerId", billOwnerId.toString());
		}
	}

	public List<TagFilter> getTagFilters() {
		return this.tagFilters;
	}

	public void setTagFilters(List<TagFilter> tagFilters) {
		this.tagFilters = tagFilters;	
		if (tagFilters != null) {
			for (int depth1 = 0; depth1 < tagFilters.size(); depth1++) {
				if (tagFilters.get(depth1).getTagValuess() != null) {
					for (int i = 0; i < tagFilters.get(depth1).getTagValuess().size(); i++) {
						putQueryParameter("TagFilter." + (depth1 + 1) + ".TagValues." + (i + 1) , tagFilters.get(depth1).getTagValuess().get(i));
					}
				}
				putQueryParameter("TagFilter." + (depth1 + 1) + ".TagKey" , tagFilters.get(depth1).getTagKey());
			}
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

	public String getInstanceID() {
		return this.instanceID;
	}

	public void setInstanceID(String instanceID) {
		this.instanceID = instanceID;
		if(instanceID != null){
			putQueryParameter("InstanceID", instanceID);
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public static class TagFilter {

		private List<String> tagValuess;

		private String tagKey;

		public List<String> getTagValuess() {
			return this.tagValuess;
		}

		public void setTagValuess(List<String> tagValuess) {
			this.tagValuess = tagValuess;
		}

		public String getTagKey() {
			return this.tagKey;
		}

		public void setTagKey(String tagKey) {
			this.tagKey = tagKey;
		}
	}

	@Override
	public Class<DescribeSplitItemBillResponse> getResponseClass() {
		return DescribeSplitItemBillResponse.class;
	}

}
