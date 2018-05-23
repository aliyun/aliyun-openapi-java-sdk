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

/**
 * @author auto create
 * @version 
 */
public class SubmitJobRequest extends RpcAcsRequest<SubmitJobResponse> {
	
	public SubmitJobRequest() {
		super("EHPC", "2018-04-12", "SubmitJob", "ehs");
	}

	private String stderrRedirectPath;

	private String variables;

	private String runasUserPassword;

	private String runasUser;

	private String clusterId;

	private Boolean reRunable;

	private Integer priority;

	private String commandLine;

	private String arrayRequest;

	private String packagePath;

	private String name;

	private String stdoutRedirectPath;

	public String getStderrRedirectPath() {
		return this.stderrRedirectPath;
	}

	public void setStderrRedirectPath(String stderrRedirectPath) {
		this.stderrRedirectPath = stderrRedirectPath;
		if(stderrRedirectPath != null){
			putQueryParameter("StderrRedirectPath", stderrRedirectPath);
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

	public String getRunasUserPassword() {
		return this.runasUserPassword;
	}

	public void setRunasUserPassword(String runasUserPassword) {
		this.runasUserPassword = runasUserPassword;
		if(runasUserPassword != null){
			putQueryParameter("RunasUserPassword", runasUserPassword);
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

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putQueryParameter("ClusterId", clusterId);
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

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
		if(priority != null){
			putQueryParameter("Priority", priority.toString());
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
		if(name != null){
			putQueryParameter("Name", name);
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

	@Override
	public Class<SubmitJobResponse> getResponseClass() {
		return SubmitJobResponse.class;
	}

}
