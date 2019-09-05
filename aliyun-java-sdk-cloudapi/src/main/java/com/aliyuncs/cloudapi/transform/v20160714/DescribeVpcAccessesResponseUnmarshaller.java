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

package com.aliyuncs.cloudapi.transform.v20160714;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cloudapi.model.v20160714.DescribeVpcAccessesResponse;
import com.aliyuncs.cloudapi.model.v20160714.DescribeVpcAccessesResponse.VpcAccessAttribute;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeVpcAccessesResponseUnmarshaller {

	public static DescribeVpcAccessesResponse unmarshall(DescribeVpcAccessesResponse describeVpcAccessesResponse, UnmarshallerContext _ctx) {
		
		describeVpcAccessesResponse.setRequestId(_ctx.stringValue("DescribeVpcAccessesResponse.RequestId"));
		describeVpcAccessesResponse.setTotalCount(_ctx.integerValue("DescribeVpcAccessesResponse.TotalCount"));
		describeVpcAccessesResponse.setPageSize(_ctx.integerValue("DescribeVpcAccessesResponse.PageSize"));
		describeVpcAccessesResponse.setPageNumber(_ctx.integerValue("DescribeVpcAccessesResponse.PageNumber"));

		List<VpcAccessAttribute> vpcAccessAttributes = new ArrayList<VpcAccessAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeVpcAccessesResponse.VpcAccessAttributes.Length"); i++) {
			VpcAccessAttribute vpcAccessAttribute = new VpcAccessAttribute();
			vpcAccessAttribute.setVpcId(_ctx.stringValue("DescribeVpcAccessesResponse.VpcAccessAttributes["+ i +"].VpcId"));
			vpcAccessAttribute.setInstanceId(_ctx.stringValue("DescribeVpcAccessesResponse.VpcAccessAttributes["+ i +"].InstanceId"));
			vpcAccessAttribute.setCreatedTime(_ctx.stringValue("DescribeVpcAccessesResponse.VpcAccessAttributes["+ i +"].CreatedTime"));
			vpcAccessAttribute.setPort(_ctx.integerValue("DescribeVpcAccessesResponse.VpcAccessAttributes["+ i +"].Port"));
			vpcAccessAttribute.setRegionId(_ctx.stringValue("DescribeVpcAccessesResponse.VpcAccessAttributes["+ i +"].RegionId"));
			vpcAccessAttribute.setName(_ctx.stringValue("DescribeVpcAccessesResponse.VpcAccessAttributes["+ i +"].Name"));

			vpcAccessAttributes.add(vpcAccessAttribute);
		}
		describeVpcAccessesResponse.setVpcAccessAttributes(vpcAccessAttributes);
	 
	 	return describeVpcAccessesResponse;
	}
}