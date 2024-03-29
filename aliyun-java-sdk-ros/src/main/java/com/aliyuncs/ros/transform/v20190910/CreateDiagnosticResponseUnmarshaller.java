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

package com.aliyuncs.ros.transform.v20190910;

import com.aliyuncs.ros.model.v20190910.CreateDiagnosticResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateDiagnosticResponseUnmarshaller {

	public static CreateDiagnosticResponse unmarshall(CreateDiagnosticResponse createDiagnosticResponse, UnmarshallerContext _ctx) {
		
		createDiagnosticResponse.setRequestId(_ctx.stringValue("CreateDiagnosticResponse.RequestId"));
		createDiagnosticResponse.setCode(_ctx.stringValue("CreateDiagnosticResponse.Code"));
		createDiagnosticResponse.setDiagnosticType(_ctx.stringValue("CreateDiagnosticResponse.DiagnosticType"));
		createDiagnosticResponse.setHttpStatusCode(_ctx.integerValue("CreateDiagnosticResponse.HttpStatusCode"));
		createDiagnosticResponse.setMessage(_ctx.stringValue("CreateDiagnosticResponse.Message"));
		createDiagnosticResponse.setReportId(_ctx.stringValue("CreateDiagnosticResponse.ReportId"));
		createDiagnosticResponse.setSuccess(_ctx.stringValue("CreateDiagnosticResponse.Success"));
	 
	 	return createDiagnosticResponse;
	}
}