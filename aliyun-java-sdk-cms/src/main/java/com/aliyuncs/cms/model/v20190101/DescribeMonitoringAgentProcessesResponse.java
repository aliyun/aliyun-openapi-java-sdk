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

package com.aliyuncs.cms.model.v20190101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.cms.transform.v20190101.DescribeMonitoringAgentProcessesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeMonitoringAgentProcessesResponse extends AcsResponse {

	private String code;

	private String message;

	private Boolean success;

	private String requestId;

	private List<NodeProcess> nodeProcesses;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<NodeProcess> getNodeProcesses() {
		return this.nodeProcesses;
	}

	public void setNodeProcesses(List<NodeProcess> nodeProcesses) {
		this.nodeProcesses = nodeProcesses;
	}

	public static class NodeProcess {

		private Long processId;

		private String instanceId;

		private String processName;

		private String processUser;

		private String command;

		public Long getProcessId() {
			return this.processId;
		}

		public void setProcessId(Long processId) {
			this.processId = processId;
		}

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getProcessName() {
			return this.processName;
		}

		public void setProcessName(String processName) {
			this.processName = processName;
		}

		public String getProcessUser() {
			return this.processUser;
		}

		public void setProcessUser(String processUser) {
			this.processUser = processUser;
		}

		public String getCommand() {
			return this.command;
		}

		public void setCommand(String command) {
			this.command = command;
		}
	}

	@Override
	public DescribeMonitoringAgentProcessesResponse getInstance(UnmarshallerContext context) {
		return	DescribeMonitoringAgentProcessesResponseUnmarshaller.unmarshall(this, context);
	}
}
