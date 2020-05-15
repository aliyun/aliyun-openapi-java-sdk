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

package com.aliyuncs.pts.model.v20190810;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.pts.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeSamplingLogRequest extends RpcAcsRequest<DescribeSamplingLogResponse> {
	   

	private String reportId;

	private Integer pageNumber;

	private Long chainId;

	private String httpResponseStatus;

	private String rtRange;

	private Integer pageSize;

	private String errorCode;
	public DescribeSamplingLogRequest() {
		super("PTS", "2019-08-10", "DescribeSamplingLog");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
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

	public Integer getPageNumber() {
		return this.pageNumber;
	}

	public void setPageNumber(Integer pageNumber) {
		this.pageNumber = pageNumber;
		if(pageNumber != null){
			putQueryParameter("PageNumber", pageNumber.toString());
		}
	}

	public Long getChainId() {
		return this.chainId;
	}

	public void setChainId(Long chainId) {
		this.chainId = chainId;
		if(chainId != null){
			putQueryParameter("ChainId", chainId.toString());
		}
	}

	public String getHttpResponseStatus() {
		return this.httpResponseStatus;
	}

	public void setHttpResponseStatus(String httpResponseStatus) {
		this.httpResponseStatus = httpResponseStatus;
		if(httpResponseStatus != null){
			putQueryParameter("HttpResponseStatus", httpResponseStatus);
		}
	}

	public String getRtRange() {
		return this.rtRange;
	}

	public void setRtRange(String rtRange) {
		this.rtRange = rtRange;
		if(rtRange != null){
			putQueryParameter("RtRange", rtRange);
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

	public String getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		if(errorCode != null){
			putQueryParameter("ErrorCode", errorCode);
		}
	}

	@Override
	public Class<DescribeSamplingLogResponse> getResponseClass() {
		return DescribeSamplingLogResponse.class;
	}

}
