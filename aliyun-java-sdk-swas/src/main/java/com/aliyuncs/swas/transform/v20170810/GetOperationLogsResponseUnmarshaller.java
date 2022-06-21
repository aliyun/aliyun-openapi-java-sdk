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

package com.aliyuncs.swas.transform.v20170810;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.swas.model.v20170810.GetOperationLogsResponse;
import com.aliyuncs.swas.model.v20170810.GetOperationLogsResponse.OperationLogsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetOperationLogsResponseUnmarshaller {

	public static GetOperationLogsResponse unmarshall(GetOperationLogsResponse getOperationLogsResponse, UnmarshallerContext _ctx) {
		
		getOperationLogsResponse.setRequestId(_ctx.stringValue("GetOperationLogsResponse.RequestId"));
		getOperationLogsResponse.setIsSuccess(_ctx.booleanValue("GetOperationLogsResponse.IsSuccess"));
		getOperationLogsResponse.setPageSize(_ctx.integerValue("GetOperationLogsResponse.PageSize"));
		getOperationLogsResponse.setCurrentPage(_ctx.integerValue("GetOperationLogsResponse.CurrentPage"));
		getOperationLogsResponse.setTotal(_ctx.integerValue("GetOperationLogsResponse.Total"));
		getOperationLogsResponse.setCode(_ctx.stringValue("GetOperationLogsResponse.Code"));

		List<OperationLogsItem> operationLogs = new ArrayList<OperationLogsItem>();
		for (int i = 0; i < _ctx.lengthValue("GetOperationLogsResponse.OperationLogs.Length"); i++) {
			OperationLogsItem operationLogsItem = new OperationLogsItem();
			operationLogsItem.setEndTime(_ctx.stringValue("GetOperationLogsResponse.OperationLogs["+ i +"].EndTime"));
			operationLogsItem.setStartTime(_ctx.stringValue("GetOperationLogsResponse.OperationLogs["+ i +"].StartTime"));
			operationLogsItem.setAction(_ctx.stringValue("GetOperationLogsResponse.OperationLogs["+ i +"].Action"));
			operationLogsItem.setResult(_ctx.stringValue("GetOperationLogsResponse.OperationLogs["+ i +"].Result"));

			operationLogs.add(operationLogsItem);
		}
		getOperationLogsResponse.setOperationLogs(operationLogs);
	 
	 	return getOperationLogsResponse;
	}
}