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
import com.aliyuncs.ecs.transform.v20140526.DescribeStorageSetsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeStorageSetsResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private Integer pageNumber;

	private Integer pageSize;

	private List<StorageSet> storageSets;

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

	public List<StorageSet> getStorageSets() {
		return this.storageSets;
	}

	public void setStorageSets(List<StorageSet> storageSets) {
		this.storageSets = storageSets;
	}

	public static class StorageSet {

		private String storageSetId;

		private String creationTime;

		private String storageSetName;

		private String description;

		private Integer storageSetPartitionNumber;

		private String regionId;

		private String zoneId;

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

		public String getStorageSetName() {
			return this.storageSetName;
		}

		public void setStorageSetName(String storageSetName) {
			this.storageSetName = storageSetName;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
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
	public DescribeStorageSetsResponse getInstance(UnmarshallerContext context) {
		return	DescribeStorageSetsResponseUnmarshaller.unmarshall(this, context);
	}
}
