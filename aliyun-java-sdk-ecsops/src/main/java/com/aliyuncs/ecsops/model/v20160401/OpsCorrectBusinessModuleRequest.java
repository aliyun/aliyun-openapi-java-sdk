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
public class OpsCorrectBusinessModuleRequest extends RpcAcsRequest<OpsCorrectBusinessModuleResponse> {
	   

	private Long businessId;

	private String moduleCode;

	private String moduleTag;

	private Long id;

	private String auditParamStr;
	public OpsCorrectBusinessModuleRequest() {
		super("Ecsops", "2016-04-01", "OpsCorrectBusinessModule", "ecsops");
		setMethod(MethodType.POST);
	}

	public Long getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(Long businessId) {
		this.businessId = businessId;
		if(businessId != null){
			putQueryParameter("BusinessId", businessId.toString());
		}
	}

	public String getModuleCode() {
		return this.moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
		if(moduleCode != null){
			putQueryParameter("ModuleCode", moduleCode);
		}
	}

	public String getModuleTag() {
		return this.moduleTag;
	}

	public void setModuleTag(String moduleTag) {
		this.moduleTag = moduleTag;
		if(moduleTag != null){
			putQueryParameter("ModuleTag", moduleTag);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
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
	public Class<OpsCorrectBusinessModuleResponse> getResponseClass() {
		return OpsCorrectBusinessModuleResponse.class;
	}

}
