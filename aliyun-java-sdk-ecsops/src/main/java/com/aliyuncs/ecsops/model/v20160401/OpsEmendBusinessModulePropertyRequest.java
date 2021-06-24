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
public class OpsEmendBusinessModulePropertyRequest extends RpcAcsRequest<OpsEmendBusinessModulePropertyResponse> {
	   

	private String propertyValue;

	private Long businessId;

	private String moduleCode;

	private String propertyDisplayValue;

	private Long moduleId;

	private String propertyCode;

	private String auditParamStr;
	public OpsEmendBusinessModulePropertyRequest() {
		super("Ecsops", "2016-04-01", "OpsEmendBusinessModuleProperty", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getPropertyValue() {
		return this.propertyValue;
	}

	public void setPropertyValue(String propertyValue) {
		this.propertyValue = propertyValue;
		if(propertyValue != null){
			putQueryParameter("PropertyValue", propertyValue);
		}
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

	public String getPropertyDisplayValue() {
		return this.propertyDisplayValue;
	}

	public void setPropertyDisplayValue(String propertyDisplayValue) {
		this.propertyDisplayValue = propertyDisplayValue;
		if(propertyDisplayValue != null){
			putQueryParameter("PropertyDisplayValue", propertyDisplayValue);
		}
	}

	public Long getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
		if(moduleId != null){
			putQueryParameter("moduleId", moduleId.toString());
		}
	}

	public String getPropertyCode() {
		return this.propertyCode;
	}

	public void setPropertyCode(String propertyCode) {
		this.propertyCode = propertyCode;
		if(propertyCode != null){
			putQueryParameter("PropertyCode", propertyCode);
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
	public Class<OpsEmendBusinessModulePropertyResponse> getResponseClass() {
		return OpsEmendBusinessModulePropertyResponse.class;
	}

}
