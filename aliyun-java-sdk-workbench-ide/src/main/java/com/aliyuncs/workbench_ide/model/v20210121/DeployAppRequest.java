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

package com.aliyuncs.workbench_ide.model.v20210121;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeployAppRequest extends RpcAcsRequest<DeployAppResponse> {
	   

	private String deployStage;

	private String currentOrgId;

	private String deployMode;

	private String packageUrl;

	private Long appId;

	private String imageUrl;

	private String fcRoutes;
	public DeployAppRequest() {
		super("Workbench-ide", "2021-01-21", "DeployApp");
		setMethod(MethodType.POST);
	}

	public String getDeployStage() {
		return this.deployStage;
	}

	public void setDeployStage(String deployStage) {
		this.deployStage = deployStage;
		if(deployStage != null){
			putQueryParameter("DeployStage", deployStage);
		}
	}

	public String getCurrentOrgId() {
		return this.currentOrgId;
	}

	public void setCurrentOrgId(String currentOrgId) {
		this.currentOrgId = currentOrgId;
		if(currentOrgId != null){
			putQueryParameter("CurrentOrgId", currentOrgId);
		}
	}

	public String getDeployMode() {
		return this.deployMode;
	}

	public void setDeployMode(String deployMode) {
		this.deployMode = deployMode;
		if(deployMode != null){
			putQueryParameter("DeployMode", deployMode);
		}
	}

	public String getPackageUrl() {
		return this.packageUrl;
	}

	public void setPackageUrl(String packageUrl) {
		this.packageUrl = packageUrl;
		if(packageUrl != null){
			putQueryParameter("PackageUrl", packageUrl);
		}
	}

	public Long getAppId() {
		return this.appId;
	}

	public void setAppId(Long appId) {
		this.appId = appId;
		if(appId != null){
			putQueryParameter("AppId", appId.toString());
		}
	}

	public String getImageUrl() {
		return this.imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		if(imageUrl != null){
			putQueryParameter("ImageUrl", imageUrl);
		}
	}

	public String getFcRoutes() {
		return this.fcRoutes;
	}

	public void setFcRoutes(String fcRoutes) {
		this.fcRoutes = fcRoutes;
		if(fcRoutes != null){
			putQueryParameter("FcRoutes", fcRoutes);
		}
	}

	@Override
	public Class<DeployAppResponse> getResponseClass() {
		return DeployAppResponse.class;
	}

}
