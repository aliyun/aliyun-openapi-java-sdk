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
public class OpsEccQueryNcTemplatesRequest extends RpcAcsRequest<OpsEccQueryNcTemplatesResponse> {
	   

	private String adjustStandModels;

	private String pageNumber;

	private String tempDesc;

	private String pageSize;

	private String templateName;

	private String auditParamStr;
	public OpsEccQueryNcTemplatesRequest() {
		super("Ecsops", "2016-04-01", "OpsEccQueryNcTemplates", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getAdjustStandModels() {
		return this.adjustStandModels;
	}

	public void setAdjustStandModels(String adjustStandModels) {
		this.adjustStandModels = adjustStandModels;
		if(adjustStandModels != null){
			putQueryParameter("AdjustStandModels", adjustStandModels);
		}
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

	public String getTempDesc() {
		return this.tempDesc;
	}

	public void setTempDesc(String tempDesc) {
		this.tempDesc = tempDesc;
		if(tempDesc != null){
			putQueryParameter("TempDesc", tempDesc);
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

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
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
	public Class<OpsEccQueryNcTemplatesResponse> getResponseClass() {
		return OpsEccQueryNcTemplatesResponse.class;
	}

}
