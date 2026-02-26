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

import com.aliyuncs.csas.model.v20230120.GetDynamicRouteResponse;
import com.aliyuncs.csas.model.v20230120.GetDynamicRouteResponse.DynamicRoute;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetDynamicRouteResponseUnmarshaller {

	public static GetDynamicRouteResponse unmarshall(GetDynamicRouteResponse getDynamicRouteResponse, UnmarshallerContext _ctx) {
		
		getDynamicRouteResponse.setRequestId(_ctx.stringValue("GetDynamicRouteResponse.RequestId"));

		DynamicRoute dynamicRoute = new DynamicRoute();
		dynamicRoute.setDynamicRouteId(_ctx.stringValue("GetDynamicRouteResponse.DynamicRoute.DynamicRouteId"));
		dynamicRoute.setName(_ctx.stringValue("GetDynamicRouteResponse.DynamicRoute.Name"));
		dynamicRoute.setDescription(_ctx.stringValue("GetDynamicRouteResponse.DynamicRoute.Description"));
		dynamicRoute.setStatus(_ctx.stringValue("GetDynamicRouteResponse.DynamicRoute.Status"));
		dynamicRoute.setPriority(_ctx.integerValue("GetDynamicRouteResponse.DynamicRoute.Priority"));
		dynamicRoute.setApplicationType(_ctx.stringValue("GetDynamicRouteResponse.DynamicRoute.ApplicationType"));
		dynamicRoute.setDynamicRouteType(_ctx.stringValue("GetDynamicRouteResponse.DynamicRoute.DynamicRouteType"));
		dynamicRoute.setNextHop(_ctx.stringValue("GetDynamicRouteResponse.DynamicRoute.NextHop"));
		dynamicRoute.setCreateTime(_ctx.stringValue("GetDynamicRouteResponse.DynamicRoute.CreateTime"));

		List<String> regionIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDynamicRouteResponse.DynamicRoute.RegionIds.Length"); i++) {
			regionIds.add(_ctx.stringValue("GetDynamicRouteResponse.DynamicRoute.RegionIds["+ i +"]"));
		}
		dynamicRoute.setRegionIds(regionIds);

		List<String> applicationIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDynamicRouteResponse.DynamicRoute.ApplicationIds.Length"); i++) {
			applicationIds.add(_ctx.stringValue("GetDynamicRouteResponse.DynamicRoute.ApplicationIds["+ i +"]"));
		}
		dynamicRoute.setApplicationIds(applicationIds);

		List<String> tagIds = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("GetDynamicRouteResponse.DynamicRoute.TagIds.Length"); i++) {
			tagIds.add(_ctx.stringValue("GetDynamicRouteResponse.DynamicRoute.TagIds["+ i +"]"));
		}
		dynamicRoute.setTagIds(tagIds);
		getDynamicRouteResponse.setDynamicRoute(dynamicRoute);
	 
	 	return getDynamicRouteResponse;
	}
}