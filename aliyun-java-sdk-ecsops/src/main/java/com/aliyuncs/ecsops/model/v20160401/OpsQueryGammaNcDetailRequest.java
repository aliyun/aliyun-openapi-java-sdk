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
public class OpsQueryGammaNcDetailRequest extends RpcAcsRequest<OpsQueryGammaNcDetailResponse> {
	   

	private String regionName;

	private String aliUid;

	private List<String> ncIpLists;

	private String azName;

	private String userGroup;

	private String zoneId;

	private String clusterAlias;

	private String auditParamStr;
	public OpsQueryGammaNcDetailRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryGammaNcDetail", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
		if(regionName != null){
			putQueryParameter("RegionName", regionName);
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

	public List<String> getNcIpLists() {
		return this.ncIpLists;
	}

	public void setNcIpLists(List<String> ncIpLists) {
		this.ncIpLists = ncIpLists;	
		if (ncIpLists != null) {
			for (int i = 0; i < ncIpLists.size(); i++) {
				putQueryParameter("NcIpList." + (i + 1) , ncIpLists.get(i));
			}
		}	
	}

	public String getAzName() {
		return this.azName;
	}

	public void setAzName(String azName) {
		this.azName = azName;
		if(azName != null){
			putQueryParameter("AzName", azName);
		}
	}

	public String getUserGroup() {
		return this.userGroup;
	}

	public void setUserGroup(String userGroup) {
		this.userGroup = userGroup;
		if(userGroup != null){
			putQueryParameter("UserGroup", userGroup);
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

	public String getClusterAlias() {
		return this.clusterAlias;
	}

	public void setClusterAlias(String clusterAlias) {
		this.clusterAlias = clusterAlias;
		if(clusterAlias != null){
			putQueryParameter("ClusterAlias", clusterAlias);
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
	public Class<OpsQueryGammaNcDetailResponse> getResponseClass() {
		return OpsQueryGammaNcDetailResponse.class;
	}

}
