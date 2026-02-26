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

package com.aliyuncs.quotas.model.v20200510;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quotas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListQuotaApplicationsForTemplateRequest extends RpcAcsRequest<ListQuotaApplicationsForTemplateResponse> {
	   

	private String productCode;

	private String quotaActionCode;

	private String batchQuotaApplicationId;

	private String nextToken;

	private String quotaCategory;

	private String applyStartTime;

	private String applyEndTime;

	private Integer maxResults;
	public ListQuotaApplicationsForTemplateRequest() {
		super("quotas", "2020-05-10", "ListQuotaApplicationsForTemplate", "quotas");
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

	public String getQuotaActionCode() {
		return this.quotaActionCode;
	}

	public void setQuotaActionCode(String quotaActionCode) {
		this.quotaActionCode = quotaActionCode;
		if(quotaActionCode != null){
			putBodyParameter("QuotaActionCode", quotaActionCode);
		}
	}

	public String getBatchQuotaApplicationId() {
		return this.batchQuotaApplicationId;
	}

	public void setBatchQuotaApplicationId(String batchQuotaApplicationId) {
		this.batchQuotaApplicationId = batchQuotaApplicationId;
		if(batchQuotaApplicationId != null){
			putBodyParameter("BatchQuotaApplicationId", batchQuotaApplicationId);
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

	public String getQuotaCategory() {
		return this.quotaCategory;
	}

	public void setQuotaCategory(String quotaCategory) {
		this.quotaCategory = quotaCategory;
		if(quotaCategory != null){
			putBodyParameter("QuotaCategory", quotaCategory);
		}
	}

	public String getApplyStartTime() {
		return this.applyStartTime;
	}

	public void setApplyStartTime(String applyStartTime) {
		this.applyStartTime = applyStartTime;
		if(applyStartTime != null){
			putBodyParameter("ApplyStartTime", applyStartTime);
		}
	}

	public String getApplyEndTime() {
		return this.applyEndTime;
	}

	public void setApplyEndTime(String applyEndTime) {
		this.applyEndTime = applyEndTime;
		if(applyEndTime != null){
			putBodyParameter("ApplyEndTime", applyEndTime);
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
	public Class<ListQuotaApplicationsForTemplateResponse> getResponseClass() {
		return ListQuotaApplicationsForTemplateResponse.class;
	}

}
