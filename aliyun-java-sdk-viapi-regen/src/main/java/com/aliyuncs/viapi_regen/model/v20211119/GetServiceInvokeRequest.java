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

package com.aliyuncs.viapi_regen.model.v20211119;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.viapi_regen.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetServiceInvokeRequest extends RpcAcsRequest<GetServiceInvokeResponse> {
	   

	private Long startTime;

	private Long id;

	private Long endTime;

	@SerializedName("callerParentIdList")
	private List<String> callerParentIdList;
	public GetServiceInvokeRequest() {
		super("viapi-regen", "2021-11-19", "GetServiceInvoke", "selflearning");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putBodyParameter("StartTime", startTime.toString());
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putBodyParameter("Id", id.toString());
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putBodyParameter("EndTime", endTime.toString());
		}
	}

	public List<String> getCallerParentIdList() {
		return this.callerParentIdList;
	}

	public void setCallerParentIdList(List<String> callerParentIdList) {
		this.callerParentIdList = callerParentIdList;	
		if (callerParentIdList != null) {
			putBodyParameter("CallerParentIdList" , new Gson().toJson(callerParentIdList));
		}	
	}

	@Override
	public Class<GetServiceInvokeResponse> getResponseClass() {
		return GetServiceInvokeResponse.class;
	}

}
