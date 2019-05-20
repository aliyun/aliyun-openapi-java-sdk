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

package com.aliyuncs.cloudcallcenter.model.v20170705;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifyCategoryRequest extends RpcAcsRequest<ModifyCategoryResponse> {
	
	public ModifyCategoryRequest() {
		super("CloudCallCenter", "2017-07-05", "ModifyCategory", "CloudCallCenter", "innerAPI");
	}

	private String instanceId;

	private String options;

	private String modifyOption;

	private String scenarioId;

	private String categoryId;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getOptions() {
		return this.options;
	}

	public void setOptions(String options) {
		this.options = options;
		if(options != null){
			putQueryParameter("Options", options);
		}
	}

	public String getModifyOption() {
		return this.modifyOption;
	}

	public void setModifyOption(String modifyOption) {
		this.modifyOption = modifyOption;
		if(modifyOption != null){
			putQueryParameter("ModifyOption", modifyOption);
		}
	}

	public String getScenarioId() {
		return this.scenarioId;
	}

	public void setScenarioId(String scenarioId) {
		this.scenarioId = scenarioId;
		if(scenarioId != null){
			putQueryParameter("ScenarioId", scenarioId);
		}
	}

	public String getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
		if(categoryId != null){
			putQueryParameter("CategoryId", categoryId);
		}
	}

	@Override
	public Class<ModifyCategoryResponse> getResponseClass() {
		return ModifyCategoryResponse.class;
	}

}
