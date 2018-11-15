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

package com.aliyuncs.chatbot.model.v20171011;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class CreateDialogRequest extends RpcAcsRequest<CreateDialogResponse> {
	
	public CreateDialogRequest() {
		super("Chatbot", "2017-10-11", "CreateDialog", "beebot");
	}

	private String instanceId;

	private String description;

	private String dialogName;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
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

	public String getDialogName() {
		return this.dialogName;
	}

	public void setDialogName(String dialogName) {
		this.dialogName = dialogName;
		if(dialogName != null){
			putQueryParameter("DialogName", dialogName);
		}
	}

	@Override
	public Class<CreateDialogResponse> getResponseClass() {
		return CreateDialogResponse.class;
	}

}
