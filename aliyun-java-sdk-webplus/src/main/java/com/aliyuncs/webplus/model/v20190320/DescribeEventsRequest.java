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

package com.aliyuncs.webplus.model.v20190320;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.webplus.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeEventsRequest extends RoaAcsRequest<DescribeEventsResponse> {
	
	public DescribeEventsRequest() {
		super("WebPlus", "2019-03-20", "DescribeEvents", "webx");
		setUriPattern("/pop/v1/wam/event");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Boolean lastChangeEvents;

	private Boolean reverseByTimestamp;

	private Integer pageSize;

	private Long endTime;

	private String envId;

	private Long startTime;

	private String changeId;

	private Integer pageNumber;

	public Boolean getLastChangeEvents() {
		return this.lastChangeEvents;
	}

	public void setLastChangeEvents(Boolean lastChangeEvents) {
		this.lastChangeEvents = lastChangeEvents;
		if(lastChangeEvents != null){
			putQueryParameter("LastChangeEvents", lastChangeEvents.toString());
		}
	}

	public Boolean getReverseByTimestamp() {
		return this.reverseByTimestamp;
	}

	public void setReverseByTimestamp(Boolean reverseByTimestamp) {
		this.reverseByTimestamp = reverseByTimestamp;
		if(reverseByTimestamp != null){
			putQueryParameter("ReverseByTimestamp", reverseByTimestamp.toString());
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

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
		}
	}

	public String getEnvId() {
		return this.envId;
	}

	public void setEnvId(String envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("EnvId", envId);
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

	public String getChangeId() {
		return this.changeId;
	}

	public void setChangeId(String changeId) {
		this.changeId = changeId;
		if(changeId != null){
			putQueryParameter("ChangeId", changeId);
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
	public Class<DescribeEventsResponse> getResponseClass() {
		return DescribeEventsResponse.class;
	}

}
