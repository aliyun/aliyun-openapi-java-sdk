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
public class CreateVmAndSaveStockRequest extends RpcAcsRequest<CreateVmAndSaveStockResponse> {
	   

	private String groupUuid;

	private String resourceAttribute;

	private Long aliUid;

	private String tenant;

	private String workloadUuid;
	public CreateVmAndSaveStockRequest() {
		super("Ens", "2017-11-10", "CreateVmAndSaveStock", "ens");
		setMethod(MethodType.POST);
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

	public String getResourceAttribute() {
		return this.resourceAttribute;
	}

	public void setResourceAttribute(String resourceAttribute) {
		this.resourceAttribute = resourceAttribute;
		if(resourceAttribute != null){
			putBodyParameter("ResourceAttribute", resourceAttribute);
		}
	}

	public Long getAliUid() {
		return this.aliUid;
	}

	public void setAliUid(Long aliUid) {
		this.aliUid = aliUid;
		if(aliUid != null){
			putQueryParameter("AliUid", aliUid.toString());
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

	public String getWorkloadUuid() {
		return this.workloadUuid;
	}

	public void setWorkloadUuid(String workloadUuid) {
		this.workloadUuid = workloadUuid;
		if(workloadUuid != null){
			putQueryParameter("WorkloadUuid", workloadUuid);
		}
	}

	@Override
	public Class<CreateVmAndSaveStockResponse> getResponseClass() {
		return CreateVmAndSaveStockResponse.class;
	}

}
