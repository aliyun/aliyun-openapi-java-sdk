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

package com.aliyuncs.ddoscoo.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ddoscoo.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteTagResourcesRequest extends RpcAcsRequest<DeleteTagResourcesResponse> {
	   

	private String resourceGroupId;

	private Boolean all;

	private String resourceType;

	private List<String> tagKeys;

	private List<String> resourceIdss;
	public DeleteTagResourcesRequest() {
		super("ddoscoo", "2020-01-01", "DeleteTagResources", "ddoscoo");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Boolean getAll() {
		return this.all;
	}

	public void setAll(Boolean all) {
		this.all = all;
		if(all != null){
			putQueryParameter("All", all.toString());
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public List<String> getTagKeys() {
		return this.tagKeys;
	}

	public void setTagKeys(List<String> tagKeys) {
		this.tagKeys = tagKeys;	
		if (tagKeys != null) {
			for (int i = 0; i < tagKeys.size(); i++) {
				putQueryParameter("TagKey." + (i + 1) , tagKeys.get(i));
			}
		}	
	}

	public List<String> getResourceIdss() {
		return this.resourceIdss;
	}

	public void setResourceIdss(List<String> resourceIdss) {
		this.resourceIdss = resourceIdss;	
		if (resourceIdss != null) {
			for (int i = 0; i < resourceIdss.size(); i++) {
				putQueryParameter("ResourceIds." + (i + 1) , resourceIdss.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteTagResourcesResponse> getResponseClass() {
		return DeleteTagResourcesResponse.class;
	}

}
