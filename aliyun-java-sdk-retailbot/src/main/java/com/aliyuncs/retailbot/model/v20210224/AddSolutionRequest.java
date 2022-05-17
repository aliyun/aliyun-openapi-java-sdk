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

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class AddSolutionRequest extends RpcAcsRequest<AddSolutionResponse> {
	   

	private Long knowledgeId;

	@SerializedName("solution")
	private Solution solution;

	private String operatorId;

	private String robotCode;

	private String operatorName;
	public AddSolutionRequest() {
		super("RetailBot", "2021-02-24", "AddSolution");
		setMethod(MethodType.POST);
	}

	public Long getKnowledgeId() {
		return this.knowledgeId;
	}

	public void setKnowledgeId(Long knowledgeId) {
		this.knowledgeId = knowledgeId;
		if(knowledgeId != null){
			putBodyParameter("KnowledgeId", knowledgeId.toString());
		}
	}

	public Solution getSolution() {
		return this.solution;
	}

	public void setSolution(Solution solution) {
		this.solution = solution;	
		if (solution != null) {
			putBodyParameter("Solution" , new Gson().toJson(solution));
		}	
	}

	public String getOperatorId() {
		return this.operatorId;
	}

	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
		if(operatorId != null){
			putBodyParameter("OperatorId", operatorId);
		}
	}

	public String getRobotCode() {
		return this.robotCode;
	}

	public void setRobotCode(String robotCode) {
		this.robotCode = robotCode;
		if(robotCode != null){
			putBodyParameter("RobotCode", robotCode);
		}
	}

	public String getOperatorName() {
		return this.operatorName;
	}

	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
		if(operatorName != null){
			putBodyParameter("OperatorName", operatorName);
		}
	}

	public static class Solution {

		@SerializedName("KnowledgeId")
		private Long knowledgeId;

		@SerializedName("SolutionSource")
		private String solutionSource;

		@SerializedName("SolutionContent")
		private String solutionContent;

		@SerializedName("ExtraContent")
		private String extraContent;

		@SerializedName("SolutionVariables")
		private List<SolutionVariablesItem> solutionVariables;

		@SerializedName("Conditions")
		private List<ConditionsItem> conditions;

		@SerializedName("SolutionType")
		private String solutionType;

		public Long getKnowledgeId() {
			return this.knowledgeId;
		}

		public void setKnowledgeId(Long knowledgeId) {
			this.knowledgeId = knowledgeId;
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

		public List<SolutionVariablesItem> getSolutionVariables() {
			return this.solutionVariables;
		}

		public void setSolutionVariables(List<SolutionVariablesItem> solutionVariables) {
			this.solutionVariables = solutionVariables;
		}

		public List<ConditionsItem> getConditions() {
			return this.conditions;
		}

		public void setConditions(List<ConditionsItem> conditions) {
			this.conditions = conditions;
		}

		public String getSolutionType() {
			return this.solutionType;
		}

		public void setSolutionType(String solutionType) {
			this.solutionType = solutionType;
		}

		public static class SolutionVariablesItem {

			@SerializedName("KnowledgeId")
			private Long knowledgeId;

			@SerializedName("VariableType")
			private String variableType;

			@SerializedName("VariableName")
			private String variableName;

			@SerializedName("SolutionId")
			private Long solutionId;

			public Long getKnowledgeId() {
				return this.knowledgeId;
			}

			public void setKnowledgeId(Long knowledgeId) {
				this.knowledgeId = knowledgeId;
			}

			public String getVariableType() {
				return this.variableType;
			}

			public void setVariableType(String variableType) {
				this.variableType = variableType;
			}

			public String getVariableName() {
				return this.variableName;
			}

			public void setVariableName(String variableName) {
				this.variableName = variableName;
			}

			public Long getSolutionId() {
				return this.solutionId;
			}

			public void setSolutionId(Long solutionId) {
				this.solutionId = solutionId;
			}
		}

		public static class ConditionsItem {

			@SerializedName("KnowledgeId")
			private Long knowledgeId;

			@SerializedName("ConditionValue")
			private String conditionValue;

			@SerializedName("ConditionType")
			private String conditionType;

			public Long getKnowledgeId() {
				return this.knowledgeId;
			}

			public void setKnowledgeId(Long knowledgeId) {
				this.knowledgeId = knowledgeId;
			}

			public String getConditionValue() {
				return this.conditionValue;
			}

			public void setConditionValue(String conditionValue) {
				this.conditionValue = conditionValue;
			}

			public String getConditionType() {
				return this.conditionType;
			}

			public void setConditionType(String conditionType) {
				this.conditionType = conditionType;
			}
		}
	}

	@Override
	public Class<AddSolutionResponse> getResponseClass() {
		return AddSolutionResponse.class;
	}

}
