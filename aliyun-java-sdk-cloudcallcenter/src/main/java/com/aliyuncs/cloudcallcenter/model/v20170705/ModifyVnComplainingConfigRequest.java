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
import java.util.List;

/**
 * @author auto create
 * @version 
 */
public class ModifyVnComplainingConfigRequest extends RpcAcsRequest<ModifyVnComplainingConfigResponse> {
	
	public ModifyVnComplainingConfigRequest() {
		super("CloudCallCenter", "2017-07-05", "ModifyVnComplainingConfig", "CloudCallCenter", "innerAPI");
	}

	private List<String> utterancess;

	private String instanceId;

	private String finalAction;

	private String finalActionParams;

	private String prompt;

	public List<String> getUtterancess() {
		return this.utterancess;
	}

	public void setUtterancess(List<String> utterancess) {
		this.utterancess = utterancess;	
		if (utterancess != null) {
			for (int i = 0; i < utterancess.size(); i++) {
				putQueryParameter("Utterances." + (i + 1) , utterancess.get(i));
			}
		}	
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	public String getFinalAction() {
		return this.finalAction;
	}

	public void setFinalAction(String finalAction) {
		this.finalAction = finalAction;
		if(finalAction != null){
			putQueryParameter("FinalAction", finalAction);
		}
	}

	public String getFinalActionParams() {
		return this.finalActionParams;
	}

	public void setFinalActionParams(String finalActionParams) {
		this.finalActionParams = finalActionParams;
		if(finalActionParams != null){
			putQueryParameter("FinalActionParams", finalActionParams);
		}
	}

	public String getPrompt() {
		return this.prompt;
	}

	public void setPrompt(String prompt) {
		this.prompt = prompt;
		if(prompt != null){
			putQueryParameter("Prompt", prompt);
		}
	}

	@Override
	public Class<ModifyVnComplainingConfigResponse> getResponseClass() {
		return ModifyVnComplainingConfigResponse.class;
	}

}
