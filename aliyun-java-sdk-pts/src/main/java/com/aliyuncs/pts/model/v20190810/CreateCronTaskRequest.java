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

package com.aliyuncs.pts.model.v20190810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCronTaskRequest extends RpcAcsRequest<CreateCronTaskResponse> {
	   

	private String cronExpression;

	private String executeDate;

	private String executeTime;

	private Integer frequency;

	private String grains;

	private Integer advance;

	private Integer unit;

	private String noticeUsers;

	private String noticeType;

	private String sceneId;

	private Boolean isEditing;

	private String noticeMethod;
	public CreateCronTaskRequest() {
		super("PTS", "2019-08-10", "CreateCronTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCronExpression() {
		return this.cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
		if(cronExpression != null){
			putQueryParameter("CronExpression", cronExpression);
		}
	}

	public String getExecuteDate() {
		return this.executeDate;
	}

	public void setExecuteDate(String executeDate) {
		this.executeDate = executeDate;
		if(executeDate != null){
			putQueryParameter("ExecuteDate", executeDate);
		}
	}

	public String getExecuteTime() {
		return this.executeTime;
	}

	public void setExecuteTime(String executeTime) {
		this.executeTime = executeTime;
		if(executeTime != null){
			putQueryParameter("ExecuteTime", executeTime);
		}
	}

	public Integer getFrequency() {
		return this.frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
		if(frequency != null){
			putQueryParameter("Frequency", frequency.toString());
		}
	}

	public String getGrains() {
		return this.grains;
	}

	public void setGrains(String grains) {
		this.grains = grains;
		if(grains != null){
			putQueryParameter("Grains", grains);
		}
	}

	public Integer getAdvance() {
		return this.advance;
	}

	public void setAdvance(Integer advance) {
		this.advance = advance;
		if(advance != null){
			putQueryParameter("Advance", advance.toString());
		}
	}

	public Integer getUnit() {
		return this.unit;
	}

	public void setUnit(Integer unit) {
		this.unit = unit;
		if(unit != null){
			putQueryParameter("Unit", unit.toString());
		}
	}

	public String getNoticeUsers() {
		return this.noticeUsers;
	}

	public void setNoticeUsers(String noticeUsers) {
		this.noticeUsers = noticeUsers;
		if(noticeUsers != null){
			putQueryParameter("NoticeUsers", noticeUsers);
		}
	}

	public String getNoticeType() {
		return this.noticeType;
	}

	public void setNoticeType(String noticeType) {
		this.noticeType = noticeType;
		if(noticeType != null){
			putQueryParameter("NoticeType", noticeType);
		}
	}

	public String getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(String sceneId) {
		this.sceneId = sceneId;
		if(sceneId != null){
			putQueryParameter("SceneId", sceneId);
		}
	}

	public Boolean getIsEditing() {
		return this.isEditing;
	}

	public void setIsEditing(Boolean isEditing) {
		this.isEditing = isEditing;
		if(isEditing != null){
			putQueryParameter("IsEditing", isEditing.toString());
		}
	}

	public String getNoticeMethod() {
		return this.noticeMethod;
	}

	public void setNoticeMethod(String noticeMethod) {
		this.noticeMethod = noticeMethod;
		if(noticeMethod != null){
			putQueryParameter("NoticeMethod", noticeMethod);
		}
	}

	@Override
	public Class<CreateCronTaskResponse> getResponseClass() {
		return CreateCronTaskResponse.class;
	}

}
