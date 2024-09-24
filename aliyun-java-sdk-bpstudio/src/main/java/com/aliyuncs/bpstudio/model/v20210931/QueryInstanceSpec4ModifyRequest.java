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

package com.aliyuncs.bpstudio.model.v20210931;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class QueryInstanceSpec4ModifyRequest extends RpcAcsRequest<QueryInstanceSpec4ModifyResponse> {
	   

	private String instanceId;

	private String applicationId;

	@SerializedName("parameters")
	private Map<String,Object> parameters;

	private String methodName;
	public QueryInstanceSpec4ModifyRequest() {
		super("BPStudio", "2021-09-31", "QueryInstanceSpec4Modify", "bpstudio");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getApplicationId() {
		return this.applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
		if(applicationId != null){
			putBodyParameter("ApplicationId", applicationId);
		}
	}

	public Map<String,Object> getParameters() {
		return this.parameters;
	}

	public void setParameters(Map<String,Object> parameters) {
		this.parameters = parameters;	
		if (parameters != null) {
			putBodyParameter("Parameters" , new Gson().toJson(parameters));
		}	
	}

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
		if(methodName != null){
			putBodyParameter("MethodName", methodName);
		}
	}

	@Override
	public Class<QueryInstanceSpec4ModifyResponse> getResponseClass() {
		return QueryInstanceSpec4ModifyResponse.class;
	}

}
