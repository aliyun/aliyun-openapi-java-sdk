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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListSystemAggregationRulesRequest extends RpcAcsRequest<ListSystemAggregationRulesResponse> {
	   

	private List<Integer> ruleTypess;

	private Integer systemType;

	private String ruleName;

	private Integer pageSize;

	private String lang;

	private List<Integer> aggregationIdss;

	private Integer currentPage;
	public ListSystemAggregationRulesRequest() {
		super("Sas", "2018-12-03", "ListSystemAggregationRules");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Integer> getRuleTypess() {
		return this.ruleTypess;
	}

	public void setRuleTypess(List<Integer> ruleTypess) {
		this.ruleTypess = ruleTypess;	
		if (ruleTypess != null) {
			for (int i = 0; i < ruleTypess.size(); i++) {
				putQueryParameter("RuleTypes." + (i + 1) , ruleTypess.get(i));
			}
		}	
	}

	public Integer getSystemType() {
		return this.systemType;
	}

	public void setSystemType(Integer systemType) {
		this.systemType = systemType;
		if(systemType != null){
			putQueryParameter("SystemType", systemType.toString());
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
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

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public List<Integer> getAggregationIdss() {
		return this.aggregationIdss;
	}

	public void setAggregationIdss(List<Integer> aggregationIdss) {
		this.aggregationIdss = aggregationIdss;	
		if (aggregationIdss != null) {
			for (int i = 0; i < aggregationIdss.size(); i++) {
				putQueryParameter("AggregationIds." + (i + 1) , aggregationIdss.get(i));
			}
		}	
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	@Override
	public Class<ListSystemAggregationRulesResponse> getResponseClass() {
		return ListSystemAggregationRulesResponse.class;
	}

}
