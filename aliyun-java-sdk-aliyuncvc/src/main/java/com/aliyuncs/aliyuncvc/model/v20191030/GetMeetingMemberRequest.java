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
public class GetMeetingMemberRequest extends RpcAcsRequest<GetMeetingMemberResponse> {
	   

	private String meetingUUID;
	public GetMeetingMemberRequest() {
		super("aliyuncvc", "2019-10-30", "GetMeetingMember", "aliyuncvc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	@Override
	public Class<GetMeetingMemberResponse> getResponseClass() {
		return GetMeetingMemberResponse.class;
	}

}
