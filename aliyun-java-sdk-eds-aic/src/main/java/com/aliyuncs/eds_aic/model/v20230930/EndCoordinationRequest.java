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

package com.aliyuncs.eds_aic.model.v20230930;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class EndCoordinationRequest extends RpcAcsRequest<EndCoordinationResponse> {
	   

	private String ownerUserId;

	private String coordinatorUserId;

	private String instanceId;
	public EndCoordinationRequest() {
		super("eds-aic", "2023-09-30", "EndCoordination");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.POST);
	}

	public String getOwnerUserId() {
		return this.ownerUserId;
	}

	public void setOwnerUserId(String ownerUserId) {
		this.ownerUserId = ownerUserId;
		if(ownerUserId != null){
			putQueryParameter("OwnerUserId", ownerUserId);
		}
	}

	public String getCoordinatorUserId() {
		return this.coordinatorUserId;
	}

	public void setCoordinatorUserId(String coordinatorUserId) {
		this.coordinatorUserId = coordinatorUserId;
		if(coordinatorUserId != null){
			putQueryParameter("CoordinatorUserId", coordinatorUserId);
		}
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putQueryParameter("InstanceId", instanceId);
		}
	}

	@Override
	public Class<EndCoordinationResponse> getResponseClass() {
		return EndCoordinationResponse.class;
	}

}
