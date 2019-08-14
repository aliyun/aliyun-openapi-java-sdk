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
public class InsertOrUpdateRegionRequest extends RoaAcsRequest<InsertOrUpdateRegionResponse> {
	
	public InsertOrUpdateRegionRequest() {
		super("Edas", "2017-08-01", "InsertOrUpdateRegion", "edas");
		setUriPattern("/pop/v5/user_region_def");
		setMethod(MethodType.POST);
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Boolean debugEnable;

	private String regionTag;

	private String regionName;

	private String description;

	private Long id;

	public Boolean getDebugEnable() {
		return this.debugEnable;
	}

	public void setDebugEnable(Boolean debugEnable) {
		this.debugEnable = debugEnable;
		if(debugEnable != null){
			putQueryParameter("DebugEnable", debugEnable.toString());
		}
	}

	public String getRegionTag() {
		return this.regionTag;
	}

	public void setRegionTag(String regionTag) {
		this.regionTag = regionTag;
		if(regionTag != null){
			putQueryParameter("RegionTag", regionTag);
		}
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
		if(regionName != null){
			putQueryParameter("RegionName", regionName);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
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
	public Class<InsertOrUpdateRegionResponse> getResponseClass() {
		return InsertOrUpdateRegionResponse.class;
	}

}
