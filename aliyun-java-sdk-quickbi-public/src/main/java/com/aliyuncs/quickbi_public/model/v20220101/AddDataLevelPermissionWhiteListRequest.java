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
public class AddDataLevelPermissionWhiteListRequest extends RpcAcsRequest<AddDataLevelPermissionWhiteListResponse> {
	   

	private String targetType;

	private String targetIds;

	private String ruleType;

	private String operateType;

	private String cubeId;
	public AddDataLevelPermissionWhiteListRequest() {
		super("quickbi-public", "2022-01-01", "AddDataLevelPermissionWhiteList", "quickbi");
		setMethod(MethodType.POST);
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
		if(targetType != null){
			putQueryParameter("TargetType", targetType);
		}
	}

	public String getTargetIds() {
		return this.targetIds;
	}

	public void setTargetIds(String targetIds) {
		this.targetIds = targetIds;
		if(targetIds != null){
			putQueryParameter("TargetIds", targetIds);
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

	public String getOperateType() {
		return this.operateType;
	}

	public void setOperateType(String operateType) {
		this.operateType = operateType;
		if(operateType != null){
			putQueryParameter("OperateType", operateType);
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

	@Override
	public Class<AddDataLevelPermissionWhiteListResponse> getResponseClass() {
		return AddDataLevelPermissionWhiteListResponse.class;
	}

}
