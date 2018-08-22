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

package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeRdsVSwitchsResponse;
import com.aliyuncs.dds.model.v20151201.DescribeRdsVSwitchsResponse.VSwitches;
import com.aliyuncs.dds.model.v20151201.DescribeRdsVSwitchsResponse.VSwitches.VSwitchItem;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsVSwitchsResponseUnmarshaller {

	public static DescribeRdsVSwitchsResponse unmarshall(DescribeRdsVSwitchsResponse describeRdsVSwitchsResponse, UnmarshallerContext context) {
		
		describeRdsVSwitchsResponse.setRequestId(context.stringValue("DescribeRdsVSwitchsResponse.RequestId"));

		VSwitches vSwitches = new VSwitches();

		List<VSwitchItem> vSwitch = new ArrayList<VSwitchItem>();
		for (int i = 0; i < context.lengthValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch.Length"); i++) {
			VSwitchItem vSwitchItem = new VSwitchItem();
			vSwitchItem.setVSwitchId(context.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].VSwitchId"));
			vSwitchItem.setVSwitchName(context.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].VSwitchName"));
			vSwitchItem.setIzNo(context.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].IzNo"));
			vSwitchItem.setBid(context.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].Bid"));
			vSwitchItem.setAliUid(context.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].AliUid"));
			vSwitchItem.setRegionNo(context.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].RegionNo"));
			vSwitchItem.setCidrBlock(context.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].CidrBlock"));
			vSwitchItem.setIsDefault(context.booleanValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].IsDefault"));
			vSwitchItem.setStatus(context.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].Status"));
			vSwitchItem.setGmtCreate(context.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].GmtCreate"));
			vSwitchItem.setGmtModified(context.stringValue("DescribeRdsVSwitchsResponse.VSwitches.VSwitch["+ i +"].GmtModified"));

			vSwitch.add(vSwitchItem);
		}
		vSwitches.setVSwitch(vSwitch);
		describeRdsVSwitchsResponse.setVSwitches(vSwitches);
	 
	 	return describeRdsVSwitchsResponse;
	}
}