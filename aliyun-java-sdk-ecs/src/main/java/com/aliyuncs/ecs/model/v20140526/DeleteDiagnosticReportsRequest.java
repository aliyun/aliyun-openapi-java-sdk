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

package com.aliyuncs.ecs.model.v20140526;

import com.aliyuncs.RpcAcsRequest;
import java.util.List;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.ecs.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class DeleteDiagnosticReportsRequest extends RpcAcsRequest<DeleteDiagnosticReportsResponse> {
	   

	private List<String> reportIdss;
	public DeleteDiagnosticReportsRequest() {
		super("Ecs", "2014-05-26", "DeleteDiagnosticReports");
		setMethod(MethodType.POST);
		try {
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointMap").set(this, Endpoint.endpointMap);
			com.aliyuncs.AcsRequest.class.getDeclaredField("productEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	public List<String> getReportIdss() {
		return this.reportIdss;
	}

	public void setReportIdss(List<String> reportIdss) {
		this.reportIdss = reportIdss;	
		if (reportIdss != null) {
			for (int i = 0; i < reportIdss.size(); i++) {
				putQueryParameter("ReportIds." + (i + 1) , reportIdss.get(i));
			}
		}	
	}

	@Override
	public Class<DeleteDiagnosticReportsResponse> getResponseClass() {
		return DeleteDiagnosticReportsResponse.class;
	}

}
