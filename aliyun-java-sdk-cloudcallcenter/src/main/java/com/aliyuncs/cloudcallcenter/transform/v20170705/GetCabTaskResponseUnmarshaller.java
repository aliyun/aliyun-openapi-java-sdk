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

import com.aliyuncs.cloudcallcenter.model.v20170705.GetCabTaskResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetCabTaskResponseUnmarshaller {

	public static GetCabTaskResponse unmarshall(GetCabTaskResponse getCabTaskResponse, UnmarshallerContext context) {
		
		getCabTaskResponse.setRequestId(context.stringValue("GetCabTaskResponse.RequestId"));
		getCabTaskResponse.setSuccess(context.booleanValue("GetCabTaskResponse.Success"));
		getCabTaskResponse.setCode(context.stringValue("GetCabTaskResponse.Code"));
		getCabTaskResponse.setMessage(context.stringValue("GetCabTaskResponse.Message"));
		getCabTaskResponse.setHttpStatusCode(context.integerValue("GetCabTaskResponse.HttpStatusCode"));
		getCabTaskResponse.setTaskId(context.stringValue("GetCabTaskResponse.TaskId"));
		getCabTaskResponse.setInstanceId(context.stringValue("GetCabTaskResponse.InstanceId"));
		getCabTaskResponse.setOwner(context.longValue("GetCabTaskResponse.Owner"));
		getCabTaskResponse.setCallee(context.stringValue("GetCabTaskResponse.Callee"));
		getCabTaskResponse.setCaller(context.stringValue("GetCabTaskResponse.Caller"));
		getCabTaskResponse.setScenarioId(context.stringValue("GetCabTaskResponse.ScenarioId"));
	 
	 	return getCabTaskResponse;
	}
}