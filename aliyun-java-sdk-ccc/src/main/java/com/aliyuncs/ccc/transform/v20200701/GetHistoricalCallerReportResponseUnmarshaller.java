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

package com.aliyuncs.ccc.transform.v20200701;

import com.aliyuncs.ccc.model.v20200701.GetHistoricalCallerReportResponse;
import com.aliyuncs.ccc.model.v20200701.GetHistoricalCallerReportResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetHistoricalCallerReportResponseUnmarshaller {

	public static GetHistoricalCallerReportResponse unmarshall(GetHistoricalCallerReportResponse getHistoricalCallerReportResponse, UnmarshallerContext _ctx) {
		
		getHistoricalCallerReportResponse.setRequestId(_ctx.stringValue("GetHistoricalCallerReportResponse.RequestId"));
		getHistoricalCallerReportResponse.setCode(_ctx.stringValue("GetHistoricalCallerReportResponse.Code"));
		getHistoricalCallerReportResponse.setHttpStatusCode(_ctx.integerValue("GetHistoricalCallerReportResponse.HttpStatusCode"));
		getHistoricalCallerReportResponse.setMessage(_ctx.stringValue("GetHistoricalCallerReportResponse.Message"));

		Data data = new Data();
		data.setLastCallingTime(_ctx.longValue("GetHistoricalCallerReportResponse.Data.LastCallingTime"));
		data.setTotalCalls(_ctx.longValue("GetHistoricalCallerReportResponse.Data.TotalCalls"));
		getHistoricalCallerReportResponse.setData(data);
	 
	 	return getHistoricalCallerReportResponse;
	}
}