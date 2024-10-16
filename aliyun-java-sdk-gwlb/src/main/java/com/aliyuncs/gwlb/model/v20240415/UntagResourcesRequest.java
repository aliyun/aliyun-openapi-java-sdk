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

package com.aliyuncs.gwlb.model.v20240415;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UntagResourcesRequest extends RpcAcsRequest<UntagResourcesResponse> {
	   

	private String clientToken;

	private Boolean all;

	private List<String> resourceId;

	private Boolean dryRun;

	private String resourceType;

	private List<String> tagKey;
	public UntagResourcesRequest() {
		super("Gwlb", "2024-04-15", "UntagResources");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putBodyParameter("ClientToken", clientToken);
		}
	}

	public Boolean getAll() {
		return this.all;
	}

	public void setAll(Boolean all) {
		this.all = all;
		if(all != null){
			putBodyParameter("All", all.toString());
		}
	}

	public List<String> getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(List<String> resourceId) {
		this.resourceId = resourceId;	
		if (resourceId != null) {
			for (int depth1 = 0; depth1 < resourceId.size(); depth1++) {
				putBodyParameter("ResourceId." + (depth1 + 1) , resourceId.get(depth1));
			}
		}	
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putBodyParameter("DryRun", dryRun.toString());
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putBodyParameter("ResourceType", resourceType);
		}
	}

	public List<String> getTagKey() {
		return this.tagKey;
	}

	public void setTagKey(List<String> tagKey) {
		this.tagKey = tagKey;	
		if (tagKey != null) {
			for (int depth1 = 0; depth1 < tagKey.size(); depth1++) {
				putBodyParameter("TagKey." + (depth1 + 1) , tagKey.get(depth1));
			}
		}	
	}

	@Override
	public Class<UntagResourcesResponse> getResponseClass() {
		return UntagResourcesResponse.class;
	}

}
