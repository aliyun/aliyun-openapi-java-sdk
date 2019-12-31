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

package com.aliyuncs.mpserverless.model.v20190930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateFunctionRequest extends RpcAcsRequest<CreateFunctionResponse> {
	   

	private String memory;

	private String runtime;

	private String timeout;

	private String customVariables;

	private String spaceId;

	private String functionName;

	private String functionDesc;
	public CreateFunctionRequest() {
		super("MPServerless", "2019-09-30", "CreateFunction", "MPServerless");
		setMethod(MethodType.POST);
	}

	public String getMemory() {
		return this.memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
		if(memory != null){
			putBodyParameter("Memory", memory);
		}
	}

	public String getRuntime() {
		return this.runtime;
	}

	public void setRuntime(String runtime) {
		this.runtime = runtime;
		if(runtime != null){
			putBodyParameter("Runtime", runtime);
		}
	}

	public String getTimeout() {
		return this.timeout;
	}

	public void setTimeout(String timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putBodyParameter("Timeout", timeout);
		}
	}

	public String getCustomVariables() {
		return this.customVariables;
	}

	public void setCustomVariables(String customVariables) {
		this.customVariables = customVariables;
		if(customVariables != null){
			putBodyParameter("CustomVariables", customVariables);
		}
	}

	public String getSpaceId() {
		return this.spaceId;
	}

	public void setSpaceId(String spaceId) {
		this.spaceId = spaceId;
		if(spaceId != null){
			putBodyParameter("SpaceId", spaceId);
		}
	}

	public String getFunctionName() {
		return this.functionName;
	}

	public void setFunctionName(String functionName) {
		this.functionName = functionName;
		if(functionName != null){
			putBodyParameter("FunctionName", functionName);
		}
	}

	public String getFunctionDesc() {
		return this.functionDesc;
	}

	public void setFunctionDesc(String functionDesc) {
		this.functionDesc = functionDesc;
		if(functionDesc != null){
			putBodyParameter("FunctionDesc", functionDesc);
		}
	}

	@Override
	public Class<CreateFunctionResponse> getResponseClass() {
		return CreateFunctionResponse.class;
	}

}
