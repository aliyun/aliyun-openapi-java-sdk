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

package com.aliyuncs.imm.model.v20170906;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetDRMLicenseRequest extends RpcAcsRequest<GetDRMLicenseResponse> {
	   

	private String project;

	private String dRMType;

	private String dRMLicense;
	public GetDRMLicenseRequest() {
		super("imm", "2017-09-06", "GetDRMLicense");
		setMethod(MethodType.POST);
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

	public String getDRMType() {
		return this.dRMType;
	}

	public void setDRMType(String dRMType) {
		this.dRMType = dRMType;
		if(dRMType != null){
			putQueryParameter("DRMType", dRMType);
		}
	}

	public String getDRMLicense() {
		return this.dRMLicense;
	}

	public void setDRMLicense(String dRMLicense) {
		this.dRMLicense = dRMLicense;
		if(dRMLicense != null){
			putQueryParameter("DRMLicense", dRMLicense);
		}
	}

	@Override
	public Class<GetDRMLicenseResponse> getResponseClass() {
		return GetDRMLicenseResponse.class;
	}

}
