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

package com.aliyuncs.dms_enterprise.model.v20181101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_enterprise.transform.v20181101.ListTasksInTaskFlowResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTasksInTaskFlowResponse extends AcsResponse {

	private String requestId;

	private String errorCode;

	private String errorMessage;

	private Boolean success;

	private List<Task> tasks;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<Task> getTasks() {
		return this.tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}

	public static class Task {

		private String nodeName;

		private String nodeType;

		private String nodeContent;

		private String timeVariables;

		private String nodeConfig;

		private String nodeOutput;

		private String graphParam;

		private String nodeId;

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getNodeContent() {
			return this.nodeContent;
		}

		public void setNodeContent(String nodeContent) {
			this.nodeContent = nodeContent;
		}

		public String getTimeVariables() {
			return this.timeVariables;
		}

		public void setTimeVariables(String timeVariables) {
			this.timeVariables = timeVariables;
		}

		public String getNodeConfig() {
			return this.nodeConfig;
		}

		public void setNodeConfig(String nodeConfig) {
			this.nodeConfig = nodeConfig;
		}

		public String getNodeOutput() {
			return this.nodeOutput;
		}

		public void setNodeOutput(String nodeOutput) {
			this.nodeOutput = nodeOutput;
		}

		public String getGraphParam() {
			return this.graphParam;
		}

		public void setGraphParam(String graphParam) {
			this.graphParam = graphParam;
		}

		public String getNodeId() {
			return this.nodeId;
		}

		public void setNodeId(String nodeId) {
			this.nodeId = nodeId;
		}
	}

	@Override
	public ListTasksInTaskFlowResponse getInstance(UnmarshallerContext context) {
		return	ListTasksInTaskFlowResponseUnmarshaller.unmarshall(this, context);
	}
}
