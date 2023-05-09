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
import com.aliyuncs.iot.transform.v20180120.QueryVehicleDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryVehicleDeviceResponse extends AcsResponse {

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

		private String productKey;

		private Long modifiedTime;

		private String deviceName;

		private String protocol;

		private Long createTime;

		private String iotId;

		private JtProtocolDeviceData jtProtocolDeviceData;

		public String getProductKey() {
			return this.productKey;
		}

		public void setProductKey(String productKey) {
			this.productKey = productKey;
		}

		public Long getModifiedTime() {
			return this.modifiedTime;
		}

		public void setModifiedTime(Long modifiedTime) {
			this.modifiedTime = modifiedTime;
		}

		public String getDeviceName() {
			return this.deviceName;
		}

		public void setDeviceName(String deviceName) {
			this.deviceName = deviceName;
		}

		public String getBizProtocol() {
			return this.protocol;
		}

		public void setBizProtocol(String protocol) {
			this.protocol = protocol;
		}

		public Long getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(Long createTime) {
			this.createTime = createTime;
		}

		public String getIotId() {
			return this.iotId;
		}

		public void setIotId(String iotId) {
			this.iotId = iotId;
		}

		public JtProtocolDeviceData getJtProtocolDeviceData() {
			return this.jtProtocolDeviceData;
		}

		public void setJtProtocolDeviceData(JtProtocolDeviceData jtProtocolDeviceData) {
			this.jtProtocolDeviceData = jtProtocolDeviceData;
		}

		public static class JtProtocolDeviceData {

			private String status;

			private String registerTime;

			private String authCode;

			private String vehicleColour;

			private String deviceId;

			private String vehicleNumber;

			private String city;

			private String deviceModel;

			private String manufacturer;

			private String province;

			public String getStatus() {
				return this.status;
			}

			public void setStatus(String status) {
				this.status = status;
			}

			public String getRegisterTime() {
				return this.registerTime;
			}

			public void setRegisterTime(String registerTime) {
				this.registerTime = registerTime;
			}

			public String getAuthCode() {
				return this.authCode;
			}

			public void setAuthCode(String authCode) {
				this.authCode = authCode;
			}

			public String getVehicleColour() {
				return this.vehicleColour;
			}

			public void setVehicleColour(String vehicleColour) {
				this.vehicleColour = vehicleColour;
			}

			public String getDeviceId() {
				return this.deviceId;
			}

			public void setDeviceId(String deviceId) {
				this.deviceId = deviceId;
			}

			public String getVehicleNumber() {
				return this.vehicleNumber;
			}

			public void setVehicleNumber(String vehicleNumber) {
				this.vehicleNumber = vehicleNumber;
			}

			public String getCity() {
				return this.city;
			}

			public void setCity(String city) {
				this.city = city;
			}

			public String getDeviceModel() {
				return this.deviceModel;
			}

			public void setDeviceModel(String deviceModel) {
				this.deviceModel = deviceModel;
			}

			public String getManufacturer() {
				return this.manufacturer;
			}

			public void setManufacturer(String manufacturer) {
				this.manufacturer = manufacturer;
			}

			public String getProvince() {
				return this.province;
			}

			public void setProvince(String province) {
				this.province = province;
			}
		}
	}

	@Override
	public QueryVehicleDeviceResponse getInstance(UnmarshallerContext context) {
		return	QueryVehicleDeviceResponseUnmarshaller.unmarshall(this, context);
	}
}
