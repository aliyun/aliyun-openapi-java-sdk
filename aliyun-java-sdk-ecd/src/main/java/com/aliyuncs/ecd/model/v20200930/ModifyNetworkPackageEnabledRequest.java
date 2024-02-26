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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyNetworkPackageEnabledRequest extends RpcAcsRequest<ModifyNetworkPackageEnabledResponse> {
	   

	private String networkPackageId;

	private Boolean enabled;
	public ModifyNetworkPackageEnabledRequest() {
		super("ecd", "2020-09-30", "ModifyNetworkPackageEnabled", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNetworkPackageId() {
		return this.networkPackageId;
	}

	public void setNetworkPackageId(String networkPackageId) {
		this.networkPackageId = networkPackageId;
		if(networkPackageId != null){
			putQueryParameter("NetworkPackageId", networkPackageId);
		}
	}

	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
		if(enabled != null){
			putQueryParameter("Enabled", enabled.toString());
		}
	}

	@Override
	public Class<ModifyNetworkPackageEnabledResponse> getResponseClass() {
		return ModifyNetworkPackageEnabledResponse.class;
	}

}
