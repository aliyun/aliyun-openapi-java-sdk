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

package com.aliyuncs.csas.transform.v20230120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.csas.model.v20230120.ListDynamicRoutesResponse;
import com.aliyuncs.csas.model.v20230120.ListDynamicRoutesResponse.DynamicRoute;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListDynamicRoutesResponseUnmarshaller {

	public static ListDynamicRoutesResponse unmarshall(ListDynamicRoutesResponse listDynamicRoutesResponse, UnmarshallerContext _ctx) {
		
		listDynamicRoutesResponse.setRequestId(_ctx.stringValue("ListDynamicRoutesResponse.RequestId"));
		listDynamicRoutesResponse.setTotalNum(_ctx.integerValue("ListDynamicRoutesResponse.TotalNum"));

		List<DynamicRoute> dynamicRoutes = new ArrayList<DynamicRoute>();
		for (int i = 0; i < _ctx.lengthValue("ListDynamicRoutesResponse.DynamicRoutes.Length"); i++) {
			DynamicRoute dynamicRoute = new DynamicRoute();
			dynamicRoute.setDynamicRouteId(_ctx.stringValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].DynamicRouteId"));
			dynamicRoute.setName(_ctx.stringValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].Name"));
			dynamicRoute.setDescription(_ctx.stringValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].Description"));
			dynamicRoute.setStatus(_ctx.stringValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].Status"));
			dynamicRoute.setPriority(_ctx.integerValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].Priority"));
			dynamicRoute.setApplicationType(_ctx.stringValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].ApplicationType"));
			dynamicRoute.setDynamicRouteType(_ctx.stringValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].DynamicRouteType"));
			dynamicRoute.setNextHop(_ctx.stringValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].NextHop"));
			dynamicRoute.setCreateTime(_ctx.stringValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].CreateTime"));

			List<String> regionIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].RegionIds.Length"); j++) {
				regionIds.add(_ctx.stringValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].RegionIds["+ j +"]"));
			}
			dynamicRoute.setRegionIds(regionIds);

			List<String> applicationIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].ApplicationIds.Length"); j++) {
				applicationIds.add(_ctx.stringValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].ApplicationIds["+ j +"]"));
			}
			dynamicRoute.setApplicationIds(applicationIds);

			List<String> tagIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].TagIds.Length"); j++) {
				tagIds.add(_ctx.stringValue("ListDynamicRoutesResponse.DynamicRoutes["+ i +"].TagIds["+ j +"]"));
			}
			dynamicRoute.setTagIds(tagIds);

			dynamicRoutes.add(dynamicRoute);
		}
		listDynamicRoutesResponse.setDynamicRoutes(dynamicRoutes);
	 
	 	return listDynamicRoutesResponse;
	}
}