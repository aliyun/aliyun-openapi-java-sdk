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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AttachLoadBalancersRequest extends RpcAcsRequest<AttachLoadBalancersResponse> {
	   

	private String clientToken;

	private String scalingGroupId;

	private Boolean forceAttach;

	private List<LoadBalancerConfig> loadBalancerConfigs;

	private List<String> loadBalancers;

	private String resourceOwnerAccount;

	private Long ownerId;

	private Boolean async;
	public AttachLoadBalancersRequest() {
		super("Ess", "2014-08-28", "AttachLoadBalancers", "ess");
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

	public String getScalingGroupId() {
		return this.scalingGroupId;
	}

	public void setScalingGroupId(String scalingGroupId) {
		this.scalingGroupId = scalingGroupId;
		if(scalingGroupId != null){
			putQueryParameter("ScalingGroupId", scalingGroupId);
		}
	}

	public Boolean getForceAttach() {
		return this.forceAttach;
	}

	public void setForceAttach(Boolean forceAttach) {
		this.forceAttach = forceAttach;
		if(forceAttach != null){
			putQueryParameter("ForceAttach", forceAttach.toString());
		}
	}

	public List<LoadBalancerConfig> getLoadBalancerConfigs() {
		return this.loadBalancerConfigs;
	}

	public void setLoadBalancerConfigs(List<LoadBalancerConfig> loadBalancerConfigs) {
		this.loadBalancerConfigs = loadBalancerConfigs;	
		if (loadBalancerConfigs != null) {
			for (int depth1 = 0; depth1 < loadBalancerConfigs.size(); depth1++) {
				putQueryParameter("LoadBalancerConfig." + (depth1 + 1) + ".LoadBalancerId" , loadBalancerConfigs.get(depth1).getLoadBalancerId());
				putQueryParameter("LoadBalancerConfig." + (depth1 + 1) + ".Weight" , loadBalancerConfigs.get(depth1).getWeight());
			}
		}	
	}

	public List<String> getLoadBalancers() {
		return this.loadBalancers;
	}

	public void setLoadBalancers(List<String> loadBalancers) {
		this.loadBalancers = loadBalancers;	
		if (loadBalancers != null) {
			for (int i = 0; i < loadBalancers.size(); i++) {
				putQueryParameter("LoadBalancer." + (i + 1) , loadBalancers.get(i));
			}
		}	
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Boolean getAsync() {
		return this.async;
	}

	public void setAsync(Boolean async) {
		this.async = async;
		if(async != null){
			putQueryParameter("Async", async.toString());
		}
	}

	public static class LoadBalancerConfig {

		private String loadBalancerId;

		private Integer weight;

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}
	}

	@Override
	public Class<AttachLoadBalancersResponse> getResponseClass() {
		return AttachLoadBalancersResponse.class;
	}

}
