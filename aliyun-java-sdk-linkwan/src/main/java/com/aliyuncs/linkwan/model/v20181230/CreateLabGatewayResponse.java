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

package com.aliyuncs.linkwan.model.v20181230;

import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.CreateLabGatewayResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateLabGatewayResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Data data;

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

		private String gwEui;

		private String name;

		private String iotHubProductKey;

		private String iotHubDeviceName;

		private String iotHubDeviceSecret;

		private String onlineState;

		private Long boundNodesCount;

		private Long freqBandPlanGroupId;

		private Long createMillis;

		public String getGwEui() {
			return this.gwEui;
		}

		public void setGwEui(String gwEui) {
			this.gwEui = gwEui;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getIotHubProductKey() {
			return this.iotHubProductKey;
		}

		public void setIotHubProductKey(String iotHubProductKey) {
			this.iotHubProductKey = iotHubProductKey;
		}

		public String getIotHubDeviceName() {
			return this.iotHubDeviceName;
		}

		public void setIotHubDeviceName(String iotHubDeviceName) {
			this.iotHubDeviceName = iotHubDeviceName;
		}

		public String getIotHubDeviceSecret() {
			return this.iotHubDeviceSecret;
		}

		public void setIotHubDeviceSecret(String iotHubDeviceSecret) {
			this.iotHubDeviceSecret = iotHubDeviceSecret;
		}

		public String getOnlineState() {
			return this.onlineState;
		}

		public void setOnlineState(String onlineState) {
			this.onlineState = onlineState;
		}

		public Long getBoundNodesCount() {
			return this.boundNodesCount;
		}

		public void setBoundNodesCount(Long boundNodesCount) {
			this.boundNodesCount = boundNodesCount;
		}

		public Long getFreqBandPlanGroupId() {
			return this.freqBandPlanGroupId;
		}

		public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
			this.freqBandPlanGroupId = freqBandPlanGroupId;
		}

		public Long getCreateMillis() {
			return this.createMillis;
		}

		public void setCreateMillis(Long createMillis) {
			this.createMillis = createMillis;
		}
	}

	@Override
	public CreateLabGatewayResponse getInstance(UnmarshallerContext context) {
		return	CreateLabGatewayResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
