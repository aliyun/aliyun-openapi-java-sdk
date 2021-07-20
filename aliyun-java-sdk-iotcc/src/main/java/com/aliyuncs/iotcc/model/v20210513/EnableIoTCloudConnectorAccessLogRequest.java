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

package com.aliyuncs.iotcc.model.v20210513;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class EnableIoTCloudConnectorAccessLogRequest extends RpcAcsRequest<EnableIoTCloudConnectorAccessLogResponse> {
	   

	private String clientToken;

	private String accessLogSlsLogStore;

	private Boolean dryRun;

	private String accessLogSlsProject;

	private String ioTCloudConnectorId;
	public EnableIoTCloudConnectorAccessLogRequest() {
		super("IoTCC", "2021-05-13", "EnableIoTCloudConnectorAccessLog", "cciot");
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

	public String getAccessLogSlsLogStore() {
		return this.accessLogSlsLogStore;
	}

	public void setAccessLogSlsLogStore(String accessLogSlsLogStore) {
		this.accessLogSlsLogStore = accessLogSlsLogStore;
		if(accessLogSlsLogStore != null){
			putQueryParameter("AccessLogSlsLogStore", accessLogSlsLogStore);
		}
	}

	public Boolean getDryRun() {
		return this.dryRun;
	}

	public void setDryRun(Boolean dryRun) {
		this.dryRun = dryRun;
		if(dryRun != null){
			putQueryParameter("DryRun", dryRun.toString());
		}
	}

	public String getAccessLogSlsProject() {
		return this.accessLogSlsProject;
	}

	public void setAccessLogSlsProject(String accessLogSlsProject) {
		this.accessLogSlsProject = accessLogSlsProject;
		if(accessLogSlsProject != null){
			putQueryParameter("AccessLogSlsProject", accessLogSlsProject);
		}
	}

	public String getIoTCloudConnectorId() {
		return this.ioTCloudConnectorId;
	}

	public void setIoTCloudConnectorId(String ioTCloudConnectorId) {
		this.ioTCloudConnectorId = ioTCloudConnectorId;
		if(ioTCloudConnectorId != null){
			putQueryParameter("IoTCloudConnectorId", ioTCloudConnectorId);
		}
	}

	@Override
	public Class<EnableIoTCloudConnectorAccessLogResponse> getResponseClass() {
		return EnableIoTCloudConnectorAccessLogResponse.class;
	}

}
