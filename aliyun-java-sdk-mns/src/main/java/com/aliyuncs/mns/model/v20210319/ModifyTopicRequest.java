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
public class ModifyTopicRequest extends RpcAcsRequest<ModifyTopicResponse> {
	   

	private String agent;

	private String topicName;

	private String consoleSessionId;

	private Long maxMessageSize;

	private Boolean enableLogging;
	public ModifyTopicRequest() {
		super("mns", "2021-03-19", "ModifyTopic");
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

	public String getConsoleSessionId() {
		return this.consoleSessionId;
	}

	public void setConsoleSessionId(String consoleSessionId) {
		this.consoleSessionId = consoleSessionId;
		if(consoleSessionId != null){
			putQueryParameter("ConsoleSessionId", consoleSessionId);
		}
	}

	public Long getMaxMessageSize() {
		return this.maxMessageSize;
	}

	public void setMaxMessageSize(Long maxMessageSize) {
		this.maxMessageSize = maxMessageSize;
		if(maxMessageSize != null){
			putQueryParameter("MaxMessageSize", maxMessageSize.toString());
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

	@Override
	public Class<ModifyTopicResponse> getResponseClass() {
		return ModifyTopicResponse.class;
	}

}
