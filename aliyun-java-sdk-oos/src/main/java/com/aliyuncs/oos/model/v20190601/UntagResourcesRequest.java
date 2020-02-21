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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UntagResourcesRequest extends RpcAcsRequest<UntagResourcesResponse> {
	   

	private Boolean all;

	private String resourceType;

	private List<Object> tagKeys;

	private List<Object> resourceIds;
	public UntagResourcesRequest() {
		super("oos", "2019-06-01", "UntagResources", "oos");
		setMethod(MethodType.POST);
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

	public List<Object> getTagKeys() {
		return this.tagKeys;
	}

	public void setTagKeys(List<Object> tagKeys) {
		this.tagKeys = tagKeys;
		if(tagKeys != null){
			putQueryParameter("TagKeys", new Gson().toJson(tagKeys));
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

	@Override
	public Class<UntagResourcesResponse> getResponseClass() {
		return UntagResourcesResponse.class;
	}

}
