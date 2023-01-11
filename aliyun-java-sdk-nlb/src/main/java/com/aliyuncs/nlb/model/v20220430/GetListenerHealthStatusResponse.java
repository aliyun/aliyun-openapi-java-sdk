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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nlb.transform.v20220430.GetListenerHealthStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetListenerHealthStatusResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private String dynamicCode;

	private String dynamicMessage;

	private Integer totalCount;

	private String nextToken;

	private Integer maxResults;

	private List<ListenerHealthStatusItem> listenerHealthStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getDynamicCode() {
		return this.dynamicCode;
	}

	public void setDynamicCode(String dynamicCode) {
		this.dynamicCode = dynamicCode;
	}

	public String getDynamicMessage() {
		return this.dynamicMessage;
	}

	public void setDynamicMessage(String dynamicMessage) {
		this.dynamicMessage = dynamicMessage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public List<ListenerHealthStatusItem> getListenerHealthStatus() {
		return this.listenerHealthStatus;
	}

	public void setListenerHealthStatus(List<ListenerHealthStatusItem> listenerHealthStatus) {
		this.listenerHealthStatus = listenerHealthStatus;
	}

	public static class ListenerHealthStatusItem {

		private String listenerId;

		private Integer listenerPort;

		private String listenerProtocol;

		private List<ServerGroupInfo> serverGroupInfos;

		public String getListenerId() {
			return this.listenerId;
		}

		public void setListenerId(String listenerId) {
			this.listenerId = listenerId;
		}

		public Integer getListenerPort() {
			return this.listenerPort;
		}

		public void setListenerPort(Integer listenerPort) {
			this.listenerPort = listenerPort;
		}

		public String getListenerProtocol() {
			return this.listenerProtocol;
		}

		public void setListenerProtocol(String listenerProtocol) {
			this.listenerProtocol = listenerProtocol;
		}

		public List<ServerGroupInfo> getServerGroupInfos() {
			return this.serverGroupInfos;
		}

		public void setServerGroupInfos(List<ServerGroupInfo> serverGroupInfos) {
			this.serverGroupInfos = serverGroupInfos;
		}

		public static class ServerGroupInfo {

			private Boolean heathCheckEnabled;

			private String serverGroupId;

			private List<AbnormalServer> nonNormalServers;

			public Boolean getHeathCheckEnabled() {
				return this.heathCheckEnabled;
			}

			public void setHeathCheckEnabled(Boolean heathCheckEnabled) {
				this.heathCheckEnabled = heathCheckEnabled;
			}

			public String getServerGroupId() {
				return this.serverGroupId;
			}

			public void setServerGroupId(String serverGroupId) {
				this.serverGroupId = serverGroupId;
			}

			public List<AbnormalServer> getNonNormalServers() {
				return this.nonNormalServers;
			}

			public void setNonNormalServers(List<AbnormalServer> nonNormalServers) {
				this.nonNormalServers = nonNormalServers;
			}

			public static class AbnormalServer {

				private String status;

				private Integer port;

				private String serverId;

				private String serverIp;

				private Reason reason;

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}

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
