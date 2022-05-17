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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UploadKnowledgeResultRequest extends RpcAcsRequest<UploadKnowledgeResultResponse> {
	   

	@SerializedName("digDatas")
	private List<DigDatas> digDatas;
	public UploadKnowledgeResultRequest() {
		super("RetailBot", "2021-02-24", "UploadKnowledgeResult");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public List<DigDatas> getDigDatas() {
		return this.digDatas;
	}

	public void setDigDatas(List<DigDatas> digDatas) {
		this.digDatas = digDatas;	
		if (digDatas != null) {
			putBodyParameter("DigDatas" , new Gson().toJson(digDatas));
		}	
	}

	public static class DigDatas {

		@SerializedName("KnowledgeId")
		private String knowledgeId;

		@SerializedName("KmpAnswerId")
		private String kmpAnswerId;

		@SerializedName("QuestionId")
		private String questionId;

		@SerializedName("SceneKey")
		private String sceneKey;

		@SerializedName("KmpClusterId")
		private String kmpClusterId;

		@SerializedName("SceneName")
		private String sceneName;

		@SerializedName("QuestionName")
		private String questionName;

		@SerializedName("SolutionId")
		private String solutionId;

		@SerializedName("TaskId")
		private Long taskId;

		@SerializedName("RobotCode")
		private String robotCode;

		@SerializedName("AcceptType")
		private String acceptType;

		@SerializedName("ContentType")
		private String contentType;

		public String getKnowledgeId() {
			return this.knowledgeId;
		}

		public void setKnowledgeId(String knowledgeId) {
			this.knowledgeId = knowledgeId;
		}

		public String getKmpAnswerId() {
			return this.kmpAnswerId;
		}

		public void setKmpAnswerId(String kmpAnswerId) {
			this.kmpAnswerId = kmpAnswerId;
		}

		public String getQuestionId() {
			return this.questionId;
		}

		public void setQuestionId(String questionId) {
			this.questionId = questionId;
		}

		public String getSceneKey() {
			return this.sceneKey;
		}

		public void setSceneKey(String sceneKey) {
			this.sceneKey = sceneKey;
		}

		public String getKmpClusterId() {
			return this.kmpClusterId;
		}

		public void setKmpClusterId(String kmpClusterId) {
			this.kmpClusterId = kmpClusterId;
		}

		public String getSceneName() {
			return this.sceneName;
		}

		public void setSceneName(String sceneName) {
			this.sceneName = sceneName;
		}

		public String getQuestionName() {
			return this.questionName;
		}

		public void setQuestionName(String questionName) {
			this.questionName = questionName;
		}

		public String getSolutionId() {
			return this.solutionId;
		}

		public void setSolutionId(String solutionId) {
			this.solutionId = solutionId;
		}

		public Long getTaskId() {
			return this.taskId;
		}

		public void setTaskId(Long taskId) {
			this.taskId = taskId;
		}

		public String getRobotCode() {
			return this.robotCode;
		}

		public void setRobotCode(String robotCode) {
			this.robotCode = robotCode;
		}

		public String getAcceptType() {
			return this.acceptType;
		}

		public void setAcceptType(String acceptType) {
			this.acceptType = acceptType;
		}

		public String getContentType() {
			return this.contentType;
		}

		public void setContentType(String contentType) {
			this.contentType = contentType;
		}
	}

	@Override
	public Class<UploadKnowledgeResultResponse> getResponseClass() {
		return UploadKnowledgeResultResponse.class;
	}

}
