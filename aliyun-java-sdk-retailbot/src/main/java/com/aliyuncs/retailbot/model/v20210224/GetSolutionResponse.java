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
import com.aliyuncs.retailbot.transform.v20210224.GetSolutionResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetSolutionResponse extends AcsResponse {

	private String requestId;

	private Boolean success;

	private String code;

	private String message;

	private Solution solution;

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

	public Solution getSolution() {
		return this.solution;
	}

	public void setSolution(Solution solution) {
		this.solution = solution;
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

	@Override
	public GetSolutionResponse getInstance(UnmarshallerContext context) {
		return	GetSolutionResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
