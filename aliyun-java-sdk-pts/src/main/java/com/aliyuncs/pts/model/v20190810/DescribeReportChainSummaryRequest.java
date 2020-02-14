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
public class DescribeReportChainSummaryRequest extends RpcAcsRequest<DescribeReportChainSummaryResponse> {
	   

	private String reportId;
	public DescribeReportChainSummaryRequest() {
		super("PTS", "2019-08-10", "DescribeReportChainSummary", "1.0.0");
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

	@Override
	public Class<DescribeReportChainSummaryResponse> getResponseClass() {
		return DescribeReportChainSummaryResponse.class;
	}

}
