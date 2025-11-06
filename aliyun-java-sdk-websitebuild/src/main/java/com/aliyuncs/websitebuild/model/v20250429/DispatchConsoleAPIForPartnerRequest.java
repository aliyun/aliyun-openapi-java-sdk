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

package com.aliyuncs.websitebuild.model.v20250429;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DispatchConsoleAPIForPartnerRequest extends RpcAcsRequest<DispatchConsoleAPIForPartnerResponse> {
	   

	private String product;

	private String liveToken;

	private String siteHost;

	private String params;

	private String operation;
	public DispatchConsoleAPIForPartnerRequest() {
		super("WebsiteBuild", "2025-04-29", "DispatchConsoleAPIForPartner");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
		if(product != null){
			putQueryParameter("Product", product);
		}
	}

	public String getLiveToken() {
		return this.liveToken;
	}

	public void setLiveToken(String liveToken) {
		this.liveToken = liveToken;
		if(liveToken != null){
			putQueryParameter("LiveToken", liveToken);
		}
	}

	public String getSiteHost() {
		return this.siteHost;
	}

	public void setSiteHost(String siteHost) {
		this.siteHost = siteHost;
		if(siteHost != null){
			putQueryParameter("SiteHost", siteHost);
		}
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putQueryParameter("Params", params);
		}
	}

	public String getOperation() {
		return this.operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
		if(operation != null){
			putQueryParameter("Operation", operation);
		}
	}

	@Override
	public Class<DispatchConsoleAPIForPartnerResponse> getResponseClass() {
		return DispatchConsoleAPIForPartnerResponse.class;
	}

}
