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

package com.aliyuncs.privatelink.model.v20200415;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.privatelink.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EnableVpcEndpointZoneConnectionRequest extends RpcAcsRequest<EnableVpcEndpointZoneConnectionResponse> {
	   

	private String clientToken;

	private String endpointId;

	private Boolean dryRun;

	private String zoneId;

	private String serviceId;
	public EnableVpcEndpointZoneConnectionRequest() {
		super("Privatelink", "2020-04-15", "EnableVpcEndpointZoneConnection", "privatelink");
		setProtocol(ProtocolType.HTTPS);
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

	public String getEndpointId() {
		return this.endpointId;
	}

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
		if(endpointId != null){
			putQueryParameter("EndpointId", endpointId);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
		}
	}

	public String getServiceId() {
		return this.serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
		if(serviceId != null){
			putQueryParameter("ServiceId", serviceId);
		}
	}

	@Override
	public Class<EnableVpcEndpointZoneConnectionResponse> getResponseClass() {
		return EnableVpcEndpointZoneConnectionResponse.class;
	}

}
