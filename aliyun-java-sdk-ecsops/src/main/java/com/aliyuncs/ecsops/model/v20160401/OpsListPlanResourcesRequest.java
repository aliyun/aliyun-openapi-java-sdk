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
public class OpsListPlanResourcesRequest extends RpcAcsRequest<OpsListPlanResourcesResponse> {
	   

	private String resourceLevel;

	private Boolean compress;

	private String extensions;

	private Integer pageNo;

	private Integer pageSize;

	private String serviceVersion;

	private String scopes;

	private String auditParamStr;
	public OpsListPlanResourcesRequest() {
		super("Ecsops", "2016-04-01", "OpsListPlanResources", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResourceLevel() {
		return this.resourceLevel;
	}

	public void setResourceLevel(String resourceLevel) {
		this.resourceLevel = resourceLevel;
		if(resourceLevel != null){
			putQueryParameter("ResourceLevel", resourceLevel);
		}
	}

	public Boolean getCompress() {
		return this.compress;
	}

	public void setCompress(Boolean compress) {
		this.compress = compress;
		if(compress != null){
			putQueryParameter("Compress", compress.toString());
		}
	}

	public String getExtensions() {
		return this.extensions;
	}

	public void setExtensions(String extensions) {
		this.extensions = extensions;
		if(extensions != null){
			putQueryParameter("Extensions", extensions);
		}
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
		if(pageNo != null){
			putQueryParameter("PageNo", pageNo.toString());
		}
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getServiceVersion() {
		return this.serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
		if(serviceVersion != null){
			putQueryParameter("ServiceVersion", serviceVersion);
		}
	}

	public String getScopes() {
		return this.scopes;
	}

	public void setScopes(String scopes) {
		this.scopes = scopes;
		if(scopes != null){
			putQueryParameter("Scopes", scopes);
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
	public Class<OpsListPlanResourcesResponse> getResponseClass() {
		return OpsListPlanResourcesResponse.class;
	}

}
