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
import java.util.List;
import java.util.Map;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateApplicationRequest extends RpcAcsRequest<CreateApplicationResponse> {
	   

	@SerializedName("variables")
	private Map<String,Object> variables;

	private String clientToken;

	@SerializedName("instances")
	private List<Instances> instances;

	@SerializedName("configuration")
	private Map<String,String> configuration;

	private String templateId;

	private String resourceGroupId;

	private String areaId;

	private String name;
	public CreateApplicationRequest() {
		super("BPStudio", "2021-09-31", "CreateApplication", "bpstudio");
		setMethod(MethodType.POST);
	}

	public Map<String,Object> getVariables() {
		return this.variables;
	}

	public void setVariables(Map<String,Object> variables) {
		this.variables = variables;	
		if (variables != null) {
			putBodyParameter("Variables" , new Gson().toJson(variables));
		}	
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public List<Instances> getInstances() {
		return this.instances;
	}

	public void setInstances(List<Instances> instances) {
		this.instances = instances;	
		if (instances != null) {
			putBodyParameter("Instances" , new Gson().toJson(instances));
		}	
	}

	public Map<String,String> getConfiguration() {
		return this.configuration;
	}

	public void setConfiguration(Map<String,String> configuration) {
		this.configuration = configuration;	
		if (configuration != null) {
			putBodyParameter("Configuration" , new Gson().toJson(configuration));
		}	
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putBodyParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getAreaId() {
		return this.areaId;
	}

	public void setAreaId(String areaId) {
		this.areaId = areaId;
		if(areaId != null){
			putBodyParameter("AreaId", areaId);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putBodyParameter("Name", name);
		}
	}

	public static class Instances {

		@SerializedName("NodeName")
		private String nodeName;

		@SerializedName("NodeType")
		private String nodeType;

		@SerializedName("Id")
		private String id;

		public String getNodeName() {
			return this.nodeName;
		}

		public void setNodeName(String nodeName) {
			this.nodeName = nodeName;
		}

		public String getNodeType() {
			return this.nodeType;
		}

		public void setNodeType(String nodeType) {
			this.nodeType = nodeType;
		}

		public String getId() {
			return this.id;
		}

		public void setId(String id) {
			this.id = id;
		}
	}

	@Override
	public Class<CreateApplicationResponse> getResponseClass() {
		return CreateApplicationResponse.class;
	}

}
