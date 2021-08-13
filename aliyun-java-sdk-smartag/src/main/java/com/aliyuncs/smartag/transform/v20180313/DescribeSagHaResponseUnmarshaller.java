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

import com.aliyuncs.smartag.model.v20180313.DescribeSagHaResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagHaResponse.Port;
import com.aliyuncs.smartag.model.v20180313.DescribeSagHaResponse.TaskState;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagHaResponseUnmarshaller {

	public static DescribeSagHaResponse unmarshall(DescribeSagHaResponse describeSagHaResponse, UnmarshallerContext _ctx) {
		
		describeSagHaResponse.setRequestId(_ctx.stringValue("DescribeSagHaResponse.RequestId"));
		describeSagHaResponse.setMode(_ctx.stringValue("DescribeSagHaResponse.Mode"));

		List<Port> ports = new ArrayList<Port>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagHaResponse.Ports.Length"); i++) {
			Port port = new Port();
			port.setPortName(_ctx.stringValue("DescribeSagHaResponse.Ports["+ i +"].PortName"));
			port.setVirtualIp(_ctx.stringValue("DescribeSagHaResponse.Ports["+ i +"].VirtualIp"));

			ports.add(port);
		}
		describeSagHaResponse.setPorts(ports);

		List<TaskState> taskStates = new ArrayList<TaskState>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagHaResponse.TaskStates.Length"); i++) {
			TaskState taskState = new TaskState();
			taskState.setErrorMessage(_ctx.stringValue("DescribeSagHaResponse.TaskStates["+ i +"].ErrorMessage"));
			taskState.setState(_ctx.stringValue("DescribeSagHaResponse.TaskStates["+ i +"].State"));
			taskState.setErrorCode(_ctx.stringValue("DescribeSagHaResponse.TaskStates["+ i +"].ErrorCode"));
			taskState.setCreateTime(_ctx.stringValue("DescribeSagHaResponse.TaskStates["+ i +"].CreateTime"));

			taskStates.add(taskState);
		}
		describeSagHaResponse.setTaskStates(taskStates);
	 
	 	return describeSagHaResponse;
	}
}