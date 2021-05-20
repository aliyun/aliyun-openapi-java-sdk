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

package com.aliyuncs.smartag.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.smartag.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListDpiConfigErrorRequest extends RpcAcsRequest<ListDpiConfigErrorResponse> {
	   

	private String dpiConfigType;

	private String nextToken;

	private String smartAGId;

	private String ruleInstanceId;

	private Integer maxResults;
	public ListDpiConfigErrorRequest() {
		super("Smartag", "2018-03-13", "ListDpiConfigError", "smartag");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDpiConfigType() {
		return this.dpiConfigType;
	}

	public void setDpiConfigType(String dpiConfigType) {
		this.dpiConfigType = dpiConfigType;
		if(dpiConfigType != null){
			putQueryParameter("DpiConfigType", dpiConfigType);
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

	public String getSmartAGId() {
		return this.smartAGId;
	}

	public void setSmartAGId(String smartAGId) {
		this.smartAGId = smartAGId;
		if(smartAGId != null){
			putQueryParameter("SmartAGId", smartAGId);
		}
	}

	public String getRuleInstanceId() {
		return this.ruleInstanceId;
	}

	public void setRuleInstanceId(String ruleInstanceId) {
		this.ruleInstanceId = ruleInstanceId;
		if(ruleInstanceId != null){
			putQueryParameter("RuleInstanceId", ruleInstanceId);
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
	public Class<ListDpiConfigErrorResponse> getResponseClass() {
		return ListDpiConfigErrorResponse.class;
	}

}
