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
import com.aliyuncs.ccc.transform.v20170705.ListScenarioTemplatesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListScenarioTemplatesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private List<Scenario> scenarioTemplates;

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

	public List<Scenario> getScenarioTemplates() {
		return this.scenarioTemplates;
	}

	public void setScenarioTemplates(List<Scenario> scenarioTemplates) {
		this.scenarioTemplates = scenarioTemplates;
	}

	public static class Scenario {

		private String id;

		private String name;

		private String description;

		private String type;

		private Boolean isTemplate;

		private List<Survey> surveys;

		private List<KeyValuePair> variables;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
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

		public static class Survey {

			private String id;

			private String name;

			private String description;

			private String role;

			private Integer round;

			private String beebotId;

			private String globalQuestions;

			private List<IntentNode> intents;

			private Flow flow;

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
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

			public String getGlobalQuestions() {
				return this.globalQuestions;
			}

			public void setGlobalQuestions(String globalQuestions) {
				this.globalQuestions = globalQuestions;
			}

			public List<IntentNode> getIntents() {
				return this.intents;
			}

			public void setIntents(List<IntentNode> intents) {
				this.intents = intents;
			}

			public Flow getFlow() {
				return this.flow;
			}

			public void setFlow(Flow flow) {
				this.flow = flow;
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

			public static class Flow {

				private String flowId;

				private Boolean isPublished;

				private String flowJson;

				public String getFlowId() {
					return this.flowId;
				}

				public void setFlowId(String flowId) {
					this.flowId = flowId;
				}

				public Boolean getIsPublished() {
					return this.isPublished;
				}

				public void setIsPublished(Boolean isPublished) {
					this.isPublished = isPublished;
				}

				public String getFlowJson() {
					return this.flowJson;
				}

				public void setFlowJson(String flowJson) {
					this.flowJson = flowJson;
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
	}

	@Override
	public ListScenarioTemplatesResponse getInstance(UnmarshallerContext context) {
		return	ListScenarioTemplatesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
