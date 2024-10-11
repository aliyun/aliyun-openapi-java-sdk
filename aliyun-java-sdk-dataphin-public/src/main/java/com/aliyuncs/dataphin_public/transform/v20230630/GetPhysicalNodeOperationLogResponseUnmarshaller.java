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

import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeOperationLogResponse;
import com.aliyuncs.dataphin_public.model.v20230630.GetPhysicalNodeOperationLogResponse.OperationLog;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPhysicalNodeOperationLogResponseUnmarshaller {

	public static GetPhysicalNodeOperationLogResponse unmarshall(GetPhysicalNodeOperationLogResponse getPhysicalNodeOperationLogResponse, UnmarshallerContext _ctx) {
		
		getPhysicalNodeOperationLogResponse.setRequestId(_ctx.stringValue("GetPhysicalNodeOperationLogResponse.RequestId"));
		getPhysicalNodeOperationLogResponse.setSuccess(_ctx.booleanValue("GetPhysicalNodeOperationLogResponse.Success"));
		getPhysicalNodeOperationLogResponse.setHttpStatusCode(_ctx.integerValue("GetPhysicalNodeOperationLogResponse.HttpStatusCode"));
		getPhysicalNodeOperationLogResponse.setCode(_ctx.stringValue("GetPhysicalNodeOperationLogResponse.Code"));
		getPhysicalNodeOperationLogResponse.setMessage(_ctx.stringValue("GetPhysicalNodeOperationLogResponse.Message"));

		List<OperationLog> operationLogList = new ArrayList<OperationLog>();
		for (int i = 0; i < _ctx.lengthValue("GetPhysicalNodeOperationLogResponse.OperationLogList.Length"); i++) {
			OperationLog operationLog = new OperationLog();
			operationLog.setContext(_ctx.stringValue("GetPhysicalNodeOperationLogResponse.OperationLogList["+ i +"].Context"));
			operationLog.setOperationType(_ctx.stringValue("GetPhysicalNodeOperationLogResponse.OperationLogList["+ i +"].OperationType"));
			operationLog.setOperator(_ctx.stringValue("GetPhysicalNodeOperationLogResponse.OperationLogList["+ i +"].Operator"));
			operationLog.setOperationTime(_ctx.stringValue("GetPhysicalNodeOperationLogResponse.OperationLogList["+ i +"].OperationTime"));
			operationLog.setOperatorName(_ctx.stringValue("GetPhysicalNodeOperationLogResponse.OperationLogList["+ i +"].OperatorName"));

			operationLogList.add(operationLog);
		}
		getPhysicalNodeOperationLogResponse.setOperationLogList(operationLogList);
	 
	 	return getPhysicalNodeOperationLogResponse;
	}
}