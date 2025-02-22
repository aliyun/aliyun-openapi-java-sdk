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

package com.aliyuncs.dfs.model.v20180620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class ModifyAccessRuleRequest extends RpcAcsRequest<ModifyAccessRuleResponse> {
	   

	private String rWAccessType;

	private String description;

	private String accessGroupId;

	private String inputRegionId;

	private String accessRuleId;

	private Integer priority;
	public ModifyAccessRuleRequest() {
		super("DFS", "2018-06-20", "ModifyAccessRule", "alidfs");
		setMethod(MethodType.POST);
	}

	public String getRWAccessType() {
		return this.rWAccessType;
	}

	public void setRWAccessType(String rWAccessType) {
		this.rWAccessType = rWAccessType;
		if(rWAccessType != null){
			putQueryParameter("RWAccessType", rWAccessType);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putQueryParameter("Description", description);
		}
	}

	public String getAccessGroupId() {
		return this.accessGroupId;
	}

	public void setAccessGroupId(String accessGroupId) {
		this.accessGroupId = accessGroupId;
		if(accessGroupId != null){
			putQueryParameter("AccessGroupId", accessGroupId);
		}
	}

	public String getInputRegionId() {
		return this.inputRegionId;
	}

	public void setInputRegionId(String inputRegionId) {
		this.inputRegionId = inputRegionId;
		if(inputRegionId != null){
			putQueryParameter("InputRegionId", inputRegionId);
		}
	}

	public String getAccessRuleId() {
		return this.accessRuleId;
	}

	public void setAccessRuleId(String accessRuleId) {
		this.accessRuleId = accessRuleId;
		if(accessRuleId != null){
			putQueryParameter("AccessRuleId", accessRuleId);
		}
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
		}
	}

	@Override
	public Class<ModifyAccessRuleResponse> getResponseClass() {
		return ModifyAccessRuleResponse.class;
	}

}
