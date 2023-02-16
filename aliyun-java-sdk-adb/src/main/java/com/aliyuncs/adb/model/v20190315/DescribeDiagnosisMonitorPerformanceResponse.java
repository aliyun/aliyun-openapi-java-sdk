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

package com.aliyuncs.adb.model.v20190315;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.adb.transform.v20190315.DescribeDiagnosisMonitorPerformanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosisMonitorPerformanceResponse extends AcsResponse {

	private Integer performancesThreshold;

	private Boolean performancesTruncated;

	private String requestId;

	private List<Items> performances;

	public Integer getPerformancesThreshold() {
		return this.performancesThreshold;
	}

	public void setPerformancesThreshold(Integer performancesThreshold) {
		this.performancesThreshold = performancesThreshold;
	}

	public Boolean getPerformancesTruncated() {
		return this.performancesTruncated;
	}

	public void setPerformancesTruncated(Boolean performancesTruncated) {
		this.performancesTruncated = performancesTruncated;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Items> getPerformances() {
		return this.performances;
	}

	public void setPerformances(List<Items> performances) {
		this.performances = performances;
	}

	public static class Items {

		private String status;

		private String processId;

		private Long startTime;

		private Long cost;

		private Long scanRows;

		private Long peakMemory;

		private String rcHost;

		private Long scanSize;

		private String userName;

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getProcessId() {
			return this.processId;
		}

		public void setProcessId(String processId) {
			this.processId = processId;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Long getCost() {
			return this.cost;
		}

		public void setCost(Long cost) {
			this.cost = cost;
		}

		public Long getScanRows() {
			return this.scanRows;
		}

		public void setScanRows(Long scanRows) {
			this.scanRows = scanRows;
		}

		public Long getPeakMemory() {
			return this.peakMemory;
		}

		public void setPeakMemory(Long peakMemory) {
			this.peakMemory = peakMemory;
		}

		public String getRcHost() {
			return this.rcHost;
		}

		public void setRcHost(String rcHost) {
			this.rcHost = rcHost;
		}

		public Long getScanSize() {
			return this.scanSize;
		}

		public void setScanSize(Long scanSize) {
			this.scanSize = scanSize;
		}

		public String getUserName() {
			return this.userName;
		}

		public void setUserName(String userName) {
			this.userName = userName;
		}
	}

	@Override
	public DescribeDiagnosisMonitorPerformanceResponse getInstance(UnmarshallerContext context) {
		return	DescribeDiagnosisMonitorPerformanceResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
