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

import com.aliyuncs.vpc.model.v20160428.DescribeVSwitchesResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeVSwitchesResponse.VSwitch;
import com.aliyuncs.vpc.model.v20160428.DescribeVSwitchesResponse.VSwitch.RouteTable;
import com.aliyuncs.vpc.model.v20160428.DescribeVSwitchesResponse.VSwitch.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVSwitchesResponseUnmarshaller {

	public static DescribeVSwitchesResponse unmarshall(DescribeVSwitchesResponse describeVSwitchesResponse, UnmarshallerContext context) {
		
		describeVSwitchesResponse.setRequestId(context.stringValue("DescribeVSwitchesResponse.RequestId"));
		describeVSwitchesResponse.setTotalCount(context.integerValue("DescribeVSwitchesResponse.TotalCount"));
		describeVSwitchesResponse.setPageNumber(context.integerValue("DescribeVSwitchesResponse.PageNumber"));
		describeVSwitchesResponse.setPageSize(context.integerValue("DescribeVSwitchesResponse.PageSize"));

		List<VSwitch> vSwitches = new ArrayList<VSwitch>();
		for (int i = 0; i < context.lengthValue("DescribeVSwitchesResponse.VSwitches.Length"); i++) {
			VSwitch vSwitch = new VSwitch();
			vSwitch.setVSwitchId(context.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].VSwitchId"));
			vSwitch.setVpcId(context.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].VpcId"));
			vSwitch.setStatus(context.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Status"));
			vSwitch.setCidrBlock(context.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].CidrBlock"));
			vSwitch.setIpv6CidrBlock(context.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Ipv6CidrBlock"));
			vSwitch.setZoneId(context.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].ZoneId"));
			vSwitch.setAvailableIpAddressCount(context.longValue("DescribeVSwitchesResponse.VSwitches["+ i +"].AvailableIpAddressCount"));
			vSwitch.setDescription(context.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Description"));
			vSwitch.setVSwitchName(context.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].VSwitchName"));
			vSwitch.setCreationTime(context.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].CreationTime"));
			vSwitch.setIsDefault(context.booleanValue("DescribeVSwitchesResponse.VSwitches["+ i +"].IsDefault"));
			vSwitch.setResourceGroupId(context.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].ResourceGroupId"));

			RouteTable routeTable = new RouteTable();
			routeTable.setRouteTableId(context.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].RouteTable.RouteTableId"));
			routeTable.setRouteTableType(context.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].RouteTable.RouteTableType"));
			vSwitch.setRouteTable(routeTable);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < context.lengthValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(context.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(context.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			vSwitch.setTags(tags);

			vSwitches.add(vSwitch);
		}
		describeVSwitchesResponse.setVSwitches(vSwitches);
	 
	 	return describeVSwitchesResponse;
	}
}