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

package com.aliyuncs.rtc.model.v20180111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateConferenceRequest extends RpcAcsRequest<CreateConferenceResponse> {
	
	public CreateConferenceRequest() {
		super("rtc", "2018-01-11", "CreateConference", "rtc");
	}

	private String clientToken;

	private String startTime;

	private String type;

	private String conferenceName;

	private Long ownerId;

	private String appId;

	private Integer remindNotice;

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getConferenceName() {
		return this.conferenceName;
	}

	public void setConferenceName(String conferenceName) {
		this.conferenceName = conferenceName;
		if(conferenceName != null){
			putQueryParameter("ConferenceName", conferenceName);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
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

	public Integer getRemindNotice() {
		return this.remindNotice;
	}

	public void setRemindNotice(Integer remindNotice) {
		this.remindNotice = remindNotice;
		if(remindNotice != null){
			putQueryParameter("RemindNotice", remindNotice.toString());
		}
	}

	@Override
	public Class<CreateConferenceResponse> getResponseClass() {
		return CreateConferenceResponse.class;
	}

}
