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

package com.aliyuncs.polardb.model.v20170801;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.polardb.transform.v20170801.DescribeDBClusterProxyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDBClusterProxyResponse extends AcsResponse {

	private String dBProxyClusterId;

	private Long dBProxyClusterNum;

	private String dBProxyClusterStatus;

	private String requestId;

	private List<ChildInstance> childInstances;

	public String getDBProxyClusterId() {
		return this.dBProxyClusterId;
	}

	public void setDBProxyClusterId(String dBProxyClusterId) {
		this.dBProxyClusterId = dBProxyClusterId;
	}

	public Long getDBProxyClusterNum() {
		return this.dBProxyClusterNum;
	}

	public void setDBProxyClusterNum(Long dBProxyClusterNum) {
		this.dBProxyClusterNum = dBProxyClusterNum;
	}

	public String getDBProxyClusterStatus() {
		return this.dBProxyClusterStatus;
	}

	public void setDBProxyClusterStatus(String dBProxyClusterStatus) {
		this.dBProxyClusterStatus = dBProxyClusterStatus;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<ChildInstance> getChildInstances() {
		return this.childInstances;
	}

	public void setChildInstances(List<ChildInstance> childInstances) {
		this.childInstances = childInstances;
	}

	public static class ChildInstance {

		private String dBNodeClass;

		private String dBNodeIP;

		private String dBNodeId;

		private String dBNodePort;

		private String dBNodeStatus;

		private String hostName;

		public String getDBNodeClass() {
			return this.dBNodeClass;
		}

		public void setDBNodeClass(String dBNodeClass) {
			this.dBNodeClass = dBNodeClass;
		}

		public String getDBNodeIP() {
			return this.dBNodeIP;
		}

		public void setDBNodeIP(String dBNodeIP) {
			this.dBNodeIP = dBNodeIP;
		}

		public String getDBNodeId() {
			return this.dBNodeId;
		}

		public void setDBNodeId(String dBNodeId) {
			this.dBNodeId = dBNodeId;
		}

		public String getDBNodePort() {
			return this.dBNodePort;
		}

		public void setDBNodePort(String dBNodePort) {
			this.dBNodePort = dBNodePort;
		}

		public String getDBNodeStatus() {
			return this.dBNodeStatus;
		}

		public void setDBNodeStatus(String dBNodeStatus) {
			this.dBNodeStatus = dBNodeStatus;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}
	}

	@Override
	public DescribeDBClusterProxyResponse getInstance(UnmarshallerContext context) {
		return	DescribeDBClusterProxyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
