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
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.retailbot.transform.v20210224.RecognizeMessageForTestResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class RecognizeMessageForTestResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

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

	public Data getData() {
		return this.data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public static class Data {

		private Map<Object,Object> extOutput;

		private List<KnowledgeDTO> knowledges;

		private List<OutputMessage> outputMessages;

		private Scene scene;

		private UnitSlots unitSlots;

		public Map<Object,Object> getExtOutput() {
			return this.extOutput;
		}

		public void setExtOutput(Map<Object,Object> extOutput) {
			this.extOutput = extOutput;
		}

		public List<KnowledgeDTO> getKnowledges() {
			return this.knowledges;
		}

		public void setKnowledges(List<KnowledgeDTO> knowledges) {
			this.knowledges = knowledges;
		}

		public List<OutputMessage> getOutputMessages() {
			return this.outputMessages;
		}

		public void setOutputMessages(List<OutputMessage> outputMessages) {
			this.outputMessages = outputMessages;
		}

		public Scene getScene() {
			return this.scene;
		}

		public void setScene(Scene scene) {
			this.scene = scene;
		}

		public UnitSlots getUnitSlots() {
			return this.unitSlots;
		}

		public void setUnitSlots(UnitSlots unitSlots) {
			this.unitSlots = unitSlots;
		}

		public static class KnowledgeDTO {

			private Long knowledgeId;

			private String knowledgeTitle;

			private String sceneKey;

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

			public String getSceneKey() {
				return this.sceneKey;
			}

			public void setSceneKey(String sceneKey) {
				this.sceneKey = sceneKey;
			}

			public List<Solution> getSolutions() {
				return this.solutions;
			}

			public void setSolutions(List<Solution> solutions) {
				this.solutions = solutions;
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

					private String conditionType;

					private String conditionValue;

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

					private String variableName;

					private String variableType;

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
		}

		public static class OutputMessage {

			private String outputContentType;

			private Map<Object,Object> outputContent;

			public String getOutputContentType() {
				return this.outputContentType;
			}

			public void setOutputContentType(String outputContentType) {
				this.outputContentType = outputContentType;
			}

			public Map<Object,Object> getOutputContent() {
				return this.outputContent;
			}

			public void setOutputContent(Map<Object,Object> outputContent) {
				this.outputContent = outputContent;
			}
		}

		public static class Scene {

			private String emotionTag;

			private String semanticComplete;

			private String itemId;

			private String orderId;

			private List<SceneDTO> sceneDTOs;

			public String getEmotionTag() {
				return this.emotionTag;
			}

			public void setEmotionTag(String emotionTag) {
				this.emotionTag = emotionTag;
			}

			public String getSemanticComplete() {
				return this.semanticComplete;
			}

			public void setSemanticComplete(String semanticComplete) {
				this.semanticComplete = semanticComplete;
			}

			public String getItemId() {
				return this.itemId;
			}

			public void setItemId(String itemId) {
				this.itemId = itemId;
			}

			public String getOrderId() {
				return this.orderId;
			}

			public void setOrderId(String orderId) {
				this.orderId = orderId;
			}

			public List<SceneDTO> getSceneDTOs() {
				return this.sceneDTOs;
			}

			public void setSceneDTOs(List<SceneDTO> sceneDTOs) {
				this.sceneDTOs = sceneDTOs;
			}

			public static class SceneDTO {

				private String sceneKey;

				private String sceneSource;

				public String getSceneKey() {
					return this.sceneKey;
				}

				public void setSceneKey(String sceneKey) {
					this.sceneKey = sceneKey;
				}

				public String getSceneSource() {
					return this.sceneSource;
				}

				public void setSceneSource(String sceneSource) {
					this.sceneSource = sceneSource;
				}
			}
		}

		public static class UnitSlots {

			private List<UnitSpan> unitSpans;

			public List<UnitSpan> getUnitSpans() {
				return this.unitSpans;
			}

			public void setUnitSpans(List<UnitSpan> unitSpans) {
				this.unitSpans = unitSpans;
			}

			public static class UnitSpan {

				private Integer start;

				private Integer end;

				private String slotKey;

				private String slotValue;

				private String source;

				private Double score;

				private String alias;

				private NumericSlotValue numericSlotValue;

				public Integer getStart() {
					return this.start;
				}

				public void setStart(Integer start) {
					this.start = start;
				}

				public Integer getEnd() {
					return this.end;
				}

				public void setEnd(Integer end) {
					this.end = end;
				}

				public String getSlotKey() {
					return this.slotKey;
				}

				public void setSlotKey(String slotKey) {
					this.slotKey = slotKey;
				}

				public String getSlotValue() {
					return this.slotValue;
				}

				public void setSlotValue(String slotValue) {
					this.slotValue = slotValue;
				}

				public String getSource() {
					return this.source;
				}

				public void setSource(String source) {
					this.source = source;
				}

				public Double getScore() {
					return this.score;
				}

				public void setScore(Double score) {
					this.score = score;
				}

				public String getAlias() {
					return this.alias;
				}

				public void setAlias(String alias) {
					this.alias = alias;
				}

				public NumericSlotValue getNumericSlotValue() {
					return this.numericSlotValue;
				}

				public void setNumericSlotValue(NumericSlotValue numericSlotValue) {
					this.numericSlotValue = numericSlotValue;
				}

				public static class NumericSlotValue {

					private Double num;

					private Unit unit;

					public Double getNum() {
						return this.num;
					}

					public void setNum(Double num) {
						this.num = num;
					}

					public Unit getUnit() {
						return this.unit;
					}

					public void setUnit(Unit unit) {
						this.unit = unit;
					}

					public static class Unit {

						private String unitKey;

						private String unitName;

						public String getUnitKey() {
							return this.unitKey;
						}

						public void setUnitKey(String unitKey) {
							this.unitKey = unitKey;
						}

						public String getUnitName() {
							return this.unitName;
						}

						public void setUnitName(String unitName) {
							this.unitName = unitName;
						}
					}
				}
			}
		}
	}

	@Override
	public RecognizeMessageForTestResponse getInstance(UnmarshallerContext context) {
		return	RecognizeMessageForTestResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
