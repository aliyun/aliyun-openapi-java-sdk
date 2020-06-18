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

package com.aliyuncs.aliyuncvc.model.v20190919;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aliyuncvc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateUserEvaluationsRequest extends RpcAcsRequest<CreateUserEvaluationsResponse> {
	   

	private String memo;

	private String description;

	private Long createDate;

	private String memberUUID;

	private String userId;

	private String evaluation;

	private String score;

	private String meetingUUID;

	private String appId;
	public CreateUserEvaluationsRequest() {
		super("aliyuncvc", "2019-09-19", "CreateUserEvaluations", "aliyuncvc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMemo() {
		return this.memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
		if(memo != null){
			putQueryParameter("Memo", memo);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public Long getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Long createDate) {
		this.createDate = createDate;
		if(createDate != null){
			putQueryParameter("CreateDate", createDate.toString());
		}
	}

	public String getMemberUUID() {
		return this.memberUUID;
	}

	public void setMemberUUID(String memberUUID) {
		this.memberUUID = memberUUID;
		if(memberUUID != null){
			putQueryParameter("MemberUUID", memberUUID);
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
	}

	public String getEvaluation() {
		return this.evaluation;
	}

	public void setEvaluation(String evaluation) {
		this.evaluation = evaluation;
		if(evaluation != null){
			putQueryParameter("Evaluation", evaluation);
		}
	}

	public String getScore() {
		return this.score;
	}

	public void setScore(String score) {
		this.score = score;
		if(score != null){
			putQueryParameter("Score", score);
		}
	}

	public String getMeetingUUID() {
		return this.meetingUUID;
	}

	public void setMeetingUUID(String meetingUUID) {
		this.meetingUUID = meetingUUID;
		if(meetingUUID != null){
			putQueryParameter("MeetingUUID", meetingUUID);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId);
		}
	}

	@Override
	public Class<CreateUserEvaluationsResponse> getResponseClass() {
		return CreateUserEvaluationsResponse.class;
	}

}
