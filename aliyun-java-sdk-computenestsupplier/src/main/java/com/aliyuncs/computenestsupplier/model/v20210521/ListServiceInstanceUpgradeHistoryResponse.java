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

package com.aliyuncs.computenestsupplier.model.v20210521;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.computenestsupplier.transform.v20210521.ListServiceInstanceUpgradeHistoryResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListServiceInstanceUpgradeHistoryResponse extends AcsResponse {

	private String nextToken;

	private String requestId;

	private String maxResults;

	private Long totalCount;

	private List<ServiceInstanceLogs> upgradeHistory;

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
	}

	public Long getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public List<ServiceInstanceLogs> getUpgradeHistory() {
		return this.upgradeHistory;
	}

	public void setUpgradeHistory(List<ServiceInstanceLogs> upgradeHistory) {
		this.upgradeHistory = upgradeHistory;
	}

	public static class ServiceInstanceLogs {

		private String upgradeHistoryId;

		private String type;

		private String fromVersion;

		private String toVersion;

		private String status;

		private String results;

		private String startTime;

		private String endTime;

		public String getUpgradeHistoryId() {
			return this.upgradeHistoryId;
		}

		public void setUpgradeHistoryId(String upgradeHistoryId) {
			this.upgradeHistoryId = upgradeHistoryId;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getFromVersion() {
			return this.fromVersion;
		}

		public void setFromVersion(String fromVersion) {
			this.fromVersion = fromVersion;
		}

		public String getToVersion() {
			return this.toVersion;
		}

		public void setToVersion(String toVersion) {
			this.toVersion = toVersion;
		}

		public String getStatus() {
			return this.status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getResults() {
			return this.results;
		}

		public void setResults(String results) {
			this.results = results;
		}

		public String getStartTime() {
			return this.startTime;
		}

		public void setStartTime(String startTime) {
			this.startTime = startTime;
		}

		public String getEndTime() {
			return this.endTime;
		}

		public void setEndTime(String endTime) {
			this.endTime = endTime;
		}
	}

	@Override
	public ListServiceInstanceUpgradeHistoryResponse getInstance(UnmarshallerContext context) {
		return	ListServiceInstanceUpgradeHistoryResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
