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
import com.aliyuncs.quotas.transform.v20200510.GetQuotaAlarmResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetQuotaAlarmResponse extends AcsResponse {

	private String requestId;

	private QuotaAlarm quotaAlarm;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public QuotaAlarm getQuotaAlarm() {
		return this.quotaAlarm;
	}

	public void setQuotaAlarm(QuotaAlarm quotaAlarm) {
		this.quotaAlarm = quotaAlarm;
	}

	public static class QuotaAlarm {

		private String alarmId;

		private String quotaActionCode;

		private Float quotaValue;

		private Float thresholdPercent;

		private String alarmName;

		private String productCode;

		private String notifyTarget;

		private String createTime;

		private Map<Object,Object> quotaDimension;

		private Float quotaUsage;

		private Float threshold;

		private String thresholdType;

		private List<String> notifyChannels;

		public String getAlarmId() {
			return this.alarmId;
		}

		public void setAlarmId(String alarmId) {
			this.alarmId = alarmId;
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

		public Float getThresholdPercent() {
			return this.thresholdPercent;
		}

		public void setThresholdPercent(Float thresholdPercent) {
			this.thresholdPercent = thresholdPercent;
		}

		public String getAlarmName() {
			return this.alarmName;
		}

		public void setAlarmName(String alarmName) {
			this.alarmName = alarmName;
		}

		public String getProductCode() {
			return this.productCode;
		}

		public void setProductCode(String productCode) {
			this.productCode = productCode;
		}

		public String getNotifyTarget() {
			return this.notifyTarget;
		}

		public void setNotifyTarget(String notifyTarget) {
			this.notifyTarget = notifyTarget;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public Map<Object,Object> getQuotaDimension() {
			return this.quotaDimension;
		}

		public void setQuotaDimension(Map<Object,Object> quotaDimension) {
			this.quotaDimension = quotaDimension;
		}

		public Float getQuotaUsage() {
			return this.quotaUsage;
		}

		public void setQuotaUsage(Float quotaUsage) {
			this.quotaUsage = quotaUsage;
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
	public GetQuotaAlarmResponse getInstance(UnmarshallerContext context) {
		return	GetQuotaAlarmResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
