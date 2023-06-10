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
public class CreateInterceptionRuleRequest extends RpcAcsRequest<CreateInterceptionRuleResponse> {
	   

	private String clusterName;

	private String ruleName;

	private String dstTargetList;

	private Long orderIndex;

	private String ruleType;

	private String clusterId;

	private Long interceptType;

	private Integer ruleSwitch;

	private String srcTarget;
	public CreateInterceptionRuleRequest() {
		super("Sas", "2018-12-03", "CreateInterceptionRule", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClusterName() {
		return this.clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
		if(clusterName != null){
			putQueryParameter("ClusterName", clusterName);
		}
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

	public String getDstTargetList() {
		return this.dstTargetList;
	}

	public void setDstTargetList(String dstTargetList) {
		this.dstTargetList = dstTargetList;
		if(dstTargetList != null){
			putQueryParameter("DstTargetList", dstTargetList);
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

	public String getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
		if(ruleType != null){
			putQueryParameter("RuleType", ruleType);
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

	public Long getInterceptType() {
		return this.interceptType;
	}

	public void setInterceptType(Long interceptType) {
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
	public Class<CreateInterceptionRuleResponse> getResponseClass() {
		return CreateInterceptionRuleResponse.class;
	}

}
