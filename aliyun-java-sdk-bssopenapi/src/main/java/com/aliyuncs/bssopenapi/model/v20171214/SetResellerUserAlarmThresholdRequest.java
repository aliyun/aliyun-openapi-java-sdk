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

/**
 * @author auto create
 * @version 
 */
public class SetResellerUserAlarmThresholdRequest extends RpcAcsRequest<SetResellerUserAlarmThresholdResponse> {
	
	public SetResellerUserAlarmThresholdRequest() {
		super("BssOpenApi", "2017-12-14", "SetResellerUserAlarmThreshold");
	}

	private String alarmType;

	private String alarmThresholds;

	private Long ownerId;

	public String getAlarmType() {
		return this.alarmType;
	}

	public void setAlarmType(String alarmType) {
		this.alarmType = alarmType;
		if(alarmType != null){
			putQueryParameter("AlarmType", alarmType);
		}
	}

	public String getAlarmThresholds() {
		return this.alarmThresholds;
	}

	public void setAlarmThresholds(String alarmThresholds) {
		this.alarmThresholds = alarmThresholds;
		if(alarmThresholds != null){
			putQueryParameter("AlarmThresholds", alarmThresholds);
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
	public Class<SetResellerUserAlarmThresholdResponse> getResponseClass() {
		return SetResellerUserAlarmThresholdResponse.class;
	}

}
