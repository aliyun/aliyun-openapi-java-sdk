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

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<ReplicationJob> replicationJobs;

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

	public List<ReplicationJob> getReplicationJobs() {
		return this.replicationJobs;
	}

	public void setReplicationJobs(List<ReplicationJob> replicationJobs) {
		this.replicationJobs = replicationJobs;
	}

	public static class ReplicationJob {

		private String jobId;

		private String sourceId;

		private String name;

		private String description;

		private String regionId;

		private String targetType;

		private String scheduledStartTime;

		private String imageName;

		private String instanceId;

		private String imageId;

		private String status;

		private String businessStatus;

		private String errorCode;

		private Float progress;

		private String creationTime;

		private String validTime;

		private String startTime;

		private String endTime;

		private Integer netMode;

		private Integer systemDiskSize;

		private String vpcId;

		private String vSwitchId;

		private String transitionInstanceId;

		private String statusInfo;

		private String replicationParameters;

		private Boolean runOnce;

		private Integer frequency;

		private Integer maxNumberOfImageToKeep;

		private String instanceType;

		private List<DataDisk> dataDisks;

		private List<ReplicationJobRun> replicationJobRuns;

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getSourceId() {
			return this.sourceId;
		}

		public void setSourceId(String sourceId) {
			this.sourceId = sourceId;
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

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getTargetType() {
			return this.targetType;
		}

		public void setTargetType(String targetType) {
			this.targetType = targetType;
		}

		public String getScheduledStartTime() {
			return this.scheduledStartTime;
		}

		public void setScheduledStartTime(String scheduledStartTime) {
			this.scheduledStartTime = scheduledStartTime;
		}

		public String getImageName() {
			return this.imageName;
		}

		public void setImageName(String imageName) {
			this.imageName = imageName;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getImageId() {
			return this.imageId;
		}

		public void setImageId(String imageId) {
			this.imageId = imageId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getBusinessStatus() {
			return this.businessStatus;
		}

		public void setBusinessStatus(String businessStatus) {
			this.businessStatus = businessStatus;
		}

		public String getErrorCode() {
			return this.errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public Float getProgress() {
			return this.progress;
		}

		public void setProgress(Float progress) {
			this.progress = progress;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getValidTime() {
			return this.validTime;
		}

		public void setValidTime(String validTime) {
			this.validTime = validTime;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}

		public Integer getNetMode() {
			return this.netMode;
		}

		public void setNetMode(Integer netMode) {
			this.netMode = netMode;
		}

		public Integer getSystemDiskSize() {
			return this.systemDiskSize;
		}

		public void setSystemDiskSize(Integer systemDiskSize) {
			this.systemDiskSize = systemDiskSize;
		}

		public String getVpcId() {
			return this.vpcId;
		}

		public void setVpcId(String vpcId) {
			this.vpcId = vpcId;
		}

		public String getVSwitchId() {
			return this.vSwitchId;
		}

		public void setVSwitchId(String vSwitchId) {
			this.vSwitchId = vSwitchId;
		}

		public String getTransitionInstanceId() {
			return this.transitionInstanceId;
		}

		public void setTransitionInstanceId(String transitionInstanceId) {
			this.transitionInstanceId = transitionInstanceId;
		}

		public String getStatusInfo() {
			return this.statusInfo;
		}

		public void setStatusInfo(String statusInfo) {
			this.statusInfo = statusInfo;
		}

		public String getReplicationParameters() {
			return this.replicationParameters;
		}

		public void setReplicationParameters(String replicationParameters) {
			this.replicationParameters = replicationParameters;
		}

		public Boolean getRunOnce() {
			return this.runOnce;
		}

		public void setRunOnce(Boolean runOnce) {
			this.runOnce = runOnce;
		}

		public Integer getFrequency() {
			return this.frequency;
		}

		public void setFrequency(Integer frequency) {
			this.frequency = frequency;
		}

		public Integer getMaxNumberOfImageToKeep() {
			return this.maxNumberOfImageToKeep;
		}

		public void setMaxNumberOfImageToKeep(Integer maxNumberOfImageToKeep) {
			this.maxNumberOfImageToKeep = maxNumberOfImageToKeep;
		}

		public String getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(String instanceType) {
			this.instanceType = instanceType;
		}

		public List<DataDisk> getDataDisks() {
			return this.dataDisks;
		}

		public void setDataDisks(List<DataDisk> dataDisks) {
			this.dataDisks = dataDisks;
		}

		public List<ReplicationJobRun> getReplicationJobRuns() {
			return this.replicationJobRuns;
		}

		public void setReplicationJobRuns(List<ReplicationJobRun> replicationJobRuns) {
			this.replicationJobRuns = replicationJobRuns;
		}

		public static class DataDisk {

			private Integer size;

			private Integer index;

			public Integer getSize() {
				return this.size;
			}

			public void setSize(Integer size) {
				this.size = size;
			}

			public Integer getIndex() {
				return this.index;
			}

			public void setIndex(Integer index) {
				this.index = index;
			}
		}

		public static class ReplicationJobRun {

			private String imageId;

			private String type;

			private String startTime;

			private String endTime;

			public String getImageId() {
				return this.imageId;
			}

			public void setImageId(String imageId) {
				this.imageId = imageId;
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

			public String getEndTime() {
				return this.endTime;
			}

			public void setEndTime(String endTime) {
				this.endTime = endTime;
			}
		}
	}

	@Override
	public DescribeReplicationJobsResponse getInstance(UnmarshallerContext context) {
		return	DescribeReplicationJobsResponseUnmarshaller.unmarshall(this, context);
	}
}
