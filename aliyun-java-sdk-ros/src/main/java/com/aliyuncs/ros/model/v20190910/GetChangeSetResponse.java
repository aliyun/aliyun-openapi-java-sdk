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

package com.aliyuncs.ros.model.v20190910;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ros.transform.v20190910.GetChangeSetResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetChangeSetResponse extends AcsResponse {

	private String status;

	private String description;

	private String requestId;

	private String statusReason;

	private String createTime;

	private String templateBody;

	private String changeSetName;

	private String changeSetId;

	private String executionStatus;

	private String changeSetType;

	private String regionId;

	private Boolean disableRollback;

	private String stackName;

	private Integer timeoutInMinutes;

	private String stackId;

	private List<Parameter> parameters;

	private List<Map<Object,Object>> changes;

	private Log log;

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStatusReason() {
		return this.statusReason;
	}

	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getTemplateBody() {
		return this.templateBody;
	}

	public void setTemplateBody(String templateBody) {
		this.templateBody = templateBody;
	}

	public String getChangeSetName() {
		return this.changeSetName;
	}

	public void setChangeSetName(String changeSetName) {
		this.changeSetName = changeSetName;
	}

	public String getChangeSetId() {
		return this.changeSetId;
	}

	public void setChangeSetId(String changeSetId) {
		this.changeSetId = changeSetId;
	}

	public String getExecutionStatus() {
		return this.executionStatus;
	}

	public void setExecutionStatus(String executionStatus) {
		this.executionStatus = executionStatus;
	}

	public String getChangeSetType() {
		return this.changeSetType;
	}

	public void setChangeSetType(String changeSetType) {
		this.changeSetType = changeSetType;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public Boolean getDisableRollback() {
		return this.disableRollback;
	}

	public void setDisableRollback(Boolean disableRollback) {
		this.disableRollback = disableRollback;
	}

	public String getStackName() {
		return this.stackName;
	}

	public void setStackName(String stackName) {
		this.stackName = stackName;
	}

	public Integer getTimeoutInMinutes() {
		return this.timeoutInMinutes;
	}

	public void setTimeoutInMinutes(Integer timeoutInMinutes) {
		this.timeoutInMinutes = timeoutInMinutes;
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
	}

	public List<Parameter> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	public List<Map<Object,Object>> getChanges() {
		return this.changes;
	}

	public void setChanges(List<Map<Object,Object>> changes) {
		this.changes = changes;
	}

	public Log getLog() {
		return this.log;
	}

	public void setLog(Log log) {
		this.log = log;
	}

	public static class Parameter {

		private String parameterKey;

		private String parameterValue;

		public String getParameterKey() {
			return this.parameterKey;
		}

		public void setParameterKey(String parameterKey) {
			this.parameterKey = parameterKey;
		}

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}
	}

	public static class Log {

		private List<TerraformLog> terraformLogs;

		public List<TerraformLog> getTerraformLogs() {
			return this.terraformLogs;
		}

		public void setTerraformLogs(List<TerraformLog> terraformLogs) {
			this.terraformLogs = terraformLogs;
		}

		public static class TerraformLog {

			private String command;

			private String stream;

			private String content;

			public String getCommand() {
				return this.command;
			}

			public void setCommand(String command) {
				this.command = command;
			}

			public String getStream() {
				return this.stream;
			}

			public void setStream(String stream) {
				this.stream = stream;
			}

			public String getContent() {
				return this.content;
			}

			public void setContent(String content) {
				this.content = content;
			}
		}
	}

	@Override
	public GetChangeSetResponse getInstance(UnmarshallerContext context) {
		return	GetChangeSetResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
