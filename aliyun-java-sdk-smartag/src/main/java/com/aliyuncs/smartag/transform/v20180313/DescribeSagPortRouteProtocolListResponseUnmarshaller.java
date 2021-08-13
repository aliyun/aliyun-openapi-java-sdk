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

import com.aliyuncs.smartag.model.v20180313.DescribeSagPortRouteProtocolListResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagPortRouteProtocolListResponse.Port;
import com.aliyuncs.smartag.model.v20180313.DescribeSagPortRouteProtocolListResponse.TaskState;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagPortRouteProtocolListResponseUnmarshaller {

	public static DescribeSagPortRouteProtocolListResponse unmarshall(DescribeSagPortRouteProtocolListResponse describeSagPortRouteProtocolListResponse, UnmarshallerContext _ctx) {
		
		describeSagPortRouteProtocolListResponse.setRequestId(_ctx.stringValue("DescribeSagPortRouteProtocolListResponse.RequestId"));

		List<Port> ports = new ArrayList<Port>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagPortRouteProtocolListResponse.Ports.Length"); i++) {
			Port port = new Port();
			port.setStatus(_ctx.stringValue("DescribeSagPortRouteProtocolListResponse.Ports["+ i +"].Status"));
			port.setRemoteIp(_ctx.stringValue("DescribeSagPortRouteProtocolListResponse.Ports["+ i +"].RemoteIp"));
			port.setPortName(_ctx.stringValue("DescribeSagPortRouteProtocolListResponse.Ports["+ i +"].PortName"));
			port.setNeighborIp(_ctx.stringValue("DescribeSagPortRouteProtocolListResponse.Ports["+ i +"].NeighborIp"));
			port.setRouteProtocol(_ctx.stringValue("DescribeSagPortRouteProtocolListResponse.Ports["+ i +"].RouteProtocol"));
			port.setRemoteAs(_ctx.stringValue("DescribeSagPortRouteProtocolListResponse.Ports["+ i +"].RemoteAs"));
			port.setVlan(_ctx.stringValue("DescribeSagPortRouteProtocolListResponse.Ports["+ i +"].Vlan"));

			ports.add(port);
		}
		describeSagPortRouteProtocolListResponse.setPorts(ports);

		List<TaskState> taskStates = new ArrayList<TaskState>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagPortRouteProtocolListResponse.TaskStates.Length"); i++) {
			TaskState taskState = new TaskState();
			taskState.setErrorMessage(_ctx.stringValue("DescribeSagPortRouteProtocolListResponse.TaskStates["+ i +"].ErrorMessage"));
			taskState.setState(_ctx.stringValue("DescribeSagPortRouteProtocolListResponse.TaskStates["+ i +"].State"));
			taskState.setErrorCode(_ctx.stringValue("DescribeSagPortRouteProtocolListResponse.TaskStates["+ i +"].ErrorCode"));
			taskState.setCreateTime(_ctx.stringValue("DescribeSagPortRouteProtocolListResponse.TaskStates["+ i +"].CreateTime"));

			taskStates.add(taskState);
		}
		describeSagPortRouteProtocolListResponse.setTaskStates(taskStates);
	 
	 	return describeSagPortRouteProtocolListResponse;
	}
}