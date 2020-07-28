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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListOperationLogsResponse;
import com.aliyuncs.edas.model.v20170801.ListOperationLogsResponse.Log;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOperationLogsResponseUnmarshaller {

	public static ListOperationLogsResponse unmarshall(ListOperationLogsResponse listOperationLogsResponse, UnmarshallerContext _ctx) {
		
		listOperationLogsResponse.setRequestId(_ctx.stringValue("ListOperationLogsResponse.RequestId"));
		listOperationLogsResponse.setCode(_ctx.integerValue("ListOperationLogsResponse.Code"));
		listOperationLogsResponse.setMessage(_ctx.stringValue("ListOperationLogsResponse.Message"));
		listOperationLogsResponse.setTotalSize(_ctx.integerValue("ListOperationLogsResponse.TotalSize"));
		listOperationLogsResponse.setCurrentPage(_ctx.integerValue("ListOperationLogsResponse.CurrentPage"));
		listOperationLogsResponse.setPageSize(_ctx.integerValue("ListOperationLogsResponse.PageSize"));

		List<Log> logList = new ArrayList<Log>();
		for (int i = 0; i < _ctx.lengthValue("ListOperationLogsResponse.LogList.Length"); i++) {
			Log log = new Log();
			log.setActionGroup(_ctx.stringValue("ListOperationLogsResponse.LogList["+ i +"].ActionGroup"));
			log.setActionName(_ctx.stringValue("ListOperationLogsResponse.LogList["+ i +"].ActionName"));
			log.setBeginTime(_ctx.longValue("ListOperationLogsResponse.LogList["+ i +"].BeginTime"));
			log.setEndTime(_ctx.longValue("ListOperationLogsResponse.LogList["+ i +"].EndTime"));
			log.setOperatorName(_ctx.stringValue("ListOperationLogsResponse.LogList["+ i +"].OperatorName"));
			log.setOperatorId(_ctx.stringValue("ListOperationLogsResponse.LogList["+ i +"].OperatorId"));
			log.setSource(_ctx.stringValue("ListOperationLogsResponse.LogList["+ i +"].Source"));
			log.setStatus(_ctx.stringValue("ListOperationLogsResponse.LogList["+ i +"].Status"));
			log.setMessage(_ctx.stringValue("ListOperationLogsResponse.LogList["+ i +"].Message"));
			log.setExtraParameters(_ctx.stringValue("ListOperationLogsResponse.LogList["+ i +"].ExtraParameters"));
			log.setAppId(_ctx.stringValue("ListOperationLogsResponse.LogList["+ i +"].AppId"));

			logList.add(log);
		}
		listOperationLogsResponse.setLogList(logList);
	 
	 	return listOperationLogsResponse;
	}
}