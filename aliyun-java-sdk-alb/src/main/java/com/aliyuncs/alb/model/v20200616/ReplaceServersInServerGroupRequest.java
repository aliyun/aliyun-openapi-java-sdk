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
public class ReplaceServersInServerGroupRequest extends RpcAcsRequest<ReplaceServersInServerGroupResponse> {
	   

	private String clientToken;

	private String serverGroupId;

	private List<AddedServers> addedServers;

	private Boolean dryRun;

	private List<RemovedServers> removedServers;
	public ReplaceServersInServerGroupRequest() {
		super("Alb", "2020-06-16", "ReplaceServersInServerGroup", "alb");
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

	public String getServerGroupId() {
		return this.serverGroupId;
	}

	public void setServerGroupId(String serverGroupId) {
		this.serverGroupId = serverGroupId;
		if(serverGroupId != null){
			putQueryParameter("ServerGroupId", serverGroupId);
		}
	}

	public List<AddedServers> getAddedServers() {
		return this.addedServers;
	}

	public void setAddedServers(List<AddedServers> addedServers) {
		this.addedServers = addedServers;	
		if (addedServers != null) {
			for (int depth1 = 0; depth1 < addedServers.size(); depth1++) {
				if (addedServers.get(depth1) != null) {
					
						putQueryParameter("AddedServers." + (depth1 + 1) + ".ServerType" , addedServers.get(depth1).getServerType());
						putQueryParameter("AddedServers." + (depth1 + 1) + ".Port" , addedServers.get(depth1).getPort());
						putQueryParameter("AddedServers." + (depth1 + 1) + ".Description" , addedServers.get(depth1).getDescription());
						putQueryParameter("AddedServers." + (depth1 + 1) + ".ServerIp" , addedServers.get(depth1).getServerIp());
						putQueryParameter("AddedServers." + (depth1 + 1) + ".Weight" , addedServers.get(depth1).getWeight());
						putQueryParameter("AddedServers." + (depth1 + 1) + ".ServerId" , addedServers.get(depth1).getServerId());
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
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public List<RemovedServers> getRemovedServers() {
		return this.removedServers;
	}

	public void setRemovedServers(List<RemovedServers> removedServers) {
		this.removedServers = removedServers;	
		if (removedServers != null) {
			for (int depth1 = 0; depth1 < removedServers.size(); depth1++) {
				if (removedServers.get(depth1) != null) {
					
						putQueryParameter("RemovedServers." + (depth1 + 1) + ".ServerType" , removedServers.get(depth1).getServerType());
						putQueryParameter("RemovedServers." + (depth1 + 1) + ".Port" , removedServers.get(depth1).getPort());
						putQueryParameter("RemovedServers." + (depth1 + 1) + ".ServerIp" , removedServers.get(depth1).getServerIp());
						putQueryParameter("RemovedServers." + (depth1 + 1) + ".ServerId" , removedServers.get(depth1).getServerId());
				}
			}
		}	
	}

	public static class AddedServers {

		private String serverType;

		private Integer port;

		private String description;

		private String serverIp;

		private Integer weight;

		private String serverId;

		public String getServerType() {
			return this.serverType;
		}

		public void setServerType(String serverType) {
			this.serverType = serverType;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getServerIp() {
			return this.serverIp;
		}

		public void setServerIp(String serverIp) {
			this.serverIp = serverIp;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}
	}

	public static class RemovedServers {

		private String serverType;

		private Integer port;

		private String serverIp;

		private String serverId;

		public String getServerType() {
			return this.serverType;
		}

		public void setServerType(String serverType) {
			this.serverType = serverType;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getServerIp() {
			return this.serverIp;
		}

		public void setServerIp(String serverIp) {
			this.serverIp = serverIp;
		}

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}
	}

	@Override
	public Class<ReplaceServersInServerGroupResponse> getResponseClass() {
		return ReplaceServersInServerGroupResponse.class;
	}

}
