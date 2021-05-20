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

package com.aliyuncs.imageprocess.model.v20200320;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.imageprocess.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RunMedQARequest extends RpcAcsRequest<RunMedQAResponse> {
	   

	private String sessionId;

	private String orgName;

	private List<AnswerImageDataList> answerImageDataLists;

	private List<AnswerTextList> answerTextLists;

	private String department;

	private List<AnswerImageURLList> answerImageURLLists;

	private String questionType;

	private String orgId;
	public RunMedQARequest() {
		super("imageprocess", "2020-03-20", "RunMedQA", "imageprocess");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
		if(sessionId != null){
			putBodyParameter("SessionId", sessionId);
		}
	}

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
		if(orgName != null){
			putBodyParameter("OrgName", orgName);
		}
	}

	public List<AnswerImageDataList> getAnswerImageDataLists() {
		return this.answerImageDataLists;
	}

	public void setAnswerImageDataLists(List<AnswerImageDataList> answerImageDataLists) {
		this.answerImageDataLists = answerImageDataLists;	
		if (answerImageDataLists != null) {
			for (int depth1 = 0; depth1 < answerImageDataLists.size(); depth1++) {
				putBodyParameter("AnswerImageDataList." + (depth1 + 1) + ".AnswerImageData" , answerImageDataLists.get(depth1).getAnswerImageData());
			}
		}	
	}

	public List<AnswerTextList> getAnswerTextLists() {
		return this.answerTextLists;
	}

	public void setAnswerTextLists(List<AnswerTextList> answerTextLists) {
		this.answerTextLists = answerTextLists;	
		if (answerTextLists != null) {
			for (int depth1 = 0; depth1 < answerTextLists.size(); depth1++) {
				putBodyParameter("AnswerTextList." + (depth1 + 1) + ".AnswerText" , answerTextLists.get(depth1).getAnswerText());
			}
		}	
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
		if(department != null){
			putBodyParameter("Department", department);
		}
	}

	public List<AnswerImageURLList> getAnswerImageURLLists() {
		return this.answerImageURLLists;
	}

	public void setAnswerImageURLLists(List<AnswerImageURLList> answerImageURLLists) {
		this.answerImageURLLists = answerImageURLLists;	
		if (answerImageURLLists != null) {
			for (int depth1 = 0; depth1 < answerImageURLLists.size(); depth1++) {
				putBodyParameter("AnswerImageURLList." + (depth1 + 1) + ".AnswerImageURL" , answerImageURLLists.get(depth1).getAnswerImageURL());
			}
		}	
	}

	public String getQuestionType() {
		return this.questionType;
	}

	public void setQuestionType(String questionType) {
		this.questionType = questionType;
		if(questionType != null){
			putBodyParameter("QuestionType", questionType);
		}
	}

	public String getOrgId() {
		return this.orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
		if(orgId != null){
			putBodyParameter("OrgId", orgId);
		}
	}

	public static class AnswerImageDataList {

		private String answerImageData;

		public String getAnswerImageData() {
			return this.answerImageData;
		}

		public void setAnswerImageData(String answerImageData) {
			this.answerImageData = answerImageData;
		}
	}

	public static class AnswerTextList {

		private String answerText;

		public String getAnswerText() {
			return this.answerText;
		}

		public void setAnswerText(String answerText) {
			this.answerText = answerText;
		}
	}

	public static class AnswerImageURLList {

		private String answerImageURL;

		public String getAnswerImageURL() {
			return this.answerImageURL;
		}

		public void setAnswerImageURL(String answerImageURL) {
			this.answerImageURL = answerImageURL;
		}
	}

	@Override
	public Class<RunMedQAResponse> getResponseClass() {
		return RunMedQAResponse.class;
	}

}
