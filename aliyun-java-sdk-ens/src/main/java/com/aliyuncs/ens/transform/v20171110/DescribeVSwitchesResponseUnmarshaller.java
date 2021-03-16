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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.DescribeVSwitchesResponse;
import com.aliyuncs.ens.model.v20171110.DescribeVSwitchesResponse.VSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVSwitchesResponseUnmarshaller {

	public static DescribeVSwitchesResponse unmarshall(DescribeVSwitchesResponse describeVSwitchesResponse, UnmarshallerContext _ctx) {
		
		describeVSwitchesResponse.setRequestId(_ctx.stringValue("DescribeVSwitchesResponse.RequestId"));
		describeVSwitchesResponse.setTotalCount(_ctx.integerValue("DescribeVSwitchesResponse.TotalCount"));
		describeVSwitchesResponse.setPageSize(_ctx.integerValue("DescribeVSwitchesResponse.PageSize"));
		describeVSwitchesResponse.setPageNumber(_ctx.integerValue("DescribeVSwitchesResponse.PageNumber"));

		List<VSwitch> vSwitches = new ArrayList<VSwitch>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVSwitchesResponse.VSwitches.Length"); i++) {
			VSwitch vSwitch = new VSwitch();
			vSwitch.setStatus(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].Status"));
			vSwitch.setFreeIpCount(_ctx.longValue("DescribeVSwitchesResponse.VSwitches["+ i +"].FreeIpCount"));
			vSwitch.setCreatedTime(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].CreatedTime"));
			vSwitch.setVSwitchId(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].VSwitchId"));
			vSwitch.setCidrBlock(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].CidrBlock"));
			vSwitch.setVSwitchName(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].VSwitchName"));
			vSwitch.setEnsRegionId(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches["+ i +"].EnsRegionId"));

			vSwitches.add(vSwitch);
		}
		describeVSwitchesResponse.setVSwitches(vSwitches);
	 
	 	return describeVSwitchesResponse;
	}
}