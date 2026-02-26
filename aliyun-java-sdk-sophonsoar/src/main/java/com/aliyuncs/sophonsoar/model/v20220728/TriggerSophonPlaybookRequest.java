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

package com.aliyuncs.sophonsoar.model.v20220728;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class TriggerSophonPlaybookRequest extends RpcAcsRequest<TriggerSophonPlaybookResponse> {
	   

	private String inputParams;

	private String commandName;

	private String sophonTaskId;

	private String triggerType;

	private String uuid;
	public TriggerSophonPlaybookRequest() {
		super("sophonsoar", "2022-07-28", "TriggerSophonPlaybook");
		setMethod(MethodType.POST);
	}

	public String getInputParams() {
		return this.inputParams;
	}

	public void setInputParams(String inputParams) {
		this.inputParams = inputParams;
		if(inputParams != null){
			putQueryParameter("InputParams", inputParams);
		}
	}

	public String getCommandName() {
		return this.commandName;
	}

	public void setCommandName(String commandName) {
		this.commandName = commandName;
		if(commandName != null){
			putQueryParameter("CommandName", commandName);
		}
	}

	public String getSophonTaskId() {
		return this.sophonTaskId;
	}

	public void setSophonTaskId(String sophonTaskId) {
		this.sophonTaskId = sophonTaskId;
		if(sophonTaskId != null){
			putQueryParameter("SophonTaskId", sophonTaskId);
		}
	}

	public String getTriggerType() {
		return this.triggerType;
	}

	public void setTriggerType(String triggerType) {
		this.triggerType = triggerType;
		if(triggerType != null){
			putQueryParameter("TriggerType", triggerType);
		}
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
		if(uuid != null){
			putQueryParameter("Uuid", uuid);
		}
	}

	@Override
	public Class<TriggerSophonPlaybookResponse> getResponseClass() {
		return TriggerSophonPlaybookResponse.class;
	}

}
