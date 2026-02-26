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

package com.aliyuncs.wyota.model.v20210420;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetDeviceUpgradeStatusRequest extends RpcAcsRequest<GetDeviceUpgradeStatusResponse> {
	   

	private String clientUid;

	private String project;

	private String appVersion;

	private String taskUid;
	public GetDeviceUpgradeStatusRequest() {
		super("wyota", "2021-04-20", "GetDeviceUpgradeStatus");
		setMethod(MethodType.POST);
	}

	public String getClientUid() {
		return this.clientUid;
	}

	public void setClientUid(String clientUid) {
		this.clientUid = clientUid;
		if(clientUid != null){
			putQueryParameter("ClientUid", clientUid);
		}
	}

	public String getProject() {
		return this.project;
	}

	public void setProject(String project) {
		this.project = project;
		if(project != null){
			putQueryParameter("Project", project);
		}
	}

	public String getAppVersion() {
		return this.appVersion;
	}

	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
		if(appVersion != null){
			putQueryParameter("AppVersion", appVersion);
		}
	}

	public String getTaskUid() {
		return this.taskUid;
	}

	public void setTaskUid(String taskUid) {
		this.taskUid = taskUid;
		if(taskUid != null){
			putQueryParameter("TaskUid", taskUid);
		}
	}

	@Override
	public Class<GetDeviceUpgradeStatusResponse> getResponseClass() {
		return GetDeviceUpgradeStatusResponse.class;
	}

}
