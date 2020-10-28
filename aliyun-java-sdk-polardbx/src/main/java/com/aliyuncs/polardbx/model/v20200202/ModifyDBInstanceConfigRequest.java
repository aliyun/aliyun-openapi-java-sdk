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
public class ModifyDBInstanceConfigRequest extends RpcAcsRequest<ModifyDBInstanceConfigResponse> {
	   

	private String dBInstanceName;

	private String configName;

	private String configValue;
	public ModifyDBInstanceConfigRequest() {
		super("polardbx", "2020-02-02", "ModifyDBInstanceConfig", "polardbx");
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

	public String getConfigName() {
		return this.configName;
	}

	public void setConfigName(String configName) {
		this.configName = configName;
		if(configName != null){
			putQueryParameter("ConfigName", configName);
		}
	}

	public String getConfigValue() {
		return this.configValue;
	}

	public void setConfigValue(String configValue) {
		this.configValue = configValue;
		if(configValue != null){
			putQueryParameter("ConfigValue", configValue);
		}
	}

	@Override
	public Class<ModifyDBInstanceConfigResponse> getResponseClass() {
		return ModifyDBInstanceConfigResponse.class;
	}

}
