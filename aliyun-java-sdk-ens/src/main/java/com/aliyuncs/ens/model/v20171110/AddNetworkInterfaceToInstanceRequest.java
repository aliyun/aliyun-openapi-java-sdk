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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddNetworkInterfaceToInstanceRequest extends RpcAcsRequest<AddNetworkInterfaceToInstanceResponse> {
	   

	private String networks;

	private Boolean autoStart;

	private String instanceId;
	public AddNetworkInterfaceToInstanceRequest() {
		super("Ens", "2017-11-10", "AddNetworkInterfaceToInstance", "ens");
		setMethod(MethodType.POST);
	}

	public String getNetworks() {
		return this.networks;
	}

	public void setNetworks(String networks) {
		this.networks = networks;
		if(networks != null){
			putQueryParameter("Networks", networks);
		}
	}

	public Boolean getAutoStart() {
		return this.autoStart;
	}

	public void setAutoStart(Boolean autoStart) {
		this.autoStart = autoStart;
		if(autoStart != null){
			putQueryParameter("AutoStart", autoStart.toString());
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

	@Override
	public Class<AddNetworkInterfaceToInstanceResponse> getResponseClass() {
		return AddNetworkInterfaceToInstanceResponse.class;
	}

}
