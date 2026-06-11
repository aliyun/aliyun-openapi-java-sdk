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

package com.aliyuncs.airegistry.model.v20260317;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdatePromptVersionRequest extends RpcAcsRequest<UpdatePromptVersionResponse> {
	   

	private String promptKey;

	private String namespaceId;

	private String template;

	private String variables;

	private String commitMsg;
	public UpdatePromptVersionRequest() {
		super("AIRegistry", "2026-03-17", "UpdatePromptVersion");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getPromptKey() {
		return this.promptKey;
	}

	public void setPromptKey(String promptKey) {
		this.promptKey = promptKey;
		if(promptKey != null){
			putQueryParameter("PromptKey", promptKey);
		}
	}

	public String getNamespaceId() {
		return this.namespaceId;
	}

	public void setNamespaceId(String namespaceId) {
		this.namespaceId = namespaceId;
		if(namespaceId != null){
			putQueryParameter("NamespaceId", namespaceId);
		}
	}

	public String getTemplate() {
		return this.template;
	}

	public void setTemplate(String template) {
		this.template = template;
		if(template != null){
			putQueryParameter("Template", template);
		}
	}

	public String getVariables() {
		return this.variables;
	}

	public void setVariables(String variables) {
		this.variables = variables;
		if(variables != null){
			putQueryParameter("Variables", variables);
		}
	}

	public String getCommitMsg() {
		return this.commitMsg;
	}

	public void setCommitMsg(String commitMsg) {
		this.commitMsg = commitMsg;
		if(commitMsg != null){
			putQueryParameter("CommitMsg", commitMsg);
		}
	}

	@Override
	public Class<UpdatePromptVersionResponse> getResponseClass() {
		return UpdatePromptVersionResponse.class;
	}

}
