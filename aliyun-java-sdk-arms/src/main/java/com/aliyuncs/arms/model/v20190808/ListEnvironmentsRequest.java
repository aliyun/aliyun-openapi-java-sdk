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
public class ListEnvironmentsRequest extends RpcAcsRequest<ListEnvironmentsResponse> {
	   

	private String filterRegionIds;

	private String resourceGroupId;

	private String addonName;

	private String environmentType;

	@SerializedName("tag")
	private List<Tag> tag;

	private String bindResourceId;

	private String feePackage;
	public ListEnvironmentsRequest() {
		super("ARMS", "2019-08-08", "ListEnvironments", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getFilterRegionIds() {
		return this.filterRegionIds;
	}

	public void setFilterRegionIds(String filterRegionIds) {
		this.filterRegionIds = filterRegionIds;
		if(filterRegionIds != null){
			putQueryParameter("FilterRegionIds", filterRegionIds);
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

	public String getAddonName() {
		return this.addonName;
	}

	public void setAddonName(String addonName) {
		this.addonName = addonName;
		if(addonName != null){
			putQueryParameter("AddonName", addonName);
		}
	}

	public String getEnvironmentType() {
		return this.environmentType;
	}

	public void setEnvironmentType(String environmentType) {
		this.environmentType = environmentType;
		if(environmentType != null){
			putQueryParameter("EnvironmentType", environmentType);
		}
	}

	public List<Tag> getTag() {
		return this.tag;
	}

	public void setTag(List<Tag> tag) {
		this.tag = tag;	
		if (tag != null) {
			putQueryParameter("Tag" , new Gson().toJson(tag));
		}	
	}

	public String getBindResourceId() {
		return this.bindResourceId;
	}

	public void setBindResourceId(String bindResourceId) {
		this.bindResourceId = bindResourceId;
		if(bindResourceId != null){
			putQueryParameter("BindResourceId", bindResourceId);
		}
	}

	public String getFeePackage() {
		return this.feePackage;
	}

	public void setFeePackage(String feePackage) {
		this.feePackage = feePackage;
		if(feePackage != null){
			putQueryParameter("FeePackage", feePackage);
		}
	}

	public static class Tag {

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
	public Class<ListEnvironmentsResponse> getResponseClass() {
		return ListEnvironmentsResponse.class;
	}

}
