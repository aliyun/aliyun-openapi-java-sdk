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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rtc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RemoveParticipantsRequest extends RpcAcsRequest<RemoveParticipantsResponse> {
	   

	private List<String> participantIdss;

	private String conferenceId;

	private Long ownerId;

	private String appId;
	public RemoveParticipantsRequest() {
		super("rtc", "2018-01-11", "RemoveParticipants", "rtc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getParticipantIdss() {
		return this.participantIdss;
	}

	public void setParticipantIdss(List<String> participantIdss) {
		this.participantIdss = participantIdss;	
		if (participantIdss != null) {
			for (int i = 0; i < participantIdss.size(); i++) {
				putQueryParameter("ParticipantIds." + (i + 1) , participantIdss.get(i));
			}
		}	
	}

	public String getConferenceId() {
		return this.conferenceId;
	}

	public void setConferenceId(String conferenceId) {
		this.conferenceId = conferenceId;
		if(conferenceId != null){
			putQueryParameter("ConferenceId", conferenceId);
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

	@Override
	public Class<RemoveParticipantsResponse> getResponseClass() {
		return RemoveParticipantsResponse.class;
	}

}
