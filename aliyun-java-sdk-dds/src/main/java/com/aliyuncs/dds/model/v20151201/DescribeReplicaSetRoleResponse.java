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

package com.aliyuncs.dds.model.v20151201;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dds.transform.v20151201.DescribeReplicaSetRoleResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReplicaSetRoleResponse extends AcsResponse {

	private String requestId;

	private String dBInstanceId;

	private List<ReplicaSet> replicaSets;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
	}

	public List<ReplicaSet> getReplicaSets() {
		return this.replicaSets;
	}

	public void setReplicaSets(List<ReplicaSet> replicaSets) {
		this.replicaSets = replicaSets;
	}

	public static class ReplicaSet {

		private String replicaSetRole;

		private String roleId;

		private String connectionDomain;

		private String connectionPort;

		private String expiredTime;

		private String networkType;

		public String getReplicaSetRole() {
			return this.replicaSetRole;
		}

		public void setReplicaSetRole(String replicaSetRole) {
			this.replicaSetRole = replicaSetRole;
		}

		public String getRoleId() {
			return this.roleId;
		}

		public void setRoleId(String roleId) {
			this.roleId = roleId;
		}

		public String getConnectionDomain() {
			return this.connectionDomain;
		}

		public void setConnectionDomain(String connectionDomain) {
			this.connectionDomain = connectionDomain;
		}

		public String getConnectionPort() {
			return this.connectionPort;
		}

		public void setConnectionPort(String connectionPort) {
			this.connectionPort = connectionPort;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getNetworkType() {
			return this.networkType;
		}

		public void setNetworkType(String networkType) {
			this.networkType = networkType;
		}
	}

	@Override
	public DescribeReplicaSetRoleResponse getInstance(UnmarshallerContext context) {
		return	DescribeReplicaSetRoleResponseUnmarshaller.unmarshall(this, context);
	}
}
