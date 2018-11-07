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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.ListExecutePlanMigrateInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListExecutePlanMigrateInfoResponse extends AcsResponse {

	private Long total;

	private List<ExecutePlanMigrateInfo> executePlanMigrateInfoList;

	public Long getTotal() {
		return this.total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<ExecutePlanMigrateInfo> getExecutePlanMigrateInfoList() {
		return this.executePlanMigrateInfoList;
	}

	public void setExecutePlanMigrateInfoList(List<ExecutePlanMigrateInfo> executePlanMigrateInfoList) {
		this.executePlanMigrateInfoList = executePlanMigrateInfoList;
	}

	public static class ExecutePlanMigrateInfo {

		private Long id;

		private String bizId;

		private String createTime;

		private String name;

		private Long status;

		private String cronExpr;

		private String startScheduleTime;

		private Long isCycle;

		private String buildClusterCondition;

		private List<JobInfo> jobList;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Long getStatus() {
			return this.status;
		}

		public void setStatus(Long status) {
			this.status = status;
		}

		public String getCronExpr() {
			return this.cronExpr;
		}

		public void setCronExpr(String cronExpr) {
			this.cronExpr = cronExpr;
		}

		public String getStartScheduleTime() {
			return this.startScheduleTime;
		}

		public void setStartScheduleTime(String startScheduleTime) {
			this.startScheduleTime = startScheduleTime;
		}

		public Long getIsCycle() {
			return this.isCycle;
		}

		public void setIsCycle(Long isCycle) {
			this.isCycle = isCycle;
		}

		public String getBuildClusterCondition() {
			return this.buildClusterCondition;
		}

		public void setBuildClusterCondition(String buildClusterCondition) {
			this.buildClusterCondition = buildClusterCondition;
		}

		public List<JobInfo> getJobList() {
			return this.jobList;
		}

		public void setJobList(List<JobInfo> jobList) {
			this.jobList = jobList;
		}

		public static class JobInfo {

			private String clusterId;

			private String jobId;

			private String description;

			private Long indexNO;

			private Long status;

			public String getClusterId() {
				return this.clusterId;
			}

			public void setClusterId(String clusterId) {
				this.clusterId = clusterId;
			}

			public String getJobId() {
				return this.jobId;
			}

			public void setJobId(String jobId) {
				this.jobId = jobId;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Long getIndexNO() {
				return this.indexNO;
			}

			public void setIndexNO(Long indexNO) {
				this.indexNO = indexNO;
			}

			public Long getStatus() {
				return this.status;
			}

			public void setStatus(Long status) {
				this.status = status;
			}
		}
	}

	@Override
	public ListExecutePlanMigrateInfoResponse getInstance(UnmarshallerContext context) {
		return	ListExecutePlanMigrateInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
