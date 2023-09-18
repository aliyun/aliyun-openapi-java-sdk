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

package com.aliyuncs.adb.transform.v20190315;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.adb.model.v20190315.DescribeVSwitchesResponse;
import com.aliyuncs.adb.model.v20190315.DescribeVSwitchesResponse.VSwitches;
import com.aliyuncs.adb.model.v20190315.DescribeVSwitchesResponse.VSwitches.VSwitchItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVSwitchesResponseUnmarshaller {

	public static DescribeVSwitchesResponse unmarshall(DescribeVSwitchesResponse describeVSwitchesResponse, UnmarshallerContext _ctx) {
		
		describeVSwitchesResponse.setRequestId(_ctx.stringValue("DescribeVSwitchesResponse.RequestId"));

		VSwitches vSwitches = new VSwitches();

		List<VSwitchItem> vSwitch = new ArrayList<VSwitchItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVSwitchesResponse.VSwitches.VSwitch.Length"); i++) {
			VSwitchItem vSwitchItem = new VSwitchItem();
			vSwitchItem.setStatus(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches.VSwitch["+ i +"].Status"));
			vSwitchItem.setIsDefault(_ctx.booleanValue("DescribeVSwitchesResponse.VSwitches.VSwitch["+ i +"].IsDefault"));
			vSwitchItem.setVSwitchId(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches.VSwitch["+ i +"].VSwitchId"));
			vSwitchItem.setCidrBlock(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches.VSwitch["+ i +"].CidrBlock"));
			vSwitchItem.setRegionNo(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches.VSwitch["+ i +"].RegionNo"));
			vSwitchItem.setGmtCreate(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches.VSwitch["+ i +"].GmtCreate"));
			vSwitchItem.setAliUid(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches.VSwitch["+ i +"].AliUid"));
			vSwitchItem.setGmtModified(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches.VSwitch["+ i +"].GmtModified"));
			vSwitchItem.setBid(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches.VSwitch["+ i +"].Bid"));
			vSwitchItem.setIzNo(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches.VSwitch["+ i +"].IzNo"));
			vSwitchItem.setVSwitchName(_ctx.stringValue("DescribeVSwitchesResponse.VSwitches.VSwitch["+ i +"].VSwitchName"));

			vSwitch.add(vSwitchItem);
		}
		vSwitches.setVSwitch(vSwitch);
		describeVSwitchesResponse.setVSwitches(vSwitches);
	 
	 	return describeVSwitchesResponse;
	}
}