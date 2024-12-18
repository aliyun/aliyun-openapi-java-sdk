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

package com.aliyuncs.selectdb.model.v20230522;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyDBClusterConfigRequest extends RpcAcsRequest<ModifyDBClusterConfigResponse> {
	   

	private String configKey;

	private String switchTimeMode;

	private String dBInstanceId;

	private String dBClusterId;

	private String parameters;
	public ModifyDBClusterConfigRequest() {
		super("selectdb", "2023-05-22", "ModifyDBClusterConfig");
		setMethod(MethodType.POST);
	}

	public String getConfigKey() {
		return this.configKey;
	}

	public void setConfigKey(String configKey) {
		this.configKey = configKey;
		if(configKey != null){
			putQueryParameter("ConfigKey", configKey);
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

	public String getDBInstanceId() {
		return this.dBInstanceId;
	}

	public void setDBInstanceId(String dBInstanceId) {
		this.dBInstanceId = dBInstanceId;
		if(dBInstanceId != null){
			putQueryParameter("DBInstanceId", dBInstanceId);
		}
	}

	public String getDBClusterId() {
		return this.dBClusterId;
	}

	public void setDBClusterId(String dBClusterId) {
		this.dBClusterId = dBClusterId;
		if(dBClusterId != null){
			putQueryParameter("DBClusterId", dBClusterId);
		}
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
		if(parameters != null){
			putQueryParameter("Parameters", parameters);
		}
	}

	@Override
	public Class<ModifyDBClusterConfigResponse> getResponseClass() {
		return ModifyDBClusterConfigResponse.class;
	}

}
