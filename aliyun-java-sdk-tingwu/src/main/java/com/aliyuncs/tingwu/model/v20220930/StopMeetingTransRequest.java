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

package com.aliyuncs.tingwu.model.v20220930;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StopMeetingTransRequest extends RoaAcsRequest<StopMeetingTransResponse> {
	   

	private String meetingId;

	private String body;
	public StopMeetingTransRequest() {
		super("tingwu", "2022-09-30", "StopMeetingTrans", "tingwupaas");
		setUriPattern("/openapi/meeting-trans/[MeetingId]/stop");
		setMethod(MethodType.POST);
	}

	public String getMeetingId() {
		return this.meetingId;
	}

	public void setMeetingId(String meetingId) {
		this.meetingId = meetingId;
		if(meetingId != null){
			putPathParameter("MeetingId", meetingId);
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
	}

	@Override
	public Class<StopMeetingTransResponse> getResponseClass() {
		return StopMeetingTransResponse.class;
	}

}
