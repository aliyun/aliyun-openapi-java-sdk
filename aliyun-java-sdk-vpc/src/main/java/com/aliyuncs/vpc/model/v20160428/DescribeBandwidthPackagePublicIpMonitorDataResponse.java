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

package com.aliyuncs.vpc.model.v20160428;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vpc.transform.v20160428.DescribeBandwidthPackagePublicIpMonitorDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBandwidthPackagePublicIpMonitorDataResponse extends AcsResponse {

	private String requestId;

	private List<MonitorData> monitorDatas;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<MonitorData> getMonitorDatas() {
		return this.monitorDatas;
	}

	public void setMonitorDatas(List<MonitorData> monitorDatas) {
		this.monitorDatas = monitorDatas;
	}

	public static class MonitorData {

		private Long rX;

		private Long tX;

		private Long receivedBandwidth;

		private Long transportedBandwidth;

		private Long flow;

		private Long bandwidth;

		private Long packets;

		private String timeStamp;

		public Long getRX() {
			return this.rX;
		}

		public void setRX(Long rX) {
			this.rX = rX;
		}

		public Long getTX() {
			return this.tX;
		}

		public void setTX(Long tX) {
			this.tX = tX;
		}

		public Long getReceivedBandwidth() {
			return this.receivedBandwidth;
		}

		public void setReceivedBandwidth(Long receivedBandwidth) {
			this.receivedBandwidth = receivedBandwidth;
		}

		public Long getTransportedBandwidth() {
			return this.transportedBandwidth;
		}

		public void setTransportedBandwidth(Long transportedBandwidth) {
			this.transportedBandwidth = transportedBandwidth;
		}

		public Long getFlow() {
			return this.flow;
		}

		public void setFlow(Long flow) {
			this.flow = flow;
		}

		public Long getBandwidth() {
			return this.bandwidth;
		}

		public void setBandwidth(Long bandwidth) {
			this.bandwidth = bandwidth;
		}

		public Long getPackets() {
			return this.packets;
		}

		public void setPackets(Long packets) {
			this.packets = packets;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}
	}

	@Override
	public DescribeBandwidthPackagePublicIpMonitorDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeBandwidthPackagePublicIpMonitorDataResponseUnmarshaller.unmarshall(this, context);
	}
}
