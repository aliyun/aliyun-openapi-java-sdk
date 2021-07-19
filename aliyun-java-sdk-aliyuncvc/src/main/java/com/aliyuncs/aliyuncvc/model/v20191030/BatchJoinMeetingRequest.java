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

package com.aliyuncs.aliyuncvc.model.v20191030;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.aliyuncvc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class BatchJoinMeetingRequest extends RpcAcsRequest<BatchJoinMeetingResponse> {
	   

	private String rtcEngine;

	private String userId;

	private String password;

	private String meetingCode;
	public BatchJoinMeetingRequest() {
		super("aliyuncvc", "2019-10-30", "BatchJoinMeeting", "aliyuncvc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRtcEngine() {
		return this.rtcEngine;
	}

	public void setRtcEngine(String rtcEngine) {
		this.rtcEngine = rtcEngine;
		if(rtcEngine != null){
			putBodyParameter("RtcEngine", rtcEngine);
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putBodyParameter("Password", password);
		}
	}

	public String getMeetingCode() {
		return this.meetingCode;
	}

	public void setMeetingCode(String meetingCode) {
		this.meetingCode = meetingCode;
		if(meetingCode != null){
			putBodyParameter("MeetingCode", meetingCode);
		}
	}

	@Override
	public Class<BatchJoinMeetingResponse> getResponseClass() {
		return BatchJoinMeetingResponse.class;
	}

}
