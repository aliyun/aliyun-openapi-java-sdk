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

package com.aliyuncs.pts.model.v20181111;

import com.aliyuncs.RpcAcsRequest;

/**
 * @author auto create
 * @version 
 */
public class GetReportRequest extends RpcAcsRequest<GetReportResponse> {
	
	public GetReportRequest() {
		super("PTS", "2018-11-11", "GetReport");
	}

	private Long reportId;

	public Long getReportId() {
		return this.reportId;
	}

	public void setReportId(Long reportId) {
		this.reportId = reportId;
		if(reportId != null){
			putQueryParameter("ReportId", reportId.toString());
		}
	}

	@Override
	public Class<GetReportResponse> getResponseClass() {
		return GetReportResponse.class;
	}

}
