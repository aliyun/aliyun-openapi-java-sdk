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

package com.aliyuncs.quotas.model.v20200510;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quotas.transform.v20200510.ListAlarmHistoriesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListAlarmHistoriesResponse extends AcsResponse {

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private Integer totalCount;

	private List<AlarmHistory> alarmHistories;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
	}

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

	public List<AlarmHistory> getAlarmHistories() {
		return this.alarmHistories;
	}

	public void setAlarmHistories(List<AlarmHistory> alarmHistories) {
		this.alarmHistories = alarmHistories;
	}

	public static class AlarmHistory {

		private String alarmName;

		private Float quotaUsage;

		private String productCode;

		private String createTime;

		private String notifyTarget;

		private Float threshold;

		private Float thresholdPercent;

		private String quotaActionCode;

		private List<String> notifyChannels;

		public String getAlarmName() {
			return this.alarmName;
		}

		public void setAlarmName(String alarmName) {
			this.alarmName = alarmName;
		}

		public Float getQuotaUsage() {
			return this.quotaUsage;
		}

		public void setQuotaUsage(Float quotaUsage) {
			this.quotaUsage = quotaUsage;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getNotifyTarget() {
			return this.notifyTarget;
		}

		public void setNotifyTarget(String notifyTarget) {
			this.notifyTarget = notifyTarget;
		}

		public Float getThreshold() {
			return this.threshold;
		}

		public void setThreshold(Float threshold) {
			this.threshold = threshold;
		}

		public Float getThresholdPercent() {
			return this.thresholdPercent;
		}

		public void setThresholdPercent(Float thresholdPercent) {
			this.thresholdPercent = thresholdPercent;
		}

		public String getQuotaActionCode() {
			return this.quotaActionCode;
		}

		public void setQuotaActionCode(String quotaActionCode) {
			this.quotaActionCode = quotaActionCode;
		}

		public List<String> getNotifyChannels() {
			return this.notifyChannels;
		}

		public void setNotifyChannels(List<String> notifyChannels) {
			this.notifyChannels = notifyChannels;
		}
	}

	@Override
	public ListAlarmHistoriesResponse getInstance(UnmarshallerContext context) {
		return	ListAlarmHistoriesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
