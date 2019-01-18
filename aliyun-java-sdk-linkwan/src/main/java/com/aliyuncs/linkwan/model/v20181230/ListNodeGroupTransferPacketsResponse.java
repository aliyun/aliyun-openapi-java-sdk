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
import com.aliyuncs.linkwan.transform.v20181230.ListNodeGroupTransferPacketsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListNodeGroupTransferPacketsResponse extends AcsResponse {

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

			private String devAddr;

			private Float freq;

			private String datr;

			private String classMode;

			private Integer rssi;

			private Float lsnr;

			private Integer fPort;

			private String gwOwnerAliyunId;

			private Long freqBandPlanGroupId;

			private Long logMillis;

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

			public String getGwOwnerAliyunId() {
				return this.gwOwnerAliyunId;
			}

			public void setGwOwnerAliyunId(String gwOwnerAliyunId) {
				this.gwOwnerAliyunId = gwOwnerAliyunId;
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
		}
	}

	@Override
	public ListNodeGroupTransferPacketsResponse getInstance(UnmarshallerContext context) {
		return	ListNodeGroupTransferPacketsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
