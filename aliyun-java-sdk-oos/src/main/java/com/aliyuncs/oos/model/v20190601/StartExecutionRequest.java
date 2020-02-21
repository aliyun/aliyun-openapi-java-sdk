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

package com.aliyuncs.oos.model.v20190601;

import com.aliyuncs.RpcAcsRequest;
import java.util.Map;
import com.google.gson.Gson;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class StartExecutionRequest extends RpcAcsRequest<StartExecutionResponse> {
	   

	private String clientToken;

	private String description;

	private String mode;

	private String templateVersion;

	private String templateName;

	private String loopMode;

	private String safetyCheck;

	private Map<Object,Object> tags;

	private String parentExecutionId;

	private String parameters;
	public StartExecutionRequest() {
		super("oos", "2019-06-01", "StartExecution", "oos");
		setMethod(MethodType.POST);
	}

	public String getClientToken() {
		return this.clientToken;
	}

	public void setClientToken(String clientToken) {
		this.clientToken = clientToken;
		if(clientToken != null){
			putQueryParameter("ClientToken", clientToken);
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

	public String getMode() {
		return this.mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
		if(mode != null){
			putQueryParameter("Mode", mode);
		}
	}

	public String getTemplateVersion() {
		return this.templateVersion;
	}

	public void setTemplateVersion(String templateVersion) {
		this.templateVersion = templateVersion;
		if(templateVersion != null){
			putQueryParameter("TemplateVersion", templateVersion);
		}
	}

	public String getTemplateName() {
		return this.templateName;
	}

	public void setTemplateName(String templateName) {
		this.templateName = templateName;
		if(templateName != null){
			putQueryParameter("TemplateName", templateName);
		}
	}

	public String getLoopMode() {
		return this.loopMode;
	}

	public void setLoopMode(String loopMode) {
		this.loopMode = loopMode;
		if(loopMode != null){
			putQueryParameter("LoopMode", loopMode);
		}
	}

	public String getSafetyCheck() {
		return this.safetyCheck;
	}

	public void setSafetyCheck(String safetyCheck) {
		this.safetyCheck = safetyCheck;
		if(safetyCheck != null){
			putQueryParameter("SafetyCheck", safetyCheck);
		}
	}

	public Map<Object,Object> getTags() {
		return this.tags;
	}

	public void setTags(Map<Object,Object> tags) {
		this.tags = tags;
		if(tags != null){
			putQueryParameter("Tags", new Gson().toJson(tags));
		}
	}

	public String getParentExecutionId() {
		return this.parentExecutionId;
	}

	public void setParentExecutionId(String parentExecutionId) {
		this.parentExecutionId = parentExecutionId;
		if(parentExecutionId != null){
			putQueryParameter("ParentExecutionId", parentExecutionId);
		}
	}

	public String getParameters() {
		return this.parameters;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
		if(parameters != null){
			putQueryParameter("Parameters", parameters);
		}
	}

	@Override
	public Class<StartExecutionResponse> getResponseClass() {
		return StartExecutionResponse.class;
	}

}
