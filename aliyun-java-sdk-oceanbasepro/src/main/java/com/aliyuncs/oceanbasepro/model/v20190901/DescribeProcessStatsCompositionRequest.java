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
public class DescribeProcessStatsCompositionRequest extends RpcAcsRequest<DescribeProcessStatsCompositionResponse> {
	   

	private String uId;

	private Boolean mergeDynamicSql;

	private String sqlText;

	private String clientIp;

	private String tenantId;

	private String serverIp;

	private String users;

	private String instanceId;

	private String status;
	public DescribeProcessStatsCompositionRequest() {
		super("OceanBasePro", "2019-09-01", "DescribeProcessStatsComposition", "oceanbase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUId() {
		return this.uId;
	}

	public void setUId(String uId) {
		this.uId = uId;
		if(uId != null){
			putBodyParameter("UId", uId);
		}
	}

	public Boolean getMergeDynamicSql() {
		return this.mergeDynamicSql;
	}

	public void setMergeDynamicSql(Boolean mergeDynamicSql) {
		this.mergeDynamicSql = mergeDynamicSql;
		if(mergeDynamicSql != null){
			putBodyParameter("MergeDynamicSql", mergeDynamicSql.toString());
		}
	}

	public String getSqlText() {
		return this.sqlText;
	}

	public void setSqlText(String sqlText) {
		this.sqlText = sqlText;
		if(sqlText != null){
			putBodyParameter("SqlText", sqlText);
		}
	}

	public String getClientIp() {
		return this.clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
		if(clientIp != null){
			putBodyParameter("ClientIp", clientIp);
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

	public String getServerIp() {
		return this.serverIp;
	}

	public void setServerIp(String serverIp) {
		this.serverIp = serverIp;
		if(serverIp != null){
			putBodyParameter("ServerIp", serverIp);
		}
	}

	public String getUsers() {
		return this.users;
	}

	public void setUsers(String users) {
		this.users = users;
		if(users != null){
			putBodyParameter("Users", users);
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putBodyParameter("Status", status);
		}
	}

	@Override
	public Class<DescribeProcessStatsCompositionResponse> getResponseClass() {
		return DescribeProcessStatsCompositionResponse.class;
	}

}
