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

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<SourceServer> sourceServers;

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

	public List<SourceServer> getSourceServers() {
		return this.sourceServers;
	}

	public void setSourceServers(List<SourceServer> sourceServers) {
		this.sourceServers = sourceServers;
	}

	public static class SourceServer {

		private String sourceId;

		private String jobId;

		private String agentVersion;

		private String name;

		private String description;

		private Integer kernelLevel;

		private String platform;

		private String architecture;

		private Integer systemDiskSize;

		private String replicationDriver;

		private String systemInfo;

		private String creationTime;

		private String state;

		private String errorCode;

		private String statusInfo;

		private Integer heartbeatRate;

		private List<DataDisk> dataDisks;

		private List<SystemDiskPart> systemDiskParts;

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getAgentVersion() {
			return this.agentVersion;
		}

		public void setAgentVersion(String agentVersion) {
			this.agentVersion = agentVersion;
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

		public Integer getKernelLevel() {
			return this.kernelLevel;
		}

		public void setKernelLevel(Integer kernelLevel) {
			this.kernelLevel = kernelLevel;
		}

		public String getPlatform() {
			return this.platform;
		}

		public void setPlatform(String platform) {
			this.platform = platform;
		}

		public String getArchitecture() {
			return this.architecture;
		}

		public void setArchitecture(String architecture) {
			this.architecture = architecture;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getReplicationDriver() {
			return this.replicationDriver;
		}

		public void setReplicationDriver(String replicationDriver) {
			this.replicationDriver = replicationDriver;
		}

		public String getSystemInfo() {
			return this.systemInfo;
		}

		public void setSystemInfo(String systemInfo) {
			this.systemInfo = systemInfo;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getStatusInfo() {
			return this.statusInfo;
		}

		public void setStatusInfo(String statusInfo) {
			this.statusInfo = statusInfo;
		}

		public Integer getHeartbeatRate() {
			return this.heartbeatRate;
		}

		public void setHeartbeatRate(Integer heartbeatRate) {
			this.heartbeatRate = heartbeatRate;
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

				private String path;

				private String device;

				private Long sizeBytes;

				private Boolean need;

				private Boolean canBlock;

				public String getPath() {
					return this.path;
				}

				public void setPath(String path) {
					this.path = path;
				}

				public String getDevice() {
					return this.device;
				}

				public void setDevice(String device) {
					this.device = device;
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

				public Boolean getCanBlock() {
					return this.canBlock;
				}

				public void setCanBlock(Boolean canBlock) {
					this.canBlock = canBlock;
				}
			}
		}

		public static class SystemDiskPart {

			private String path;

			private String device;

			private Long sizeBytes;

			private Boolean need;

			private Boolean canBlock;

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
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

			public Boolean getCanBlock() {
				return this.canBlock;
			}

			public void setCanBlock(Boolean canBlock) {
				this.canBlock = canBlock;
			}
		}
	}

	@Override
	public DescribeSourceServersResponse getInstance(UnmarshallerContext context) {
		return	DescribeSourceServersResponseUnmarshaller.unmarshall(this, context);
	}
}
