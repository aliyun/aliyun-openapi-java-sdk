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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CloseAlarmRequest extends RpcAcsRequest<CloseAlarmResponse> {
	   

	private String solution;

	private Long handlerId;

	private Long alarmId;
	public CloseAlarmRequest() {
		super("ARMS", "2019-08-08", "CloseAlarm", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getSolution() {
		return this.solution;
	}

	public void setSolution(String solution) {
		this.solution = solution;
		if(solution != null){
			putQueryParameter("Solution", solution);
		}
	}

	public Long getHandlerId() {
		return this.handlerId;
	}

	public void setHandlerId(Long handlerId) {
		this.handlerId = handlerId;
		if(handlerId != null){
			putQueryParameter("HandlerId", handlerId.toString());
		}
	}

	public Long getAlarmId() {
		return this.alarmId;
	}

	public void setAlarmId(Long alarmId) {
		this.alarmId = alarmId;
		if(alarmId != null){
			putQueryParameter("AlarmId", alarmId.toString());
		}
	}

	@Override
	public Class<CloseAlarmResponse> getResponseClass() {
		return CloseAlarmResponse.class;
	}

}
