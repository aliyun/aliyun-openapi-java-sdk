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
public class UpdateCustomRoutingEndpointGroupDestinationsRequest extends RpcAcsRequest<UpdateCustomRoutingEndpointGroupDestinationsResponse> {
	   

	private Boolean dryRun;

	private String clientToken;

	private List<DestinationConfigurations> destinationConfigurationss;

	private String endpointGroupId;
	public UpdateCustomRoutingEndpointGroupDestinationsRequest() {
		super("Ga", "2019-11-20", "UpdateCustomRoutingEndpointGroupDestinations", "gaplus");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public List<DestinationConfigurations> getDestinationConfigurationss() {
		return this.destinationConfigurationss;
	}

	public void setDestinationConfigurationss(List<DestinationConfigurations> destinationConfigurationss) {
		this.destinationConfigurationss = destinationConfigurationss;	
		if (destinationConfigurationss != null) {
			for (int depth1 = 0; depth1 < destinationConfigurationss.size(); depth1++) {
				if (destinationConfigurationss.get(depth1).getProtocolss() != null) {
					for (int i = 0; i < destinationConfigurationss.get(depth1).getProtocolss().size(); i++) {
						putQueryParameter("DestinationConfigurations." + (depth1 + 1) + ".Protocols." + (i + 1) , destinationConfigurationss.get(depth1).getProtocolss().get(i));
					}
				}
				putQueryParameter("DestinationConfigurations." + (depth1 + 1) + ".FromPort" , destinationConfigurationss.get(depth1).getFromPort());
				putQueryParameter("DestinationConfigurations." + (depth1 + 1) + ".ToPort" , destinationConfigurationss.get(depth1).getToPort());
				putQueryParameter("DestinationConfigurations." + (depth1 + 1) + ".DestinationId" , destinationConfigurationss.get(depth1).getDestinationId());
			}
		}	
	}

	public String getEndpointGroupId() {
		return this.endpointGroupId;
	}

	public void setEndpointGroupId(String endpointGroupId) {
		this.endpointGroupId = endpointGroupId;
		if(endpointGroupId != null){
			putQueryParameter("EndpointGroupId", endpointGroupId);
		}
	}

	public static class DestinationConfigurations {

		private List<String> protocolss;

		private Integer fromPort;

		private Integer toPort;

		private String destinationId;

		public List<String> getProtocolss() {
			return this.protocolss;
		}

		public void setProtocolss(List<String> protocolss) {
			this.protocolss = protocolss;
		}

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

		public String getDestinationId() {
			return this.destinationId;
		}

		public void setDestinationId(String destinationId) {
			this.destinationId = destinationId;
		}
	}

	@Override
	public Class<UpdateCustomRoutingEndpointGroupDestinationsResponse> getResponseClass() {
		return UpdateCustomRoutingEndpointGroupDestinationsResponse.class;
	}

}
