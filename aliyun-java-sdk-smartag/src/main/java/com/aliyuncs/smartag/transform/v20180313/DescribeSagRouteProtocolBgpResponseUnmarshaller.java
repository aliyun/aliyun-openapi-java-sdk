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

import com.aliyuncs.smartag.model.v20180313.DescribeSagRouteProtocolBgpResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagRouteProtocolBgpResponse.TaskState;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagRouteProtocolBgpResponseUnmarshaller {

	public static DescribeSagRouteProtocolBgpResponse unmarshall(DescribeSagRouteProtocolBgpResponse describeSagRouteProtocolBgpResponse, UnmarshallerContext _ctx) {
		
		describeSagRouteProtocolBgpResponse.setRequestId(_ctx.stringValue("DescribeSagRouteProtocolBgpResponse.RequestId"));
		describeSagRouteProtocolBgpResponse.setHoldTime(_ctx.integerValue("DescribeSagRouteProtocolBgpResponse.HoldTime"));
		describeSagRouteProtocolBgpResponse.setKeepAlive(_ctx.integerValue("DescribeSagRouteProtocolBgpResponse.KeepAlive"));
		describeSagRouteProtocolBgpResponse.setLocalAs(_ctx.integerValue("DescribeSagRouteProtocolBgpResponse.LocalAs"));
		describeSagRouteProtocolBgpResponse.setRouterId(_ctx.stringValue("DescribeSagRouteProtocolBgpResponse.RouterId"));
		describeSagRouteProtocolBgpResponse.setAdvertiseIps(_ctx.stringValue("DescribeSagRouteProtocolBgpResponse.AdvertiseIps"));

		List<TaskState> taskStates = new ArrayList<TaskState>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagRouteProtocolBgpResponse.TaskStates.Length"); i++) {
			TaskState taskState = new TaskState();
			taskState.setErrorMessage(_ctx.stringValue("DescribeSagRouteProtocolBgpResponse.TaskStates["+ i +"].ErrorMessage"));
			taskState.setState(_ctx.stringValue("DescribeSagRouteProtocolBgpResponse.TaskStates["+ i +"].State"));
			taskState.setErrorCode(_ctx.stringValue("DescribeSagRouteProtocolBgpResponse.TaskStates["+ i +"].ErrorCode"));
			taskState.setCreateTime(_ctx.stringValue("DescribeSagRouteProtocolBgpResponse.TaskStates["+ i +"].CreateTime"));

			taskStates.add(taskState);
		}
		describeSagRouteProtocolBgpResponse.setTaskStates(taskStates);
	 
	 	return describeSagRouteProtocolBgpResponse;
	}
}