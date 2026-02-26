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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.nlb.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLoadBalancerAttributeRequest extends RpcAcsRequest<UpdateLoadBalancerAttributeResponse> {
	   

	private Boolean crossZoneEnabled;

	private String clientToken;

	private String loadBalancerName;

	private Boolean dryRun;

	private Integer cps;

	private String loadBalancerId;
	public UpdateLoadBalancerAttributeRequest() {
		super("Nlb", "2022-04-30", "UpdateLoadBalancerAttribute", "nlb");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getCrossZoneEnabled() {
		return this.crossZoneEnabled;
	}

	public void setCrossZoneEnabled(Boolean crossZoneEnabled) {
		this.crossZoneEnabled = crossZoneEnabled;
		if(crossZoneEnabled != null){
			putBodyParameter("CrossZoneEnabled", crossZoneEnabled.toString());
		}
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

	public String getLoadBalancerName() {
		return this.loadBalancerName;
	}

	public void setLoadBalancerName(String loadBalancerName) {
		this.loadBalancerName = loadBalancerName;
		if(loadBalancerName != null){
			putBodyParameter("LoadBalancerName", loadBalancerName);
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

	public Integer getCps() {
		return this.cps;
	}

	public void setCps(Integer cps) {
		this.cps = cps;
		if(cps != null){
			putBodyParameter("Cps", cps.toString());
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

	@Override
	public Class<UpdateLoadBalancerAttributeResponse> getResponseClass() {
		return UpdateLoadBalancerAttributeResponse.class;
	}

}
