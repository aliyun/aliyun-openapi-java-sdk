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

package com.aliyuncs.ecsops.model.v20160401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeFleetsRequest extends RpcAcsRequest<OpsDescribeFleetsResponse> {
	   

	private List<String> fleetIds;

	private Integer pageNumber;

	private String fleetName;

	private List<String> fleetStatuss;

	private Integer pageSize;

	private Long aliUid;

	private String auditParamStr;
	public OpsDescribeFleetsRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeFleets", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getFleetIds() {
		return this.fleetIds;
	}

	public void setFleetIds(List<String> fleetIds) {
		this.fleetIds = fleetIds;	
		if (fleetIds != null) {
			for (int i = 0; i < fleetIds.size(); i++) {
				putQueryParameter("FleetId." + (i + 1) , fleetIds.get(i));
			}
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

	public String getFleetName() {
		return this.fleetName;
	}

	public void setFleetName(String fleetName) {
		this.fleetName = fleetName;
		if(fleetName != null){
			putQueryParameter("FleetName", fleetName);
		}
	}

	public List<String> getFleetStatuss() {
		return this.fleetStatuss;
	}

	public void setFleetStatuss(List<String> fleetStatuss) {
		this.fleetStatuss = fleetStatuss;	
		if (fleetStatuss != null) {
			for (int i = 0; i < fleetStatuss.size(); i++) {
				putQueryParameter("FleetStatus." + (i + 1) , fleetStatuss.get(i));
			}
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

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
		}
	}

	public String getAuditParamStr() {
		return this.auditParamStr;
	}

	public void setAuditParamStr(String auditParamStr) {
		this.auditParamStr = auditParamStr;
		if(auditParamStr != null){
			putQueryParameter("AuditParamStr", auditParamStr);
		}
	}

	@Override
	public Class<OpsDescribeFleetsResponse> getResponseClass() {
		return OpsDescribeFleetsResponse.class;
	}

}
