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
public class OpsListManagedRacksRequest extends RpcAcsRequest<OpsListManagedRacksResponse> {
	   

	private List<String> managedRackIdss;

	private String hostType;

	private String nextToken;

	private Long aliUid;

	private String managedPrivateSpaceId;

	private String zoneId;

	private Integer maxResults;

	private String auditParamStr;
	public OpsListManagedRacksRequest() {
		super("Ecsops", "2016-04-01", "OpsListManagedRacks", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getManagedRackIdss() {
		return this.managedRackIdss;
	}

	public void setManagedRackIdss(List<String> managedRackIdss) {
		this.managedRackIdss = managedRackIdss;	
		if (managedRackIdss != null) {
			for (int i = 0; i < managedRackIdss.size(); i++) {
				putQueryParameter("ManagedRackIds." + (i + 1) , managedRackIdss.get(i));
			}
		}	
	}

	public String getHostType() {
		return this.hostType;
	}

	public void setHostType(String hostType) {
		this.hostType = hostType;
		if(hostType != null){
			putQueryParameter("HostType", hostType);
		}
	}

	public String getNextToken() {
		return this.nextToken;
	}

	public void setNextToken(String nextToken) {
		this.nextToken = nextToken;
		if(nextToken != null){
			putQueryParameter("NextToken", nextToken);
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

	public String getManagedPrivateSpaceId() {
		return this.managedPrivateSpaceId;
	}

	public void setManagedPrivateSpaceId(String managedPrivateSpaceId) {
		this.managedPrivateSpaceId = managedPrivateSpaceId;
		if(managedPrivateSpaceId != null){
			putQueryParameter("ManagedPrivateSpaceId", managedPrivateSpaceId);
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

	public Integer getMaxResults() {
		return this.maxResults;
	}

	public void setMaxResults(Integer maxResults) {
		this.maxResults = maxResults;
		if(maxResults != null){
			putQueryParameter("MaxResults", maxResults.toString());
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
	public Class<OpsListManagedRacksResponse> getResponseClass() {
		return OpsListManagedRacksResponse.class;
	}

}
