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

import com.aliyuncs.dataphin_public.model.v20230630.ListOperationRecordResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListOperationRecordResponse.OperationLogListResponse;
import com.aliyuncs.dataphin_public.model.v20230630.ListOperationRecordResponse.OperationLogListResponse.OperationLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListOperationRecordResponseUnmarshaller {

	public static ListOperationRecordResponse unmarshall(ListOperationRecordResponse listOperationRecordResponse, UnmarshallerContext _ctx) {
		
		listOperationRecordResponse.setRequestId(_ctx.stringValue("ListOperationRecordResponse.RequestId"));
		listOperationRecordResponse.setSuccess(_ctx.booleanValue("ListOperationRecordResponse.Success"));
		listOperationRecordResponse.setHttpStatusCode(_ctx.integerValue("ListOperationRecordResponse.HttpStatusCode"));
		listOperationRecordResponse.setCode(_ctx.stringValue("ListOperationRecordResponse.Code"));
		listOperationRecordResponse.setMessage(_ctx.stringValue("ListOperationRecordResponse.Message"));

		OperationLogListResponse operationLogListResponse = new OperationLogListResponse();
		operationLogListResponse.setCount(_ctx.integerValue("ListOperationRecordResponse.OperationLogListResponse.Count"));

		List<OperationLog> resultData = new ArrayList<OperationLog>();
		for (int i = 0; i < _ctx.lengthValue("ListOperationRecordResponse.OperationLogListResponse.ResultData.Length"); i++) {
			OperationLog operationLog = new OperationLog();
			operationLog.setId(_ctx.longValue("ListOperationRecordResponse.OperationLogListResponse.ResultData["+ i +"].Id"));
			operationLog.setName(_ctx.stringValue("ListOperationRecordResponse.OperationLogListResponse.ResultData["+ i +"].Name"));
			operationLog.setObjectType(_ctx.stringValue("ListOperationRecordResponse.OperationLogListResponse.ResultData["+ i +"].ObjectType"));
			operationLog.setCodeType(_ctx.integerValue("ListOperationRecordResponse.OperationLogListResponse.ResultData["+ i +"].CodeType"));
			operationLog.setStatus(_ctx.integerValue("ListOperationRecordResponse.OperationLogListResponse.ResultData["+ i +"].Status"));
			operationLog.setBeginTime(_ctx.stringValue("ListOperationRecordResponse.OperationLogListResponse.ResultData["+ i +"].BeginTime"));
			operationLog.setRunner(_ctx.stringValue("ListOperationRecordResponse.OperationLogListResponse.ResultData["+ i +"].Runner"));
			operationLog.setRunnerName(_ctx.stringValue("ListOperationRecordResponse.OperationLogListResponse.ResultData["+ i +"].RunnerName"));
			operationLog.setProjectId(_ctx.longValue("ListOperationRecordResponse.OperationLogListResponse.ResultData["+ i +"].ProjectId"));
			operationLog.setTenantId(_ctx.longValue("ListOperationRecordResponse.OperationLogListResponse.ResultData["+ i +"].TenantId"));
			operationLog.setOperationId(_ctx.longValue("ListOperationRecordResponse.OperationLogListResponse.ResultData["+ i +"].OperationId"));
			operationLog.setDuration(_ctx.longValue("ListOperationRecordResponse.OperationLogListResponse.ResultData["+ i +"].Duration"));

			List<String> relationTables = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListOperationRecordResponse.OperationLogListResponse.ResultData["+ i +"].RelationTables.Length"); j++) {
				relationTables.add(_ctx.stringValue("ListOperationRecordResponse.OperationLogListResponse.ResultData["+ i +"].RelationTables["+ j +"]"));
			}
			operationLog.setRelationTables(relationTables);

			resultData.add(operationLog);
		}
		operationLogListResponse.setResultData(resultData);
		listOperationRecordResponse.setOperationLogListResponse(operationLogListResponse);
	 
	 	return listOperationRecordResponse;
	}
}