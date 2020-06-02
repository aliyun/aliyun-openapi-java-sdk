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

package com.aliyuncs.cr.model.v20181201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceEndpointRequest extends RpcAcsRequest<ListInstanceEndpointResponse> {
	   

	private String instanceId;

	private String moduleName;
	public ListInstanceEndpointRequest() {
		super("cr", "2018-12-01", "ListInstanceEndpoint", "acr");
		setMethod(MethodType.POST);
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

	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
		if(moduleName != null){
			putQueryParameter("ModuleName", moduleName);
		}
	}

	@Override
	public Class<ListInstanceEndpointResponse> getResponseClass() {
		return ListInstanceEndpointResponse.class;
	}

}
