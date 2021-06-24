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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryScheduledTaskInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryScheduledTaskInstancesResponse extends AcsResponse {

	private String requestId;

	private Integer count;

	private List<ScheduledTaskInstance> scheduledTaskInstances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public List<ScheduledTaskInstance> getScheduledTaskInstances() {
		return this.scheduledTaskInstances;
	}

	public void setScheduledTaskInstances(List<ScheduledTaskInstance> scheduledTaskInstances) {
		this.scheduledTaskInstances = scheduledTaskInstances;
	}

	public static class ScheduledTaskInstance {

		private String token;

		private String scheduleFactor;

		private String taskName;

		private Long aliUid;

		private String bizId;

		private String execIpNode;

		private String extendedField;

		private String gmtModified;

		private String taskResult;

		private String taskStatus;

		private String execType;

		private String requestParameters;

		private String gmtCreate;

		private String gmtBeginProcess;

		private Long id;

		private String sourceIpNode;

		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}

		public String getScheduleFactor() {
			return this.scheduleFactor;
		}

		public void setScheduleFactor(String scheduleFactor) {
			this.scheduleFactor = scheduleFactor;
		}

		public String getTaskName() {
			return this.taskName;
		}

		public void setTaskName(String taskName) {
			this.taskName = taskName;
		}

		public Long getAliUid() {
			return this.aliUid;
		}

		public void setAliUid(Long aliUid) {
			this.aliUid = aliUid;
		}

		public String getBizId() {
			return this.bizId;
		}

		public void setBizId(String bizId) {
			this.bizId = bizId;
		}

		public String getExecIpNode() {
			return this.execIpNode;
		}

		public void setExecIpNode(String execIpNode) {
			this.execIpNode = execIpNode;
		}

		public String getExtendedField() {
			return this.extendedField;
		}

		public void setExtendedField(String extendedField) {
			this.extendedField = extendedField;
		}

		public String getGmtModified() {
			return this.gmtModified;
		}

		public void setGmtModified(String gmtModified) {
			this.gmtModified = gmtModified;
		}

		public String getTaskResult() {
			return this.taskResult;
		}

		public void setTaskResult(String taskResult) {
			this.taskResult = taskResult;
		}

		public String getTaskStatus() {
			return this.taskStatus;
		}

		public void setTaskStatus(String taskStatus) {
			this.taskStatus = taskStatus;
		}

		public String getExecType() {
			return this.execType;
		}

		public void setExecType(String execType) {
			this.execType = execType;
		}

		public String getRequestParameters() {
			return this.requestParameters;
		}

		public void setRequestParameters(String requestParameters) {
			this.requestParameters = requestParameters;
		}

		public String getGmtCreate() {
			return this.gmtCreate;
		}

		public void setGmtCreate(String gmtCreate) {
			this.gmtCreate = gmtCreate;
		}

		public String getGmtBeginProcess() {
			return this.gmtBeginProcess;
		}

		public void setGmtBeginProcess(String gmtBeginProcess) {
			this.gmtBeginProcess = gmtBeginProcess;
		}

		public Long getId() {
			return this.id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getSourceIpNode() {
			return this.sourceIpNode;
		}

		public void setSourceIpNode(String sourceIpNode) {
			this.sourceIpNode = sourceIpNode;
		}
	}

	@Override
	public OpsQueryScheduledTaskInstancesResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryScheduledTaskInstancesResponseUnmarshaller.unmarshall(this, context);
	}
}
