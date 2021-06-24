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
public class OpsNotifyDemandInfoRequest extends RpcAcsRequest<OpsNotifyDemandInfoResponse> {
	   

	private String demandStatus;

	private String demandId;

	private String subDemandId;

	private String comment;

	private String auditParamStr;
	public OpsNotifyDemandInfoRequest() {
		super("Ecsops", "2016-04-01", "OpsNotifyDemandInfo", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getDemandStatus() {
		return this.demandStatus;
	}

	public void setDemandStatus(String demandStatus) {
		this.demandStatus = demandStatus;
		if(demandStatus != null){
			putQueryParameter("DemandStatus", demandStatus);
		}
	}

	public String getDemandId() {
		return this.demandId;
	}

	public void setDemandId(String demandId) {
		this.demandId = demandId;
		if(demandId != null){
			putQueryParameter("DemandId", demandId);
		}
	}

	public String getSubDemandId() {
		return this.subDemandId;
	}

	public void setSubDemandId(String subDemandId) {
		this.subDemandId = subDemandId;
		if(subDemandId != null){
			putQueryParameter("SubDemandId", subDemandId);
		}
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putQueryParameter("Comment", comment);
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
	public Class<OpsNotifyDemandInfoResponse> getResponseClass() {
		return OpsNotifyDemandInfoResponse.class;
	}

}
