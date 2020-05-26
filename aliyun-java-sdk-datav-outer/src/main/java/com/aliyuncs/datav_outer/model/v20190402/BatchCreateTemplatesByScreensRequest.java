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
public class BatchCreateTemplatesByScreensRequest extends RpcAcsRequest<BatchCreateTemplatesByScreensResponse> {
	   

	private String product;

	private String domain;

	private List<Templates> templatess;

	private String version;
	public BatchCreateTemplatesByScreensRequest() {
		super("datav-outer", "2019-04-02", "BatchCreateTemplatesByScreens", "datav");
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

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putBodyParameter("Domain", domain);
		}
	}

	public List<Templates> getTemplatess() {
		return this.templatess;
	}

	public void setTemplatess(List<Templates> templatess) {
		this.templatess = templatess;	
		if (templatess != null) {
			for (int depth1 = 0; depth1 < templatess.size(); depth1++) {
				putBodyParameter("Templates." + (depth1 + 1) + ".ScreenId" , templatess.get(depth1).getScreenId());
				putBodyParameter("Templates." + (depth1 + 1) + ".Thumbnail" , templatess.get(depth1).getThumbnail());
				putBodyParameter("Templates." + (depth1 + 1) + ".KeepDataSource" , templatess.get(depth1).getKeepDataSource());
				putBodyParameter("Templates." + (depth1 + 1) + ".Name" , templatess.get(depth1).getName());
				putBodyParameter("Templates." + (depth1 + 1) + ".Description" , templatess.get(depth1).getDescription());
				putBodyParameter("Templates." + (depth1 + 1) + ".WorkspaceId" , templatess.get(depth1).getWorkspaceId());
			}
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

	public static class Templates {

		private Integer screenId;

		private String thumbnail;

		private Boolean keepDataSource;

		private String name;

		private String description;

		private Integer workspaceId;

		public Integer getScreenId() {
			return this.screenId;
		}

		public void setScreenId(Integer screenId) {
			this.screenId = screenId;
		}

		public String getThumbnail() {
			return this.thumbnail;
		}

		public void setThumbnail(String thumbnail) {
			this.thumbnail = thumbnail;
		}

		public Boolean getKeepDataSource() {
			return this.keepDataSource;
		}

		public void setKeepDataSource(Boolean keepDataSource) {
			this.keepDataSource = keepDataSource;
		}

		public String getName() {
			return this.name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return this.description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getWorkspaceId() {
			return this.workspaceId;
		}

		public void setWorkspaceId(Integer workspaceId) {
			this.workspaceId = workspaceId;
		}
	}

	@Override
	public Class<BatchCreateTemplatesByScreensResponse> getResponseClass() {
		return BatchCreateTemplatesByScreensResponse.class;
	}

}
