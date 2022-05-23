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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.CreateDiagnosticReportResponse;
import com.aliyuncs.ecs.model.v20140526.CreateDiagnosticReportResponse.InvokeResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDiagnosticReportResponseUnmarshaller {

	public static CreateDiagnosticReportResponse unmarshall(CreateDiagnosticReportResponse createDiagnosticReportResponse, UnmarshallerContext _ctx) {
		
		createDiagnosticReportResponse.setRequestId(_ctx.stringValue("CreateDiagnosticReportResponse.RequestId"));
		createDiagnosticReportResponse.setStatus(_ctx.stringValue("CreateDiagnosticReportResponse.Status"));
		createDiagnosticReportResponse.setReportId(_ctx.stringValue("CreateDiagnosticReportResponse.ReportId"));
		createDiagnosticReportResponse.setCreateTime(_ctx.stringValue("CreateDiagnosticReportResponse.CreateTime"));

		List<InvokeResult> commandInvokeResults = new ArrayList<InvokeResult>();
		for (int i = 0; i < _ctx.lengthValue("CreateDiagnosticReportResponse.CommandInvokeResults.Length"); i++) {
			InvokeResult invokeResult = new InvokeResult();
			invokeResult.setDataFileDir(_ctx.stringValue("CreateDiagnosticReportResponse.CommandInvokeResults["+ i +"].DataFileDir"));
			invokeResult.setInvokeResult(_ctx.stringValue("CreateDiagnosticReportResponse.CommandInvokeResults["+ i +"].InvokeResult"));
			invokeResult.setCommandName(_ctx.stringValue("CreateDiagnosticReportResponse.CommandInvokeResults["+ i +"].CommandName"));

			commandInvokeResults.add(invokeResult);
		}
		createDiagnosticReportResponse.setCommandInvokeResults(commandInvokeResults);
	 
	 	return createDiagnosticReportResponse;
	}
}