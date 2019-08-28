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

package com.aliyuncs.sae.model.v20190506;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sae.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeNamespaceListRequest extends RoaAcsRequest<DescribeNamespaceListResponse> {
	
	public DescribeNamespaceListRequest() {
		super("sae", "2019-05-06", "DescribeNamespaceList", "serverless");
		setUriPattern("/pop/v1/sam/namespace/describeNamespaceList");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Boolean hybridCloudExclude;

	private Boolean containCustom;

	public Boolean getHybridCloudExclude() {
		return this.hybridCloudExclude;
	}

	public void setHybridCloudExclude(Boolean hybridCloudExclude) {
		this.hybridCloudExclude = hybridCloudExclude;
		if(hybridCloudExclude != null){
			putQueryParameter("HybridCloudExclude", hybridCloudExclude.toString());
		}
	}

	public Boolean getContainCustom() {
		return this.containCustom;
	}

	public void setContainCustom(Boolean containCustom) {
		this.containCustom = containCustom;
		if(containCustom != null){
			putQueryParameter("ContainCustom", containCustom.toString());
		}
	}

	@Override
	public Class<DescribeNamespaceListResponse> getResponseClass() {
		return DescribeNamespaceListResponse.class;
	}

}
