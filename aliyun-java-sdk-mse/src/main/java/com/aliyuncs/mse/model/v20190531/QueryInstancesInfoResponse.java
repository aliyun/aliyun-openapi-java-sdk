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

package com.aliyuncs.mse.model.v20190531;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.mse.transform.v20190531.QueryInstancesInfoResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryInstancesInfoResponse extends AcsResponse {

	private Boolean success;

	private String message;

	private String requestId;

	private String errorCode;

	private String httpCode;

	private List<InstanceModels> data;

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public String getHttpCode() {
		return this.httpCode;
	}

	public void setHttpCode(String httpCode) {
		this.httpCode = httpCode;
	}

	public List<InstanceModels> getData() {
		return this.data;
	}

	public void setData(List<InstanceModels> data) {
		this.data = data;
	}

	public static class InstanceModels {

		private String healthStatus;

		private String role;

		private String podName;

		private String ip;

		private String internetIp;

		private String singleTunnelVip;

		private String creationTimestamp;

		private String clientPort;

		private String zone;

		private Boolean zoneDistributed;

		public String getHealthStatus() {
			return this.healthStatus;
		}

		public void setHealthStatus(String healthStatus) {
			this.healthStatus = healthStatus;
		}

		public String getRole() {
			return this.role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public String getPodName() {
			return this.podName;
		}

		public void setPodName(String podName) {
			this.podName = podName;
		}

		public String getIp() {
			return this.ip;
		}

		public void setIp(String ip) {
			this.ip = ip;
		}

		public String getInternetIp() {
			return this.internetIp;
		}

		public void setInternetIp(String internetIp) {
			this.internetIp = internetIp;
		}

		public String getSingleTunnelVip() {
			return this.singleTunnelVip;
		}

		public void setSingleTunnelVip(String singleTunnelVip) {
			this.singleTunnelVip = singleTunnelVip;
		}

		public String getCreationTimestamp() {
			return this.creationTimestamp;
		}

		public void setCreationTimestamp(String creationTimestamp) {
			this.creationTimestamp = creationTimestamp;
		}

		public String getClientPort() {
			return this.clientPort;
		}

		public void setClientPort(String clientPort) {
			this.clientPort = clientPort;
		}

		public String getZone() {
			return this.zone;
		}

		public void setZone(String zone) {
			this.zone = zone;
		}

		public Boolean getZoneDistributed() {
			return this.zoneDistributed;
		}

		public void setZoneDistributed(Boolean zoneDistributed) {
			this.zoneDistributed = zoneDistributed;
		}
	}

	@Override
	public QueryInstancesInfoResponse getInstance(UnmarshallerContext context) {
		return	QueryInstancesInfoResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
