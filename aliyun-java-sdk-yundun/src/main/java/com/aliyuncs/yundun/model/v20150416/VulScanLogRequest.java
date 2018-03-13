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
package com.aliyuncs.yundun.model.v20150416;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class VulScanLogRequest extends RpcAcsRequest<VulScanLogResponse> {
	
	public VulScanLogRequest() {
		super("Yundun", "2015-04-16", "VulScanLog");
	}

	private Long jstOwnerId;

	private Integer pageNumber;

	private Integer pageSize;

	private String instanceId;

	private Integer vulStatus;

	public Long getJstOwnerId() {
		return this.jstOwnerId;
	}

	public void setJstOwnerId(Long jstOwnerId) {
		this.jstOwnerId = jstOwnerId;
		putQueryParameter("JstOwnerId", String.valueOf(jstOwnerId));
	}

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		putQueryParameter("PageNumber", String.valueOf(pageNumber));
	}

	public Integer getPageSize() {
		return this.pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
		putQueryParameter("PageSize", String.valueOf(pageSize));
	}

	public String getInstanceId() {
		return this.instanceId;
	}

	public void setInstanceId(String instanceId) {
		this.instanceId = instanceId;
		putQueryParameter("InstanceId", instanceId);
	}

	public Integer getVulStatus() {
		return this.vulStatus;
	}

	public void setVulStatus(Integer vulStatus) {
		this.vulStatus = vulStatus;
		putQueryParameter("VulStatus", String.valueOf(vulStatus));
	}

	@Override
	public Class<VulScanLogResponse> getResponseClass() {
		return VulScanLogResponse.class;
	}

}
