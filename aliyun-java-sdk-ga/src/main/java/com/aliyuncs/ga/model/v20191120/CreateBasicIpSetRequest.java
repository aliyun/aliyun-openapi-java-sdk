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
public class CreateBasicIpSetRequest extends RpcAcsRequest<CreateBasicIpSetResponse> {
	   

	private String clientToken;

	private Long bandwidth;

	private String ispType;

	private String accelerateRegionId;

	private String acceleratorId;
	public CreateBasicIpSetRequest() {
		super("Ga", "2019-11-20", "CreateBasicIpSet", "gaplus");
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

	public Long getBandwidth() {
		return this.bandwidth;
	}

	public void setBandwidth(Long bandwidth) {
		this.bandwidth = bandwidth;
		if(bandwidth != null){
			putQueryParameter("Bandwidth", bandwidth.toString());
		}
	}

	public String getIspType() {
		return this.ispType;
	}

	public void setIspType(String ispType) {
		this.ispType = ispType;
		if(ispType != null){
			putQueryParameter("IspType", ispType);
		}
	}

	public String getAccelerateRegionId() {
		return this.accelerateRegionId;
	}

	public void setAccelerateRegionId(String accelerateRegionId) {
		this.accelerateRegionId = accelerateRegionId;
		if(accelerateRegionId != null){
			putQueryParameter("AccelerateRegionId", accelerateRegionId);
		}
	}

	public String getAcceleratorId() {
		return this.acceleratorId;
	}

	public void setAcceleratorId(String acceleratorId) {
		this.acceleratorId = acceleratorId;
		if(acceleratorId != null){
			putQueryParameter("AcceleratorId", acceleratorId);
		}
	}

	@Override
	public Class<CreateBasicIpSetResponse> getResponseClass() {
		return CreateBasicIpSetResponse.class;
	}

}
