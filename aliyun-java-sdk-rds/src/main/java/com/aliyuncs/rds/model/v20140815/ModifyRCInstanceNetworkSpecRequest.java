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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ModifyRCInstanceNetworkSpecRequest extends RpcAcsRequest<ModifyRCInstanceNetworkSpecResponse> {
	   

	private String internetMaxBandwidthOut;

	private String instanceId;

	private String networkChargeType;
	public ModifyRCInstanceNetworkSpecRequest() {
		super("Rds", "2014-08-15", "ModifyRCInstanceNetworkSpec", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInternetMaxBandwidthOut() {
		return this.internetMaxBandwidthOut;
	}

	public void setInternetMaxBandwidthOut(String internetMaxBandwidthOut) {
		this.internetMaxBandwidthOut = internetMaxBandwidthOut;
		if(internetMaxBandwidthOut != null){
			putQueryParameter("InternetMaxBandwidthOut", internetMaxBandwidthOut);
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

	public String getNetworkChargeType() {
		return this.networkChargeType;
	}

	public void setNetworkChargeType(String networkChargeType) {
		this.networkChargeType = networkChargeType;
		if(networkChargeType != null){
			putQueryParameter("NetworkChargeType", networkChargeType);
		}
	}

	@Override
	public Class<ModifyRCInstanceNetworkSpecResponse> getResponseClass() {
		return ModifyRCInstanceNetworkSpecResponse.class;
	}

}
