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

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.webplus.transform.v20190320.DescribeAppEnvInstanceHealthResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeAppEnvInstanceHealthResponse extends AcsResponse {

	private String requestId;

	private String code;

	private String message;

	private EnvInstanceHealth envInstanceHealth;

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

	public EnvInstanceHealth getEnvInstanceHealth() {
		return this.envInstanceHealth;
	}

	public void setEnvInstanceHealth(EnvInstanceHealth envInstanceHealth) {
		this.envInstanceHealth = envInstanceHealth;
	}

	public static class EnvInstanceHealth {

		private String envId;

		private String envName;

		private List<InstanceHealth> instanceHealthList;

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

		public List<InstanceHealth> getInstanceHealthList() {
			return this.instanceHealthList;
		}

		public void setInstanceHealthList(List<InstanceHealth> instanceHealthList) {
			this.instanceHealthList = instanceHealthList;
		}

		public static class InstanceHealth {

			private String instanceId;

			private String agentStatus;

			private String appStatus;

			private String disconnectedTime;

			public String getInstanceId() {
				return this.instanceId;
			}

			public void setInstanceId(String instanceId) {
				this.instanceId = instanceId;
			}

			public String getAgentStatus() {
				return this.agentStatus;
			}

			public void setAgentStatus(String agentStatus) {
				this.agentStatus = agentStatus;
			}

			public String getAppStatus() {
				return this.appStatus;
			}

			public void setAppStatus(String appStatus) {
				this.appStatus = appStatus;
			}

			public String getDisconnectedTime() {
				return this.disconnectedTime;
			}

			public void setDisconnectedTime(String disconnectedTime) {
				this.disconnectedTime = disconnectedTime;
			}
		}
	}

	@Override
	public DescribeAppEnvInstanceHealthResponse getInstance(UnmarshallerContext context) {
		return	DescribeAppEnvInstanceHealthResponseUnmarshaller.unmarshall(this, context);
	}
}
