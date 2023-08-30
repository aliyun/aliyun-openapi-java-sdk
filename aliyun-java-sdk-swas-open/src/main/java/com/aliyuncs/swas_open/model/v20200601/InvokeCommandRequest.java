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

package com.aliyuncs.swas_open.model.v20200601;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InvokeCommandRequest extends RpcAcsRequest<InvokeCommandResponse> {
	   

	private String commandId;

	private String instanceIds;

	@SerializedName("parameters")
	private Map<String,String> parameters;

	private String username;
	public InvokeCommandRequest() {
		super("SWAS-OPEN", "2020-06-01", "InvokeCommand", "SWAS-OPEN");
		setMethod(MethodType.POST);
	}

	public String getCommandId() {
		return this.commandId;
	}

	public void setCommandId(String commandId) {
		this.commandId = commandId;
		if(commandId != null){
			putQueryParameter("CommandId", commandId);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	public Map<String,String> getParameters() {
		return this.parameters;
	}

	public void setParameters(Map<String,String> parameters) {
		this.parameters = parameters;	
		if (parameters != null) {
			putQueryParameter("Parameters" , new Gson().toJson(parameters));
		}	
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
		if(username != null){
			putQueryParameter("Username", username);
		}
	}

	@Override
	public Class<InvokeCommandResponse> getResponseClass() {
		return InvokeCommandResponse.class;
	}

}
