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

package com.aliyuncs.nas.model.v20170626;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.nas.transform.v20170626.ListLifecycleRetrieveJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLifecycleRetrieveJobsResponse extends AcsResponse {

	private Integer totalCount;

	private Integer pageSize;

	private String requestId;

	private Integer pageNumber;

	private List<LifecycleRetrieveJob> lifecycleRetrieveJobs;

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

	public List<LifecycleRetrieveJob> getLifecycleRetrieveJobs() {
		return this.lifecycleRetrieveJobs;
	}

	public void setLifecycleRetrieveJobs(List<LifecycleRetrieveJob> lifecycleRetrieveJobs) {
		this.lifecycleRetrieveJobs = lifecycleRetrieveJobs;
	}

	public static class LifecycleRetrieveJob {

		private String status;

		private String createTime;

		private Long retrievedFileCount;

		private String updateTime;

		private String fileSystemId;

		private String jobId;

		private Long discoveredFileCount;

		private List<String> paths;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Long getRetrievedFileCount() {
			return this.retrievedFileCount;
		}

		public void setRetrievedFileCount(Long retrievedFileCount) {
			this.retrievedFileCount = retrievedFileCount;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public String getFileSystemId() {
			return this.fileSystemId;
		}

		public void setFileSystemId(String fileSystemId) {
			this.fileSystemId = fileSystemId;
		}

		public String getJobId() {
			return this.jobId;
		}

		public void setJobId(String jobId) {
			this.jobId = jobId;
		}

		public Long getDiscoveredFileCount() {
			return this.discoveredFileCount;
		}

		public void setDiscoveredFileCount(Long discoveredFileCount) {
			this.discoveredFileCount = discoveredFileCount;
		}

		public List<String> getPaths() {
			return this.paths;
		}

		public void setPaths(List<String> paths) {
			this.paths = paths;
		}
	}

	@Override
	public ListLifecycleRetrieveJobsResponse getInstance(UnmarshallerContext context) {
		return	ListLifecycleRetrieveJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
