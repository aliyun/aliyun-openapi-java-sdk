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
import com.aliyuncs.ecsops.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class OpsCreateDiagnosticReportRequest extends RpcAcsRequest<OpsCreateDiagnosticReportResponse> {
	   

	private String extraNotifyParam;

	private List<String> publicCommandIds;

	private String startTime;

	private String sourceSystem;

	private String publicCommandType;

	private String callbackInfo;

	private String pluginVersion;

	private String resourceId;

	private List<String> publicCommandNames;

	private String endTime;

	private String resourceType;

	private String diagnosticCategory;

	private String auditParamStr;
	public OpsCreateDiagnosticReportRequest() {
		super("Ecsops", "2016-04-01", "OpsCreateDiagnosticReport", "ecs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getExtraNotifyParam() {
		return this.extraNotifyParam;
	}

	public void setExtraNotifyParam(String extraNotifyParam) {
		this.extraNotifyParam = extraNotifyParam;
		if(extraNotifyParam != null){
			putQueryParameter("ExtraNotifyParam", extraNotifyParam);
		}
	}

	public List<String> getPublicCommandIds() {
		return this.publicCommandIds;
	}

	public void setPublicCommandIds(List<String> publicCommandIds) {
		this.publicCommandIds = publicCommandIds;	
		if (publicCommandIds != null) {
			for (int i = 0; i < publicCommandIds.size(); i++) {
				putQueryParameter("PublicCommandId." + (i + 1) , publicCommandIds.get(i));
			}
		}	
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public String getSourceSystem() {
		return this.sourceSystem;
	}

	public void setSourceSystem(String sourceSystem) {
		this.sourceSystem = sourceSystem;
		if(sourceSystem != null){
			putQueryParameter("SourceSystem", sourceSystem);
		}
	}

	public String getPublicCommandType() {
		return this.publicCommandType;
	}

	public void setPublicCommandType(String publicCommandType) {
		this.publicCommandType = publicCommandType;
		if(publicCommandType != null){
			putQueryParameter("PublicCommandType", publicCommandType);
		}
	}

	public String getCallbackInfo() {
		return this.callbackInfo;
	}

	public void setCallbackInfo(String callbackInfo) {
		this.callbackInfo = callbackInfo;
		if(callbackInfo != null){
			putQueryParameter("CallbackInfo", callbackInfo);
		}
	}

	public String getPluginVersion() {
		return this.pluginVersion;
	}

	public void setPluginVersion(String pluginVersion) {
		this.pluginVersion = pluginVersion;
		if(pluginVersion != null){
			putQueryParameter("PluginVersion", pluginVersion);
		}
	}

	public String getResourceId() {
		return this.resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
		if(resourceId != null){
			putQueryParameter("ResourceId", resourceId);
		}
	}

	public List<String> getPublicCommandNames() {
		return this.publicCommandNames;
	}

	public void setPublicCommandNames(List<String> publicCommandNames) {
		this.publicCommandNames = publicCommandNames;	
		if (publicCommandNames != null) {
			for (int i = 0; i < publicCommandNames.size(); i++) {
				putQueryParameter("PublicCommandName." + (i + 1) , publicCommandNames.get(i));
			}
		}	
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType);
		}
	}

	public String getDiagnosticCategory() {
		return this.diagnosticCategory;
	}

	public void setDiagnosticCategory(String diagnosticCategory) {
		this.diagnosticCategory = diagnosticCategory;
		if(diagnosticCategory != null){
			putQueryParameter("DiagnosticCategory", diagnosticCategory);
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
	public Class<OpsCreateDiagnosticReportResponse> getResponseClass() {
		return OpsCreateDiagnosticReportResponse.class;
	}

}
