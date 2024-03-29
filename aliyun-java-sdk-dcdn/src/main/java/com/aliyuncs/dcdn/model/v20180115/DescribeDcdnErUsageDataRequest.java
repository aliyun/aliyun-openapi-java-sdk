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

package com.aliyuncs.dcdn.model.v20180115;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dcdn.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDcdnErUsageDataRequest extends RpcAcsRequest<DescribeDcdnErUsageDataResponse> {
	   

	private String startTime;

	private String spec;

	private String routineID;

	private String splitBy;

	private String endTime;

	private Long ownerId;
	public DescribeDcdnErUsageDataRequest() {
		super("dcdn", "2018-01-15", "DescribeDcdnErUsageData");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
		if(spec != null){
			putQueryParameter("Spec", spec);
		}
	}

	public String getRoutineID() {
		return this.routineID;
	}

	public void setRoutineID(String routineID) {
		this.routineID = routineID;
		if(routineID != null){
			putQueryParameter("RoutineID", routineID);
		}
	}

	public String getSplitBy() {
		return this.splitBy;
	}

	public void setSplitBy(String splitBy) {
		this.splitBy = splitBy;
		if(splitBy != null){
			putQueryParameter("SplitBy", splitBy);
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	@Override
	public Class<DescribeDcdnErUsageDataResponse> getResponseClass() {
		return DescribeDcdnErUsageDataResponse.class;
	}

}
