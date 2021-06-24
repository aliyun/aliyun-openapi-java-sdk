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

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeDedicatedHostsRequest extends RpcAcsRequest<OpsDescribeDedicatedHostsResponse> {
	   

	private Integer pageNumber;

	private Integer pageSize;

	private String aliUid;

	private List<String> dedicatedHostIds;

	private String zoneId;

	private String auditParamStr;
	public OpsDescribeDedicatedHostsRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeDedicatedHosts", "ecsops");
		setMethod(MethodType.POST);
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

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(String aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid);
		}
	}

	public List<String> getDedicatedHostIds() {
		return this.dedicatedHostIds;
	}

	public void setDedicatedHostIds(List<String> dedicatedHostIds) {
		this.dedicatedHostIds = dedicatedHostIds;	
		if (dedicatedHostIds != null) {
			for (int i = 0; i < dedicatedHostIds.size(); i++) {
				putQueryParameter("DedicatedHostId." + (i + 1) , dedicatedHostIds.get(i));
			}
		}	
	}

	public String getZoneId() {
		return this.zoneId;
	}

	public void setZoneId(String zoneId) {
		this.zoneId = zoneId;
		if(zoneId != null){
			putQueryParameter("ZoneId", zoneId);
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
	public Class<OpsDescribeDedicatedHostsResponse> getResponseClass() {
		return OpsDescribeDedicatedHostsResponse.class;
	}

}
