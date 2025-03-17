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

package com.aliyuncs.quickbi_public.model.v20220101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateDataLevelPermissionStatusRequest extends RpcAcsRequest<UpdateDataLevelPermissionStatusResponse> {
	   

	private Integer isOpen;

	private String cubeId;

	private String ruleType;
	public UpdateDataLevelPermissionStatusRequest() {
		super("quickbi-public", "2022-01-01", "UpdateDataLevelPermissionStatus", "2.2.0");
		setMethod(MethodType.POST);
	}

	public Integer getIsOpen() {
		return this.isOpen;
	}

	public void setIsOpen(Integer isOpen) {
		this.isOpen = isOpen;
		if(isOpen != null){
			putQueryParameter("IsOpen", isOpen.toString());
		}
	}

	public String getCubeId() {
		return this.cubeId;
	}

	public void setCubeId(String cubeId) {
		this.cubeId = cubeId;
		if(cubeId != null){
			putQueryParameter("CubeId", cubeId);
		}
	}

	public String getRuleType() {
		return this.ruleType;
	}

	public void setRuleType(String ruleType) {
		this.ruleType = ruleType;
		if(ruleType != null){
			putQueryParameter("RuleType", ruleType);
		}
	}

	@Override
	public Class<UpdateDataLevelPermissionStatusResponse> getResponseClass() {
		return UpdateDataLevelPermissionStatusResponse.class;
	}

}
