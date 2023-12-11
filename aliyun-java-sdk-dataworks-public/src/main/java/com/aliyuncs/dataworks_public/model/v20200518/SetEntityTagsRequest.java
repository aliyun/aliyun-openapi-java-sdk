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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class SetEntityTagsRequest extends RpcAcsRequest<SetEntityTagsResponse> {
	   

	private String qualifiedName;

	@SerializedName("tags")
	private List<Object> tags;
	public SetEntityTagsRequest() {
		super("dataworks-public", "2020-05-18", "SetEntityTags");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getQualifiedName() {
		return this.qualifiedName;
	}

	public void setQualifiedName(String qualifiedName) {
		this.qualifiedName = qualifiedName;
		if(qualifiedName != null){
			putQueryParameter("QualifiedName", qualifiedName);
		}
	}

	public List<Object> getTags() {
		return this.tags;
	}

	public void setTags(List<Object> tags) {
		this.tags = tags;	
		if (tags != null) {
			putBodyParameter("Tags" , new Gson().toJson(tags));
		}	
	}

	@Override
	public Class<SetEntityTagsResponse> getResponseClass() {
		return SetEntityTagsResponse.class;
	}

}
