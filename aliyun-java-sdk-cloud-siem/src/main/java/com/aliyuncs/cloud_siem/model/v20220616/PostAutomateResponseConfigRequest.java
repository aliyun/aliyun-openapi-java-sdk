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

package com.aliyuncs.cloud_siem.model.v20220616;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PostAutomateResponseConfigRequest extends RpcAcsRequest<PostAutomateResponseConfigResponse> {
	   

	private String actionType;

	private String ruleName;

	private String executionCondition;

	private String actionConfig;

	private Long subUserId;

	private String autoResponseType;

	private Long id;
	public PostAutomateResponseConfigRequest() {
		super("cloud-siem", "2022-06-16", "PostAutomateResponseConfig", "cloud-siem");
		setMethod(MethodType.POST);
	}

	public String getActionType() {
		return this.actionType;
	}

	public void setActionType(String actionType) {
		this.actionType = actionType;
		if(actionType != null){
			putBodyParameter("ActionType", actionType);
		}
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putBodyParameter("RuleName", ruleName);
		}
	}

	public String getExecutionCondition() {
		return this.executionCondition;
	}

	public void setExecutionCondition(String executionCondition) {
		this.executionCondition = executionCondition;
		if(executionCondition != null){
			putBodyParameter("ExecutionCondition", executionCondition);
		}
	}

	public String getActionConfig() {
		return this.actionConfig;
	}

	public void setActionConfig(String actionConfig) {
		this.actionConfig = actionConfig;
		if(actionConfig != null){
			putBodyParameter("ActionConfig", actionConfig);
		}
	}

	public Long getSubUserId() {
		return this.subUserId;
	}

	public void setSubUserId(Long subUserId) {
		this.subUserId = subUserId;
		if(subUserId != null){
			putBodyParameter("SubUserId", subUserId.toString());
		}
	}

	public String getAutoResponseType() {
		return this.autoResponseType;
	}

	public void setAutoResponseType(String autoResponseType) {
		this.autoResponseType = autoResponseType;
		if(autoResponseType != null){
			putBodyParameter("AutoResponseType", autoResponseType);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	@Override
	public Class<PostAutomateResponseConfigResponse> getResponseClass() {
		return PostAutomateResponseConfigResponse.class;
	}

}
