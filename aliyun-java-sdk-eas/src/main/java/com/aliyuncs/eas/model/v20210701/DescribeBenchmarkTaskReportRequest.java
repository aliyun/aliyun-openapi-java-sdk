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

package com.aliyuncs.eas.model.v20210701;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.eas.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DescribeBenchmarkTaskReportRequest extends RoaAcsRequest<DescribeBenchmarkTaskReportResponse> {
	   

	private String reportType;

	private String taskName;

	private String clusterId;
	public DescribeBenchmarkTaskReportRequest() {
		super("eas", "2021-07-01", "DescribeBenchmarkTaskReport", "eas");
		setUriPattern("/api/v2/benchmark-tasks/[ClusterId]/[TaskName]/report");
		setMethod(MethodType.GET);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public String getReportType() {
		return this.reportType;
	}

	public void setReportType(String reportType) {
		this.reportType = reportType;
		if(reportType != null){
			putQueryParameter("ReportType", reportType);
		}
	}

	public String getTaskName() {
		return this.taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
		if(taskName != null){
			putPathParameter("TaskName", taskName);
		}
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
		if(clusterId != null){
			putPathParameter("ClusterId", clusterId);
		}
	}

	@Override
	public Class<DescribeBenchmarkTaskReportResponse> getResponseClass() {
		return DescribeBenchmarkTaskReportResponse.class;
	}

}
