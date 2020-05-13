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

package com.aliyuncs.iovcc.model.v20180501;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.iovcc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateDeviceBrandRequest extends RpcAcsRequest<CreateDeviceBrandResponse> {
	   

	private String description;

	private String brandName;

	private String manufacture;

	private String projectId;
	public CreateDeviceBrandRequest() {
		super("iovcc", "2018-05-01", "CreateDeviceBrand", "iovcc");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public String getBrandName() {
		return this.brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
		if(brandName != null){
			putQueryParameter("BrandName", brandName);
		}
	}

	public String getManufacture() {
		return this.manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
		if(manufacture != null){
			putQueryParameter("Manufacture", manufacture);
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putQueryParameter("ProjectId", projectId);
		}
	}

	@Override
	public Class<CreateDeviceBrandResponse> getResponseClass() {
		return CreateDeviceBrandResponse.class;
	}

}
