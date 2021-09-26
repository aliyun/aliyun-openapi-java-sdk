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

package com.aliyuncs.sddp.model.v20190103;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.sddp.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDataLimitsRequest extends RpcAcsRequest<DescribeDataLimitsResponse> {
	   

	private Long startTime;

	private String parentId;

	private Integer enable;

	private Integer pageSize;

	private Integer checkStatus;

	private Integer datamaskStatus;

	private String lang;

	private String serviceRegionId;

	private String engineType;

	private Integer auditStatus;

	private Long endTime;

	private Integer currentPage;

	private Integer resourceType;
	public DescribeDataLimitsRequest() {
		super("Sddp", "2019-01-03", "DescribeDataLimits");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public Long getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Long startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime.toString());
		}
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
		if(parentId != null){
			putQueryParameter("ParentId", parentId);
		}
	}

	public Integer getEnable() {
		return this.enable;
	}

	public void setEnable(Integer enable) {
		this.enable = enable;
		if(enable != null){
			putQueryParameter("Enable", enable.toString());
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

	public Integer getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
		if(checkStatus != null){
			putQueryParameter("CheckStatus", checkStatus.toString());
		}
	}

	public Integer getDatamaskStatus() {
		return this.datamaskStatus;
	}

	public void setDatamaskStatus(Integer datamaskStatus) {
		this.datamaskStatus = datamaskStatus;
		if(datamaskStatus != null){
			putQueryParameter("DatamaskStatus", datamaskStatus.toString());
		}
	}

	public String getLang() {
		return this.lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
		if(lang != null){
			putQueryParameter("Lang", lang);
		}
	}

	public String getServiceRegionId() {
		return this.serviceRegionId;
	}

	public void setServiceRegionId(String serviceRegionId) {
		this.serviceRegionId = serviceRegionId;
		if(serviceRegionId != null){
			putQueryParameter("ServiceRegionId", serviceRegionId);
		}
	}

	public String getEngineType() {
		return this.engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
		if(engineType != null){
			putQueryParameter("EngineType", engineType);
		}
	}

	public Integer getAuditStatus() {
		return this.auditStatus;
	}

	public void setAuditStatus(Integer auditStatus) {
		this.auditStatus = auditStatus;
		if(auditStatus != null){
			putQueryParameter("AuditStatus", auditStatus.toString());
		}
	}

	public Long getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Long endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime.toString());
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

	public Integer getResourceType() {
		return this.resourceType;
	}

	public void setResourceType(Integer resourceType) {
		this.resourceType = resourceType;
		if(resourceType != null){
			putQueryParameter("ResourceType", resourceType.toString());
		}
	}

	@Override
	public Class<DescribeDataLimitsResponse> getResponseClass() {
		return DescribeDataLimitsResponse.class;
	}

}
