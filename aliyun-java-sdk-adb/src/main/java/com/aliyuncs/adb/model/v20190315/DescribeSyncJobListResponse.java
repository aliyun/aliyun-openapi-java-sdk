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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeSyncJobListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeSyncJobListResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private Integer dBClusterId;

	private List<SyncJob> syncJobs;

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

	public Integer getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(Integer dBClusterId) {
		this.dBClusterId = dBClusterId;
	}

	public List<SyncJob> getSyncJobs() {
		return this.syncJobs;
	}

	public void setSyncJobs(List<SyncJob> syncJobs) {
		this.syncJobs = syncJobs;
	}

	public static class SyncJob {

		private Integer sourceStorageSize;

		private String sourceDBClusterId;

		private String jobId;

		private String sourceDBType;

		private String sourceDBClusterDescription;

		private String regionId;

		private Integer sourceTableNumber;

		private String syncPlatform;

		public Integer getSourceStorageSize() {
			return this.sourceStorageSize;
		}

		public void setSourceStorageSize(Integer sourceStorageSize) {
			this.sourceStorageSize = sourceStorageSize;
		}

		public String getSourceDBClusterId() {
			return this.sourceDBClusterId;
		}

		public void setSourceDBClusterId(String sourceDBClusterId) {
			this.sourceDBClusterId = sourceDBClusterId;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public String getSourceDBType() {
			return this.sourceDBType;
		}

		public void setSourceDBType(String sourceDBType) {
			this.sourceDBType = sourceDBType;
		}

		public String getSourceDBClusterDescription() {
			return this.sourceDBClusterDescription;
		}

		public void setSourceDBClusterDescription(String sourceDBClusterDescription) {
			this.sourceDBClusterDescription = sourceDBClusterDescription;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public Integer getSourceTableNumber() {
			return this.sourceTableNumber;
		}

		public void setSourceTableNumber(Integer sourceTableNumber) {
			this.sourceTableNumber = sourceTableNumber;
		}

		public String getSyncPlatform() {
			return this.syncPlatform;
		}

		public void setSyncPlatform(String syncPlatform) {
			this.syncPlatform = syncPlatform;
		}
	}

	@Override
	public DescribeSyncJobListResponse getInstance(UnmarshallerContext context) {
		return	DescribeSyncJobListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
