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

package com.aliyuncs.linkwan.model.v20190301;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.linkwan.transform.v20190301.ListTransferPacketResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListTransferPacketResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String errorMessage;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Long totalCount;

		private List<Packet> list;

		public Long getTotalCount() {
			return this.totalCount;
		}

		public void setTotalCount(Long totalCount) {
			this.totalCount = totalCount;
		}

		public List<Packet> getList() {
			return this.list;
		}

		public void setList(List<Packet> list) {
			this.list = list;
		}

		public static class Packet {

			private String gwEui;

			private String devEui;

			private String devAddr;

			private Float freq;

			private String datr;

			private String classMode;

			private Integer rssi;

			private Float lsnr;

			private Integer fPort;

			private Long freqBandPlanGroupId;

			private Long logMillis;

			private Boolean hasMacCommand;

			private Boolean hasData;

			private String base64EncodedMacPayload;

			private Long macPayloadSize;

			private String processEvent;

			private String messageType;

			private Long fcntDown;

			private Long fcntUp;

			public String getGwEui() {
				return this.gwEui;
			}

			public void setGwEui(String gwEui) {
				this.gwEui = gwEui;
			}

			public String getDevEui() {
				return this.devEui;
			}

			public void setDevEui(String devEui) {
				this.devEui = devEui;
			}

			public String getDevAddr() {
				return this.devAddr;
			}

			public void setDevAddr(String devAddr) {
				this.devAddr = devAddr;
			}

			public Float getFreq() {
				return this.freq;
			}

			public void setFreq(Float freq) {
				this.freq = freq;
			}

			public String getDatr() {
				return this.datr;
			}

			public void setDatr(String datr) {
				this.datr = datr;
			}

			public String getClassMode() {
				return this.classMode;
			}

			public void setClassMode(String classMode) {
				this.classMode = classMode;
			}

			public Integer getRssi() {
				return this.rssi;
			}

			public void setRssi(Integer rssi) {
				this.rssi = rssi;
			}

			public Float getLsnr() {
				return this.lsnr;
			}

			public void setLsnr(Float lsnr) {
				this.lsnr = lsnr;
			}

			public Integer getFPort() {
				return this.fPort;
			}

			public void setFPort(Integer fPort) {
				this.fPort = fPort;
			}

			public Long getFreqBandPlanGroupId() {
				return this.freqBandPlanGroupId;
			}

			public void setFreqBandPlanGroupId(Long freqBandPlanGroupId) {
				this.freqBandPlanGroupId = freqBandPlanGroupId;
			}

			public Long getLogMillis() {
				return this.logMillis;
			}

			public void setLogMillis(Long logMillis) {
				this.logMillis = logMillis;
			}

			public Boolean getHasMacCommand() {
				return this.hasMacCommand;
			}

			public void setHasMacCommand(Boolean hasMacCommand) {
				this.hasMacCommand = hasMacCommand;
			}

			public Boolean getHasData() {
				return this.hasData;
			}

			public void setHasData(Boolean hasData) {
				this.hasData = hasData;
			}

			public String getBase64EncodedMacPayload() {
				return this.base64EncodedMacPayload;
			}

			public void setBase64EncodedMacPayload(String base64EncodedMacPayload) {
				this.base64EncodedMacPayload = base64EncodedMacPayload;
			}

			public Long getMacPayloadSize() {
				return this.macPayloadSize;
			}

			public void setMacPayloadSize(Long macPayloadSize) {
				this.macPayloadSize = macPayloadSize;
			}

			public String getProcessEvent() {
				return this.processEvent;
			}

			public void setProcessEvent(String processEvent) {
				this.processEvent = processEvent;
			}

			public String getMessageType() {
				return this.messageType;
			}

			public void setMessageType(String messageType) {
				this.messageType = messageType;
			}

			public Long getFcntDown() {
				return this.fcntDown;
			}

			public void setFcntDown(Long fcntDown) {
				this.fcntDown = fcntDown;
			}

			public Long getFcntUp() {
				return this.fcntUp;
			}

			public void setFcntUp(Long fcntUp) {
				this.fcntUp = fcntUp;
			}
		}
	}

	@Override
	public ListTransferPacketResponse getInstance(UnmarshallerContext context) {
		return	ListTransferPacketResponseUnmarshaller.unmarshall(this, context);
	}
}
