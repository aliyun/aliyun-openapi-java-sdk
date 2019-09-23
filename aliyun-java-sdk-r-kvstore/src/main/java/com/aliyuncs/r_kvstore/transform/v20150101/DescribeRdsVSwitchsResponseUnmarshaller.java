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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeRdsVSwitchsResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeRdsVSwitchsResponse.VSwitches;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeRdsVSwitchsResponse.VSwitches.VSwitchItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsVSwitchsResponseUnmarshaller {

	public static DescribeRdsVSwitchsResponse unmarshall(DescribeRdsVSwitchsResponse describeRdsVSwitchsResponse, UnmarshallerContext _ctx) {
		
		describeRdsVSwitchsResponse.setRequestId(_ctx.stringValue("DescribeRdsVSwitchsResponse.RequestId"));

		VSwitches vSwitches = new VSwitches();

		List<VSwitchItem> vSwitch = new ArrayList<VSwitchItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch.Length"); i++) {
			VSwitchItem vSwitchItem = new VSwitchItem();
			vSwitchItem.setVSwitchId(_ctx.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].VSwitchId"));
			vSwitchItem.setVSwitchName(_ctx.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].VSwitchName"));
			vSwitchItem.setIzNo(_ctx.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].IzNo"));
			vSwitchItem.setBid(_ctx.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].Bid"));
			vSwitchItem.setAliUid(_ctx.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].AliUid"));
			vSwitchItem.setRegionNo(_ctx.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].RegionNo"));
			vSwitchItem.setCidrBlock(_ctx.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].CidrBlock"));
			vSwitchItem.setIsDefault(_ctx.booleanValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].IsDefault"));
			vSwitchItem.setStatus(_ctx.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].Status"));
			vSwitchItem.setGmtCreate(_ctx.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].GmtCreate"));
			vSwitchItem.setGmtModified(_ctx.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].GmtModified"));

			vSwitch.add(vSwitchItem);
		}
		vSwitches.setVSwitch(vSwitch);
		describeRdsVSwitchsResponse.setVSwitches(vSwitches);
	 
	 	return describeRdsVSwitchsResponse;
	}
}