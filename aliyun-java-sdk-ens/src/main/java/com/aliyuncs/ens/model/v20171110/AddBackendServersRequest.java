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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddBackendServersRequest extends RpcAcsRequest<AddBackendServersResponse> {
	   

	@SerializedName("backendServers")
	private List<BackendServers> backendServers;

	private String loadBalancerId;
	public AddBackendServersRequest() {
		super("Ens", "2017-11-10", "AddBackendServers", "ens");
		setMethod(MethodType.POST);
	}

	public List<BackendServers> getBackendServers() {
		return this.backendServers;
	}

	public void setBackendServers(List<BackendServers> backendServers) {
		this.backendServers = backendServers;	
		if (backendServers != null) {
			putQueryParameter("BackendServers" , new Gson().toJson(backendServers));
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

	public static class BackendServers {

		@SerializedName("Port")
		private Integer port;

		@SerializedName("Ip")
		private String ip;

		@SerializedName("Weight")
		private Integer weight;

		@SerializedName("Type")
		private String type;

		@SerializedName("ServerId")
		private String serverId;

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public Integer getWeight() {
			return this.weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}
	}

	@Override
	public Class<AddBackendServersResponse> getResponseClass() {
		return AddBackendServersResponse.class;
	}

}
