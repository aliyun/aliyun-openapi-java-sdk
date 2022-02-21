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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.edas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class TagResourcesRequest extends RoaAcsRequest<TagResourcesResponse> {
	   

	private String resourceType;

	private String resourceRegionId;

	private String resourceIds;

	private String tags;
	public TagResourcesRequest() {
		super("Edas", "2017-08-01", "TagResources", "Edas");
		setUriPattern("/pop/v5/tag/tags");
		setMethod(MethodType.POST);
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

	public String getResourceIds() {
		return this.resourceIds;
	}

	public void setResourceIds(String resourceIds) {
		this.resourceIds = resourceIds;
		if(resourceIds != null){
			putQueryParameter("ResourceIds", resourceIds);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", tags);
		}
	}

	@Override
	public Class<TagResourcesResponse> getResponseClass() {
		return TagResourcesResponse.class;
	}

}
