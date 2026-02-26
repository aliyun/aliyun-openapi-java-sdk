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

package com.aliyuncs.smc.model.v20190601;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.smc.transform.v20190601.DescribeSourceServersResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSourceServersResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<SourceServer> sourceServers;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

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

	public List<SourceServer> getSourceServers() {
		return this.sourceServers;
	}

	public void setSourceServers(List<SourceServer> sourceServers) {
		this.sourceServers = sourceServers;
	}

	public static class SourceServer {

		private String creationTime;

		private Integer heartbeatRate;

		private String state;

		private Integer kernelLevel;

		private String sourceId;

		private String agentVersion;

		private String statusInfo;

		private Integer systemDiskSize;

		private String description;

		private String errorCode;

		private String jobId;

		private String platform;

		private String replicationDriver;

		private String name;

		private String systemInfo;

		private String architecture;

		private String regionNo;

		private String instanceId;

		private String resourceGroupId;

		private List<DataDisk> dataDisks;

		private List<SystemDiskPart> systemDiskParts;

		private List<Tag> tags;

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getHeartbeatRate() {
			return this.heartbeatRate;
		}

		public void setHeartbeatRate(Integer heartbeatRate) {
			this.heartbeatRate = heartbeatRate;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public Integer getKernelLevel() {
			return this.kernelLevel;
		}

		public void setKernelLevel(Integer kernelLevel) {
			this.kernelLevel = kernelLevel;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public String getAgentVersion() {
			return this.agentVersion;
		}

		public void setAgentVersion(String agentVersion) {
			this.agentVersion = agentVersion;
		}

		public String getStatusInfo() {
			return this.statusInfo;
		}

		public void setStatusInfo(String statusInfo) {
			this.statusInfo = statusInfo;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getReplicationDriver() {
			return this.replicationDriver;
		}

		public void setReplicationDriver(String replicationDriver) {
			this.replicationDriver = replicationDriver;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getSystemInfo() {
			return this.systemInfo;
		}

		public void setSystemInfo(String systemInfo) {
			this.systemInfo = systemInfo;
		}

		public String getArchitecture() {
			return this.architecture;
		}

		public void setArchitecture(String architecture) {
			this.architecture = architecture;
		}

		public String getRegionNo() {
			return this.regionNo;
		}

		public void setRegionNo(String regionNo) {
			this.regionNo = regionNo;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getResourceGroupId() {
			return this.resourceGroupId;
		}

		public void setResourceGroupId(String resourceGroupId) {
			this.resourceGroupId = resourceGroupId;
		}

		public List<DataDisk> getDataDisks() {
			return this.dataDisks;
		}

		public void setDataDisks(List<DataDisk> dataDisks) {
			this.dataDisks = dataDisks;
		}

		public List<SystemDiskPart> getSystemDiskParts() {
			return this.systemDiskParts;
		}

		public void setSystemDiskParts(List<SystemDiskPart> systemDiskParts) {
			this.systemDiskParts = systemDiskParts;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class DataDisk {

			private Integer index;

			private Integer size;

			private String path;

			private List<Part> parts;

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public List<Part> getParts() {
				return this.parts;
			}

			public void setParts(List<Part> parts) {
				this.parts = parts;
			}

			public static class Part {

				private Boolean canBlock;

				private Long sizeBytes;

				private Boolean need;

				private String device;

				private String path;

				public Boolean getCanBlock() {
					return this.canBlock;
				}

				public void setCanBlock(Boolean canBlock) {
					this.canBlock = canBlock;
				}

				public Long getSizeBytes() {
					return this.sizeBytes;
				}

				public void setSizeBytes(Long sizeBytes) {
					this.sizeBytes = sizeBytes;
				}

				public Boolean getNeed() {
					return this.need;
				}

				public void setNeed(Boolean need) {
					this.need = need;
				}

				public String getDevice() {
					return this.device;
				}

				public void setDevice(String device) {
					this.device = device;
				}

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}
			}
		}

		public static class SystemDiskPart {

			private Boolean canBlock;

			private Long sizeBytes;

			private Boolean need;

			private String device;

			private String path;

			public Boolean getCanBlock() {
				return this.canBlock;
			}

			public void setCanBlock(Boolean canBlock) {
				this.canBlock = canBlock;
			}

			public Long getSizeBytes() {
				return this.sizeBytes;
			}

			public void setSizeBytes(Long sizeBytes) {
				this.sizeBytes = sizeBytes;
			}

			public Boolean getNeed() {
				return this.need;
			}

			public void setNeed(Boolean need) {
				this.need = need;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}
		}

		public static class Tag {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}
	}

	@Override
	public DescribeSourceServersResponse getInstance(UnmarshallerContext context) {
		return	DescribeSourceServersResponseUnmarshaller.unmarshall(this, context);
	}
}
