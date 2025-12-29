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

import com.aliyuncs.dds.model.v20151201.DescribeVpcsForMongoDBResponse;
import com.aliyuncs.dds.model.v20151201.DescribeVpcsForMongoDBResponse.Vpc;
import com.aliyuncs.dds.model.v20151201.DescribeVpcsForMongoDBResponse.Vpc.VSwitch;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcsForMongoDBResponseUnmarshaller {

	public static DescribeVpcsForMongoDBResponse unmarshall(DescribeVpcsForMongoDBResponse describeVpcsForMongoDBResponse, UnmarshallerContext _ctx) {
		
		describeVpcsForMongoDBResponse.setRequestId(_ctx.stringValue("DescribeVpcsForMongoDBResponse.RequestId"));
		describeVpcsForMongoDBResponse.setTotalCount(_ctx.integerValue("DescribeVpcsForMongoDBResponse.TotalCount"));
		describeVpcsForMongoDBResponse.setPageSize(_ctx.integerValue("DescribeVpcsForMongoDBResponse.PageSize"));
		describeVpcsForMongoDBResponse.setPageNumber(_ctx.integerValue("DescribeVpcsForMongoDBResponse.PageNumber"));

		List<Vpc> vpcs = new ArrayList<Vpc>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcsForMongoDBResponse.Vpcs.Length"); i++) {
			Vpc vpc = new Vpc();
			vpc.setStatus(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].Status"));
			vpc.setVpcName(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].VpcName"));
			vpc.setVpcId(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].VpcId"));
			vpc.setIsDefault(_ctx.booleanValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].IsDefault"));
			vpc.setCidrBlock(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].CidrBlock"));
			vpc.setRegionNo(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].RegionNo"));
			vpc.setGmtCreate(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].GmtCreate"));
			vpc.setAliUid(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].AliUid"));
			vpc.setGmtModified(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].GmtModified"));
			vpc.setBid(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].Bid"));

			List<VSwitch> vSwitchs = new ArrayList<VSwitch>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].VSwitchs.Length"); j++) {
				VSwitch vSwitch = new VSwitch();
				vSwitch.setStatus(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].VSwitchs["+ j +"].Status"));
				vSwitch.setVSwitchId(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].VSwitchs["+ j +"].VSwitchId"));
				vSwitch.setIsDefault(_ctx.booleanValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].VSwitchs["+ j +"].IsDefault"));
				vSwitch.setCidrBlock(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].VSwitchs["+ j +"].CidrBlock"));
				vSwitch.setGmtCreate(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].VSwitchs["+ j +"].GmtCreate"));
				vSwitch.setGmtModified(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].VSwitchs["+ j +"].GmtModified"));
				vSwitch.setIzNo(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].VSwitchs["+ j +"].IzNo"));
				vSwitch.setVSwitchName(_ctx.stringValue("DescribeVpcsForMongoDBResponse.Vpcs["+ i +"].VSwitchs["+ j +"].VSwitchName"));

				vSwitchs.add(vSwitch);
			}
			vpc.setVSwitchs(vSwitchs);

			vpcs.add(vpc);
		}
		describeVpcsForMongoDBResponse.setVpcs(vpcs);
	 
	 	return describeVpcsForMongoDBResponse;
	}
}