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

import com.aliyuncs.smartag.model.v20180313.DescribeSagGlobalRouteProtocolResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagGlobalRouteProtocolResponse.TaskState;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagGlobalRouteProtocolResponseUnmarshaller {

	public static DescribeSagGlobalRouteProtocolResponse unmarshall(DescribeSagGlobalRouteProtocolResponse describeSagGlobalRouteProtocolResponse, UnmarshallerContext _ctx) {
		
		describeSagGlobalRouteProtocolResponse.setRequestId(_ctx.stringValue("DescribeSagGlobalRouteProtocolResponse.RequestId"));
		describeSagGlobalRouteProtocolResponse.setRouteProtocol(_ctx.stringValue("DescribeSagGlobalRouteProtocolResponse.RouteProtocol"));

		List<TaskState> taskStates = new ArrayList<TaskState>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagGlobalRouteProtocolResponse.TaskStates.Length"); i++) {
			TaskState taskState = new TaskState();
			taskState.setState(_ctx.stringValue("DescribeSagGlobalRouteProtocolResponse.TaskStates["+ i +"].State"));
			taskState.setCreateTime(_ctx.stringValue("DescribeSagGlobalRouteProtocolResponse.TaskStates["+ i +"].CreateTime"));
			taskState.setErrorCode(_ctx.stringValue("DescribeSagGlobalRouteProtocolResponse.TaskStates["+ i +"].ErrorCode"));
			taskState.setErrorMessage(_ctx.stringValue("DescribeSagGlobalRouteProtocolResponse.TaskStates["+ i +"].ErrorMessage"));

			taskStates.add(taskState);
		}
		describeSagGlobalRouteProtocolResponse.setTaskStates(taskStates);
	 
	 	return describeSagGlobalRouteProtocolResponse;
	}
}