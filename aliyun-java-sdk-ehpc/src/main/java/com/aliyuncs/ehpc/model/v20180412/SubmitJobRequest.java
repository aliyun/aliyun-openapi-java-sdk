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
public class SubmitJobRequest extends RpcAcsRequest<SubmitJobResponse> {
	   

	private String stderrRedirectPath;

	private String runasUserPassword;

	private String clockTime;

	private String commandLine;

	private String jobQueue;

	private String arrayRequest;

	private String unzipCmd;

	private String packagePath;

	private String mem;

	private String stdoutRedirectPath;

	private String variables;

	private String postCmdLine;

	private String runasUser;

	private String clusterId;

	private Boolean reRunable;

	private Integer thread;

	private Integer priority;

	private Integer gpu;

	private Integer node;

	private Integer task;

	private String inputFileUrl;

	private String name;

	private String containerId;
	public SubmitJobRequest() {
		super("EHPC", "2018-04-12", "SubmitJob");
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

	public String getRunasUserPassword() {
		return this.runasUserPassword;
	}

	public void setRunasUserPassword(String runasUserPassword) {
		this.runasUserPassword = runasUserPassword;
		if(runasUserPassword != null){
			putQueryParameter("RunasUserPassword", runasUserPassword);
		}
	}

	public String getClockTime() {
		return this.clockTime;
	}

	public void setClockTime(String clockTime) {
		this.clockTime = clockTime;
		if(clockTime != null){
			putQueryParameter("ClockTime", clockTime);
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

	public String getJobQueue() {
		return this.jobQueue;
	}

	public void setJobQueue(String jobQueue) {
		this.jobQueue = jobQueue;
		if(jobQueue != null){
			putQueryParameter("JobQueue", jobQueue);
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

	public String getUnzipCmd() {
		return this.unzipCmd;
	}

	public void setUnzipCmd(String unzipCmd) {
		this.unzipCmd = unzipCmd;
		if(unzipCmd != null){
			putQueryParameter("UnzipCmd", unzipCmd);
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

	public String getMem() {
		return this.mem;
	}

	public void setMem(String mem) {
		this.mem = mem;
		if(mem != null){
			putQueryParameter("Mem", mem);
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

	public String getPostCmdLine() {
		return this.postCmdLine;
	}

	public void setPostCmdLine(String postCmdLine) {
		this.postCmdLine = postCmdLine;
		if(postCmdLine != null){
			putQueryParameter("PostCmdLine", postCmdLine);
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

	public Integer getThread() {
		return this.thread;
	}

	public void setThread(Integer thread) {
		this.thread = thread;
		if(thread != null){
			putQueryParameter("Thread", thread.toString());
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

	public Integer getGpu() {
		return this.gpu;
	}

	public void setGpu(Integer gpu) {
		this.gpu = gpu;
		if(gpu != null){
			putQueryParameter("Gpu", gpu.toString());
		}
	}

	public Integer getNode() {
		return this.node;
	}

	public void setNode(Integer node) {
		this.node = node;
		if(node != null){
			putQueryParameter("Node", node.toString());
		}
	}

	public Integer getTask() {
		return this.task;
	}

	public void setTask(Integer task) {
		this.task = task;
		if(task != null){
			putQueryParameter("Task", task.toString());
		}
	}

	public String getInputFileUrl() {
		return this.inputFileUrl;
	}

	public void setInputFileUrl(String inputFileUrl) {
		this.inputFileUrl = inputFileUrl;
		if(inputFileUrl != null){
			putQueryParameter("InputFileUrl", inputFileUrl);
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

	public String getContainerId() {
		return this.containerId;
	}

	public void setContainerId(String containerId) {
		this.containerId = containerId;
		if(containerId != null){
			putQueryParameter("ContainerId", containerId);
		}
	}

	@Override
	public Class<SubmitJobResponse> getResponseClass() {
		return SubmitJobResponse.class;
	}

}
