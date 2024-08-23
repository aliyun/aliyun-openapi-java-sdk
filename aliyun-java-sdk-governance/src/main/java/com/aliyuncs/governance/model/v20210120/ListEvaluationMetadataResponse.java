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

package com.aliyuncs.governance.model.v20210120;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.governance.transform.v20210120.ListEvaluationMetadataResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class ListEvaluationMetadataResponse extends AcsResponse {

	private String requestId;

	private List<EvaluationMetadataItem> evaluationMetadata;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<EvaluationMetadataItem> getEvaluationMetadata() {
		return this.evaluationMetadata;
	}

	public void setEvaluationMetadata(List<EvaluationMetadataItem> evaluationMetadata) {
		this.evaluationMetadata = evaluationMetadata;
	}

	public static class EvaluationMetadataItem {

		private String type;

		private List<MetadataItem> metadata;

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public List<MetadataItem> getMetadata() {
			return this.metadata;
		}

		public void setMetadata(List<MetadataItem> metadata) {
			this.metadata = metadata;
		}

		public static class MetadataItem {

			private String category;

			private String description;

			private String displayName;

			private String id;

			private String noRiskDisplayName;

			private String parentId;

			private String recommendationLevel;

			private String scope;

			private String stage;

			private RemediationMetadata remediationMetadata;

			private ResourceMetadata resourceMetadata;

			public String getCategory() {
				return this.category;
			}

			public void setCategory(String category) {
				this.category = category;
			}

			public String getDescription() {
				return this.description;
			}

			public void setDescription(String description) {
				this.description = description;
			}

			public String getDisplayName() {
				return this.displayName;
			}

			public void setDisplayName(String displayName) {
				this.displayName = displayName;
			}

			public String getId() {
				return this.id;
			}

			public void setId(String id) {
				this.id = id;
			}

			public String getNoRiskDisplayName() {
				return this.noRiskDisplayName;
			}

			public void setNoRiskDisplayName(String noRiskDisplayName) {
				this.noRiskDisplayName = noRiskDisplayName;
			}

			public String getParentId() {
				return this.parentId;
			}

			public void setParentId(String parentId) {
				this.parentId = parentId;
			}

			public String getRecommendationLevel() {
				return this.recommendationLevel;
			}

			public void setRecommendationLevel(String recommendationLevel) {
				this.recommendationLevel = recommendationLevel;
			}

			public String getScope() {
				return this.scope;
			}

			public void setScope(String scope) {
				this.scope = scope;
			}

			public String getStage() {
				return this.stage;
			}

			public void setStage(String stage) {
				this.stage = stage;
			}

			public RemediationMetadata getRemediationMetadata() {
				return this.remediationMetadata;
			}

			public void setRemediationMetadata(RemediationMetadata remediationMetadata) {
				this.remediationMetadata = remediationMetadata;
			}

			public ResourceMetadata getResourceMetadata() {
				return this.resourceMetadata;
			}

			public void setResourceMetadata(ResourceMetadata resourceMetadata) {
				this.resourceMetadata = resourceMetadata;
			}

			public static class RemediationMetadata {

				private List<RemediationItem> remediation;

				public List<RemediationItem> getRemediation() {
					return this.remediation;
				}

				public void setRemediation(List<RemediationItem> remediation) {
					this.remediation = remediation;
				}

				public static class RemediationItem {

					private String analysisDefinition;

					private String remediationParameters;

					private String remediationTarget;

					private String remediationType;

					private List<Action> actions;

					public String getAnalysisDefinition() {
						return this.analysisDefinition;
					}

					public void setAnalysisDefinition(String analysisDefinition) {
						this.analysisDefinition = analysisDefinition;
					}

					public String getRemediationParameters() {
						return this.remediationParameters;
					}

					public void setRemediationParameters(String remediationParameters) {
						this.remediationParameters = remediationParameters;
					}

					public String getRemediationTarget() {
						return this.remediationTarget;
					}

					public void setRemediationTarget(String remediationTarget) {
						this.remediationTarget = remediationTarget;
					}

					public String getRemediationType() {
						return this.remediationType;
					}

					public void setRemediationType(String remediationType) {
						this.remediationType = remediationType;
					}

					public List<Action> getActions() {
						return this.actions;
					}

					public void setActions(List<Action> actions) {
						this.actions = actions;
					}

					public static class Action {

						private String classification;

						private String costDescription;

						private String description;

						private String notice;

						private String suggestion;

						private List<GuidanceItem> guidance;

						public String getClassification() {
							return this.classification;
						}

						public void setClassification(String classification) {
							this.classification = classification;
						}

						public String getCostDescription() {
							return this.costDescription;
						}

						public void setCostDescription(String costDescription) {
							this.costDescription = costDescription;
						}

						public String getDescription() {
							return this.description;
						}

						public void setDescription(String description) {
							this.description = description;
						}

						public String getNotice() {
							return this.notice;
						}

						public void setNotice(String notice) {
							this.notice = notice;
						}

						public String getSuggestion() {
							return this.suggestion;
						}

						public void setSuggestion(String suggestion) {
							this.suggestion = suggestion;
						}

						public List<GuidanceItem> getGuidance() {
							return this.guidance;
						}

						public void setGuidance(List<GuidanceItem> guidance) {
							this.guidance = guidance;
						}

						public static class GuidanceItem {

							private String buttonName;

							private String buttonRef;

							private String content;

							private String title;

							public String getButtonName() {
								return this.buttonName;
							}

							public void setButtonName(String buttonName) {
								this.buttonName = buttonName;
							}

							public String getButtonRef() {
								return this.buttonRef;
							}

							public void setButtonRef(String buttonRef) {
								this.buttonRef = buttonRef;
							}

							public String getContent() {
								return this.content;
							}

							public void setContent(String content) {
								this.content = content;
							}

							public String getTitle() {
								return this.title;
							}

							public void setTitle(String title) {
								this.title = title;
							}
						}
					}
				}
			}

			public static class ResourceMetadata {

				private List<ResourcePropertyMetadataItem> resourcePropertyMetadata;

				public List<ResourcePropertyMetadataItem> getResourcePropertyMetadata() {
					return this.resourcePropertyMetadata;
				}

				public void setResourcePropertyMetadata(List<ResourcePropertyMetadataItem> resourcePropertyMetadata) {
					this.resourcePropertyMetadata = resourcePropertyMetadata;
				}

				public static class ResourcePropertyMetadataItem {

					private String displayName;

					private String propertyName;

					private String propertyReference;

					private String propertyType;

					public String getDisplayName() {
						return this.displayName;
					}

					public void setDisplayName(String displayName) {
						this.displayName = displayName;
					}

					public String getPropertyName() {
						return this.propertyName;
					}

					public void setPropertyName(String propertyName) {
						this.propertyName = propertyName;
					}

					public String getPropertyReference() {
						return this.propertyReference;
					}

					public void setPropertyReference(String propertyReference) {
						this.propertyReference = propertyReference;
					}

					public String getPropertyType() {
						return this.propertyType;
					}

					public void setPropertyType(String propertyType) {
						this.propertyType = propertyType;
					}
				}
			}
		}
	}

	@Override
	public ListEvaluationMetadataResponse getInstance(UnmarshallerContext context) {
		return	ListEvaluationMetadataResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
