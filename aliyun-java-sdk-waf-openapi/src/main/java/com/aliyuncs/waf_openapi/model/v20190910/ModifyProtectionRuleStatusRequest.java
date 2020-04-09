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

package com.aliyuncs.waf_openapi.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.waf_openapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyProtectionRuleStatusRequest extends RpcAcsRequest<ModifyProtectionRuleStatusResponse> {
	   

	private Long lockVersion;

	private String defenseType;

	private Integer ruleStatus;

	private String instanceId;

	private String domain;

	private Long ruleId;
	public ModifyProtectionRuleStatusRequest() {
		super("waf-openapi", "2019-09-10", "ModifyProtectionRuleStatus", "waf");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getLockVersion() {
		return this.lockVersion;
	}

	public void setLockVersion(Long lockVersion) {
		this.lockVersion = lockVersion;
		if(lockVersion != null){
			putQueryParameter("LockVersion", lockVersion.toString());
		}
	}

	public String getDefenseType() {
		return this.defenseType;
	}

	public void setDefenseType(String defenseType) {
		this.defenseType = defenseType;
		if(defenseType != null){
			putQueryParameter("DefenseType", defenseType);
		}
	}

	public Integer getRuleStatus() {
		return this.ruleStatus;
	}

	public void setRuleStatus(Integer ruleStatus) {
		this.ruleStatus = ruleStatus;
		if(ruleStatus != null){
			putQueryParameter("RuleStatus", ruleStatus.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
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
	public Class<ModifyProtectionRuleStatusResponse> getResponseClass() {
		return ModifyProtectionRuleStatusResponse.class;
	}

}
