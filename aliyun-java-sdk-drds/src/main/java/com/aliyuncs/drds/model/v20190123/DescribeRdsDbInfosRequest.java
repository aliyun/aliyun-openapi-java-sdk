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

package com.aliyuncs.drds.model.v20190123;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.drds.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeRdsDbInfosRequest extends RpcAcsRequest<DescribeRdsDbInfosResponse> {
	   

	private String rdsInstId;

	private String search;
	public DescribeRdsDbInfosRequest() {
		super("Drds", "2019-01-23", "DescribeRdsDbInfos", "Drds");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getRdsInstId() {
		return this.rdsInstId;
	}

	public void setRdsInstId(String rdsInstId) {
		this.rdsInstId = rdsInstId;
		if(rdsInstId != null){
			putQueryParameter("RdsInstId", rdsInstId);
		}
	}

	public String getSearch() {
		return this.search;
	}

	public void setSearch(String search) {
		this.search = search;
		if(search != null){
			putQueryParameter("Search", search);
		}
	}

	@Override
	public Class<DescribeRdsDbInfosResponse> getResponseClass() {
		return DescribeRdsDbInfosResponse.class;
	}

}
