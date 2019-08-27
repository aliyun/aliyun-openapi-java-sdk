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

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.emr.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetOpsCommandResultRequest extends RpcAcsRequest<GetOpsCommandResultResponse> {
	
	public GetOpsCommandResultRequest() {
		super("Emr", "2016-04-08", "GetOpsCommandResult", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private Long endCursor;

	private Long startCursor;

	private String clusterId;

	private Long taskId;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public Long getEndCursor() {
		return this.endCursor;
	}

	public void setEndCursor(Long endCursor) {
		this.endCursor = endCursor;
		if(endCursor != null){
			putQueryParameter("EndCursor", endCursor.toString());
		}
	}

	public Long getStartCursor() {
		return this.startCursor;
	}

	public void setStartCursor(Long startCursor) {
		this.startCursor = startCursor;
		if(startCursor != null){
			putQueryParameter("StartCursor", startCursor.toString());
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

	public Long getTaskId() {
		return this.taskId;
	}

	public void setTaskId(Long taskId) {
		this.taskId = taskId;
		if(taskId != null){
			putQueryParameter("TaskId", taskId.toString());
		}
	}

	@Override
	public Class<GetOpsCommandResultResponse> getResponseClass() {
		return GetOpsCommandResultResponse.class;
	}

}
