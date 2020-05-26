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
public class GetScreenRequest extends RpcAcsRequest<GetScreenResponse> {
	   

	private String product;

	private Boolean needConfig;

	private String version;

	private Integer screenId;

	private Boolean needInteraction;

	private String domain;

	private Boolean needHook;
	public GetScreenRequest() {
		super("datav-outer", "2019-04-02", "GetScreen", "datav");
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

	public Boolean getNeedConfig() {
		return this.needConfig;
	}

	public void setNeedConfig(Boolean needConfig) {
		this.needConfig = needConfig;
		if(needConfig != null){
			putBodyParameter("NeedConfig", needConfig.toString());
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

	public Boolean getNeedInteraction() {
		return this.needInteraction;
	}

	public void setNeedInteraction(Boolean needInteraction) {
		this.needInteraction = needInteraction;
		if(needInteraction != null){
			putBodyParameter("NeedInteraction", needInteraction.toString());
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

	public Boolean getNeedHook() {
		return this.needHook;
	}

	public void setNeedHook(Boolean needHook) {
		this.needHook = needHook;
		if(needHook != null){
			putBodyParameter("NeedHook", needHook.toString());
		}
	}

	@Override
	public Class<GetScreenResponse> getResponseClass() {
		return GetScreenResponse.class;
	}

}
