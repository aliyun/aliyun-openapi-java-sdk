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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryTracedEventsRequest extends RpcAcsRequest<QueryTracedEventsResponse> {
	   

	private String matchedRule;

	private Long startTime;

	private String eventBusName;

	private String eventSource;

	private String nextToken;

	private Integer limit;

	private Long endTime;

	private String eventType;
	public QueryTracedEventsRequest() {
		super("eventbridge", "2020-04-01", "QueryTracedEvents");
		setMethod(MethodType.POST);
	}

	public String getMatchedRule() {
		return this.matchedRule;
	}

	public void setMatchedRule(String matchedRule) {
		this.matchedRule = matchedRule;
		if(matchedRule != null){
			putQueryParameter("MatchedRule", matchedRule);
		}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public String getEventBusName() {
		return this.eventBusName;
	}

	public void setEventBusName(String eventBusName) {
		this.eventBusName = eventBusName;
		if(eventBusName != null){
			putQueryParameter("EventBusName", eventBusName);
		}
	}

	public String getEventSource() {
		return this.eventSource;
	}

	public void setEventSource(String eventSource) {
		this.eventSource = eventSource;
		if(eventSource != null){
			putQueryParameter("EventSource", eventSource);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public Integer getLimit() {
		return this.limit;
	}

	public void setLimit(Integer limit) {
		this.limit = limit;
		if(limit != null){
			putQueryParameter("Limit", limit.toString());
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getEventType() {
		return this.eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
		if(eventType != null){
			putQueryParameter("EventType", eventType);
		}
	}

	@Override
	public Class<QueryTracedEventsResponse> getResponseClass() {
		return QueryTracedEventsResponse.class;
	}

}
