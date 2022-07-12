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

package com.aliyuncs.antiddos_public.model.v20170518;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeInstanceIpAddressRequest extends RpcAcsRequest<DescribeInstanceIpAddressResponse> {
	   

	private Integer pageSize;

	private String ddosRegionId;

	private String instanceType;

	private String ddosStatus;

	private Integer currentPage;

	private String instanceName;

	private String instanceId;

	private String instanceIp;
	public DescribeInstanceIpAddressRequest() {
		super("antiddos-public", "2017-05-18", "DescribeInstanceIpAddress");
		setMethod(MethodType.POST);
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		if(pageSize != null){
			putQueryParameter("PageSize", pageSize.toString());
		}
	}

	public String getDdosRegionId() {
		return this.ddosRegionId;
	}

	public void setDdosRegionId(String ddosRegionId) {
		this.ddosRegionId = ddosRegionId;
		if(ddosRegionId != null){
			putQueryParameter("DdosRegionId", ddosRegionId);
		}
	}

	public String getInstanceType() {
		return this.instanceType;
	}

	public void setInstanceType(String instanceType) {
		this.instanceType = instanceType;
		if(instanceType != null){
			putQueryParameter("InstanceType", instanceType);
		}
	}

	public String getDdosStatus() {
		return this.ddosStatus;
	}

	public void setDdosStatus(String ddosStatus) {
		this.ddosStatus = ddosStatus;
		if(ddosStatus != null){
			putQueryParameter("DdosStatus", ddosStatus);
		}
	}

	public Integer getCurrentPage() {
		return this.currentPage;
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
		if(currentPage != null){
			putQueryParameter("CurrentPage", currentPage.toString());
		}
	}

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
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

	public String getInstanceIp() {
		return this.instanceIp;
	}

	public void setInstanceIp(String instanceIp) {
		this.instanceIp = instanceIp;
		if(instanceIp != null){
			putQueryParameter("InstanceIp", instanceIp);
		}
	}

	@Override
	public Class<DescribeInstanceIpAddressResponse> getResponseClass() {
		return DescribeInstanceIpAddressResponse.class;
	}

}
