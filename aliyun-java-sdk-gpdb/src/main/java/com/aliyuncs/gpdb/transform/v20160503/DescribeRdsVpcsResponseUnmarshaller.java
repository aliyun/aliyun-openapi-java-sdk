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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeRdsVpcsResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeRdsVpcsResponse.Vpcs;
import com.aliyuncs.gpdb.model.v20160503.DescribeRdsVpcsResponse.Vpcs.VpcItem;
import com.aliyuncs.gpdb.model.v20160503.DescribeRdsVpcsResponse.Vpcs.VpcItem.VSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRdsVpcsResponseUnmarshaller {

	public static DescribeRdsVpcsResponse unmarshall(DescribeRdsVpcsResponse describeRdsVpcsResponse, UnmarshallerContext _ctx) {
		
		describeRdsVpcsResponse.setRequestId(_ctx.stringValue("DescribeRdsVpcsResponse.RequestId"));

		Vpcs vpcs = new Vpcs();

		List<VpcItem> vpc = new ArrayList<VpcItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRdsVpcsResponse.Vpcs.Vpc.Length"); i++) {
			VpcItem vpcItem = new VpcItem();
			vpcItem.setStatus(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].Status"));
			vpcItem.setVpcName(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VpcName"));
			vpcItem.setVpcId(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VpcId"));
			vpcItem.setIsDefault(_ctx.booleanValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].IsDefault"));
			vpcItem.setCidrBlock(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].CidrBlock"));
			vpcItem.setRegionNo(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].RegionNo"));
			vpcItem.setGmtCreate(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].GmtCreate"));
			vpcItem.setAliUid(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].AliUid"));
			vpcItem.setGmtModified(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].GmtModified"));
			vpcItem.setBid(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].Bid"));

			List<VSwitch> vSwitchs = new ArrayList<VSwitch>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs.Length"); j++) {
				VSwitch vSwitch = new VSwitch();
				vSwitch.setStatus(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].Status"));
				vSwitch.setVSwitchId(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].VSwitchId"));
				vSwitch.setIsDefault(_ctx.booleanValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].IsDefault"));
				vSwitch.setCidrBlock(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].CidrBlock"));
				vSwitch.setGmtCreate(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].GmtCreate"));
				vSwitch.setGmtModified(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].GmtModified"));
				vSwitch.setIzNo(_ctx.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].IzNo"));
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