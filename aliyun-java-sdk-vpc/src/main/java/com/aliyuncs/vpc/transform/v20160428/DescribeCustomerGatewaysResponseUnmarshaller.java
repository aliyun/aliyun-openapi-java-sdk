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

import com.aliyuncs.vpc.model.v20160428.DescribeCustomerGatewaysResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeCustomerGatewaysResponse.CustomerGateway;
import com.aliyuncs.vpc.model.v20160428.DescribeCustomerGatewaysResponse.CustomerGateway.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomerGatewaysResponseUnmarshaller {

	public static DescribeCustomerGatewaysResponse unmarshall(DescribeCustomerGatewaysResponse describeCustomerGatewaysResponse, UnmarshallerContext _ctx) {
		
		describeCustomerGatewaysResponse.setRequestId(_ctx.stringValue("DescribeCustomerGatewaysResponse.RequestId"));
		describeCustomerGatewaysResponse.setPageSize(_ctx.integerValue("DescribeCustomerGatewaysResponse.PageSize"));
		describeCustomerGatewaysResponse.setPageNumber(_ctx.integerValue("DescribeCustomerGatewaysResponse.PageNumber"));
		describeCustomerGatewaysResponse.setTotalCount(_ctx.integerValue("DescribeCustomerGatewaysResponse.TotalCount"));

		List<CustomerGateway> customerGateways = new ArrayList<CustomerGateway>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCustomerGatewaysResponse.CustomerGateways.Length"); i++) {
			CustomerGateway customerGateway = new CustomerGateway();
			customerGateway.setIpAddress(_ctx.stringValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].IpAddress"));
			customerGateway.setAsn(_ctx.longValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].Asn"));
			customerGateway.setDescription(_ctx.stringValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].Description"));
			customerGateway.setCustomerGatewayId(_ctx.stringValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].CustomerGatewayId"));
			customerGateway.setCreateTime(_ctx.longValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].CreateTime"));
			customerGateway.setName(_ctx.stringValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].Name"));
			customerGateway.setAuthKey(_ctx.stringValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].AuthKey"));
			customerGateway.setResourceGroupId(_ctx.stringValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].ResourceGroupId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			customerGateway.setTags(tags);

			customerGateways.add(customerGateway);
		}
		describeCustomerGatewaysResponse.setCustomerGateways(customerGateways);
	 
	 	return describeCustomerGatewaysResponse;
	}
}