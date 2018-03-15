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
import com.aliyuncs.slb.transform.v20140515.DescribeLoadBalancersRelatedEcsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeLoadBalancersRelatedEcsResponse extends AcsResponse {

	private String message;

	private Boolean success;

	private String requestId;

	private List<LoadBalancer> loadBalancers;

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<LoadBalancer> getLoadBalancers() {
		return this.loadBalancers;
	}

	public void setLoadBalancers(List<LoadBalancer> loadBalancers) {
		this.loadBalancers = loadBalancers;
	}

	public static class LoadBalancer {

		private String loadBalancerId;

		private Integer count;

		private List<MasterSlaveVServerGroup> masterSlaveVServerGroups;

		private List<VServerGroup> vServerGroups;

		private List<BackendServer4> backendServers;

		public String getLoadBalancerId() {
			return this.loadBalancerId;
		}

		public void setLoadBalancerId(String loadBalancerId) {
			this.loadBalancerId = loadBalancerId;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public List<MasterSlaveVServerGroup> getMasterSlaveVServerGroups() {
			return this.masterSlaveVServerGroups;
		}

		public void setMasterSlaveVServerGroups(List<MasterSlaveVServerGroup> masterSlaveVServerGroups) {
			this.masterSlaveVServerGroups = masterSlaveVServerGroups;
		}

		public List<VServerGroup> getVServerGroups() {
			return this.vServerGroups;
		}

		public void setVServerGroups(List<VServerGroup> vServerGroups) {
			this.vServerGroups = vServerGroups;
		}

		public List<BackendServer4> getBackendServers() {
			return this.backendServers;
		}

		public void setBackendServers(List<BackendServer4> backendServers) {
			this.backendServers = backendServers;
		}

		public static class MasterSlaveVServerGroup {

			private String groupId;

			private String groupName;

			private List<BackendServer> backendServers1;

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public List<BackendServer> getBackendServers1() {
				return this.backendServers1;
			}

			public void setBackendServers1(List<BackendServer> backendServers1) {
				this.backendServers1 = backendServers1;
			}

			public static class BackendServer {

				private String vmName;

				private Integer weight;

				private Integer port;

				private String networkType;

				public String getVmName() {
					return this.vmName;
				}

				public void setVmName(String vmName) {
					this.vmName = vmName;
				}

				public Integer getWeight() {
					return this.weight;
				}

				public void setWeight(Integer weight) {
					this.weight = weight;
				}

				public Integer getPort() {
					return this.port;
				}

				public void setPort(Integer port) {
					this.port = port;
				}

				public String getNetworkType() {
					return this.networkType;
				}

				public void setNetworkType(String networkType) {
					this.networkType = networkType;
				}
			}
		}

		public static class VServerGroup {

			private String groupId;

			private String groupName;

			private List<BackendServer3> backendServers2;

			public String getGroupId() {
				return this.groupId;
			}

			public void setGroupId(String groupId) {
				this.groupId = groupId;
			}

			public String getGroupName() {
				return this.groupName;
			}

			public void setGroupName(String groupName) {
				this.groupName = groupName;
			}

			public List<BackendServer3> getBackendServers2() {
				return this.backendServers2;
			}

			public void setBackendServers2(List<BackendServer3> backendServers2) {
				this.backendServers2 = backendServers2;
			}

			public static class BackendServer3 {

				private String vmName;

				private Integer weight;

				private Integer port;

				private String networkType;

				public String getVmName() {
					return this.vmName;
				}

				public void setVmName(String vmName) {
					this.vmName = vmName;
				}

				public Integer getWeight() {
					return this.weight;
				}

				public void setWeight(Integer weight) {
					this.weight = weight;
				}

				public Integer getPort() {
					return this.port;
				}

				public void setPort(Integer port) {
					this.port = port;
				}

				public String getNetworkType() {
					return this.networkType;
				}

				public void setNetworkType(String networkType) {
					this.networkType = networkType;
				}
			}
		}

		public static class BackendServer4 {

			private String vmName;

			private Integer weight;

			private Integer port;

			private String networkType;

			public String getVmName() {
				return this.vmName;
			}

			public void setVmName(String vmName) {
				this.vmName = vmName;
			}

			public Integer getWeight() {
				return this.weight;
			}

			public void setWeight(Integer weight) {
				this.weight = weight;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getNetworkType() {
				return this.networkType;
			}

			public void setNetworkType(String networkType) {
				this.networkType = networkType;
			}
		}
	}

	@Override
	public DescribeLoadBalancersRelatedEcsResponse getInstance(UnmarshallerContext context) {
		return	DescribeLoadBalancersRelatedEcsResponseUnmarshaller.unmarshall(this, context);
	}
}
