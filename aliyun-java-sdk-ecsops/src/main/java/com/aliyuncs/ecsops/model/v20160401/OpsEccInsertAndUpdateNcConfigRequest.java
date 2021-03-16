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
public class OpsEccInsertAndUpdateNcConfigRequest extends RpcAcsRequest<OpsEccInsertAndUpdateNcConfigResponse> {
	   

	private Boolean renderForceExecute;

	private String mocNcIp;

	private Boolean skipRender;

	private Boolean skipCmdRender;

	private String itemContent;

	private String ncIp;

	private Boolean reCalResource;

	private String sN;

	private Boolean syncToNc;

	private String auditParamStr;
	public OpsEccInsertAndUpdateNcConfigRequest() {
		super("Ecsops", "2016-04-01", "OpsEccInsertAndUpdateNcConfig", "ecs");
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

	public String getMocNcIp() {
		return this.mocNcIp;
	}

	public void setMocNcIp(String mocNcIp) {
		this.mocNcIp = mocNcIp;
		if(mocNcIp != null){
			putQueryParameter("MocNcIp", mocNcIp);
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

	public String getItemContent() {
		return this.itemContent;
	}

	public void setItemContent(String itemContent) {
		this.itemContent = itemContent;
		if(itemContent != null){
			putQueryParameter("ItemContent", itemContent);
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

	public Boolean getReCalResource() {
		return this.reCalResource;
	}

	public void setReCalResource(Boolean reCalResource) {
		this.reCalResource = reCalResource;
		if(reCalResource != null){
			putQueryParameter("ReCalResource", reCalResource.toString());
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

	public Boolean getSyncToNc() {
		return this.syncToNc;
	}

	public void setSyncToNc(Boolean syncToNc) {
		this.syncToNc = syncToNc;
		if(syncToNc != null){
			putQueryParameter("SyncToNc", syncToNc.toString());
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
	public Class<OpsEccInsertAndUpdateNcConfigResponse> getResponseClass() {
		return OpsEccInsertAndUpdateNcConfigResponse.class;
	}

}
