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
public class StartPreCheckDatabaseRequest extends RpcAcsRequest<StartPreCheckDatabaseResponse> {
	   

	private String databaseType;

	private String instanceUuid;

	private String uniRegionId;
	public StartPreCheckDatabaseRequest() {
		super("Sas", "2018-12-03", "StartPreCheckDatabase");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDatabaseType() {
		return this.databaseType;
	}

	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
		if(databaseType != null){
			putQueryParameter("DatabaseType", databaseType);
		}
	}

	public String getInstanceUuid() {
		return this.instanceUuid;
	}

	public void setInstanceUuid(String instanceUuid) {
		this.instanceUuid = instanceUuid;
		if(instanceUuid != null){
			putQueryParameter("InstanceUuid", instanceUuid);
		}
	}

	public String getUniRegionId() {
		return this.uniRegionId;
	}

	public void setUniRegionId(String uniRegionId) {
		this.uniRegionId = uniRegionId;
		if(uniRegionId != null){
			putQueryParameter("UniRegionId", uniRegionId);
		}
	}

	@Override
	public Class<StartPreCheckDatabaseResponse> getResponseClass() {
		return StartPreCheckDatabaseResponse.class;
	}

}
