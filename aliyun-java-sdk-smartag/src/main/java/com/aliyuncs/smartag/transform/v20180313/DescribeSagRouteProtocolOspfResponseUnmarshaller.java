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

package com.aliyuncs.smartag.transform.v20180313;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.smartag.model.v20180313.DescribeSagRouteProtocolOspfResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagRouteProtocolOspfResponse.TaskState;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagRouteProtocolOspfResponseUnmarshaller {

	public static DescribeSagRouteProtocolOspfResponse unmarshall(DescribeSagRouteProtocolOspfResponse describeSagRouteProtocolOspfResponse, UnmarshallerContext _ctx) {
		
		describeSagRouteProtocolOspfResponse.setRequestId(_ctx.stringValue("DescribeSagRouteProtocolOspfResponse.RequestId"));
		describeSagRouteProtocolOspfResponse.setRouterId(_ctx.stringValue("DescribeSagRouteProtocolOspfResponse.RouterId"));
		describeSagRouteProtocolOspfResponse.setAreaId(_ctx.stringValue("DescribeSagRouteProtocolOspfResponse.AreaId"));
		describeSagRouteProtocolOspfResponse.setAreaType(_ctx.stringValue("DescribeSagRouteProtocolOspfResponse.AreaType"));
		describeSagRouteProtocolOspfResponse.setDeadTime(_ctx.integerValue("DescribeSagRouteProtocolOspfResponse.DeadTime"));
		describeSagRouteProtocolOspfResponse.setHelloTime(_ctx.integerValue("DescribeSagRouteProtocolOspfResponse.HelloTime"));
		describeSagRouteProtocolOspfResponse.setAuthenticationType(_ctx.stringValue("DescribeSagRouteProtocolOspfResponse.AuthenticationType"));
		describeSagRouteProtocolOspfResponse.setMd5KeyId(_ctx.integerValue("DescribeSagRouteProtocolOspfResponse.Md5KeyId"));
		describeSagRouteProtocolOspfResponse.setMd5Key(_ctx.stringValue("DescribeSagRouteProtocolOspfResponse.Md5Key"));

		List<TaskState> taskStates = new ArrayList<TaskState>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagRouteProtocolOspfResponse.TaskStates.Length"); i++) {
			TaskState taskState = new TaskState();
			taskState.setState(_ctx.stringValue("DescribeSagRouteProtocolOspfResponse.TaskStates["+ i +"].State"));
			taskState.setErrorCode(_ctx.stringValue("DescribeSagRouteProtocolOspfResponse.TaskStates["+ i +"].ErrorCode"));
			taskState.setErrorMessage(_ctx.stringValue("DescribeSagRouteProtocolOspfResponse.TaskStates["+ i +"].ErrorMessage"));
			taskState.setCreateTime(_ctx.stringValue("DescribeSagRouteProtocolOspfResponse.TaskStates["+ i +"].CreateTime"));

			taskStates.add(taskState);
		}
		describeSagRouteProtocolOspfResponse.setTaskStates(taskStates);
	 
	 	return describeSagRouteProtocolOspfResponse;
	}
}