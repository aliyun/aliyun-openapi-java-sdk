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

package com.aliyuncs.miniapplcdp.model.v20200113;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CloneModelInModuleRequest extends RpcAcsRequest<CloneModelInModuleResponse> {
	   

	private String targetName;

	private String targetSubType;

	private String modelId;

	private String moduleId;
	public CloneModelInModuleRequest() {
		super("miniapplcdp", "2020-01-13", "CloneModelInModule");
		setMethod(MethodType.POST);
	}

	public String getTargetName() {
		return this.targetName;
	}

	public void setTargetName(String targetName) {
		this.targetName = targetName;
		if(targetName != null){
			putQueryParameter("TargetName", targetName);
		}
	}

	public String getTargetSubType() {
		return this.targetSubType;
	}

	public void setTargetSubType(String targetSubType) {
		this.targetSubType = targetSubType;
		if(targetSubType != null){
			putQueryParameter("TargetSubType", targetSubType);
		}
	}

	public String getModelId() {
		return this.modelId;
	}

	public void setModelId(String modelId) {
		this.modelId = modelId;
		if(modelId != null){
			putQueryParameter("ModelId", modelId);
		}
	}

	public String getModuleId() {
		return this.moduleId;
	}

	public void setModuleId(String moduleId) {
		this.moduleId = moduleId;
		if(moduleId != null){
			putQueryParameter("ModuleId", moduleId);
		}
	}

	@Override
	public Class<CloneModelInModuleResponse> getResponseClass() {
		return CloneModelInModuleResponse.class;
	}

}
