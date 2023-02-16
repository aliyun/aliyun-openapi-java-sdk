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

package com.aliyuncs.eventbridge.model.v20200401;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteTargetsRequest extends RpcAcsRequest<DeleteTargetsResponse> {
	   

	@SerializedName("targetIds")
	private List<String> targetIds;

	private String ruleName;

	private String eventBusName;
	public DeleteTargetsRequest() {
		super("eventbridge", "2020-04-01", "DeleteTargets");
		setMethod(MethodType.POST);
	}

	public List<String> getTargetIds() {
		return this.targetIds;
	}

	public void setTargetIds(List<String> targetIds) {
		this.targetIds = targetIds;	
		if (targetIds != null) {
			putQueryParameter("TargetIds" , new Gson().toJson(targetIds));
		}	
	}

	public String getRuleName() {
		return this.ruleName;
	}

	public void setRuleName(String ruleName) {
		this.ruleName = ruleName;
		if(ruleName != null){
			putQueryParameter("RuleName", ruleName);
		}
	}

	public String getEventBusName() {
		return this.eventBusName;
	}

	public void setEventBusName(String eventBusName) {
		this.eventBusName = eventBusName;
		if(eventBusName != null){
			putQueryParameter("EventBusName", eventBusName);
		}
	}

	@Override
	public Class<DeleteTargetsResponse> getResponseClass() {
		return DeleteTargetsResponse.class;
	}

}
