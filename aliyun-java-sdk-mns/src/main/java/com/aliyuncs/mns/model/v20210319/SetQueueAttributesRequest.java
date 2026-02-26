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
public class SetQueueAttributesRequest extends RpcAcsRequest<SetQueueAttributesResponse> {
	   

	private String queueName;

	private String agent;

	private String consoleSessionId;

	private Long messageRetentionPeriod;

	private Boolean enableLogging;

	private Long visibilityTimeout;

	private Long delaySeconds;

	private Long maximumMessageSize;

	private Long pollingWaitSeconds;
	public SetQueueAttributesRequest() {
		super("mns", "2021-03-19", "SetQueueAttributes");
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

	public String getConsoleSessionId() {
		return this.consoleSessionId;
	}

	public void setConsoleSessionId(String consoleSessionId) {
		this.consoleSessionId = consoleSessionId;
		if(consoleSessionId != null){
			putQueryParameter("ConsoleSessionId", consoleSessionId);
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

	public Boolean getEnableLogging() {
		return this.enableLogging;
	}

	public void setEnableLogging(Boolean enableLogging) {
		this.enableLogging = enableLogging;
		if(enableLogging != null){
			putQueryParameter("EnableLogging", enableLogging.toString());
		}
	}

	public Long getVisibilityTimeout() {
		return this.visibilityTimeout;
	}

	public void setVisibilityTimeout(Long visibilityTimeout) {
		this.visibilityTimeout = visibilityTimeout;
		if(visibilityTimeout != null){
			putQueryParameter("VisibilityTimeout", visibilityTimeout.toString());
		}
	}

	public Long getDelaySeconds() {
		return this.delaySeconds;
	}

	public void setDelaySeconds(Long delaySeconds) {
		this.delaySeconds = delaySeconds;
		if(delaySeconds != null){
			putQueryParameter("DelaySeconds", delaySeconds.toString());
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

	public Long getPollingWaitSeconds() {
		return this.pollingWaitSeconds;
	}

	public void setPollingWaitSeconds(Long pollingWaitSeconds) {
		this.pollingWaitSeconds = pollingWaitSeconds;
		if(pollingWaitSeconds != null){
			putQueryParameter("PollingWaitSeconds", pollingWaitSeconds.toString());
		}
	}

	@Override
	public Class<SetQueueAttributesResponse> getResponseClass() {
		return SetQueueAttributesResponse.class;
	}

}
