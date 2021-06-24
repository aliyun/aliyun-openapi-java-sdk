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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class OpsDescribeChangePlanImpactByDimensionRequest extends RpcAcsRequest<OpsDescribeChangePlanImpactByDimensionResponse> {
	   

	private String pageNumber;

	private String pageSize;

	private List<String> groupss;

	private String serviceVersion;

	private String scopes;

	private String auditParamStr;
	public OpsDescribeChangePlanImpactByDimensionRequest() {
		super("Ecsops", "2016-04-01", "OpsDescribeChangePlanImpactByDimension", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(String pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber);
		}
	}

	public String getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(String pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize);
		}
	}

	public List<String> getGroupss() {
		return this.groupss;
	}

	public void setGroupss(List<String> groupss) {
		this.groupss = groupss;	
		if (groupss != null) {
			for (int i = 0; i < groupss.size(); i++) {
				putQueryParameter("Groups." + (i + 1) , groupss.get(i));
			}
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
			putBodyParameter("Scopes", scopes);
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
	public Class<OpsDescribeChangePlanImpactByDimensionResponse> getResponseClass() {
		return OpsDescribeChangePlanImpactByDimensionResponse.class;
	}

}
