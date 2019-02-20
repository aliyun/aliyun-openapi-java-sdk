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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20181230.GetLabNodeJoinAcceptConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLabNodeJoinAcceptConfigResponse extends AcsResponse {

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

		private String mType;

		private String rfu;

		private String major;

		private String appNonce;

		private String netId;

		private String devAddr;

		private Integer rxDelay;

		private String cfList;

		private String mic;

		private DownlinkSetting downlinkSetting;

		public String getMType() {
			return this.mType;
		}

		public void setMType(String mType) {
			this.mType = mType;
		}

		public String getRfu() {
			return this.rfu;
		}

		public void setRfu(String rfu) {
			this.rfu = rfu;
		}

		public String getMajor() {
			return this.major;
		}

		public void setMajor(String major) {
			this.major = major;
		}

		public String getAppNonce() {
			return this.appNonce;
		}

		public void setAppNonce(String appNonce) {
			this.appNonce = appNonce;
		}

		public String getNetId() {
			return this.netId;
		}

		public void setNetId(String netId) {
			this.netId = netId;
		}

		public String getDevAddr() {
			return this.devAddr;
		}

		public void setDevAddr(String devAddr) {
			this.devAddr = devAddr;
		}

		public Integer getRxDelay() {
			return this.rxDelay;
		}

		public void setRxDelay(Integer rxDelay) {
			this.rxDelay = rxDelay;
		}

		public String getCfList() {
			return this.cfList;
		}

		public void setCfList(String cfList) {
			this.cfList = cfList;
		}

		public String getMic() {
			return this.mic;
		}

		public void setMic(String mic) {
			this.mic = mic;
		}

		public DownlinkSetting getDownlinkSetting() {
			return this.downlinkSetting;
		}

		public void setDownlinkSetting(DownlinkSetting downlinkSetting) {
			this.downlinkSetting = downlinkSetting;
		}

		public static class DownlinkSetting {

			private String rfu;

			private Float rx1DrOffset;

			private Float rx2DataRate;

			public String getRfu() {
				return this.rfu;
			}

			public void setRfu(String rfu) {
				this.rfu = rfu;
			}

			public Float getRx1DrOffset() {
				return this.rx1DrOffset;
			}

			public void setRx1DrOffset(Float rx1DrOffset) {
				this.rx1DrOffset = rx1DrOffset;
			}

			public Float getRx2DataRate() {
				return this.rx2DataRate;
			}

			public void setRx2DataRate(Float rx2DataRate) {
				this.rx2DataRate = rx2DataRate;
			}
		}
	}

	@Override
	public GetLabNodeJoinAcceptConfigResponse getInstance(UnmarshallerContext context) {
		return	GetLabNodeJoinAcceptConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
