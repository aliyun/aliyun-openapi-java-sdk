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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iot.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ReplaceEdgeInstanceGatewayRequest extends RpcAcsRequest<ReplaceEdgeInstanceGatewayResponse> {
	   

	private String newGatewayId;

	private String iotInstanceId;

	private String instanceId;

	private String currentGatewayId;
	public ReplaceEdgeInstanceGatewayRequest() {
		super("Iot", "2018-01-20", "ReplaceEdgeInstanceGateway", "iot");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNewGatewayId() {
		return this.newGatewayId;
	}

	public void setNewGatewayId(String newGatewayId) {
		this.newGatewayId = newGatewayId;
		if(newGatewayId != null){
			putQueryParameter("NewGatewayId", newGatewayId);
		}
	}

	public String getIotInstanceId() {
		return this.iotInstanceId;
	}

	public void setIotInstanceId(String iotInstanceId) {
		this.iotInstanceId = iotInstanceId;
		if(iotInstanceId != null){
			putQueryParameter("IotInstanceId", iotInstanceId);
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

	public String getCurrentGatewayId() {
		return this.currentGatewayId;
	}

	public void setCurrentGatewayId(String currentGatewayId) {
		this.currentGatewayId = currentGatewayId;
		if(currentGatewayId != null){
			putQueryParameter("CurrentGatewayId", currentGatewayId);
		}
	}

	@Override
	public Class<ReplaceEdgeInstanceGatewayResponse> getResponseClass() {
		return ReplaceEdgeInstanceGatewayResponse.class;
	}

}
