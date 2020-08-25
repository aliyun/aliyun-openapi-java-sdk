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
import com.aliyuncs.sofa.transform.v20190815.QueryLinkefabricFabricClouddetailbytypeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkefabricFabricClouddetailbytypeResponse extends AcsResponse {

	private String requestId;

	private String resultCode;

	private String resultMessage;

	private String message;

	private Long responseStatusCode;

	private Boolean success;

	private List<DataItem> data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getResultCode() {
		return this.resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultMessage() {
		return this.resultMessage;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Long getResponseStatusCode() {
		return this.responseStatusCode;
	}

	public void setResponseStatusCode(Long responseStatusCode) {
		this.responseStatusCode = responseStatusCode;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<DataItem> getData() {
		return this.data;
	}

	public void setData(List<DataItem> data) {
		this.data = data;
	}

	public static class DataItem {

		private String appName;

		private String commonState;

		private String devStage;

		private String env;

		private String envDisplayName;

		private String executeDesc;

		private Long id;

		private String projectId;

		private String taskInfo;

		private String taskState;

		private String taskType;

		private String taskUrl;

		private Long tenantId;

		private Long utcModified;

		public String getAppName() {
			return this.appName;
		}

		public void setAppName(String appName) {
			this.appName = appName;
		}

		public String getCommonState() {
			return this.commonState;
		}

		public void setCommonState(String commonState) {
			this.commonState = commonState;
		}

		public String getDevStage() {
			return this.devStage;
		}

		public void setDevStage(String devStage) {
			this.devStage = devStage;
		}

		public String getEnv() {
			return this.env;
		}

		public void setEnv(String env) {
			this.env = env;
		}

		public String getEnvDisplayName() {
			return this.envDisplayName;
		}

		public void setEnvDisplayName(String envDisplayName) {
			this.envDisplayName = envDisplayName;
		}

		public String getExecuteDesc() {
			return this.executeDesc;
		}

		public void setExecuteDesc(String executeDesc) {
			this.executeDesc = executeDesc;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProjectId() {
			return this.projectId;
		}

		public void setProjectId(String projectId) {
			this.projectId = projectId;
		}

		public String getTaskInfo() {
			return this.taskInfo;
		}

		public void setTaskInfo(String taskInfo) {
			this.taskInfo = taskInfo;
		}

		public String getTaskState() {
			return this.taskState;
		}

		public void setTaskState(String taskState) {
			this.taskState = taskState;
		}

		public String getTaskType() {
			return this.taskType;
		}

		public void setTaskType(String taskType) {
			this.taskType = taskType;
		}

		public String getTaskUrl() {
			return this.taskUrl;
		}

		public void setTaskUrl(String taskUrl) {
			this.taskUrl = taskUrl;
		}

		public Long getTenantId() {
			return this.tenantId;
		}

		public void setTenantId(Long tenantId) {
			this.tenantId = tenantId;
		}

		public Long getUtcModified() {
			return this.utcModified;
		}

		public void setUtcModified(Long utcModified) {
			this.utcModified = utcModified;
		}
	}

	@Override
	public QueryLinkefabricFabricClouddetailbytypeResponse getInstance(UnmarshallerContext context) {
		return	QueryLinkefabricFabricClouddetailbytypeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
