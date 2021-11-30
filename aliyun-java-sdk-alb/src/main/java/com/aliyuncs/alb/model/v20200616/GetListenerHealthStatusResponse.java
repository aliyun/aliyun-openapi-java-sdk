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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alb.transform.v20200616.GetListenerHealthStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetListenerHealthStatusResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<ListenerHealthStatusModel> listenerHealthStatus;

	private List<RuleHealthStatusModel> ruleHealthStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public List<ListenerHealthStatusModel> getListenerHealthStatus() {
		return this.listenerHealthStatus;
	}

	public void setListenerHealthStatus(List<ListenerHealthStatusModel> listenerHealthStatus) {
		this.listenerHealthStatus = listenerHealthStatus;
	}

	public List<RuleHealthStatusModel> getRuleHealthStatus() {
		return this.ruleHealthStatus;
	}

	public void setRuleHealthStatus(List<RuleHealthStatusModel> ruleHealthStatus) {
		this.ruleHealthStatus = ruleHealthStatus;
	}

	public static class ListenerHealthStatusModel {

		private String listenerId;

		private Integer listenerPort;

		private String listenerProtocol;

		private List<ServerGroupHealthStatusModel> serverGroupInfos;

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

		public List<ServerGroupHealthStatusModel> getServerGroupInfos() {
			return this.serverGroupInfos;
		}

		public void setServerGroupInfos(List<ServerGroupHealthStatusModel> serverGroupInfos) {
			this.serverGroupInfos = serverGroupInfos;
		}

		public static class ServerGroupHealthStatusModel {

			private String healthCheckEnabled;

			private String serverGroupId;

			private String actionType;

			private List<BackendServerHealthStatusModel> nonNormalServers;

			public String getHealthCheckEnabled() {
				return this.healthCheckEnabled;
			}

			public void setHealthCheckEnabled(String healthCheckEnabled) {
				this.healthCheckEnabled = healthCheckEnabled;
			}

			public String getServerGroupId() {
				return this.serverGroupId;
			}

			public void setServerGroupId(String serverGroupId) {
				this.serverGroupId = serverGroupId;
			}

			public String getActionType() {
				return this.actionType;
			}

			public void setActionType(String actionType) {
				this.actionType = actionType;
			}

			public List<BackendServerHealthStatusModel> getNonNormalServers() {
				return this.nonNormalServers;
			}

			public void setNonNormalServers(List<BackendServerHealthStatusModel> nonNormalServers) {
				this.nonNormalServers = nonNormalServers;
			}

			public static class BackendServerHealthStatusModel {

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

					private String actualResponse;

					private String expectedResponse;

					private String reasonCode;

					public String getActualResponse() {
						return this.actualResponse;
					}

					public void setActualResponse(String actualResponse) {
						this.actualResponse = actualResponse;
					}

					public String getExpectedResponse() {
						return this.expectedResponse;
					}

					public void setExpectedResponse(String expectedResponse) {
						this.expectedResponse = expectedResponse;
					}

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

	public static class RuleHealthStatusModel {

		private String ruleId;

		private List<ServerGroupHealthStatusModel2> serverGroupInfos1;

		public String getRuleId() {
			return this.ruleId;
		}

		public void setRuleId(String ruleId) {
			this.ruleId = ruleId;
		}

		public List<ServerGroupHealthStatusModel2> getServerGroupInfos1() {
			return this.serverGroupInfos1;
		}

		public void setServerGroupInfos1(List<ServerGroupHealthStatusModel2> serverGroupInfos1) {
			this.serverGroupInfos1 = serverGroupInfos1;
		}

		public static class ServerGroupHealthStatusModel2 {

			private String healthCheckEnabled;

			private String serverGroupId;

			private String actionType;

			private List<NonNormalServer> nonNormalServers3;

			public String getHealthCheckEnabled() {
				return this.healthCheckEnabled;
			}

			public void setHealthCheckEnabled(String healthCheckEnabled) {
				this.healthCheckEnabled = healthCheckEnabled;
			}

			public String getServerGroupId() {
				return this.serverGroupId;
			}

			public void setServerGroupId(String serverGroupId) {
				this.serverGroupId = serverGroupId;
			}

			public String getActionType() {
				return this.actionType;
			}

			public void setActionType(String actionType) {
				this.actionType = actionType;
			}

			public List<NonNormalServer> getNonNormalServers3() {
				return this.nonNormalServers3;
			}

			public void setNonNormalServers3(List<NonNormalServer> nonNormalServers3) {
				this.nonNormalServers3 = nonNormalServers3;
			}

			public static class NonNormalServer {

				private Integer port;

				private String serverId;

				private String serverIp;

				private String status;

				private Reason4 reason4;

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

				public Reason4 getReason4() {
					return this.reason4;
				}

				public void setReason4(Reason4 reason4) {
					this.reason4 = reason4;
				}

				public static class Reason4 {

					private String actualResponse;

					private String expectedResponse;

					private String reasonCode;

					public String getActualResponse() {
						return this.actualResponse;
					}

					public void setActualResponse(String actualResponse) {
						this.actualResponse = actualResponse;
					}

					public String getExpectedResponse() {
						return this.expectedResponse;
					}

					public void setExpectedResponse(String expectedResponse) {
						this.expectedResponse = expectedResponse;
					}

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
