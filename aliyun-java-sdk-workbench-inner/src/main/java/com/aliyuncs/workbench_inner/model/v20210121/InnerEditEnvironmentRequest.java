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

package com.aliyuncs.workbench_inner.model.v20210121;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class InnerEditEnvironmentRequest extends RpcAcsRequest<InnerEditEnvironmentResponse> {
	   

	private String envName;

	private String envDesc;

	private String currentOrgId;

	private Long envId;

	private String userId;

	private List<String> supportComputeTypess;

	private Boolean isOpenNateip;
	public InnerEditEnvironmentRequest() {
		super("Workbench-inner", "2021-01-21", "InnerEditEnvironment");
		setMethod(MethodType.POST);
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

	public String getEnvDesc() {
		return this.envDesc;
	}

	public void setEnvDesc(String envDesc) {
		this.envDesc = envDesc;
		if(envDesc != null){
			putQueryParameter("EnvDesc", envDesc);
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

	public Long getEnvId() {
		return this.envId;
	}

	public void setEnvId(Long envId) {
		this.envId = envId;
		if(envId != null){
			putQueryParameter("EnvId", envId.toString());
		}
	}

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
		if(userId != null){
			putQueryParameter("UserId", userId);
		}
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

	public Boolean getIsOpenNateip() {
		return this.isOpenNateip;
	}

	public void setIsOpenNateip(Boolean isOpenNateip) {
		this.isOpenNateip = isOpenNateip;
		if(isOpenNateip != null){
			putQueryParameter("IsOpenNateip", isOpenNateip.toString());
		}
	}

	@Override
	public Class<InnerEditEnvironmentResponse> getResponseClass() {
		return InnerEditEnvironmentResponse.class;
	}

}
