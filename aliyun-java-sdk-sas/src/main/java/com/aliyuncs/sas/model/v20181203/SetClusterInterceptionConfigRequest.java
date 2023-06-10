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
public class SetClusterInterceptionConfigRequest extends RpcAcsRequest<SetClusterInterceptionConfigResponse> {
	   

	private String clusterIds;

	private Integer switchType;

	private Integer switchOn;
	public SetClusterInterceptionConfigRequest() {
		super("Sas", "2018-12-03", "SetClusterInterceptionConfig", "sas");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getClusterIds() {
		return this.clusterIds;
	}

	public void setClusterIds(String clusterIds) {
		this.clusterIds = clusterIds;
		if(clusterIds != null){
			putQueryParameter("ClusterIds", clusterIds);
		}
	}

	public Integer getSwitchType() {
		return this.switchType;
	}

	public void setSwitchType(Integer switchType) {
		this.switchType = switchType;
		if(switchType != null){
			putQueryParameter("SwitchType", switchType.toString());
		}
	}

	public Integer getSwitchOn() {
		return this.switchOn;
	}

	public void setSwitchOn(Integer switchOn) {
		this.switchOn = switchOn;
		if(switchOn != null){
			putQueryParameter("SwitchOn", switchOn.toString());
		}
	}

	@Override
	public Class<SetClusterInterceptionConfigResponse> getResponseClass() {
		return SetClusterInterceptionConfigResponse.class;
	}

}
