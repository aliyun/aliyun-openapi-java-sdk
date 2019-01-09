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

package com.aliyuncs.arms.model.v20181219;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class SearchTracesRequest extends RpcAcsRequest<SearchTracesResponse> {
	
	public SearchTracesRequest() {
		super("ARMS", "2018-12-19", "SearchTraces");
	}

	private String tag1;

	private String operationName;

	private String appType;

	private Long endTime;

	private String serviceName;

	private Long startTime;

	private Long minDuration;

	private String tag2;

	public String getTag1() {
		return this.tag1;
	}

	public void setTag1(String tag1) {
		this.tag1 = tag1;
		if(tag1 != null){
			putQueryParameter("Tag1", tag1);
		}
	}

	public String getOperationName() {
		return this.operationName;
	}

	public void setOperationName(String operationName) {
		this.operationName = operationName;
		if(operationName != null){
			putQueryParameter("OperationName", operationName);
		}
	}

	public String getAppType() {
		return this.appType;
	}

	public void setAppType(String appType) {
		this.appType = appType;
		if(appType != null){
			putQueryParameter("AppType", appType);
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

	public String getServiceName() {
		return this.serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
		if(serviceName != null){
			putQueryParameter("ServiceName", serviceName);
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

	public Long getMinDuration() {
		return this.minDuration;
	}

	public void setMinDuration(Long minDuration) {
		this.minDuration = minDuration;
		if(minDuration != null){
			putQueryParameter("MinDuration", minDuration.toString());
		}
	}

	public String getTag2() {
		return this.tag2;
	}

	public void setTag2(String tag2) {
		this.tag2 = tag2;
		if(tag2 != null){
			putQueryParameter("Tag2", tag2);
		}
	}

	@Override
	public Class<SearchTracesResponse> getResponseClass() {
		return SearchTracesResponse.class;
	}

}
