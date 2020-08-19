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

package com.aliyuncs.foas.model.v20181111;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.foas.transform.v20181111.GetInstanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetInstanceResponse extends AcsResponse {

	private String requestId;

	private Instance instance;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Instance getInstance() {
		return this.instance;
	}

	public void setInstance(Instance instance) {
		this.instance = instance;
	}

	public static class Instance {

		private Long id;

		private String projectName;

		private String jobName;

		private String actualState;

		private String expectState;

		private String jobType;

		private String apiType;

		private String code;

		private String properties;

		private String packages;

		private String starter;

		private Long startTime;

		private Long lastErrorTime;

		private String lastErrorMessage;

		private String lastOperator;

		private Long lastOperateTime;

		private String planJson;

		private String engineVersion;

		private String engineJobHandler;

		private Long inputDelay;

		private String clusterId;

		private String queueName;

		private Long endTime;

		private String autoScaleParams;

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getProjectName() {
			return this.projectName;
		}

		public void setProjectName(String projectName) {
			this.projectName = projectName;
		}

		public String getJobName() {
			return this.jobName;
		}

		public void setJobName(String jobName) {
			this.jobName = jobName;
		}

		public String getActualState() {
			return this.actualState;
		}

		public void setActualState(String actualState) {
			this.actualState = actualState;
		}

		public String getExpectState() {
			return this.expectState;
		}

		public void setExpectState(String expectState) {
			this.expectState = expectState;
		}

		public String getJobType() {
			return this.jobType;
		}

		public void setJobType(String jobType) {
			this.jobType = jobType;
		}

		public String getApiType() {
			return this.apiType;
		}

		public void setApiType(String apiType) {
			this.apiType = apiType;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getProperties() {
			return this.properties;
		}

		public void setProperties(String properties) {
			this.properties = properties;
		}

		public String getPackages() {
			return this.packages;
		}

		public void setPackages(String packages) {
			this.packages = packages;
		}

		public String getStarter() {
			return this.starter;
		}

		public void setStarter(String starter) {
			this.starter = starter;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getLastErrorTime() {
			return this.lastErrorTime;
		}

		public void setLastErrorTime(Long lastErrorTime) {
			this.lastErrorTime = lastErrorTime;
		}

		public String getLastErrorMessage() {
			return this.lastErrorMessage;
		}

		public void setLastErrorMessage(String lastErrorMessage) {
			this.lastErrorMessage = lastErrorMessage;
		}

		public String getLastOperator() {
			return this.lastOperator;
		}

		public void setLastOperator(String lastOperator) {
			this.lastOperator = lastOperator;
		}

		public Long getLastOperateTime() {
			return this.lastOperateTime;
		}

		public void setLastOperateTime(Long lastOperateTime) {
			this.lastOperateTime = lastOperateTime;
		}

		public String getPlanJson() {
			return this.planJson;
		}

		public void setPlanJson(String planJson) {
			this.planJson = planJson;
		}

		public String getEngineVersion() {
			return this.engineVersion;
		}

		public void setEngineVersion(String engineVersion) {
			this.engineVersion = engineVersion;
		}

		public String getEngineJobHandler() {
			return this.engineJobHandler;
		}

		public void setEngineJobHandler(String engineJobHandler) {
			this.engineJobHandler = engineJobHandler;
		}

		public Long getInputDelay() {
			return this.inputDelay;
		}

		public void setInputDelay(Long inputDelay) {
			this.inputDelay = inputDelay;
		}

		public String getClusterId() {
			return this.clusterId;
		}

		public void setClusterId(String clusterId) {
			this.clusterId = clusterId;
		}

		public String getQueueName() {
			return this.queueName;
		}

		public void setQueueName(String queueName) {
			this.queueName = queueName;
		}

		public Long getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Long endTime) {
			this.endTime = endTime;
		}

		public String getAutoScaleParams() {
			return this.autoScaleParams;
		}

		public void setAutoScaleParams(String autoScaleParams) {
			this.autoScaleParams = autoScaleParams;
		}
	}

	@Override
	public GetInstanceResponse getInstance(UnmarshallerContext context) {
		return	GetInstanceResponseUnmarshaller.unmarshall(this, context);
	}
}
