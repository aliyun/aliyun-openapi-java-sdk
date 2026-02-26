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

package com.aliyuncs.alikafka.model.v20190916;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.alikafka.transform.v20190916.GetAutoScalingConfigurationResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetAutoScalingConfigurationResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private Long code;

	private String message;

	private Data data;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Long getCode() {
		return this.code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private List<ScheduledScalingRulesItem> scheduledScalingRules;

		public List<ScheduledScalingRulesItem> getScheduledScalingRules() {
			return this.scheduledScalingRules;
		}

		public void setScheduledScalingRules(List<ScheduledScalingRulesItem> scheduledScalingRules) {
			this.scheduledScalingRules = scheduledScalingRules;
		}

		public static class ScheduledScalingRulesItem {

			private Long durationMinutes;

			private Boolean enable;

			private Long estimatedElasticScalingDownTimeSecs;

			private Long estimatedElasticScalingUpTimeSecs;

			private Long firstScheduledTime;

			private String repeatType;

			private Long reservedPubFlow;

			private Long reservedSubFlow;

			private Long ruleId;

			private String ruleName;

			private String scheduleType;

			private String timeZone;

			private List<String> weeklyTypes;

			public Long getDurationMinutes() {
				return this.durationMinutes;
			}

			public void setDurationMinutes(Long durationMinutes) {
				this.durationMinutes = durationMinutes;
			}

			public Boolean getEnable() {
				return this.enable;
			}

			public void setEnable(Boolean enable) {
				this.enable = enable;
			}

			public Long getEstimatedElasticScalingDownTimeSecs() {
				return this.estimatedElasticScalingDownTimeSecs;
			}

			public void setEstimatedElasticScalingDownTimeSecs(Long estimatedElasticScalingDownTimeSecs) {
				this.estimatedElasticScalingDownTimeSecs = estimatedElasticScalingDownTimeSecs;
			}

			public Long getEstimatedElasticScalingUpTimeSecs() {
				return this.estimatedElasticScalingUpTimeSecs;
			}

			public void setEstimatedElasticScalingUpTimeSecs(Long estimatedElasticScalingUpTimeSecs) {
				this.estimatedElasticScalingUpTimeSecs = estimatedElasticScalingUpTimeSecs;
			}

			public Long getFirstScheduledTime() {
				return this.firstScheduledTime;
			}

			public void setFirstScheduledTime(Long firstScheduledTime) {
				this.firstScheduledTime = firstScheduledTime;
			}

			public String getRepeatType() {
				return this.repeatType;
			}

			public void setRepeatType(String repeatType) {
				this.repeatType = repeatType;
			}

			public Long getReservedPubFlow() {
				return this.reservedPubFlow;
			}

			public void setReservedPubFlow(Long reservedPubFlow) {
				this.reservedPubFlow = reservedPubFlow;
			}

			public Long getReservedSubFlow() {
				return this.reservedSubFlow;
			}

			public void setReservedSubFlow(Long reservedSubFlow) {
				this.reservedSubFlow = reservedSubFlow;
			}

			public Long getRuleId() {
				return this.ruleId;
			}

			public void setRuleId(Long ruleId) {
				this.ruleId = ruleId;
			}

			public String getRuleName() {
				return this.ruleName;
			}

			public void setRuleName(String ruleName) {
				this.ruleName = ruleName;
			}

			public String getScheduleType() {
				return this.scheduleType;
			}

			public void setScheduleType(String scheduleType) {
				this.scheduleType = scheduleType;
			}

			public String getTimeZone() {
				return this.timeZone;
			}

			public void setTimeZone(String timeZone) {
				this.timeZone = timeZone;
			}

			public List<String> getWeeklyTypes() {
				return this.weeklyTypes;
			}

			public void setWeeklyTypes(List<String> weeklyTypes) {
				this.weeklyTypes = weeklyTypes;
			}
		}
	}

	@Override
	public GetAutoScalingConfigurationResponse getInstance(UnmarshallerContext context) {
		return	GetAutoScalingConfigurationResponseUnmarshaller.unmarshall(this, context);
	}
}
