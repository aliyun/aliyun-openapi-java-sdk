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

package com.aliyuncs.iotsoc.model.v20190815;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.iotsoc.transform.v20190815.GetDeviceRiskStatusResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceRiskStatusResponse extends AcsResponse {

	private String requestId;

	private String code;

	private Data data;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private String riskLevel;

		private List<RiskInfo> riskInfoList;

		private Device device;

		public String getRiskLevel() {
			return this.riskLevel;
		}

		public void setRiskLevel(String riskLevel) {
			this.riskLevel = riskLevel;
		}

		public List<RiskInfo> getRiskInfoList() {
			return this.riskInfoList;
		}

		public void setRiskInfoList(List<RiskInfo> riskInfoList) {
			this.riskInfoList = riskInfoList;
		}

		public Device getDevice() {
			return this.device;
		}

		public void setDevice(Device device) {
			this.device = device;
		}

		public static class RiskInfo {

			private String riskName;

			private String description;

			private Integer score;

			public String getRiskName() {
				return this.riskName;
			}

			public void setRiskName(String riskName) {
				this.riskName = riskName;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public Integer getScore() {
				return this.score;
			}

			public void setScore(Integer score) {
				this.score = score;
			}
		}

		public static class Device {

			private String productKey;

			private String deviceName;

			public String getProductKey() {
				return this.productKey;
			}

			public void setProductKey(String productKey) {
				this.productKey = productKey;
			}

			public String getDeviceName() {
				return this.deviceName;
			}

			public void setDeviceName(String deviceName) {
				this.deviceName = deviceName;
			}
		}
	}

	@Override
	public GetDeviceRiskStatusResponse getInstance(UnmarshallerContext context) {
		return	GetDeviceRiskStatusResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
