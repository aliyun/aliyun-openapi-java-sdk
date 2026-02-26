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
public class DeleteMessageRequest extends RpcAcsRequest<DeleteMessageResponse> {
	   

	private String queueName;

	private String agent;

	private String receiptHandle;

	private String consoleSessionId;
	public DeleteMessageRequest() {
		super("mns", "2021-03-19", "DeleteMessage");
		setMethod(MethodType.POST);
	}

	public String getQueueName() {
		return this.queueName;
	}

	public void setQueueName(String queueName) {
		this.queueName = queueName;
		if(queueName != null){
			putQueryParameter("QueueName", queueName);
		}
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

	public String getReceiptHandle() {
		return this.receiptHandle;
	}

	public void setReceiptHandle(String receiptHandle) {
		this.receiptHandle = receiptHandle;
		if(receiptHandle != null){
			putQueryParameter("ReceiptHandle", receiptHandle);
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

	@Override
	public Class<DeleteMessageResponse> getResponseClass() {
		return DeleteMessageResponse.class;
	}

}
