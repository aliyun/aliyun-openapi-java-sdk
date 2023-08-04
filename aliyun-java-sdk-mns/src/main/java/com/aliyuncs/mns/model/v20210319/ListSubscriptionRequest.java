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
public class ListSubscriptionRequest extends RpcAcsRequest<ListSubscriptionResponse> {
	   

	private String agent;

	private String topicName;

	private Long pageNum;

	private String consoleSessionId;

	private Long pageSize;

	private String subscriptionName;
	public ListSubscriptionRequest() {
		super("mns", "2021-03-19", "ListSubscription");
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

	public Long getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Long pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
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

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	@Override
	public Class<ListSubscriptionResponse> getResponseClass() {
		return ListSubscriptionResponse.class;
	}

}
