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

package com.aliyuncs.vcs.model.v20200515;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vcs.transform.v20200515.CreateScanDeviceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateScanDeviceResponse extends AcsResponse {

	private String requestId;

	private String message;

	private String code;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String sipReaml;

		private String sipIp;

		private String corpId;

		private String deviceSn;

		private String sipDeviceGbId;

		private String deviceCode;

		private String sipPort;

		private String sipGbId;

		private String sipPassword;

		private List<SubDeviceSipInfoItem> subDeviceSipInfo;

		public String getSipReaml() {
			return this.sipReaml;
		}

		public void setSipReaml(String sipReaml) {
			this.sipReaml = sipReaml;
		}

		public String getSipIp() {
			return this.sipIp;
		}

		public void setSipIp(String sipIp) {
			this.sipIp = sipIp;
		}

		public String getCorpId() {
			return this.corpId;
		}

		public void setCorpId(String corpId) {
			this.corpId = corpId;
		}

		public String getDeviceSn() {
			return this.deviceSn;
		}

		public void setDeviceSn(String deviceSn) {
			this.deviceSn = deviceSn;
		}

		public String getSipDeviceGbId() {
			return this.sipDeviceGbId;
		}

		public void setSipDeviceGbId(String sipDeviceGbId) {
			this.sipDeviceGbId = sipDeviceGbId;
		}

		public String getDeviceCode() {
			return this.deviceCode;
		}

		public void setDeviceCode(String deviceCode) {
			this.deviceCode = deviceCode;
		}

		public String getSipPort() {
			return this.sipPort;
		}

		public void setSipPort(String sipPort) {
			this.sipPort = sipPort;
		}

		public String getSipGbId() {
			return this.sipGbId;
		}

		public void setSipGbId(String sipGbId) {
			this.sipGbId = sipGbId;
		}

		public String getSipPassword() {
			return this.sipPassword;
		}

		public void setSipPassword(String sipPassword) {
			this.sipPassword = sipPassword;
		}

		public List<SubDeviceSipInfoItem> getSubDeviceSipInfo() {
			return this.subDeviceSipInfo;
		}

		public void setSubDeviceSipInfo(List<SubDeviceSipInfoItem> subDeviceSipInfo) {
			this.subDeviceSipInfo = subDeviceSipInfo;
		}

		public static class SubDeviceSipInfoItem {

			private String sundayCaptureStrategy;

			private String mondayCaptureStrategy;

			private String channelGbId;

			private String fridayCaptureStrategy;

			private String tuesdayCaptureStrategy;

			private String wednesdayCaptureStrategy;

			private String thursdayCaptureStrategy;

			private String saturdayCaptureStrategy;

			public String getSundayCaptureStrategy() {
				return this.sundayCaptureStrategy;
			}

			public void setSundayCaptureStrategy(String sundayCaptureStrategy) {
				this.sundayCaptureStrategy = sundayCaptureStrategy;
			}

			public String getMondayCaptureStrategy() {
				return this.mondayCaptureStrategy;
			}

			public void setMondayCaptureStrategy(String mondayCaptureStrategy) {
				this.mondayCaptureStrategy = mondayCaptureStrategy;
			}

			public String getChannelGbId() {
				return this.channelGbId;
			}

			public void setChannelGbId(String channelGbId) {
				this.channelGbId = channelGbId;
			}

			public String getFridayCaptureStrategy() {
				return this.fridayCaptureStrategy;
			}

			public void setFridayCaptureStrategy(String fridayCaptureStrategy) {
				this.fridayCaptureStrategy = fridayCaptureStrategy;
			}

			public String getTuesdayCaptureStrategy() {
				return this.tuesdayCaptureStrategy;
			}

			public void setTuesdayCaptureStrategy(String tuesdayCaptureStrategy) {
				this.tuesdayCaptureStrategy = tuesdayCaptureStrategy;
			}

			public String getWednesdayCaptureStrategy() {
				return this.wednesdayCaptureStrategy;
			}

			public void setWednesdayCaptureStrategy(String wednesdayCaptureStrategy) {
				this.wednesdayCaptureStrategy = wednesdayCaptureStrategy;
			}

			public String getThursdayCaptureStrategy() {
				return this.thursdayCaptureStrategy;
			}

			public void setThursdayCaptureStrategy(String thursdayCaptureStrategy) {
				this.thursdayCaptureStrategy = thursdayCaptureStrategy;
			}

			public String getSaturdayCaptureStrategy() {
				return this.saturdayCaptureStrategy;
			}

			public void setSaturdayCaptureStrategy(String saturdayCaptureStrategy) {
				this.saturdayCaptureStrategy = saturdayCaptureStrategy;
			}
		}
	}

	@Override
	public CreateScanDeviceResponse getInstance(UnmarshallerContext context) {
		return	CreateScanDeviceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
