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
public class ConvertImageToScreenRequest extends RpcAcsRequest<ConvertImageToScreenResponse> {
	   

	private String product;

	private Boolean ifBeautified;

	private String version;

	private String visType;

	private String domain;

	private String imageUrl;

	private String screenName;

	private String projectId;

	private String workspaceId;
	public ConvertImageToScreenRequest() {
		super("datav-outer", "2019-04-02", "ConvertImageToScreen", "datav");
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

	public Boolean getIfBeautified() {
		return this.ifBeautified;
	}

	public void setIfBeautified(Boolean ifBeautified) {
		this.ifBeautified = ifBeautified;
		if(ifBeautified != null){
			putBodyParameter("IfBeautified", ifBeautified.toString());
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

	public String getVisType() {
		return this.visType;
	}

	public void setVisType(String visType) {
		this.visType = visType;
		if(visType != null){
			putBodyParameter("VisType", visType);
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

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putBodyParameter("ImageUrl", imageUrl);
		}
	}

	public String getScreenName() {
		return this.screenName;
	}

	public void setScreenName(String screenName) {
		this.screenName = screenName;
		if(screenName != null){
			putBodyParameter("ScreenName", screenName);
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

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<ConvertImageToScreenResponse> getResponseClass() {
		return ConvertImageToScreenResponse.class;
	}

}
