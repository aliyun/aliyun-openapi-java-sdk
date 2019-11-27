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

import com.aliyuncs.vpc.model.v20160428.DescribeRouterInterfaceAttributeResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRouterInterfaceAttributeResponseUnmarshaller {

	public static DescribeRouterInterfaceAttributeResponse unmarshall(DescribeRouterInterfaceAttributeResponse describeRouterInterfaceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeRouterInterfaceAttributeResponse.setRequestId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.RequestId"));
		describeRouterInterfaceAttributeResponse.setCode(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Code"));
		describeRouterInterfaceAttributeResponse.setMessage(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Message"));
		describeRouterInterfaceAttributeResponse.setSuccess(_ctx.booleanValue("DescribeRouterInterfaceAttributeResponse.Success"));
		describeRouterInterfaceAttributeResponse.setRouterInterfaceId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.RouterInterfaceId"));
		describeRouterInterfaceAttributeResponse.setOppositeRegionId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeRegionId"));
		describeRouterInterfaceAttributeResponse.setRole(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Role"));
		describeRouterInterfaceAttributeResponse.setSpec(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Spec"));
		describeRouterInterfaceAttributeResponse.setName(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Name"));
		describeRouterInterfaceAttributeResponse.setDescription(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Description"));
		describeRouterInterfaceAttributeResponse.setRouterId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.RouterId"));
		describeRouterInterfaceAttributeResponse.setRouterType(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.RouterType"));
		describeRouterInterfaceAttributeResponse.setCreationTime(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.CreationTime"));
		describeRouterInterfaceAttributeResponse.setGmtModified(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.GmtModified"));
		describeRouterInterfaceAttributeResponse.setEndTime(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.EndTime"));
		describeRouterInterfaceAttributeResponse.setChargeType(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.ChargeType"));
		describeRouterInterfaceAttributeResponse.setStatus(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Status"));
		describeRouterInterfaceAttributeResponse.setBusinessStatus(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.BusinessStatus"));
		describeRouterInterfaceAttributeResponse.setConnectedTime(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.ConnectedTime"));
		describeRouterInterfaceAttributeResponse.setOppositeInterfaceId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeInterfaceId"));
		describeRouterInterfaceAttributeResponse.setOppositeInterfaceSpec(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeInterfaceSpec"));
		describeRouterInterfaceAttributeResponse.setOppositeInterfaceStatus(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeInterfaceStatus"));
		describeRouterInterfaceAttributeResponse.setOppositeInterfaceBusinessStatus(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeInterfaceBusinessStatus"));
		describeRouterInterfaceAttributeResponse.setOppositeRouterId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeRouterId"));
		describeRouterInterfaceAttributeResponse.setOppositeRouterType(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeRouterType"));
		describeRouterInterfaceAttributeResponse.setOppositeInterfaceOwnerId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeInterfaceOwnerId"));
		describeRouterInterfaceAttributeResponse.setAccessPointId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.AccessPointId"));
		describeRouterInterfaceAttributeResponse.setOppositeAccessPointId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeAccessPointId"));
		describeRouterInterfaceAttributeResponse.setHealthCheckSourceIp(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.HealthCheckSourceIp"));
		describeRouterInterfaceAttributeResponse.setHealthCheckTargetIp(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.HealthCheckTargetIp"));
		describeRouterInterfaceAttributeResponse.setOppositeVpcInstanceId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeVpcInstanceId"));
		describeRouterInterfaceAttributeResponse.setBandwidth(_ctx.integerValue("DescribeRouterInterfaceAttributeResponse.Bandwidth"));
		describeRouterInterfaceAttributeResponse.setVpcInstanceId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.VpcInstanceId"));
		describeRouterInterfaceAttributeResponse.setOppositeBandwidth(_ctx.integerValue("DescribeRouterInterfaceAttributeResponse.OppositeBandwidth"));
		describeRouterInterfaceAttributeResponse.setHasReservationData(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.HasReservationData"));
		describeRouterInterfaceAttributeResponse.setReservationBandwidth(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.ReservationBandwidth"));
		describeRouterInterfaceAttributeResponse.setReservationInternetChargeType(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.ReservationInternetChargeType"));
		describeRouterInterfaceAttributeResponse.setReservationActiveTime(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.ReservationActiveTime"));
		describeRouterInterfaceAttributeResponse.setReservationOrderType(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.ReservationOrderType"));
		describeRouterInterfaceAttributeResponse.setCrossBorder(_ctx.booleanValue("DescribeRouterInterfaceAttributeResponse.CrossBorder"));
		describeRouterInterfaceAttributeResponse.setHcThreshold(_ctx.integerValue("DescribeRouterInterfaceAttributeResponse.HcThreshold"));
		describeRouterInterfaceAttributeResponse.setHcRate(_ctx.integerValue("DescribeRouterInterfaceAttributeResponse.HcRate"));
		describeRouterInterfaceAttributeResponse.setHealthCheckStatus(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.HealthCheckStatus"));
	 
	 	return describeRouterInterfaceAttributeResponse;
	}
}