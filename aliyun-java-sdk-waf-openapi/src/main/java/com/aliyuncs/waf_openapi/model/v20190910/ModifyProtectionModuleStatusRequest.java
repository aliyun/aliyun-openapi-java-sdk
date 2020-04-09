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
public class ModifyProtectionModuleStatusRequest extends RpcAcsRequest<ModifyProtectionModuleStatusResponse> {
	   

	private String defenseType;

	private String instanceId;

	private String domain;

	private Integer moduleStatus;
	public ModifyProtectionModuleStatusRequest() {
		super("waf-openapi", "2019-09-10", "ModifyProtectionModuleStatus", "waf");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getModuleStatus() {
		return this.moduleStatus;
	}

	public void setModuleStatus(Integer moduleStatus) {
		this.moduleStatus = moduleStatus;
		if(moduleStatus != null){
			putQueryParameter("ModuleStatus", moduleStatus.toString());
		}
	}

	@Override
	public Class<ModifyProtectionModuleStatusResponse> getResponseClass() {
		return ModifyProtectionModuleStatusResponse.class;
	}

}
