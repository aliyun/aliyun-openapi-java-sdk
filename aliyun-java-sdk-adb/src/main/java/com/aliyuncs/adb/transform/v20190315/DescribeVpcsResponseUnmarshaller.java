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

import com.aliyuncs.adb.model.v20190315.DescribeVpcsResponse;
import com.aliyuncs.adb.model.v20190315.DescribeVpcsResponse.Vpcs;
import com.aliyuncs.adb.model.v20190315.DescribeVpcsResponse.Vpcs.VpcItem;
import com.aliyuncs.adb.model.v20190315.DescribeVpcsResponse.Vpcs.VpcItem.VSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcsResponseUnmarshaller {

	public static DescribeVpcsResponse unmarshall(DescribeVpcsResponse describeVpcsResponse, UnmarshallerContext _ctx) {
		
		describeVpcsResponse.setRequestId(_ctx.stringValue("DescribeVpcsResponse.RequestId"));

		Vpcs vpcs = new Vpcs();

		List<VpcItem> vpc = new ArrayList<VpcItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcsResponse.Vpcs.Vpc.Length"); i++) {
			VpcItem vpcItem = new VpcItem();
			vpcItem.setStatus(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].Status"));
			vpcItem.setVpcName(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].VpcName"));
			vpcItem.setVpcId(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].VpcId"));
			vpcItem.setIsDefault(_ctx.booleanValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].IsDefault"));
			vpcItem.setCidrBlock(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].CidrBlock"));
			vpcItem.setRegionNo(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].RegionNo"));
			vpcItem.setGmtCreate(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].GmtCreate"));
			vpcItem.setAliUid(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].AliUid"));
			vpcItem.setGmtModified(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].GmtModified"));
			vpcItem.setBid(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].Bid"));

			List<VSwitch> vSwitchs = new ArrayList<VSwitch>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs.Length"); j++) {
				VSwitch vSwitch = new VSwitch();
				vSwitch.setStatus(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].Status"));
				vSwitch.setVSwitchId(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].VSwitchId"));
				vSwitch.setIsDefault(_ctx.booleanValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].IsDefault"));
				vSwitch.setCidrBlock(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].CidrBlock"));
				vSwitch.setGmtCreate(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].GmtCreate"));
				vSwitch.setGmtModified(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].GmtModified"));
				vSwitch.setIzNo(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].IzNo"));
				vSwitch.setVSwitchName(_ctx.stringValue("DescribeVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].VSwitchName"));

				vSwitchs.add(vSwitch);
			}
			vpcItem.setVSwitchs(vSwitchs);

			vpc.add(vpcItem);
		}
		vpcs.setVpc(vpc);
		describeVpcsResponse.setVpcs(vpcs);
	 
	 	return describeVpcsResponse;
	}
}