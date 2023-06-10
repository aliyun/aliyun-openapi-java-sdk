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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyInterceptionRuleRequest extends RpcAcsRequest<ModifyInterceptionRuleResponse> {
	   

	private String ruleName;

	private Long orderIndex;

	private String dstTarget;

	private String clusterId;

	private Integer interceptType;

	private Integer ruleSwitch;

	private Long ruleId;

	private String srcTarget;
	public ModifyInterceptionRuleRequest() {
		super("Sas", "2018-12-03", "ModifyInterceptionRule", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Long getOrderIndex() {
		return this.orderIndex;
	}

	public void setOrderIndex(Long orderIndex) {
		this.orderIndex = orderIndex;
		if(orderIndex != null){
			putQueryParameter("OrderIndex", orderIndex.toString());
		}
	}

	public String getDstTarget() {
		return this.dstTarget;
	}

	public void setDstTarget(String dstTarget) {
		this.dstTarget = dstTarget;
		if(dstTarget != null){
			putQueryParameter("DstTarget", dstTarget);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public Integer getInterceptType() {
		return this.interceptType;
	}

	public void setInterceptType(Integer interceptType) {
		this.interceptType = interceptType;
		if(interceptType != null){
			putQueryParameter("InterceptType", interceptType.toString());
		}
	}

	public Integer getRuleSwitch() {
		return this.ruleSwitch;
	}

	public void setRuleSwitch(Integer ruleSwitch) {
		this.ruleSwitch = ruleSwitch;
		if(ruleSwitch != null){
			putQueryParameter("RuleSwitch", ruleSwitch.toString());
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

	public String getSrcTarget() {
		return this.srcTarget;
	}

	public void setSrcTarget(String srcTarget) {
		this.srcTarget = srcTarget;
		if(srcTarget != null){
			putQueryParameter("SrcTarget", srcTarget);
		}
	}

	@Override
	public Class<ModifyInterceptionRuleResponse> getResponseClass() {
		return ModifyInterceptionRuleResponse.class;
	}

}
