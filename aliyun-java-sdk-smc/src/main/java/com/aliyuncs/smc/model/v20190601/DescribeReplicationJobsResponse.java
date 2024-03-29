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
import com.aliyuncs.smc.transform.v20190601.DescribeReplicationJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeReplicationJobsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<ReplicationJob> replicationJobs;

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

	public List<ReplicationJob> getReplicationJobs() {
		return this.replicationJobs;
	}

	public void setReplicationJobs(List<ReplicationJob> replicationJobs) {
		this.replicationJobs = replicationJobs;
	}

	public static class ReplicationJob {

		private Integer frequency;

		private String vpcId;

		private String creationTime;

		private String status;

		private String scheduledStartTime;

		private Integer maxNumberOfImageToKeep;

		private String containerNamespace;

		private String statusInfo;

		private String instanceRamRole;

		private Integer systemDiskSize;

		private String description;

		private String replicationParameters;

		private String errorCode;

		private String validTime;

		private Integer netMode;

		private String containerTag;

		private String licenseType;

		private String name;

		private String imageId;

		private Float progress;

		private Boolean runOnce;

		private String launchTemplateId;

		private String containerRepository;

		private String instanceId;

		private String instanceType;

		private String sourceId;

		private String launchTemplateVersion;

		private String regionId;

		private String transitionInstanceId;

		private String endTime;

		private String startTime;

		private String vSwitchId;

		private String jobId;

		private String imageName;

		private String businessStatus;

		private String targetType;

		private Integer jobType;

		private String resourceGroupId;

		private List<DataDisk> dataDisks;

		private List<SystemDiskPart> systemDiskParts;

		private List<ReplicationJobRun> replicationJobRuns;

		private List<Tag> tags;

		public Integer getFrequency() {
			return this.frequency;
		}

		public void setFrequency(Integer frequency) {
			this.frequency = frequency;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getScheduledStartTime() {
			return this.scheduledStartTime;
		}

		public void setScheduledStartTime(String scheduledStartTime) {
			this.scheduledStartTime = scheduledStartTime;
		}

		public Integer getMaxNumberOfImageToKeep() {
			return this.maxNumberOfImageToKeep;
		}

		public void setMaxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
			this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
		}

		public String getContainerNamespace() {
			return this.containerNamespace;
		}

		public void setContainerNamespace(String containerNamespace) {
			this.containerNamespace = containerNamespace;
		}

		public String getStatusInfo() {
			return this.statusInfo;
		}

		public void setStatusInfo(String statusInfo) {
			this.statusInfo = statusInfo;
		}

		public String getInstanceRamRole() {
			return this.instanceRamRole;
		}

		public void setInstanceRamRole(String instanceRamRole) {
			this.instanceRamRole = instanceRamRole;
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

		public String getReplicationParameters() {
			return this.replicationParameters;
		}

		public void setReplicationParameters(String replicationParameters) {
			this.replicationParameters = replicationParameters;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getValidTime() {
			return this.validTime;
		}

		public void setValidTime(String validTime) {
			this.validTime = validTime;
		}

		public Integer getNetMode() {
			return this.netMode;
		}

		public void setNetMode(Integer netMode) {
			this.netMode = netMode;
		}

		public String getContainerTag() {
			return this.containerTag;
		}

		public void setContainerTag(String containerTag) {
			this.containerTag = containerTag;
		}

		public String getLicenseType() {
			return this.licenseType;
		}

		public void setLicenseType(String licenseType) {
			this.licenseType = licenseType;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public Float getProgress() {
			return this.progress;
		}

		public void setProgress(Float progress) {
			this.progress = progress;
		}

		public Boolean getRunOnce() {
			return this.runOnce;
		}

		public void setRunOnce(Boolean runOnce) {
			this.runOnce = runOnce;
		}

		public String getLaunchTemplateId() {
			return this.launchTemplateId;
		}

		public void setLaunchTemplateId(String launchTemplateId) {
			this.launchTemplateId = launchTemplateId;
		}

		public String getContainerRepository() {
			return this.containerRepository;
		}

		public void setContainerRepository(String containerRepository) {
			this.containerRepository = containerRepository;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
		}

		public String getLaunchTemplateVersion() {
			return this.launchTemplateVersion;
		}

		public void setLaunchTemplateVersion(String launchTemplateVersion) {
			this.launchTemplateVersion = launchTemplateVersion;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getTransitionInstanceId() {
			return this.transitionInstanceId;
		}

		public void setTransitionInstanceId(String transitionInstanceId) {
			this.transitionInstanceId = transitionInstanceId;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public Integer getJobType() {
			return this.jobType;
		}

		public void setJobType(Integer jobType) {
			this.jobType = jobType;
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

		public List<ReplicationJobRun> getReplicationJobRuns() {
			return this.replicationJobRuns;
		}

		public void setReplicationJobRuns(List<ReplicationJobRun> replicationJobRuns) {
			this.replicationJobRuns = replicationJobRuns;
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

			public List<Part> getParts() {
				return this.parts;
			}

			public void setParts(List<Part> parts) {
				this.parts = parts;
			}

			public static class Part {

				private Long sizeBytes;

				private Boolean block;

				private String device;

				public Long getSizeBytes() {
					return this.sizeBytes;
				}

				public void setSizeBytes(Long sizeBytes) {
					this.sizeBytes = sizeBytes;
				}

				public Boolean getBlock() {
					return this.block;
				}

				public void setBlock(Boolean block) {
					this.block = block;
				}

				public String getDevice() {
					return this.device;
				}

				public void setDevice(String device) {
					this.device = device;
				}
			}
		}

		public static class SystemDiskPart {

			private Long sizeBytes;

			private Boolean block;

			private String device;

			public Long getSizeBytes() {
				return this.sizeBytes;
			}

			public void setSizeBytes(Long sizeBytes) {
				this.sizeBytes = sizeBytes;
			}

			public Boolean getBlock() {
				return this.block;
			}

			public void setBlock(Boolean block) {
				this.block = block;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}
		}

		public static class ReplicationJobRun {

			private String endTime;

			private String type;

			private String startTime;

			private String imageId;

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getStartTime() {
				return this.startTime;
			}

			public void setStartTime(String startTime) {
				this.startTime = startTime;
			}

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
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
	public DescribeReplicationJobsResponse getInstance(UnmarshallerContext context) {
		return	DescribeReplicationJobsResponseUnmarshaller.unmarshall(this, context);
	}
}
