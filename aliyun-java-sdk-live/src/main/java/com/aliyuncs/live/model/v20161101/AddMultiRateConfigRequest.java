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
public class AddMultiRateConfigRequest extends RpcAcsRequest<AddMultiRateConfigResponse> {
	   

	private String app;

	private String groupId;

	private String templates;

	private String domainName;

	private Long ownerId;

	private String isLazy;

	private String avFormat;

	private String isTimeAlign;
	public AddMultiRateConfigRequest() {
		super("live", "2016-11-01", "AddMultiRateConfig", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putQueryParameter("App", app);
		}
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId);
		}
	}

	public String getTemplates() {
		return this.templates;
	}

	public void setTemplates(String templates) {
		this.templates = templates;
		if(templates != null){
			putQueryParameter("Templates", templates);
		}
	}

	public String getDomainName() {
		return this.domainName;
	}

	public void setDomainName(String domainName) {
		this.domainName = domainName;
		if(domainName != null){
			putQueryParameter("DomainName", domainName);
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

	public String getIsLazy() {
		return this.isLazy;
	}

	public void setIsLazy(String isLazy) {
		this.isLazy = isLazy;
		if(isLazy != null){
			putQueryParameter("IsLazy", isLazy);
		}
	}

	public String getAvFormat() {
		return this.avFormat;
	}

	public void setAvFormat(String avFormat) {
		this.avFormat = avFormat;
		if(avFormat != null){
			putQueryParameter("AvFormat", avFormat);
		}
	}

	public String getIsTimeAlign() {
		return this.isTimeAlign;
	}

	public void setIsTimeAlign(String isTimeAlign) {
		this.isTimeAlign = isTimeAlign;
		if(isTimeAlign != null){
			putQueryParameter("IsTimeAlign", isTimeAlign);
		}
	}

	@Override
	public Class<AddMultiRateConfigResponse> getResponseClass() {
		return AddMultiRateConfigResponse.class;
	}

}
