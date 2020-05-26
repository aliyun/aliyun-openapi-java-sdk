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

/**
 * @author auto create
 * @version 
 */
public class BatchCreateScreensByTemplatesRequest extends RpcAcsRequest<BatchCreateScreensByTemplatesResponse> {
	   

	private String product;

	private List<Screens> screenss;

	private String domain;

	private String version;
	public BatchCreateScreensByTemplatesRequest() {
		super("datav-outer", "2019-04-02", "BatchCreateScreensByTemplates", "datav");
		setMethod(MethodType.POST);
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

	public List<Screens> getScreenss() {
		return this.screenss;
	}

	public void setScreenss(List<Screens> screenss) {
		this.screenss = screenss;	
		if (screenss != null) {
			for (int depth1 = 0; depth1 < screenss.size(); depth1++) {
				putBodyParameter("Screens." + (depth1 + 1) + ".DataSourceJSON" , screenss.get(depth1).getDataSourceJSON());
				if (screenss.get(depth1).getDataSources() != null) {
					for (int depth2 = 0; depth2 < screenss.get(depth1).getDataSources().size(); depth2++) {
						putBodyParameter("Screens." + (depth1 + 1) + ".DataSource." + (depth2 + 1) + ".Name" , screenss.get(depth1).getDataSources().get(depth2).getName());
						putBodyParameter("Screens." + (depth1 + 1) + ".DataSource." + (depth2 + 1) + ".Type" , screenss.get(depth1).getDataSources().get(depth2).getType());
						putBodyParameter("Screens." + (depth1 + 1) + ".DataSource." + (depth2 + 1) + ".Config" , screenss.get(depth1).getDataSources().get(depth2).getConfig());
					}
				}
				putBodyParameter("Screens." + (depth1 + 1) + ".Name" , screenss.get(depth1).getName());
				putBodyParameter("Screens." + (depth1 + 1) + ".Association" , screenss.get(depth1).getAssociation());
				putBodyParameter("Screens." + (depth1 + 1) + ".TemplateId" , screenss.get(depth1).getTemplateId());
				putBodyParameter("Screens." + (depth1 + 1) + ".ProjectId" , screenss.get(depth1).getProjectId());
				putBodyParameter("Screens." + (depth1 + 1) + ".WorkspaceId" , screenss.get(depth1).getWorkspaceId());
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

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putBodyParameter("Version", version);
		}
	}

	public static class Screens {

		private String dataSourceJSON;

		private List<DataSource> dataSources;

		private String name;

		private String association;

		private Integer templateId;

		private Integer projectId;

		private Integer workspaceId;

		public String getDataSourceJSON() {
			return this.dataSourceJSON;
		}

		public void setDataSourceJSON(String dataSourceJSON) {
			this.dataSourceJSON = dataSourceJSON;
		}

		public List<DataSource> getDataSources() {
			return this.dataSources;
		}

		public void setDataSources(List<DataSource> dataSources) {
			this.dataSources = dataSources;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAssociation() {
			return this.association;
		}

		public void setAssociation(String association) {
			this.association = association;
		}

		public Integer getTemplateId() {
			return this.templateId;
		}

		public void setTemplateId(Integer templateId) {
			this.templateId = templateId;
		}

		public Integer getProjectId() {
			return this.projectId;
		}

		public void setProjectId(Integer projectId) {
			this.projectId = projectId;
		}

		public Integer getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(Integer workspaceId) {
			this.workspaceId = workspaceId;
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
	}

	@Override
	public Class<BatchCreateScreensByTemplatesResponse> getResponseClass() {
		return BatchCreateScreensByTemplatesResponse.class;
	}

}
