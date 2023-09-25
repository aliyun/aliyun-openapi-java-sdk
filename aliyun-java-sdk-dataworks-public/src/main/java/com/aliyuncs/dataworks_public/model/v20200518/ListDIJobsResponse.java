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

package com.aliyuncs.dataworks_public.model.v20200518;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dataworks_public.transform.v20200518.ListDIJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDIJobsResponse extends AcsResponse {

	private String requestId;

	private DIJobPaging dIJobPaging;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public DIJobPaging getDIJobPaging() {
		return this.dIJobPaging;
	}

	public void setDIJobPaging(DIJobPaging dIJobPaging) {
		this.dIJobPaging = dIJobPaging;
	}

	public static class DIJobPaging {

		private Integer totalCount;

		private Integer pageNumber;

		private Integer pageSize;

		private List<DIJob> dIJobs;

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

		public List<DIJob> getDIJobs() {
			return this.dIJobs;
		}

		public void setDIJobs(List<DIJob> dIJobs) {
			this.dIJobs = dIJobs;
		}

		public static class DIJob {

			private Long dIJobId;

			private Long projectId;

			private String jobName;

			private String migrationType;

			private String sourceDataSourceType;

			private String destinationDataSourceType;

			private String jobStatus;

			public Long getDIJobId() {
				return this.dIJobId;
			}

			public void setDIJobId(Long dIJobId) {
				this.dIJobId = dIJobId;
			}

			public Long getProjectId() {
				return this.projectId;
			}

			public void setProjectId(Long projectId) {
				this.projectId = projectId;
			}

			public String getJobName() {
				return this.jobName;
			}

			public void setJobName(String jobName) {
				this.jobName = jobName;
			}

			public String getMigrationType() {
				return this.migrationType;
			}

			public void setMigrationType(String migrationType) {
				this.migrationType = migrationType;
			}

			public String getSourceDataSourceType() {
				return this.sourceDataSourceType;
			}

			public void setSourceDataSourceType(String sourceDataSourceType) {
				this.sourceDataSourceType = sourceDataSourceType;
			}

			public String getDestinationDataSourceType() {
				return this.destinationDataSourceType;
			}

			public void setDestinationDataSourceType(String destinationDataSourceType) {
				this.destinationDataSourceType = destinationDataSourceType;
			}

			public String getJobStatus() {
				return this.jobStatus;
			}

			public void setJobStatus(String jobStatus) {
				this.jobStatus = jobStatus;
			}
		}
	}

	@Override
	public ListDIJobsResponse getInstance(UnmarshallerContext context) {
		return	ListDIJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
