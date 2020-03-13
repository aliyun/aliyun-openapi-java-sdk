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

package com.aliyuncs.sofa.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.sofa.transform.v20190815.QueryMSDdsJobsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryMSDdsJobsResponse extends AcsResponse {

	private String requestId;

	private Integer pageNum;

	private Integer pageSize;

	private Integer totalCount;

	private List<JobsItem> jobs;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<JobsItem> getJobs() {
		return this.jobs;
	}

	public void setJobs(List<JobsItem> jobs) {
		this.jobs = jobs;
	}

	public static class JobsItem {

		private String app;

		private String creationTime;

		private String cron;

		private String des;

		private Integer id;

		private String instanceId;

		private String name;

		private Integer shardingCount;

		private String status;

		private String updateTime;

		private List<String> customParams;

		public String getApp() {
			return this.app;
		}

		public void setApp(String app) {
			this.app = app;
		}

		public String getCreationTime() {
			return this.creationTime;
		}

		public void setCreationTime(String creationTime) {
			this.creationTime = creationTime;
		}

		public String getCron() {
			return this.cron;
		}

		public void setCron(String cron) {
			this.cron = cron;
		}

		public String getDes() {
			return this.des;
		}

		public void setDes(String des) {
			this.des = des;
		}

		public Integer getId() {
			return this.id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getShardingCount() {
			return this.shardingCount;
		}

		public void setShardingCount(Integer shardingCount) {
			this.shardingCount = shardingCount;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUpdateTime() {
			return this.updateTime;
		}

		public void setUpdateTime(String updateTime) {
			this.updateTime = updateTime;
		}

		public List<String> getCustomParams() {
			return this.customParams;
		}

		public void setCustomParams(List<String> customParams) {
			this.customParams = customParams;
		}
	}

	@Override
	public QueryMSDdsJobsResponse getInstance(UnmarshallerContext context) {
		return	QueryMSDdsJobsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
