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

package com.aliyuncs.hbr.model.v20170908;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.hbr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeRegionsRequest extends RpcAcsRequest<DescribeRegionsResponse> {
	   

	private Boolean needVaultCount;
	public DescribeRegionsRequest() {
		super("hbr", "2017-09-08", "DescribeRegions", "hbr");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getNeedVaultCount() {
		return this.needVaultCount;
	}

	public void setNeedVaultCount(Boolean needVaultCount) {
		this.needVaultCount = needVaultCount;
		if(needVaultCount != null){
			putQueryParameter("NeedVaultCount", needVaultCount.toString());
		}
	}

	@Override
	public Class<DescribeRegionsResponse> getResponseClass() {
		return DescribeRegionsResponse.class;
	}

}
