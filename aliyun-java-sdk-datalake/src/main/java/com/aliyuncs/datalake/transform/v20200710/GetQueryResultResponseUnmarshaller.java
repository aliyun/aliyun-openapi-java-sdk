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

package com.aliyuncs.datalake.transform.v20200710;

import com.aliyuncs.datalake.model.v20200710.GetQueryResultResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetQueryResultResponseUnmarshaller {

	public static GetQueryResultResponse unmarshall(GetQueryResultResponse getQueryResultResponse, UnmarshallerContext _ctx) {
		
		getQueryResultResponse.setRequestId(_ctx.stringValue("GetQueryResultResponse.RequestId"));
		getQueryResultResponse.setOwner(_ctx.longValue("GetQueryResultResponse.Owner"));
		getQueryResultResponse.setId(_ctx.stringValue("GetQueryResultResponse.Id"));
		getQueryResultResponse.setRegionId(_ctx.stringValue("GetQueryResultResponse.RegionId"));
		getQueryResultResponse.setGmtModified(_ctx.stringValue("GetQueryResultResponse.GmtModified"));
		getQueryResultResponse.setGmtCreate(_ctx.stringValue("GetQueryResultResponse.GmtCreate"));
		getQueryResultResponse.setSql(_ctx.stringValue("GetQueryResultResponse.Sql"));
		getQueryResultResponse.setJobCompleted(_ctx.booleanValue("GetQueryResultResponse.JobCompleted"));
		getQueryResultResponse.setProgress(_ctx.integerValue("GetQueryResultResponse.Progress"));
		getQueryResultResponse.setDuration(_ctx.longValue("GetQueryResultResponse.Duration"));
		getQueryResultResponse.setLogs(_ctx.stringValue("GetQueryResultResponse.Logs"));
		getQueryResultResponse.setSchema(_ctx.stringValue("GetQueryResultResponse.Schema"));
		getQueryResultResponse.setRows(_ctx.stringValue("GetQueryResultResponse.Rows"));
		getQueryResultResponse.setRowCount(_ctx.integerValue("GetQueryResultResponse.RowCount"));
		getQueryResultResponse.setResultTmpTable(_ctx.stringValue("GetQueryResultResponse.ResultTmpTable"));
		getQueryResultResponse.setResultTmpDb(_ctx.stringValue("GetQueryResultResponse.ResultTmpDb"));
		getQueryResultResponse.setErrorMessage(_ctx.stringValue("GetQueryResultResponse.ErrorMessage"));
		getQueryResultResponse.setSuccess(_ctx.booleanValue("GetQueryResultResponse.Success"));
		getQueryResultResponse.setStartTime(_ctx.stringValue("GetQueryResultResponse.StartTime"));
		getQueryResultResponse.setEndTime(_ctx.stringValue("GetQueryResultResponse.EndTime"));
		getQueryResultResponse.setStatus(_ctx.stringValue("GetQueryResultResponse.Status"));
		getQueryResultResponse.setRowCountOverLimit(_ctx.booleanValue("GetQueryResultResponse.RowCountOverLimit"));
	 
	 	return getQueryResultResponse;
	}
}