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

package com.aliyuncs.ga.model.v20191120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteBasicAccelerateIpRequest extends RpcAcsRequest<DeleteBasicAccelerateIpResponse> {
	   

	private String clientToken;

	private String accelerateIpId;
	public DeleteBasicAccelerateIpRequest() {
		super("Ga", "2019-11-20", "DeleteBasicAccelerateIp", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getAccelerateIpId() {
		return this.accelerateIpId;
	}

	public void setAccelerateIpId(String accelerateIpId) {
		this.accelerateIpId = accelerateIpId;
		if(accelerateIpId != null){
			putQueryParameter("AccelerateIpId", accelerateIpId);
		}
	}

	@Override
	public Class<DeleteBasicAccelerateIpResponse> getResponseClass() {
		return DeleteBasicAccelerateIpResponse.class;
	}

}
