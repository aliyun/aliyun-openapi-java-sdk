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

package com.aliyuncs.ehpc.transform.v20180412;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ehpc.model.v20180412.ListInvocationResultsResponse;
import com.aliyuncs.ehpc.model.v20180412.ListInvocationResultsResponse.InvocationResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInvocationResultsResponseUnmarshaller {

	public static ListInvocationResultsResponse unmarshall(ListInvocationResultsResponse listInvocationResultsResponse, UnmarshallerContext _ctx) {
		
		listInvocationResultsResponse.setRequestId(_ctx.stringValue("ListInvocationResultsResponse.RequestId"));
		listInvocationResultsResponse.setTotalCount(_ctx.integerValue("ListInvocationResultsResponse.TotalCount"));
		listInvocationResultsResponse.setPageNumber(_ctx.integerValue("ListInvocationResultsResponse.PageNumber"));
		listInvocationResultsResponse.setPageSize(_ctx.integerValue("ListInvocationResultsResponse.PageSize"));

		List<InvocationResult> invocationResults = new ArrayList<InvocationResult>();
		for (int i = 0; i < _ctx.lengthValue("ListInvocationResultsResponse.InvocationResults.Length"); i++) {
			InvocationResult invocationResult = new InvocationResult();
			invocationResult.setSuccess(_ctx.booleanValue("ListInvocationResultsResponse.InvocationResults["+ i +"].Success"));
			invocationResult.setCommandId(_ctx.stringValue("ListInvocationResultsResponse.InvocationResults["+ i +"].CommandId"));
			invocationResult.setInstanceId(_ctx.stringValue("ListInvocationResultsResponse.InvocationResults["+ i +"].InstanceId"));
			invocationResult.setInvokeRecordStatus(_ctx.stringValue("ListInvocationResultsResponse.InvocationResults["+ i +"].InvokeRecordStatus"));
			invocationResult.setFinishedTime(_ctx.stringValue("ListInvocationResultsResponse.InvocationResults["+ i +"].FinishedTime"));
			invocationResult.setExitCode(_ctx.integerValue("ListInvocationResultsResponse.InvocationResults["+ i +"].ExitCode"));
			invocationResult.setMessage(_ctx.stringValue("ListInvocationResultsResponse.InvocationResults["+ i +"].Message"));

			invocationResults.add(invocationResult);
		}
		listInvocationResultsResponse.setInvocationResults(invocationResults);
	 
	 	return listInvocationResultsResponse;
	}
}