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

package com.aliyuncs.energyexpertexternal.model.v20220923;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.energyexpertexternal.transform.v20220923.GetDeviceListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceListResponse extends AcsResponse {

	private String requestId;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String factoryId;

		private Integer httpCode;

		private String code;

		private Boolean success;

		private List<Device> deviceList;

		public String getFactoryId() {
			return this.factoryId;
		}

		public void setFactoryId(String factoryId) {
			this.factoryId = factoryId;
		}

		public Integer getHttpCode() {
			return this.httpCode;
		}

		public void setHttpCode(Integer httpCode) {
			this.httpCode = httpCode;
		}

		public String getCode() {
			return this.code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public Boolean getSuccess() {
			return this.success;
		}

		public void setSuccess(Boolean success) {
			this.success = success;
		}

		public List<Device> getDeviceList() {
			return this.deviceList;
		}

		public void setDeviceList(List<Device> deviceList) {
			this.deviceList = deviceList;
		}

		public static class Device {

			private String deviceId;

			private String deviceName;

			private String firstTypeName;

			private String secondTypeName;

			private String parentDevice;

			private Info info;

			public String getDeviceId() {
				return this.deviceId;
			}

			public void setDeviceId(String deviceId) {
				this.deviceId = deviceId;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}

			public String getFirstTypeName() {
				return this.firstTypeName;
			}

			public void setFirstTypeName(String firstTypeName) {
				this.firstTypeName = firstTypeName;
			}

			public String getSecondTypeName() {
				return this.secondTypeName;
			}

			public void setSecondTypeName(String secondTypeName) {
				this.secondTypeName = secondTypeName;
			}

			public String getParentDevice() {
				return this.parentDevice;
			}

			public void setParentDevice(String parentDevice) {
				this.parentDevice = parentDevice;
			}

			public Info getInfo() {
				return this.info;
			}

			public void setInfo(Info info) {
				this.info = info;
			}

			public static class Info {

				private Integer magnification;

				private Integer pressure;

				private Integer pt;

				private Integer ct;

				private Integer constKva;

				public Integer getMagnification() {
					return this.magnification;
				}

				public void setMagnification(Integer magnification) {
					this.magnification = magnification;
				}

				public Integer getPressure() {
					return this.pressure;
				}

				public void setPressure(Integer pressure) {
					this.pressure = pressure;
				}

				public Integer getPt() {
					return this.pt;
				}

				public void setPt(Integer pt) {
					this.pt = pt;
				}

				public Integer getCt() {
					return this.ct;
				}

				public void setCt(Integer ct) {
					this.ct = ct;
				}

				public Integer getConstKva() {
					return this.constKva;
				}

				public void setConstKva(Integer constKva) {
					this.constKva = constKva;
				}
			}
		}
	}

	@Override
	public GetDeviceListResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
