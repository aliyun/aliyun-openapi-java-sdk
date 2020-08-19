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
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UnTagLiveResourcesRequest extends RpcAcsRequest<UnTagLiveResourcesResponse> {
	   

	private Boolean all;

	private List<String> resourceIds;

	private Long ownerId;

	private String resourceType;

	private List<String> tagKeys;
	public UnTagLiveResourcesRequest() {
		super("live", "2016-11-01", "UnTagLiveResources");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public List<String> getResourceIds() {
		return this.resourceIds;
	}

	public void setResourceIds(List<String> resourceIds) {
		this.resourceIds = resourceIds;	
		if (resourceIds != null) {
			for (int i = 0; i < resourceIds.size(); i++) {
				putQueryParameter("ResourceId." + (i + 1) , resourceIds.get(i));
			}
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

	@Override
	public Class<UnTagLiveResourcesResponse> getResponseClass() {
		return UnTagLiveResourcesResponse.class;
	}

}
