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

package com.aliyuncs.nlb.model.v20220430;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class StartShiftLoadBalancerZonesRequest extends RpcAcsRequest<StartShiftLoadBalancerZonesResponse> {
	   

	private String clientToken;

	private Boolean dryRun;

	private List<ZoneMappings> zoneMappingss;

	private String loadBalancerId;
	public StartShiftLoadBalancerZonesRequest() {
		super("Nlb", "2022-04-30", "StartShiftLoadBalancerZones", "nlb");
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
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public List<ZoneMappings> getZoneMappingss() {
		return this.zoneMappingss;
	}

	public void setZoneMappingss(List<ZoneMappings> zoneMappingss) {
		this.zoneMappingss = zoneMappingss;	
		if (zoneMappingss != null) {
			for (int depth1 = 0; depth1 < zoneMappingss.size(); depth1++) {
				putBodyParameter("ZoneMappings." + (depth1 + 1) + ".VSwitchId" , zoneMappingss.get(depth1).getVSwitchId());
				putBodyParameter("ZoneMappings." + (depth1 + 1) + ".ZoneId" , zoneMappingss.get(depth1).getZoneId());
			}
		}	
	}

	public String getLoadBalancerId() {
		return this.loadBalancerId;
	}

	public void setLoadBalancerId(String loadBalancerId) {
		this.loadBalancerId = loadBalancerId;
		if(loadBalancerId != null){
			putBodyParameter("LoadBalancerId", loadBalancerId);
		}
	}

	public static class ZoneMappings {

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
	public Class<StartShiftLoadBalancerZonesResponse> getResponseClass() {
		return StartShiftLoadBalancerZonesResponse.class;
	}

}
