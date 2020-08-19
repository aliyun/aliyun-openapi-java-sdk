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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EditHtmlResourceRequest extends RpcAcsRequest<EditHtmlResourceResponse> {
	   

	private String htmlUrl;

	private String casterId;

	private String htmlContent;

	private Long ownerId;

	private String htmlResourceId;

	private String config;
	public EditHtmlResourceRequest() {
		super("live", "2016-11-01", "EditHtmlResource");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getHtmlUrl() {
		return this.htmlUrl;
	}

	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
		if(htmlUrl != null){
			putQueryParameter("HtmlUrl", htmlUrl);
		}
	}

	public String getCasterId() {
		return this.casterId;
	}

	public void setCasterId(String casterId) {
		this.casterId = casterId;
		if(casterId != null){
			putQueryParameter("CasterId", casterId);
		}
	}

	public String getHtmlContent() {
		return this.htmlContent;
	}

	public void setHtmlContent(String htmlContent) {
		this.htmlContent = htmlContent;
		if(htmlContent != null){
			putQueryParameter("htmlContent", htmlContent);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getHtmlResourceId() {
		return this.htmlResourceId;
	}

	public void setHtmlResourceId(String htmlResourceId) {
		this.htmlResourceId = htmlResourceId;
		if(htmlResourceId != null){
			putQueryParameter("HtmlResourceId", htmlResourceId);
		}
	}

	public String getConfig() {
		return this.config;
	}

	public void setConfig(String config) {
		this.config = config;
		if(config != null){
			putQueryParameter("Config", config);
		}
	}

	@Override
	public Class<EditHtmlResourceResponse> getResponseClass() {
		return EditHtmlResourceResponse.class;
	}

}
