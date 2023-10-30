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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SendLiveMessageUserRequest extends RpcAcsRequest<SendLiveMessageUserResponse> {
	   

	private String dataCenter;

	private String msgTid;

	private String body;

	private String senderId;

	private String receiverId;

	private String appId;

	private String senderInfo;

	private Long msgType;
	public SendLiveMessageUserRequest() {
		super("live", "2016-11-01", "SendLiveMessageUser", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDataCenter() {
		return this.dataCenter;
	}

	public void setDataCenter(String dataCenter) {
		this.dataCenter = dataCenter;
		if(dataCenter != null){
			putQueryParameter("DataCenter", dataCenter);
		}
	}

	public String getMsgTid() {
		return this.msgTid;
	}

	public void setMsgTid(String msgTid) {
		this.msgTid = msgTid;
		if(msgTid != null){
			putQueryParameter("MsgTid", msgTid);
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putQueryParameter("Body", body);
		}
	}

	public String getSenderId() {
		return this.senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
		if(senderId != null){
			putQueryParameter("SenderId", senderId);
		}
	}

	public String getReceiverId() {
		return this.receiverId;
	}

	public void setReceiverId(String receiverId) {
		this.receiverId = receiverId;
		if(receiverId != null){
			putQueryParameter("ReceiverId", receiverId);
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

	public String getSenderInfo() {
		return this.senderInfo;
	}

	public void setSenderInfo(String senderInfo) {
		this.senderInfo = senderInfo;
		if(senderInfo != null){
			putQueryParameter("SenderInfo", senderInfo);
		}
	}

	public Long getMsgType() {
		return this.msgType;
	}

	public void setMsgType(Long msgType) {
		this.msgType = msgType;
		if(msgType != null){
			putQueryParameter("MsgType", msgType.toString());
		}
	}

	@Override
	public Class<SendLiveMessageUserResponse> getResponseClass() {
		return SendLiveMessageUserResponse.class;
	}

}
