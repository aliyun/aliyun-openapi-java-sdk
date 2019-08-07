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

package com.aliyuncs.mse.model.v20190531;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ListClustersRequest extends RpcAcsRequest<ListClustersResponse> {
	
	public ListClustersRequest() {
		super("mse", "2019-05-31", "ListClusters", "mse");
	}

	private String requestPars;

	private Integer pageSize;

	private String clusterAliasName;

	private Integer pageNum;

	public String getRequestPars() {
		return this.requestPars;
	}

	public void setRequestPars(String requestPars) {
		this.requestPars = requestPars;
		if(requestPars != null){
			putQueryParameter("RequestPars", requestPars);
		}
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

	public String getClusterAliasName() {
		return this.clusterAliasName;
	}

	public void setClusterAliasName(String clusterAliasName) {
		this.clusterAliasName = clusterAliasName;
		if(clusterAliasName != null){
			putQueryParameter("ClusterAliasName", clusterAliasName);
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

	@Override
	public Class<ListClustersResponse> getResponseClass() {
		return ListClustersResponse.class;
	}

}
