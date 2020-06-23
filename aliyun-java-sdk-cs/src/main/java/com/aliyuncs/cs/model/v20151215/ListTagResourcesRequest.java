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

package com.aliyuncs.cs.model.v20151215;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.cs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListTagResourcesRequest extends RoaAcsRequest<ListTagResourcesResponse> {
	   

	private String resource_type;

	private String next_token;

	private String resource_ids;

	private String tags;
	public ListTagResourcesRequest() {
		super("CS", "2015-12-15", "ListTagResources");
		setUriPattern("/tags");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResource_type() {
		return this.resource_type;
	}

	public void setResource_type(String resource_type) {
		this.resource_type = resource_type;
		if(resource_type != null){
			putQueryParameter("resource_type", resource_type);
		}
	}

	public String getNext_token() {
		return this.next_token;
	}

	public void setNext_token(String next_token) {
		this.next_token = next_token;
		if(next_token != null){
			putQueryParameter("next_token", next_token);
		}
	}

	public String getResource_ids() {
		return this.resource_ids;
	}

	public void setResource_ids(String resource_ids) {
		this.resource_ids = resource_ids;
		if(resource_ids != null){
			putQueryParameter("resource_ids", resource_ids);
		}
	}

	public String getTags() {
		return this.tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("tags", tags);
		}
	}

	@Override
	public Class<ListTagResourcesResponse> getResponseClass() {
		return ListTagResourcesResponse.class;
	}

}
