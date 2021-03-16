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
public class OpsEccInsertAndUpdateItemsByTemplateRequest extends RpcAcsRequest<OpsEccInsertAndUpdateItemsByTemplateResponse> {
	   

	private Boolean renderForceExecute;

	private Boolean forceRender;

	private String instanceFamily;

	private Boolean willReboot;

	private Boolean skipRender;

	private Boolean skipCmdRender;

	private String slaCategory;

	private String ncIp;

	private String templateName;

	private String sN;

	private String auditParamStr;
	public OpsEccInsertAndUpdateItemsByTemplateRequest() {
		super("Ecsops", "2016-04-01", "OpsEccInsertAndUpdateItemsByTemplate", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getRenderForceExecute() {
		return this.renderForceExecute;
	}

	public void setRenderForceExecute(Boolean renderForceExecute) {
		this.renderForceExecute = renderForceExecute;
		if(renderForceExecute != null){
			putQueryParameter("RenderForceExecute", renderForceExecute.toString());
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

	public Boolean getWillReboot() {
		return this.willReboot;
	}

	public void setWillReboot(Boolean willReboot) {
		this.willReboot = willReboot;
		if(willReboot != null){
			putQueryParameter("WillReboot", willReboot.toString());
		}
	}

	public Boolean getSkipRender() {
		return this.skipRender;
	}

	public void setSkipRender(Boolean skipRender) {
		this.skipRender = skipRender;
		if(skipRender != null){
			putQueryParameter("SkipRender", skipRender.toString());
		}
	}

	public Boolean getSkipCmdRender() {
		return this.skipCmdRender;
	}

	public void setSkipCmdRender(Boolean skipCmdRender) {
		this.skipCmdRender = skipCmdRender;
		if(skipCmdRender != null){
			putQueryParameter("SkipCmdRender", skipCmdRender.toString());
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
	public Class<OpsEccInsertAndUpdateItemsByTemplateResponse> getResponseClass() {
		return OpsEccInsertAndUpdateItemsByTemplateResponse.class;
	}

}
