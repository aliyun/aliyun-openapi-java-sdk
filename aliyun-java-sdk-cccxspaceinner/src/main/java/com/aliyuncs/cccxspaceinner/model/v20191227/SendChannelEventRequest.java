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
public class SendChannelEventRequest extends RpcAcsRequest<SendChannelEventResponse> {
	   

	private String messageId;

	private String messageBody;
	public SendChannelEventRequest() {
		super("CCCXSpaceInner", "2019-12-27", "SendChannelEvent");
		setMethod(MethodType.POST);
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
		if(messageId != null){
			putBodyParameter("MessageId", messageId);
		}
	}

	public String getMessageBody() {
		return this.messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
		if(messageBody != null){
			putBodyParameter("MessageBody", messageBody);
		}
	}

	@Override
	public Class<SendChannelEventResponse> getResponseClass() {
		return SendChannelEventResponse.class;
	}

}
