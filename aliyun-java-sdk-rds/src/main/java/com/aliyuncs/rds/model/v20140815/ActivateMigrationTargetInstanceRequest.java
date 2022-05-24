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

package com.aliyuncs.rds.model.v20140815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.rds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ActivateMigrationTargetInstanceRequest extends RpcAcsRequest<ActivateMigrationTargetInstanceResponse> {
	   

	private String dBInstanceName;

	private Long resourceOwnerId;

	private String forceSwitch;

	private String switchTimeMode;

	private String switchTime;
	public ActivateMigrationTargetInstanceRequest() {
		super("Rds", "2014-08-15", "ActivateMigrationTargetInstance", "rds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDBInstanceName() {
		return this.dBInstanceName;
	}

	public void setDBInstanceName(String dBInstanceName) {
		this.dBInstanceName = dBInstanceName;
		if(dBInstanceName != null){
			putQueryParameter("DBInstanceName", dBInstanceName);
		}
	}

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getForceSwitch() {
		return this.forceSwitch;
	}

	public void setForceSwitch(String forceSwitch) {
		this.forceSwitch = forceSwitch;
		if(forceSwitch != null){
			putQueryParameter("ForceSwitch", forceSwitch);
		}
	}

	public String getSwitchTimeMode() {
		return this.switchTimeMode;
	}

	public void setSwitchTimeMode(String switchTimeMode) {
		this.switchTimeMode = switchTimeMode;
		if(switchTimeMode != null){
			putQueryParameter("SwitchTimeMode", switchTimeMode);
		}
	}

	public String getSwitchTime() {
		return this.switchTime;
	}

	public void setSwitchTime(String switchTime) {
		this.switchTime = switchTime;
		if(switchTime != null){
			putQueryParameter("SwitchTime", switchTime);
		}
	}

	@Override
	public Class<ActivateMigrationTargetInstanceResponse> getResponseClass() {
		return ActivateMigrationTargetInstanceResponse.class;
	}

}
