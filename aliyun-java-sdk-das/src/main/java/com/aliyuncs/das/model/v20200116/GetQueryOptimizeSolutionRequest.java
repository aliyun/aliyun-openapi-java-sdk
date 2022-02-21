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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetQueryOptimizeSolutionRequest extends RpcAcsRequest<GetQueryOptimizeSolutionResponse> {
	   

	private String sqlId;

	private String ruleIds;

	private String engine;
	public GetQueryOptimizeSolutionRequest() {
		super("DAS", "2020-01-16", "GetQueryOptimizeSolution");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSqlId() {
		return this.sqlId;
	}

	public void setSqlId(String sqlId) {
		this.sqlId = sqlId;
		if(sqlId != null){
			putQueryParameter("SqlId", sqlId);
		}
	}

	public String getRuleIds() {
		return this.ruleIds;
	}

	public void setRuleIds(String ruleIds) {
		this.ruleIds = ruleIds;
		if(ruleIds != null){
			putQueryParameter("RuleIds", ruleIds);
		}
	}

	public String getEngine() {
		return this.engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
		if(engine != null){
			putQueryParameter("Engine", engine);
		}
	}

	@Override
	public Class<GetQueryOptimizeSolutionResponse> getResponseClass() {
		return GetQueryOptimizeSolutionResponse.class;
	}

}
