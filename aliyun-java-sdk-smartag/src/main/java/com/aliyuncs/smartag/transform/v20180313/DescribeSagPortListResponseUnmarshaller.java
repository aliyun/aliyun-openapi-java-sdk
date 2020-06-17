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

import com.aliyuncs.smartag.model.v20180313.DescribeSagPortListResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagPortListResponse.Port;
import com.aliyuncs.smartag.model.v20180313.DescribeSagPortListResponse.TaskState;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagPortListResponseUnmarshaller {

	public static DescribeSagPortListResponse unmarshall(DescribeSagPortListResponse describeSagPortListResponse, UnmarshallerContext _ctx) {
		
		describeSagPortListResponse.setRequestId(_ctx.stringValue("DescribeSagPortListResponse.RequestId"));

		List<Port> ports = new ArrayList<Port>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagPortListResponse.Ports.Length"); i++) {
			Port port = new Port();
			port.setPortName(_ctx.stringValue("DescribeSagPortListResponse.Ports["+ i +"].PortName"));
			port.setRole(_ctx.stringValue("DescribeSagPortListResponse.Ports["+ i +"].Role"));
			port.setMac(_ctx.stringValue("DescribeSagPortListResponse.Ports["+ i +"].Mac"));
			port.setStatus(_ctx.stringValue("DescribeSagPortListResponse.Ports["+ i +"].Status"));

			ports.add(port);
		}
		describeSagPortListResponse.setPorts(ports);

		List<TaskState> taskStates = new ArrayList<TaskState>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagPortListResponse.TaskStates.Length"); i++) {
			TaskState taskState = new TaskState();
			taskState.setState(_ctx.stringValue("DescribeSagPortListResponse.TaskStates["+ i +"].State"));
			taskState.setErrorCode(_ctx.stringValue("DescribeSagPortListResponse.TaskStates["+ i +"].ErrorCode"));
			taskState.setErrorMessage(_ctx.stringValue("DescribeSagPortListResponse.TaskStates["+ i +"].ErrorMessage"));
			taskState.setCreateTime(_ctx.stringValue("DescribeSagPortListResponse.TaskStates["+ i +"].CreateTime"));

			taskStates.add(taskState);
		}
		describeSagPortListResponse.setTaskStates(taskStates);
	 
	 	return describeSagPortListResponse;
	}
}