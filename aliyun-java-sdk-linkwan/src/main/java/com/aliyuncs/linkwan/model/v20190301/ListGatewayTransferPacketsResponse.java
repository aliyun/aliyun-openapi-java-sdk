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
import com.aliyuncs.linkwan.transform.v20190301.ListGatewayTransferPacketsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListGatewayTransferPacketsResponse extends AcsResponse {

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

			private String logMillis;

			private String devAddr;

			private String freq;

			private String datr;

			private String classMode;

			private Integer rssi;

			private Float lsnr;

			private Integer fPort;

			private Boolean hasMacCommand;

			private Boolean hasData;

			private String base64EncodedMacPayload;

			private Long macPayloadSize;

			private String processEvent;

			private String messageType;

			private String nodeOwnerAliyunId;

			private List<String> macCommandCIDs;

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

			public String getLogMillis() {
				return this.logMillis;
			}

			public void setLogMillis(String logMillis) {
				this.logMillis = logMillis;
			}

			public String getDevAddr() {
				return this.devAddr;
			}

			public void setDevAddr(String devAddr) {
				this.devAddr = devAddr;
			}

			public String getFreq() {
				return this.freq;
			}

			public void setFreq(String freq) {
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

			public String getNodeOwnerAliyunId() {
				return this.nodeOwnerAliyunId;
			}

			public void setNodeOwnerAliyunId(String nodeOwnerAliyunId) {
				this.nodeOwnerAliyunId = nodeOwnerAliyunId;
			}

			public List<String> getMacCommandCIDs() {
				return this.macCommandCIDs;
			}

			public void setMacCommandCIDs(List<String> macCommandCIDs) {
				this.macCommandCIDs = macCommandCIDs;
			}
		}
	}

	@Override
	public ListGatewayTransferPacketsResponse getInstance(UnmarshallerContext context) {
		return	ListGatewayTransferPacketsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
