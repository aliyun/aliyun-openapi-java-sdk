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

package com.aliyuncs.ccc.model.v20170705;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ccc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAgentEventsRequest extends RpcAcsRequest<ListAgentEventsResponse> {
	
	public ListAgentEventsRequest() {
		super("CCC", "2017-07-05", "ListAgentEvents");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long startTime;

	private Long stopTime;

	private List<String> ramIds;

	private String instanceId;

	private List<String> events;

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public Long getStopTime() {
		return this.stopTime;
	}

	public void setStopTime(Long stopTime) {
		this.stopTime = stopTime;
		if(stopTime != null){
			putQueryParameter("StopTime", stopTime.toString());
		}
	}

	public List<String> getRamIds() {
		return this.ramIds;
	}

	public void setRamIds(List<String> ramIds) {
		this.ramIds = ramIds;	
		if (ramIds != null) {
			for (int i = 0; i < ramIds.size(); i++) {
				putQueryParameter("RamId." + (i + 1) , ramIds.get(i));
			}
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

	public List<String> getEvents() {
		return this.events;
	}

	public void setEvents(List<String> events) {
		this.events = events;	
		if (events != null) {
			for (int i = 0; i < events.size(); i++) {
				putQueryParameter("Event." + (i + 1) , events.get(i));
			}
		}	
	}

	@Override
	public Class<ListAgentEventsResponse> getResponseClass() {
		return ListAgentEventsResponse.class;
	}

}
