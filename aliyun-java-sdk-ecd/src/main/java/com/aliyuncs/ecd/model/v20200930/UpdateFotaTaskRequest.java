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

package com.aliyuncs.ecd.model.v20200930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecd.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class UpdateFotaTaskRequest extends RpcAcsRequest<UpdateFotaTaskResponse> {
	   

	private String userStatus;

	private String taskUid;
	public UpdateFotaTaskRequest() {
		super("ecd", "2020-09-30", "UpdateFotaTask");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getUserStatus() {
		return this.userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
		if(userStatus != null){
			putQueryParameter("UserStatus", userStatus);
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
	public Class<UpdateFotaTaskResponse> getResponseClass() {
		return UpdateFotaTaskResponse.class;
	}

}
