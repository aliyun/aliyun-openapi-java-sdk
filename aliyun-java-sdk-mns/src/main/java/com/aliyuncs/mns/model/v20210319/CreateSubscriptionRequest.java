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
public class CreateSubscriptionRequest extends RpcAcsRequest<CreateSubscriptionResponse> {
	   

	private String agent;

	private String topicName;

	private String messageTag;

	private String consoleSessionId;

	private String endpoint;

	private Long messageRetentionPeriod;

	private String subscriptionName;

	private String notifyStrategy;

	private String notifyContentFormat;

	private Long maximumMessageSize;

	private String pushType;
	public CreateSubscriptionRequest() {
		super("mns", "2021-03-19", "CreateSubscription");
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

	public String getConsoleSessionId() {
		return this.consoleSessionId;
	}

	public void setConsoleSessionId(String consoleSessionId) {
		this.consoleSessionId = consoleSessionId;
		if(consoleSessionId != null){
			putQueryParameter("ConsoleSessionId", consoleSessionId);
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

	public Long getMessageRetentionPeriod() {
		return this.messageRetentionPeriod;
	}

	public void setMessageRetentionPeriod(Long messageRetentionPeriod) {
		this.messageRetentionPeriod = messageRetentionPeriod;
		if(messageRetentionPeriod != null){
			putQueryParameter("MessageRetentionPeriod", messageRetentionPeriod.toString());
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

	public Long getMaximumMessageSize() {
		return this.maximumMessageSize;
	}

	public void setMaximumMessageSize(Long maximumMessageSize) {
		this.maximumMessageSize = maximumMessageSize;
		if(maximumMessageSize != null){
			putQueryParameter("MaximumMessageSize", maximumMessageSize.toString());
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
	public Class<CreateSubscriptionResponse> getResponseClass() {
		return CreateSubscriptionResponse.class;
	}

}
