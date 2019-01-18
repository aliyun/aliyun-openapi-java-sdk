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

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.ListLabGatewaysResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListLabGatewaysResponse extends AcsResponse {

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

		private Long totalCount;

		private List<LabGateway> list;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<LabGateway> getList() {
			return this.list;
		}

		public void setList(List<LabGateway> list) {
			this.list = list;
		}

		public static class LabGateway {

			private String gwEui;

			private String name;

			private String iotHubProductKey;

			private String iotHubDeviceName;

			private String iotHubDeviceSecret;

			private String onlineState;

			private String boundNodesCount;

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

			public String getBoundNodesCount() {
				return this.boundNodesCount;
			}

			public void setBoundNodesCount(String boundNodesCount) {
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
	}

	@Override
	public ListLabGatewaysResponse getInstance(UnmarshallerContext context) {
		return	ListLabGatewaysResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
