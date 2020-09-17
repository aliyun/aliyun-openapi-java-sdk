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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkedeploycoreDeploycoreDebugportRequest extends RpcAcsRequest<UpdateLinkedeploycoreDeploycoreDebugportResponse> {
	   

	private String operator;

	private String projectId;

	private Long appServiceId;

	private String fromApp;

	private String debugPort;

	private String operation;
	public UpdateLinkedeploycoreDeploycoreDebugportRequest() {
		super("SOFA", "2019-08-15", "UpdateLinkedeploycoreDeploycoreDebugport", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putBodyParameter("Operator", operator);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public Long getAppServiceId() {
		return this.appServiceId;
	}

	public void setAppServiceId(Long appServiceId) {
		this.appServiceId = appServiceId;
		if(appServiceId != null){
			putBodyParameter("AppServiceId", appServiceId.toString());
		}
	}

	public String getFromApp() {
		return this.fromApp;
	}

	public void setFromApp(String fromApp) {
		this.fromApp = fromApp;
		if(fromApp != null){
			putBodyParameter("FromApp", fromApp);
		}
	}

	public String getDebugPort() {
		return this.debugPort;
	}

	public void setDebugPort(String debugPort) {
		this.debugPort = debugPort;
		if(debugPort != null){
			putBodyParameter("DebugPort", debugPort);
		}
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putBodyParameter("Operation", operation);
		}
	}

	@Override
	public Class<UpdateLinkedeploycoreDeploycoreDebugportResponse> getResponseClass() {
		return UpdateLinkedeploycoreDeploycoreDebugportResponse.class;
	}

}
