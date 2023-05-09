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

package com.aliyuncs.iot.model.v20180120;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.iot.transform.v20180120.QueryDeviceTunnelResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryDeviceTunnelResponse extends AcsResponse {

	private String code;

	private String errorMessage;

	private String requestId;

	private Boolean success;

	private Data data;

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getErrorMessage() {
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String productName;

		private String deviceName;

		private String utcClosed;

		private String deviceConnState;

		private String utcCreated;

		private String sourceConnState;

		private String productKey;

		private String description;

		private String tunnelId;

		private String tunnelState;

		private String iotId;

		private String udi;

		public String getProductName() {
			return this.productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getUtcClosed() {
			return this.utcClosed;
		}

		public void setUtcClosed(String utcClosed) {
			this.utcClosed = utcClosed;
		}

		public String getDeviceConnState() {
			return this.deviceConnState;
		}

		public void setDeviceConnState(String deviceConnState) {
			this.deviceConnState = deviceConnState;
		}

		public String getUtcCreated() {
			return this.utcCreated;
		}

		public void setUtcCreated(String utcCreated) {
			this.utcCreated = utcCreated;
		}

		public String getSourceConnState() {
			return this.sourceConnState;
		}

		public void setSourceConnState(String sourceConnState) {
			this.sourceConnState = sourceConnState;
		}

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getTunnelId() {
			return this.tunnelId;
		}

		public void setTunnelId(String tunnelId) {
			this.tunnelId = tunnelId;
		}

		public String getTunnelState() {
			return this.tunnelState;
		}

		public void setTunnelState(String tunnelState) {
			this.tunnelState = tunnelState;
		}

		public String getIotId() {
			return this.iotId;
		}

		public void setIotId(String iotId) {
			this.iotId = iotId;
		}

		public String getUdi() {
			return this.udi;
		}

		public void setUdi(String udi) {
			this.udi = udi;
		}
	}

	@Override
	public QueryDeviceTunnelResponse getInstance(UnmarshallerContext context) {
		return	QueryDeviceTunnelResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
