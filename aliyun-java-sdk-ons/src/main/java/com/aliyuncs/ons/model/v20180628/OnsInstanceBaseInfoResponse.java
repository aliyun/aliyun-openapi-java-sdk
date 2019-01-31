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

package com.aliyuncs.ons.model.v20180628;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ons.transform.v20180628.OnsInstanceBaseInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OnsInstanceBaseInfoResponse extends AcsResponse {

	private String requestId;

	private String helpUrl;

	private InstanceBaseInfo instanceBaseInfo;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getHelpUrl() {
		return this.helpUrl;
	}

	public void setHelpUrl(String helpUrl) {
		this.helpUrl = helpUrl;
	}

	public InstanceBaseInfo getInstanceBaseInfo() {
		return this.instanceBaseInfo;
	}

	public void setInstanceBaseInfo(InstanceBaseInfo instanceBaseInfo) {
		this.instanceBaseInfo = instanceBaseInfo;
	}

	public static class InstanceBaseInfo {

		private String instanceId;

		private Integer instanceStatus;

		private Long releaseTime;

		private Integer instanceType;

		private String instanceName;

		private Endpoints endpoints;

		public String getInstanceId() {
			return this.instanceId;
		}

		public void setInstanceId(String instanceId) {
			this.instanceId = instanceId;
		}

		public Integer getInstanceStatus() {
			return this.instanceStatus;
		}

		public void setInstanceStatus(Integer instanceStatus) {
			this.instanceStatus = instanceStatus;
		}

		public Long getReleaseTime() {
			return this.releaseTime;
		}

		public void setReleaseTime(Long releaseTime) {
			this.releaseTime = releaseTime;
		}

		public Integer getInstanceType() {
			return this.instanceType;
		}

		public void setInstanceType(Integer instanceType) {
			this.instanceType = instanceType;
		}

		public String getInstanceName() {
			return this.instanceName;
		}

		public void setInstanceName(String instanceName) {
			this.instanceName = instanceName;
		}

		public Endpoints getEndpoints() {
			return this.endpoints;
		}

		public void setEndpoints(Endpoints endpoints) {
			this.endpoints = endpoints;
		}

		public static class Endpoints {

			private String tcpEndpoint;

			private String httpInternetEndpoint;

			private String httpInternetSecureEndpoint;

			private String httpInternalEndpoint;

			public String getTcpEndpoint() {
				return this.tcpEndpoint;
			}

			public void setTcpEndpoint(String tcpEndpoint) {
				this.tcpEndpoint = tcpEndpoint;
			}

			public String getHttpInternetEndpoint() {
				return this.httpInternetEndpoint;
			}

			public void setHttpInternetEndpoint(String httpInternetEndpoint) {
				this.httpInternetEndpoint = httpInternetEndpoint;
			}

			public String getHttpInternetSecureEndpoint() {
				return this.httpInternetSecureEndpoint;
			}

			public void setHttpInternetSecureEndpoint(String httpInternetSecureEndpoint) {
				this.httpInternetSecureEndpoint = httpInternetSecureEndpoint;
			}

			public String getHttpInternalEndpoint() {
				return this.httpInternalEndpoint;
			}

			public void setHttpInternalEndpoint(String httpInternalEndpoint) {
				this.httpInternalEndpoint = httpInternalEndpoint;
			}
		}
	}

	@Override
	public OnsInstanceBaseInfoResponse getInstance(UnmarshallerContext context) {
		return	OnsInstanceBaseInfoResponseUnmarshaller.unmarshall(this, context);
	}
}
