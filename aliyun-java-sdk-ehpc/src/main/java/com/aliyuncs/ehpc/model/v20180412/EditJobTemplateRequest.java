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

package com.aliyuncs.ehpc.model.v20180412;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ehpc.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class EditJobTemplateRequest extends RpcAcsRequest<EditJobTemplateResponse> {
	   

	private String stderrRedirectPath;

	private String commandLine;

	private String arrayRequest;

	private String packagePath;

	private String stdoutRedirectPath;

	private String variables;

	private String runasUser;

	private Boolean reRunable;

	private String templateId;

	private Integer priority;

	private String name;
	public EditJobTemplateRequest() {
		super("EHPC", "2018-04-12", "EditJobTemplate", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getStderrRedirectPath() {
		return this.stderrRedirectPath;
	}

	public void setStderrRedirectPath(String stderrRedirectPath) {
		this.stderrRedirectPath = stderrRedirectPath;
		if(stderrRedirectPath != null){
			putQueryParameter("StderrRedirectPath", stderrRedirectPath);
		}
	}

	public String getCommandLine() {
		return this.commandLine;
	}

	public void setCommandLine(String commandLine) {
		this.commandLine = commandLine;
		if(commandLine != null){
			putQueryParameter("CommandLine", commandLine);
		}
	}

	public String getArrayRequest() {
		return this.arrayRequest;
	}

	public void setArrayRequest(String arrayRequest) {
		this.arrayRequest = arrayRequest;
		if(arrayRequest != null){
			putQueryParameter("ArrayRequest", arrayRequest);
		}
	}

	public String getPackagePath() {
		return this.packagePath;
	}

	public void setPackagePath(String packagePath) {
		this.packagePath = packagePath;
		if(packagePath != null){
			putQueryParameter("PackagePath", packagePath);
		}
	}

	public String getStdoutRedirectPath() {
		return this.stdoutRedirectPath;
	}

	public void setStdoutRedirectPath(String stdoutRedirectPath) {
		this.stdoutRedirectPath = stdoutRedirectPath;
		if(stdoutRedirectPath != null){
			putQueryParameter("StdoutRedirectPath", stdoutRedirectPath);
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

	public String getRunasUser() {
		return this.runasUser;
	}

	public void setRunasUser(String runasUser) {
		this.runasUser = runasUser;
		if(runasUser != null){
			putQueryParameter("RunasUser", runasUser);
		}
	}

	public Boolean getReRunable() {
		return this.reRunable;
	}

	public void setReRunable(Boolean reRunable) {
		this.reRunable = reRunable;
		if(reRunable != null){
			putQueryParameter("ReRunable", reRunable.toString());
		}
	}

	public String getTemplateId() {
		return this.templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
		if(templateId != null){
			putQueryParameter("TemplateId", templateId);
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
		}
	}

	@Override
	public Class<EditJobTemplateResponse> getResponseClass() {
		return EditJobTemplateResponse.class;
	}

}
