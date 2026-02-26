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

package com.aliyuncs.paielasticdatasetaccelerator.model.v20220801;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeEndpointRequest extends RoaAcsRequest<DescribeEndpointResponse> {
	   

	private String endpointId;
	public DescribeEndpointRequest() {
		super("PAIElasticDatasetAccelerator", "2022-08-01", "DescribeEndpoint", "datasetacc");
		setUriPattern("/api/v1/endpoints/[EndpointId]");
		setMethod(MethodType.GET);
	}

	public String getEndpointId() {
		return this.endpointId;
	}

	public void setEndpointId(String endpointId) {
		this.endpointId = endpointId;
		if(endpointId != null){
			putPathParameter("EndpointId", endpointId);
		}
	}

	@Override
	public Class<DescribeEndpointResponse> getResponseClass() {
		return DescribeEndpointResponse.class;
	}

}
