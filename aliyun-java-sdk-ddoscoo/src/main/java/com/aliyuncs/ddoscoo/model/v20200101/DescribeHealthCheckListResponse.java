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
import com.aliyuncs.ddoscoo.transform.v20200101.DescribeHealthCheckListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHealthCheckListResponse extends AcsResponse {

	private String requestId;

	private List<HealthCheckItem> healthCheckList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<HealthCheckItem> getHealthCheckList() {
		return this.healthCheckList;
	}

	public void setHealthCheckList(List<HealthCheckItem> healthCheckList) {
		this.healthCheckList = healthCheckList;
	}

	public static class HealthCheckItem {

		private Integer frontendPort;

		private String instanceId;

		private String protocol;

		private HealthCheck healthCheck;

		public Integer getFrontendPort() {
			return this.frontendPort;
		}

		public void setFrontendPort(Integer frontendPort) {
			this.frontendPort = frontendPort;
		}

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

		public HealthCheck getHealthCheck() {
			return this.healthCheck;
		}

		public void setHealthCheck(HealthCheck healthCheck) {
			this.healthCheck = healthCheck;
		}

		public static class HealthCheck {

			private Integer timeout;

			private String type;

			private String domain;

			private Integer interval;

			private Integer up;

			private Integer down;

			private Integer port;

			private String uri;

			public Integer getTimeout() {
				return this.timeout;
			}

			public void setTimeout(Integer timeout) {
				this.timeout = timeout;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String getDomain() {
				return this.domain;
			}

			public void setDomain(String domain) {
				this.domain = domain;
			}

			public Integer getInterval() {
				return this.interval;
			}

			public void setInterval(Integer interval) {
				this.interval = interval;
			}

			public Integer getUp() {
				return this.up;
			}

			public void setUp(Integer up) {
				this.up = up;
			}

			public Integer getDown() {
				return this.down;
			}

			public void setDown(Integer down) {
				this.down = down;
			}

			public Integer getPort() {
				return this.port;
			}

			public void setPort(Integer port) {
				this.port = port;
			}

			public String getUri() {
				return this.uri;
			}

			public void setUri(String uri) {
				this.uri = uri;
			}
		}
	}

	@Override
	public DescribeHealthCheckListResponse getInstance(UnmarshallerContext context) {
		return	DescribeHealthCheckListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
