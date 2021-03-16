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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsRegisterCommandSupplierRequest extends RpcAcsRequest<OpsRegisterCommandSupplierResponse> {
	   

	private String description;

	private String employeeId;

	private String supplierId;

	private Long aliyunUid;

	private String displayName;

	private String auditParamStr;
	public OpsRegisterCommandSupplierRequest() {
		super("Ecsops", "2016-04-01", "OpsRegisterCommandSupplier", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getEmployeeId() {
		return this.employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
		if(employeeId != null){
			putQueryParameter("EmployeeId", employeeId);
		}
	}

	public String getSupplierId() {
		return this.supplierId;
	}

	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
		if(supplierId != null){
			putQueryParameter("SupplierId", supplierId);
		}
	}

	public Long getAliyunUid() {
		return this.aliyunUid;
	}

	public void setAliyunUid(Long aliyunUid) {
		this.aliyunUid = aliyunUid;
		if(aliyunUid != null){
			putQueryParameter("AliyunUid", aliyunUid.toString());
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
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
	public Class<OpsRegisterCommandSupplierResponse> getResponseClass() {
		return OpsRegisterCommandSupplierResponse.class;
	}

}
