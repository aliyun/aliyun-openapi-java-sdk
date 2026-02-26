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

package com.aliyuncs.bdrc.model.v20230808;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeTopRiskyResourcesRequest extends RoaAcsRequest<DescribeTopRiskyResourcesResponse> {
	   

	private String resourceType;
	public DescribeTopRiskyResourcesRequest() {
		super("BDRC", "2023-08-08", "DescribeTopRiskyResources");
		setUriPattern("/api/v1/resources/top-risky");
		setMethod(MethodType.GET);
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

	@Override
	public Class<DescribeTopRiskyResourcesResponse> getResponseClass() {
		return DescribeTopRiskyResourcesResponse.class;
	}

}
