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
public class DescribeCostBudgetsSummaryRequest extends RpcAcsRequest<DescribeCostBudgetsSummaryResponse> {
	   

	private String budgetStatus;

	private String budgetType;

	private String nextToken;

	private Integer maxResults;

	private String budgetName;
	public DescribeCostBudgetsSummaryRequest() {
		super("BssOpenApi", "2017-12-14", "DescribeCostBudgetsSummary", "bssopenapi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getBudgetStatus() {
		return this.budgetStatus;
	}

	public void setBudgetStatus(String budgetStatus) {
		this.budgetStatus = budgetStatus;
		if(budgetStatus != null){
			putQueryParameter("BudgetStatus", budgetStatus);
		}
	}

	public String getBudgetType() {
		return this.budgetType;
	}

	public void setBudgetType(String budgetType) {
		this.budgetType = budgetType;
		if(budgetType != null){
			putQueryParameter("BudgetType", budgetType);
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

	public String getBudgetName() {
		return this.budgetName;
	}

	public void setBudgetName(String budgetName) {
		this.budgetName = budgetName;
		if(budgetName != null){
			putQueryParameter("BudgetName", budgetName);
		}
	}

	@Override
	public Class<DescribeCostBudgetsSummaryResponse> getResponseClass() {
		return DescribeCostBudgetsSummaryResponse.class;
	}

}
