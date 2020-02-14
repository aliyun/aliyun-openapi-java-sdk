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

/**
 * @author auto create
 * @version 
 */
public class DescribeReportChainDetailRequest extends RpcAcsRequest<DescribeReportChainDetailResponse> {
	   

	private String reportId;

	private Long chainId;

	private Long endTime;

	private Long beginTime;
	public DescribeReportChainDetailRequest() {
		super("PTS", "2019-08-10", "DescribeReportChainDetail", "1.0.0");
		setMethod(MethodType.GET);
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

	public Long getChainId() {
		return this.chainId;
	}

	public void setChainId(Long chainId) {
		this.chainId = chainId;
		if(chainId != null){
			putQueryParameter("ChainId", chainId.toString());
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

	@Override
	public Class<DescribeReportChainDetailResponse> getResponseClass() {
		return DescribeReportChainDetailResponse.class;
	}

}
