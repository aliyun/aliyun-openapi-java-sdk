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

package com.aliyuncs.dataworks_public.model.v20200518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dataworks_public.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateDataServiceApiRequest extends RpcAcsRequest<UpdateDataServiceApiResponse> {
	   

	private String scriptDetails;

	private Integer requestMethod;

	private String apiPath;

	private String wizardDetails;

	private Integer visibleRange;

	private String apiDescription;

	private Integer timeout;

	private String registrationDetails;

	private Long tenantId;

	private String protocols;

	private Long projectId;

	private Long apiId;

	private Integer responseContentType;
	public UpdateDataServiceApiRequest() {
		super("dataworks-public", "2020-05-18", "UpdateDataServiceApi");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getScriptDetails() {
		return this.scriptDetails;
	}

	public void setScriptDetails(String scriptDetails) {
		this.scriptDetails = scriptDetails;
		if(scriptDetails != null){
			putBodyParameter("ScriptDetails", scriptDetails);
		}
	}

	public Integer getRequestMethod() {
		return this.requestMethod;
	}

	public void setRequestMethod(Integer requestMethod) {
		this.requestMethod = requestMethod;
		if(requestMethod != null){
			putBodyParameter("RequestMethod", requestMethod.toString());
		}
	}

	public String getApiPath() {
		return this.apiPath;
	}

	public void setApiPath(String apiPath) {
		this.apiPath = apiPath;
		if(apiPath != null){
			putBodyParameter("ApiPath", apiPath);
		}
	}

	public String getWizardDetails() {
		return this.wizardDetails;
	}

	public void setWizardDetails(String wizardDetails) {
		this.wizardDetails = wizardDetails;
		if(wizardDetails != null){
			putBodyParameter("WizardDetails", wizardDetails);
		}
	}

	public Integer getVisibleRange() {
		return this.visibleRange;
	}

	public void setVisibleRange(Integer visibleRange) {
		this.visibleRange = visibleRange;
		if(visibleRange != null){
			putBodyParameter("VisibleRange", visibleRange.toString());
		}
	}

	public String getApiDescription() {
		return this.apiDescription;
	}

	public void setApiDescription(String apiDescription) {
		this.apiDescription = apiDescription;
		if(apiDescription != null){
			putBodyParameter("ApiDescription", apiDescription);
		}
	}

	public Integer getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putBodyParameter("Timeout", timeout.toString());
		}
	}

	public String getRegistrationDetails() {
		return this.registrationDetails;
	}

	public void setRegistrationDetails(String registrationDetails) {
		this.registrationDetails = registrationDetails;
		if(registrationDetails != null){
			putBodyParameter("RegistrationDetails", registrationDetails);
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

	public String getProtocols() {
		return this.protocols;
	}

	public void setProtocols(String protocols) {
		this.protocols = protocols;
		if(protocols != null){
			putBodyParameter("Protocols", protocols);
		}
	}

	public Long getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Long projectId) {
		this.projectId = projectId;
		if(projectId != null){
			putBodyParameter("ProjectId", projectId.toString());
		}
	}

	public Long getApiId() {
		return this.apiId;
	}

	public void setApiId(Long apiId) {
		this.apiId = apiId;
		if(apiId != null){
			putBodyParameter("ApiId", apiId.toString());
		}
	}

	public Integer getResponseContentType() {
		return this.responseContentType;
	}

	public void setResponseContentType(Integer responseContentType) {
		this.responseContentType = responseContentType;
		if(responseContentType != null){
			putBodyParameter("ResponseContentType", responseContentType.toString());
		}
	}

	@Override
	public Class<UpdateDataServiceApiResponse> getResponseClass() {
		return UpdateDataServiceApiResponse.class;
	}

}
