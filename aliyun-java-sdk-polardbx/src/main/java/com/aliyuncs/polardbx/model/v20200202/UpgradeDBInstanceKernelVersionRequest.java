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

package com.aliyuncs.polardbx.model.v20200202;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpgradeDBInstanceKernelVersionRequest extends RpcAcsRequest<UpgradeDBInstanceKernelVersionResponse> {
	   

	private String dBInstanceName;

	private String switchTime;

	private String upgradeTime;
	public UpgradeDBInstanceKernelVersionRequest() {
		super("polardbx", "2020-02-02", "UpgradeDBInstanceKernelVersion", "polardbx");
		setMethod(MethodType.POST);
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

	public String getSwitchTime() {
		return this.switchTime;
	}

	public void setSwitchTime(String switchTime) {
		this.switchTime = switchTime;
		if(switchTime != null){
			putQueryParameter("SwitchTime", switchTime);
		}
	}

	public String getUpgradeTime() {
		return this.upgradeTime;
	}

	public void setUpgradeTime(String upgradeTime) {
		this.upgradeTime = upgradeTime;
		if(upgradeTime != null){
			putQueryParameter("UpgradeTime", upgradeTime);
		}
	}

	@Override
	public Class<UpgradeDBInstanceKernelVersionResponse> getResponseClass() {
		return UpgradeDBInstanceKernelVersionResponse.class;
	}

}
