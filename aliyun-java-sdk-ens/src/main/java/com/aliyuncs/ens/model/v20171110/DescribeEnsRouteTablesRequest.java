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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeEnsRouteTablesRequest extends RpcAcsRequest<DescribeEnsRouteTablesResponse> {
	   

	private String type;

	private String associateType;

	private String ensRegionId;

	private String routeTableId;

	private String networkId;

	private Integer pageNumber;

	private String routeTableName;

	private Integer pageSize;

	private List<String> ensRegionIds;
	public DescribeEnsRouteTablesRequest() {
		super("Ens", "2017-11-10", "DescribeEnsRouteTables", "ens");
		setMethod(MethodType.POST);
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
		if(type != null){
			putQueryParameter("Type", type);
		}
	}

	public String getAssociateType() {
		return this.associateType;
	}

	public void setAssociateType(String associateType) {
		this.associateType = associateType;
		if(associateType != null){
			putQueryParameter("AssociateType", associateType);
		}
	}

	public String getEnsRegionId() {
		return this.ensRegionId;
	}

	public void setEnsRegionId(String ensRegionId) {
		this.ensRegionId = ensRegionId;
		if(ensRegionId != null){
			putQueryParameter("EnsRegionId", ensRegionId);
		}
	}

	public String getRouteTableId() {
		return this.routeTableId;
	}

	public void setRouteTableId(String routeTableId) {
		this.routeTableId = routeTableId;
		if(routeTableId != null){
			putQueryParameter("RouteTableId", routeTableId);
		}
	}

	public String getNetworkId() {
		return this.networkId;
	}

	public void setNetworkId(String networkId) {
		this.networkId = networkId;
		if(networkId != null){
			putQueryParameter("NetworkId", networkId);
		}
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public String getRouteTableName() {
		return this.routeTableName;
	}

	public void setRouteTableName(String routeTableName) {
		this.routeTableName = routeTableName;
		if(routeTableName != null){
			putQueryParameter("RouteTableName", routeTableName);
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

	public List<String> getEnsRegionIds() {
		return this.ensRegionIds;
	}

	public void setEnsRegionIds(List<String> ensRegionIds) {
		this.ensRegionIds = ensRegionIds;	
		if (ensRegionIds != null) {
			for (int depth1 = 0; depth1 < ensRegionIds.size(); depth1++) {
				putQueryParameter("EnsRegionIds." + (depth1 + 1) , ensRegionIds.get(depth1));
			}
		}	
	}

	@Override
	public Class<DescribeEnsRouteTablesResponse> getResponseClass() {
		return DescribeEnsRouteTablesResponse.class;
	}

}
