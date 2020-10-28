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
public class ModifyParameterRequest extends RpcAcsRequest<ModifyParameterResponse> {
	   

	private String clientToken;

	private String dBInstanceId;

	private String paramLevel;

	private String parameters;
	public ModifyParameterRequest() {
		super("polardbx", "2020-02-02", "ModifyParameter", "polardbx");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public String getParamLevel() {
		return this.paramLevel;
	}

	public void setParamLevel(String paramLevel) {
		this.paramLevel = paramLevel;
		if(paramLevel != null){
			putQueryParameter("ParamLevel", paramLevel);
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
	public Class<ModifyParameterResponse> getResponseClass() {
		return ModifyParameterResponse.class;
	}

}
