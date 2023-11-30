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
public class GetRuleV4StrRequest extends RpcAcsRequest<GetRuleV4StrResponse> {
	   

	private Integer isSchemeData;

	private Long ruleId;
	public GetRuleV4StrRequest() {
		super("Qualitycheck", "2019-01-15", "GetRuleV4Str");
		setMethod(MethodType.POST);
	}

	public Integer getIsSchemeData() {
		return this.isSchemeData;
	}

	public void setIsSchemeData(Integer isSchemeData) {
		this.isSchemeData = isSchemeData;
		if(isSchemeData != null){
			putBodyParameter("IsSchemeData", isSchemeData.toString());
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

	@Override
	public Class<GetRuleV4StrResponse> getResponseClass() {
		return GetRuleV4StrResponse.class;
	}

}
