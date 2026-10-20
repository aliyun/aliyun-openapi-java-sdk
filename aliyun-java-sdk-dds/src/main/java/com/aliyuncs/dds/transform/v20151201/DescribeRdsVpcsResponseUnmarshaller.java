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

import com.aliyuncs.dds.model.v20151201.DescribeRdsVpcsResponse;
import com.aliyuncs.dds.model.v20151201.DescribeRdsVpcsResponse.Vpcs;
import com.aliyuncs.dds.model.v20151201.DescribeRdsVpcsResponse.Vpcs.VpcItem;
import com.aliyuncs.dds.model.v20151201.DescribeRdsVpcsResponse.Vpcs.VpcItem.VSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsVpcsResponseUnmarshaller {

	public static DescribeRdsVpcsResponse unmarshall(DescribeRdsVpcsResponse describeRdsVpcsResponse, UnmarshallerContext _ctx) {
		
		describeRdsVpcsResponse.setRequestId(_ctx.stringValue("DescribeRdsVpcsResponse.RequestId"));

		Vpcs vpcs = new Vpcs();

		List<VpcItem> vpc = new ArrayList<VpcItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsVpcsResponse.Vpcs.Vpc.Length"); i++) {
			VpcItem vpcItem = new VpcItem();
			vpcItem.setStatus(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].Status"));
			vpcItem.setIsDefault(_ctx.booleanValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].IsDefault"));
			vpcItem.setRegionNo(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].RegionNo"));
			vpcItem.setGmtCreate(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].GmtCreate"));
			vpcItem.setVpcId(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VpcId"));
			vpcItem.setGmtModified(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].GmtModified"));
			vpcItem.setCidrBlock(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].CidrBlock"));
			vpcItem.setVpcName(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VpcName"));
			vpcItem.setBid(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].Bid"));
			vpcItem.setAliUid(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].AliUid"));

			List<VSwitch> vSwitchs = new ArrayList<VSwitch>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs.Length"); j++) {
				VSwitch vSwitch = new VSwitch();
				vSwitch.setStatus(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].Status"));
				vSwitch.setIsDefault(_ctx.booleanValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].IsDefault"));
				vSwitch.setIzNo(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].IzNo"));
				vSwitch.setGmtCreate(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].GmtCreate"));
				vSwitch.setVSwitchId(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].VSwitchId"));
				vSwitch.setGmtModified(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].GmtModified"));
				vSwitch.setCidrBlock(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].CidrBlock"));
				vSwitch.setVSwitchName(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].VSwitchName"));

				vSwitchs.add(vSwitch);
			}
			vpcItem.setVSwitchs(vSwitchs);

			vpc.add(vpcItem);
		}
		vpcs.setVpc(vpc);
		describeRdsVpcsResponse.setVpcs(vpcs);
	 
	 	return describeRdsVpcsResponse;
	}
}