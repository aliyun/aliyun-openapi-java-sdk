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

package com.aliyuncs.oceanbasepro.model.v20190901;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeAvailableMemResourceRequest extends RpcAcsRequest<DescribeAvailableMemResourceResponse> {
	   

	private Long unitNum;

	private Long cpuNum;

	private String instanceId;

	private String tenantId;
	public DescribeAvailableMemResourceRequest() {
		super("OceanBasePro", "2019-09-01", "DescribeAvailableMemResource");
		setMethod(MethodType.POST);
	}

	public Long getUnitNum() {
		return this.unitNum;
	}

	public void setUnitNum(Long unitNum) {
		this.unitNum = unitNum;
		if(unitNum != null){
			putBodyParameter("UnitNum", unitNum.toString());
		}
	}

	public Long getCpuNum() {
		return this.cpuNum;
	}

	public void setCpuNum(Long cpuNum) {
		this.cpuNum = cpuNum;
		if(cpuNum != null){
			putBodyParameter("CpuNum", cpuNum.toString());
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

	public String getTenantId() {
		return this.tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
		if(tenantId != null){
			putBodyParameter("TenantId", tenantId);
		}
	}

	@Override
	public Class<DescribeAvailableMemResourceResponse> getResponseClass() {
		return DescribeAvailableMemResourceResponse.class;
	}

}
