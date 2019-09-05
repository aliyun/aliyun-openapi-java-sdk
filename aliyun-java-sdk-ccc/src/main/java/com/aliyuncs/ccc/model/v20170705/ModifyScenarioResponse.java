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

package com.aliyuncs.ccc.model.v20170705;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.ModifyScenarioResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ModifyScenarioResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Scenario scenario;

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

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getHttpStatusCode() {
		return this.httpStatusCode;
	}

	public void setHttpStatusCode(Integer httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public Scenario getScenario() {
		return this.scenario;
	}

	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}

	public static class Scenario {

		private String scenarioId;

		private String scenarioName;

		private String scenarioDescription;

		private String type;

		private Boolean isTemplate;

		private List<Survey> surveys;

		private List<KeyValuePair> variables;

		private Strategy strategy;

		public String getScenarioId() {
			return this.scenarioId;
		}

		public void setScenarioId(String scenarioId) {
			this.scenarioId = scenarioId;
		}

		public String getScenarioName() {
			return this.scenarioName;
		}

		public void setScenarioName(String scenarioName) {
			this.scenarioName = scenarioName;
		}

		public String getScenarioDescription() {
			return this.scenarioDescription;
		}

		public void setScenarioDescription(String scenarioDescription) {
			this.scenarioDescription = scenarioDescription;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Boolean getIsTemplate() {
			return this.isTemplate;
		}

		public void setIsTemplate(Boolean isTemplate) {
			this.isTemplate = isTemplate;
		}

		public List<Survey> getSurveys() {
			return this.surveys;
		}

		public void setSurveys(List<Survey> surveys) {
			this.surveys = surveys;
		}

		public List<KeyValuePair> getVariables() {
			return this.variables;
		}

		public void setVariables(List<KeyValuePair> variables) {
			this.variables = variables;
		}

		public Strategy getStrategy() {
			return this.strategy;
		}

		public void setStrategy(Strategy strategy) {
			this.strategy = strategy;
		}

		public static class Survey {

			private String surveyId;

			private String surveyName;

			private String surveyDescription;

			private String role;

			private Integer round;

			private String beebotId;

			private List<IntentNode> intents;

			public String getSurveyId() {
				return this.surveyId;
			}

			public void setSurveyId(String surveyId) {
				this.surveyId = surveyId;
			}

			public String getSurveyName() {
				return this.surveyName;
			}

			public void setSurveyName(String surveyName) {
				this.surveyName = surveyName;
			}

			public String getSurveyDescription() {
				return this.surveyDescription;
			}

			public void setSurveyDescription(String surveyDescription) {
				this.surveyDescription = surveyDescription;
			}

			public String getRole() {
				return this.role;
			}

			public void setRole(String role) {
				this.role = role;
			}

			public Integer getRound() {
				return this.round;
			}

			public void setRound(Integer round) {
				this.round = round;
			}

			public String getBeebotId() {
				return this.beebotId;
			}

			public void setBeebotId(String beebotId) {
				this.beebotId = beebotId;
			}

			public List<IntentNode> getIntents() {
				return this.intents;
			}

			public void setIntents(List<IntentNode> intents) {
				this.intents = intents;
			}

			public static class IntentNode {

				private String nodeId;

				private String intentId;

				public String getNodeId() {
					return this.nodeId;
				}

				public void setNodeId(String nodeId) {
					this.nodeId = nodeId;
				}

				public String getIntentId() {
					return this.intentId;
				}

				public void setIntentId(String intentId) {
					this.intentId = intentId;
				}
			}
		}

		public static class KeyValuePair {

			private String key;

			private String value;

			public String getKey() {
				return this.key;
			}

			public void setKey(String key) {
				this.key = key;
			}

			public String getValue() {
				return this.value;
			}

			public void setValue(String value) {
				this.value = value;
			}
		}

		public static class Strategy {

			private String strategyId;

			private String strategyName;

			private String strategyDescription;

			private String type;

			private Long startTime;

			private Long endTime;

			private String repeatBy;

			private Integer maxAttemptsPerDay;

			private Integer minAttemptInterval;

			private String customized;

			private String routingStrategy;

			private String followUpStrategy;

			private Boolean isTemplate;

			private List<TimeFrame> workingTime;

			private List<String> repeatDays;

			public String getStrategyId() {
				return this.strategyId;
			}

			public void setStrategyId(String strategyId) {
				this.strategyId = strategyId;
			}

			public String getStrategyName() {
				return this.strategyName;
			}

			public void setStrategyName(String strategyName) {
				this.strategyName = strategyName;
			}

			public String getStrategyDescription() {
				return this.strategyDescription;
			}

			public void setStrategyDescription(String strategyDescription) {
				this.strategyDescription = strategyDescription;
			}

			public String getType() {
				return this.type;
			}

			public void setType(String type) {
				this.type = type;
			}

			public Long getStartTime() {
				return this.startTime;
			}

			public void setStartTime(Long startTime) {
				this.startTime = startTime;
			}

			public Long getEndTime() {
				return this.endTime;
			}

			public void setEndTime(Long endTime) {
				this.endTime = endTime;
			}

			public String getRepeatBy() {
				return this.repeatBy;
			}

			public void setRepeatBy(String repeatBy) {
				this.repeatBy = repeatBy;
			}

			public Integer getMaxAttemptsPerDay() {
				return this.maxAttemptsPerDay;
			}

			public void setMaxAttemptsPerDay(Integer maxAttemptsPerDay) {
				this.maxAttemptsPerDay = maxAttemptsPerDay;
			}

			public Integer getMinAttemptInterval() {
				return this.minAttemptInterval;
			}

			public void setMinAttemptInterval(Integer minAttemptInterval) {
				this.minAttemptInterval = minAttemptInterval;
			}

			public String getCustomized() {
				return this.customized;
			}

			public void setCustomized(String customized) {
				this.customized = customized;
			}

			public String getRoutingStrategy() {
				return this.routingStrategy;
			}

			public void setRoutingStrategy(String routingStrategy) {
				this.routingStrategy = routingStrategy;
			}

			public String getFollowUpStrategy() {
				return this.followUpStrategy;
			}

			public void setFollowUpStrategy(String followUpStrategy) {
				this.followUpStrategy = followUpStrategy;
			}

			public Boolean getIsTemplate() {
				return this.isTemplate;
			}

			public void setIsTemplate(Boolean isTemplate) {
				this.isTemplate = isTemplate;
			}

			public List<TimeFrame> getWorkingTime() {
				return this.workingTime;
			}

			public void setWorkingTime(List<TimeFrame> workingTime) {
				this.workingTime = workingTime;
			}

			public List<String> getRepeatDays() {
				return this.repeatDays;
			}

			public void setRepeatDays(List<String> repeatDays) {
				this.repeatDays = repeatDays;
			}

			public static class TimeFrame {

				private String beginTime;

				private String endTime;

				public String getBeginTime() {
					return this.beginTime;
				}

				public void setBeginTime(String beginTime) {
					this.beginTime = beginTime;
				}

				public String getEndTime() {
					return this.endTime;
				}

				public void setEndTime(String endTime) {
					this.endTime = endTime;
				}
			}
		}
	}

	@Override
	public ModifyScenarioResponse getInstance(UnmarshallerContext context) {
		return	ModifyScenarioResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
