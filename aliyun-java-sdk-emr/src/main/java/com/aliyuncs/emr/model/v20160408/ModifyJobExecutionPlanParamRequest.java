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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyJobExecutionPlanParamRequest extends RpcAcsRequest<ModifyJobExecutionPlanParamResponse> {
	
	public ModifyJobExecutionPlanParamRequest() {
		super("Emr", "2016-04-08", "ModifyJobExecutionPlanParam", "emr");
	}

	private Long resourceOwnerId;

	private String paramName;

	private String paramValue;

	private Long id;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getParamName() {
		return this.paramName;
	}

	public void setParamName(String paramName) {
		this.paramName = paramName;
		if(paramName != null){
			putQueryParameter("ParamName", paramName);
		}
	}

	public String getParamValue() {
		return this.paramValue;
	}

	public void setParamValue(String paramValue) {
		this.paramValue = paramValue;
		if(paramValue != null){
			putQueryParameter("ParamValue", paramValue);
		}
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
		if(id != null){
			putQueryParameter("Id", id.toString());
		}
	}

	@Override
	public Class<ModifyJobExecutionPlanParamResponse> getResponseClass() {
		return ModifyJobExecutionPlanParamResponse.class;
	}

}
