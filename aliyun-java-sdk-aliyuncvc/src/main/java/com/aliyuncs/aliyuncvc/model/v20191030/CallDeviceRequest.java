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
public class CallDeviceRequest extends RpcAcsRequest<CallDeviceResponse> {
	   

	private String inviteName;

	private String operateUserId;

	private Boolean joinMeetingFlag;

	private String meetingCode;

	private String sN;
	public CallDeviceRequest() {
		super("aliyuncvc", "2019-10-30", "CallDevice", "aliyuncvc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInviteName() {
		return this.inviteName;
	}

	public void setInviteName(String inviteName) {
		this.inviteName = inviteName;
		if(inviteName != null){
			putBodyParameter("InviteName", inviteName);
		}
	}

	public String getOperateUserId() {
		return this.operateUserId;
	}

	public void setOperateUserId(String operateUserId) {
		this.operateUserId = operateUserId;
		if(operateUserId != null){
			putBodyParameter("OperateUserId", operateUserId);
		}
	}

	public Boolean getJoinMeetingFlag() {
		return this.joinMeetingFlag;
	}

	public void setJoinMeetingFlag(Boolean joinMeetingFlag) {
		this.joinMeetingFlag = joinMeetingFlag;
		if(joinMeetingFlag != null){
			putQueryParameter("JoinMeetingFlag", joinMeetingFlag.toString());
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

	public String getSN() {
		return this.sN;
	}

	public void setSN(String sN) {
		this.sN = sN;
		if(sN != null){
			putBodyParameter("SN", sN);
		}
	}

	@Override
	public Class<CallDeviceResponse> getResponseClass() {
		return CallDeviceResponse.class;
	}

}
