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
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.privatelink.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateVpcEndpointRequest extends RpcAcsRequest<CreateVpcEndpointResponse> {
	   

	private String clientToken;

	private List<String> securityGroupIds;

	private List<Zone> zones;

	private String serviceName;

	private Boolean dryRun;

	private String endpointDescription;

	private String endpointName;

	private String vpcId;

	private String serviceId;
	public CreateVpcEndpointRequest() {
		super("Privatelink", "2020-04-15", "CreateVpcEndpoint", "privatelink");
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

	public List<String> getSecurityGroupIds() {
		return this.securityGroupIds;
	}

	public void setSecurityGroupIds(List<String> securityGroupIds) {
		this.securityGroupIds = securityGroupIds;	
		if (securityGroupIds != null) {
			for (int i = 0; i < securityGroupIds.size(); i++) {
				putQueryParameter("SecurityGroupId." + (i + 1) , securityGroupIds.get(i));
			}
		}	
	}

	public List<Zone> getZones() {
		return this.zones;
	}

	public void setZones(List<Zone> zones) {
		this.zones = zones;	
		if (zones != null) {
			for (int depth1 = 0; depth1 < zones.size(); depth1++) {
				putQueryParameter("Zone." + (depth1 + 1) + ".VSwitchId" , zones.get(depth1).getVSwitchId());
				putQueryParameter("Zone." + (depth1 + 1) + ".ZoneId" , zones.get(depth1).getZoneId());
			}
		}	
	}

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
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

	public String getEndpointDescription() {
		return this.endpointDescription;
	}

	public void setEndpointDescription(String endpointDescription) {
		this.endpointDescription = endpointDescription;
		if(endpointDescription != null){
			putQueryParameter("EndpointDescription", endpointDescription);
		}
	}

	public String getEndpointName() {
		return this.endpointName;
	}

	public void setEndpointName(String endpointName) {
		this.endpointName = endpointName;
		if(endpointName != null){
			putQueryParameter("EndpointName", endpointName);
		}
	}

	public String getVpcId() {
		return this.vpcId;
	}

	public void setVpcId(String vpcId) {
		this.vpcId = vpcId;
		if(vpcId != null){
			putQueryParameter("VpcId", vpcId);
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

	public static class Zone {

		private String vSwitchId;

		private String zoneId;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}
	}

	@Override
	public Class<CreateVpcEndpointResponse> getResponseClass() {
		return CreateVpcEndpointResponse.class;
	}

}
