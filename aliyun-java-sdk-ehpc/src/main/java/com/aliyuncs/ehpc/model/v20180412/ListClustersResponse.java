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

package com.aliyuncs.ehpc.model.v20180412;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ehpc.transform.v20180412.ListClustersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListClustersResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ClusterInfoSimple> clusters;

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

	public List<ClusterInfoSimple> getClusters() {
		return this.clusters;
	}

	public void setClusters(List<ClusterInfoSimple> clusters) {
		this.clusters = clusters;
	}

	public static class ClusterInfoSimple {

		private String id;

		private String regionId;

		private String zoneId;

		private String vSwitchId;

		private String vpcId;

		private String name;

		private String description;

		private String status;

		private String osTag;

		private String accountType;

		private String schedulerType;

		private String deployMode;

		private Integer count;

		private String instanceType;

		private String loginNodes;

		private String createTime;

		private String imageOwnerAlias;

		private String imageId;

		private String location;

		private String ehpcVersion;

		private String nodePrefix;

		private String nodeSuffix;

		private String baseOsTag;

		private Managers managers;

		private Computes computes;

		private TotalResources totalResources;

		private UsedResources usedResources;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getZoneId() {
			return this.zoneId;
		}

		public void setZoneId(String zoneId) {
			this.zoneId = zoneId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getOsTag() {
			return this.osTag;
		}

		public void setOsTag(String osTag) {
			this.osTag = osTag;
		}

		public String getAccountType() {
			return this.accountType;
		}

		public void setAccountType(String accountType) {
			this.accountType = accountType;
		}

		public String getSchedulerType() {
			return this.schedulerType;
		}

		public void setSchedulerType(String schedulerType) {
			this.schedulerType = schedulerType;
		}

		public String getDeployMode() {
			return this.deployMode;
		}

		public void setDeployMode(String deployMode) {
			this.deployMode = deployMode;
		}

		public Integer getCount() {
			return this.count;
		}

		public void setCount(Integer count) {
			this.count = count;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getLoginNodes() {
			return this.loginNodes;
		}

		public void setLoginNodes(String loginNodes) {
			this.loginNodes = loginNodes;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getImageOwnerAlias() {
			return this.imageOwnerAlias;
		}

		public void setImageOwnerAlias(String imageOwnerAlias) {
			this.imageOwnerAlias = imageOwnerAlias;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getLocation() {
			return this.location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public String getEhpcVersion() {
			return this.ehpcVersion;
		}

		public void setEhpcVersion(String ehpcVersion) {
			this.ehpcVersion = ehpcVersion;
		}

		public String getNodePrefix() {
			return this.nodePrefix;
		}

		public void setNodePrefix(String nodePrefix) {
			this.nodePrefix = nodePrefix;
		}

		public String getNodeSuffix() {
			return this.nodeSuffix;
		}

		public void setNodeSuffix(String nodeSuffix) {
			this.nodeSuffix = nodeSuffix;
		}

		public String getBaseOsTag() {
			return this.baseOsTag;
		}

		public void setBaseOsTag(String baseOsTag) {
			this.baseOsTag = baseOsTag;
		}

		public Managers getManagers() {
			return this.managers;
		}

		public void setManagers(Managers managers) {
			this.managers = managers;
		}

		public Computes getComputes() {
			return this.computes;
		}

		public void setComputes(Computes computes) {
			this.computes = computes;
		}

		public TotalResources getTotalResources() {
			return this.totalResources;
		}

		public void setTotalResources(TotalResources totalResources) {
			this.totalResources = totalResources;
		}

		public UsedResources getUsedResources() {
			return this.usedResources;
		}

		public void setUsedResources(UsedResources usedResources) {
			this.usedResources = usedResources;
		}

		public static class Managers {

			private Integer total;

			private Integer normalCount;

			private Integer operatingCount;

			private Integer stoppedCount;

			private Integer exceptionCount;

			public Integer getTotal() {
				return this.total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}

			public Integer getNormalCount() {
				return this.normalCount;
			}

			public void setNormalCount(Integer normalCount) {
				this.normalCount = normalCount;
			}

			public Integer getOperatingCount() {
				return this.operatingCount;
			}

			public void setOperatingCount(Integer operatingCount) {
				this.operatingCount = operatingCount;
			}

			public Integer getStoppedCount() {
				return this.stoppedCount;
			}

			public void setStoppedCount(Integer stoppedCount) {
				this.stoppedCount = stoppedCount;
			}

			public Integer getExceptionCount() {
				return this.exceptionCount;
			}

			public void setExceptionCount(Integer exceptionCount) {
				this.exceptionCount = exceptionCount;
			}
		}

		public static class Computes {

			private Integer total;

			private Integer normalCount;

			private Integer operatingCount;

			private Integer stoppedCount;

			private Integer exceptionCount;

			public Integer getTotal() {
				return this.total;
			}

			public void setTotal(Integer total) {
				this.total = total;
			}

			public Integer getNormalCount() {
				return this.normalCount;
			}

			public void setNormalCount(Integer normalCount) {
				this.normalCount = normalCount;
			}

			public Integer getOperatingCount() {
				return this.operatingCount;
			}

			public void setOperatingCount(Integer operatingCount) {
				this.operatingCount = operatingCount;
			}

			public Integer getStoppedCount() {
				return this.stoppedCount;
			}

			public void setStoppedCount(Integer stoppedCount) {
				this.stoppedCount = stoppedCount;
			}

			public Integer getExceptionCount() {
				return this.exceptionCount;
			}

			public void setExceptionCount(Integer exceptionCount) {
				this.exceptionCount = exceptionCount;
			}
		}

		public static class TotalResources {

			private Integer cpu;

			private Integer memory;

			private Integer gpu;

			public Integer getCpu() {
				return this.cpu;
			}

			public void setCpu(Integer cpu) {
				this.cpu = cpu;
			}

			public Integer getMemory() {
				return this.memory;
			}

			public void setMemory(Integer memory) {
				this.memory = memory;
			}

			public Integer getGpu() {
				return this.gpu;
			}

			public void setGpu(Integer gpu) {
				this.gpu = gpu;
			}
		}

		public static class UsedResources {

			private Integer cpu;

			private Integer memory;

			private Integer gpu;

			public Integer getCpu() {
				return this.cpu;
			}

			public void setCpu(Integer cpu) {
				this.cpu = cpu;
			}

			public Integer getMemory() {
				return this.memory;
			}

			public void setMemory(Integer memory) {
				this.memory = memory;
			}

			public Integer getGpu() {
				return this.gpu;
			}

			public void setGpu(Integer gpu) {
				this.gpu = gpu;
			}
		}
	}

	@Override
	public ListClustersResponse getInstance(UnmarshallerContext context) {
		return	ListClustersResponseUnmarshaller.unmarshall(this, context);
	}
}
