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
public class SendMeetingCommandRequest extends RpcAcsRequest<SendMeetingCommandResponse> {
	   

	private String operatorMemberUUID;

	private String memberUUID;

	private Integer sendType;

	private String command;

	private String meetingUUID;
	public SendMeetingCommandRequest() {
		super("aliyuncvc", "2019-10-30", "SendMeetingCommand", "aliyuncvc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOperatorMemberUUID() {
		return this.operatorMemberUUID;
	}

	public void setOperatorMemberUUID(String operatorMemberUUID) {
		this.operatorMemberUUID = operatorMemberUUID;
		if(operatorMemberUUID != null){
			putBodyParameter("OperatorMemberUUID", operatorMemberUUID);
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

	public Integer getSendType() {
		return this.sendType;
	}

	public void setSendType(Integer sendType) {
		this.sendType = sendType;
		if(sendType != null){
			putBodyParameter("SendType", sendType.toString());
		}
	}

	public String getCommand() {
		return this.command;
	}

	public void setCommand(String command) {
		this.command = command;
		if(command != null){
			putBodyParameter("Command", command);
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

	@Override
	public Class<SendMeetingCommandResponse> getResponseClass() {
		return SendMeetingCommandResponse.class;
	}

}
