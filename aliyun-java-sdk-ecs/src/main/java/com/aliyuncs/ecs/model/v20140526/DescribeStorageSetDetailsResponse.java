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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeStorageSetDetailsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStorageSetDetailsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<Disk> disks;

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

	public List<Disk> getDisks() {
		return this.disks;
	}

	public void setDisks(List<Disk> disks) {
		this.disks = disks;
	}

	public static class Disk {

		private String diskId;

		private String diskName;

		private String category;

		private String storageSetId;

		private String creationTime;

		private Integer storageSetPartitionNumber;

		private String regionId;

		private String zoneId;

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

		public String getCategory() {
			return this.category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getStorageSetId() {
			return this.storageSetId;
		}

		public void setStorageSetId(String storageSetId) {
			this.storageSetId = storageSetId;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public Integer getStorageSetPartitionNumber() {
			return this.storageSetPartitionNumber;
		}

		public void setStorageSetPartitionNumber(Integer storageSetPartitionNumber) {
			this.storageSetPartitionNumber = storageSetPartitionNumber;
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
	}

	@Override
	public DescribeStorageSetDetailsResponse getInstance(UnmarshallerContext context) {
		return	DescribeStorageSetDetailsResponseUnmarshaller.unmarshall(this, context);
	}
}
