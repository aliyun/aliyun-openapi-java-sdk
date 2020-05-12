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
public class DescribeGroupPerformanceForRDSRequest extends RpcAcsRequest<DescribeGroupPerformanceForRDSResponse> {
	   

	private String reportId;

	private String endTime;

	private String startTime;

	private Integer topN;
	public DescribeGroupPerformanceForRDSRequest() {
		super("PTS", "2019-08-10", "DescribeGroupPerformanceForRDS");
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

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
		if(endTime != null){
			putQueryParameter("EndTime", endTime);
		}
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
		if(startTime != null){
			putQueryParameter("StartTime", startTime);
		}
	}

	public Integer getTopN() {
		return this.topN;
	}

	public void setTopN(Integer topN) {
		this.topN = topN;
		if(topN != null){
			putQueryParameter("TopN", topN.toString());
		}
	}

	@Override
	public Class<DescribeGroupPerformanceForRDSResponse> getResponseClass() {
		return DescribeGroupPerformanceForRDSResponse.class;
	}

}
