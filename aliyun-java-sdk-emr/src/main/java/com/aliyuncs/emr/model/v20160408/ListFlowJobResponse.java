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
import com.aliyuncs.emr.transform.v20160408.ListFlowJobResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListFlowJobResponse extends AcsResponse {

	private String requestId;

	private Integer pageNumber;

	private Integer pageSize;

	private Integer total;

	private List<Job> jobList;

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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotal() {
		return this.total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public List<Job> getJobList() {
		return this.jobList;
	}

	public void setJobList(List<Job> jobList) {
		this.jobList = jobList;
	}

	public static class Job {

		private String id;

		private Long gmtCreate;

		private Long gmtModified;

		private String name;

		private String type;

		private String description;

		private String failAct;

		private Integer maxRetry;

		private Long retryInterval;

		private String params;

		private String paramConf;

		private String customVariables;

		private String envConf;

		private String runConf;

		private String monitorConf;

		private String categoryId;

		private String mode;

		private String adhoc;

		private String alertConf;

		private String lastInstanceDetail;

		private List<Resource> resourceList;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Long getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(Long gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public Long getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(Long gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getFailAct() {
			return this.failAct;
		}

		public void setFailAct(String failAct) {
			this.failAct = failAct;
		}

		public Integer getMaxRetry() {
			return this.maxRetry;
		}

		public void setMaxRetry(Integer maxRetry) {
			this.maxRetry = maxRetry;
		}

		public Long getRetryInterval() {
			return this.retryInterval;
		}

		public void setRetryInterval(Long retryInterval) {
			this.retryInterval = retryInterval;
		}

		public String getParams() {
			return this.params;
		}

		public void setParams(String params) {
			this.params = params;
		}

		public String getParamConf() {
			return this.paramConf;
		}

		public void setParamConf(String paramConf) {
			this.paramConf = paramConf;
		}

		public String getCustomVariables() {
			return this.customVariables;
		}

		public void setCustomVariables(String customVariables) {
			this.customVariables = customVariables;
		}

		public String getEnvConf() {
			return this.envConf;
		}

		public void setEnvConf(String envConf) {
			this.envConf = envConf;
		}

		public String getRunConf() {
			return this.runConf;
		}

		public void setRunConf(String runConf) {
			this.runConf = runConf;
		}

		public String getMonitorConf() {
			return this.monitorConf;
		}

		public void setMonitorConf(String monitorConf) {
			this.monitorConf = monitorConf;
		}

		public String getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(String categoryId) {
			this.categoryId = categoryId;
		}

		public String getMode() {
			return this.mode;
		}

		public void setMode(String mode) {
			this.mode = mode;
		}

		public String getAdhoc() {
			return this.adhoc;
		}

		public void setAdhoc(String adhoc) {
			this.adhoc = adhoc;
		}

		public String getAlertConf() {
			return this.alertConf;
		}

		public void setAlertConf(String alertConf) {
			this.alertConf = alertConf;
		}

		public String getLastInstanceDetail() {
			return this.lastInstanceDetail;
		}

		public void setLastInstanceDetail(String lastInstanceDetail) {
			this.lastInstanceDetail = lastInstanceDetail;
		}

		public List<Resource> getResourceList() {
			return this.resourceList;
		}

		public void setResourceList(List<Resource> resourceList) {
			this.resourceList = resourceList;
		}

		public static class Resource {

			private String path;

			private String alias;

			public String getPath() {
				return this.path;
			}

			public void setPath(String path) {
				this.path = path;
			}

			public String getAlias() {
				return this.alias;
			}

			public void setAlias(String alias) {
				this.alias = alias;
			}
		}
	}

	@Override
	public ListFlowJobResponse getInstance(UnmarshallerContext context) {
		return	ListFlowJobResponseUnmarshaller.unmarshall(this, context);
	}
}
