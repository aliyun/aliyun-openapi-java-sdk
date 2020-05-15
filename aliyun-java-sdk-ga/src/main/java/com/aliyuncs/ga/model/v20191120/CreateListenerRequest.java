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
public class CreateListenerRequest extends RpcAcsRequest<CreateListenerResponse> {
	   

	private String clientToken;

	private String description;

	private List<PortRanges> portRangess;

	private String protocol;

	private String name;

	private String clientAffinity;

	private String acceleratorId;
	public CreateListenerRequest() {
		super("Ga", "2019-11-20", "CreateListener", "gaplus");
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

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public List<PortRanges> getPortRangess() {
		return this.portRangess;
	}

	public void setPortRangess(List<PortRanges> portRangess) {
		this.portRangess = portRangess;	
		if (portRangess != null) {
			for (int depth1 = 0; depth1 < portRangess.size(); depth1++) {
				putQueryParameter("PortRanges." + (depth1 + 1) + ".FromPort" , portRangess.get(depth1).getFromPort());
				putQueryParameter("PortRanges." + (depth1 + 1) + ".ToPort" , portRangess.get(depth1).getToPort());
			}
		}	
	}

	public String getBizProtocol() {
		return this.protocol;
	}

	public void setBizProtocol(String protocol) {
		this.protocol = protocol;
		if(protocol != null){
			putQueryParameter("Protocol", protocol);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getClientAffinity() {
		return this.clientAffinity;
	}

	public void setClientAffinity(String clientAffinity) {
		this.clientAffinity = clientAffinity;
		if(clientAffinity != null){
			putQueryParameter("ClientAffinity", clientAffinity);
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

	@Override
	public Class<CreateListenerResponse> getResponseClass() {
		return CreateListenerResponse.class;
	}

}
