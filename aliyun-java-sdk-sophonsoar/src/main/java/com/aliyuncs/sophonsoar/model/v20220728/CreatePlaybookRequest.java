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
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class CreatePlaybookRequest extends RpcAcsRequest<CreatePlaybookResponse> {
	   

	private String inputParams;

	private String taskflowType;

	private String description;

	private String outputParams;

	private String displayName;

	private String lang;
	public CreatePlaybookRequest() {
		super("sophonsoar", "2022-07-28", "CreatePlaybook");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getInputParams() {
		return this.inputParams;
	}

	public void setInputParams(String inputParams) {
		this.inputParams = inputParams;
		if(inputParams != null){
			putBodyParameter("InputParams", inputParams);
		}
	}

	public String getTaskflowType() {
		return this.taskflowType;
	}

	public void setTaskflowType(String taskflowType) {
		this.taskflowType = taskflowType;
		if(taskflowType != null){
			putBodyParameter("TaskflowType", taskflowType);
		}
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
		if(description != null){
			putBodyParameter("Description", description);
		}
	}

	public String getOutputParams() {
		return this.outputParams;
	}

	public void setOutputParams(String outputParams) {
		this.outputParams = outputParams;
		if(outputParams != null){
			putBodyParameter("OutputParams", outputParams);
		}
	}

	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
		if(displayName != null){
			putBodyParameter("DisplayName", displayName);
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putBodyParameter("Lang", lang);
		}
	}

	@Override
	public Class<CreatePlaybookResponse> getResponseClass() {
		return CreatePlaybookResponse.class;
	}

}
