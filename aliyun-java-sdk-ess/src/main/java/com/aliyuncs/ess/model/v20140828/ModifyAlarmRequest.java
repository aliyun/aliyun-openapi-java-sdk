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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ModifyAlarmRequest extends RpcAcsRequest<ModifyAlarmResponse> {
	
	public ModifyAlarmRequest() {
		super("Ess", "2014-08-28", "ModifyAlarm", "ess");
	}

	private String resourceOwnerAccount;

	private String name;

	private String description;

	private List<String> alarmActions;

	private Long ownerId;

	private String alarmTaskId;

	public String getResourceOwnerAccount() {
		return this.resourceOwnerAccount;
	}

	public void setResourceOwnerAccount(String resourceOwnerAccount) {
		this.resourceOwnerAccount = resourceOwnerAccount;
		if(resourceOwnerAccount != null){
			putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public List<String> getAlarmActions() {
		return this.alarmActions;
	}

	public void setAlarmActions(List<String> alarmActions) {
		this.alarmActions = alarmActions;	
		if (alarmActions != null) {
			for (int i = 0; i < alarmActions.size(); i++) {
				putQueryParameter("AlarmAction." + (i + 1) , alarmActions.get(i));
			}
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
	public Class<ModifyAlarmResponse> getResponseClass() {
		return ModifyAlarmResponse.class;
	}

}
