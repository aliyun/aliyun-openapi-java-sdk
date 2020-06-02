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

package com.aliyuncs.datav_outer.model.v20190402;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.datav_outer.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateScreenByTemplateRequest extends RpcAcsRequest<CreateScreenByTemplateResponse> {
	   

	private String product;

	private String thumbnail;

	private String association;

	private Integer templateId;

	private String version;

	private String dataSourceJSON;

	private List<DataSource> dataSources;

	private String domain;

	private String name;

	private Integer projectId;

	private Integer workspaceId;
	public CreateScreenByTemplateRequest() {
		super("datav-outer", "2019-04-02", "CreateScreenByTemplate", "datav");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putBodyParameter("Product", product);
		}
	}

	public String getThumbnail() {
		return this.thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
		if(thumbnail != null){
			putBodyParameter("Thumbnail", thumbnail);
		}
	}

	public String getAssociation() {
		return this.association;
	}

	public void setAssociation(String association) {
		this.association = association;
		if(association != null){
			putBodyParameter("Association", association);
		}
	}

	public Integer getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(Integer templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putBodyParameter("TemplateId", templateId.toString());
		}
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putBodyParameter("Version", version);
		}
	}

	public String getDataSourceJSON() {
		return this.dataSourceJSON;
	}

	public void setDataSourceJSON(String dataSourceJSON) {
		this.dataSourceJSON = dataSourceJSON;
		if(dataSourceJSON != null){
			putBodyParameter("DataSourceJSON", dataSourceJSON);
		}
	}

	public List<DataSource> getDataSources() {
		return this.dataSources;
	}

	public void setDataSources(List<DataSource> dataSources) {
		this.dataSources = dataSources;	
		if (dataSources != null) {
			for (int depth1 = 0; depth1 < dataSources.size(); depth1++) {
				putBodyParameter("DataSource." + (depth1 + 1) + ".Name" , dataSources.get(depth1).getName());
				putBodyParameter("DataSource." + (depth1 + 1) + ".Type" , dataSources.get(depth1).getType());
				putBodyParameter("DataSource." + (depth1 + 1) + ".Config" , dataSources.get(depth1).getConfig());
			}
		}	
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putBodyParameter("Domain", domain);
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

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	public Integer getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(Integer workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId.toString());
		}
	}

	public static class DataSource {

		private String name;

		private String type;

		private String config;

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return this.type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}
	}

	@Override
	public Class<CreateScreenByTemplateResponse> getResponseClass() {
		return CreateScreenByTemplateResponse.class;
	}

}
