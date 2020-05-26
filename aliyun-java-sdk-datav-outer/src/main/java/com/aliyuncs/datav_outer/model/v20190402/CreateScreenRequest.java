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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreateScreenRequest extends RpcAcsRequest<CreateScreenResponse> {
	   

	private String product;

	private Boolean needToken;

	private String version;

	private Boolean needShare;

	private String templateConfig;

	private String domain;

	private String name;

	private Integer workspaceId;
	public CreateScreenRequest() {
		super("datav-outer", "2019-04-02", "CreateScreen", "datav");
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

	public Boolean getNeedToken() {
		return this.needToken;
	}

	public void setNeedToken(Boolean needToken) {
		this.needToken = needToken;
		if(needToken != null){
			putBodyParameter("NeedToken", needToken.toString());
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

	public Boolean getNeedShare() {
		return this.needShare;
	}

	public void setNeedShare(Boolean needShare) {
		this.needShare = needShare;
		if(needShare != null){
			putBodyParameter("NeedShare", needShare.toString());
		}
	}

	public String getTemplateConfig() {
		return this.templateConfig;
	}

	public void setTemplateConfig(String templateConfig) {
		this.templateConfig = templateConfig;
		if(templateConfig != null){
			putBodyParameter("TemplateConfig", templateConfig);
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

	public Integer getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(Integer workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId.toString());
		}
	}

	@Override
	public Class<CreateScreenResponse> getResponseClass() {
		return CreateScreenResponse.class;
	}

}
