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

package com.aliyuncs.resourcecenter.model.v20221201;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetResourceConfigurationRequest extends RpcAcsRequest<GetResourceConfigurationResponse> {
	   

	private String resourceId;

	private String resourceType;

	private String resourceRegionId;
	public GetResourceConfigurationRequest() {
		super("ResourceCenter", "2022-12-01", "GetResourceConfiguration");
		setMethod(MethodType.POST);
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
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

	public String getResourceRegionId() {
		return this.resourceRegionId;
	}

	public void setResourceRegionId(String resourceRegionId) {
		this.resourceRegionId = resourceRegionId;
		if(resourceRegionId != null){
			putQueryParameter("ResourceRegionId", resourceRegionId);
		}
	}

	@Override
	public Class<GetResourceConfigurationResponse> getResponseClass() {
		return GetResourceConfigurationResponse.class;
	}

}
