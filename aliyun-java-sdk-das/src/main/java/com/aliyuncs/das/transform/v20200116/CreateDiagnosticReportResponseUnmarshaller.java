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

package com.aliyuncs.das.transform.v20200116;

import com.aliyuncs.das.model.v20200116.CreateDiagnosticReportResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDiagnosticReportResponseUnmarshaller {

	public static CreateDiagnosticReportResponse unmarshall(CreateDiagnosticReportResponse createDiagnosticReportResponse, UnmarshallerContext _ctx) {
		
		createDiagnosticReportResponse.setRequestId(_ctx.stringValue("CreateDiagnosticReportResponse.RequestId"));
		createDiagnosticReportResponse.setMessage(_ctx.stringValue("CreateDiagnosticReportResponse.Message"));
		createDiagnosticReportResponse.setSynchro(_ctx.stringValue("CreateDiagnosticReportResponse.Synchro"));
		createDiagnosticReportResponse.setData(_ctx.stringValue("CreateDiagnosticReportResponse.Data"));
		createDiagnosticReportResponse.setCode(_ctx.stringValue("CreateDiagnosticReportResponse.Code"));
		createDiagnosticReportResponse.setSuccess(_ctx.stringValue("CreateDiagnosticReportResponse.Success"));
	 
	 	return createDiagnosticReportResponse;
	}
}