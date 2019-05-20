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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListAgentEventsRequest extends RpcAcsRequest<ListAgentEventsResponse> {
	
	public ListAgentEventsRequest() {
		super("CloudCallCenter", "2017-07-05", "ListAgentEvents", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private Integer pageSize;

	private Long startTime;

	private Long stopTime;

	private String event;

	private Long ramId;

	private Integer pageNumber;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
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

	public Long getStopTime() {
		return this.stopTime;
	}

	public void setStopTime(Long stopTime) {
		this.stopTime = stopTime;
		if(stopTime != null){
			putQueryParameter("StopTime", stopTime.toString());
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

	public Long getRamId() {
		return this.ramId;
	}

	public void setRamId(Long ramId) {
		this.ramId = ramId;
		if(ramId != null){
			putQueryParameter("RamId", ramId.toString());
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	@Override
	public Class<ListAgentEventsResponse> getResponseClass() {
		return ListAgentEventsResponse.class;
	}

}
