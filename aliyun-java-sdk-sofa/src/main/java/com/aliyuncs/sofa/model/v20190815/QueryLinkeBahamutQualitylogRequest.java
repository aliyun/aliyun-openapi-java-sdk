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
public class QueryLinkeBahamutQualitylogRequest extends RpcAcsRequest<QueryLinkeBahamutQualitylogResponse> {
	   

	private String reason;

	private String commitId;

	private String branch;

	private String appName;

	private String tenantId;

	private String qualityItem;
	public QueryLinkeBahamutQualitylogRequest() {
		super("SOFA", "2019-08-15", "QueryLinkeBahamutQualitylog", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
		if(reason != null){
			putBodyParameter("Reason", reason);
		}
	}

	public String getCommitId() {
		return this.commitId;
	}

	public void setCommitId(String commitId) {
		this.commitId = commitId;
		if(commitId != null){
			putBodyParameter("CommitId", commitId);
		}
	}

	public String getBranch() {
		return this.branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
		if(branch != null){
			putBodyParameter("Branch", branch);
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

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	public String getQualityItem() {
		return this.qualityItem;
	}

	public void setQualityItem(String qualityItem) {
		this.qualityItem = qualityItem;
		if(qualityItem != null){
			putBodyParameter("QualityItem", qualityItem);
		}
	}

	@Override
	public Class<QueryLinkeBahamutQualitylogResponse> getResponseClass() {
		return QueryLinkeBahamutQualitylogResponse.class;
	}

}
