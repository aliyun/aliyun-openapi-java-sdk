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

package com.aliyuncs.iovcc.transform.v20180501;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iovcc.model.v20180501.ListFunctionExecuteLogResponse;
import com.aliyuncs.iovcc.model.v20180501.ListFunctionExecuteLogResponse.LogList;
import com.aliyuncs.iovcc.model.v20180501.ListFunctionExecuteLogResponse.LogList.Log;
import com.aliyuncs.iovcc.model.v20180501.ListFunctionExecuteLogResponse.LogList.Pagination;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListFunctionExecuteLogResponseUnmarshaller {

	public static ListFunctionExecuteLogResponse unmarshall(ListFunctionExecuteLogResponse listFunctionExecuteLogResponse, UnmarshallerContext _ctx) {
		
		listFunctionExecuteLogResponse.setRequestId(_ctx.stringValue("ListFunctionExecuteLogResponse.RequestId"));

		LogList logList = new LogList();

		Pagination pagination = new Pagination();
		pagination.setPageIndex(_ctx.integerValue("ListFunctionExecuteLogResponse.LogList.Pagination.PageIndex"));
		pagination.setPageSize(_ctx.integerValue("ListFunctionExecuteLogResponse.LogList.Pagination.PageSize"));
		pagination.setHasNextPage(_ctx.booleanValue("ListFunctionExecuteLogResponse.LogList.Pagination.HasNextPage"));
		logList.setPagination(pagination);

		List<Log> logs = new ArrayList<Log>();
		for (int i = 0; i < _ctx.lengthValue("ListFunctionExecuteLogResponse.LogList.Logs.Length"); i++) {
			Log log = new Log();
			log.setMessage(_ctx.stringValue("ListFunctionExecuteLogResponse.LogList.Logs["+ i +"].Message"));
			log.setBackEndRequestId(_ctx.stringValue("ListFunctionExecuteLogResponse.LogList.Logs["+ i +"].BackEndRequestId"));

			logs.add(log);
		}
		logList.setLogs(logs);
		listFunctionExecuteLogResponse.setLogList(logList);
	 
	 	return listFunctionExecuteLogResponse;
	}
}