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
public class BatchKillProcessListRequest extends RpcAcsRequest<BatchKillProcessListResponse> {
	   

	private String sessionList;

	private Boolean byObSessionId;

	private String instanceId;

	private String tenantId;
	public BatchKillProcessListRequest() {
		super("OceanBasePro", "2019-09-01", "BatchKillProcessList", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSessionList() {
		return this.sessionList;
	}

	public void setSessionList(String sessionList) {
		this.sessionList = sessionList;
		if(sessionList != null){
			putBodyParameter("SessionList", sessionList);
		}
	}

	public Boolean getByObSessionId() {
		return this.byObSessionId;
	}

	public void setByObSessionId(Boolean byObSessionId) {
		this.byObSessionId = byObSessionId;
		if(byObSessionId != null){
			putBodyParameter("ByObSessionId", byObSessionId.toString());
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
	public Class<BatchKillProcessListResponse> getResponseClass() {
		return BatchKillProcessListResponse.class;
	}

}
