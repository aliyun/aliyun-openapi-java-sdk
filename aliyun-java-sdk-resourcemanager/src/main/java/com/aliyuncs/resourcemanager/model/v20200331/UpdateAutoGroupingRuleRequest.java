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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcemanager.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateAutoGroupingRuleRequest extends RpcAcsRequest<UpdateAutoGroupingRuleResponse> {
	   

	private String ruleDesc;

	private String resourceTypesScope;

	private String ruleName;

	private String excludeResourceGroupIdsScope;

	private String regionIdsScope;

	private String resourceIdsScope;

	private List<RuleContents> ruleContentss;

	private String excludeResourceTypesScope;

	private String resourceGroupIdsScope;

	private String excludeRegionIdsScope;

	private String excludeResourceIdsScope;

	private String ruleId;
	public UpdateAutoGroupingRuleRequest() {
		super("ResourceManager", "2020-03-31", "UpdateAutoGroupingRule", "resourcemanager");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRuleDesc() {
		return this.ruleDesc;
	}

	public void setRuleDesc(String ruleDesc) {
		this.ruleDesc = ruleDesc;
		if(ruleDesc != null){
			putQueryParameter("RuleDesc", ruleDesc);
		}
	}

	public String getResourceTypesScope() {
		return this.resourceTypesScope;
	}

	public void setResourceTypesScope(String resourceTypesScope) {
		this.resourceTypesScope = resourceTypesScope;
		if(resourceTypesScope != null){
			putQueryParameter("ResourceTypesScope", resourceTypesScope);
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

	public String getExcludeResourceGroupIdsScope() {
		return this.excludeResourceGroupIdsScope;
	}

	public void setExcludeResourceGroupIdsScope(String excludeResourceGroupIdsScope) {
		this.excludeResourceGroupIdsScope = excludeResourceGroupIdsScope;
		if(excludeResourceGroupIdsScope != null){
			putQueryParameter("ExcludeResourceGroupIdsScope", excludeResourceGroupIdsScope);
		}
	}

	public String getRegionIdsScope() {
		return this.regionIdsScope;
	}

	public void setRegionIdsScope(String regionIdsScope) {
		this.regionIdsScope = regionIdsScope;
		if(regionIdsScope != null){
			putQueryParameter("RegionIdsScope", regionIdsScope);
		}
	}

	public String getResourceIdsScope() {
		return this.resourceIdsScope;
	}

	public void setResourceIdsScope(String resourceIdsScope) {
		this.resourceIdsScope = resourceIdsScope;
		if(resourceIdsScope != null){
			putQueryParameter("ResourceIdsScope", resourceIdsScope);
		}
	}

	public List<RuleContents> getRuleContentss() {
		return this.ruleContentss;
	}

	public void setRuleContentss(List<RuleContents> ruleContentss) {
		this.ruleContentss = ruleContentss;	
		if (ruleContentss != null) {
			for (int depth1 = 0; depth1 < ruleContentss.size(); depth1++) {
				putQueryParameter("RuleContents." + (depth1 + 1) + ".RuleContentId" , ruleContentss.get(depth1).getRuleContentId());
				putQueryParameter("RuleContents." + (depth1 + 1) + ".TargetResourceGroupCondition" , ruleContentss.get(depth1).getTargetResourceGroupCondition());
				putQueryParameter("RuleContents." + (depth1 + 1) + ".AutoGroupingScopeCondition" , ruleContentss.get(depth1).getAutoGroupingScopeCondition());
			}
		}	
	}

	public String getExcludeResourceTypesScope() {
		return this.excludeResourceTypesScope;
	}

	public void setExcludeResourceTypesScope(String excludeResourceTypesScope) {
		this.excludeResourceTypesScope = excludeResourceTypesScope;
		if(excludeResourceTypesScope != null){
			putQueryParameter("ExcludeResourceTypesScope", excludeResourceTypesScope);
		}
	}

	public String getResourceGroupIdsScope() {
		return this.resourceGroupIdsScope;
	}

	public void setResourceGroupIdsScope(String resourceGroupIdsScope) {
		this.resourceGroupIdsScope = resourceGroupIdsScope;
		if(resourceGroupIdsScope != null){
			putQueryParameter("ResourceGroupIdsScope", resourceGroupIdsScope);
		}
	}

	public String getExcludeRegionIdsScope() {
		return this.excludeRegionIdsScope;
	}

	public void setExcludeRegionIdsScope(String excludeRegionIdsScope) {
		this.excludeRegionIdsScope = excludeRegionIdsScope;
		if(excludeRegionIdsScope != null){
			putQueryParameter("ExcludeRegionIdsScope", excludeRegionIdsScope);
		}
	}

	public String getExcludeResourceIdsScope() {
		return this.excludeResourceIdsScope;
	}

	public void setExcludeResourceIdsScope(String excludeResourceIdsScope) {
		this.excludeResourceIdsScope = excludeResourceIdsScope;
		if(excludeResourceIdsScope != null){
			putQueryParameter("ExcludeResourceIdsScope", excludeResourceIdsScope);
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

	public static class RuleContents {

		private String ruleContentId;

		private String targetResourceGroupCondition;

		private String autoGroupingScopeCondition;

		public String getRuleContentId() {
			return this.ruleContentId;
		}

		public void setRuleContentId(String ruleContentId) {
			this.ruleContentId = ruleContentId;
		}

		public String getTargetResourceGroupCondition() {
			return this.targetResourceGroupCondition;
		}

		public void setTargetResourceGroupCondition(String targetResourceGroupCondition) {
			this.targetResourceGroupCondition = targetResourceGroupCondition;
		}

		public String getAutoGroupingScopeCondition() {
			return this.autoGroupingScopeCondition;
		}

		public void setAutoGroupingScopeCondition(String autoGroupingScopeCondition) {
			this.autoGroupingScopeCondition = autoGroupingScopeCondition;
		}
	}

	@Override
	public Class<UpdateAutoGroupingRuleResponse> getResponseClass() {
		return UpdateAutoGroupingRuleResponse.class;
	}

}
