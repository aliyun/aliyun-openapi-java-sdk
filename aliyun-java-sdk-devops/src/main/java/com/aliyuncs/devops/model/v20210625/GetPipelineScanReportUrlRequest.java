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

package com.aliyuncs.devops.model.v20210625;

import com.aliyuncs.RoaAcsRequest;
import com.aliyuncs.http.MethodType;

/**
 * @author auto create
 * @version 
 */
public class GetPipelineScanReportUrlRequest extends RoaAcsRequest<GetPipelineScanReportUrlResponse> {
	   

	private String organizationId;

	private String reportPath;
	public GetPipelineScanReportUrlRequest() {
		super("devops", "2021-06-25", "GetPipelineScanReportUrl");
		setUriPattern("/organization/[organizationId]/pipeline/getPipelineScanReportUrl");
		setMethod(MethodType.POST);
	}

	public String getOrganizationId() {
		return this.organizationId;
	}

	public void setOrganizationId(String organizationId) {
		this.organizationId = organizationId;
		if(organizationId != null){
			putPathParameter("organizationId", organizationId);
		}
	}

	public String getReportPath() {
		return this.reportPath;
	}

	public void setReportPath(String reportPath) {
		this.reportPath = reportPath;
		if(reportPath != null){
			putBodyParameter("reportPath", reportPath);
		}
	}

	@Override
	public Class<GetPipelineScanReportUrlResponse> getResponseClass() {
		return GetPipelineScanReportUrlResponse.class;
	}

}
