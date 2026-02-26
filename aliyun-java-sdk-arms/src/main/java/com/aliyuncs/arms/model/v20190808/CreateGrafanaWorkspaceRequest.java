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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateGrafanaWorkspaceRequest extends RpcAcsRequest<CreateGrafanaWorkspaceResponse> {
	   

	private String accountNumber;

	private String aliyunLang;

	private String description;

	private String grafanaWorkspaceName;

	@SerializedName("tags")
	private List<Tags> tags;

	private String duration;

	private String resourceGroupId;

	private String grafanaVersion;

	private String password;

	private String autoRenew;

	private String grafanaWorkspaceEdition;

	private String customAccountNumber;

	private String pricingCycle;
	public CreateGrafanaWorkspaceRequest() {
		super("ARMS", "2019-08-08", "CreateGrafanaWorkspace", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAccountNumber() {
		return this.accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
		if(accountNumber != null){
			putQueryParameter("AccountNumber", accountNumber);
		}
	}

	public String getAliyunLang() {
		return this.aliyunLang;
	}

	public void setAliyunLang(String aliyunLang) {
		this.aliyunLang = aliyunLang;
		if(aliyunLang != null){
			putQueryParameter("AliyunLang", aliyunLang);
		}
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

	public String getGrafanaWorkspaceName() {
		return this.grafanaWorkspaceName;
	}

	public void setGrafanaWorkspaceName(String grafanaWorkspaceName) {
		this.grafanaWorkspaceName = grafanaWorkspaceName;
		if(grafanaWorkspaceName != null){
			putQueryParameter("GrafanaWorkspaceName", grafanaWorkspaceName);
		}
	}

	public List<Tags> getTags() {
		return this.tags;
	}

	public void setTags(List<Tags> tags) {
		this.tags = tags;	
		if (tags != null) {
			putQueryParameter("Tags" , new Gson().toJson(tags));
		}	
	}

	public String getDuration() {
		return this.duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
		if(duration != null){
			putQueryParameter("Duration", duration);
		}
	}

	public String getResourceGroupId() {
		return this.resourceGroupId;
	}

	public void setResourceGroupId(String resourceGroupId) {
		this.resourceGroupId = resourceGroupId;
		if(resourceGroupId != null){
			putQueryParameter("ResourceGroupId", resourceGroupId);
		}
	}

	public String getGrafanaVersion() {
		return this.grafanaVersion;
	}

	public void setGrafanaVersion(String grafanaVersion) {
		this.grafanaVersion = grafanaVersion;
		if(grafanaVersion != null){
			putQueryParameter("GrafanaVersion", grafanaVersion);
		}
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
		if(password != null){
			putQueryParameter("Password", password);
		}
	}

	public String getAutoRenew() {
		return this.autoRenew;
	}

	public void setAutoRenew(String autoRenew) {
		this.autoRenew = autoRenew;
		if(autoRenew != null){
			putQueryParameter("AutoRenew", autoRenew);
		}
	}

	public String getGrafanaWorkspaceEdition() {
		return this.grafanaWorkspaceEdition;
	}

	public void setGrafanaWorkspaceEdition(String grafanaWorkspaceEdition) {
		this.grafanaWorkspaceEdition = grafanaWorkspaceEdition;
		if(grafanaWorkspaceEdition != null){
			putQueryParameter("GrafanaWorkspaceEdition", grafanaWorkspaceEdition);
		}
	}

	public String getCustomAccountNumber() {
		return this.customAccountNumber;
	}

	public void setCustomAccountNumber(String customAccountNumber) {
		this.customAccountNumber = customAccountNumber;
		if(customAccountNumber != null){
			putQueryParameter("CustomAccountNumber", customAccountNumber);
		}
	}

	public String getPricingCycle() {
		return this.pricingCycle;
	}

	public void setPricingCycle(String pricingCycle) {
		this.pricingCycle = pricingCycle;
		if(pricingCycle != null){
			putQueryParameter("PricingCycle", pricingCycle);
		}
	}

	public static class Tags {

		@SerializedName("Value")
		private String value;

		@SerializedName("Key")
		private String key;

		public String getValue() {
			return this.value;
		}

		public void setValue(String value) {
			this.value = value;
		}

		public String getKey() {
			return this.key;
		}

		public void setKey(String key) {
			this.key = key;
		}
	}

	@Override
	public Class<CreateGrafanaWorkspaceResponse> getResponseClass() {
		return CreateGrafanaWorkspaceResponse.class;
	}

}
