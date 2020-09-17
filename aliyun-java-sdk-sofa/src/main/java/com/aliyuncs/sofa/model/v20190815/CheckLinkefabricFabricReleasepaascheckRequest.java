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
public class CheckLinkefabricFabricReleasepaascheckRequest extends RpcAcsRequest<CheckLinkefabricFabricReleasepaascheckResponse> {
	   

	private String cloudInfo;

	private Boolean antxCloseAllSwitch;

	private List<String> pubSeqListRepeatLists;

	private String releaseType;

	private String releaseDomain;

	private Long envId;

	private String title;

	private String operator;

	private String grayReleaseType;

	private List<String> appsRepeatLists;

	private String releasePubWay;

	private List<String> executorListRepeatLists;

	private Long tenantId;

	private String planTime;

	private String releaseOrderType;

	private String grayProjectId;

	private String bizType;

	private String deployHandlerType;

	private String releaseId;

	private Boolean useBaseline;
	public CheckLinkefabricFabricReleasepaascheckRequest() {
		super("SOFA", "2019-08-15", "CheckLinkefabricFabricReleasepaascheck", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCloudInfo() {
		return this.cloudInfo;
	}

	public void setCloudInfo(String cloudInfo) {
		this.cloudInfo = cloudInfo;
		if(cloudInfo != null){
			putBodyParameter("CloudInfo", cloudInfo);
		}
	}

	public Boolean getAntxCloseAllSwitch() {
		return this.antxCloseAllSwitch;
	}

	public void setAntxCloseAllSwitch(Boolean antxCloseAllSwitch) {
		this.antxCloseAllSwitch = antxCloseAllSwitch;
		if(antxCloseAllSwitch != null){
			putBodyParameter("AntxCloseAllSwitch", antxCloseAllSwitch.toString());
		}
	}

	public List<String> getPubSeqListRepeatLists() {
		return this.pubSeqListRepeatLists;
	}

	public void setPubSeqListRepeatLists(List<String> pubSeqListRepeatLists) {
		this.pubSeqListRepeatLists = pubSeqListRepeatLists;	
		if (pubSeqListRepeatLists != null) {
			for (int i = 0; i < pubSeqListRepeatLists.size(); i++) {
				putBodyParameter("PubSeqListRepeatList." + (i + 1) , pubSeqListRepeatLists.get(i));
			}
		}	
	}

	public String getReleaseType() {
		return this.releaseType;
	}

	public void setReleaseType(String releaseType) {
		this.releaseType = releaseType;
		if(releaseType != null){
			putBodyParameter("ReleaseType", releaseType);
		}
	}

	public String getReleaseDomain() {
		return this.releaseDomain;
	}

	public void setReleaseDomain(String releaseDomain) {
		this.releaseDomain = releaseDomain;
		if(releaseDomain != null){
			putBodyParameter("ReleaseDomain", releaseDomain);
		}
	}

	public Long getEnvId() {
		return this.envId;
	}

	public void setEnvId(Long envId) {
		this.envId = envId;
		if(envId != null){
			putBodyParameter("EnvId", envId.toString());
		}
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
		if(title != null){
			putBodyParameter("Title", title);
		}
	}

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putBodyParameter("Operator", operator);
		}
	}

	public String getGrayReleaseType() {
		return this.grayReleaseType;
	}

	public void setGrayReleaseType(String grayReleaseType) {
		this.grayReleaseType = grayReleaseType;
		if(grayReleaseType != null){
			putBodyParameter("GrayReleaseType", grayReleaseType);
		}
	}

	public List<String> getAppsRepeatLists() {
		return this.appsRepeatLists;
	}

	public void setAppsRepeatLists(List<String> appsRepeatLists) {
		this.appsRepeatLists = appsRepeatLists;	
		if (appsRepeatLists != null) {
			for (int i = 0; i < appsRepeatLists.size(); i++) {
				putBodyParameter("AppsRepeatList." + (i + 1) , appsRepeatLists.get(i));
			}
		}	
	}

	public String getReleasePubWay() {
		return this.releasePubWay;
	}

	public void setReleasePubWay(String releasePubWay) {
		this.releasePubWay = releasePubWay;
		if(releasePubWay != null){
			putBodyParameter("ReleasePubWay", releasePubWay);
		}
	}

	public List<String> getExecutorListRepeatLists() {
		return this.executorListRepeatLists;
	}

	public void setExecutorListRepeatLists(List<String> executorListRepeatLists) {
		this.executorListRepeatLists = executorListRepeatLists;	
		if (executorListRepeatLists != null) {
			for (int i = 0; i < executorListRepeatLists.size(); i++) {
				putBodyParameter("ExecutorListRepeatList." + (i + 1) , executorListRepeatLists.get(i));
			}
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

	public String getPlanTime() {
		return this.planTime;
	}

	public void setPlanTime(String planTime) {
		this.planTime = planTime;
		if(planTime != null){
			putBodyParameter("PlanTime", planTime);
		}
	}

	public String getReleaseOrderType() {
		return this.releaseOrderType;
	}

	public void setReleaseOrderType(String releaseOrderType) {
		this.releaseOrderType = releaseOrderType;
		if(releaseOrderType != null){
			putBodyParameter("ReleaseOrderType", releaseOrderType);
		}
	}

	public String getGrayProjectId() {
		return this.grayProjectId;
	}

	public void setGrayProjectId(String grayProjectId) {
		this.grayProjectId = grayProjectId;
		if(grayProjectId != null){
			putBodyParameter("GrayProjectId", grayProjectId);
		}
	}

	public String getBizType() {
		return this.bizType;
	}

	public void setBizType(String bizType) {
		this.bizType = bizType;
		if(bizType != null){
			putBodyParameter("BizType", bizType);
		}
	}

	public String getDeployHandlerType() {
		return this.deployHandlerType;
	}

	public void setDeployHandlerType(String deployHandlerType) {
		this.deployHandlerType = deployHandlerType;
		if(deployHandlerType != null){
			putBodyParameter("DeployHandlerType", deployHandlerType);
		}
	}

	public String getReleaseId() {
		return this.releaseId;
	}

	public void setReleaseId(String releaseId) {
		this.releaseId = releaseId;
		if(releaseId != null){
			putBodyParameter("ReleaseId", releaseId);
		}
	}

	public Boolean getUseBaseline() {
		return this.useBaseline;
	}

	public void setUseBaseline(Boolean useBaseline) {
		this.useBaseline = useBaseline;
		if(useBaseline != null){
			putBodyParameter("UseBaseline", useBaseline.toString());
		}
	}

	@Override
	public Class<CheckLinkefabricFabricReleasepaascheckResponse> getResponseClass() {
		return CheckLinkefabricFabricReleasepaascheckResponse.class;
	}

}
