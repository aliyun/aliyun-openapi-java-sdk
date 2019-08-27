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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeRouterInterfacesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeRouterInterfacesResponse.RouterInterfaceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRouterInterfacesResponseUnmarshaller {

	public static DescribeRouterInterfacesResponse unmarshall(DescribeRouterInterfacesResponse describeRouterInterfacesResponse, UnmarshallerContext _ctx) {
		
		describeRouterInterfacesResponse.setRequestId(_ctx.stringValue("DescribeRouterInterfacesResponse.RequestId"));
		describeRouterInterfacesResponse.setPageNumber(_ctx.integerValue("DescribeRouterInterfacesResponse.PageNumber"));
		describeRouterInterfacesResponse.setPageSize(_ctx.integerValue("DescribeRouterInterfacesResponse.PageSize"));
		describeRouterInterfacesResponse.setTotalCount(_ctx.integerValue("DescribeRouterInterfacesResponse.TotalCount"));

		List<RouterInterfaceType> routerInterfaceSet = new ArrayList<RouterInterfaceType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRouterInterfacesResponse.RouterInterfaceSet.Length"); i++) {
			RouterInterfaceType routerInterfaceType = new RouterInterfaceType();
			routerInterfaceType.setRouterInterfaceId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].RouterInterfaceId"));
			routerInterfaceType.setOppositeRegionId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeRegionId"));
			routerInterfaceType.setRole(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Role"));
			routerInterfaceType.setSpec(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Spec"));
			routerInterfaceType.setName(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Name"));
			routerInterfaceType.setDescription(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Description"));
			routerInterfaceType.setRouterId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].RouterId"));
			routerInterfaceType.setRouterType(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].RouterType"));
			routerInterfaceType.setCreationTime(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].CreationTime"));
			routerInterfaceType.setEndTime(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].EndTime"));
			routerInterfaceType.setChargeType(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].ChargeType"));
			routerInterfaceType.setStatus(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Status"));
			routerInterfaceType.setBusinessStatus(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].BusinessStatus"));
			routerInterfaceType.setConnectedTime(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].ConnectedTime"));
			routerInterfaceType.setOppositeInterfaceId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceId"));
			routerInterfaceType.setOppositeInterfaceSpec(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceSpec"));
			routerInterfaceType.setOppositeInterfaceStatus(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceStatus"));
			routerInterfaceType.setOppositeInterfaceBusinessStatus(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceBusinessStatus"));
			routerInterfaceType.setOppositeRouterId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeRouterId"));
			routerInterfaceType.setOppositeRouterType(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeRouterType"));
			routerInterfaceType.setOppositeInterfaceOwnerId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceOwnerId"));
			routerInterfaceType.setAccessPointId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].AccessPointId"));
			routerInterfaceType.setOppositeAccessPointId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeAccessPointId"));
			routerInterfaceType.setHealthCheckSourceIp(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].HealthCheckSourceIp"));
			routerInterfaceType.setHealthCheckTargetIp(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].HealthCheckTargetIp"));

			routerInterfaceSet.add(routerInterfaceType);
		}
		describeRouterInterfacesResponse.setRouterInterfaceSet(routerInterfaceSet);
	 
	 	return describeRouterInterfacesResponse;
	}
}