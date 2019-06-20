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

package com.aliyuncs.slb.model.v20140515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.slb.transform.v20140515.DescribeHealthStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHealthStatusResponse extends AcsResponse {

	private String requestId;

	private List<BackendServer> backendServers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<BackendServer> getBackendServers() {
		return this.backendServers;
	}

	public void setBackendServers(List<BackendServer> backendServers) {
		this.backendServers = backendServers;
	}

	public static class BackendServer {

		private Integer listenerPort;

		private String serverId;

		private Integer port;

		private String serverHealthStatus;

		private String serverIp;

		private String eniHost;

		private String protocol;

		private String type;

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public Integer getPort() {
			return this.port;
		}

		public void setPort(Integer port) {
			this.port = port;
		}

		public String getServerHealthStatus() {
			return this.serverHealthStatus;
		}

		public void setServerHealthStatus(String serverHealthStatus) {
			this.serverHealthStatus = serverHealthStatus;
		}

		public String getServerIp() {
			return this.serverIp;
		}

		public void setServerIp(String serverIp) {
			this.serverIp = serverIp;
		}

		public String getEniHost() {
			return this.eniHost;
		}

		public void setEniHost(String eniHost) {
			this.eniHost = eniHost;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		/**
		 * @deprecated use getBizProtocol instead of this.
		 */
		@Deprecated
		public String getProtocol() {
			return this.protocol;
		}

		/**
		 * @deprecated use setBizProtocol instead of this.
		 */
		@Deprecated
		public void setProtocol(String protocol) {
			this.protocol = protocol;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}
	}

	@Override
	public DescribeHealthStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeHealthStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
