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

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ccc.transform.v20170705.GetSurveyResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSurveyResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Integer httpStatusCode;

	private Survey survey;

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

	public Survey getSurvey() {
		return this.survey;
	}

	public void setSurvey(Survey survey) {
		this.survey = survey;
	}

	public static class Survey {

		private String id;

		private String scenarioUuid;

		private String name;

		private String description;

		private String role;

		private Integer round;

		private String hotWords;

		private String speechOptimizationParam;

		private String globalQuestions;

		private Flow flow;

		private AsrCustomModel asrCustomModel;

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getScenarioUuid() {
			return this.scenarioUuid;
		}

		public void setScenarioUuid(String scenarioUuid) {
			this.scenarioUuid = scenarioUuid;
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

		public String getHotWords() {
			return this.hotWords;
		}

		public void setHotWords(String hotWords) {
			this.hotWords = hotWords;
		}

		public String getSpeechOptimizationParam() {
			return this.speechOptimizationParam;
		}

		public void setSpeechOptimizationParam(String speechOptimizationParam) {
			this.speechOptimizationParam = speechOptimizationParam;
		}

		public String getGlobalQuestions() {
			return this.globalQuestions;
		}

		public void setGlobalQuestions(String globalQuestions) {
			this.globalQuestions = globalQuestions;
		}

		public Flow getFlow() {
			return this.flow;
		}

		public void setFlow(Flow flow) {
			this.flow = flow;
		}

		public AsrCustomModel getAsrCustomModel() {
			return this.asrCustomModel;
		}

		public void setAsrCustomModel(AsrCustomModel asrCustomModel) {
			this.asrCustomModel = asrCustomModel;
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

		public static class AsrCustomModel {

			private String corpora;

			private Integer customModelStatus;

			public String getCorpora() {
				return this.corpora;
			}

			public void setCorpora(String corpora) {
				this.corpora = corpora;
			}

			public Integer getCustomModelStatus() {
				return this.customModelStatus;
			}

			public void setCustomModelStatus(Integer customModelStatus) {
				this.customModelStatus = customModelStatus;
			}
		}
	}

	@Override
	public GetSurveyResponse getInstance(UnmarshallerContext context) {
		return	GetSurveyResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
