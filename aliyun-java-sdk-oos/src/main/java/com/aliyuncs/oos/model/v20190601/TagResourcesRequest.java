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
import java.util.Map;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class TagResourcesRequest extends RpcAcsRequest<TagResourcesResponse> {
	   

	private String resourceType;

	private Map<Object,Object> tags;

	private List<Object> resourceIds;
	public TagResourcesRequest() {
		super("oos", "2019-06-01", "TagResources", "oos");
		setMethod(MethodType.POST);
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

	public Map<Object,Object> getTags() {
		return this.tags;
	}

	public void setTags(Map<Object,Object> tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", new Gson().toJson(tags));
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
	public Class<TagResourcesResponse> getResponseClass() {
		return TagResourcesResponse.class;
	}

}
