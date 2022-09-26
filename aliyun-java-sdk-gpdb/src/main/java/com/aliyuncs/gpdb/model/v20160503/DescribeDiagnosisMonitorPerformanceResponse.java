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

package com.aliyuncs.gpdb.model.v20160503;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.gpdb.transform.v20160503.DescribeDiagnosisMonitorPerformanceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeDiagnosisMonitorPerformanceResponse extends AcsResponse {

	private String requestId;

	private Integer performancesThreshold;

	private Boolean performancesTruncated;

	private List<Item> performances;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

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

	public List<Item> getPerformances() {
		return this.performances;
	}

	public void setPerformances(List<Item> performances) {
		this.performances = performances;
	}

	public static class Item {

		private String queryID;

		private Long startTime;

		private Integer cost;

		private String status;

		private String user;

		private String database;

		public String getQueryID() {
			return this.queryID;
		}

		public void setQueryID(String queryID) {
			this.queryID = queryID;
		}

		public Long getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Long startTime) {
			this.startTime = startTime;
		}

		public Integer getCost() {
			return this.cost;
		}

		public void setCost(Integer cost) {
			this.cost = cost;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getUser() {
			return this.user;
		}

		public void setUser(String user) {
			this.user = user;
		}

		public String getDatabase() {
			return this.database;
		}

		public void setDatabase(String database) {
			this.database = database;
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
