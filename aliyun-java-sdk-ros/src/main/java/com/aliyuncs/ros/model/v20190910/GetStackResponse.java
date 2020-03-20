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
import com.aliyuncs.ros.transform.v20190910.GetStackResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetStackResponse extends AcsResponse {

	private String createTime;

	private String description;

	private Boolean disableRollback;

	private String regionId;

	private String requestId;

	private String stackId;

	private String stackName;

	private String status;

	private String statusReason;

	private String templateDescription;

	private Integer timeoutInMinutes;

	private String updateTime;

	private String parentStackId;

	private String stackDriftStatus;

	private String driftDetectionTime;

	private String ramRoleName;

	private List<Parameter> parameters;

	private List<Map<Object,Object>> outputs;

	private List<String> notificationURLs;

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getDisableRollback() {
		return this.disableRollback;
	}

	public void setDisableRollback(Boolean disableRollback) {
		this.disableRollback = disableRollback;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStackId() {
		return this.stackId;
	}

	public void setStackId(String stackId) {
		this.stackId = stackId;
	}

	public String getStackName() {
		return this.stackName;
	}

	public void setStackName(String stackName) {
		this.stackName = stackName;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusReason() {
		return this.statusReason;
	}

	public void setStatusReason(String statusReason) {
		this.statusReason = statusReason;
	}

	public String getTemplateDescription() {
		return this.templateDescription;
	}

	public void setTemplateDescription(String templateDescription) {
		this.templateDescription = templateDescription;
	}

	public Integer getTimeoutInMinutes() {
		return this.timeoutInMinutes;
	}

	public void setTimeoutInMinutes(Integer timeoutInMinutes) {
		this.timeoutInMinutes = timeoutInMinutes;
	}

	public String getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getParentStackId() {
		return this.parentStackId;
	}

	public void setParentStackId(String parentStackId) {
		this.parentStackId = parentStackId;
	}

	public String getStackDriftStatus() {
		return this.stackDriftStatus;
	}

	public void setStackDriftStatus(String stackDriftStatus) {
		this.stackDriftStatus = stackDriftStatus;
	}

	public String getDriftDetectionTime() {
		return this.driftDetectionTime;
	}

	public void setDriftDetectionTime(String driftDetectionTime) {
		this.driftDetectionTime = driftDetectionTime;
	}

	public String getRamRoleName() {
		return this.ramRoleName;
	}

	public void setRamRoleName(String ramRoleName) {
		this.ramRoleName = ramRoleName;
	}

	public List<Parameter> getParameters() {
		return this.parameters;
	}

	public void setParameters(List<Parameter> parameters) {
		this.parameters = parameters;
	}

	public List<Map<Object,Object>> getOutputs() {
		return this.outputs;
	}

	public void setOutputs(List<Map<Object,Object>> outputs) {
		this.outputs = outputs;
	}

	public List<String> getNotificationURLs() {
		return this.notificationURLs;
	}

	public void setNotificationURLs(List<String> notificationURLs) {
		this.notificationURLs = notificationURLs;
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

	@Override
	public GetStackResponse getInstance(UnmarshallerContext context) {
		return	GetStackResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
