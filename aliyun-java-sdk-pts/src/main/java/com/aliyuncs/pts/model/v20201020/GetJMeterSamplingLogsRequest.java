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

package com.aliyuncs.pts.model.v20201020;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetJMeterSamplingLogsRequest extends RpcAcsRequest<GetJMeterSamplingLogsResponse> {
	   

	private String responseCode;

	private Long agentId;

	private String reportId;

	private Integer minRT;

	private Long endTime;

	private Long beginTime;

	private String thread;

	private Integer maxRT;

	private Integer pageNumber;

	private Integer samplerId;

	private Boolean success;

	private Integer pageSize;

	private String keyword;
	public GetJMeterSamplingLogsRequest() {
		super("PTS", "2020-10-20", "GetJMeterSamplingLogs");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getResponseCode() {
		return this.responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
		if(responseCode != null){
			putQueryParameter("ResponseCode", responseCode);
		}
	}

	public Long getAgentId() {
		return this.agentId;
	}

	public void setAgentId(Long agentId) {
		this.agentId = agentId;
		if(agentId != null){
			putQueryParameter("AgentId", agentId.toString());
		}
	}

	public String getReportId() {
		return this.reportId;
	}

	public void setReportId(String reportId) {
		this.reportId = reportId;
		if(reportId != null){
			putQueryParameter("ReportId", reportId);
		}
	}

	public Integer getMinRT() {
		return this.minRT;
	}

	public void setMinRT(Integer minRT) {
		this.minRT = minRT;
		if(minRT != null){
			putQueryParameter("MinRT", minRT.toString());
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

	public Long getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Long beginTime) {
		this.beginTime = beginTime;
		if(beginTime != null){
			putQueryParameter("BeginTime", beginTime.toString());
		}
	}

	public String getThread() {
		return this.thread;
	}

	public void setThread(String thread) {
		this.thread = thread;
		if(thread != null){
			putQueryParameter("Thread", thread);
		}
	}

	public Integer getMaxRT() {
		return this.maxRT;
	}

	public void setMaxRT(Integer maxRT) {
		this.maxRT = maxRT;
		if(maxRT != null){
			putQueryParameter("MaxRT", maxRT.toString());
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

	public Integer getSamplerId() {
		return this.samplerId;
	}

	public void setSamplerId(Integer samplerId) {
		this.samplerId = samplerId;
		if(samplerId != null){
			putQueryParameter("SamplerId", samplerId.toString());
		}
	}

	public Boolean getSuccess() {
		return this.success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
		if(success != null){
			putQueryParameter("Success", success.toString());
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

	public String getKeyword() {
		return this.keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
		if(keyword != null){
			putQueryParameter("Keyword", keyword);
		}
	}

	@Override
	public Class<GetJMeterSamplingLogsResponse> getResponseClass() {
		return GetJMeterSamplingLogsResponse.class;
	}

}
