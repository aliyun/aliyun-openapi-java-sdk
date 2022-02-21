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

package com.aliyuncs.edas.model.v20170801;

import com.aliyuncs.RoaAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTagResourcesRequest extends RoaAcsRequest<ListTagResourcesResponse> {
	   

	private String resourceType;

	private String resourceRegionId;

	private List<Object> resourceIds;

	private List<Object> tags;
	public ListTagResourcesRequest() {
		super("Edas", "2017-08-01", "ListTagResources", "Edas");
		setUriPattern("/pop/v5/tag/tags");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getResourceRegionId() {
		return this.resourceRegionId;
	}

	public void setResourceRegionId(String resourceRegionId) {
		this.resourceRegionId = resourceRegionId;
		if(resourceRegionId != null){
			putQueryParameter("ResourceRegionId", resourceRegionId);
		}
	}

	public List<Object> getResourceIds() {
		return this.resourceIds;
	}

	public void setResourceIds(List<Object> resourceIds) {
		this.resourceIds = resourceIds;
		if(resourceIds != null){
			putQueryParameter("ResourceIds", new Gson().toJson(resourceIds));
		}
	}

	public List<Object> getTags() {
		return this.tags;
	}

	public void setTags(List<Object> tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", new Gson().toJson(tags));
		}
	}

	@Override
	public Class<ListTagResourcesResponse> getResponseClass() {
		return ListTagResourcesResponse.class;
	}

}
