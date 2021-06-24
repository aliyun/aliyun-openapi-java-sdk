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

/**
 * @author auto create
 * @version 
 */
public class OpsSlsCopyAlertRequest extends RpcAcsRequest<OpsSlsCopyAlertResponse> {
	   

	private String targetProject;

	private String project;

	private String targetRegion;

	private String alert;

	private String displayName;

	private Boolean force;

	private String region;

	private String auditParamStr;
	public OpsSlsCopyAlertRequest() {
		super("Ecsops", "2016-04-01", "OpsSlsCopyAlert", "ecsops");
		setMethod(MethodType.POST);
	}

	public String getTargetProject() {
		return this.targetProject;
	}

	public void setTargetProject(String targetProject) {
		this.targetProject = targetProject;
		if(targetProject != null){
			putQueryParameter("TargetProject", targetProject);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getTargetRegion() {
		return this.targetRegion;
	}

	public void setTargetRegion(String targetRegion) {
		this.targetRegion = targetRegion;
		if(targetRegion != null){
			putQueryParameter("TargetRegion", targetRegion);
		}
	}

	public String getAlert() {
		return this.alert;
	}

	public void setAlert(String alert) {
		this.alert = alert;
		if(alert != null){
			putQueryParameter("Alert", alert);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putQueryParameter("DisplayName", displayName);
		}
	}

	public Boolean getForce() {
		return this.force;
	}

	public void setForce(Boolean force) {
		this.force = force;
		if(force != null){
			putQueryParameter("Force", force.toString());
		}
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
		if(region != null){
			putQueryParameter("Region", region);
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
	public Class<OpsSlsCopyAlertResponse> getResponseClass() {
		return OpsSlsCopyAlertResponse.class;
	}

}
