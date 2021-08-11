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
public class AddAppRequest extends RpcAcsRequest<AddAppResponse> {
	   

	private String repoUrl;

	private Long productId;

	private String currentOrgId;

	private String computeType;

	private String appDescription;

	private String appName;

	private String wbToken;

	private Integer solutionId;
	public AddAppRequest() {
		super("Workbench-ide", "2021-01-21", "AddApp");
		setMethod(MethodType.POST);
	}

	public String getRepoUrl() {
		return this.repoUrl;
	}

	public void setRepoUrl(String repoUrl) {
		this.repoUrl = repoUrl;
		if(repoUrl != null){
			putQueryParameter("RepoUrl", repoUrl);
		}
	}

	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
		if(productId != null){
			putQueryParameter("ProductId", productId.toString());
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

	public String getComputeType() {
		return this.computeType;
	}

	public void setComputeType(String computeType) {
		this.computeType = computeType;
		if(computeType != null){
			putQueryParameter("ComputeType", computeType);
		}
	}

	public String getAppDescription() {
		return this.appDescription;
	}

	public void setAppDescription(String appDescription) {
		this.appDescription = appDescription;
		if(appDescription != null){
			putQueryParameter("AppDescription", appDescription);
		}
	}

	public String getAppName() {
		return this.appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
		if(appName != null){
			putQueryParameter("AppName", appName);
		}
	}

	public String getWbToken() {
		return this.wbToken;
	}

	public void setWbToken(String wbToken) {
		this.wbToken = wbToken;
		if(wbToken != null){
			putQueryParameter("WbToken", wbToken);
		}
	}

	public Integer getSolutionId() {
		return this.solutionId;
	}

	public void setSolutionId(Integer solutionId) {
		this.solutionId = solutionId;
		if(solutionId != null){
			putQueryParameter("SolutionId", solutionId.toString());
		}
	}

	@Override
	public Class<AddAppResponse> getResponseClass() {
		return AddAppResponse.class;
	}

}
