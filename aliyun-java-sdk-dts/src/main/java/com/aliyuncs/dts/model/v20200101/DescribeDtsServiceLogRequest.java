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

package com.aliyuncs.dts.model.v20200101;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.dts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeDtsServiceLogRequest extends RpcAcsRequest<DescribeDtsServiceLogResponse> {
	   

	private Long startTime;

	private Integer pageNumber;

	private Integer pageSize;

	private String dtsJobId;

	private String keyword;

	private String subJobType;

	private Long endTime;

	private String status;
	public DescribeDtsServiceLogRequest() {
		super("Dts", "2020-01-01", "DescribeDtsServiceLog", "dts");
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
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

	public String getDtsJobId() {
		return this.dtsJobId;
	}

	public void setDtsJobId(String dtsJobId) {
		this.dtsJobId = dtsJobId;
		if(dtsJobId != null){
			putQueryParameter("DtsJobId", dtsJobId);
		}
	}

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	public String getSubJobType() {
		return this.subJobType;
	}

	public void setSubJobType(String subJobType) {
		this.subJobType = subJobType;
		if(subJobType != null){
			putQueryParameter("SubJobType", subJobType);
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

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
		if(status != null){
			putQueryParameter("Status", status);
		}
	}

	@Override
	public Class<DescribeDtsServiceLogResponse> getResponseClass() {
		return DescribeDtsServiceLogResponse.class;
	}

}
