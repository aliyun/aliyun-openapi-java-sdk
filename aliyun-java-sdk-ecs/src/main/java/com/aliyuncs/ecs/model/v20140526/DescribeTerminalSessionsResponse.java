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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeTerminalSessionsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeTerminalSessionsResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private List<Session> sessions;

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

	public List<Session> getSessions() {
		return this.sessions;
	}

	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

	public static class Session {

		private String identityType;

		private String principalId;

		private String username;

		private String creationTime;

		private String targetServer;

		private Integer portNumber;

		private String clientIP;

		private String sessionId;

		private List<Connection> connections;

		public String getIdentityType() {
			return this.identityType;
		}

		public void setIdentityType(String identityType) {
			this.identityType = identityType;
		}

		public String getPrincipalId() {
			return this.principalId;
		}

		public void setPrincipalId(String principalId) {
			this.principalId = principalId;
		}

		public String getUsername() {
			return this.username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getTargetServer() {
			return this.targetServer;
		}

		public void setTargetServer(String targetServer) {
			this.targetServer = targetServer;
		}

		public Integer getPortNumber() {
			return this.portNumber;
		}

		public void setPortNumber(Integer portNumber) {
			this.portNumber = portNumber;
		}

		public String getClientIP() {
			return this.clientIP;
		}

		public void setClientIP(String clientIP) {
			this.clientIP = clientIP;
		}

		public String getSessionId() {
			return this.sessionId;
		}

		public void setSessionId(String sessionId) {
			this.sessionId = sessionId;
		}

		public List<Connection> getConnections() {
			return this.connections;
		}

		public void setConnections(List<Connection> connections) {
			this.connections = connections;
		}

		public static class Connection {

			private String status;

			private String failedDetail;

			private String endTime;

			private String instanceId;

			private String startTime;

			private String closedReason;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getFailedDetail() {
				return this.failedDetail;
			}

			public void setFailedDetail(String failedDetail) {
				this.failedDetail = failedDetail;
			}

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getClosedReason() {
				return this.closedReason;
			}

			public void setClosedReason(String closedReason) {
				this.closedReason = closedReason;
			}
		}
	}

	@Override
	public DescribeTerminalSessionsResponse getInstance(UnmarshallerContext context) {
		return	DescribeTerminalSessionsResponseUnmarshaller.unmarshall(this, context);
	}
}
