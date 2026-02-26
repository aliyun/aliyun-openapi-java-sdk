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

package com.aliyuncs.bssopenapi.model.v20171214;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.bssopenapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryResellerUserAlarmThresholdRequest extends RpcAcsRequest<QueryResellerUserAlarmThresholdResponse> {
	   

	private String alarmType;

	private Long ownerId;
	public QueryResellerUserAlarmThresholdRequest() {
		super("BssOpenApi", "2017-12-14", "QueryResellerUserAlarmThreshold", "bssopenapi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAlarmType() {
		return this.alarmType;
	}

	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
		if(alarmType != null){
			putQueryParameter("AlarmType", alarmType);
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
	public Class<QueryResellerUserAlarmThresholdResponse> getResponseClass() {
		return QueryResellerUserAlarmThresholdResponse.class;
	}

}
