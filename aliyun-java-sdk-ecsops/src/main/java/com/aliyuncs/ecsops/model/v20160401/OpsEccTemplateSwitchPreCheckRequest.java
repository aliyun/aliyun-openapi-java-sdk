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
public class OpsEccTemplateSwitchPreCheckRequest extends RpcAcsRequest<OpsEccTemplateSwitchPreCheckResponse> {
	   

	private Boolean rebootType;

	private Boolean forceRender;

	private String instanceFamily;

	private String params;

	private String slaCategory;

	private String ncIp;

	private String templateName;

	private String sN;

	private String auditParamStr;
	public OpsEccTemplateSwitchPreCheckRequest() {
		super("Ecsops", "2016-04-01", "OpsEccTemplateSwitchPreCheck", "ecsops");
		setMethod(MethodType.POST);
	}

	public Boolean getRebootType() {
		return this.rebootType;
	}

	public void setRebootType(Boolean rebootType) {
		this.rebootType = rebootType;
		if(rebootType != null){
			putQueryParameter("RebootType", rebootType.toString());
		}
	}

	public Boolean getForceRender() {
		return this.forceRender;
	}

	public void setForceRender(Boolean forceRender) {
		this.forceRender = forceRender;
		if(forceRender != null){
			putQueryParameter("ForceRender", forceRender.toString());
		}
	}

	public String getInstanceFamily() {
		return this.instanceFamily;
	}

	public void setInstanceFamily(String instanceFamily) {
		this.instanceFamily = instanceFamily;
		if(instanceFamily != null){
			putQueryParameter("InstanceFamily", instanceFamily);
		}
	}

	public String getParams() {
		return this.params;
	}

	public void setParams(String params) {
		this.params = params;
		if(params != null){
			putQueryParameter("Params", params);
		}
	}

	public String getSlaCategory() {
		return this.slaCategory;
	}

	public void setSlaCategory(String slaCategory) {
		this.slaCategory = slaCategory;
		if(slaCategory != null){
			putQueryParameter("SlaCategory", slaCategory);
		}
	}

	public String getNcIp() {
		return this.ncIp;
	}

	public void setNcIp(String ncIp) {
		this.ncIp = ncIp;
		if(ncIp != null){
			putQueryParameter("NcIp", ncIp);
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
		}
	}

	public String getSN() {
		return this.sN;
	}

	public void setSN(String sN) {
		this.sN = sN;
		if(sN != null){
			putQueryParameter("SN", sN);
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
	public Class<OpsEccTemplateSwitchPreCheckResponse> getResponseClass() {
		return OpsEccTemplateSwitchPreCheckResponse.class;
	}

}
