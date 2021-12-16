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

	public static DescribeVSwitchesResponse unmarshall(DescribeVSwitchesResponse describeVSwitchesResponse, UnmarshallerContext _ctx) {
		
		describeVSwitchesResponse.setRequestId(_ctx.stringValue("DescribeVSwitchesResponse.RequestId"));
		describeVSwitchesResponse.setPageSize(_ctx.integerValue("DescribeVSwitchesResponse.PageSize"));
		describeVSwitchesResponse.setPageNumber(_ctx.integerValue("DescribeVSwitchesResponse.PageNumber"));
		describeVSwitchesResponse.setTotalCount(_ctx.integerValue("DescribeVSwitchesResponse.TotalCount"));

		List<VSwitch> vSwitches = new ArrayList<VSwitch>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVSwitchesResponse.VSwitches.Length"); i++) {
			VSwitch vSwitch = new VSwitch();
			vSwitch.setVpcId(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].VpcId"));
			vSwitch.setStatus(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Status"));
			vSwitch.setCreationTime(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].CreationTime"));
			vSwitch.setIsDefault(_ctx.booleanValue("DescribeVSwitchesResponse.VSwitches["+ i +"].IsDefault"));
			vSwitch.setAvailableIpAddressCount(_ctx.longValue("DescribeVSwitchesResponse.VSwitches["+ i +"].AvailableIpAddressCount"));
			vSwitch.setNetworkAclId(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].NetworkAclId"));
			vSwitch.setOwnerId(_ctx.longValue("DescribeVSwitchesResponse.VSwitches["+ i +"].OwnerId"));
			vSwitch.setVSwitchId(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].VSwitchId"));
			vSwitch.setCidrBlock(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].CidrBlock"));
			vSwitch.setDescription(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Description"));
			vSwitch.setResourceGroupId(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].ResourceGroupId"));
			vSwitch.setZoneId(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].ZoneId"));
			vSwitch.setIpv6CidrBlock(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Ipv6CidrBlock"));
			vSwitch.setVSwitchName(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].VSwitchName"));
			vSwitch.setShareType(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].ShareType"));

			RouteTable routeTable = new RouteTable();
			routeTable.setRouteTableId(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].RouteTable.RouteTableId"));
			routeTable.setRouteTableType(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].RouteTable.RouteTableType"));
			vSwitch.setRouteTable(routeTable);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			vSwitch.setTags(tags);

			vSwitches.add(vSwitch);
		}
		describeVSwitchesResponse.setVSwitches(vSwitches);
	 
	 	return describeVSwitchesResponse;
	}
}