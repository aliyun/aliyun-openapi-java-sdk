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

package com.aliyuncs.mpaas.model.v20201028;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateLinkRequest extends RpcAcsRequest<UpdateLinkResponse> {
	   

	private Boolean cors;

	private String url;

	private String appId;

	private String domain;

	private String targetUrl;

	private String dynamicfield;

	private String workspaceId;
	public UpdateLinkRequest() {
		super("mPaaS", "2020-10-28", "UpdateLink", "mpaas");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getCors() {
		return this.cors;
	}

	public void setCors(Boolean cors) {
		this.cors = cors;
		if(cors != null){
			putBodyParameter("Cors", cors.toString());
		}
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
		if(url != null){
			putBodyParameter("Url", url);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
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

	public String getTargetUrl() {
		return this.targetUrl;
	}

	public void setTargetUrl(String targetUrl) {
		this.targetUrl = targetUrl;
		if(targetUrl != null){
			putBodyParameter("TargetUrl", targetUrl);
		}
	}

	public String getDynamicfield() {
		return this.dynamicfield;
	}

	public void setDynamicfield(String dynamicfield) {
		this.dynamicfield = dynamicfield;
		if(dynamicfield != null){
			putBodyParameter("Dynamicfield", dynamicfield);
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
	public Class<UpdateLinkResponse> getResponseClass() {
		return UpdateLinkResponse.class;
	}

}
