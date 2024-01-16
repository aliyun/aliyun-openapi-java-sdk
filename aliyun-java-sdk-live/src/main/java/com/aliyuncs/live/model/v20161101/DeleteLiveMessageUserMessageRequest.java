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
public class DeleteLiveMessageUserMessageRequest extends RpcAcsRequest<DeleteLiveMessageUserMessageResponse> {
	   

	private String messageId;

	private String dataCenter;

	private String receiverId;

	private String appId;

	private String deleterId;

	private String deleterInfo;
	public DeleteLiveMessageUserMessageRequest() {
		super("live", "2016-11-01", "DeleteLiveMessageUserMessage", "live");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMessageId() {
		return this.messageId;
	}

	public void setMessageId(String messageId) {
		this.messageId = messageId;
		if(messageId != null){
			putQueryParameter("MessageId", messageId);
		}
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

	public String getDeleterId() {
		return this.deleterId;
	}

	public void setDeleterId(String deleterId) {
		this.deleterId = deleterId;
		if(deleterId != null){
			putQueryParameter("DeleterId", deleterId);
		}
	}

	public String getDeleterInfo() {
		return this.deleterInfo;
	}

	public void setDeleterInfo(String deleterInfo) {
		this.deleterInfo = deleterInfo;
		if(deleterInfo != null){
			putQueryParameter("DeleterInfo", deleterInfo);
		}
	}

	@Override
	public Class<DeleteLiveMessageUserMessageResponse> getResponseClass() {
		return DeleteLiveMessageUserMessageResponse.class;
	}

}
