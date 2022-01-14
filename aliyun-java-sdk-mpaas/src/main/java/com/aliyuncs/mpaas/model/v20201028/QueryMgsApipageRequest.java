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

package com.aliyuncs.mpaas.model.v20201028;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.mpaas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class QueryMgsApipageRequest extends RpcAcsRequest<QueryMgsApipageResponse> {
	   

	private String needEtag;

	private String apiType;

	private String optFuzzy;

	private String host;

	private Long pageSize;

	private String tenantId;

	private Long pageIndex;

	private String apiStatus;

	private Long sysId;

	private String format;

	private String needEncrypt;

	private String operationType;

	private String needSign;

	private String appId;

	private String sysName;

	private String workspaceId;
	public QueryMgsApipageRequest() {
		super("mPaaS", "2020-10-28", "QueryMgsApipage");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getNeedEtag() {
		return this.needEtag;
	}

	public void setNeedEtag(String needEtag) {
		this.needEtag = needEtag;
		if(needEtag != null){
			putBodyParameter("NeedEtag", needEtag);
		}
	}

	public String getApiType() {
		return this.apiType;
	}

	public void setApiType(String apiType) {
		this.apiType = apiType;
		if(apiType != null){
			putBodyParameter("ApiType", apiType);
		}
	}

	public String getOptFuzzy() {
		return this.optFuzzy;
	}

	public void setOptFuzzy(String optFuzzy) {
		this.optFuzzy = optFuzzy;
		if(optFuzzy != null){
			putBodyParameter("OptFuzzy", optFuzzy);
		}
	}

	public String getHost() {
		return this.host;
	}

	public void setHost(String host) {
		this.host = host;
		if(host != null){
			putBodyParameter("Host", host);
		}
	}

	public Long getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putBodyParameter("PageSize", pageSize.toString());
		}
	}

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public Long getPageIndex() {
		return this.pageIndex;
	}

	public void setPageIndex(Long pageIndex) {
		this.pageIndex = pageIndex;
		if(pageIndex != null){
			putBodyParameter("PageIndex", pageIndex.toString());
		}
	}

	public String getApiStatus() {
		return this.apiStatus;
	}

	public void setApiStatus(String apiStatus) {
		this.apiStatus = apiStatus;
		if(apiStatus != null){
			putBodyParameter("ApiStatus", apiStatus);
		}
	}

	public Long getSysId() {
		return this.sysId;
	}

	public void setSysId(Long sysId) {
		this.sysId = sysId;
		if(sysId != null){
			putBodyParameter("SysId", sysId.toString());
		}
	}

	public String getFormat() {
		return this.format;
	}

	public void setFormat(String format) {
		this.format = format;
		if(format != null){
			putBodyParameter("Format", format);
		}
	}

	public String getNeedEncrypt() {
		return this.needEncrypt;
	}

	public void setNeedEncrypt(String needEncrypt) {
		this.needEncrypt = needEncrypt;
		if(needEncrypt != null){
			putBodyParameter("NeedEncrypt", needEncrypt);
		}
	}

	public String getOperationType() {
		return this.operationType;
	}

	public void setOperationType(String operationType) {
		this.operationType = operationType;
		if(operationType != null){
			putBodyParameter("OperationType", operationType);
		}
	}

	public String getNeedSign() {
		return this.needSign;
	}

	public void setNeedSign(String needSign) {
		this.needSign = needSign;
		if(needSign != null){
			putBodyParameter("NeedSign", needSign);
		}
	}

	public String getAppId() {
		return this.appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
		if(appId != null){
			putBodyParameter("AppId", appId);
		}
	}

	public String getSysName() {
		return this.sysName;
	}

	public void setSysName(String sysName) {
		this.sysName = sysName;
		if(sysName != null){
			putBodyParameter("SysName", sysName);
		}
	}

	public String getWorkspaceId() {
		return this.workspaceId;
	}

	public void setWorkspaceId(String workspaceId) {
		this.workspaceId = workspaceId;
		if(workspaceId != null){
			putBodyParameter("WorkspaceId", workspaceId);
		}
	}

	@Override
	public Class<QueryMgsApipageResponse> getResponseClass() {
		return QueryMgsApipageResponse.class;
	}

}
