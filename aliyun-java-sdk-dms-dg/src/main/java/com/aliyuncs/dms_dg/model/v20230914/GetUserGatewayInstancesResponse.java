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

package com.aliyuncs.dms_dg.model.v20230914;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.dms_dg.transform.v20230914.GetUserGatewayInstancesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetUserGatewayInstancesResponse extends AcsResponse {

	private String code;

	private String errorMsg;

	private String requestId;

	private Boolean success;

	private List<GatewayInstance> gatewayInstanceList;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMsg() {
		return this.errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public List<GatewayInstance> getGatewayInstanceList() {
		return this.gatewayInstanceList;
	}

	public void setGatewayInstanceList(List<GatewayInstance> gatewayInstanceList) {
		this.gatewayInstanceList = gatewayInstanceList;
	}

	public static class GatewayInstance {

		private String gatewayInstanceId;

		private String gatewayId;

		private Long lastUpdateTime;

		private String localIP;

		private String outputIP;

		private String message;

		private String endPoint;

		private String currentDaemonVersion;

		private String currentVersion;

		private String regionId;

		private String connectEndpointType;

		private String gatewayInstanceStatus;

		public String getGatewayInstanceId() {
			return this.gatewayInstanceId;
		}

		public void setGatewayInstanceId(String gatewayInstanceId) {
			this.gatewayInstanceId = gatewayInstanceId;
		}

		public String getGatewayId() {
			return this.gatewayId;
		}

		public void setGatewayId(String gatewayId) {
			this.gatewayId = gatewayId;
		}

		public Long getLastUpdateTime() {
			return this.lastUpdateTime;
		}

		public void setLastUpdateTime(Long lastUpdateTime) {
			this.lastUpdateTime = lastUpdateTime;
		}

		public String getLocalIP() {
			return this.localIP;
		}

		public void setLocalIP(String localIP) {
			this.localIP = localIP;
		}

		public String getOutputIP() {
			return this.outputIP;
		}

		public void setOutputIP(String outputIP) {
			this.outputIP = outputIP;
		}

		public String getMessage() {
			return this.message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public String getEndPoint() {
			return this.endPoint;
		}

		public void setEndPoint(String endPoint) {
			this.endPoint = endPoint;
		}

		public String getCurrentDaemonVersion() {
			return this.currentDaemonVersion;
		}

		public void setCurrentDaemonVersion(String currentDaemonVersion) {
			this.currentDaemonVersion = currentDaemonVersion;
		}

		public String getCurrentVersion() {
			return this.currentVersion;
		}

		public void setCurrentVersion(String currentVersion) {
			this.currentVersion = currentVersion;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getConnectEndpointType() {
			return this.connectEndpointType;
		}

		public void setConnectEndpointType(String connectEndpointType) {
			this.connectEndpointType = connectEndpointType;
		}

		public String getGatewayInstanceStatus() {
			return this.gatewayInstanceStatus;
		}

		public void setGatewayInstanceStatus(String gatewayInstanceStatus) {
			this.gatewayInstanceStatus = gatewayInstanceStatus;
		}
	}

	@Override
	public GetUserGatewayInstancesResponse getInstance(UnmarshallerContext context) {
		return	GetUserGatewayInstancesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
