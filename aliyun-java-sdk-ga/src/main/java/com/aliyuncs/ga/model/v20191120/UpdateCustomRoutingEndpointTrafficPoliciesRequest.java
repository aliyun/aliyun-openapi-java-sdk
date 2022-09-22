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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ga.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateCustomRoutingEndpointTrafficPoliciesRequest extends RpcAcsRequest<UpdateCustomRoutingEndpointTrafficPoliciesResponse> {
	   

	private String clientToken;

	private String endpointId;

	private List<PolicyConfigurations> policyConfigurationss;
	public UpdateCustomRoutingEndpointTrafficPoliciesRequest() {
		super("Ga", "2019-11-20", "UpdateCustomRoutingEndpointTrafficPolicies", "gaplus");
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

	public List<PolicyConfigurations> getPolicyConfigurationss() {
		return this.policyConfigurationss;
	}

	public void setPolicyConfigurationss(List<PolicyConfigurations> policyConfigurationss) {
		this.policyConfigurationss = policyConfigurationss;	
		if (policyConfigurationss != null) {
			for (int depth1 = 0; depth1 < policyConfigurationss.size(); depth1++) {
				putQueryParameter("PolicyConfigurations." + (depth1 + 1) + ".PolicyId" , policyConfigurationss.get(depth1).getPolicyId());
				putQueryParameter("PolicyConfigurations." + (depth1 + 1) + ".Address" , policyConfigurationss.get(depth1).getAddress());
				if (policyConfigurationss.get(depth1).getPortRangess() != null) {
					for (int depth2 = 0; depth2 < policyConfigurationss.get(depth1).getPortRangess().size(); depth2++) {
						putQueryParameter("PolicyConfigurations." + (depth1 + 1) + ".PortRanges." + (depth2 + 1) + ".FromPort" , policyConfigurationss.get(depth1).getPortRangess().get(depth2).getFromPort());
						putQueryParameter("PolicyConfigurations." + (depth1 + 1) + ".PortRanges." + (depth2 + 1) + ".ToPort" , policyConfigurationss.get(depth1).getPortRangess().get(depth2).getToPort());
					}
				}
			}
		}	
	}

	public static class PolicyConfigurations {

		private String policyId;

		private String address;

		private List<PortRanges> portRangess;

		public String getPolicyId() {
			return this.policyId;
		}

		public void setPolicyId(String policyId) {
			this.policyId = policyId;
		}

		public String getAddress() {
			return this.address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public List<PortRanges> getPortRangess() {
			return this.portRangess;
		}

		public void setPortRangess(List<PortRanges> portRangess) {
			this.portRangess = portRangess;
		}

		public static class PortRanges {

			private Integer fromPort;

			private Integer toPort;

			public Integer getFromPort() {
				return this.fromPort;
			}

			public void setFromPort(Integer fromPort) {
				this.fromPort = fromPort;
			}

			public Integer getToPort() {
				return this.toPort;
			}

			public void setToPort(Integer toPort) {
				this.toPort = toPort;
			}
		}
	}

	@Override
	public Class<UpdateCustomRoutingEndpointTrafficPoliciesResponse> getResponseClass() {
		return UpdateCustomRoutingEndpointTrafficPoliciesResponse.class;
	}

}
