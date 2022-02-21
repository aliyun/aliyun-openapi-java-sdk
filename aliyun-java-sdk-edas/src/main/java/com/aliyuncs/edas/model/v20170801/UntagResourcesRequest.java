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
public class UntagResourcesRequest extends RoaAcsRequest<UntagResourcesResponse> {
	   

	private String tagKeys;

	private Boolean deleteAll;

	private String resourceRegionId;

	private String resourceType;

	private String resourceIds;
	public UntagResourcesRequest() {
		super("Edas", "2017-08-01", "UntagResources", "Edas");
		setUriPattern("/pop/v5/tag/tags");
		setMethod(MethodType.DELETE);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTagKeys() {
		return this.tagKeys;
	}

	public void setTagKeys(String tagKeys) {
		this.tagKeys = tagKeys;
		if(tagKeys != null){
			putQueryParameter("TagKeys", tagKeys);
		}
	}

	public Boolean getDeleteAll() {
		return this.deleteAll;
	}

	public void setDeleteAll(Boolean deleteAll) {
		this.deleteAll = deleteAll;
		if(deleteAll != null){
			putQueryParameter("DeleteAll", deleteAll.toString());
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

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
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

	@Override
	public Class<UntagResourcesResponse> getResponseClass() {
		return UntagResourcesResponse.class;
	}

}
