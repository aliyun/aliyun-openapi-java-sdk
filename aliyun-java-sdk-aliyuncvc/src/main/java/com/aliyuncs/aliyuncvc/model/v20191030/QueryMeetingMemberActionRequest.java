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
public class QueryMeetingMemberActionRequest extends RpcAcsRequest<QueryMeetingMemberActionResponse> {
	   

	private String meetingUnitKey;

	private Long endTime;

	private String memberUUID;

	private Long startTime;

	private String meetingUUID;
	public QueryMeetingMemberActionRequest() {
		super("aliyuncvc", "2019-10-30", "QueryMeetingMemberAction", "aliyuncvc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMeetingUnitKey() {
		return this.meetingUnitKey;
	}

	public void setMeetingUnitKey(String meetingUnitKey) {
		this.meetingUnitKey = meetingUnitKey;
		if(meetingUnitKey != null){
			putBodyParameter("MeetingUnitKey", meetingUnitKey);
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public String getMemberUUID() {
		return this.memberUUID;
	}

	public void setMemberUUID(String memberUUID) {
		this.memberUUID = memberUUID;
		if(memberUUID != null){
			putBodyParameter("MemberUUID", memberUUID);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public String getMeetingUUID() {
		return this.meetingUUID;
	}

	public void setMeetingUUID(String meetingUUID) {
		this.meetingUUID = meetingUUID;
		if(meetingUUID != null){
			putBodyParameter("MeetingUUID", meetingUUID);
		}
	}

	@Override
	public Class<QueryMeetingMemberActionResponse> getResponseClass() {
		return QueryMeetingMemberActionResponse.class;
	}

}
