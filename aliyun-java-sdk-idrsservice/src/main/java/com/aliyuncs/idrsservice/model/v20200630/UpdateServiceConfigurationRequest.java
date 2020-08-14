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

package com.aliyuncs.idrsservice.model.v20200630;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class UpdateServiceConfigurationRequest extends RpcAcsRequest<UpdateServiceConfigurationResponse> {
	   

	private Integer taskItemQueueSize;

	private Integer liveRecordLayout;

	private Integer clientQueueSize;

	private String liveRecordTaskProfile;

	private Boolean liveRecordAll;

	private Boolean liveRecordEveryOne;
	public UpdateServiceConfigurationRequest() {
		super("idrsservice", "2020-06-30", "UpdateServiceConfiguration", "idrsservice");
		setMethod(MethodType.POST);
	}

	public Integer getTaskItemQueueSize() {
		return this.taskItemQueueSize;
	}

	public void setTaskItemQueueSize(Integer taskItemQueueSize) {
		this.taskItemQueueSize = taskItemQueueSize;
		if(taskItemQueueSize != null){
			putQueryParameter("TaskItemQueueSize", taskItemQueueSize.toString());
		}
	}

	public Integer getLiveRecordLayout() {
		return this.liveRecordLayout;
	}

	public void setLiveRecordLayout(Integer liveRecordLayout) {
		this.liveRecordLayout = liveRecordLayout;
		if(liveRecordLayout != null){
			putQueryParameter("LiveRecordLayout", liveRecordLayout.toString());
		}
	}

	public Integer getClientQueueSize() {
		return this.clientQueueSize;
	}

	public void setClientQueueSize(Integer clientQueueSize) {
		this.clientQueueSize = clientQueueSize;
		if(clientQueueSize != null){
			putQueryParameter("ClientQueueSize", clientQueueSize.toString());
		}
	}

	public String getLiveRecordTaskProfile() {
		return this.liveRecordTaskProfile;
	}

	public void setLiveRecordTaskProfile(String liveRecordTaskProfile) {
		this.liveRecordTaskProfile = liveRecordTaskProfile;
		if(liveRecordTaskProfile != null){
			putQueryParameter("LiveRecordTaskProfile", liveRecordTaskProfile);
		}
	}

	public Boolean getLiveRecordAll() {
		return this.liveRecordAll;
	}

	public void setLiveRecordAll(Boolean liveRecordAll) {
		this.liveRecordAll = liveRecordAll;
		if(liveRecordAll != null){
			putQueryParameter("LiveRecordAll", liveRecordAll.toString());
		}
	}

	public Boolean getLiveRecordEveryOne() {
		return this.liveRecordEveryOne;
	}

	public void setLiveRecordEveryOne(Boolean liveRecordEveryOne) {
		this.liveRecordEveryOne = liveRecordEveryOne;
		if(liveRecordEveryOne != null){
			putQueryParameter("LiveRecordEveryOne", liveRecordEveryOne.toString());
		}
	}

	@Override
	public Class<UpdateServiceConfigurationResponse> getResponseClass() {
		return UpdateServiceConfigurationResponse.class;
	}

}
