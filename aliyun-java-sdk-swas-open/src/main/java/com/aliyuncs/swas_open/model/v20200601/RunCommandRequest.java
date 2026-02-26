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
public class RunCommandRequest extends RpcAcsRequest<RunCommandResponse> {
	   

	private String workingDir;

	private String type;

	private String commandContent;

	private Integer timeout;

	private String windowsPasswordName;

	private String instanceId;

	private String workingUser;

	private String name;

	@SerializedName("parameters")
	private Map<String,String> parameters;

	private Boolean enableParameter;
	public RunCommandRequest() {
		super("SWAS-OPEN", "2020-06-01", "RunCommand", "SWAS-OPEN");
		setMethod(MethodType.POST);
	}

	public String getWorkingDir() {
		return this.workingDir;
	}

	public void setWorkingDir(String workingDir) {
		this.workingDir = workingDir;
		if(workingDir != null){
			putQueryParameter("WorkingDir", workingDir);
		}
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getCommandContent() {
		return this.commandContent;
	}

	public void setCommandContent(String commandContent) {
		this.commandContent = commandContent;
		if(commandContent != null){
			putQueryParameter("CommandContent", commandContent);
		}
	}

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putQueryParameter("Timeout", timeout.toString());
		}
	}

	public String getWindowsPasswordName() {
		return this.windowsPasswordName;
	}

	public void setWindowsPasswordName(String windowsPasswordName) {
		this.windowsPasswordName = windowsPasswordName;
		if(windowsPasswordName != null){
			putQueryParameter("WindowsPasswordName", windowsPasswordName);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getWorkingUser() {
		return this.workingUser;
	}

	public void setWorkingUser(String workingUser) {
		this.workingUser = workingUser;
		if(workingUser != null){
			putQueryParameter("WorkingUser", workingUser);
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

	public Map<String,String> getParameters() {
		return this.parameters;
	}

	public void setParameters(Map<String,String> parameters) {
		this.parameters = parameters;	
		if (parameters != null) {
			putQueryParameter("Parameters" , new Gson().toJson(parameters));
		}	
	}

	public Boolean getEnableParameter() {
		return this.enableParameter;
	}

	public void setEnableParameter(Boolean enableParameter) {
		this.enableParameter = enableParameter;
		if(enableParameter != null){
			putQueryParameter("EnableParameter", enableParameter.toString());
		}
	}

	@Override
	public Class<RunCommandResponse> getResponseClass() {
		return RunCommandResponse.class;
	}

}
