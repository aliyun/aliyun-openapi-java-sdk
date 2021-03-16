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

package com.aliyuncs.cccxspaceinner.model.v20191227;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class SendMessageRequest extends RpcAcsRequest<SendMessageResponse> {
	   

	private String sid;

	private String senderId;

	private Integer senderType;

	private String senderName;

	private String head;

	private String msgType;

	private String content;

	private String msgKey;
	public SendMessageRequest() {
		super("CCCXSpaceInner", "2019-12-27", "SendMessage");
		setMethod(MethodType.POST);
	}

	public String getSid() {
		return this.sid;
	}

	public void setSid(String sid) {
		this.sid = sid;
		if(sid != null){
			putBodyParameter("Sid", sid);
		}
	}

	public String getSenderId() {
		return this.senderId;
	}

	public void setSenderId(String senderId) {
		this.senderId = senderId;
		if(senderId != null){
			putBodyParameter("SenderId", senderId);
		}
	}

	public Integer getSenderType() {
		return this.senderType;
	}

	public void setSenderType(Integer senderType) {
		this.senderType = senderType;
		if(senderType != null){
			putBodyParameter("SenderType", senderType.toString());
		}
	}

	public String getSenderName() {
		return this.senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
		if(senderName != null){
			putBodyParameter("SenderName", senderName);
		}
	}

	public String getHead() {
		return this.head;
	}

	public void setHead(String head) {
		this.head = head;
		if(head != null){
			putBodyParameter("Head", head);
		}
	}

	public String getMsgType() {
		return this.msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
		if(msgType != null){
			putBodyParameter("MsgType", msgType);
		}
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putBodyParameter("Content", content);
		}
	}

	public String getMsgKey() {
		return this.msgKey;
	}

	public void setMsgKey(String msgKey) {
		this.msgKey = msgKey;
		if(msgKey != null){
			putBodyParameter("MsgKey", msgKey);
		}
	}

	@Override
	public Class<SendMessageResponse> getResponseClass() {
		return SendMessageResponse.class;
	}

}
