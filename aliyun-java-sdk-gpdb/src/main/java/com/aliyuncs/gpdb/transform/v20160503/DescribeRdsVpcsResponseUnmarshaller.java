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

	public static DescribeRdsVpcsResponse unmarshall(DescribeRdsVpcsResponse describeRdsVpcsResponse, UnmarshallerContext context) {
		
		describeRdsVpcsResponse.setRequestId(context.stringValue("DescribeRdsVpcsResponse.RequestId"));

		Vpcs vpcs = new Vpcs();

		List<VpcItem> vpc = new ArrayList<VpcItem>();
		for (int i = 0; i < context.lengthValue("DescribeRdsVpcsResponse.Vpcs.Vpc.Length"); i++) {
			VpcItem vpcItem = new VpcItem();
			vpcItem.setVpcId(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VpcId"));
			vpcItem.setVpcName(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VpcName"));
			vpcItem.setBid(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].Bid"));
			vpcItem.setAliUid(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].AliUid"));
			vpcItem.setRegionNo(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].RegionNo"));
			vpcItem.setCidrBlock(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].CidrBlock"));
			vpcItem.setIsDefault(context.booleanValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].IsDefault"));
			vpcItem.setStatus(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].Status"));
			vpcItem.setGmtCreate(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].GmtCreate"));
			vpcItem.setGmtModified(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].GmtModified"));

			List<VSwitch> vSwitchs = new ArrayList<VSwitch>();
			for (int j = 0; j < context.lengthValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs.Length"); j++) {
				VSwitch vSwitch = new VSwitch();
				vSwitch.setVSwitchId(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].VSwitchId"));
				vSwitch.setVSwitchName(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].VSwitchName"));
				vSwitch.setIzNo(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].IzNo"));
				vSwitch.setCidrBlock(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].CidrBlock"));
				vSwitch.setIsDefault(context.booleanValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].IsDefault"));
				vSwitch.setStatus(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].Status"));
				vSwitch.setGmtCreate(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].GmtCreate"));
				vSwitch.setGmtModified(context.stringValue("DescribeRdsVpcsResponse.Vpcs.Vpc["+ i +"].VSwitchs["+ j +"].GmtModified"));

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