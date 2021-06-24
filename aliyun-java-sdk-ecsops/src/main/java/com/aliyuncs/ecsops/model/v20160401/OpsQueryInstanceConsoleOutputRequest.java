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
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsQueryInstanceConsoleOutputRequest extends RpcAcsRequest<OpsQueryInstanceConsoleOutputResponse> {
	   

	private String sourceOwnerBid;

	private Boolean removeSymbols;

	private String instanceId;

	private Long sourceOwnerAliUid;

	private String auditParamStr;
	public OpsQueryInstanceConsoleOutputRequest() {
		super("Ecsops", "2016-04-01", "OpsQueryInstanceConsoleOutput", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getSourceOwnerBid() {
		return this.sourceOwnerBid;
	}

	public void setSourceOwnerBid(String sourceOwnerBid) {
		this.sourceOwnerBid = sourceOwnerBid;
		if(sourceOwnerBid != null){
			putQueryParameter("SourceOwnerBid", sourceOwnerBid);
		}
	}

	public Boolean getRemoveSymbols() {
		return this.removeSymbols;
	}

	public void setRemoveSymbols(Boolean removeSymbols) {
		this.removeSymbols = removeSymbols;
		if(removeSymbols != null){
			putQueryParameter("RemoveSymbols", removeSymbols.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public Long getSourceOwnerAliUid() {
		return this.sourceOwnerAliUid;
	}

	public void setSourceOwnerAliUid(Long sourceOwnerAliUid) {
		this.sourceOwnerAliUid = sourceOwnerAliUid;
		if(sourceOwnerAliUid != null){
			putQueryParameter("SourceOwnerAliUid", sourceOwnerAliUid.toString());
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
	public Class<OpsQueryInstanceConsoleOutputResponse> getResponseClass() {
		return OpsQueryInstanceConsoleOutputResponse.class;
	}

}
