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

package com.aliyuncs.resourcemanager.model.v20200331;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.resourcemanager.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class MoveResourcesRequest extends RpcAcsRequest<MoveResourcesResponse> {
	   

	private List<Resources> resources;

	private String resourceGroupId;
	public MoveResourcesRequest() {
		super("ResourceManager", "2020-03-31", "MoveResources");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<Resources> getResources() {
		return this.resources;
	}

	public void setResources(List<Resources> resources) {
		this.resources = resources;	
		if (resources != null) {
			for (int depth1 = 0; depth1 < resources.size(); depth1++) {
				if (resources.get(depth1) != null) {
					
						putQueryParameter("Resources." + (depth1 + 1) + ".ResourceId" , resources.get(depth1).getResourceId());
						putQueryParameter("Resources." + (depth1 + 1) + ".RegionId" , resources.get(depth1).getRegionId());
						putQueryParameter("Resources." + (depth1 + 1) + ".Service" , resources.get(depth1).getService());
						putQueryParameter("Resources." + (depth1 + 1) + ".ResourceType" , resources.get(depth1).getResourceType());
				}
			}
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

	public static class Resources {

		private String resourceId;

		private String regionId;

		private String service;

		private String resourceType;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getRegionId() {
			return this.regionId;
		}

		public void setRegionId(String regionId) {
			this.regionId = regionId;
		}

		public String getService() {
			return this.service;
		}

		public void setService(String service) {
			this.service = service;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}
	}

	@Override
	public Class<MoveResourcesResponse> getResponseClass() {
		return MoveResourcesResponse.class;
	}

}
