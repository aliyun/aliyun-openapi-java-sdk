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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeVSwitchesResponse;
import com.aliyuncs.rds.model.v20140815.DescribeVSwitchesResponse.VSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVSwitchesResponseUnmarshaller {

	public static DescribeVSwitchesResponse unmarshall(DescribeVSwitchesResponse describeVSwitchesResponse, UnmarshallerContext _ctx) {
		
		describeVSwitchesResponse.setRequestId(_ctx.stringValue("DescribeVSwitchesResponse.RequestId"));
		describeVSwitchesResponse.setTotalCount(_ctx.integerValue("DescribeVSwitchesResponse.TotalCount"));
		describeVSwitchesResponse.setPageNumber(_ctx.integerValue("DescribeVSwitchesResponse.PageNumber"));
		describeVSwitchesResponse.setPageSize(_ctx.integerValue("DescribeVSwitchesResponse.PageSize"));

		List<VSwitch> vSwitchs = new ArrayList<VSwitch>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVSwitchesResponse.VSwitchs.Length"); i++) {
			VSwitch vSwitch = new VSwitch();
			vSwitch.setAliUid(_ctx.stringValue("DescribeVSwitchesResponse.VSwitchs["+ i +"].AliUid"));
			vSwitch.setBid(_ctx.stringValue("DescribeVSwitchesResponse.VSwitchs["+ i +"].Bid"));
			vSwitch.setCidrBlock(_ctx.stringValue("DescribeVSwitchesResponse.VSwitchs["+ i +"].CidrBlock"));
			vSwitch.setDescription(_ctx.stringValue("DescribeVSwitchesResponse.VSwitchs["+ i +"].Description"));
			vSwitch.setGmtCreate(_ctx.stringValue("DescribeVSwitchesResponse.VSwitchs["+ i +"].GmtCreate"));
			vSwitch.setGmtModified(_ctx.stringValue("DescribeVSwitchesResponse.VSwitchs["+ i +"].GmtModified"));
			vSwitch.setIsDefault(_ctx.booleanValue("DescribeVSwitchesResponse.VSwitchs["+ i +"].IsDefault"));
			vSwitch.setIzNo(_ctx.stringValue("DescribeVSwitchesResponse.VSwitchs["+ i +"].IzNo"));
			vSwitch.setRegionNo(_ctx.stringValue("DescribeVSwitchesResponse.VSwitchs["+ i +"].RegionNo"));
			vSwitch.setStatus(_ctx.stringValue("DescribeVSwitchesResponse.VSwitchs["+ i +"].Status"));
			vSwitch.setVSwitchId(_ctx.stringValue("DescribeVSwitchesResponse.VSwitchs["+ i +"].VSwitchId"));
			vSwitch.setVSwitchName(_ctx.stringValue("DescribeVSwitchesResponse.VSwitchs["+ i +"].VSwitchName"));

			vSwitchs.add(vSwitch);
		}
		describeVSwitchesResponse.setVSwitchs(vSwitchs);
	 
	 	return describeVSwitchesResponse;
	}
}