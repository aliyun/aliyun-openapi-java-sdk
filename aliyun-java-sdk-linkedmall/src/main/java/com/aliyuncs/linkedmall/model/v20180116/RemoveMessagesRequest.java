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

package com.aliyuncs.linkedmall.model.v20180116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.linkedmall.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class RemoveMessagesRequest extends RpcAcsRequest<RemoveMessagesResponse> {
	   

	private String extJson;

	private String bizId;

	private String messageIds;
	public RemoveMessagesRequest() {
		super("linkedmall", "2018-01-16", "RemoveMessages", "linkedmall");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtJson() {
		return this.extJson;
	}

	public void setExtJson(String extJson) {
		this.extJson = extJson;
		if(extJson != null){
			putQueryParameter("ExtJson", extJson);
		}
	}

	public String getBizId() {
		return this.bizId;
	}

	public void setBizId(String bizId) {
		this.bizId = bizId;
		if(bizId != null){
			putQueryParameter("BizId", bizId);
		}
	}

	public String getMessageIds() {
		return this.messageIds;
	}

	public void setMessageIds(String messageIds) {
		this.messageIds = messageIds;
		if(messageIds != null){
			putQueryParameter("MessageIds", messageIds);
		}
	}

	@Override
	public Class<RemoveMessagesResponse> getResponseClass() {
		return RemoveMessagesResponse.class;
	}

}
