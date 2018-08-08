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

package com.aliyuncs.ecs.model.v20140526;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecs.transform.v20140526.DescribeEniMonitorDataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeEniMonitorDataResponse extends AcsResponse {

	private String requestId;

	private Integer totalCount;

	private List<EniMonitorData> monitorData;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<EniMonitorData> getMonitorData() {
		return this.monitorData;
	}

	public void setMonitorData(List<EniMonitorData> monitorData) {
		this.monitorData = monitorData;
	}

	public static class EniMonitorData {

		private String eniId;

		private String timeStamp;

		private String packetTx;

		private String packetRx;

		private String intranetTx;

		private String intranetRx;

		private String dropPacketTx;

		private String dropPacketRx;

		public String getEniId() {
			return this.eniId;
		}

		public void setEniId(String eniId) {
			this.eniId = eniId;
		}

		public String getTimeStamp() {
			return this.timeStamp;
		}

		public void setTimeStamp(String timeStamp) {
			this.timeStamp = timeStamp;
		}

		public String getPacketTx() {
			return this.packetTx;
		}

		public void setPacketTx(String packetTx) {
			this.packetTx = packetTx;
		}

		public String getPacketRx() {
			return this.packetRx;
		}

		public void setPacketRx(String packetRx) {
			this.packetRx = packetRx;
		}

		public String getIntranetTx() {
			return this.intranetTx;
		}

		public void setIntranetTx(String intranetTx) {
			this.intranetTx = intranetTx;
		}

		public String getIntranetRx() {
			return this.intranetRx;
		}

		public void setIntranetRx(String intranetRx) {
			this.intranetRx = intranetRx;
		}

		public String getDropPacketTx() {
			return this.dropPacketTx;
		}

		public void setDropPacketTx(String dropPacketTx) {
			this.dropPacketTx = dropPacketTx;
		}

		public String getDropPacketRx() {
			return this.dropPacketRx;
		}

		public void setDropPacketRx(String dropPacketRx) {
			this.dropPacketRx = dropPacketRx;
		}
	}

	@Override
	public DescribeEniMonitorDataResponse getInstance(UnmarshallerContext context) {
		return	DescribeEniMonitorDataResponseUnmarshaller.unmarshall(this, context);
	}
}
