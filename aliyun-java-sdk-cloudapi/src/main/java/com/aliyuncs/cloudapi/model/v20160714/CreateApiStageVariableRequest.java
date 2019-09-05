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

package com.aliyuncs.cloudapi.model.v20160714;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cloudapi.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateApiStageVariableRequest extends RpcAcsRequest<CreateApiStageVariableResponse> {
	
	public CreateApiStageVariableRequest() {
		super("CloudAPI", "2016-07-14", "CreateApiStageVariable", "apigateway");
		setSysMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Boolean supportRoute;

	private String variableValue;

	private String groupId;

	private String stageRouteModel;

	private String securityToken;

	private String variableName;

	private String stageId;

	public Boolean getSupportRoute() {
		return this.supportRoute;
	}

	public void setSupportRoute(Boolean supportRoute) {
		this.supportRoute = supportRoute;
		if(supportRoute != null){
			putQueryParameter("SupportRoute", supportRoute.toString());
		}
	}

	public String getVariableValue() {
		return this.variableValue;
	}

	public void setVariableValue(String variableValue) {
		this.variableValue = variableValue;
		if(variableValue != null){
			putQueryParameter("VariableValue", variableValue);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getStageRouteModel() {
		return this.stageRouteModel;
	}

	public void setStageRouteModel(String stageRouteModel) {
		this.stageRouteModel = stageRouteModel;
		if(stageRouteModel != null){
			putQueryParameter("StageRouteModel", stageRouteModel);
		}
	}

	public String getBizSecurityToken() {
		return this.securityToken;
	}

	public void setBizSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	/**
	 * @deprecated use getBizSecurityToken instead of this.
	 */
	@Deprecated
	public String getSecurityToken() {
		return this.securityToken;
	}

	/**
	 * @deprecated use setBizSecurityToken instead of this.
	 */
	@Deprecated
	public void setSecurityToken(String securityToken) {
		this.securityToken = securityToken;
		if(securityToken != null){
			putQueryParameter("SecurityToken", securityToken);
		}
	}

	public String getVariableName() {
		return this.variableName;
	}

	public void setVariableName(String variableName) {
		this.variableName = variableName;
		if(variableName != null){
			putQueryParameter("VariableName", variableName);
		}
	}

	public String getStageId() {
		return this.stageId;
	}

	public void setStageId(String stageId) {
		this.stageId = stageId;
		if(stageId != null){
			putQueryParameter("StageId", stageId);
		}
	}

	@Override
	public Class<CreateApiStageVariableResponse> getResponseClass() {
		return CreateApiStageVariableResponse.class;
	}

}
