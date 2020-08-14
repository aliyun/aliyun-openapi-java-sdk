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

package com.aliyuncs.idrsservice.model.v20200630;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateTaskGroupRequest extends RpcAcsRequest<CreateTaskGroupResponse> {
	   

	private String clientToken;

	private String expireAt;

	private List<Integer> days;

	private String runnableTimeTo;

	private String triggerPeriod;

	private String groupName;

	private List<String> videoUrls;

	private String appId;

	private String runnableTimeFrom;

	private String ruleId;
	public CreateTaskGroupRequest() {
		super("idrsservice", "2020-06-30", "CreateTaskGroup", "idrsservice");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getExpireAt() {
		return this.expireAt;
	}

	public void setExpireAt(String expireAt) {
		this.expireAt = expireAt;
		if(expireAt != null){
			putQueryParameter("ExpireAt", expireAt);
		}
	}

	public List<Integer> getDays() {
		return this.days;
	}

	public void setDays(List<Integer> days) {
		this.days = days;	
		if (days != null) {
			for (int i = 0; i < days.size(); i++) {
				putQueryParameter("Day." + (i + 1) , days.get(i));
			}
		}	
	}

	public String getRunnableTimeTo() {
		return this.runnableTimeTo;
	}

	public void setRunnableTimeTo(String runnableTimeTo) {
		this.runnableTimeTo = runnableTimeTo;
		if(runnableTimeTo != null){
			putQueryParameter("RunnableTimeTo", runnableTimeTo);
		}
	}

	public String getTriggerPeriod() {
		return this.triggerPeriod;
	}

	public void setTriggerPeriod(String triggerPeriod) {
		this.triggerPeriod = triggerPeriod;
		if(triggerPeriod != null){
			putQueryParameter("TriggerPeriod", triggerPeriod);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public List<String> getVideoUrls() {
		return this.videoUrls;
	}

	public void setVideoUrls(List<String> videoUrls) {
		this.videoUrls = videoUrls;	
		if (videoUrls != null) {
			for (int i = 0; i < videoUrls.size(); i++) {
				putQueryParameter("VideoUrl." + (i + 1) , videoUrls.get(i));
			}
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

	public String getRunnableTimeFrom() {
		return this.runnableTimeFrom;
	}

	public void setRunnableTimeFrom(String runnableTimeFrom) {
		this.runnableTimeFrom = runnableTimeFrom;
		if(runnableTimeFrom != null){
			putQueryParameter("RunnableTimeFrom", runnableTimeFrom);
		}
	}

	public String getRuleId() {
		return this.ruleId;
	}

	public void setRuleId(String ruleId) {
		this.ruleId = ruleId;
		if(ruleId != null){
			putQueryParameter("RuleId", ruleId);
		}
	}

	@Override
	public Class<CreateTaskGroupResponse> getResponseClass() {
		return CreateTaskGroupResponse.class;
	}

}
