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

package com.aliyuncs.ddoscoo.model.v20200101;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeHealthCheckStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHealthCheckStatusResponse extends AcsResponse {

	private String requestId;

	private List<Status> healthCheckStatus;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Status> getHealthCheckStatus() {
		return this.healthCheckStatus;
	}

	public void setHealthCheckStatus(List<Status> healthCheckStatus) {
		this.healthCheckStatus = healthCheckStatus;
	}

	public static class Status {

		private String instanceId;

		private String protocol;

		private Integer frontendPort;

		private String status;

		private List<RealServerStatus> realServerStatusList;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Integer getFrontendPort() {
			return this.frontendPort;
		}

		public void setFrontendPort(Integer frontendPort) {
			this.frontendPort = frontendPort;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public List<RealServerStatus> getRealServerStatusList() {
			return this.realServerStatusList;
		}

		public void setRealServerStatusList(List<RealServerStatus> realServerStatusList) {
			this.realServerStatusList = realServerStatusList;
		}

		public static class RealServerStatus {

			private String address;

			private String status;

			public String getAddress() {
				return this.address;
			}

			public void setAddress(String address) {
				this.address = address;
			}

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}
		}
	}

	@Override
	public DescribeHealthCheckStatusResponse getInstance(UnmarshallerContext context) {
		return	DescribeHealthCheckStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
