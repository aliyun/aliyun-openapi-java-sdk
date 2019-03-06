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

package com.aliyuncs.actiontrail.model.v20171204;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class LookupEventsRequest extends RpcAcsRequest<LookupEventsResponse> {
	
	public LookupEventsRequest() {
		super("Actiontrail", "2017-12-04", "LookupEvents");
	}

	private String request;

	private String eventAccessKeyId;

	private String endTime;

	private String eventRW;

	private String startTime;

	private String resourceType;

	private String eventName;

	private String nextToken;

	private String maxResults;

	private String eventType;

	private String serviceName;

	private String resourceName;

	private String event;

	private String user;

	public String getRequest() {
		return this.request;
	}

	public void setRequest(String request) {
		this.request = request;
		if(request != null){
			putQueryParameter("Request", request);
		}
	}

	public String getEventAccessKeyId() {
		return this.eventAccessKeyId;
	}

	public void setEventAccessKeyId(String eventAccessKeyId) {
		this.eventAccessKeyId = eventAccessKeyId;
		if(eventAccessKeyId != null){
			putQueryParameter("EventAccessKeyId", eventAccessKeyId);
		}
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getEventRW() {
		return this.eventRW;
	}

	public void setEventRW(String eventRW) {
		this.eventRW = eventRW;
		if(eventRW != null){
			putQueryParameter("EventRW", eventRW);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getEventName() {
		return this.eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
		if(eventName != null){
			putQueryParameter("EventName", eventName);
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

	public String getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(String maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults);
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

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
		}
	}

	public String getResourceName() {
		return this.resourceName;
	}

	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
		if(resourceName != null){
			putQueryParameter("ResourceName", resourceName);
		}
	}

	public String getEvent() {
		return this.event;
	}

	public void setEvent(String event) {
		this.event = event;
		if(event != null){
			putQueryParameter("Event", event);
		}
	}

	public String getUser() {
		return this.user;
	}

	public void setUser(String user) {
		this.user = user;
		if(user != null){
			putQueryParameter("User", user);
		}
	}

	@Override
	public Class<LookupEventsResponse> getResponseClass() {
		return LookupEventsResponse.class;
	}

}
