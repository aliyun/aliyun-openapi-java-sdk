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

package com.aliyuncs.cloudcallcenter.transform.v20170705;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudcallcenter.model.v20170705.QueryUnsetStatusCallResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryUnsetStatusCallResponse.CallStatusList;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryUnsetStatusCallResponse.CallStatusList.CallStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryUnsetStatusCallResponseUnmarshaller {

	public static QueryUnsetStatusCallResponse unmarshall(QueryUnsetStatusCallResponse queryUnsetStatusCallResponse, UnmarshallerContext context) {
		
		queryUnsetStatusCallResponse.setRequestId(context.stringValue("QueryUnsetStatusCallResponse.RequestId"));
		queryUnsetStatusCallResponse.setSuccess(context.booleanValue("QueryUnsetStatusCallResponse.Success"));
		queryUnsetStatusCallResponse.setCode(context.stringValue("QueryUnsetStatusCallResponse.Code"));
		queryUnsetStatusCallResponse.setMessage(context.stringValue("QueryUnsetStatusCallResponse.Message"));
		queryUnsetStatusCallResponse.setHttpStatusCode(context.integerValue("QueryUnsetStatusCallResponse.HttpStatusCode"));

		CallStatusList callStatusList = new CallStatusList();
		callStatusList.setTotalCount(context.integerValue("QueryUnsetStatusCallResponse.CallStatusList.TotalCount"));
		callStatusList.setPageNumber(context.integerValue("QueryUnsetStatusCallResponse.CallStatusList.PageNumber"));
		callStatusList.setPageSize(context.integerValue("QueryUnsetStatusCallResponse.CallStatusList.PageSize"));

		List<CallStatus> list = new ArrayList<CallStatus>();
		for (int i = 0; i < context.lengthValue("QueryUnsetStatusCallResponse.CallStatusList.List.Length"); i++) {
			CallStatus callStatus = new CallStatus();
			callStatus.setStatusCode(context.stringValue("QueryUnsetStatusCallResponse.CallStatusList.List["+ i +"].StatusCode"));
			callStatus.setStatusDesc(context.stringValue("QueryUnsetStatusCallResponse.CallStatusList.List["+ i +"].StatusDesc"));
			callStatus.setTaskId(context.stringValue("QueryUnsetStatusCallResponse.CallStatusList.List["+ i +"].TaskId"));
			callStatus.setTaskState(context.stringValue("QueryUnsetStatusCallResponse.CallStatusList.List["+ i +"].TaskState"));
			callStatus.setAcid(context.stringValue("QueryUnsetStatusCallResponse.CallStatusList.List["+ i +"].Acid"));
			callStatus.setTaskCode(context.integerValue("QueryUnsetStatusCallResponse.CallStatusList.List["+ i +"].TaskCode"));
			callStatus.setEndTime(context.stringValue("QueryUnsetStatusCallResponse.CallStatusList.List["+ i +"].EndTime"));

			list.add(callStatus);
		}
		callStatusList.setList(list);
		queryUnsetStatusCallResponse.setCallStatusList(callStatusList);
	 
	 	return queryUnsetStatusCallResponse;
	}
}