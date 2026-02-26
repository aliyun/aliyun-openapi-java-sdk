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
public class AddServersToServerGroupRequest extends RpcAcsRequest<AddServersToServerGroupResponse> {
	   

	private String clientToken;

	private String serverGroupId;

	private List<Servers> servers;

	private Boolean dryRun;
	public AddServersToServerGroupRequest() {
		super("Nlb", "2022-04-30", "AddServersToServerGroup", "nlb");
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

	public String getServerGroupId() {
		return this.serverGroupId;
	}

	public void setServerGroupId(String serverGroupId) {
		this.serverGroupId = serverGroupId;
		if(serverGroupId != null){
			putBodyParameter("ServerGroupId", serverGroupId);
		}
	}

	public List<Servers> getServers() {
		return this.servers;
	}

	public void setServers(List<Servers> servers) {
		this.servers = servers;	
		if (servers != null) {
			for (int depth1 = 0; depth1 < servers.size(); depth1++) {
				if (servers.get(depth1) != null) {
					
						putBodyParameter("Servers." + (depth1 + 1) + ".ServerId" , servers.get(depth1).getServerId());
						putBodyParameter("Servers." + (depth1 + 1) + ".ServerType" , servers.get(depth1).getServerType());
						putBodyParameter("Servers." + (depth1 + 1) + ".ServerIp" , servers.get(depth1).getServerIp());
						putBodyParameter("Servers." + (depth1 + 1) + ".Port" , servers.get(depth1).getPort());
						putBodyParameter("Servers." + (depth1 + 1) + ".Weight" , servers.get(depth1).getWeight());
						putBodyParameter("Servers." + (depth1 + 1) + ".Description" , servers.get(depth1).getDescription());
				}
			}
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

	public static class Servers {

		private String serverId;

		private String serverType;

		private String serverIp;

		private Integer port;

		private Integer weight;

		private String description;

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public String getServerType() {
			return this.serverType;
		}

		public void setServerType(String serverType) {
			this.serverType = serverType;
		}

		public String getServerIp() {
			return this.serverIp;
		}

		public void setServerIp(String serverIp) {
			this.serverIp = serverIp;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}
	}

	@Override
	public Class<AddServersToServerGroupResponse> getResponseClass() {
		return AddServersToServerGroupResponse.class;
	}

}
