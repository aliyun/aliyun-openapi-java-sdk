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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RebootInstancesRequest extends RpcAcsRequest<RebootInstancesResponse> {
	   

	private String clientToken;

	private Boolean forceReboot;

	private String instanceIds;
	public RebootInstancesRequest() {
		super("SWAS-OPEN", "2020-06-01", "RebootInstances", "SWAS-OPEN");
		setMethod(MethodType.POST);
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

	public Boolean getForceReboot() {
		return this.forceReboot;
	}

	public void setForceReboot(Boolean forceReboot) {
		this.forceReboot = forceReboot;
		if(forceReboot != null){
			putQueryParameter("ForceReboot", forceReboot.toString());
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	@Override
	public Class<RebootInstancesResponse> getResponseClass() {
		return RebootInstancesResponse.class;
	}

}
