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

package com.aliyuncs.trademark.model.v20180724;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.trademark.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryMonitorKeywordsRequest extends RpcAcsRequest<QueryMonitorKeywordsResponse> {
	   

	private List<String> keywordss;

	private Integer ruleType;
	public QueryMonitorKeywordsRequest() {
		super("Trademark", "2018-07-24", "QueryMonitorKeywords");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getKeywordss() {
		return this.keywordss;
	}

	public void setKeywordss(List<String> keywordss) {
		this.keywordss = keywordss;	
		if (keywordss != null) {
			for (int i = 0; i < keywordss.size(); i++) {
				putQueryParameter("Keywords." + (i + 1) , keywordss.get(i));
			}
		}	
	}

	public Integer getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(Integer ruleType) {
		this.ruleType = ruleType;
		if(ruleType != null){
			putQueryParameter("RuleType", ruleType.toString());
		}
	}

	@Override
	public Class<QueryMonitorKeywordsResponse> getResponseClass() {
		return QueryMonitorKeywordsResponse.class;
	}

}
