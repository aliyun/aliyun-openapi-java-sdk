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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribePolicyBindingsRequest extends RpcAcsRequest<DescribePolicyBindingsResponse> {
	   

	@SerializedName("dataSourceIds")
	private List<String> dataSourceIds;

	private List<Filters> filterss;

	private String policyId;

	private String nextToken;

	private Integer maxResults;

	private String sourceType;
	public DescribePolicyBindingsRequest() {
		super("hbr", "2017-09-08", "DescribePolicyBindings", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getDataSourceIds() {
		return this.dataSourceIds;
	}

	public void setDataSourceIds(List<String> dataSourceIds) {
		this.dataSourceIds = dataSourceIds;	
		if (dataSourceIds != null) {
			putBodyParameter("DataSourceIds" , new Gson().toJson(dataSourceIds));
		}	
	}

	public List<Filters> getFilterss() {
		return this.filterss;
	}

	public void setFilterss(List<Filters> filterss) {
		this.filterss = filterss;	
		if (filterss != null) {
			for (int depth1 = 0; depth1 < filterss.size(); depth1++) {
				if (filterss.get(depth1).getValuess() != null) {
					for (int i = 0; i < filterss.get(depth1).getValuess().size(); i++) {
						putQueryParameter("Filters." + (depth1 + 1) + ".Values." + (i + 1) , filterss.get(depth1).getValuess().get(i));
					}
				}
				putQueryParameter("Filters." + (depth1 + 1) + ".Key" , filterss.get(depth1).getKey());
				putQueryParameter("Filters." + (depth1 + 1) + ".Operator" , filterss.get(depth1).getOperator());
			}
		}	
	}

	public String getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(String policyId) {
		this.policyId = policyId;
		if(policyId != null){
			putBodyParameter("PolicyId", policyId);
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putBodyParameter("MaxResults", maxResults.toString());
		}
	}

	public String getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
		if(sourceType != null){
			putQueryParameter("SourceType", sourceType);
		}
	}

	public static class Filters {

		private List<String> valuess;

		private String key;

		private String operator;

		public List<String> getValuess() {
			return this.valuess;
		}

		public void setValuess(List<String> valuess) {
			this.valuess = valuess;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getOperator() {
			return this.operator;
		}

		public void setOperator(String operator) {
			this.operator = operator;
		}
	}

	@Override
	public Class<DescribePolicyBindingsResponse> getResponseClass() {
		return DescribePolicyBindingsResponse.class;
	}

}
