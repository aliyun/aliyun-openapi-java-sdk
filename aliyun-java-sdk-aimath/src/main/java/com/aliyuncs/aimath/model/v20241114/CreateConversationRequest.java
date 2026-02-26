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

package com.aliyuncs.aimath.model.v20241114;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateConversationRequest extends RpcAcsRequest<CreateConversationResponse> {
	   

	private String outerBizId;

	private String userId;

	private String exerciseAnswer;

	private String exerciseType;

	private String exerciseContent;

	private String exerciseAnalysis;
	public CreateConversationRequest() {
		super("AIMath", "2024-11-14", "CreateConversation");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getOuterBizId() {
		return this.outerBizId;
	}

	public void setOuterBizId(String outerBizId) {
		this.outerBizId = outerBizId;
		if(outerBizId != null){
			putBodyParameter("OuterBizId", outerBizId);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putBodyParameter("UserId", userId);
		}
	}

	public String getExerciseAnswer() {
		return this.exerciseAnswer;
	}

	public void setExerciseAnswer(String exerciseAnswer) {
		this.exerciseAnswer = exerciseAnswer;
		if(exerciseAnswer != null){
			putBodyParameter("ExerciseAnswer", exerciseAnswer);
		}
	}

	public String getExerciseType() {
		return this.exerciseType;
	}

	public void setExerciseType(String exerciseType) {
		this.exerciseType = exerciseType;
		if(exerciseType != null){
			putBodyParameter("ExerciseType", exerciseType);
		}
	}

	public String getExerciseContent() {
		return this.exerciseContent;
	}

	public void setExerciseContent(String exerciseContent) {
		this.exerciseContent = exerciseContent;
		if(exerciseContent != null){
			putBodyParameter("ExerciseContent", exerciseContent);
		}
	}

	public String getExerciseAnalysis() {
		return this.exerciseAnalysis;
	}

	public void setExerciseAnalysis(String exerciseAnalysis) {
		this.exerciseAnalysis = exerciseAnalysis;
		if(exerciseAnalysis != null){
			putBodyParameter("ExerciseAnalysis", exerciseAnalysis);
		}
	}

	@Override
	public Class<CreateConversationResponse> getResponseClass() {
		return CreateConversationResponse.class;
	}

}
