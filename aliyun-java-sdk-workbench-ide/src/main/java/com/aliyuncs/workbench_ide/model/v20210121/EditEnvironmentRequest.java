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
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class EditEnvironmentRequest extends RpcAcsRequest<EditEnvironmentResponse> {
	   

	private List<String> supportComputeTypess;

	private String envName;

	private Boolean isOpenNatEip;

	private String currentOrgId;

	private String envDescription;

	private Long envId;
	public EditEnvironmentRequest() {
		super("Workbench-ide", "2021-01-21", "EditEnvironment");
		setMethod(MethodType.POST);
	}

	public List<String> getSupportComputeTypess() {
		return this.supportComputeTypess;
	}

	public void setSupportComputeTypess(List<String> supportComputeTypess) {
		this.supportComputeTypess = supportComputeTypess;	
		if (supportComputeTypess != null) {
			for (int i = 0; i < supportComputeTypess.size(); i++) {
				putQueryParameter("SupportComputeTypes." + (i + 1) , supportComputeTypess.get(i));
			}
		}	
	}

	public String getEnvName() {
		return this.envName;
	}

	public void setEnvName(String envName) {
		this.envName = envName;
		if(envName != null){
			putQueryParameter("EnvName", envName);
		}
	}

	public Boolean getIsOpenNatEip() {
		return this.isOpenNatEip;
	}

	public void setIsOpenNatEip(Boolean isOpenNatEip) {
		this.isOpenNatEip = isOpenNatEip;
		if(isOpenNatEip != null){
			putQueryParameter("IsOpenNatEip", isOpenNatEip.toString());
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

	public String getEnvDescription() {
		return this.envDescription;
	}

	public void setEnvDescription(String envDescription) {
		this.envDescription = envDescription;
		if(envDescription != null){
			putQueryParameter("EnvDescription", envDescription);
		}
	}

	public Long getEnvId() {
		return this.envId;
	}

	public void setEnvId(Long envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("EnvId", envId.toString());
		}
	}

	@Override
	public Class<EditEnvironmentResponse> getResponseClass() {
		return EditEnvironmentResponse.class;
	}

}
