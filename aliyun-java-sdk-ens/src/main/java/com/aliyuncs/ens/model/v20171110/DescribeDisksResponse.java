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
import com.aliyuncs.ens.transform.v20171110.DescribeDisksResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDisksResponse extends AcsResponse {

	private Integer code;

	private Integer pageNumber;

	private Integer pageSize;

	private String requestId;

	private Integer totalCount;

	private List<DisksItem> disks;

	public Integer getCode() {
		return this.code;
	}

	public void setCode(Integer code) {
		this.code = code;
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

	public List<DisksItem> getDisks() {
		return this.disks;
	}

	public void setDisks(List<DisksItem> disks) {
		this.disks = disks;
	}

	public static class DisksItem {

		private String category;

		private String creationTime;

		private String diskChargeType;

		private String diskId;

		private String diskName;

		private String ensRegionId;

		private String instanceId;

		private String instanceName;

		private String description;

		private Integer size;

		private String status;

		private String type;

		private Boolean portable;

		private String snapshotId;

		private String serialId;

		private Boolean encrypted;

		private String encryptedKeyId;

		private Boolean deleteWithInstance;

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getDiskChargeType() {
			return this.diskChargeType;
		}

		public void setDiskChargeType(String diskChargeType) {
			this.diskChargeType = diskChargeType;
		}

		public String getDiskId() {
			return this.diskId;
		}

		public void setDiskId(String diskId) {
			this.diskId = diskId;
		}

		public String getDiskName() {
			return this.diskName;
		}

		public void setDiskName(String diskName) {
			this.diskName = diskName;
		}

		public String getEnsRegionId() {
			return this.ensRegionId;
		}

		public void setEnsRegionId(String ensRegionId) {
			this.ensRegionId = ensRegionId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getPortable() {
			return this.portable;
		}

		public void setPortable(Boolean portable) {
			this.portable = portable;
		}

		public String getSnapshotId() {
			return this.snapshotId;
		}

		public void setSnapshotId(String snapshotId) {
			this.snapshotId = snapshotId;
		}

		public String getSerialId() {
			return this.serialId;
		}

		public void setSerialId(String serialId) {
			this.serialId = serialId;
		}

		public Boolean getEncrypted() {
			return this.encrypted;
		}

		public void setEncrypted(Boolean encrypted) {
			this.encrypted = encrypted;
		}

		public String getEncryptedKeyId() {
			return this.encryptedKeyId;
		}

		public void setEncryptedKeyId(String encryptedKeyId) {
			this.encryptedKeyId = encryptedKeyId;
		}

		public Boolean getDeleteWithInstance() {
			return this.deleteWithInstance;
		}

		public void setDeleteWithInstance(Boolean deleteWithInstance) {
			this.deleteWithInstance = deleteWithInstance;
		}
	}

	@Override
	public DescribeDisksResponse getInstance(UnmarshallerContext context) {
		return	DescribeDisksResponseUnmarshaller.unmarshall(this, context);
	}
}
