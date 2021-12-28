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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateCloudDriveServiceRequest extends RpcAcsRequest<CreateCloudDriveServiceResponse> {
	   

	private String name;

	private Long maxSize;
	public CreateCloudDriveServiceRequest() {
		super("ecd", "2020-09-30", "CreateCloudDriveService");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public Long getMaxSize() {
		return this.maxSize;
	}

	public void setMaxSize(Long maxSize) {
		this.maxSize = maxSize;
		if(maxSize != null){
			putQueryParameter("MaxSize", maxSize.toString());
		}
	}

	@Override
	public Class<CreateCloudDriveServiceResponse> getResponseClass() {
		return CreateCloudDriveServiceResponse.class;
	}

}
