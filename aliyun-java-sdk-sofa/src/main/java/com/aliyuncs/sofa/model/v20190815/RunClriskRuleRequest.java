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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RunClriskRuleRequest extends RpcAcsRequest<RunClriskRuleResponse> {
	   

	private String cycle;

	private String content;

	private String ruleCode;

	private String modelCode;
	public RunClriskRuleRequest() {
		super("SOFA", "2019-08-15", "RunClriskRule", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCycle() {
		return this.cycle;
	}

	public void setCycle(String cycle) {
		this.cycle = cycle;
		if(cycle != null){
			putBodyParameter("Cycle", cycle);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getRuleCode() {
		return this.ruleCode;
	}

	public void setRuleCode(String ruleCode) {
		this.ruleCode = ruleCode;
		if(ruleCode != null){
			putBodyParameter("RuleCode", ruleCode);
		}
	}

	public String getModelCode() {
		return this.modelCode;
	}

	public void setModelCode(String modelCode) {
		this.modelCode = modelCode;
		if(modelCode != null){
			putBodyParameter("ModelCode", modelCode);
		}
	}

	@Override
	public Class<RunClriskRuleResponse> getResponseClass() {
		return RunClriskRuleResponse.class;
	}

}
