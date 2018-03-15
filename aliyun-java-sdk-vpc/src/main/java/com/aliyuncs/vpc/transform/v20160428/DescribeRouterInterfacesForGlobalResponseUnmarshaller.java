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

import com.aliyuncs.vpc.model.v20160428.DescribeRouterInterfacesForGlobalResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeRouterInterfacesForGlobalResponse.RouterInterfaceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRouterInterfacesForGlobalResponseUnmarshaller {

	public static DescribeRouterInterfacesForGlobalResponse unmarshall(DescribeRouterInterfacesForGlobalResponse describeRouterInterfacesForGlobalResponse, UnmarshallerContext context) {
		
		describeRouterInterfacesForGlobalResponse.setRequestId(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RequestId"));
		describeRouterInterfacesForGlobalResponse.setCode(context.stringValue("DescribeRouterInterfacesForGlobalResponse.Code"));
		describeRouterInterfacesForGlobalResponse.setMessage(context.stringValue("DescribeRouterInterfacesForGlobalResponse.Message"));
		describeRouterInterfacesForGlobalResponse.setDesc(context.stringValue("DescribeRouterInterfacesForGlobalResponse.desc"));
		describeRouterInterfacesForGlobalResponse.setSuccess(context.booleanValue("DescribeRouterInterfacesForGlobalResponse.Success"));
		describeRouterInterfacesForGlobalResponse.setPageSize(context.integerValue("DescribeRouterInterfacesForGlobalResponse.PageSize"));
		describeRouterInterfacesForGlobalResponse.setPageNumber(context.integerValue("DescribeRouterInterfacesForGlobalResponse.PageNumber"));
		describeRouterInterfacesForGlobalResponse.setTotalCount(context.integerValue("DescribeRouterInterfacesForGlobalResponse.TotalCount"));

		List<RouterInterfaceType> routerInterfaceSet = new ArrayList<RouterInterfaceType>();
		for (int i = 0; i < context.lengthValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet.Length"); i++) {
			RouterInterfaceType routerInterfaceType = new RouterInterfaceType();
			routerInterfaceType.setBusinessStatus(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].BusinessStatus"));
			routerInterfaceType.setAccessPointId(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].AccessPointId"));
			routerInterfaceType.setChargeType(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].ChargeType"));
			routerInterfaceType.setConnectedTime(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].ConnectedTime"));
			routerInterfaceType.setCreationTime(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].CreationTime"));
			routerInterfaceType.setRouterInterfaceId(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].RouterInterfaceId"));
			routerInterfaceType.setOppositeInterfaceBusinessStatus(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceBusinessStatus"));
			routerInterfaceType.setOppositeInterfaceId(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceId"));
			routerInterfaceType.setOppositeInterfaceOwnerId(context.longValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceOwnerId"));
			routerInterfaceType.setOppositeInterfaceSpec(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceSpec"));
			routerInterfaceType.setOppositeInterfaceStatus(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceStatus"));
			routerInterfaceType.setOppositeRegionId(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].OppositeRegionId"));
			routerInterfaceType.setOppositeAccessPointId(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].OppositeAccessPointId"));
			routerInterfaceType.setOppositeRouterId(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].OppositeRouterId"));
			routerInterfaceType.setOppositeRouterType(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].OppositeRouterType"));
			routerInterfaceType.setOppositeVpcInstanceId(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].OppositeVpcInstanceId"));
			routerInterfaceType.setRegionId(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].RegionId"));
			routerInterfaceType.setRole(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].Role"));
			routerInterfaceType.setRouterId(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].RouterId"));
			routerInterfaceType.setRouterType(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].RouterType"));
			routerInterfaceType.setSpec(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].Spec"));
			routerInterfaceType.setStatus(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].Status"));
			routerInterfaceType.setVpcInstanceId(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].VpcInstanceId"));
			routerInterfaceType.setName(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].Name"));
			routerInterfaceType.setDescription(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].Description"));
			routerInterfaceType.setHealthCheckSourceIp(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].HealthCheckSourceIp"));
			routerInterfaceType.setHealthCheckTargetIp(context.stringValue("DescribeRouterInterfacesForGlobalResponse.RouterInterfaceSet["+ i +"].HealthCheckTargetIp"));

			routerInterfaceSet.add(routerInterfaceType);
		}
		describeRouterInterfacesForGlobalResponse.setRouterInterfaceSet(routerInterfaceSet);
	 
	 	return describeRouterInterfacesForGlobalResponse;
	}
}