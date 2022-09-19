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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListServerGroupsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServerGroupsResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private Integer totalCount;

	private List<Server> serverGroupList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<Server> getServerGroupList() {
		return this.serverGroupList;
	}

	public void setServerGroupList(List<Server> serverGroupList) {
		this.serverGroupList = serverGroupList;
	}

	public static class Server {

		private String id;

		private String groupName;

		private List<SlaveServer> slaveServerList;

		private MasterServer masterServer;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getGroupName() {
			return this.groupName;
		}

		public void setGroupName(String groupName) {
			this.groupName = groupName;
		}

		public List<SlaveServer> getSlaveServerList() {
			return this.slaveServerList;
		}

		public void setSlaveServerList(List<SlaveServer> slaveServerList) {
			this.slaveServerList = slaveServerList;
		}

		public MasterServer getMasterServer() {
			return this.masterServer;
		}

		public void setMasterServer(MasterServer masterServer) {
			this.masterServer = masterServer;
		}

		public static class SlaveServer {

			private String id;

			private String serverName;

			private String ip;

			private Integer sshPort;

			private String user;

			private String password;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getServerName() {
				return this.serverName;
			}

			public void setServerName(String serverName) {
				this.serverName = serverName;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public Integer getSshPort() {
				return this.sshPort;
			}

			public void setSshPort(Integer sshPort) {
				this.sshPort = sshPort;
			}

			public String getUser() {
				return this.user;
			}

			public void setUser(String user) {
				this.user = user;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}
		}

		public static class MasterServer {

			private String id;

			private String serverName;

			private String ip;

			private Integer sshPort;

			private String user;

			private String password;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getServerName() {
				return this.serverName;
			}

			public void setServerName(String serverName) {
				this.serverName = serverName;
			}

			public String getIp() {
				return this.ip;
			}

			public void setIp(String ip) {
				this.ip = ip;
			}

			public Integer getSshPort() {
				return this.sshPort;
			}

			public void setSshPort(Integer sshPort) {
				this.sshPort = sshPort;
			}

			public String getUser() {
				return this.user;
			}

			public void setUser(String user) {
				this.user = user;
			}

			public String getPassword() {
				return this.password;
			}

			public void setPassword(String password) {
				this.password = password;
			}
		}
	}

	@Override
	public ListServerGroupsResponse getInstance(UnmarshallerContext context) {
		return	ListServerGroupsResponseUnmarshaller.unmarshall(this, context);
	}
}
