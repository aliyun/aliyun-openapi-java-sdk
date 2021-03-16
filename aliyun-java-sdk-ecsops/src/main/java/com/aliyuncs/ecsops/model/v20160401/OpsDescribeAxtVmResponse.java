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
import com.aliyuncs.ecsops.transform.v20160401.OpsDescribeAxtVmResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeAxtVmResponse extends AcsResponse {

	private String requestId;

	private List<CloudAssistantStatus> cloudAssistantStatusArray;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<CloudAssistantStatus> getCloudAssistantStatusArray() {
		return this.cloudAssistantStatusArray;
	}

	public void setCloudAssistantStatusArray(List<CloudAssistantStatus> cloudAssistantStatusArray) {
		this.cloudAssistantStatusArray = cloudAssistantStatusArray;
	}

	public static class CloudAssistantStatus {

		private String instanceId;

		private String status;

		private String agentVersion;

		private String reportTime;

		private String agentStatus;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getAgentVersion() {
			return this.agentVersion;
		}

		public void setAgentVersion(String agentVersion) {
			this.agentVersion = agentVersion;
		}

		public String getReportTime() {
			return this.reportTime;
		}

		public void setReportTime(String reportTime) {
			this.reportTime = reportTime;
		}

		public String getAgentStatus() {
			return this.agentStatus;
		}

		public void setAgentStatus(String agentStatus) {
			this.agentStatus = agentStatus;
		}
	}

	@Override
	public OpsDescribeAxtVmResponse getInstance(UnmarshallerContext context) {
		return	OpsDescribeAxtVmResponseUnmarshaller.unmarshall(this, context);
	}
}
