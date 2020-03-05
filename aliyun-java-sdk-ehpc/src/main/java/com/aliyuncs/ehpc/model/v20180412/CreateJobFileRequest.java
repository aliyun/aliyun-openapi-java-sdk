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
public class CreateJobFileRequest extends RpcAcsRequest<CreateJobFileResponse> {
	   

	private String targetFile;

	private String runasUserPassword;

	private String runasUser;

	private String clusterId;

	private String content;
	public CreateJobFileRequest() {
		super("EHPC", "2018-04-12", "CreateJobFile", "ehs");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getTargetFile() {
		return this.targetFile;
	}

	public void setTargetFile(String targetFile) {
		this.targetFile = targetFile;
		if(targetFile != null){
			putQueryParameter("TargetFile", targetFile);
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
		if(content != null){
			putQueryParameter("Content", content);
		}
	}

	@Override
	public Class<CreateJobFileResponse> getResponseClass() {
		return CreateJobFileResponse.class;
	}

}
