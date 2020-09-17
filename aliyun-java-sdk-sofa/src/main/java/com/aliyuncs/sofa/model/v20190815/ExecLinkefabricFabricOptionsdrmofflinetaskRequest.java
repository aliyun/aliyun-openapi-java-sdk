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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class ExecLinkefabricFabricOptionsdrmofflinetaskRequest extends RpcAcsRequest<ExecLinkefabricFabricOptionsdrmofflinetaskResponse> {
	   

	private Boolean devTaskEnable;

	private String appName;

	private Boolean netTaskEnable;

	private Long tenantId;

	private String projectId;

	private Boolean sitTaskEnable;

	private Boolean prodTaskEnable;

	private List<String> devStageListRepeatLists;

	private Boolean preTaskEnable;
	public ExecLinkefabricFabricOptionsdrmofflinetaskRequest() {
		super("SOFA", "2019-08-15", "ExecLinkefabricFabricOptionsdrmofflinetask", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getDevTaskEnable() {
		return this.devTaskEnable;
	}

	public void setDevTaskEnable(Boolean devTaskEnable) {
		this.devTaskEnable = devTaskEnable;
		if(devTaskEnable != null){
			putBodyParameter("DevTaskEnable", devTaskEnable.toString());
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putBodyParameter("AppName", appName);
		}
	}

	public Boolean getNetTaskEnable() {
		return this.netTaskEnable;
	}

	public void setNetTaskEnable(Boolean netTaskEnable) {
		this.netTaskEnable = netTaskEnable;
		if(netTaskEnable != null){
			putBodyParameter("NetTaskEnable", netTaskEnable.toString());
		}
	}

	public Long getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(Long tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId.toString());
		}
	}

	public String getProjectId() {
		return this.projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId);
		}
	}

	public Boolean getSitTaskEnable() {
		return this.sitTaskEnable;
	}

	public void setSitTaskEnable(Boolean sitTaskEnable) {
		this.sitTaskEnable = sitTaskEnable;
		if(sitTaskEnable != null){
			putBodyParameter("SitTaskEnable", sitTaskEnable.toString());
		}
	}

	public Boolean getProdTaskEnable() {
		return this.prodTaskEnable;
	}

	public void setProdTaskEnable(Boolean prodTaskEnable) {
		this.prodTaskEnable = prodTaskEnable;
		if(prodTaskEnable != null){
			putBodyParameter("ProdTaskEnable", prodTaskEnable.toString());
		}
	}

	public List<String> getDevStageListRepeatLists() {
		return this.devStageListRepeatLists;
	}

	public void setDevStageListRepeatLists(List<String> devStageListRepeatLists) {
		this.devStageListRepeatLists = devStageListRepeatLists;	
		if (devStageListRepeatLists != null) {
			for (int i = 0; i < devStageListRepeatLists.size(); i++) {
				putBodyParameter("DevStageListRepeatList." + (i + 1) , devStageListRepeatLists.get(i));
			}
		}	
	}

	public Boolean getPreTaskEnable() {
		return this.preTaskEnable;
	}

	public void setPreTaskEnable(Boolean preTaskEnable) {
		this.preTaskEnable = preTaskEnable;
		if(preTaskEnable != null){
			putBodyParameter("PreTaskEnable", preTaskEnable.toString());
		}
	}

	@Override
	public Class<ExecLinkefabricFabricOptionsdrmofflinetaskResponse> getResponseClass() {
		return ExecLinkefabricFabricOptionsdrmofflinetaskResponse.class;
	}

}
