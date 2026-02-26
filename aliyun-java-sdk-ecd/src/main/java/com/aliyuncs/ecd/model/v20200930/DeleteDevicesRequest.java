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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteDevicesRequest extends RpcAcsRequest<DeleteDevicesResponse> {
	   

	private Integer clientType;

	private List<String> deviceIdss;

	private Integer force;
	public DeleteDevicesRequest() {
		super("ecd", "2020-09-30", "DeleteDevices", "gwsecd");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getClientType() {
		return this.clientType;
	}

	public void setClientType(Integer clientType) {
		this.clientType = clientType;
		if(clientType != null){
			putQueryParameter("ClientType", clientType.toString());
		}
	}

	public List<String> getDeviceIdss() {
		return this.deviceIdss;
	}

	public void setDeviceIdss(List<String> deviceIdss) {
		this.deviceIdss = deviceIdss;	
		if (deviceIdss != null) {
			for (int i = 0; i < deviceIdss.size(); i++) {
				putQueryParameter("DeviceIds." + (i + 1) , deviceIdss.get(i));
			}
		}	
	}

	public Integer getForce() {
		return this.force;
	}

	public void setForce(Integer force) {
		this.force = force;
		if(force != null){
			putQueryParameter("Force", force.toString());
		}
	}

	@Override
	public Class<DeleteDevicesResponse> getResponseClass() {
		return DeleteDevicesResponse.class;
	}

}
