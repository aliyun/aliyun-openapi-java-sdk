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

import com.aliyuncs.ros.model.v20190910.GetDiagnosticResponse;
import com.aliyuncs.ros.model.v20190910.GetDiagnosticResponse.DiagnosticResult;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDiagnosticResponseUnmarshaller {

	public static GetDiagnosticResponse unmarshall(GetDiagnosticResponse getDiagnosticResponse, UnmarshallerContext _ctx) {
		
		getDiagnosticResponse.setRequestId(_ctx.stringValue("GetDiagnosticResponse.RequestId"));
		getDiagnosticResponse.setCode(_ctx.stringValue("GetDiagnosticResponse.Code"));
		getDiagnosticResponse.setDiagnosticProduct(_ctx.stringValue("GetDiagnosticResponse.DiagnosticProduct"));
		getDiagnosticResponse.setHttpStatusCode(_ctx.integerValue("GetDiagnosticResponse.HttpStatusCode"));
		getDiagnosticResponse.setMessage(_ctx.stringValue("GetDiagnosticResponse.Message"));
		getDiagnosticResponse.setRecommends(_ctx.mapValue("GetDiagnosticResponse.Recommends"));
		getDiagnosticResponse.setReportId(_ctx.stringValue("GetDiagnosticResponse.ReportId"));
		getDiagnosticResponse.setStatus(_ctx.stringValue("GetDiagnosticResponse.Status"));
		getDiagnosticResponse.setStatusReason(_ctx.stringValue("GetDiagnosticResponse.StatusReason"));
		getDiagnosticResponse.setSuccess(_ctx.stringValue("GetDiagnosticResponse.Success"));
		getDiagnosticResponse.setDiagnosticKey(_ctx.stringValue("GetDiagnosticResponse.DiagnosticKey"));
		getDiagnosticResponse.setDiagnosticTime(_ctx.stringValue("GetDiagnosticResponse.DiagnosticTime"));
		getDiagnosticResponse.setHttpCode(_ctx.stringValue("GetDiagnosticResponse.HttpCode"));

		DiagnosticResult diagnosticResult = new DiagnosticResult();
		diagnosticResult.setStackMessages(_ctx.mapValue("GetDiagnosticResponse.DiagnosticResult.StackMessages"));
		diagnosticResult.setRosActionMessages(_ctx.mapValue("GetDiagnosticResponse.DiagnosticResult.RosActionMessages"));
		diagnosticResult.setFailedResources(_ctx.mapValue("GetDiagnosticResponse.DiagnosticResult.FailedResources"));
		getDiagnosticResponse.setDiagnosticResult(diagnosticResult);
	 
	 	return getDiagnosticResponse;
	}
}