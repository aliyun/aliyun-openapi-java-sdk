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

package com.aliyuncs.ahas_openapi.model.v20190901;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ahas_openapi.transform.v20190901.PageableQueryExperimentTaskByClusterIdResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class PageableQueryExperimentTaskByClusterIdResponse extends AcsResponse {

	private Integer pages;

	private String requestId;

	private String message;

	private Integer pageSize;

	private Integer currentPage;

	private Integer total;

	private Integer httpStatusCode;

	private String code;

	private Boolean success;

	private List<ExperimentTaskInfo> experimentTasks;

	public Integer getPages() {
		return this.pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
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

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<ExperimentTaskInfo> getExperimentTasks() {
		return this.experimentTasks;
	}

	public void setExperimentTasks(List<ExperimentTaskInfo> experimentTasks) {
		this.experimentTasks = experimentTasks;
	}

	public static class ExperimentTaskInfo {

		private Long endTime;

		private Long startTime;

		private String result;

		private String state;

		private String currentPhase;

		private String experimentId;

		private String message;

		private String taskId;

		private String experimentName;

		private String namespace;

		private ExtInfo extInfo;

		private Creator creator;

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public String getResult() {
			return this.result;
		}

		public void setResult(String result) {
			this.result = result;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getCurrentPhase() {
			return this.currentPhase;
		}

		public void setCurrentPhase(String currentPhase) {
			this.currentPhase = currentPhase;
		}

		public String getExperimentId() {
			return this.experimentId;
		}

		public void setExperimentId(String experimentId) {
			this.experimentId = experimentId;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getTaskId() {
			return this.taskId;
		}

		public void setTaskId(String taskId) {
			this.taskId = taskId;
		}

		public String getExperimentName() {
			return this.experimentName;
		}

		public void setExperimentName(String experimentName) {
			this.experimentName = experimentName;
		}

		public String getNamespace() {
			return this.namespace;
		}

		public void setNamespace(String namespace) {
			this.namespace = namespace;
		}

		public ExtInfo getExtInfo() {
			return this.extInfo;
		}

		public void setExtInfo(ExtInfo extInfo) {
			this.extInfo = extInfo;
		}

		public Creator getCreator() {
			return this.creator;
		}

		public void setCreator(Creator creator) {
			this.creator = creator;
		}

		public static class ExtInfo {

			private SchedulerConfig schedulerConfig;

			public SchedulerConfig getSchedulerConfig() {
				return this.schedulerConfig;
			}

			public void setSchedulerConfig(SchedulerConfig schedulerConfig) {
				this.schedulerConfig = schedulerConfig;
			}

			public static class SchedulerConfig {

				private String fixedTime;

				private String cronExpression;

				public String getFixedTime() {
					return this.fixedTime;
				}

				public void setFixedTime(String fixedTime) {
					this.fixedTime = fixedTime;
				}

				public String getCronExpression() {
					return this.cronExpression;
				}

				public void setCronExpression(String cronExpression) {
					this.cronExpression = cronExpression;
				}
			}
		}

		public static class Creator {

			private String subUserId;

			private String userId;

			public String getSubUserId() {
				return this.subUserId;
			}

			public void setSubUserId(String subUserId) {
				this.subUserId = subUserId;
			}

			public String getUserId() {
				return this.userId;
			}

			public void setUserId(String userId) {
				this.userId = userId;
			}
		}
	}

	@Override
	public PageableQueryExperimentTaskByClusterIdResponse getInstance(UnmarshallerContext context) {
		return	PageableQueryExperimentTaskByClusterIdResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
