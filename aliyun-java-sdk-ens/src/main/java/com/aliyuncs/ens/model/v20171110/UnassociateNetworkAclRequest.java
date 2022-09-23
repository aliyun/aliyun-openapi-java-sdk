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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UnassociateNetworkAclRequest extends RpcAcsRequest<UnassociateNetworkAclResponse> {
	   

	private String networkAclId;

	private List<Resource> resource;
	public UnassociateNetworkAclRequest() {
		super("Ens", "2017-11-10", "UnassociateNetworkAcl", "ens");
		setMethod(MethodType.POST);
	}

	public String getNetworkAclId() {
		return this.networkAclId;
	}

	public void setNetworkAclId(String networkAclId) {
		this.networkAclId = networkAclId;
		if(networkAclId != null){
			putQueryParameter("NetworkAclId", networkAclId);
		}
	}

	public List<Resource> getResource() {
		return this.resource;
	}

	public void setResource(List<Resource> resource) {
		this.resource = resource;	
		if (resource != null) {
			for (int depth1 = 0; depth1 < resource.size(); depth1++) {
				if (resource.get(depth1) != null) {
					
						putQueryParameter("Resource." + (depth1 + 1) + ".ResourceId" , resource.get(depth1).getResourceId());
						putQueryParameter("Resource." + (depth1 + 1) + ".ResourceType" , resource.get(depth1).getResourceType());
				}
			}
		}	
	}

	public static class Resource {

		private String resourceId;

		private String resourceType;

		public String getResourceId() {
			return this.resourceId;
		}

		public void setResourceId(String resourceId) {
			this.resourceId = resourceId;
		}

		public String getResourceType() {
			return this.resourceType;
		}

		public void setResourceType(String resourceType) {
			this.resourceType = resourceType;
		}
	}

	@Override
	public Class<UnassociateNetworkAclResponse> getResponseClass() {
		return UnassociateNetworkAclResponse.class;
	}

}
