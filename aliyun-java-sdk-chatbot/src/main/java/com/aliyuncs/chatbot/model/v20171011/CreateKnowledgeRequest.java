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

package com.aliyuncs.chatbot.model.v20171011;

import com.alibaba.fastjson.JSON;
import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class CreateKnowledgeRequest extends RpcAcsRequest<CreateKnowledgeResponse> {
	
	public CreateKnowledgeRequest() {
		super("Chatbot", "2017-10-11", "CreateKnowledge", "beebot");
		setMethod(MethodType.POST);
	}

	private Knowledge knowledge;

	public Knowledge getKnowledge() {
		return this.knowledge;
	}

	public void setKnowledge(Knowledge knowledge) {
		this.knowledge = knowledge;
		String knowledgeStr = JSON.toJSONString(knowledge);
		if(knowledge != null){
			putBodyParameter("Knowledge", knowledgeStr);
		}
	}

	@Override
	public Class<CreateKnowledgeResponse> getResponseClass() {
		return CreateKnowledgeResponse.class;
	}

	public static class Knowledge {

		private Long categoryId;

		private String knowledgeTitle;

		private Integer knowledgeType;

		private String startDate;

		private String endDate;

		private List<Solution> solutions;

		private List<SimQuestion> simQuestions;

		private List<String> keyWords;

		private List<String> coreWords;

		public String getEndDate() {
			return this.endDate;
		}

		public void setEndDate(String endDate) {
			this.endDate = endDate;
		}

		public String getKnowledgeTitle() {
			return this.knowledgeTitle;
		}

		public void setKnowledgeTitle(String knowledgeTitle) {
			this.knowledgeTitle = knowledgeTitle;
		}

		public Integer getKnowledgeType() {
			return this.knowledgeType;
		}

		public void setKnowledgeType(Integer knowledgeType) {
			this.knowledgeType = knowledgeType;
		}

		public Long getCategoryId() {
			return this.categoryId;
		}

		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}

		public String getStartDate() {
			return this.startDate;
		}

		public void setStartDate(String startDate) {
			this.startDate = startDate;
		}

		public List<SimQuestion> getSimQuestions() {
			return this.simQuestions;
		}

		public void setSimQuestions(List<SimQuestion> simQuestions) {
			this.simQuestions = simQuestions;
		}

		public List<Solution> getSolutions() {
			return this.solutions;
		}

		public void setSolutions(List<Solution> solutions) {
			this.solutions = solutions;
		}

		public List<String> getKeyWords() {
			return this.keyWords;
		}

		public void setKeyWords(List<String> keyWords) {
			this.keyWords = keyWords;
		}

		public List<String> getCoreWords() {
			return this.coreWords;
		}

		public void setCoreWords(List<String> coreWords) {
			this.coreWords = coreWords;
		}
	}

	public static class SimQuestion {

		private String title;

		public String getTitle() {
			return this.title;
		}

		public void setTitle(String title) {
			this.title = title;
		}
	}

	public static class Solution {

		private String plainText;

		private String content;

		private List<String> perspectiveIds;

		public String getPlainText() {
			return plainText;
		}

		public void setPlainText(String plainText) {
			this.plainText = plainText;
		}

		public String getContent() {
			return this.content;
		}

		public void setContent(String content) {
			this.content = content;
		}

		public List<String> getPerspectiveIds() {
			return this.perspectiveIds;
		}

		public void setPerspectiveIds(List<String> perspectiveIds) {
			this.perspectiveIds = perspectiveIds;
		}
	}


}
