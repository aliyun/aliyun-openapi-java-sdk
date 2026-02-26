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

package com.aliyuncs.alb.model.v20200616;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.alb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLoadBalancerAddressTypeConfigRequest extends RpcAcsRequest<UpdateLoadBalancerAddressTypeConfigResponse> {
	   

	private String clientToken;

	private String addressType;

	private String dryRun;

	private List<ZoneMappings> zoneMappings;

	private String loadBalancerId;
	public UpdateLoadBalancerAddressTypeConfigRequest() {
		super("Alb", "2020-06-16", "UpdateLoadBalancerAddressTypeConfig", "alb");
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

	public String getAddressType() {
		return this.addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
		if(addressType != null){
			putQueryParameter("AddressType", addressType);
		}
	}

	public String getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(String dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun);
		}
	}

	public List<ZoneMappings> getZoneMappings() {
		return this.zoneMappings;
	}

	public void setZoneMappings(List<ZoneMappings> zoneMappings) {
		this.zoneMappings = zoneMappings;	
		if (zoneMappings != null) {
			for (int depth1 = 0; depth1 < zoneMappings.size(); depth1++) {
				if (zoneMappings.get(depth1) != null) {
					
						putQueryParameter("ZoneMappings." + (depth1 + 1) + ".VSwitchId" , zoneMappings.get(depth1).getVSwitchId());
						putQueryParameter("ZoneMappings." + (depth1 + 1) + ".EipType" , zoneMappings.get(depth1).getEipType());
						putQueryParameter("ZoneMappings." + (depth1 + 1) + ".ZoneId" , zoneMappings.get(depth1).getZoneId());
						putQueryParameter("ZoneMappings." + (depth1 + 1) + ".AllocationId" , zoneMappings.get(depth1).getAllocationId());
				}
			}
		}	
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putQueryParameter("LoadBalancerId", loadBalancerId);
		}
	}

	public static class ZoneMappings {

		private String vSwitchId;

		private String eipType;

		private String zoneId;

		private String allocationId;

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getEipType() {
			return this.eipType;
		}

		public void setEipType(String eipType) {
			this.eipType = eipType;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getAllocationId() {
			return this.allocationId;
		}

		public void setAllocationId(String allocationId) {
			this.allocationId = allocationId;
		}
	}

	@Override
	public Class<UpdateLoadBalancerAddressTypeConfigResponse> getResponseClass() {
		return UpdateLoadBalancerAddressTypeConfigResponse.class;
	}

}
