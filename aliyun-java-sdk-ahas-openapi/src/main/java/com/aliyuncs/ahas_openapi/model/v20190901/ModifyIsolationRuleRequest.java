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

package com.aliyuncs.ahas_openapi.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ahas_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyIsolationRuleRequest extends RpcAcsRequest<ModifyIsolationRuleResponse> {
	   

	private String refResource;

	private Float threshold;

	private String limitOrigin;

	private Integer relationStrategy;

	private Long ruleId;
	public ModifyIsolationRuleRequest() {
		super("ahas-openapi", "2019-09-01", "ModifyIsolationRule", "ahas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRefResource() {
		return this.refResource;
	}

	public void setRefResource(String refResource) {
		this.refResource = refResource;
		if(refResource != null){
			putQueryParameter("RefResource", refResource);
		}
	}

	public Float getThreshold() {
		return this.threshold;
	}

	public void setThreshold(Float threshold) {
		this.threshold = threshold;
		if(threshold != null){
			putQueryParameter("Threshold", threshold.toString());
		}
	}

	public String getLimitOrigin() {
		return this.limitOrigin;
	}

	public void setLimitOrigin(String limitOrigin) {
		this.limitOrigin = limitOrigin;
		if(limitOrigin != null){
			putQueryParameter("LimitOrigin", limitOrigin);
		}
	}

	public Integer getRelationStrategy() {
		return this.relationStrategy;
	}

	public void setRelationStrategy(Integer relationStrategy) {
		this.relationStrategy = relationStrategy;
		if(relationStrategy != null){
			putQueryParameter("RelationStrategy", relationStrategy.toString());
		}
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId.toString());
		}
	}

	@Override
	public Class<ModifyIsolationRuleResponse> getResponseClass() {
		return ModifyIsolationRuleResponse.class;
	}

}
