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

package com.aliyuncs.gwlb.model.v20240415;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class RemoveServersFromServerGroupRequest extends RpcAcsRequest<RemoveServersFromServerGroupResponse> {
	   

	private String clientToken;

	private String serverGroupId;

	private List<Servers> servers;

	private Boolean dryRun;
	public RemoveServersFromServerGroupRequest() {
		super("Gwlb", "2024-04-15", "RemoveServersFromServerGroup");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
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
					
						putBodyParameter("Servers." + (depth1 + 1) + ".Port" , servers.get(depth1).getPort());
						putBodyParameter("Servers." + (depth1 + 1) + ".ServerId" , servers.get(depth1).getServerId());
						putBodyParameter("Servers." + (depth1 + 1) + ".ServerIp" , servers.get(depth1).getServerIp());
						putBodyParameter("Servers." + (depth1 + 1) + ".ServerType" , servers.get(depth1).getServerType());
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

		private Integer port;

		private String serverId;

		private String serverIp;

		private String serverType;

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public String getServerIp() {
			return this.serverIp;
		}

		public void setServerIp(String serverIp) {
			this.serverIp = serverIp;
		}

		public String getServerType() {
			return this.serverType;
		}

		public void setServerType(String serverType) {
			this.serverType = serverType;
		}
	}

	@Override
	public Class<RemoveServersFromServerGroupResponse> getResponseClass() {
		return RemoveServersFromServerGroupResponse.class;
	}

}
