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

package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeVpcsResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeVpcsResponse.Vpc;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcsResponseUnmarshaller {

	public static DescribeVpcsResponse unmarshall(DescribeVpcsResponse describeVpcsResponse, UnmarshallerContext _ctx) {
		
		describeVpcsResponse.setRequestId(_ctx.stringValue("DescribeVpcsResponse.RequestId"));
		describeVpcsResponse.setTotalCount(_ctx.integerValue("DescribeVpcsResponse.TotalCount"));
		describeVpcsResponse.setPageNumber(_ctx.integerValue("DescribeVpcsResponse.PageNumber"));
		describeVpcsResponse.setPageSize(_ctx.integerValue("DescribeVpcsResponse.PageSize"));

		List<Vpc> vpcs = new ArrayList<Vpc>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcsResponse.Vpcs.Length"); i++) {
			Vpc vpc = new Vpc();
			vpc.setVpcId(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VpcId"));
			vpc.setRegionId(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].RegionId"));
			vpc.setStatus(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Status"));
			vpc.setVpcName(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VpcName"));
			vpc.setCreationTime(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].CreationTime"));
			vpc.setCidrBlock(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].CidrBlock"));
			vpc.setVRouterId(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VRouterId"));
			vpc.setDescription(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].Description"));
			vpc.setIsDefault(_ctx.booleanValue("DescribeVpcsResponse.Vpcs["+ i +"].IsDefault"));

			List<String> vSwitchIds = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchIds.Length"); j++) {
				vSwitchIds.add(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].VSwitchIds["+ j +"]"));
			}
			vpc.setVSwitchIds(vSwitchIds);

			List<String> userCidrs = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeVpcsResponse.Vpcs["+ i +"].UserCidrs.Length"); j++) {
				userCidrs.add(_ctx.stringValue("DescribeVpcsResponse.Vpcs["+ i +"].UserCidrs["+ j +"]"));
			}
			vpc.setUserCidrs(userCidrs);

			vpcs.add(vpc);
		}
		describeVpcsResponse.setVpcs(vpcs);
	 
	 	return describeVpcsResponse;
	}
}