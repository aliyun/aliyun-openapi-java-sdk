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
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryLinkefabricFabricNewappconfigsRequest extends RpcAcsRequest<QueryLinkefabricFabricNewappconfigsResponse> {
	   

	private Boolean isProdUrl;

	private Boolean queryChange;

	private Long envId;

	private String operator;

	private String appName;

	private Boolean isPublic;

	private String originAppName;

	private Long tenantId;

	private Boolean needTransfer;

	private String projectId;

	private String branchName;

	private String empId;

	private String ciConfigId;

	private String notifyDevStage;

	private String env;

	private Boolean queryAll;

	private String bizType;

	private String releaseId;

	private String devStage;

	private String tenantName;

	private String typeName;
	public QueryLinkefabricFabricNewappconfigsRequest() {
		super("SOFA", "2019-08-15", "QueryLinkefabricFabricNewappconfigs", "sofacafedeps");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Boolean getIsProdUrl() {
		return this.isProdUrl;
	}

	public void setIsProdUrl(Boolean isProdUrl) {
		this.isProdUrl = isProdUrl;
		if(isProdUrl != null){
			putBodyParameter("IsProdUrl", isProdUrl.toString());
		}
	}

	public Boolean getQueryChange() {
		return this.queryChange;
	}

	public void setQueryChange(Boolean queryChange) {
		this.queryChange = queryChange;
		if(queryChange != null){
			putBodyParameter("QueryChange", queryChange.toString());
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

	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
		if(operator != null){
			putBodyParameter("Operator", operator);
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

	public Boolean getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
		if(isPublic != null){
			putBodyParameter("IsPublic", isPublic.toString());
		}
	}

	public String getOriginAppName() {
		return this.originAppName;
	}

	public void setOriginAppName(String originAppName) {
		this.originAppName = originAppName;
		if(originAppName != null){
			putBodyParameter("OriginAppName", originAppName);
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

	public Boolean getNeedTransfer() {
		return this.needTransfer;
	}

	public void setNeedTransfer(Boolean needTransfer) {
		this.needTransfer = needTransfer;
		if(needTransfer != null){
			putBodyParameter("NeedTransfer", needTransfer.toString());
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

	public String getBranchName() {
		return this.branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
		if(branchName != null){
			putBodyParameter("BranchName", branchName);
		}
	}

	public String getEmpId() {
		return this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
		if(empId != null){
			putBodyParameter("EmpId", empId);
		}
	}

	public String getCiConfigId() {
		return this.ciConfigId;
	}

	public void setCiConfigId(String ciConfigId) {
		this.ciConfigId = ciConfigId;
		if(ciConfigId != null){
			putBodyParameter("CiConfigId", ciConfigId);
		}
	}

	public String getNotifyDevStage() {
		return this.notifyDevStage;
	}

	public void setNotifyDevStage(String notifyDevStage) {
		this.notifyDevStage = notifyDevStage;
		if(notifyDevStage != null){
			putBodyParameter("NotifyDevStage", notifyDevStage);
		}
	}

	public String getEnv() {
		return this.env;
	}

	public void setEnv(String env) {
		this.env = env;
		if(env != null){
			putBodyParameter("Env", env);
		}
	}

	public Boolean getQueryAll() {
		return this.queryAll;
	}

	public void setQueryAll(Boolean queryAll) {
		this.queryAll = queryAll;
		if(queryAll != null){
			putBodyParameter("QueryAll", queryAll.toString());
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

	public String getReleaseId() {
		return this.releaseId;
	}

	public void setReleaseId(String releaseId) {
		this.releaseId = releaseId;
		if(releaseId != null){
			putBodyParameter("ReleaseId", releaseId);
		}
	}

	public String getDevStage() {
		return this.devStage;
	}

	public void setDevStage(String devStage) {
		this.devStage = devStage;
		if(devStage != null){
			putBodyParameter("DevStage", devStage);
		}
	}

	public String getTenantName() {
		return this.tenantName;
	}

	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
		if(tenantName != null){
			putBodyParameter("TenantName", tenantName);
		}
	}

	public String getTypeName() {
		return this.typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
		if(typeName != null){
			putBodyParameter("TypeName", typeName);
		}
	}

	@Override
	public Class<QueryLinkefabricFabricNewappconfigsResponse> getResponseClass() {
		return QueryLinkefabricFabricNewappconfigsResponse.class;
	}

}
