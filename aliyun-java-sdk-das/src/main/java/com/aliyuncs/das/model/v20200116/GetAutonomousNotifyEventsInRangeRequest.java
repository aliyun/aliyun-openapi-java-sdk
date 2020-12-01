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

package com.aliyuncs.das.model.v20200116;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.das.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetAutonomousNotifyEventsInRangeRequest extends RpcAcsRequest<GetAutonomousNotifyEventsInRangeResponse> {
	   

	private String __context;

	private String level;

	private String endTime;

	private String startTime;

	private String instanceId;

	private String eventContext;

	private String minLevel;

	private String pageOffset;

	private String pageSize;

	private String nodeId;
	public GetAutonomousNotifyEventsInRangeRequest() {
		super("DAS", "2020-01-16", "GetAutonomousNotifyEventsInRange", "das");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String get__Context() {
		return this.__context;
	}

	public void set__Context(String __context) {
		this.__context = __context;
		if(__context != null){
			putQueryParameter("__context", __context);
		}
	}

	public String getLevel() {
		return this.level;
	}

	public void setLevel(String level) {
		this.level = level;
		if(level != null){
			putQueryParameter("Level", level);
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

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getEventContext() {
		return this.eventContext;
	}

	public void setEventContext(String eventContext) {
		this.eventContext = eventContext;
		if(eventContext != null){
			putQueryParameter("EventContext", eventContext);
		}
	}

	public String getMinLevel() {
		return this.minLevel;
	}

	public void setMinLevel(String minLevel) {
		this.minLevel = minLevel;
		if(minLevel != null){
			putQueryParameter("MinLevel", minLevel);
		}
	}

	public String getPageOffset() {
		return this.pageOffset;
	}

	public void setPageOffset(String pageOffset) {
		this.pageOffset = pageOffset;
		if(pageOffset != null){
			putQueryParameter("PageOffset", pageOffset);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public String getNodeId() {
		return this.nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
		if(nodeId != null){
			putQueryParameter("NodeId", nodeId);
		}
	}

	@Override
	public Class<GetAutonomousNotifyEventsInRangeResponse> getResponseClass() {
		return GetAutonomousNotifyEventsInRangeResponse.class;
	}

}
