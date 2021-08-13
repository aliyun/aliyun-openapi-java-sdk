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

import com.aliyuncs.smartag.model.v20180313.DescribeSagStaticRouteListResponse;
import com.aliyuncs.smartag.model.v20180313.DescribeSagStaticRouteListResponse.StaticRoute;
import com.aliyuncs.smartag.model.v20180313.DescribeSagStaticRouteListResponse.TaskState;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSagStaticRouteListResponseUnmarshaller {

	public static DescribeSagStaticRouteListResponse unmarshall(DescribeSagStaticRouteListResponse describeSagStaticRouteListResponse, UnmarshallerContext _ctx) {
		
		describeSagStaticRouteListResponse.setRequestId(_ctx.stringValue("DescribeSagStaticRouteListResponse.RequestId"));

		List<StaticRoute> staticRoutes = new ArrayList<StaticRoute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagStaticRouteListResponse.StaticRoutes.Length"); i++) {
			StaticRoute staticRoute = new StaticRoute();
			staticRoute.setNextHop(_ctx.stringValue("DescribeSagStaticRouteListResponse.StaticRoutes["+ i +"].NextHop"));
			staticRoute.setDestinationCidr(_ctx.stringValue("DescribeSagStaticRouteListResponse.StaticRoutes["+ i +"].DestinationCidr"));
			staticRoute.setPortName(_ctx.stringValue("DescribeSagStaticRouteListResponse.StaticRoutes["+ i +"].PortName"));
			staticRoute.setVlan(_ctx.stringValue("DescribeSagStaticRouteListResponse.StaticRoutes["+ i +"].Vlan"));

			staticRoutes.add(staticRoute);
		}
		describeSagStaticRouteListResponse.setStaticRoutes(staticRoutes);

		List<TaskState> taskStates = new ArrayList<TaskState>();
		for (int i = 0; i < _ctx.lengthValue("DescribeSagStaticRouteListResponse.TaskStates.Length"); i++) {
			TaskState taskState = new TaskState();
			taskState.setErrorMessage(_ctx.stringValue("DescribeSagStaticRouteListResponse.TaskStates["+ i +"].ErrorMessage"));
			taskState.setState(_ctx.stringValue("DescribeSagStaticRouteListResponse.TaskStates["+ i +"].State"));
			taskState.setErrorCode(_ctx.stringValue("DescribeSagStaticRouteListResponse.TaskStates["+ i +"].ErrorCode"));
			taskState.setCreateTime(_ctx.stringValue("DescribeSagStaticRouteListResponse.TaskStates["+ i +"].CreateTime"));

			taskStates.add(taskState);
		}
		describeSagStaticRouteListResponse.setTaskStates(taskStates);
	 
	 	return describeSagStaticRouteListResponse;
	}
}