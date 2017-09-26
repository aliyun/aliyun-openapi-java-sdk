/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeVolumesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeVolumesResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Volume> volumes;

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

	public List<Volume> getVolumes() {
		return this.volumes;
	}

	public void setVolumes(List<Volume> volumes) {
		this.volumes = volumes;
	}

	public static class Volume {

		private String volumeId;

		private String regionId;

		private String zoneId;

		private String volumeName;

		private String description;

		private String category;

		private Integer size;

		private String sourceSnapshotId;

		private String autoSnapshotPolicyId;

		private String snapshotLinkId;

		private String status;

		private Boolean enableAutomatedSnapshotPolicy;

		private String creationTime;

		private String volumeChargeType;

		private Integer mountInstanceNum;

		private Boolean encrypted;

		private List<OperationLock> operationLocks;

		private List<MountInstance> mountInstances;

		private List<Tag> tags;

		public String getVolumeId() {
			return this.volumeId;
		}

		public void setVolumeId(String volumeId) {
			this.volumeId = volumeId;
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

		public String getVolumeName() {
			return this.volumeName;
		}

		public void setVolumeName(String volumeName) {
			this.volumeName = volumeName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public String getSourceSnapshotId() {
			return this.sourceSnapshotId;
		}

		public void setSourceSnapshotId(String sourceSnapshotId) {
			this.sourceSnapshotId = sourceSnapshotId;
		}

		public String getAutoSnapshotPolicyId() {
			return this.autoSnapshotPolicyId;
		}

		public void setAutoSnapshotPolicyId(String autoSnapshotPolicyId) {
			this.autoSnapshotPolicyId = autoSnapshotPolicyId;
		}

		public String getSnapshotLinkId() {
			return this.snapshotLinkId;
		}

		public void setSnapshotLinkId(String snapshotLinkId) {
			this.snapshotLinkId = snapshotLinkId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Boolean getEnableAutomatedSnapshotPolicy() {
			return this.enableAutomatedSnapshotPolicy;
		}

		public void setEnableAutomatedSnapshotPolicy(Boolean enableAutomatedSnapshotPolicy) {
			this.enableAutomatedSnapshotPolicy = enableAutomatedSnapshotPolicy;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getVolumeChargeType() {
			return this.volumeChargeType;
		}

		public void setVolumeChargeType(String volumeChargeType) {
			this.volumeChargeType = volumeChargeType;
		}

		public Integer getMountInstanceNum() {
			return this.mountInstanceNum;
		}

		public void setMountInstanceNum(Integer mountInstanceNum) {
			this.mountInstanceNum = mountInstanceNum;
		}

		public Boolean getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(Boolean encrypted) {
			this.encrypted = encrypted;
		}

		public List<OperationLock> getOperationLocks() {
			return this.operationLocks;
		}

		public void setOperationLocks(List<OperationLock> operationLocks) {
			this.operationLocks = operationLocks;
		}

		public List<MountInstance> getMountInstances() {
			return this.mountInstances;
		}

		public void setMountInstances(List<MountInstance> mountInstances) {
			this.mountInstances = mountInstances;
		}

		public List<Tag> getTags() {
			return this.tags;
		}

		public void setTags(List<Tag> tags) {
			this.tags = tags;
		}

		public static class OperationLock {

			private String lockReason;

			public String getLockReason() {
				return this.lockReason;
			}

			public void setLockReason(String lockReason) {
				this.lockReason = lockReason;
			}
		}

		public static class MountInstance {

			private String instanceId;

			private String device;

			private String attachedTime;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getDevice() {
				return this.device;
			}

			public void setDevice(String device) {
				this.device = device;
			}

			public String getAttachedTime() {
				return this.attachedTime;
			}

			public void setAttachedTime(String attachedTime) {
				this.attachedTime = attachedTime;
			}
		}

		public static class Tag {

			private String tagKey;

			private String tagValue;

			public String getTagKey() {
				return this.tagKey;
			}

			public void setTagKey(String tagKey) {
				this.tagKey = tagKey;
			}

			public String getTagValue() {
				return this.tagValue;
			}

			public void setTagValue(String tagValue) {
				this.tagValue = tagValue;
			}
		}
	}

	@Override
	public DescribeVolumesResponse getInstance(UnmarshallerContext context) {
		return	DescribeVolumesResponseUnmarshaller.unmarshall(this, context);
	}
}
