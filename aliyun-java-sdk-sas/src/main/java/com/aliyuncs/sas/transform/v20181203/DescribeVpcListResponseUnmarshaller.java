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

package com.aliyuncs.sas.transform.v20181203;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sas.model.v20181203.DescribeVpcListResponse;
import com.aliyuncs.sas.model.v20181203.DescribeVpcListResponse.Vpc;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcListResponseUnmarshaller {

	public static DescribeVpcListResponse unmarshall(DescribeVpcListResponse describeVpcListResponse, UnmarshallerContext _ctx) {
		
		describeVpcListResponse.setRequestId(_ctx.stringValue("DescribeVpcListResponse.RequestId"));
		describeVpcListResponse.setCount(_ctx.integerValue("DescribeVpcListResponse.Count"));

		List<Vpc> vpcList = new ArrayList<Vpc>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcListResponse.VpcList.Length"); i++) {
			Vpc vpc = new Vpc();
			vpc.setInstanceId(_ctx.stringValue("DescribeVpcListResponse.VpcList["+ i +"].InstanceId"));
			vpc.setMiddleStatus(_ctx.integerValue("DescribeVpcListResponse.VpcList["+ i +"].MiddleStatus"));
			vpc.setInstanceName(_ctx.stringValue("DescribeVpcListResponse.VpcList["+ i +"].InstanceName"));
			vpc.setRegionId(_ctx.stringValue("DescribeVpcListResponse.VpcList["+ i +"].RegionId"));
			vpc.setInstanceDesc(_ctx.stringValue("DescribeVpcListResponse.VpcList["+ i +"].InstanceDesc"));
			vpc.setEcsCount(_ctx.integerValue("DescribeVpcListResponse.VpcList["+ i +"].EcsCount"));
			vpc.setStatus(_ctx.integerValue("DescribeVpcListResponse.VpcList["+ i +"].Status"));

			vpcList.add(vpc);
		}
		describeVpcListResponse.setVpcList(vpcList);
	 
	 	return describeVpcListResponse;
	}
}