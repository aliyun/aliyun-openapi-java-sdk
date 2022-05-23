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

package com.aliyuncs.arms.model.v20190808;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.arms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class AddPrometheusGlobalViewByAliClusterIdsRequest extends RpcAcsRequest<AddPrometheusGlobalViewByAliClusterIdsResponse> {
	   

	private String productCode;

	private String clusterIds;

	private String groupName;
	public AddPrometheusGlobalViewByAliClusterIdsRequest() {
		super("ARMS", "2019-08-08", "AddPrometheusGlobalViewByAliClusterIds", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getProductCode() {
		return this.productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
		if(productCode != null){
			putQueryParameter("ProductCode", productCode);
		}
	}

	public String getClusterIds() {
		return this.clusterIds;
	}

	public void setClusterIds(String clusterIds) {
		this.clusterIds = clusterIds;
		if(clusterIds != null){
			putQueryParameter("ClusterIds", clusterIds);
		}
	}

	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
		if(groupName != null){
			putQueryParameter("GroupName", groupName);
		}
	}

	@Override
	public Class<AddPrometheusGlobalViewByAliClusterIdsResponse> getResponseClass() {
		return AddPrometheusGlobalViewByAliClusterIdsResponse.class;
	}

}
