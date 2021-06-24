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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryWorkflowUserSpecificSettingsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryWorkflowUserSpecificSettingsResponse extends AcsResponse {

	private String requestId;

	private WorkflowUserSpecificSettings workflowUserSpecificSettings;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public WorkflowUserSpecificSettings getWorkflowUserSpecificSettings() {
		return this.workflowUserSpecificSettings;
	}

	public void setWorkflowUserSpecificSettings(WorkflowUserSpecificSettings workflowUserSpecificSettings) {
		this.workflowUserSpecificSettings = workflowUserSpecificSettings;
	}

	public static class WorkflowUserSpecificSettings {

		private Integer size;

		private String expireDate;

		private Integer pendingTimeout;

		private Integer concurrent;

		private Integer execTimeout;

		private Boolean wildcard;

		private String modifyDate;

		private String createDate;

		public Integer getSize() {
			return this.size;
		}

		public void setSize(Integer size) {
			this.size = size;
		}

		public String getExpireDate() {
			return this.expireDate;
		}

		public void setExpireDate(String expireDate) {
			this.expireDate = expireDate;
		}

		public Integer getPendingTimeout() {
			return this.pendingTimeout;
		}

		public void setPendingTimeout(Integer pendingTimeout) {
			this.pendingTimeout = pendingTimeout;
		}

		public Integer getConcurrent() {
			return this.concurrent;
		}

		public void setConcurrent(Integer concurrent) {
			this.concurrent = concurrent;
		}

		public Integer getExecTimeout() {
			return this.execTimeout;
		}

		public void setExecTimeout(Integer execTimeout) {
			this.execTimeout = execTimeout;
		}

		public Boolean getWildcard() {
			return this.wildcard;
		}

		public void setWildcard(Boolean wildcard) {
			this.wildcard = wildcard;
		}

		public String getModifyDate() {
			return this.modifyDate;
		}

		public void setModifyDate(String modifyDate) {
			this.modifyDate = modifyDate;
		}

		public String getCreateDate() {
			return this.createDate;
		}

		public void setCreateDate(String createDate) {
			this.createDate = createDate;
		}
	}

	@Override
	public OpsQueryWorkflowUserSpecificSettingsResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryWorkflowUserSpecificSettingsResponseUnmarshaller.unmarshall(this, context);
	}
}
