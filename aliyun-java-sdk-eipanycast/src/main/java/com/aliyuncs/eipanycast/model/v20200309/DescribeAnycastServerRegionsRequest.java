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

package com.aliyuncs.eipanycast.model.v20200309;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eipanycast.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeAnycastServerRegionsRequest extends RpcAcsRequest<DescribeAnycastServerRegionsResponse> {
	   

	private String serviceLocation;
	public DescribeAnycastServerRegionsRequest() {
		super("Eipanycast", "2020-03-09", "DescribeAnycastServerRegions", "eipanycast");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getServiceLocation() {
		return this.serviceLocation;
	}

	public void setServiceLocation(String serviceLocation) {
		this.serviceLocation = serviceLocation;
		if(serviceLocation != null){
			putQueryParameter("ServiceLocation", serviceLocation);
		}
	}

	@Override
	public Class<DescribeAnycastServerRegionsResponse> getResponseClass() {
		return DescribeAnycastServerRegionsResponse.class;
	}

}
