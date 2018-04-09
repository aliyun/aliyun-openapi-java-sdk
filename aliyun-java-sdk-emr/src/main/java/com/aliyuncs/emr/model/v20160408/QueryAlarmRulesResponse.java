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

package com.aliyuncs.emr.model.v20160408;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.QueryAlarmRulesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class QueryAlarmRulesResponse extends AcsResponse {

	private String requestId;

	private List<Alarm> alarmList;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<Alarm> getAlarmList() {
		return this.alarmList;
	}

	public void setAlarmList(List<Alarm> alarmList) {
		this.alarmList = alarmList;
	}

	public static class Alarm {

		private String name;

		private String metricName;

		private Integer period;

		private String threshold;

		private Integer evaluationCount;

		private Integer startTime;

		private Integer endTime;

		private Integer silenceTime;

		private Integer notifyType;

		private Boolean enable;

		private String state;

		private String comparisonOperator;

		private String contactGroups;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getMetricName() {
			return this.metricName;
		}

		public void setMetricName(String metricName) {
			this.metricName = metricName;
		}

		public Integer getPeriod() {
			return this.period;
		}

		public void setPeriod(Integer period) {
			this.period = period;
		}

		public String getThreshold() {
			return this.threshold;
		}

		public void setThreshold(String threshold) {
			this.threshold = threshold;
		}

		public Integer getEvaluationCount() {
			return this.evaluationCount;
		}

		public void setEvaluationCount(Integer evaluationCount) {
			this.evaluationCount = evaluationCount;
		}

		public Integer getStartTime() {
			return this.startTime;
		}

		public void setStartTime(Integer startTime) {
			this.startTime = startTime;
		}

		public Integer getEndTime() {
			return this.endTime;
		}

		public void setEndTime(Integer endTime) {
			this.endTime = endTime;
		}

		public Integer getSilenceTime() {
			return this.silenceTime;
		}

		public void setSilenceTime(Integer silenceTime) {
			this.silenceTime = silenceTime;
		}

		public Integer getNotifyType() {
			return this.notifyType;
		}

		public void setNotifyType(Integer notifyType) {
			this.notifyType = notifyType;
		}

		public Boolean getEnable() {
			return this.enable;
		}

		public void setEnable(Boolean enable) {
			this.enable = enable;
		}

		public String getState() {
			return this.state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getComparisonOperator() {
			return this.comparisonOperator;
		}

		public void setComparisonOperator(String comparisonOperator) {
			this.comparisonOperator = comparisonOperator;
		}

		public String getContactGroups() {
			return this.contactGroups;
		}

		public void setContactGroups(String contactGroups) {
			this.contactGroups = contactGroups;
		}
	}

	@Override
	public QueryAlarmRulesResponse getInstance(UnmarshallerContext context) {
		return	QueryAlarmRulesResponseUnmarshaller.unmarshall(this, context);
	}
}
