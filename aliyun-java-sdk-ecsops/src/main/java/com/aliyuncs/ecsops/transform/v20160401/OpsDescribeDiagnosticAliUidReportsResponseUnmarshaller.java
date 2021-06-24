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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosticAliUidReportsResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsDescribeDiagnosticAliUidReportsResponse.ResourceReport;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsDescribeDiagnosticAliUidReportsResponseUnmarshaller {

	public static OpsDescribeDiagnosticAliUidReportsResponse unmarshall(OpsDescribeDiagnosticAliUidReportsResponse opsDescribeDiagnosticAliUidReportsResponse, UnmarshallerContext _ctx) {
		
		opsDescribeDiagnosticAliUidReportsResponse.setRequestId(_ctx.stringValue("OpsDescribeDiagnosticAliUidReportsResponse.RequestId"));
		opsDescribeDiagnosticAliUidReportsResponse.setStatus(_ctx.stringValue("OpsDescribeDiagnosticAliUidReportsResponse.Status"));

		List<ResourceReport> resourceReports = new ArrayList<ResourceReport>();
		for (int i = 0; i < _ctx.lengthValue("OpsDescribeDiagnosticAliUidReportsResponse.ResourceReports.Length"); i++) {
			ResourceReport resourceReport = new ResourceReport();
			resourceReport.setResourceId(_ctx.stringValue("OpsDescribeDiagnosticAliUidReportsResponse.ResourceReports["+ i +"].ResourceId"));
			resourceReport.setReportId(_ctx.stringValue("OpsDescribeDiagnosticAliUidReportsResponse.ResourceReports["+ i +"].ReportId"));

			resourceReports.add(resourceReport);
		}
		opsDescribeDiagnosticAliUidReportsResponse.setResourceReports(resourceReports);
	 
	 	return opsDescribeDiagnosticAliUidReportsResponse;
	}
}