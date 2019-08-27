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
public class UpdateUserStatusRequest extends RpcAcsRequest<UpdateUserStatusResponse> {
	
	public UpdateUserStatusRequest() {
		super("Emr", "2016-04-08", "UpdateUserStatus", "emr");
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private Long resourceOwnerId;

	private String aliyunUserId;

	private String updateStatus;

	public Long getResourceOwnerId() {
		return this.resourceOwnerId;
	}

	public void setResourceOwnerId(Long resourceOwnerId) {
		this.resourceOwnerId = resourceOwnerId;
		if(resourceOwnerId != null){
			putQueryParameter("ResourceOwnerId", resourceOwnerId.toString());
		}
	}

	public String getAliyunUserId() {
		return this.aliyunUserId;
	}

	public void setAliyunUserId(String aliyunUserId) {
		this.aliyunUserId = aliyunUserId;
		if(aliyunUserId != null){
			putQueryParameter("AliyunUserId", aliyunUserId);
		}
	}

	public String getUpdateStatus() {
		return this.updateStatus;
	}

	public void setUpdateStatus(String updateStatus) {
		this.updateStatus = updateStatus;
		if(updateStatus != null){
			putQueryParameter("UpdateStatus", updateStatus);
		}
	}

	@Override
	public Class<UpdateUserStatusResponse> getResponseClass() {
		return UpdateUserStatusResponse.class;
	}

}
