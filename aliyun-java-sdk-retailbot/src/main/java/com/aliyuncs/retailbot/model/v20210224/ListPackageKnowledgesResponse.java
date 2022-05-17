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

package com.aliyuncs.retailbot.model.v20210224;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailbot.transform.v20210224.ListPackageKnowledgesResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListPackageKnowledgesResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private List<Knowledge> knowledges;

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

	public List<Knowledge> getKnowledges() {
		return this.knowledges;
	}

	public void setKnowledges(List<Knowledge> knowledges) {
		this.knowledges = knowledges;
	}

	public static class Knowledge {

		private Long knowledgeId;

		private String knowledgeTitle;

		private String knowledgeStatus;

		private String sceneKey;

		private String knowledgeDescription;

		private String createTime;

		private String modifyTime;

		private String createUserId;

		private String modifyUserId;

		private List<SimilarQuestion> similarQuestions;

		private List<Solution> solutions;

		public Long getKnowledgeId() {
			return this.knowledgeId;
		}

		public void setKnowledgeId(Long knowledgeId) {
			this.knowledgeId = knowledgeId;
		}

		public String getKnowledgeTitle() {
			return this.knowledgeTitle;
		}

		public void setKnowledgeTitle(String knowledgeTitle) {
			this.knowledgeTitle = knowledgeTitle;
		}

		public String getKnowledgeStatus() {
			return this.knowledgeStatus;
		}

		public void setKnowledgeStatus(String knowledgeStatus) {
			this.knowledgeStatus = knowledgeStatus;
		}

		public String getSceneKey() {
			return this.sceneKey;
		}

		public void setSceneKey(String sceneKey) {
			this.sceneKey = sceneKey;
		}

		public String getKnowledgeDescription() {
			return this.knowledgeDescription;
		}

		public void setKnowledgeDescription(String knowledgeDescription) {
			this.knowledgeDescription = knowledgeDescription;
		}

		public String getCreateTime() {
			return this.createTime;
		}

		public void setCreateTime(String createTime) {
			this.createTime = createTime;
		}

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
		}

		public String getCreateUserId() {
			return this.createUserId;
		}

		public void setCreateUserId(String createUserId) {
			this.createUserId = createUserId;
		}

		public String getModifyUserId() {
			return this.modifyUserId;
		}

		public void setModifyUserId(String modifyUserId) {
			this.modifyUserId = modifyUserId;
		}

		public List<SimilarQuestion> getSimilarQuestions() {
			return this.similarQuestions;
		}

		public void setSimilarQuestions(List<SimilarQuestion> similarQuestions) {
			this.similarQuestions = similarQuestions;
		}

		public List<Solution> getSolutions() {
			return this.solutions;
		}

		public void setSolutions(List<Solution> solutions) {
			this.solutions = solutions;
		}

		public static class SimilarQuestion {

			private Long similarQuestionId;

			private String similarQuestionTitle;

			private String similarQuestionType;

			private String similarQuestionEffectType;

			private String createTime;

			private String modifyTime;

			private String createUserId;

			private String modifyUserId;

			public Long getSimilarQuestionId() {
				return this.similarQuestionId;
			}

			public void setSimilarQuestionId(Long similarQuestionId) {
				this.similarQuestionId = similarQuestionId;
			}

			public String getSimilarQuestionTitle() {
				return this.similarQuestionTitle;
			}

			public void setSimilarQuestionTitle(String similarQuestionTitle) {
				this.similarQuestionTitle = similarQuestionTitle;
			}

			public String getSimilarQuestionType() {
				return this.similarQuestionType;
			}

			public void setSimilarQuestionType(String similarQuestionType) {
				this.similarQuestionType = similarQuestionType;
			}

			public String getSimilarQuestionEffectType() {
				return this.similarQuestionEffectType;
			}

			public void setSimilarQuestionEffectType(String similarQuestionEffectType) {
				this.similarQuestionEffectType = similarQuestionEffectType;
			}

			public String getCreateTime() {
				return this.createTime;
			}

			public void setCreateTime(String createTime) {
				this.createTime = createTime;
			}

			public String getModifyTime() {
				return this.modifyTime;
			}

			public void setModifyTime(String modifyTime) {
				this.modifyTime = modifyTime;
			}

			public String getCreateUserId() {
				return this.createUserId;
			}

			public void setCreateUserId(String createUserId) {
				this.createUserId = createUserId;
			}

			public String getModifyUserId() {
				return this.modifyUserId;
			}

			public void setModifyUserId(String modifyUserId) {
				this.modifyUserId = modifyUserId;
			}
		}

		public static class Solution {

			private Long solutionId;

			private Long knowledgeId;

			private String solutionType;

			private String solutionSource;

			private String solutionContent;

			private String extraContent;

			private List<Condition> conditions;

			public Long getSolutionId() {
				return this.solutionId;
			}

			public void setSolutionId(Long solutionId) {
				this.solutionId = solutionId;
			}

			public Long getKnowledgeId() {
				return this.knowledgeId;
			}

			public void setKnowledgeId(Long knowledgeId) {
				this.knowledgeId = knowledgeId;
			}

			public String getSolutionType() {
				return this.solutionType;
			}

			public void setSolutionType(String solutionType) {
				this.solutionType = solutionType;
			}

			public String getSolutionSource() {
				return this.solutionSource;
			}

			public void setSolutionSource(String solutionSource) {
				this.solutionSource = solutionSource;
			}

			public String getSolutionContent() {
				return this.solutionContent;
			}

			public void setSolutionContent(String solutionContent) {
				this.solutionContent = solutionContent;
			}

			public String getExtraContent() {
				return this.extraContent;
			}

			public void setExtraContent(String extraContent) {
				this.extraContent = extraContent;
			}

			public List<Condition> getConditions() {
				return this.conditions;
			}

			public void setConditions(List<Condition> conditions) {
				this.conditions = conditions;
			}

			public static class Condition {

				private Long knowledgeId;

				private Long solutionId;

				private String conditionType;

				private String conditionValue;

				public Long getKnowledgeId() {
					return this.knowledgeId;
				}

				public void setKnowledgeId(Long knowledgeId) {
					this.knowledgeId = knowledgeId;
				}

				public Long getSolutionId() {
					return this.solutionId;
				}

				public void setSolutionId(Long solutionId) {
					this.solutionId = solutionId;
				}

				public String getConditionType() {
					return this.conditionType;
				}

				public void setConditionType(String conditionType) {
					this.conditionType = conditionType;
				}

				public String getConditionValue() {
					return this.conditionValue;
				}

				public void setConditionValue(String conditionValue) {
					this.conditionValue = conditionValue;
				}
			}
		}
	}

	@Override
	public ListPackageKnowledgesResponse getInstance(UnmarshallerContext context) {
		return	ListPackageKnowledgesResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
