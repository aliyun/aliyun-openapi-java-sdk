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

package com.aliyuncs.ess.model.v20140828;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DisableAlarmRequest extends RpcAcsRequest<DisableAlarmResponse> {
	   

	private String resourceOwnerAccount;

	private Long ownerId;

	private String alarmTaskId;
	public DisableAlarmRequest() {
		super("Ess", "2014-08-28", "DisableAlarm", "ess");
		setMethod(MethodType.POST);
	}

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
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

	public String getAlarmTaskId() {
		return this.alarmTaskId;
	}

	public void setAlarmTaskId(String alarmTaskId) {
		this.alarmTaskId = alarmTaskId;
		if(alarmTaskId != null){
			putQueryParameter("AlarmTaskId", alarmTaskId);
		}
	}

	@Override
	public Class<DisableAlarmResponse> getResponseClass() {
		return DisableAlarmResponse.class;
	}

}
