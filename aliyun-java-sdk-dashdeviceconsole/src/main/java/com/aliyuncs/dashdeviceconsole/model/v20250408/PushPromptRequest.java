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

package com.aliyuncs.dashdeviceconsole.model.v20250408;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class PushPromptRequest extends RoaAcsRequest<PushPromptResponse> {
	   

	private String groupId;

	private String promptContent;
	public PushPromptRequest() {
		super("DashDeviceConsole", "2025-04-08", "PushPrompt");
		setProtocol(ProtocolType.HTTPS);
		setUriPattern("/prompt/push");
		setMethod(MethodType.POST);
	}

	public String getGroupId() {
		return this.groupId;
	}

	public void setGroupId(String groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("groupId", groupId);
		}
	}

	public String getPromptContent() {
		return this.promptContent;
	}

	public void setPromptContent(String promptContent) {
		this.promptContent = promptContent;
		if(promptContent != null){
			putBodyParameter("promptContent", promptContent);
		}
	}

	@Override
	public Class<PushPromptResponse> getResponseClass() {
		return PushPromptResponse.class;
	}

}
