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
public class ListQuotaAlarmsRequest extends RpcAcsRequest<ListQuotaAlarmsResponse> {
	   

	private String productCode;

	private String quotaActionCode;

	private String nextToken;

	private List<QuotaDimensions> quotaDimensionss;

	private Integer maxResults;

	private String alarmName;
	public ListQuotaAlarmsRequest() {
		super("quotas", "2020-05-10", "ListQuotaAlarms", "quotas");
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putBodyParameter("NextToken", nextToken);
		}
	}

	public List<QuotaDimensions> getQuotaDimensionss() {
		return this.quotaDimensionss;
	}

	public void setQuotaDimensionss(List<QuotaDimensions> quotaDimensionss) {
		this.quotaDimensionss = quotaDimensionss;	
		if (quotaDimensionss != null) {
			for (int depth1 = 0; depth1 < quotaDimensionss.size(); depth1++) {
				putBodyParameter("QuotaDimensions." + (depth1 + 1) + ".Key" , quotaDimensionss.get(depth1).getKey());
				putBodyParameter("QuotaDimensions." + (depth1 + 1) + ".Value" , quotaDimensionss.get(depth1).getValue());
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

	public String getAlarmName() {
		return this.alarmName;
	}

	public void setAlarmName(String alarmName) {
		this.alarmName = alarmName;
		if(alarmName != null){
			putBodyParameter("AlarmName", alarmName);
		}
	}

	public static class QuotaDimensions {

		private String key;

		private String value;

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}
	}

	@Override
	public Class<ListQuotaAlarmsResponse> getResponseClass() {
		return ListQuotaAlarmsResponse.class;
	}

}
