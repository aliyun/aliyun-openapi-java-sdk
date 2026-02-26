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

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.live.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class CreateLiveDelayConfigRequest extends RpcAcsRequest<CreateLiveDelayConfigResponse> {
	   

	private Integer delayTime;

	private String stream;

	private String app;

	private Long ownerId;

	private String taskTriggerMode;

	private String domain;
	public CreateLiveDelayConfigRequest() {
		super("live", "2016-11-01", "CreateLiveDelayConfig", "live");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Integer getDelayTime() {
		return this.delayTime;
	}

	public void setDelayTime(Integer delayTime) {
		this.delayTime = delayTime;
		if(delayTime != null){
			putQueryParameter("DelayTime", delayTime.toString());
		}
	}

	public String getStream() {
		return this.stream;
	}

	public void setStream(String stream) {
		this.stream = stream;
		if(stream != null){
			putQueryParameter("Stream", stream);
		}
	}

	public String getApp() {
		return this.app;
	}

	public void setApp(String app) {
		this.app = app;
		if(app != null){
			putQueryParameter("App", app);
		}
	}

	public Long getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
		if(ownerId != null){
			putQueryParameter("OwnerId", ownerId.toString());
		}
	}

	public String getTaskTriggerMode() {
		return this.taskTriggerMode;
	}

	public void setTaskTriggerMode(String taskTriggerMode) {
		this.taskTriggerMode = taskTriggerMode;
		if(taskTriggerMode != null){
			putQueryParameter("TaskTriggerMode", taskTriggerMode);
		}
	}

	public String getDomain() {
		return this.domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
		if(domain != null){
			putQueryParameter("Domain", domain);
		}
	}

	@Override
	public Class<CreateLiveDelayConfigResponse> getResponseClass() {
		return CreateLiveDelayConfigResponse.class;
	}

}
