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

package com.aliyuncs.elasticsearch.model.v20170613;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.elasticsearch.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListInstanceHistoryEventsRequest extends RoaAcsRequest<ListInstanceHistoryEventsResponse> {
	   

	private String eventFinashEndTime;

	private String instanceId;

	private Integer size;

	private String eventExecuteStartTime;

	private String eventFinashStartTime;

	private String nodeIP;

	private Integer page;

	private String eventCreateEndTime;

	private String body;

	private String eventCreateStartTime;

	private String eventExecuteEndTime;
	public ListInstanceHistoryEventsRequest() {
		super("elasticsearch", "2017-06-13", "ListInstanceHistoryEvents", "elasticsearch");
		setUriPattern("/openapi/events");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getEventFinashEndTime() {
		return this.eventFinashEndTime;
	}

	public void setEventFinashEndTime(String eventFinashEndTime) {
		this.eventFinashEndTime = eventFinashEndTime;
		if(eventFinashEndTime != null){
			putQueryParameter("eventFinashEndTime", eventFinashEndTime);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("instanceId", instanceId);
		}
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
		if(size != null){
			putQueryParameter("size", size.toString());
		}
	}

	public String getEventExecuteStartTime() {
		return this.eventExecuteStartTime;
	}

	public void setEventExecuteStartTime(String eventExecuteStartTime) {
		this.eventExecuteStartTime = eventExecuteStartTime;
		if(eventExecuteStartTime != null){
			putQueryParameter("eventExecuteStartTime", eventExecuteStartTime);
		}
	}

	public String getEventFinashStartTime() {
		return this.eventFinashStartTime;
	}

	public void setEventFinashStartTime(String eventFinashStartTime) {
		this.eventFinashStartTime = eventFinashStartTime;
		if(eventFinashStartTime != null){
			putQueryParameter("eventFinashStartTime", eventFinashStartTime);
		}
	}

	public String getNodeIP() {
		return this.nodeIP;
	}

	public void setNodeIP(String nodeIP) {
		this.nodeIP = nodeIP;
		if(nodeIP != null){
			putQueryParameter("nodeIP", nodeIP);
		}
	}

	public Integer getPage() {
		return this.page;
	}

	public void setPage(Integer page) {
		this.page = page;
		if(page != null){
			putQueryParameter("page", page.toString());
		}
	}

	public String getEventCreateEndTime() {
		return this.eventCreateEndTime;
	}

	public void setEventCreateEndTime(String eventCreateEndTime) {
		this.eventCreateEndTime = eventCreateEndTime;
		if(eventCreateEndTime != null){
			putQueryParameter("eventCreateEndTime", eventCreateEndTime);
		}
	}

	public String getBody() {
		return this.body;
	}

	public void setBody(String body) {
		this.body = body;
		if(body != null){
			putBodyParameter("body", body);
		}
	}

	public String getEventCreateStartTime() {
		return this.eventCreateStartTime;
	}

	public void setEventCreateStartTime(String eventCreateStartTime) {
		this.eventCreateStartTime = eventCreateStartTime;
		if(eventCreateStartTime != null){
			putQueryParameter("eventCreateStartTime", eventCreateStartTime);
		}
	}

	public String getEventExecuteEndTime() {
		return this.eventExecuteEndTime;
	}

	public void setEventExecuteEndTime(String eventExecuteEndTime) {
		this.eventExecuteEndTime = eventExecuteEndTime;
		if(eventExecuteEndTime != null){
			putQueryParameter("eventExecuteEndTime", eventExecuteEndTime);
		}
	}

	@Override
	public Class<ListInstanceHistoryEventsResponse> getResponseClass() {
		return ListInstanceHistoryEventsResponse.class;
	}

}
