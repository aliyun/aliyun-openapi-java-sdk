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
public class OpsAddMigrationPreferenceRequest extends RpcAcsRequest<OpsAddMigrationPreferenceResponse> {
	   

	private String migrationNetworkType;

	private String operator;

	private Long aliUid;

	private List<String> targetZoneIdss;

	private String auditParamStr;
	public OpsAddMigrationPreferenceRequest() {
		super("Ecsops", "2016-04-01", "OpsAddMigrationPreference", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getMigrationNetworkType() {
		return this.migrationNetworkType;
	}

	public void setMigrationNetworkType(String migrationNetworkType) {
		this.migrationNetworkType = migrationNetworkType;
		if(migrationNetworkType != null){
			putQueryParameter("MigrationNetworkType", migrationNetworkType);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putQueryParameter("Operator", operator);
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

	public List<String> getTargetZoneIdss() {
		return this.targetZoneIdss;
	}

	public void setTargetZoneIdss(List<String> targetZoneIdss) {
		this.targetZoneIdss = targetZoneIdss;	
		if (targetZoneIdss != null) {
			for (int i = 0; i < targetZoneIdss.size(); i++) {
				putQueryParameter("TargetZoneIds." + (i + 1) , targetZoneIdss.get(i));
			}
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
	public Class<OpsAddMigrationPreferenceResponse> getResponseClass() {
		return OpsAddMigrationPreferenceResponse.class;
	}

}
