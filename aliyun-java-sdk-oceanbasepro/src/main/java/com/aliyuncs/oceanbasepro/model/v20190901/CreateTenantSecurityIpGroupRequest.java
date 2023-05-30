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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oceanbasepro.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTenantSecurityIpGroupRequest extends RpcAcsRequest<CreateTenantSecurityIpGroupResponse> {
	   

	private String securityIps;

	private String securityIpGroupName;

	private String instanceId;

	private String tenantId;
	public CreateTenantSecurityIpGroupRequest() {
		super("OceanBasePro", "2019-09-01", "CreateTenantSecurityIpGroup", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSecurityIps() {
		return this.securityIps;
	}

	public void setSecurityIps(String securityIps) {
		this.securityIps = securityIps;
		if(securityIps != null){
			putBodyParameter("SecurityIps", securityIps);
		}
	}

	public String getSecurityIpGroupName() {
		return this.securityIpGroupName;
	}

	public void setSecurityIpGroupName(String securityIpGroupName) {
		this.securityIpGroupName = securityIpGroupName;
		if(securityIpGroupName != null){
			putBodyParameter("SecurityIpGroupName", securityIpGroupName);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	@Override
	public Class<CreateTenantSecurityIpGroupResponse> getResponseClass() {
		return CreateTenantSecurityIpGroupResponse.class;
	}

}
