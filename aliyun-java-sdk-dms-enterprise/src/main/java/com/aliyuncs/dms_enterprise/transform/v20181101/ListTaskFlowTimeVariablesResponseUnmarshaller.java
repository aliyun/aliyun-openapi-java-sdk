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

package com.aliyuncs.dms_enterprise.transform.v20181101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dms_enterprise.model.v20181101.ListTaskFlowTimeVariablesResponse;
import com.aliyuncs.dms_enterprise.model.v20181101.ListTaskFlowTimeVariablesResponse.TimeVariable;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListTaskFlowTimeVariablesResponseUnmarshaller {

	public static ListTaskFlowTimeVariablesResponse unmarshall(ListTaskFlowTimeVariablesResponse listTaskFlowTimeVariablesResponse, UnmarshallerContext _ctx) {
		
		listTaskFlowTimeVariablesResponse.setRequestId(_ctx.stringValue("ListTaskFlowTimeVariablesResponse.RequestId"));
		listTaskFlowTimeVariablesResponse.setErrorCode(_ctx.stringValue("ListTaskFlowTimeVariablesResponse.ErrorCode"));
		listTaskFlowTimeVariablesResponse.setErrorMessage(_ctx.stringValue("ListTaskFlowTimeVariablesResponse.ErrorMessage"));
		listTaskFlowTimeVariablesResponse.setSuccess(_ctx.booleanValue("ListTaskFlowTimeVariablesResponse.Success"));

		List<TimeVariable> timeVariables = new ArrayList<TimeVariable>();
		for (int i = 0; i < _ctx.lengthValue("ListTaskFlowTimeVariablesResponse.TimeVariables.Length"); i++) {
			TimeVariable timeVariable = new TimeVariable();
			timeVariable.setName(_ctx.stringValue("ListTaskFlowTimeVariablesResponse.TimeVariables["+ i +"].Name"));
			timeVariable.setPattern(_ctx.stringValue("ListTaskFlowTimeVariablesResponse.TimeVariables["+ i +"].Pattern"));

			timeVariables.add(timeVariable);
		}
		listTaskFlowTimeVariablesResponse.setTimeVariables(timeVariables);
	 
	 	return listTaskFlowTimeVariablesResponse;
	}
}