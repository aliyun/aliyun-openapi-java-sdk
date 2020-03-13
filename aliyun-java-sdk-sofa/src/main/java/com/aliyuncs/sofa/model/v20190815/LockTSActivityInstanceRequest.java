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

package com.aliyuncs.sofa.model.v20190815;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sofa.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class LockTSActivityInstanceRequest extends RpcAcsRequest<LockTSActivityInstanceResponse> {
	   

	private String curSharding;

	private Long parentActivityInstanceId;

	private Long activityId;

	private String instanceId;

	private String jobRequestId;
	public LockTSActivityInstanceRequest() {
		super("SOFA", "2019-08-15", "LockTSActivityInstance", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getCurSharding() {
		return this.curSharding;
	}

	public void setCurSharding(String curSharding) {
		this.curSharding = curSharding;
		if(curSharding != null){
			putBodyParameter("CurSharding", curSharding);
		}
	}

	public Long getParentActivityInstanceId() {
		return this.parentActivityInstanceId;
	}

	public void setParentActivityInstanceId(Long parentActivityInstanceId) {
		this.parentActivityInstanceId = parentActivityInstanceId;
		if(parentActivityInstanceId != null){
			putBodyParameter("ParentActivityInstanceId", parentActivityInstanceId.toString());
		}
	}

	public Long getActivityId() {
		return this.activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
		if(activityId != null){
			putBodyParameter("ActivityId", activityId.toString());
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public String getJobRequestId() {
		return this.jobRequestId;
	}

	public void setJobRequestId(String jobRequestId) {
		this.jobRequestId = jobRequestId;
		if(jobRequestId != null){
			putBodyParameter("JobRequestId", jobRequestId);
		}
	}

	@Override
	public Class<LockTSActivityInstanceResponse> getResponseClass() {
		return LockTSActivityInstanceResponse.class;
	}

}
