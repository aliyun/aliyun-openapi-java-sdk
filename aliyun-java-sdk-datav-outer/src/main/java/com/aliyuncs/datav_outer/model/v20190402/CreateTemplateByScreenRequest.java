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
import com.aliyuncs.datav_outer.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateTemplateByScreenRequest extends RpcAcsRequest<CreateTemplateByScreenResponse> {
	   

	private String product;

	private String version;

	private Integer screenId;

	private Boolean keepDataSource;

	private String domain;

	private String name;

	private Integer workspaceId;
	public CreateTemplateByScreenRequest() {
		super("datav-outer", "2019-04-02", "CreateTemplateByScreen", "datav");
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

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
		if(version != null){
			putBodyParameter("Version", version);
		}
	}

	public Integer getScreenId() {
		return this.screenId;
	}

	public void setScreenId(Integer screenId) {
		this.screenId = screenId;
		if(screenId != null){
			putBodyParameter("ScreenId", screenId.toString());
		}
	}

	public Boolean getKeepDataSource() {
		return this.keepDataSource;
	}

	public void setKeepDataSource(Boolean keepDataSource) {
		this.keepDataSource = keepDataSource;
		if(keepDataSource != null){
			putBodyParameter("KeepDataSource", keepDataSource.toString());
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
	public Class<CreateTemplateByScreenResponse> getResponseClass() {
		return CreateTemplateByScreenResponse.class;
	}

}
