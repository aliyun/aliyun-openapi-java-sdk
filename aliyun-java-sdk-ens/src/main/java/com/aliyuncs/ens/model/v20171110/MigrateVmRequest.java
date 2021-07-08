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

package com.aliyuncs.ens.model.v20171110;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class MigrateVmRequest extends RpcAcsRequest<MigrateVmResponse> {
	   

	private String instances;

	private String groupUuid;

	private String tenant;

	private String instanceIds;
	public MigrateVmRequest() {
		super("Ens", "2017-11-10", "MigrateVm", "ens");
		setMethod(MethodType.POST);
	}

	public String getInstances() {
		return this.instances;
	}

	public void setInstances(String instances) {
		this.instances = instances;
		if(instances != null){
			putBodyParameter("Instances", instances);
		}
	}

	public String getGroupUuid() {
		return this.groupUuid;
	}

	public void setGroupUuid(String groupUuid) {
		this.groupUuid = groupUuid;
		if(groupUuid != null){
			putQueryParameter("GroupUuid", groupUuid);
		}
	}

	public String getTenant() {
		return this.tenant;
	}

	public void setTenant(String tenant) {
		this.tenant = tenant;
		if(tenant != null){
			putQueryParameter("Tenant", tenant);
		}
	}

	public String getInstanceIds() {
		return this.instanceIds;
	}

	public void setInstanceIds(String instanceIds) {
		this.instanceIds = instanceIds;
		if(instanceIds != null){
			putQueryParameter("InstanceIds", instanceIds);
		}
	}

	@Override
	public Class<MigrateVmResponse> getResponseClass() {
		return MigrateVmResponse.class;
	}

}
