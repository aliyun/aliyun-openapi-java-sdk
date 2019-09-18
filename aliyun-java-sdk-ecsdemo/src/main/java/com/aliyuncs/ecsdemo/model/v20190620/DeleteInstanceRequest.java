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

package com.aliyuncs.ecsdemo.model.v20190620;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DeleteInstanceRequest extends RpcAcsRequest<DeleteInstanceResponse> {
	
	public DeleteInstanceRequest() {
		super("EcsDemo", "2019-06-20", "DeleteInstance", "EcsDemo", "innerAPI");
		setProtocol(ProtocolType.HTTPS);
		setMethod(MethodType.DELETE);
	}

	private String instanceId;

	private Boolean terminateSubscription;

	private String ownerAccount;

	private String force;

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		if(instanceId != null){
			putBodyParameter("InstanceId", instanceId);
		}
	}

	public Boolean getTerminateSubscription() {
		return this.terminateSubscription;
	}

	public void setTerminateSubscription(Boolean terminateSubscription) {
		this.terminateSubscription = terminateSubscription;
		if(terminateSubscription != null){
			putBodyParameter("TerminateSubscription", terminateSubscription.toString());
		}
	}

	public String getOwnerAccount() {
		return this.ownerAccount;
	}

	public void setOwnerAccount(String ownerAccount) {
		this.ownerAccount = ownerAccount;
		if(ownerAccount != null){
			putBodyParameter("OwnerAccount", ownerAccount);
		}
	}

	public String getForce() {
		return this.force;
	}

	public void setForce(String force) {
		this.force = force;
		if(force != null){
			putBodyParameter("Force", force);
		}
	}

	@Override
	public Class<DeleteInstanceResponse> getResponseClass() {
		return DeleteInstanceResponse.class;
	}

}
