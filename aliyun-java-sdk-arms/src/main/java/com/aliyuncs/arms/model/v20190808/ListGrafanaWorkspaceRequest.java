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
public class ListGrafanaWorkspaceRequest extends RpcAcsRequest<ListGrafanaWorkspaceResponse> {
	   

	private String aliyunLang;

	@SerializedName("tags")
	private List<Tags> tags;

	private String resourceGroupId;
	public ListGrafanaWorkspaceRequest() {
		super("ARMS", "2019-08-08", "ListGrafanaWorkspace", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<Tags> getTags() {
		return this.tags;
	}

	public void setTags(List<Tags> tags) {
		this.tags = tags;	
		if (tags != null) {
			putQueryParameter("Tags" , new Gson().toJson(tags));
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
	public Class<ListGrafanaWorkspaceResponse> getResponseClass() {
		return ListGrafanaWorkspaceResponse.class;
	}

}
