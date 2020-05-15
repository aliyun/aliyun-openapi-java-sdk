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
public class RetryTSShardingActivityInstancesRequest extends RpcAcsRequest<RetryTSShardingActivityInstancesResponse> {
	   

	private Long timeout;

	private Long curSharding;

	private Long parentActivityInstanceId;

	private String instanceId;

	private String comment;
	public RetryTSShardingActivityInstancesRequest() {
		super("SOFA", "2019-08-15", "RetryTSShardingActivityInstances", "ApplySidecarCert");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getTimeout() {
		return this.timeout;
	}

	public void setTimeout(Long timeout) {
		this.timeout = timeout;
		if(timeout != null){
			putBodyParameter("Timeout", timeout.toString());
		}
	}

	public Long getCurSharding() {
		return this.curSharding;
	}

	public void setCurSharding(Long curSharding) {
		this.curSharding = curSharding;
		if(curSharding != null){
			putBodyParameter("CurSharding", curSharding.toString());
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

	@Override
	public Class<RetryTSShardingActivityInstancesResponse> getResponseClass() {
		return RetryTSShardingActivityInstancesResponse.class;
	}

}
