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
import com.aliyuncs.ehpc.transform.v20180412.ListNodesNoPagingResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNodesNoPagingResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<NodeInfo> nodes;

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

	public List<NodeInfo> getNodes() {
		return this.nodes;
	}

	public void setNodes(List<NodeInfo> nodes) {
		this.nodes = nodes;
	}

	public static class NodeInfo {

		private String id;

		private String hostName;

		private String regionId;

		private String status;

		private String version;

		private Boolean createdByEhpc;

		private String addTime;

		private Boolean expired;

		private String expiredTime;

		private String spotStrategy;

		private String lockReason;

		private String imageOwnerAlias;

		private String imageId;

		private Boolean htEnabled;

		private List<String> roles;

		private TotalResources totalResources;

		private UsedResources usedResources;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getHostName() {
			return this.hostName;
		}

		public void setHostName(String hostName) {
			this.hostName = hostName;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getVersion() {
			return this.version;
		}

		public void setVersion(String version) {
			this.version = version;
		}

		public Boolean getCreatedByEhpc() {
			return this.createdByEhpc;
		}

		public void setCreatedByEhpc(Boolean createdByEhpc) {
			this.createdByEhpc = createdByEhpc;
		}

		public String getAddTime() {
			return this.addTime;
		}

		public void setAddTime(String addTime) {
			this.addTime = addTime;
		}

		public Boolean getExpired() {
			return this.expired;
		}

		public void setExpired(Boolean expired) {
			this.expired = expired;
		}

		public String getExpiredTime() {
			return this.expiredTime;
		}

		public void setExpiredTime(String expiredTime) {
			this.expiredTime = expiredTime;
		}

		public String getSpotStrategy() {
			return this.spotStrategy;
		}

		public void setSpotStrategy(String spotStrategy) {
			this.spotStrategy = spotStrategy;
		}

		public String getLockReason() {
			return this.lockReason;
		}

		public void setLockReason(String lockReason) {
			this.lockReason = lockReason;
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

		public Boolean getHtEnabled() {
			return this.htEnabled;
		}

		public void setHtEnabled(Boolean htEnabled) {
			this.htEnabled = htEnabled;
		}

		public List<String> getRoles() {
			return this.roles;
		}

		public void setRoles(List<String> roles) {
			this.roles = roles;
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
	public ListNodesNoPagingResponse getInstance(UnmarshallerContext context) {
		return	ListNodesNoPagingResponseUnmarshaller.unmarshall(this, context);
	}
}
