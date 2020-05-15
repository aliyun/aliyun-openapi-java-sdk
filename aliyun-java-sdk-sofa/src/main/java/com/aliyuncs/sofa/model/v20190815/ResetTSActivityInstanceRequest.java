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
public class ResetTSActivityInstanceRequest extends RpcAcsRequest<ResetTSActivityInstanceResponse> {
	   

	private Long activityInstanceId;

	private String instanceId;

	private String comment;

	private String jobRequestId;
	public ResetTSActivityInstanceRequest() {
		super("SOFA", "2019-08-15", "ResetTSActivityInstance", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getActivityInstanceId() {
		return this.activityInstanceId;
	}

	public void setActivityInstanceId(Long activityInstanceId) {
		this.activityInstanceId = activityInstanceId;
		if(activityInstanceId != null){
			putBodyParameter("ActivityInstanceId", activityInstanceId.toString());
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

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
		if(comment != null){
			putBodyParameter("Comment", comment);
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
	public Class<ResetTSActivityInstanceResponse> getResponseClass() {
		return ResetTSActivityInstanceResponse.class;
	}

}
