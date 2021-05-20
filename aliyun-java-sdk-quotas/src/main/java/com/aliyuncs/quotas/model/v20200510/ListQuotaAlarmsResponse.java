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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.quotas.transform.v20200510.ListQuotaAlarmsResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListQuotaAlarmsResponse extends AcsResponse {

	private Integer totalCount;

	private String requestId;

	private String nextToken;

	private Integer maxResults;

	private List<QuotaAlarm> quotaAlarms;

	public Integer getTotalCount() {
		return this.totalCount;
	}

	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}

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

	public List<QuotaAlarm> getQuotaAlarms() {
		return this.quotaAlarms;
	}

	public void setQuotaAlarms(List<QuotaAlarm> quotaAlarms) {
		this.quotaAlarms = quotaAlarms;
	}

	public static class QuotaAlarm {

		private String alarmId;

		private Map<Object,Object> quotaDimensions;

		private Float thresholdPercent;

		private String productCode;

		private String createTime;

		private String webHook;

		private Float quotaUsage;

		private Boolean exceedThreshold;

		private String quotaActionCode;

		private Float quotaValue;

		private String alarmName;

		private String notifyTarget;

		private Float threshold;

		private String thresholdType;

		private List<String> notifyChannels;

		public String getAlarmId() {
			return this.alarmId;
		}

		public void setAlarmId(String alarmId) {
			this.alarmId = alarmId;
		}

		public Map<Object,Object> getQuotaDimensions() {
			return this.quotaDimensions;
		}

		public void setQuotaDimensions(Map<Object,Object> quotaDimensions) {
			this.quotaDimensions = quotaDimensions;
		}

		public Float getThresholdPercent() {
			return this.thresholdPercent;
		}

		public void setThresholdPercent(Float thresholdPercent) {
			this.thresholdPercent = thresholdPercent;
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

		public String getWebHook() {
			return this.webHook;
		}

		public void setWebHook(String webHook) {
			this.webHook = webHook;
		}

		public Float getQuotaUsage() {
			return this.quotaUsage;
		}

		public void setQuotaUsage(Float quotaUsage) {
			this.quotaUsage = quotaUsage;
		}

		public Boolean getExceedThreshold() {
			return this.exceedThreshold;
		}

		public void setExceedThreshold(Boolean exceedThreshold) {
			this.exceedThreshold = exceedThreshold;
		}

		public String getQuotaActionCode() {
			return this.quotaActionCode;
		}

		public void setQuotaActionCode(String quotaActionCode) {
			this.quotaActionCode = quotaActionCode;
		}

		public Float getQuotaValue() {
			return this.quotaValue;
		}

		public void setQuotaValue(Float quotaValue) {
			this.quotaValue = quotaValue;
		}

		public String getAlarmName() {
			return this.alarmName;
		}

		public void setAlarmName(String alarmName) {
			this.alarmName = alarmName;
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

		public String getThresholdType() {
			return this.thresholdType;
		}

		public void setThresholdType(String thresholdType) {
			this.thresholdType = thresholdType;
		}

		public List<String> getNotifyChannels() {
			return this.notifyChannels;
		}

		public void setNotifyChannels(List<String> notifyChannels) {
			this.notifyChannels = notifyChannels;
		}
	}

	@Override
	public ListQuotaAlarmsResponse getInstance(UnmarshallerContext context) {
		return	ListQuotaAlarmsResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
