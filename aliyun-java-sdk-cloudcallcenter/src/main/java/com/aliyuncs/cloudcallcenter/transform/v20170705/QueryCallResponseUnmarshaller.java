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

import com.aliyuncs.cloudcallcenter.model.v20170705.QueryCallResponse;
import com.aliyuncs.cloudcallcenter.model.v20170705.QueryCallResponse.CallStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryCallResponseUnmarshaller {

	public static QueryCallResponse unmarshall(QueryCallResponse queryCallResponse, UnmarshallerContext context) {
		
		queryCallResponse.setRequestId(context.stringValue("QueryCallResponse.RequestId"));
		queryCallResponse.setSuccess(context.booleanValue("QueryCallResponse.Success"));
		queryCallResponse.setCode(context.stringValue("QueryCallResponse.Code"));
		queryCallResponse.setMessage(context.stringValue("QueryCallResponse.Message"));
		queryCallResponse.setHttpStatusCode(context.integerValue("QueryCallResponse.HttpStatusCode"));

		List<CallStatus> callStatusList = new ArrayList<CallStatus>();
		for (int i = 0; i < context.lengthValue("QueryCallResponse.callStatusList.Length"); i++) {
			CallStatus callStatus = new CallStatus();
			callStatus.setStatusCode(context.stringValue("QueryCallResponse.callStatusList["+ i +"].StatusCode"));
			callStatus.setStatusDesc(context.stringValue("QueryCallResponse.callStatusList["+ i +"].StatusDesc"));
			callStatus.setTaskId(context.stringValue("QueryCallResponse.callStatusList["+ i +"].TaskId"));
			callStatus.setTaskState(context.stringValue("QueryCallResponse.callStatusList["+ i +"].TaskState"));
			callStatus.setAcid(context.stringValue("QueryCallResponse.callStatusList["+ i +"].Acid"));
			callStatus.setTaskCode(context.integerValue("QueryCallResponse.callStatusList["+ i +"].TaskCode"));
			callStatus.setEndTime(context.stringValue("QueryCallResponse.callStatusList["+ i +"].EndTime"));

			callStatusList.add(callStatus);
		}
		queryCallResponse.setCallStatusList(callStatusList);
	 
	 	return queryCallResponse;
	}
}