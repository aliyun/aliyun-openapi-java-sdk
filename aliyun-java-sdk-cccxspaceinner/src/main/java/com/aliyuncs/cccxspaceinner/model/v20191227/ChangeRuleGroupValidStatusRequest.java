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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ChangeRuleGroupValidStatusRequest extends RpcAcsRequest<ChangeRuleGroupValidStatusResponse> {
	   

	private Long ruleGroupId;

	private Boolean status;

	private Long servicerId;
	public ChangeRuleGroupValidStatusRequest() {
		super("CCCXSpaceInner", "2019-12-27", "ChangeRuleGroupValidStatus");
		setMethod(MethodType.PUT);
	}

	public Long getRuleGroupId() {
		return this.ruleGroupId;
	}

	public void setRuleGroupId(Long ruleGroupId) {
		this.ruleGroupId = ruleGroupId;
		if(ruleGroupId != null){
			putBodyParameter("RuleGroupId", ruleGroupId.toString());
		}
	}

	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status.toString());
		}
	}

	public Long getServicerId() {
		return this.servicerId;
	}

	public void setServicerId(Long servicerId) {
		this.servicerId = servicerId;
		if(servicerId != null){
			putBodyParameter("ServicerId", servicerId.toString());
		}
	}

	@Override
	public Class<ChangeRuleGroupValidStatusResponse> getResponseClass() {
		return ChangeRuleGroupValidStatusResponse.class;
	}

}
