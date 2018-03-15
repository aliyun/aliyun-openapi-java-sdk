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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeRouterInterfacesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeRouterInterfacesResponse.RouterInterfaceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRouterInterfacesResponseUnmarshaller {

	public static DescribeRouterInterfacesResponse unmarshall(DescribeRouterInterfacesResponse describeRouterInterfacesResponse, UnmarshallerContext context) {
		
		describeRouterInterfacesResponse.setRequestId(context.stringValue("DescribeRouterInterfacesResponse.RequestId"));
		describeRouterInterfacesResponse.setPageNumber(context.integerValue("DescribeRouterInterfacesResponse.PageNumber"));
		describeRouterInterfacesResponse.setPageSize(context.integerValue("DescribeRouterInterfacesResponse.PageSize"));
		describeRouterInterfacesResponse.setTotalCount(context.integerValue("DescribeRouterInterfacesResponse.TotalCount"));

		List<RouterInterfaceType> routerInterfaceSet = new ArrayList<RouterInterfaceType>();
		for (int i = 0; i < context.lengthValue("DescribeRouterInterfacesResponse.RouterInterfaceSet.Length"); i++) {
			RouterInterfaceType routerInterfaceType = new RouterInterfaceType();
			routerInterfaceType.setRouterInterfaceId(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].RouterInterfaceId"));
			routerInterfaceType.setOppositeRegionId(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeRegionId"));
			routerInterfaceType.setRole(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Role"));
			routerInterfaceType.setSpec(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Spec"));
			routerInterfaceType.setName(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Name"));
			routerInterfaceType.setDescription(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Description"));
			routerInterfaceType.setRouterId(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].RouterId"));
			routerInterfaceType.setRouterType(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].RouterType"));
			routerInterfaceType.setCreationTime(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].CreationTime"));
			routerInterfaceType.setEndTime(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].EndTime"));
			routerInterfaceType.setChargeType(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].ChargeType"));
			routerInterfaceType.setStatus(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Status"));
			routerInterfaceType.setBusinessStatus(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].BusinessStatus"));
			routerInterfaceType.setConnectedTime(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].ConnectedTime"));
			routerInterfaceType.setOppositeInterfaceId(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceId"));
			routerInterfaceType.setOppositeInterfaceSpec(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceSpec"));
			routerInterfaceType.setOppositeInterfaceStatus(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceStatus"));
			routerInterfaceType.setOppositeInterfaceBusinessStatus(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceBusinessStatus"));
			routerInterfaceType.setOppositeRouterId(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeRouterId"));
			routerInterfaceType.setOppositeRouterType(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeRouterType"));
			routerInterfaceType.setOppositeInterfaceOwnerId(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceOwnerId"));
			routerInterfaceType.setAccessPointId(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].AccessPointId"));
			routerInterfaceType.setOppositeAccessPointId(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeAccessPointId"));
			routerInterfaceType.setHealthCheckSourceIp(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].HealthCheckSourceIp"));
			routerInterfaceType.setHealthCheckTargetIp(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].HealthCheckTargetIp"));
			routerInterfaceType.setOppositeVpcInstanceId(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeVpcInstanceId"));
			routerInterfaceType.setVpcInstanceId(context.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].VpcInstanceId"));

			routerInterfaceSet.add(routerInterfaceType);
		}
		describeRouterInterfacesResponse.setRouterInterfaceSet(routerInterfaceSet);
	 
	 	return describeRouterInterfacesResponse;
	}
}