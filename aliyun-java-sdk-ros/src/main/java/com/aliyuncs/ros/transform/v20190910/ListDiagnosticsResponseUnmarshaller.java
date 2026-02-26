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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ros.model.v20190910.ListDiagnosticsResponse;
import com.aliyuncs.ros.model.v20190910.ListDiagnosticsResponse.诊断结果;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDiagnosticsResponseUnmarshaller {

	public static ListDiagnosticsResponse unmarshall(ListDiagnosticsResponse listDiagnosticsResponse, UnmarshallerContext _ctx) {
		
		listDiagnosticsResponse.setRequestId(_ctx.stringValue("ListDiagnosticsResponse.RequestId"));
		listDiagnosticsResponse.setHttpStatusCode(_ctx.integerValue("ListDiagnosticsResponse.HttpStatusCode"));
		listDiagnosticsResponse.setMessage(_ctx.stringValue("ListDiagnosticsResponse.Message"));
		listDiagnosticsResponse.setSuccess(_ctx.stringValue("ListDiagnosticsResponse.Success"));
		listDiagnosticsResponse.setNextToken(_ctx.stringValue("ListDiagnosticsResponse.NextToken"));

		List<诊断结果> diagnostics = new ArrayList<诊断结果>();
		for (int i = 0; i < _ctx.lengthValue("ListDiagnosticsResponse.Diagnostics.Length"); i++) {
			诊断结果 诊断结果 = new 诊断结果();
			诊断结果.setCreateTime(_ctx.stringValue("ListDiagnosticsResponse.Diagnostics["+ i +"].CreateTime"));
			诊断结果.setDiagnosticKey(_ctx.stringValue("ListDiagnosticsResponse.Diagnostics["+ i +"].DiagnosticKey"));
			诊断结果.setDiagnosticProduct(_ctx.stringValue("ListDiagnosticsResponse.Diagnostics["+ i +"].DiagnosticProduct"));
			诊断结果.setReportId(_ctx.stringValue("ListDiagnosticsResponse.Diagnostics["+ i +"].ReportId"));
			诊断结果.setStatus(_ctx.stringValue("ListDiagnosticsResponse.Diagnostics["+ i +"].Status"));

			diagnostics.add(诊断结果);
		}
		listDiagnosticsResponse.setDiagnostics(diagnostics);
	 
	 	return listDiagnosticsResponse;
	}
}