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

package com.aliyuncs.cms.model.v20190101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateMetricRuleResourcesRequest extends RpcAcsRequest<CreateMetricRuleResourcesResponse> {
	   

	private String resources;

	private String ruleId;

	private String overwrite;
	public CreateMetricRuleResourcesRequest() {
		super("Cms", "2019-01-01", "CreateMetricRuleResources", "cms");
		setMethod(MethodType.POST);
	}

	public String getResources() {
		return this.resources;
	}

	public void setResources(String resources) {
		this.resources = resources;
		if(resources != null){
			putQueryParameter("Resources", resources);
		}
	}

	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId);
		}
	}

	public String getOverwrite() {
		return this.overwrite;
	}

	public void setOverwrite(String overwrite) {
		this.overwrite = overwrite;
		if(overwrite != null){
			putQueryParameter("Overwrite", overwrite);
		}
	}

	@Override
	public Class<CreateMetricRuleResourcesResponse> getResponseClass() {
		return CreateMetricRuleResourcesResponse.class;
	}

}
