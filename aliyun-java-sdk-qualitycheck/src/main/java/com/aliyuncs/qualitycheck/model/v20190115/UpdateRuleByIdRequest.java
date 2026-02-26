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

package com.aliyuncs.qualitycheck.model.v20190115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateRuleByIdRequest extends RpcAcsRequest<UpdateRuleByIdResponse> {
	   

	private Boolean returnRelatedSchemes;

	private Boolean isCopy;

	private String jsonStrForRule;

	private Long ruleId;

	private Long baseMeAgentId;
	public UpdateRuleByIdRequest() {
		super("Qualitycheck", "2019-01-15", "UpdateRuleById");
		setMethod(MethodType.POST);
	}

	public Boolean getReturnRelatedSchemes() {
		return this.returnRelatedSchemes;
	}

	public void setReturnRelatedSchemes(Boolean returnRelatedSchemes) {
		this.returnRelatedSchemes = returnRelatedSchemes;
		if(returnRelatedSchemes != null){
			putBodyParameter("ReturnRelatedSchemes", returnRelatedSchemes.toString());
		}
	}

	public Boolean getIsCopy() {
		return this.isCopy;
	}

	public void setIsCopy(Boolean isCopy) {
		this.isCopy = isCopy;
		if(isCopy != null){
			putBodyParameter("IsCopy", isCopy.toString());
		}
	}

	public String getJsonStrForRule() {
		return this.jsonStrForRule;
	}

	public void setJsonStrForRule(String jsonStrForRule) {
		this.jsonStrForRule = jsonStrForRule;
		if(jsonStrForRule != null){
			putBodyParameter("JsonStrForRule", jsonStrForRule);
		}
	}

	public Long getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(Long ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putBodyParameter("RuleId", ruleId.toString());
		}
	}

	public Long getBaseMeAgentId() {
		return this.baseMeAgentId;
	}

	public void setBaseMeAgentId(Long baseMeAgentId) {
		this.baseMeAgentId = baseMeAgentId;
		if(baseMeAgentId != null){
			putQueryParameter("BaseMeAgentId", baseMeAgentId.toString());
		}
	}

	@Override
	public Class<UpdateRuleByIdResponse> getResponseClass() {
		return UpdateRuleByIdResponse.class;
	}

}
