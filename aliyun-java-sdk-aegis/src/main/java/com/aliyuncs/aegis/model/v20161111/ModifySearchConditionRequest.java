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

package com.aliyuncs.aegis.model.v20161111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class ModifySearchConditionRequest extends RpcAcsRequest<ModifySearchConditionResponse> {
	
	public ModifySearchConditionRequest() {
		super("aegis", "2016-11-11", "ModifySearchCondition", "vipaegis");
	}

	private String sourceIp;

	private String name;

	private String filterConditions;

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
		if(sourceIp != null){
			putQueryParameter("SourceIp", sourceIp);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	public String getFilterConditions() {
		return this.filterConditions;
	}

	public void setFilterConditions(String filterConditions) {
		this.filterConditions = filterConditions;
		if(filterConditions != null){
			putQueryParameter("FilterConditions", filterConditions);
		}
	}

	@Override
	public Class<ModifySearchConditionResponse> getResponseClass() {
		return ModifySearchConditionResponse.class;
	}

}
