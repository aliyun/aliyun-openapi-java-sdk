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

package com.aliyuncs.ecsops.model.v20160401;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ecsops.transform.v20160401.OpsQueryHighRiskEventsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryHighRiskEventsResponse extends AcsResponse {

	private String endTime;

	private String requestId;

	private String startTime;

	private String ncIps;

	private List<HighRiskMetricData> highRiskReleaseList;

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getNcIps() {
		return this.ncIps;
	}

	public void setNcIps(String ncIps) {
		this.ncIps = ncIps;
	}

	public List<HighRiskMetricData> getHighRiskReleaseList() {
		return this.highRiskReleaseList;
	}

	public void setHighRiskReleaseList(List<HighRiskMetricData> highRiskReleaseList) {
		this.highRiskReleaseList = highRiskReleaseList;
	}

	public static class HighRiskMetricData {

		private String metricName;

		private String highRiskEvent;

		private String timestamp;

		private String ncIp;

		private String remarks;

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public String getHighRiskEvent() {
			return this.highRiskEvent;
		}

		public void setHighRiskEvent(String highRiskEvent) {
			this.highRiskEvent = highRiskEvent;
		}

		public String getTimestamp() {
			return this.timestamp;
		}

		public void setTimestamp(String timestamp) {
			this.timestamp = timestamp;
		}

		public String getNcIp() {
			return this.ncIp;
		}

		public void setNcIp(String ncIp) {
			this.ncIp = ncIp;
		}

		public String getRemarks() {
			return this.remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
	}

	@Override
	public OpsQueryHighRiskEventsResponse getInstance(UnmarshallerContext context) {
		return	OpsQueryHighRiskEventsResponseUnmarshaller.unmarshall(this, context);
	}
}
