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

package com.aliyuncs.mns_open.model.v20220119;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mns_open.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SubscribeRequest extends RpcAcsRequest<SubscribeResponse> {
	   

	private String topicName;

	private String messageTag;

	private String endpoint;

	private String subscriptionName;

	private String notifyStrategy;

	private String notifyContentFormat;

	private String pushType;
	public SubscribeRequest() {
		super("Mns-open", "2022-01-19", "Subscribe", "mns");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getEndpoint() {
		return this.endpoint;
	}

	public void setEndpoint(String endpoint) {
		this.endpoint = endpoint;
		if(endpoint != null){
			putQueryParameter("Endpoint", endpoint);
		}
	}

	public String getSubscriptionName() {
		return this.subscriptionName;
	}

	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
		if(subscriptionName != null){
			putQueryParameter("SubscriptionName", subscriptionName);
		}
	}

	public String getNotifyStrategy() {
		return this.notifyStrategy;
	}

	public void setNotifyStrategy(String notifyStrategy) {
		this.notifyStrategy = notifyStrategy;
		if(notifyStrategy != null){
			putQueryParameter("NotifyStrategy", notifyStrategy);
		}
	}

	public String getNotifyContentFormat() {
		return this.notifyContentFormat;
	}

	public void setNotifyContentFormat(String notifyContentFormat) {
		this.notifyContentFormat = notifyContentFormat;
		if(notifyContentFormat != null){
			putQueryParameter("NotifyContentFormat", notifyContentFormat);
		}
	}

	public String getPushType() {
		return this.pushType;
	}

	public void setPushType(String pushType) {
		this.pushType = pushType;
		if(pushType != null){
			putQueryParameter("PushType", pushType);
		}
	}

	@Override
	public Class<SubscribeResponse> getResponseClass() {
		return SubscribeResponse.class;
	}

}
