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

package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeVSwitchListResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeVSwitchListResponse.VSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVSwitchListResponseUnmarshaller {

	public static DescribeVSwitchListResponse unmarshall(DescribeVSwitchListResponse describeVSwitchListResponse, UnmarshallerContext _ctx) {
		
		describeVSwitchListResponse.setRequestId(_ctx.stringValue("DescribeVSwitchListResponse.RequestId"));
		describeVSwitchListResponse.setTotalCount(_ctx.integerValue("DescribeVSwitchListResponse.TotalCount"));
		describeVSwitchListResponse.setPageNumber(_ctx.integerValue("DescribeVSwitchListResponse.PageNumber"));
		describeVSwitchListResponse.setPageSize(_ctx.integerValue("DescribeVSwitchListResponse.PageSize"));

		List<VSwitch> vSwitchs = new ArrayList<VSwitch>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVSwitchListResponse.VSwitchs.Length"); i++) {
			VSwitch vSwitch = new VSwitch();
			vSwitch.setCidrBlock(_ctx.stringValue("DescribeVSwitchListResponse.VSwitchs["+ i +"].CidrBlock"));
			vSwitch.setDescription(_ctx.stringValue("DescribeVSwitchListResponse.VSwitchs["+ i +"].Description"));
			vSwitch.setIsDefault(_ctx.booleanValue("DescribeVSwitchListResponse.VSwitchs["+ i +"].IsDefault"));
			vSwitch.setIzNo(_ctx.stringValue("DescribeVSwitchListResponse.VSwitchs["+ i +"].IzNo"));
			vSwitch.setRegionNo(_ctx.stringValue("DescribeVSwitchListResponse.VSwitchs["+ i +"].RegionNo"));
			vSwitch.setStatus(_ctx.stringValue("DescribeVSwitchListResponse.VSwitchs["+ i +"].Status"));
			vSwitch.setVSwitchId(_ctx.stringValue("DescribeVSwitchListResponse.VSwitchs["+ i +"].VSwitchId"));
			vSwitch.setVSwitchName(_ctx.stringValue("DescribeVSwitchListResponse.VSwitchs["+ i +"].VSwitchName"));
			vSwitch.setAvailableIpAddressCount(_ctx.longValue("DescribeVSwitchListResponse.VSwitchs["+ i +"].AvailableIpAddressCount"));
			vSwitch.setVpcId(_ctx.stringValue("DescribeVSwitchListResponse.VSwitchs["+ i +"].VpcId"));
			vSwitch.setShareType(_ctx.stringValue("DescribeVSwitchListResponse.VSwitchs["+ i +"].ShareType"));
			vSwitch.setResourceGroupId(_ctx.stringValue("DescribeVSwitchListResponse.VSwitchs["+ i +"].ResourceGroupId"));
			vSwitch.setOwnerId(_ctx.stringValue("DescribeVSwitchListResponse.VSwitchs["+ i +"].OwnerId"));

			vSwitchs.add(vSwitch);
		}
		describeVSwitchListResponse.setVSwitchs(vSwitchs);
	 
	 	return describeVSwitchListResponse;
	}
}