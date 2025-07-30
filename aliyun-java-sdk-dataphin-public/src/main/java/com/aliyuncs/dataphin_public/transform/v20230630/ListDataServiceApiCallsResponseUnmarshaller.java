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

package com.aliyuncs.dataphin_public.transform.v20230630;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceApiCallsResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceApiCallsResponse.PageResult;
import com.aliyuncs.dataphin_public.model.v20230630.ListDataServiceApiCallsResponse.PageResult.CallLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDataServiceApiCallsResponseUnmarshaller {

	public static ListDataServiceApiCallsResponse unmarshall(ListDataServiceApiCallsResponse listDataServiceApiCallsResponse, UnmarshallerContext _ctx) {
		
		listDataServiceApiCallsResponse.setRequestId(_ctx.stringValue("ListDataServiceApiCallsResponse.RequestId"));
		listDataServiceApiCallsResponse.setSuccess(_ctx.booleanValue("ListDataServiceApiCallsResponse.Success"));
		listDataServiceApiCallsResponse.setHttpStatusCode(_ctx.integerValue("ListDataServiceApiCallsResponse.HttpStatusCode"));
		listDataServiceApiCallsResponse.setCode(_ctx.stringValue("ListDataServiceApiCallsResponse.Code"));
		listDataServiceApiCallsResponse.setMessage(_ctx.stringValue("ListDataServiceApiCallsResponse.Message"));

		PageResult pageResult = new PageResult();
		pageResult.setTotalCount(_ctx.longValue("ListDataServiceApiCallsResponse.PageResult.TotalCount"));

		List<CallLog> callLogList = new ArrayList<CallLog>();
		for (int i = 0; i < _ctx.lengthValue("ListDataServiceApiCallsResponse.PageResult.CallLogList.Length"); i++) {
			CallLog callLog = new CallLog();
			callLog.setEndTime(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].EndTime"));
			callLog.setProjectName(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].ProjectName"));
			callLog.setResultCount(_ctx.integerValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].ResultCount"));
			callLog.setEnv(_ctx.integerValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].Env"));
			callLog.setClientIp(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].ClientIp"));
			callLog.setAppName(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].AppName"));
			callLog.setCostTime(_ctx.integerValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].CostTime"));
			callLog.setResponseSize(_ctx.integerValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].ResponseSize"));
			callLog.setResponseParameter(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].ResponseParameter"));
			callLog.setAppKey(_ctx.longValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].AppKey"));
			callLog.setHttpStatusCode(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].HttpStatusCode"));
			callLog.setBizCodeDescription(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].BizCodeDescription"));
			callLog.setExecuteMode(_ctx.integerValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].ExecuteMode"));
			callLog.setJobId(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].JobId"));
			callLog.setHttpStatusDescription(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].HttpStatusDescription"));
			callLog.setBizCode(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].BizCode"));
			callLog.setStatus(_ctx.integerValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].Status"));
			callLog.setRequestId(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].RequestId"));
			callLog.setApiName(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].ApiName"));
			callLog.setRequestParameter(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].RequestParameter"));
			callLog.setRequestSize(_ctx.integerValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].RequestSize"));
			callLog.setStartTime(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].StartTime"));
			callLog.setProjectId(_ctx.integerValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].ProjectId"));
			callLog.setSuccessful(_ctx.booleanValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].Successful"));
			callLog.setSql(_ctx.stringValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].Sql"));
			callLog.setExecuteCostTime(_ctx.integerValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].ExecuteCostTime"));
			callLog.setApiId(_ctx.longValue("ListDataServiceApiCallsResponse.PageResult.CallLogList["+ i +"].ApiId"));

			callLogList.add(callLog);
		}
		pageResult.setCallLogList(callLogList);
		listDataServiceApiCallsResponse.setPageResult(pageResult);
	 
	 	return listDataServiceApiCallsResponse;
	}
}