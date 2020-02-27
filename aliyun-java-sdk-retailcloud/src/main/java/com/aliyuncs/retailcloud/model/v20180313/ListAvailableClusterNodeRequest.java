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

package com.aliyuncs.retailcloud.model.v20180313;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.retailcloud.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ListAvailableClusterNodeRequest extends RpcAcsRequest<ListAvailableClusterNodeResponse> {
	   

	private Integer pageSize;

	private Integer pageNum;

	private String clusterInstanceId;
	public ListAvailableClusterNodeRequest() {
		super("retailcloud", "2018-03-13", "ListAvailableClusterNode", "retailcloud");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public Integer getPageNum() {
		return this.pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
		if(pageNum != null){
			putQueryParameter("PageNum", pageNum.toString());
		}
	}

	public String getClusterInstanceId() {
		return this.clusterInstanceId;
	}

	public void setClusterInstanceId(String clusterInstanceId) {
		this.clusterInstanceId = clusterInstanceId;
		if(clusterInstanceId != null){
			putQueryParameter("ClusterInstanceId", clusterInstanceId);
		}
	}

	@Override
	public Class<ListAvailableClusterNodeResponse> getResponseClass() {
		return ListAvailableClusterNodeResponse.class;
	}

}
