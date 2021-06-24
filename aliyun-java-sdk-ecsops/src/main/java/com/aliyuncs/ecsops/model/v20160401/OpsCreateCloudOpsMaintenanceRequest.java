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
public class OpsCreateCloudOpsMaintenanceRequest extends RpcAcsRequest<OpsCreateCloudOpsMaintenanceResponse> {
	   

	private String reason;

	private String extraData;

	private String key;

	private String opsCode;

	private String auditParamStr;
	public OpsCreateCloudOpsMaintenanceRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateCloudOpsMaintenance", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putQueryParameter("Reason", reason);
		}
	}

	public String getExtraData() {
		return this.extraData;
	}

	public void setExtraData(String extraData) {
		this.extraData = extraData;
		if(extraData != null){
			putQueryParameter("ExtraData", extraData);
		}
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
		if(key != null){
			putQueryParameter("Key", key);
		}
	}

	public String getOpsCode() {
		return this.opsCode;
	}

	public void setOpsCode(String opsCode) {
		this.opsCode = opsCode;
		if(opsCode != null){
			putQueryParameter("OpsCode", opsCode);
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
	public Class<OpsCreateCloudOpsMaintenanceResponse> getResponseClass() {
		return OpsCreateCloudOpsMaintenanceResponse.class;
	}

}
