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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateKnowledgeRequest extends RpcAcsRequest<UpdateKnowledgeResponse> {
	   

	private String operatorId;

	private String robotCode;

	private String operatorName;

	private Knowledge knowledge;
	public UpdateKnowledgeRequest() {
		super("RetailBot", "2021-02-24", "UpdateKnowledge");
		setMethod(MethodType.POST);
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

	public Knowledge getKnowledge() {
		return this.knowledge;
	}

	public void setKnowledge(Knowledge knowledge) {
		this.knowledge = knowledge;	
		if (knowledge != null) {
			
				putBodyParameter("Knowledge.KnowledgeId" , knowledge.getKnowledgeId());
				if (knowledge.getSimilarQuestions() != null) {
					for (int depth1 = 0; depth1 < knowledge.getSimilarQuestions().size(); depth1++) {
						if (knowledge.getSimilarQuestions().get(depth1) != null) {
							
								putBodyParameter("Knowledge.SimilarQuestions." + (depth1 + 1) + ".SimilarQuestionEffectType" , knowledge.getSimilarQuestions().get(depth1).getSimilarQuestionEffectType());
								putBodyParameter("Knowledge.SimilarQuestions." + (depth1 + 1) + ".Action" , knowledge.getSimilarQuestions().get(depth1).getAction());
								putBodyParameter("Knowledge.SimilarQuestions." + (depth1 + 1) + ".SimilarQuestionId" , knowledge.getSimilarQuestions().get(depth1).getSimilarQuestionId());
								putBodyParameter("Knowledge.SimilarQuestions." + (depth1 + 1) + ".SimilarQuestionTitle" , knowledge.getSimilarQuestions().get(depth1).getSimilarQuestionTitle());
						}
					}
				}
		}	
	}

	public static class Knowledge {

		private Long knowledgeId;

		private List<SimilarQuestionsItem> similarQuestions;

		public Long getKnowledgeId() {
			return this.knowledgeId;
		}

		public void setKnowledgeId(Long knowledgeId) {
			this.knowledgeId = knowledgeId;
		}

		public List<SimilarQuestionsItem> getSimilarQuestions() {
			return this.similarQuestions;
		}

		public void setSimilarQuestions(List<SimilarQuestionsItem> similarQuestions) {
			this.similarQuestions = similarQuestions;
		}

		public static class SimilarQuestionsItem {

			private String similarQuestionEffectType;

			private String action;

			private Long similarQuestionId;

			private String similarQuestionTitle;

			public String getSimilarQuestionEffectType() {
				return this.similarQuestionEffectType;
			}

			public void setSimilarQuestionEffectType(String similarQuestionEffectType) {
				this.similarQuestionEffectType = similarQuestionEffectType;
			}

			public String getAction() {
				return this.action;
			}

			public void setAction(String action) {
				this.action = action;
			}

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
		}
	}

	@Override
	public Class<UpdateKnowledgeResponse> getResponseClass() {
		return UpdateKnowledgeResponse.class;
	}

}
