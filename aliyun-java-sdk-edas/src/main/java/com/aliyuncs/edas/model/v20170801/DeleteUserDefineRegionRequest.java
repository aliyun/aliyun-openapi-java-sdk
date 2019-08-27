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
public class DeleteUserDefineRegionRequest extends RoaAcsRequest<DeleteUserDefineRegionResponse> {
	
	public DeleteUserDefineRegionRequest() {
		super("Edas", "2017-08-01", "DeleteUserDefineRegion", "edas");
		setUriPattern("/pop/v5/user_region_def");
		setMethod(MethodType.DELETE);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String regionTag;

	private Long id;

	public String getRegionTag() {
		return this.regionTag;
	}

	public void setRegionTag(String regionTag) {
		this.regionTag = regionTag;
		if(regionTag != null){
			putQueryParameter("RegionTag", regionTag);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	@Override
	public Class<DeleteUserDefineRegionResponse> getResponseClass() {
		return DeleteUserDefineRegionResponse.class;
	}

}
