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

package com.aliyuncs.ros.model.v20190910;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ros.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateStackGroupRequest extends RpcAcsRequest<UpdateStackGroupResponse> {
	   

	private String templateVersion;

	private String stackGroupName;

	private List<Object> regionIds;

	private String templateId;

	private List<Parameters> parameterss;

	private String clientToken;

	private String templateBody;

	private String description;

	private String executionRoleName;

	private String templateURL;

	private String operationDescription;

	private Map<Object,Object> operationPreferences;

	private List<Object> accountIds;

	private String administrationRoleName;
	public UpdateStackGroupRequest() {
		super("ROS", "2019-09-10", "UpdateStackGroup", "ros");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}

	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
		if(templateVersion != null){
			putQueryParameter("TemplateVersion", templateVersion);
		}
	}

	public String getStackGroupName() {
		return this.stackGroupName;
	}

	public void setStackGroupName(String stackGroupName) {
		this.stackGroupName = stackGroupName;
		if(stackGroupName != null){
			putQueryParameter("StackGroupName", stackGroupName);
		}
	}

	public List<Object> getRegionIds() {
		return this.regionIds;
	}

	public void setRegionIds(List<Object> regionIds) {
		this.regionIds = regionIds;
		if(regionIds != null){
			putQueryParameter("RegionIds", new Gson().toJson(regionIds));
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
		}
	}

	public List<Parameters> getParameterss() {
		return this.parameterss;
	}

	public void setParameterss(List<Parameters> parameterss) {
		this.parameterss = parameterss;	
		if (parameterss != null) {
			for (int depth1 = 0; depth1 < parameterss.size(); depth1++) {
				putQueryParameter("Parameters." + (depth1 + 1) + ".ParameterValue" , parameterss.get(depth1).getParameterValue());
				putQueryParameter("Parameters." + (depth1 + 1) + ".ParameterKey" , parameterss.get(depth1).getParameterKey());
			}
		}	
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

	public String getTemplateBody() {
		return this.templateBody;
	}

	public void setTemplateBody(String templateBody) {
		this.templateBody = templateBody;
		if(templateBody != null){
			putQueryParameter("TemplateBody", templateBody);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getExecutionRoleName() {
		return this.executionRoleName;
	}

	public void setExecutionRoleName(String executionRoleName) {
		this.executionRoleName = executionRoleName;
		if(executionRoleName != null){
			putQueryParameter("ExecutionRoleName", executionRoleName);
		}
	}

	public String getTemplateURL() {
		return this.templateURL;
	}

	public void setTemplateURL(String templateURL) {
		this.templateURL = templateURL;
		if(templateURL != null){
			putQueryParameter("TemplateURL", templateURL);
		}
	}

	public String getOperationDescription() {
		return this.operationDescription;
	}

	public void setOperationDescription(String operationDescription) {
		this.operationDescription = operationDescription;
		if(operationDescription != null){
			putQueryParameter("OperationDescription", operationDescription);
		}
	}

	public Map<Object,Object> getOperationPreferences() {
		return this.operationPreferences;
	}

	public void setOperationPreferences(Map<Object,Object> operationPreferences) {
		this.operationPreferences = operationPreferences;
		if(operationPreferences != null){
			putQueryParameter("OperationPreferences", new Gson().toJson(operationPreferences));
		}
	}

	public List<Object> getAccountIds() {
		return this.accountIds;
	}

	public void setAccountIds(List<Object> accountIds) {
		this.accountIds = accountIds;
		if(accountIds != null){
			putQueryParameter("AccountIds", new Gson().toJson(accountIds));
		}
	}

	public String getAdministrationRoleName() {
		return this.administrationRoleName;
	}

	public void setAdministrationRoleName(String administrationRoleName) {
		this.administrationRoleName = administrationRoleName;
		if(administrationRoleName != null){
			putQueryParameter("AdministrationRoleName", administrationRoleName);
		}
	}

	public static class Parameters {

		private String parameterValue;

		private String parameterKey;

		public String getParameterValue() {
			return this.parameterValue;
		}

		public void setParameterValue(String parameterValue) {
			this.parameterValue = parameterValue;
		}

		public String getParameterKey() {
			return this.parameterKey;
		}

		public void setParameterKey(String parameterKey) {
			this.parameterKey = parameterKey;
		}
	}

	@Override
	public Class<UpdateStackGroupResponse> getResponseClass() {
		return UpdateStackGroupResponse.class;
	}

}
