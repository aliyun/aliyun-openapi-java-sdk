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

package com.aliyuncs.qualitycheck.model.v20190115;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.qualitycheck.transform.v20190115.ListDataSetTaskResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListDataSetTaskResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer dataSize;

	private Integer pageSize;

	private Integer currentPage;

	private Integer totalCount;

	private Integer isAllcomplete;

	private List<PageTaskInfo> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getDataSize() {
		return this.dataSize;
	}

	public void setDataSize(Integer dataSize) {
		this.dataSize = dataSize;
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public Integer getIsAllcomplete() {
		return this.isAllcomplete;
	}

	public void setIsAllcomplete(Integer isAllcomplete) {
		this.isAllcomplete = isAllcomplete;
	}

	public List<PageTaskInfo> getData() {
		return this.data;
	}

	public void setData(List<PageTaskInfo> data) {
		this.data = data;
	}

	public static class PageTaskInfo {

		private String jobName;

		private Float scheduleRatio;

		private String taskId;

		private Boolean taskComplete;

		private Integer status;

		private Boolean isTaskComplete;

		private Integer ruleSize;

		private Integer dataSetSize;

		private List<RuleNameInfo> ruleNameInfoList;

		private List<String> dataSets;

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public Float getScheduleRatio() {
			return this.scheduleRatio;
		}

		public void setScheduleRatio(Float scheduleRatio) {
			this.scheduleRatio = scheduleRatio;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public Boolean getTaskComplete() {
			return this.taskComplete;
		}

		public void setTaskComplete(Boolean taskComplete) {
			this.taskComplete = taskComplete;
		}

		public Integer getStatus() {
			return this.status;
		}

		public void setStatus(Integer status) {
			this.status = status;
		}

		public Boolean getIsTaskComplete() {
			return this.isTaskComplete;
		}

		public void setIsTaskComplete(Boolean isTaskComplete) {
			this.isTaskComplete = isTaskComplete;
		}

		public Integer getRuleSize() {
			return this.ruleSize;
		}

		public void setRuleSize(Integer ruleSize) {
			this.ruleSize = ruleSize;
		}

		public Integer getDataSetSize() {
			return this.dataSetSize;
		}

		public void setDataSetSize(Integer dataSetSize) {
			this.dataSetSize = dataSetSize;
		}

		public List<RuleNameInfo> getRuleNameInfoList() {
			return this.ruleNameInfoList;
		}

		public void setRuleNameInfoList(List<RuleNameInfo> ruleNameInfoList) {
			this.ruleNameInfoList = ruleNameInfoList;
		}

		public List<String> getDataSets() {
			return this.dataSets;
		}

		public void setDataSets(List<String> dataSets) {
			this.dataSets = dataSets;
		}

		public static class RuleNameInfo {

			private Integer rid;

			private String ruleName;

			public Integer getRid() {
				return this.rid;
			}

			public void setRid(Integer rid) {
				this.rid = rid;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}
		}
	}

	@Override
	public ListDataSetTaskResponse getInstance(UnmarshallerContext context) {
		return	ListDataSetTaskResponseUnmarshaller.unmarshall(this, context);
	}
}
