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

	public static DescribeRouterInterfacesResponse unmarshall(DescribeRouterInterfacesResponse describeRouterInterfacesResponse, UnmarshallerContext _ctx) {
		
		describeRouterInterfacesResponse.setRequestId(_ctx.stringValue("DescribeRouterInterfacesResponse.RequestId"));
		describeRouterInterfacesResponse.setPageNumber(_ctx.integerValue("DescribeRouterInterfacesResponse.PageNumber"));
		describeRouterInterfacesResponse.setPageSize(_ctx.integerValue("DescribeRouterInterfacesResponse.PageSize"));
		describeRouterInterfacesResponse.setTotalCount(_ctx.integerValue("DescribeRouterInterfacesResponse.TotalCount"));

		List<RouterInterfaceType> routerInterfaceSet = new ArrayList<RouterInterfaceType>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRouterInterfacesResponse.RouterInterfaceSet.Length"); i++) {
			RouterInterfaceType routerInterfaceType = new RouterInterfaceType();
			routerInterfaceType.setReservationActiveTime(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].ReservationActiveTime"));
			routerInterfaceType.setHealthCheckTargetIp(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].HealthCheckTargetIp"));
			routerInterfaceType.setStatus(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Status"));
			routerInterfaceType.setCreationTime(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].CreationTime"));
			routerInterfaceType.setReservationOrderType(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].ReservationOrderType"));
			routerInterfaceType.setOppositeInterfaceId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceId"));
			routerInterfaceType.setSpec(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Spec"));
			routerInterfaceType.setChargeType(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].ChargeType"));
			routerInterfaceType.setRouterInterfaceId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].RouterInterfaceId"));
			routerInterfaceType.setHcThreshold(_ctx.integerValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].HcThreshold"));
			routerInterfaceType.setOppositeRouterType(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeRouterType"));
			routerInterfaceType.setVpcInstanceId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].VpcInstanceId"));
			routerInterfaceType.setOppositeInterfaceOwnerId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceOwnerId"));
			routerInterfaceType.setOppositeVpcInstanceId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeVpcInstanceId"));
			routerInterfaceType.setReservationInternetChargeType(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].ReservationInternetChargeType"));
			routerInterfaceType.setCrossBorder(_ctx.booleanValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].CrossBorder"));
			routerInterfaceType.setBandwidth(_ctx.integerValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Bandwidth"));
			routerInterfaceType.setDescription(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Description"));
			routerInterfaceType.setHcRate(_ctx.integerValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].HcRate"));
			routerInterfaceType.setReservationBandwidth(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].ReservationBandwidth"));
			routerInterfaceType.setName(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Name"));
			routerInterfaceType.setOppositeRouterId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeRouterId"));
			routerInterfaceType.setOppositeInterfaceSpec(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceSpec"));
			routerInterfaceType.setRouterId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].RouterId"));
			routerInterfaceType.setOppositeInterfaceBusinessStatus(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceBusinessStatus"));
			routerInterfaceType.setConnectedTime(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].ConnectedTime"));
			routerInterfaceType.setHealthCheckSourceIp(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].HealthCheckSourceIp"));
			routerInterfaceType.setOppositeInterfaceStatus(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeInterfaceStatus"));
			routerInterfaceType.setEndTime(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].EndTime"));
			routerInterfaceType.setOppositeRegionId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeRegionId"));
			routerInterfaceType.setOppositeAccessPointId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeAccessPointId"));
			routerInterfaceType.setBusinessStatus(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].BusinessStatus"));
			routerInterfaceType.setOppositeBandwidth(_ctx.integerValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].OppositeBandwidth"));
			routerInterfaceType.setRouterType(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].RouterType"));
			routerInterfaceType.setRole(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Role"));
			routerInterfaceType.setHasReservationData(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].HasReservationData"));
			routerInterfaceType.setAccessPointId(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].AccessPointId"));
			routerInterfaceType.setIpv6Status(_ctx.stringValue("DescribeRouterInterfacesResponse.RouterInterfaceSet["+ i +"].Ipv6Status"));

			routerInterfaceSet.add(routerInterfaceType);
		}
		describeRouterInterfacesResponse.setRouterInterfaceSet(routerInterfaceSet);
	 
	 	return describeRouterInterfacesResponse;
	}
}