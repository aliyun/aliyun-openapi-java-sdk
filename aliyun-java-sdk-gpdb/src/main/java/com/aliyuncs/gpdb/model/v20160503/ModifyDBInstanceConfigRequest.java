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

package com.aliyuncs.gpdb.model.v20160503;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.gpdb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBInstanceConfigRequest extends RpcAcsRequest<ModifyDBInstanceConfigResponse> {
	   

	private String resourceGroupId;

	private String dBInstanceId;

	private String dBInstanceDescription;

	private Integer serverlessResource;

	private Integer idleTime;
	public ModifyDBInstanceConfigRequest() {
		super("gpdb", "2016-05-03", "ModifyDBInstanceConfig", "gpdb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getDBInstanceDescription() {
		return this.dBInstanceDescription;
	}

	public void setDBInstanceDescription(String dBInstanceDescription) {
		this.dBInstanceDescription = dBInstanceDescription;
		if(dBInstanceDescription != null){
			putQueryParameter("DBInstanceDescription", dBInstanceDescription);
		}
	}

	public Integer getServerlessResource() {
		return this.serverlessResource;
	}

	public void setServerlessResource(Integer serverlessResource) {
		this.serverlessResource = serverlessResource;
		if(serverlessResource != null){
			putQueryParameter("ServerlessResource", serverlessResource.toString());
		}
	}

	public Integer getIdleTime() {
		return this.idleTime;
	}

	public void setIdleTime(Integer idleTime) {
		this.idleTime = idleTime;
		if(idleTime != null){
			putQueryParameter("IdleTime", idleTime.toString());
		}
	}

	@Override
	public Class<ModifyDBInstanceConfigResponse> getResponseClass() {
		return ModifyDBInstanceConfigResponse.class;
	}

}
