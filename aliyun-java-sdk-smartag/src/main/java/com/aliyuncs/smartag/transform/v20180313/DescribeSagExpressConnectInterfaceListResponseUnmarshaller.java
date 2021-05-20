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

import com.aliyuncs.smartag.model.v20180313.DescribeSagExpressConnectInterfaceListResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagExpressConnectInterfaceListResponse.TaskState;
import com.aliyuncs.smartag.model.v20180313.DescribeSagExpressConnectInterfaceListResponse._Interface;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagExpressConnectInterfaceListResponseUnmarshaller {

	public static DescribeSagExpressConnectInterfaceListResponse unmarshall(DescribeSagExpressConnectInterfaceListResponse describeSagExpressConnectInterfaceListResponse, UnmarshallerContext _ctx) {
		
		describeSagExpressConnectInterfaceListResponse.setRequestId(_ctx.stringValue("DescribeSagExpressConnectInterfaceListResponse.RequestId"));

		List<_Interface> interfaces = new ArrayList<_Interface>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagExpressConnectInterfaceListResponse.Interfaces.Length"); i++) {
			_Interface _interface = new _Interface();
			_interface.setIP(_ctx.stringValue("DescribeSagExpressConnectInterfaceListResponse.Interfaces["+ i +"].IP"));
			_interface.setMask(_ctx.stringValue("DescribeSagExpressConnectInterfaceListResponse.Interfaces["+ i +"].Mask"));
			_interface.setVlan(_ctx.stringValue("DescribeSagExpressConnectInterfaceListResponse.Interfaces["+ i +"].Vlan"));

			interfaces.add(_interface);
		}
		describeSagExpressConnectInterfaceListResponse.setInterfaces(interfaces);

		List<TaskState> taskStates = new ArrayList<TaskState>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagExpressConnectInterfaceListResponse.TaskStates.Length"); i++) {
			TaskState taskState = new TaskState();
			taskState.setState(_ctx.stringValue("DescribeSagExpressConnectInterfaceListResponse.TaskStates["+ i +"].State"));
			taskState.setCreateTime(_ctx.stringValue("DescribeSagExpressConnectInterfaceListResponse.TaskStates["+ i +"].CreateTime"));
			taskState.setErrorCode(_ctx.stringValue("DescribeSagExpressConnectInterfaceListResponse.TaskStates["+ i +"].ErrorCode"));
			taskState.setErrorMessage(_ctx.stringValue("DescribeSagExpressConnectInterfaceListResponse.TaskStates["+ i +"].ErrorMessage"));

			taskStates.add(taskState);
		}
		describeSagExpressConnectInterfaceListResponse.setTaskStates(taskStates);
	 
	 	return describeSagExpressConnectInterfaceListResponse;
	}
}