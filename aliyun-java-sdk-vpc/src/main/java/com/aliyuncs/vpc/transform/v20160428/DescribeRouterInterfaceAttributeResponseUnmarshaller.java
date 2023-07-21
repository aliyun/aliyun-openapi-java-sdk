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

import com.aliyuncs.vpc.model.v20160428.DescribeRouterInterfaceAttributeResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeRouterInterfaceAttributeResponse.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRouterInterfaceAttributeResponseUnmarshaller {

	public static DescribeRouterInterfaceAttributeResponse unmarshall(DescribeRouterInterfaceAttributeResponse describeRouterInterfaceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeRouterInterfaceAttributeResponse.setRequestId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.RequestId"));
		describeRouterInterfaceAttributeResponse.setReservationActiveTime(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.ReservationActiveTime"));
		describeRouterInterfaceAttributeResponse.setHealthCheckTargetIp(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.HealthCheckTargetIp"));
		describeRouterInterfaceAttributeResponse.setStatus(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Status"));
		describeRouterInterfaceAttributeResponse.setCreationTime(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.CreationTime"));
		describeRouterInterfaceAttributeResponse.setReservationOrderType(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.ReservationOrderType"));
		describeRouterInterfaceAttributeResponse.setOppositeInterfaceId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeInterfaceId"));
		describeRouterInterfaceAttributeResponse.setSpec(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Spec"));
		describeRouterInterfaceAttributeResponse.setChargeType(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.ChargeType"));
		describeRouterInterfaceAttributeResponse.setRouterInterfaceId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.RouterInterfaceId"));
		describeRouterInterfaceAttributeResponse.setMessage(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Message"));
		describeRouterInterfaceAttributeResponse.setHcThreshold(_ctx.integerValue("DescribeRouterInterfaceAttributeResponse.HcThreshold"));
		describeRouterInterfaceAttributeResponse.setOppositeRouterType(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeRouterType"));
		describeRouterInterfaceAttributeResponse.setGmtModified(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.GmtModified"));
		describeRouterInterfaceAttributeResponse.setVpcInstanceId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.VpcInstanceId"));
		describeRouterInterfaceAttributeResponse.setOppositeInterfaceOwnerId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeInterfaceOwnerId"));
		describeRouterInterfaceAttributeResponse.setOppositeVpcInstanceId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeVpcInstanceId"));
		describeRouterInterfaceAttributeResponse.setReservationInternetChargeType(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.ReservationInternetChargeType"));
		describeRouterInterfaceAttributeResponse.setCrossBorder(_ctx.booleanValue("DescribeRouterInterfaceAttributeResponse.CrossBorder"));
		describeRouterInterfaceAttributeResponse.setBandwidth(_ctx.integerValue("DescribeRouterInterfaceAttributeResponse.Bandwidth"));
		describeRouterInterfaceAttributeResponse.setDescription(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Description"));
		describeRouterInterfaceAttributeResponse.setHcRate(_ctx.integerValue("DescribeRouterInterfaceAttributeResponse.HcRate"));
		describeRouterInterfaceAttributeResponse.setReservationBandwidth(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.ReservationBandwidth"));
		describeRouterInterfaceAttributeResponse.setCode(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Code"));
		describeRouterInterfaceAttributeResponse.setName(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Name"));
		describeRouterInterfaceAttributeResponse.setOppositeRouterId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeRouterId"));
		describeRouterInterfaceAttributeResponse.setOppositeInterfaceSpec(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeInterfaceSpec"));
		describeRouterInterfaceAttributeResponse.setRouterId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.RouterId"));
		describeRouterInterfaceAttributeResponse.setSuccess(_ctx.booleanValue("DescribeRouterInterfaceAttributeResponse.Success"));
		describeRouterInterfaceAttributeResponse.setOppositeInterfaceBusinessStatus(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeInterfaceBusinessStatus"));
		describeRouterInterfaceAttributeResponse.setConnectedTime(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.ConnectedTime"));
		describeRouterInterfaceAttributeResponse.setHealthCheckSourceIp(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.HealthCheckSourceIp"));
		describeRouterInterfaceAttributeResponse.setOppositeInterfaceStatus(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeInterfaceStatus"));
		describeRouterInterfaceAttributeResponse.setEndTime(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.EndTime"));
		describeRouterInterfaceAttributeResponse.setOppositeRegionId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeRegionId"));
		describeRouterInterfaceAttributeResponse.setOppositeAccessPointId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.OppositeAccessPointId"));
		describeRouterInterfaceAttributeResponse.setBusinessStatus(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.BusinessStatus"));
		describeRouterInterfaceAttributeResponse.setHealthCheckStatus(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.HealthCheckStatus"));
		describeRouterInterfaceAttributeResponse.setOppositeBandwidth(_ctx.integerValue("DescribeRouterInterfaceAttributeResponse.OppositeBandwidth"));
		describeRouterInterfaceAttributeResponse.setRouterType(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.RouterType"));
		describeRouterInterfaceAttributeResponse.setRole(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Role"));
		describeRouterInterfaceAttributeResponse.setHasReservationData(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.HasReservationData"));
		describeRouterInterfaceAttributeResponse.setAccessPointId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.AccessPointId"));
		describeRouterInterfaceAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.ResourceGroupId"));

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRouterInterfaceAttributeResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setKey(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Tags["+ i +"].Key"));
			tagsItem.setValue(_ctx.stringValue("DescribeRouterInterfaceAttributeResponse.Tags["+ i +"].Value"));

			tags.add(tagsItem);
		}
		describeRouterInterfaceAttributeResponse.setTags(tags);
	 
	 	return describeRouterInterfaceAttributeResponse;
	}
}