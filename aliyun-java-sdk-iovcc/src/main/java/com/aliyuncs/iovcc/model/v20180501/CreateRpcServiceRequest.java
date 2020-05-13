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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateRpcServiceRequest extends RpcAcsRequest<CreateRpcServiceResponse> {
	   

	private String interfaceName;

	private String versionCode;

	private String projectId;

	private String methodName;

	private String params;

	private String groupName;

	private String invokeType;

	private String appKey;
	public CreateRpcServiceRequest() {
		super("iovcc", "2018-05-01", "CreateRpcService", "iovcc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getInterfaceName() {
		return this.interfaceName;
	}

	public void setInterfaceName(String interfaceName) {
		this.interfaceName = interfaceName;
		if(interfaceName != null){
			putQueryParameter("InterfaceName", interfaceName);
		}
	}

	public String getVersionCode() {
		return this.versionCode;
	}

	public void setVersionCode(String versionCode) {
		this.versionCode = versionCode;
		if(versionCode != null){
			putQueryParameter("VersionCode", versionCode);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	public String getMethodName() {
		return this.methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
		if(methodName != null){
			putQueryParameter("MethodName", methodName);
		}
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putQueryParameter("Params", params);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	public String getInvokeType() {
		return this.invokeType;
	}

	public void setInvokeType(String invokeType) {
		this.invokeType = invokeType;
		if(invokeType != null){
			putQueryParameter("InvokeType", invokeType);
		}
	}

	public String getAppKey() {
		return this.appKey;
	}

	public void setAppKey(String appKey) {
		this.appKey = appKey;
		if(appKey != null){
			putQueryParameter("AppKey", appKey);
		}
	}

	@Override
	public Class<CreateRpcServiceResponse> getResponseClass() {
		return CreateRpcServiceResponse.class;
	}

}
