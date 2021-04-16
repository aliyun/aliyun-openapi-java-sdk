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

package com.aliyuncs.sas.model.v20181203;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class DescribeExposedInstanceListRequest extends RpcAcsRequest<DescribeExposedInstanceListResponse> {
	   

	private String exposurePort;

	private Integer pageSize;

	private Boolean vulStatus;

	private String exposureIp;

	private Long groupId;

	private Integer currentPage;

	private String exposureComponent;

	private String instanceId;

	private String instanceName;

	private Boolean healthStatus;
	public DescribeExposedInstanceListRequest() {
		super("Sas", "2018-12-03", "DescribeExposedInstanceList", "sas");
		setMethod(MethodType.POST);
	}

	public String getExposurePort() {
		return this.exposurePort;
	}

	public void setExposurePort(String exposurePort) {
		this.exposurePort = exposurePort;
		if(exposurePort != null){
			putQueryParameter("ExposurePort", exposurePort);
		}
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

	public Boolean getVulStatus() {
		return this.vulStatus;
	}

	public void setVulStatus(Boolean vulStatus) {
		this.vulStatus = vulStatus;
		if(vulStatus != null){
			putQueryParameter("VulStatus", vulStatus.toString());
		}
	}

	public String getExposureIp() {
		return this.exposureIp;
	}

	public void setExposureIp(String exposureIp) {
		this.exposureIp = exposureIp;
		if(exposureIp != null){
			putQueryParameter("ExposureIp", exposureIp);
		}
	}

	public Long getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
		if(groupId != null){
			putQueryParameter("GroupId", groupId.toString());
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

	public String getExposureComponent() {
		return this.exposureComponent;
	}

	public void setExposureComponent(String exposureComponent) {
		this.exposureComponent = exposureComponent;
		if(exposureComponent != null){
			putQueryParameter("ExposureComponent", exposureComponent);
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

	public String getInstanceName() {
		return this.instanceName;
	}

	public void setInstanceName(String instanceName) {
		this.instanceName = instanceName;
		if(instanceName != null){
			putQueryParameter("InstanceName", instanceName);
		}
	}

	public Boolean getHealthStatus() {
		return this.healthStatus;
	}

	public void setHealthStatus(Boolean healthStatus) {
		this.healthStatus = healthStatus;
		if(healthStatus != null){
			putQueryParameter("HealthStatus", healthStatus.toString());
		}
	}

	@Override
	public Class<DescribeExposedInstanceListResponse> getResponseClass() {
		return DescribeExposedInstanceListResponse.class;
	}

}
