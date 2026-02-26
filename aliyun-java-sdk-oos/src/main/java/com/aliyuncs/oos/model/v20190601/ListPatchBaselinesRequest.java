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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.oos.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListPatchBaselinesRequest extends RpcAcsRequest<ListPatchBaselinesResponse> {
	   

	@SerializedName("sources")
	private List<String> sources;

	private String resourceGroupId;

	private String nextToken;

	private String shareType;

	private Boolean approvedPatchesEnableNonSecurity;

	@SerializedName("tags")
	private List<Tags> tags;

	private String operationSystem;

	private String name;

	private Integer maxResults;

	@SerializedName("approvedPatches")
	private List<String> approvedPatches;
	public ListPatchBaselinesRequest() {
		super("oos", "2019-06-01", "ListPatchBaselines", "oos");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getSources() {
		return this.sources;
	}

	public void setSources(List<String> sources) {
		this.sources = sources;	
		if (sources != null) {
			putQueryParameter("Sources" , new Gson().toJson(sources));
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

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
		}
	}

	public String getShareType() {
		return this.shareType;
	}

	public void setShareType(String shareType) {
		this.shareType = shareType;
		if(shareType != null){
			putQueryParameter("ShareType", shareType);
		}
	}

	public Boolean getApprovedPatchesEnableNonSecurity() {
		return this.approvedPatchesEnableNonSecurity;
	}

	public void setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
		this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
		if(approvedPatchesEnableNonSecurity != null){
			putQueryParameter("ApprovedPatchesEnableNonSecurity", approvedPatchesEnableNonSecurity.toString());
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

	public String getOperationSystem() {
		return this.operationSystem;
	}

	public void setOperationSystem(String operationSystem) {
		this.operationSystem = operationSystem;
		if(operationSystem != null){
			putQueryParameter("OperationSystem", operationSystem);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
		}
	}

	public List<String> getApprovedPatches() {
		return this.approvedPatches;
	}

	public void setApprovedPatches(List<String> approvedPatches) {
		this.approvedPatches = approvedPatches;	
		if (approvedPatches != null) {
			putQueryParameter("ApprovedPatches" , new Gson().toJson(approvedPatches));
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
	public Class<ListPatchBaselinesResponse> getResponseClass() {
		return ListPatchBaselinesResponse.class;
	}

}
