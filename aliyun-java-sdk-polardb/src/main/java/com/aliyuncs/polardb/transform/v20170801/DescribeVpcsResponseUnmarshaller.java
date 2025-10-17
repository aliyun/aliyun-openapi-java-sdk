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

import com.aliyuncs.polardb.model.v20170801.DescribeVpcsResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeVpcsResponse.Vpc;
import com.aliyuncs.polardb.model.v20170801.DescribeVpcsResponse.Vpc.VSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcsResponseUnmarshaller {

	public static DescribeVpcsResponse unmarshall(DescribeVpcsResponse describeVpcsResponse, UnmarshallerContext _ctx) {
		
		describeVpcsResponse.setRequestId(_ctx.stringValue("DescribeVpcsResponse.RequestId"));
		describeVpcsResponse.setPageNumber(_ctx.integerValue("DescribeVpcsResponse.PageNumber"));
		describeVpcsResponse.setPageSize(_ctx.integerValue("DescribeVpcsResponse.PageSize"));
		describeVpcsResponse.setTotalCount(_ctx.integerValue("DescribeVpcsResponse.TotalCount"));

		List<Vpc> vpcs = new ArrayList<Vpc>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcsResponse.Vpcs.Length"); i++) {
			Vpc vpc = new Vpc();
			vpc.setAliUid(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].AliUid"));
			vpc.setBid(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Bid"));
			vpc.setCidrBlock(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].CidrBlock"));
			vpc.setGmtCreate(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].GmtCreate"));
			vpc.setGmtModified(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].GmtModified"));
			vpc.setIsDefault(_ctx.booleanValue("DescribeVpcsResponse.Vpcs["+ i +"].IsDefault"));
			vpc.setRegionNo(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].RegionNo"));
			vpc.setStatus(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Status"));
			vpc.setVpcId(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VpcId"));
			vpc.setVpcName(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VpcName"));

			List<VSwitch> vSwitchs = new ArrayList<VSwitch>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchs.Length"); j++) {
				VSwitch vSwitch = new VSwitch();
				vSwitch.setCidrBlock(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchs["+ j +"].CidrBlock"));
				vSwitch.setGmtCreate(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchs["+ j +"].GmtCreate"));
				vSwitch.setGmtModified(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchs["+ j +"].GmtModified"));
				vSwitch.setIsDefault(_ctx.booleanValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchs["+ j +"].IsDefault"));
				vSwitch.setIzNo(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchs["+ j +"].IzNo"));
				vSwitch.setStatus(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchs["+ j +"].Status"));
				vSwitch.setVSwitchId(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchs["+ j +"].VSwitchId"));
				vSwitch.setVSwitchName(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchs["+ j +"].VSwitchName"));

				vSwitchs.add(vSwitch);
			}
			vpc.setVSwitchs(vSwitchs);

			vpcs.add(vpc);
		}
		describeVpcsResponse.setVpcs(vpcs);
	 
	 	return describeVpcsResponse;
	}
}