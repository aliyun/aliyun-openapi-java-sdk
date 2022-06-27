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
public class ListDashboardsByNameRequest extends RpcAcsRequest<ListDashboardsByNameResponse> {
	   

	private String dataSourceType;

	private String dashBoardName;

	private String productCode;

	private String clusterId;

	private Boolean onlyQuery;

	private String groupName;

	private String clusterType;

	private String dashBoardVersion;
	public ListDashboardsByNameRequest() {
		super("ARMS", "2019-08-08", "ListDashboardsByName", "arms");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDataSourceType() {
		return this.dataSourceType;
	}

	public void setDataSourceType(String dataSourceType) {
		this.dataSourceType = dataSourceType;
		if(dataSourceType != null){
			putQueryParameter("DataSourceType", dataSourceType);
		}
	}

	public String getDashBoardName() {
		return this.dashBoardName;
	}

	public void setDashBoardName(String dashBoardName) {
		this.dashBoardName = dashBoardName;
		if(dashBoardName != null){
			putQueryParameter("DashBoardName", dashBoardName);
		}
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
		}
	}

	public Boolean getOnlyQuery() {
		return this.onlyQuery;
	}

	public void setOnlyQuery(Boolean onlyQuery) {
		this.onlyQuery = onlyQuery;
		if(onlyQuery != null){
			putQueryParameter("OnlyQuery", onlyQuery.toString());
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

	public String getClusterType() {
		return this.clusterType;
	}

	public void setClusterType(String clusterType) {
		this.clusterType = clusterType;
		if(clusterType != null){
			putQueryParameter("ClusterType", clusterType);
		}
	}

	public String getDashBoardVersion() {
		return this.dashBoardVersion;
	}

	public void setDashBoardVersion(String dashBoardVersion) {
		this.dashBoardVersion = dashBoardVersion;
		if(dashBoardVersion != null){
			putQueryParameter("DashBoardVersion", dashBoardVersion);
		}
	}

	@Override
	public Class<ListDashboardsByNameResponse> getResponseClass() {
		return ListDashboardsByNameResponse.class;
	}

}
