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
import com.aliyuncs.linkwan.transform.v20181230.GetLabNodeDownlinkConfigResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetLabNodeDownlinkConfigResponse extends AcsResponse {

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

		private String devAddr;

		private Float fCnt;

		private Float fPort;

		private String mic;

		private FCtrl fCtrl;

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

		public String getDevAddr() {
			return this.devAddr;
		}

		public void setDevAddr(String devAddr) {
			this.devAddr = devAddr;
		}

		public Float getFCnt() {
			return this.fCnt;
		}

		public void setFCnt(Float fCnt) {
			this.fCnt = fCnt;
		}

		public Float getFPort() {
			return this.fPort;
		}

		public void setFPort(Float fPort) {
			this.fPort = fPort;
		}

		public String getMic() {
			return this.mic;
		}

		public void setMic(String mic) {
			this.mic = mic;
		}

		public FCtrl getFCtrl() {
			return this.fCtrl;
		}

		public void setFCtrl(FCtrl fCtrl) {
			this.fCtrl = fCtrl;
		}

		public static class FCtrl {

			private Boolean adr;

			private Boolean rfuAdrAckReq;

			private Boolean ack;

			private Boolean fPendingRfu;

			private Float fOptsLen;

			public Boolean getAdr() {
				return this.adr;
			}

			public void setAdr(Boolean adr) {
				this.adr = adr;
			}

			public Boolean getRfuAdrAckReq() {
				return this.rfuAdrAckReq;
			}

			public void setRfuAdrAckReq(Boolean rfuAdrAckReq) {
				this.rfuAdrAckReq = rfuAdrAckReq;
			}

			public Boolean getAck() {
				return this.ack;
			}

			public void setAck(Boolean ack) {
				this.ack = ack;
			}

			public Boolean getFPendingRfu() {
				return this.fPendingRfu;
			}

			public void setFPendingRfu(Boolean fPendingRfu) {
				this.fPendingRfu = fPendingRfu;
			}

			public Float getFOptsLen() {
				return this.fOptsLen;
			}

			public void setFOptsLen(Float fOptsLen) {
				this.fOptsLen = fOptsLen;
			}
		}
	}

	@Override
	public GetLabNodeDownlinkConfigResponse getInstance(UnmarshallerContext context) {
		return	GetLabNodeDownlinkConfigResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
