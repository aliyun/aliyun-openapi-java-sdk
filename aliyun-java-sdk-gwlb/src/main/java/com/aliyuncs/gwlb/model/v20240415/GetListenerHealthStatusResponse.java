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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gwlb.transform.v20240415.GetListenerHealthStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetListenerHealthStatusResponse extends AcsResponse {

	private Integer maxResults;

	private String nextToken;

	private String requestId;

	private Integer totalCount;

	private List<ListenerHealthStatusItem> listenerHealthStatus;

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ListenerHealthStatusItem> getListenerHealthStatus() {
		return this.listenerHealthStatus;
	}

	public void setListenerHealthStatus(List<ListenerHealthStatusItem> listenerHealthStatus) {
		this.listenerHealthStatus = listenerHealthStatus;
	}

	public static class ListenerHealthStatusItem {

		private String listenerId;

		private List<ServerGroupInfo> serverGroupInfos;

		public String getListenerId() {
			return this.listenerId;
		}

		public void setListenerId(String listenerId) {
			this.listenerId = listenerId;
		}

		public List<ServerGroupInfo> getServerGroupInfos() {
			return this.serverGroupInfos;
		}

		public void setServerGroupInfos(List<ServerGroupInfo> serverGroupInfos) {
			this.serverGroupInfos = serverGroupInfos;
		}

		public static class ServerGroupInfo {

			private Boolean healthCheckEnabled;

			private String serverGroupId;

			private List<Server> servers;

			public Boolean getHealthCheckEnabled() {
				return this.healthCheckEnabled;
			}

			public void setHealthCheckEnabled(Boolean healthCheckEnabled) {
				this.healthCheckEnabled = healthCheckEnabled;
			}

			public String getServerGroupId() {
				return this.serverGroupId;
			}

			public void setServerGroupId(String serverGroupId) {
				this.serverGroupId = serverGroupId;
			}

			public List<Server> getServers() {
				return this.servers;
			}

			public void setServers(List<Server> servers) {
				this.servers = servers;
			}

			public static class Server {

				private Integer port;

				private String serverId;

				private String serverIp;

				private String status;

				private Reason reason;

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

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

				public Reason getReason() {
					return this.reason;
				}

				public void setReason(Reason reason) {
					this.reason = reason;
				}

				public static class Reason {

					private String reasonCode;

					public String getReasonCode() {
						return this.reasonCode;
					}

					public void setReasonCode(String reasonCode) {
						this.reasonCode = reasonCode;
					}
				}
			}
		}
	}

	@Override
	public GetListenerHealthStatusResponse getInstance(UnmarshallerContext context) {
		return	GetListenerHealthStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
