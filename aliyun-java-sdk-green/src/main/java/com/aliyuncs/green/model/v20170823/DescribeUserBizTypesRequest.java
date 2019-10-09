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

package com.aliyuncs.green.model.v20170823;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.green.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeUserBizTypesRequest extends RpcAcsRequest<DescribeUserBizTypesResponse> {
	   

	private Boolean customized;
	public DescribeUserBizTypesRequest() {
		super("Green", "2017-08-23", "DescribeUserBizTypes", "green");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getCustomized() {
		return this.customized;
	}

	public void setCustomized(Boolean customized) {
		this.customized = customized;
		if(customized != null){
			putQueryParameter("Customized", customized.toString());
		}
	}

	@Override
	public Class<DescribeUserBizTypesResponse> getResponseClass() {
		return DescribeUserBizTypesResponse.class;
	}

}
