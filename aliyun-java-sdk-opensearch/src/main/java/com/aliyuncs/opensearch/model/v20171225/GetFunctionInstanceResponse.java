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

package com.aliyuncs.opensearch.model.v20171225;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.opensearch.transform.v20171225.GetFunctionInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetFunctionInstanceResponse extends AcsResponse {

	private String status;

	private Long httpCode;

	private String requestId;

	private String message;

	private String code;

	private Long latency;

	private Result result;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(Long httpCode) {
		this.httpCode = httpCode;
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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Long getLatency() {
		return this.latency;
	}

	public void setLatency(Long latency) {
		this.latency = latency;
	}

	public Result getResult() {
		return this.result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	public static class Result {

		private Long createTime;

		private String cron;

		private String description;

		private String extendInfo;

		private String functionName;

		private String functionType;

		private String instanceName;

		private String modelType;

		private String source;

		private String status;

		private Long versionId;

		private List<CreateParametersItem> createParameters;

		private List<UsageParametersItem> usageParameters;

		private Belongs belongs;

		private Task task;

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getCron() {
			return this.cron;
		}

		public void setCron(String cron) {
			this.cron = cron;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getExtendInfo() {
			return this.extendInfo;
		}

		public void setExtendInfo(String extendInfo) {
			this.extendInfo = extendInfo;
		}

		public String getFunctionName() {
			return this.functionName;
		}

		public void setFunctionName(String functionName) {
			this.functionName = functionName;
		}

		public String getFunctionType() {
			return this.functionType;
		}

		public void setFunctionType(String functionType) {
			this.functionType = functionType;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public String getModelType() {
			return this.modelType;
		}

		public void setModelType(String modelType) {
			this.modelType = modelType;
		}

		public String getSource() {
			return this.source;
		}

		public void setSource(String source) {
			this.source = source;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Long getVersionId() {
			return this.versionId;
		}

		public void setVersionId(Long versionId) {
			this.versionId = versionId;
		}

		public List<CreateParametersItem> getCreateParameters() {
			return this.createParameters;
		}

		public void setCreateParameters(List<CreateParametersItem> createParameters) {
			this.createParameters = createParameters;
		}

		public List<UsageParametersItem> getUsageParameters() {
			return this.usageParameters;
		}

		public void setUsageParameters(List<UsageParametersItem> usageParameters) {
			this.usageParameters = usageParameters;
		}

		public Belongs getBelongs() {
			return this.belongs;
		}

		public void setBelongs(Belongs belongs) {
			this.belongs = belongs;
		}

		public Task getTask() {
			return this.task;
		}

		public void setTask(Task task) {
			this.task = task;
		}

		public static class CreateParametersItem {

			private String name;

			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class UsageParametersItem {

			private String name;

			private String value;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class Belongs {

			private String category;

			private String domain;

			private String language;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getDomain() {
				return this.domain;
			}

			public void setDomain(String domain) {
				this.domain = domain;
			}

			public String getLanguage() {
				return this.language;
			}

			public void setLanguage(String language) {
				this.language = language;
			}
		}

		public static class Task {

			private String dagStatus;

			private Long lastRunTime;

			public String getDagStatus() {
				return this.dagStatus;
			}

			public void setDagStatus(String dagStatus) {
				this.dagStatus = dagStatus;
			}

			public Long getLastRunTime() {
				return this.lastRunTime;
			}

			public void setLastRunTime(Long lastRunTime) {
				this.lastRunTime = lastRunTime;
			}
		}
	}

	@Override
	public GetFunctionInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetFunctionInstanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
