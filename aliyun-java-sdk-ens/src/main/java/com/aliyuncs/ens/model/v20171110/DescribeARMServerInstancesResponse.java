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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ens.transform.v20171110.DescribeARMServerInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeARMServerInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer totalCount;

	private List<ServersItem> servers;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<ServersItem> getServers() {
		return this.servers;
	}

	public void setServers(List<ServersItem> servers) {
		this.servers = servers;
	}

	public static class ServersItem {

		private String creationTime;

		private String expiredTime;

		private String ensRegionId;

		private String serverId;

		private String specName;

		private String state;

		private String status;

		private String namespace;

		private String name;

		private String payType;

		private String latestAction;

		private List<AICInstancesItem> aICInstances;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getServerId() {
			return this.serverId;
		}

		public void setServerId(String serverId) {
			this.serverId = serverId;
		}

		public String getSpecName() {
			return this.specName;
		}

		public void setSpecName(String specName) {
			this.specName = specName;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getPayType() {
			return this.payType;
		}

		public void setPayType(String payType) {
			this.payType = payType;
		}

		public String getLatestAction() {
			return this.latestAction;
		}

		public void setLatestAction(String latestAction) {
			this.latestAction = latestAction;
		}

		public List<AICInstancesItem> getAICInstances() {
			return this.aICInstances;
		}

		public void setAICInstances(List<AICInstancesItem> aICInstances) {
			this.aICInstances = aICInstances;
		}

		public static class AICInstancesItem {

			private Long frequency;

			private String imageId;

			private String instanceId;

			private String resolution;

			private String spec;

			private String state;

			private String status;

			private String name;

			private String latestAction;

			private NetworkAttributes networkAttributes;

			private SdgDeployInfo sdgDeployInfo;

			public Long getFrequency() {
				return this.frequency;
			}

			public void setFrequency(Long frequency) {
				this.frequency = frequency;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
			}

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getResolution() {
				return this.resolution;
			}

			public void setResolution(String resolution) {
				this.resolution = resolution;
			}

			public String getSpec() {
				return this.spec;
			}

			public void setSpec(String spec) {
				this.spec = spec;
			}

			public String getState() {
				return this.state;
			}

			public void setState(String state) {
				this.state = state;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getLatestAction() {
				return this.latestAction;
			}

			public void setLatestAction(String latestAction) {
				this.latestAction = latestAction;
			}

			public NetworkAttributes getNetworkAttributes() {
				return this.networkAttributes;
			}

			public void setNetworkAttributes(NetworkAttributes networkAttributes) {
				this.networkAttributes = networkAttributes;
			}

			public SdgDeployInfo getSdgDeployInfo() {
				return this.sdgDeployInfo;
			}

			public void setSdgDeployInfo(SdgDeployInfo sdgDeployInfo) {
				this.sdgDeployInfo = sdgDeployInfo;
			}

			public static class NetworkAttributes {

				private String ipAddress;

				private String networkId;

				private String vSwitchId;

				public String getIpAddress() {
					return this.ipAddress;
				}

				public void setIpAddress(String ipAddress) {
					this.ipAddress = ipAddress;
				}

				public String getNetworkId() {
					return this.networkId;
				}

				public void setNetworkId(String networkId) {
					this.networkId = networkId;
				}

				public String getVSwitchId() {
					return this.vSwitchId;
				}

				public void setVSwitchId(String vSwitchId) {
					this.vSwitchId = vSwitchId;
				}
			}

			public static class SdgDeployInfo {

				private String sDGId;

				private String status;

				public String getSDGId() {
					return this.sDGId;
				}

				public void setSDGId(String sDGId) {
					this.sDGId = sDGId;
				}

				public String getStatus() {
					return this.status;
				}

				public void setStatus(String status) {
					this.status = status;
				}
			}
		}
	}

	@Override
	public DescribeARMServerInstancesResponse getInstance(UnmarshallerContext context) {
		return	DescribeARMServerInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
