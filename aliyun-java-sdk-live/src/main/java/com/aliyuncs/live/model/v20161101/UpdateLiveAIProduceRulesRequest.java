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
public class UpdateLiveAIProduceRulesRequest extends RpcAcsRequest<UpdateLiveAIProduceRulesResponse> {
	   

	private String description;

	private String subtitleName;

	private String rulesId;

	private String app;

	private Long ownerId;

	private Boolean isLazy;

	private String liveTemplate;

	private String domain;

	private Boolean isOrigin;

	private String subtitleId;
	public UpdateLiveAIProduceRulesRequest() {
		super("live", "2016-11-01", "UpdateLiveAIProduceRules", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getSubtitleName() {
		return this.subtitleName;
	}

	public void setSubtitleName(String subtitleName) {
		this.subtitleName = subtitleName;
		if(subtitleName != null){
			putQueryParameter("SubtitleName", subtitleName);
		}
	}

	public String getRulesId() {
		return this.rulesId;
	}

	public void setRulesId(String rulesId) {
		this.rulesId = rulesId;
		if(rulesId != null){
			putQueryParameter("RulesId", rulesId);
		}
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

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public Boolean getIsLazy() {
		return this.isLazy;
	}

	public void setIsLazy(Boolean isLazy) {
		this.isLazy = isLazy;
		if(isLazy != null){
			putQueryParameter("IsLazy", isLazy.toString());
		}
	}

	public String getLiveTemplate() {
		return this.liveTemplate;
	}

	public void setLiveTemplate(String liveTemplate) {
		this.liveTemplate = liveTemplate;
		if(liveTemplate != null){
			putQueryParameter("LiveTemplate", liveTemplate);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	public Boolean getIsOrigin() {
		return this.isOrigin;
	}

	public void setIsOrigin(Boolean isOrigin) {
		this.isOrigin = isOrigin;
		if(isOrigin != null){
			putQueryParameter("IsOrigin", isOrigin.toString());
		}
	}

	public String getSubtitleId() {
		return this.subtitleId;
	}

	public void setSubtitleId(String subtitleId) {
		this.subtitleId = subtitleId;
		if(subtitleId != null){
			putQueryParameter("SubtitleId", subtitleId);
		}
	}

	@Override
	public Class<UpdateLiveAIProduceRulesResponse> getResponseClass() {
		return UpdateLiveAIProduceRulesResponse.class;
	}

}
