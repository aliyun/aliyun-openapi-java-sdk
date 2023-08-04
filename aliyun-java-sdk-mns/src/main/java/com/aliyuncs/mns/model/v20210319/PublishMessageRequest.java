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

package com.aliyuncs.mns.model.v20210319;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PublishMessageRequest extends RpcAcsRequest<PublishMessageResponse> {
	   

	private String agent;

	private String aliyunSmsAttr;

	private String mobilePushAttr;

	private String topicName;

	private String messageTag;

	private String selPushType;

	private String consoleSessionId;

	private String messageBody;

	private String emailAttr;

	private String smsAttr;
	public PublishMessageRequest() {
		super("mns", "2021-03-19", "PublishMessage");
		setMethod(MethodType.POST);
	}

	public String getAgent() {
		return this.agent;
	}

	public void setAgent(String agent) {
		this.agent = agent;
		if(agent != null){
			putQueryParameter("Agent", agent);
		}
	}

	public String getAliyunSmsAttr() {
		return this.aliyunSmsAttr;
	}

	public void setAliyunSmsAttr(String aliyunSmsAttr) {
		this.aliyunSmsAttr = aliyunSmsAttr;
		if(aliyunSmsAttr != null){
			putQueryParameter("AliyunSmsAttr", aliyunSmsAttr);
		}
	}

	public String getMobilePushAttr() {
		return this.mobilePushAttr;
	}

	public void setMobilePushAttr(String mobilePushAttr) {
		this.mobilePushAttr = mobilePushAttr;
		if(mobilePushAttr != null){
			putQueryParameter("MobilePushAttr", mobilePushAttr);
		}
	}

	public String getTopicName() {
		return this.topicName;
	}

	public void setTopicName(String topicName) {
		this.topicName = topicName;
		if(topicName != null){
			putQueryParameter("TopicName", topicName);
		}
	}

	public String getMessageTag() {
		return this.messageTag;
	}

	public void setMessageTag(String messageTag) {
		this.messageTag = messageTag;
		if(messageTag != null){
			putQueryParameter("MessageTag", messageTag);
		}
	}

	public String getSelPushType() {
		return this.selPushType;
	}

	public void setSelPushType(String selPushType) {
		this.selPushType = selPushType;
		if(selPushType != null){
			putQueryParameter("SelPushType", selPushType);
		}
	}

	public String getConsoleSessionId() {
		return this.consoleSessionId;
	}

	public void setConsoleSessionId(String consoleSessionId) {
		this.consoleSessionId = consoleSessionId;
		if(consoleSessionId != null){
			putQueryParameter("ConsoleSessionId", consoleSessionId);
		}
	}

	public String getMessageBody() {
		return this.messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
		if(messageBody != null){
			putQueryParameter("MessageBody", messageBody);
		}
	}

	public String getEmailAttr() {
		return this.emailAttr;
	}

	public void setEmailAttr(String emailAttr) {
		this.emailAttr = emailAttr;
		if(emailAttr != null){
			putQueryParameter("EmailAttr", emailAttr);
		}
	}

	public String getSmsAttr() {
		return this.smsAttr;
	}

	public void setSmsAttr(String smsAttr) {
		this.smsAttr = smsAttr;
		if(smsAttr != null){
			putQueryParameter("SmsAttr", smsAttr);
		}
	}

	@Override
	public Class<PublishMessageResponse> getResponseClass() {
		return PublishMessageResponse.class;
	}

}
