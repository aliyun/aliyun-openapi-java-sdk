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
public class EditSolutionRequest extends RpcAcsRequest<EditSolutionResponse> {
	   

	private String currentOrgId;

	private String applyScene;

	private String progLang;

	private Integer solutionId;

	private String packageType;

	private String solutionDescription;

	private String solutionName;
	public EditSolutionRequest() {
		super("Workbench-ide", "2021-01-21", "EditSolution");
		setMethod(MethodType.POST);
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

	public String getApplyScene() {
		return this.applyScene;
	}

	public void setApplyScene(String applyScene) {
		this.applyScene = applyScene;
		if(applyScene != null){
			putQueryParameter("ApplyScene", applyScene);
		}
	}

	public String getProgLang() {
		return this.progLang;
	}

	public void setProgLang(String progLang) {
		this.progLang = progLang;
		if(progLang != null){
			putQueryParameter("ProgLang", progLang);
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

	public String getPackageType() {
		return this.packageType;
	}

	public void setPackageType(String packageType) {
		this.packageType = packageType;
		if(packageType != null){
			putQueryParameter("PackageType", packageType);
		}
	}

	public String getSolutionDescription() {
		return this.solutionDescription;
	}

	public void setSolutionDescription(String solutionDescription) {
		this.solutionDescription = solutionDescription;
		if(solutionDescription != null){
			putQueryParameter("SolutionDescription", solutionDescription);
		}
	}

	public String getSolutionName() {
		return this.solutionName;
	}

	public void setSolutionName(String solutionName) {
		this.solutionName = solutionName;
		if(solutionName != null){
			putQueryParameter("SolutionName", solutionName);
		}
	}

	@Override
	public Class<EditSolutionResponse> getResponseClass() {
		return EditSolutionResponse.class;
	}

}
