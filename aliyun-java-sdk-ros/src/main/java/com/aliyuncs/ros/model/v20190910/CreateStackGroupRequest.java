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
public class CreateStackGroupRequest extends RpcAcsRequest<CreateStackGroupResponse> {
	   

	private String resourceGroupId;

	private String templateVersion;

	private String stackGroupName;

	private Map<Object,Object> autoDeployment;

	private String permissionModel;

	private String templateId;

	private List<Tags> tagss;

	private List<Parameters> parameterss;

	private String clientToken;

	private String templateBody;

	private String description;

	private String executionRoleName;

	private String templateURL;

	private List<String> capabilitiess;

	private String administrationRoleName;
	public CreateStackGroupRequest() {
		super("ROS", "2019-09-10", "CreateStackGroup", "ros");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
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

	public Map<Object,Object> getAutoDeployment() {
		return this.autoDeployment;
	}

	public void setAutoDeployment(Map<Object,Object> autoDeployment) {
		this.autoDeployment = autoDeployment;
		if(autoDeployment != null){
			putQueryParameter("AutoDeployment", new Gson().toJson(autoDeployment));
		}
	}

	public String getPermissionModel() {
		return this.permissionModel;
	}

	public void setPermissionModel(String permissionModel) {
		this.permissionModel = permissionModel;
		if(permissionModel != null){
			putQueryParameter("PermissionModel", permissionModel);
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

	public List<Tags> getTagss() {
		return this.tagss;
	}

	public void setTagss(List<Tags> tagss) {
		this.tagss = tagss;	
		if (tagss != null) {
			for (int depth1 = 0; depth1 < tagss.size(); depth1++) {
				putQueryParameter("Tags." + (depth1 + 1) + ".Value" , tagss.get(depth1).getValue());
				putQueryParameter("Tags." + (depth1 + 1) + ".Key" , tagss.get(depth1).getKey());
			}
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
			putBodyParameter("TemplateBody", templateBody);
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

	public List<String> getCapabilitiess() {
		return this.capabilitiess;
	}

	public void setCapabilitiess(List<String> capabilitiess) {
		this.capabilitiess = capabilitiess;	
		if (capabilitiess != null) {
			for (int i = 0; i < capabilitiess.size(); i++) {
				putQueryParameter("Capabilities." + (i + 1) , capabilitiess.get(i));
			}
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

	public static class Tags {

		private String value;

		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
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
	public Class<CreateStackGroupResponse> getResponseClass() {
		return CreateStackGroupResponse.class;
	}

}
