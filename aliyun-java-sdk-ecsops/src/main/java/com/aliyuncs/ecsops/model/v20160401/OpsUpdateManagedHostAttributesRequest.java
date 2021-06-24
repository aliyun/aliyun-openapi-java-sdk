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
public class OpsUpdateManagedHostAttributesRequest extends RpcAcsRequest<OpsUpdateManagedHostAttributesResponse> {
	   

	private String mode;

	private Long aliUid;

	private String managedHostId;

	private String managedHostName;

	private String auditParamStr;

	private String status;
	public OpsUpdateManagedHostAttributesRequest() {
		super("Ecsops", "2016-04-01", "OpsUpdateManagedHostAttributes", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
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

	public String getManagedHostId() {
		return this.managedHostId;
	}

	public void setManagedHostId(String managedHostId) {
		this.managedHostId = managedHostId;
		if(managedHostId != null){
			putQueryParameter("ManagedHostId", managedHostId);
		}
	}

	public String getManagedHostName() {
		return this.managedHostName;
	}

	public void setManagedHostName(String managedHostName) {
		this.managedHostName = managedHostName;
		if(managedHostName != null){
			putQueryParameter("ManagedHostName", managedHostName);
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<OpsUpdateManagedHostAttributesResponse> getResponseClass() {
		return OpsUpdateManagedHostAttributesResponse.class;
	}

}
