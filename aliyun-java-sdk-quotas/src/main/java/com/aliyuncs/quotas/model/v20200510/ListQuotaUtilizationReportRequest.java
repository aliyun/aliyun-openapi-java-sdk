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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.quotas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListQuotaUtilizationReportRequest extends RpcAcsRequest<ListQuotaUtilizationReportResponse> {
	   

	private String productCode;

	private String keyWords;

	private String nextToken;

	private String quotaCategory;

	private List<String> utilizationStatusess;

	private String quotaRegionId;

	private Integer maxResults;

	private Boolean adjustable;
	public ListQuotaUtilizationReportRequest() {
		super("quotas", "2020-05-10", "ListQuotaUtilizationReport", "Quotas");
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

	public String getKeyWords() {
		return this.keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
		if(keyWords != null){
			putBodyParameter("KeyWords", keyWords);
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

	public List<String> getUtilizationStatusess() {
		return this.utilizationStatusess;
	}

	public void setUtilizationStatusess(List<String> utilizationStatusess) {
		this.utilizationStatusess = utilizationStatusess;	
		if (utilizationStatusess != null) {
			for (int i = 0; i < utilizationStatusess.size(); i++) {
				putBodyParameter("UtilizationStatuses." + (i + 1) , utilizationStatusess.get(i));
			}
		}	
	}

	public String getQuotaRegionId() {
		return this.quotaRegionId;
	}

	public void setQuotaRegionId(String quotaRegionId) {
		this.quotaRegionId = quotaRegionId;
		if(quotaRegionId != null){
			putBodyParameter("QuotaRegionId", quotaRegionId);
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

	public Boolean getAdjustable() {
		return this.adjustable;
	}

	public void setAdjustable(Boolean adjustable) {
		this.adjustable = adjustable;
		if(adjustable != null){
			putBodyParameter("Adjustable", adjustable.toString());
		}
	}

	@Override
	public Class<ListQuotaUtilizationReportResponse> getResponseClass() {
		return ListQuotaUtilizationReportResponse.class;
	}

}
