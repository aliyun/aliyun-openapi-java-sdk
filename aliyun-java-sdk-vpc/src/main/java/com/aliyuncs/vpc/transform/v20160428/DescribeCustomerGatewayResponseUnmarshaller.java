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

package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeCustomerGatewayResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeCustomerGatewayResponse.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomerGatewayResponseUnmarshaller {

	public static DescribeCustomerGatewayResponse unmarshall(DescribeCustomerGatewayResponse describeCustomerGatewayResponse, UnmarshallerContext _ctx) {
		
		describeCustomerGatewayResponse.setRequestId(_ctx.stringValue("DescribeCustomerGatewayResponse.RequestId"));
		describeCustomerGatewayResponse.setAsn(_ctx.longValue("DescribeCustomerGatewayResponse.Asn"));
		describeCustomerGatewayResponse.setIpAddress(_ctx.stringValue("DescribeCustomerGatewayResponse.IpAddress"));
		describeCustomerGatewayResponse.setDescription(_ctx.stringValue("DescribeCustomerGatewayResponse.Description"));
		describeCustomerGatewayResponse.setCustomerGatewayId(_ctx.stringValue("DescribeCustomerGatewayResponse.CustomerGatewayId"));
		describeCustomerGatewayResponse.setCreateTime(_ctx.longValue("DescribeCustomerGatewayResponse.CreateTime"));
		describeCustomerGatewayResponse.setName(_ctx.stringValue("DescribeCustomerGatewayResponse.Name"));
		describeCustomerGatewayResponse.setAuthKey(_ctx.stringValue("DescribeCustomerGatewayResponse.AuthKey"));
		describeCustomerGatewayResponse.setResourceGroupId(_ctx.stringValue("DescribeCustomerGatewayResponse.ResourceGroupId"));

		List<Tag> tags = new ArrayList<Tag>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomerGatewayResponse.Tags.Length"); i++) {
			Tag tag = new Tag();
			tag.setKey(_ctx.stringValue("DescribeCustomerGatewayResponse.Tags["+ i +"].Key"));
			tag.setValue(_ctx.stringValue("DescribeCustomerGatewayResponse.Tags["+ i +"].Value"));

			tags.add(tag);
		}
		describeCustomerGatewayResponse.setTags(tags);
	 
	 	return describeCustomerGatewayResponse;
	}
}