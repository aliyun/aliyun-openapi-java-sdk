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

package com.aliyuncs.webplus.model.v20190320;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.DescribeAppEnvStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppEnvStatusResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private EnvStatus envStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public EnvStatus getEnvStatus() {
		return this.envStatus;
	}

	public void setEnvStatus(EnvStatus envStatus) {
		this.envStatus = envStatus;
	}

	public static class EnvStatus {

		private String envId;

		private String envName;

		private String envStatus;

		private String lastEnvStatus;

		private Boolean applyingChange;

		private Boolean abortingChange;

		private String latestChangeId;

		private String changeBanner;

		private InstanceAppStatus instanceAppStatus;

		private InstanceAgentStatus instanceAgentStatus;

		public String getEnvId() {
			return this.envId;
		}

		public void setEnvId(String envId) {
			this.envId = envId;
		}

		public String getEnvName() {
			return this.envName;
		}

		public void setEnvName(String envName) {
			this.envName = envName;
		}

		public String getEnvStatus() {
			return this.envStatus;
		}

		public void setEnvStatus(String envStatus) {
			this.envStatus = envStatus;
		}

		public String getLastEnvStatus() {
			return this.lastEnvStatus;
		}

		public void setLastEnvStatus(String lastEnvStatus) {
			this.lastEnvStatus = lastEnvStatus;
		}

		public Boolean getApplyingChange() {
			return this.applyingChange;
		}

		public void setApplyingChange(Boolean applyingChange) {
			this.applyingChange = applyingChange;
		}

		public Boolean getAbortingChange() {
			return this.abortingChange;
		}

		public void setAbortingChange(Boolean abortingChange) {
			this.abortingChange = abortingChange;
		}

		public String getLatestChangeId() {
			return this.latestChangeId;
		}

		public void setLatestChangeId(String latestChangeId) {
			this.latestChangeId = latestChangeId;
		}

		public String getChangeBanner() {
			return this.changeBanner;
		}

		public void setChangeBanner(String changeBanner) {
			this.changeBanner = changeBanner;
		}

		public InstanceAppStatus getInstanceAppStatus() {
			return this.instanceAppStatus;
		}

		public void setInstanceAppStatus(InstanceAppStatus instanceAppStatus) {
			this.instanceAppStatus = instanceAppStatus;
		}

		public InstanceAgentStatus getInstanceAgentStatus() {
			return this.instanceAgentStatus;
		}

		public void setInstanceAgentStatus(InstanceAgentStatus instanceAgentStatus) {
			this.instanceAgentStatus = instanceAgentStatus;
		}

		public static class InstanceAppStatus {

			private Integer healthyInstances;

			private Integer unhealthyInstances;

			private Integer unknownInstances;

			private Integer stoppedInstances;

			public Integer getHealthyInstances() {
				return this.healthyInstances;
			}

			public void setHealthyInstances(Integer healthyInstances) {
				this.healthyInstances = healthyInstances;
			}

			public Integer getUnhealthyInstances() {
				return this.unhealthyInstances;
			}

			public void setUnhealthyInstances(Integer unhealthyInstances) {
				this.unhealthyInstances = unhealthyInstances;
			}

			public Integer getUnknownInstances() {
				return this.unknownInstances;
			}

			public void setUnknownInstances(Integer unknownInstances) {
				this.unknownInstances = unknownInstances;
			}

			public Integer getStoppedInstances() {
				return this.stoppedInstances;
			}

			public void setStoppedInstances(Integer stoppedInstances) {
				this.stoppedInstances = stoppedInstances;
			}
		}

		public static class InstanceAgentStatus {

			private Integer connectedInstances;

			private Integer disconnectedInstances;

			public Integer getConnectedInstances() {
				return this.connectedInstances;
			}

			public void setConnectedInstances(Integer connectedInstances) {
				this.connectedInstances = connectedInstances;
			}

			public Integer getDisconnectedInstances() {
				return this.disconnectedInstances;
			}

			public void setDisconnectedInstances(Integer disconnectedInstances) {
				this.disconnectedInstances = disconnectedInstances;
			}
		}
	}

	@Override
	public DescribeAppEnvStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppEnvStatusResponseUnmarshaller.unmarshall(this, context);
	}
}
