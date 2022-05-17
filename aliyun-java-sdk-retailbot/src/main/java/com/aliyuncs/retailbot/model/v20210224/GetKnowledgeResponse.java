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
import com.aliyuncs.retailbot.transform.v20210224.GetKnowledgeResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetKnowledgeResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Knowledge knowledge;

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

	public Knowledge getKnowledge() {
		return this.knowledge;
	}

	public void setKnowledge(Knowledge knowledge) {
		this.knowledge = knowledge;
	}

	public static class Knowledge {

		private Long knowledgeId;

		private String knowledgeTitle;

		private String knowledgeStatus;

		private String sceneKey;

		private String knowledgeDescription;

		private String createTime;

		private String createUserId;

		private String modifyUserId;

		private String modifyTime;

		private List<SimilarQuestion> similarQuestions;

		private List<Solution> solutions;

		private List<_Package> packages;

		private Category category;

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

		public String getModifyTime() {
			return this.modifyTime;
		}

		public void setModifyTime(String modifyTime) {
			this.modifyTime = modifyTime;
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

		public List<_Package> getPackages() {
			return this.packages;
		}

		public void setPackages(List<_Package> packages) {
			this.packages = packages;
		}

		public Category getCategory() {
			return this.category;
		}

		public void setCategory(Category category) {
			this.category = category;
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

			private List<SolutionVariable> solutionVariables;

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

			public List<SolutionVariable> getSolutionVariables() {
				return this.solutionVariables;
			}

			public void setSolutionVariables(List<SolutionVariable> solutionVariables) {
				this.solutionVariables = solutionVariables;
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

			public static class SolutionVariable {

				private Long knowledgeId;

				private Long solutionId;

				private String variableName;

				private String variableType;

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

				public String getVariableName() {
					return this.variableName;
				}

				public void setVariableName(String variableName) {
					this.variableName = variableName;
				}

				public String getVariableType() {
					return this.variableType;
				}

				public void setVariableType(String variableType) {
					this.variableType = variableType;
				}
			}
		}

		public static class _Package {

			private String packageName;

			private String packageCode;

			public String getPackageName() {
				return this.packageName;
			}

			public void setPackageName(String packageName) {
				this.packageName = packageName;
			}

			public String getPackageCode() {
				return this.packageCode;
			}

			public void setPackageCode(String packageCode) {
				this.packageCode = packageCode;
			}
		}

		public static class Category {

			private Long categoryId;

			private Long parentCategoryId;

			private String categoryName;

			public Long getCategoryId() {
				return this.categoryId;
			}

			public void setCategoryId(Long categoryId) {
				this.categoryId = categoryId;
			}

			public Long getParentCategoryId() {
				return this.parentCategoryId;
			}

			public void setParentCategoryId(Long parentCategoryId) {
				this.parentCategoryId = parentCategoryId;
			}

			public String getCategoryName() {
				return this.categoryName;
			}

			public void setCategoryName(String categoryName) {
				this.categoryName = categoryName;
			}
		}
	}

	@Override
	public GetKnowledgeResponse getInstance(UnmarshallerContext context) {
		return	GetKnowledgeResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
