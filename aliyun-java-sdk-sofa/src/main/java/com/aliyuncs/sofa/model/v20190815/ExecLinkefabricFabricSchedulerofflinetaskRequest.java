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
public class ExecLinkefabricFabricSchedulerofflinetaskRequest extends RpcAcsRequest<ExecLinkefabricFabricSchedulerofflinetaskResponse> {
	   

	private List<String> schedulerConfigsRepeatLists;

	private Boolean devTaskEnable;

	private String appName;

	private Boolean netTaskEnable;

	private String synacCheckedEnvZones;

	private Long tenantId;

	private String synacCheckedEnvZoneNames;

	private String projectId;

	private Boolean shareOpenAPI;

	private Boolean sitTaskEnable;

	private List<String> devStageListRepeatLists;
	public ExecLinkefabricFabricSchedulerofflinetaskRequest() {
		super("SOFA", "2019-08-15", "ExecLinkefabricFabricSchedulerofflinetask", "sofa");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getSchedulerConfigsRepeatLists() {
		return this.schedulerConfigsRepeatLists;
	}

	public void setSchedulerConfigsRepeatLists(List<String> schedulerConfigsRepeatLists) {
		this.schedulerConfigsRepeatLists = schedulerConfigsRepeatLists;	
		if (schedulerConfigsRepeatLists != null) {
			for (int i = 0; i < schedulerConfigsRepeatLists.size(); i++) {
				putBodyParameter("SchedulerConfigsRepeatList." + (i + 1) , schedulerConfigsRepeatLists.get(i));
			}
		}	
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

	public String getSynacCheckedEnvZones() {
		return this.synacCheckedEnvZones;
	}

	public void setSynacCheckedEnvZones(String synacCheckedEnvZones) {
		this.synacCheckedEnvZones = synacCheckedEnvZones;
		if(synacCheckedEnvZones != null){
			putBodyParameter("SynacCheckedEnvZones", synacCheckedEnvZones);
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

	public String getSynacCheckedEnvZoneNames() {
		return this.synacCheckedEnvZoneNames;
	}

	public void setSynacCheckedEnvZoneNames(String synacCheckedEnvZoneNames) {
		this.synacCheckedEnvZoneNames = synacCheckedEnvZoneNames;
		if(synacCheckedEnvZoneNames != null){
			putBodyParameter("SynacCheckedEnvZoneNames", synacCheckedEnvZoneNames);
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

	public Boolean getShareOpenAPI() {
		return this.shareOpenAPI;
	}

	public void setShareOpenAPI(Boolean shareOpenAPI) {
		this.shareOpenAPI = shareOpenAPI;
		if(shareOpenAPI != null){
			putBodyParameter("ShareOpenAPI", shareOpenAPI.toString());
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

	@Override
	public Class<ExecLinkefabricFabricSchedulerofflinetaskResponse> getResponseClass() {
		return ExecLinkefabricFabricSchedulerofflinetaskResponse.class;
	}

}
