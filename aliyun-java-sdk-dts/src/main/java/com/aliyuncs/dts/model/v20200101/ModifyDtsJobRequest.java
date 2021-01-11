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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyDtsJobRequest extends RpcAcsRequest<ModifyDtsJobResponse> {
	   

	private String dbList;

	private String clientToken;

	private String dtsInstanceId;

	private String synchronizationDirection;
	public ModifyDtsJobRequest() {
		super("Dts", "2020-01-01", "ModifyDtsJob", "dts");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDbList() {
		return this.dbList;
	}

	public void setDbList(String dbList) {
		this.dbList = dbList;
		if(dbList != null){
			putBodyParameter("DbList", dbList);
		}
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getDtsInstanceId() {
		return this.dtsInstanceId;
	}

	public void setDtsInstanceId(String dtsInstanceId) {
		this.dtsInstanceId = dtsInstanceId;
		if(dtsInstanceId != null){
			putQueryParameter("DtsInstanceId", dtsInstanceId);
		}
	}

	public String getSynchronizationDirection() {
		return this.synchronizationDirection;
	}

	public void setSynchronizationDirection(String synchronizationDirection) {
		this.synchronizationDirection = synchronizationDirection;
		if(synchronizationDirection != null){
			putQueryParameter("SynchronizationDirection", synchronizationDirection);
		}
	}

	@Override
	public Class<ModifyDtsJobResponse> getResponseClass() {
		return ModifyDtsJobResponse.class;
	}

}
