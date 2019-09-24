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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.ReportDataPruneStatusResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class ReportDataPruneStatusResponseUnmarshaller {

	public static ReportDataPruneStatusResponse unmarshall(ReportDataPruneStatusResponse reportDataPruneStatusResponse, UnmarshallerContext _ctx) {
		
		reportDataPruneStatusResponse.setRequestId(_ctx.stringValue("ReportDataPruneStatusResponse.RequestId"));
		reportDataPruneStatusResponse.setSuccess(_ctx.booleanValue("ReportDataPruneStatusResponse.Success"));
		reportDataPruneStatusResponse.setCode(_ctx.stringValue("ReportDataPruneStatusResponse.Code"));
		reportDataPruneStatusResponse.setMessage(_ctx.stringValue("ReportDataPruneStatusResponse.Message"));
	 
	 	return reportDataPruneStatusResponse;
	}
}