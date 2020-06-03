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

import com.aliyuncs.vpc.model.v20160428.DescribeCustomerGatewayResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomerGatewayResponseUnmarshaller {

	public static DescribeCustomerGatewayResponse unmarshall(DescribeCustomerGatewayResponse describeCustomerGatewayResponse, UnmarshallerContext _ctx) {
		
		describeCustomerGatewayResponse.setRequestId(_ctx.stringValue("DescribeCustomerGatewayResponse.RequestId"));
		describeCustomerGatewayResponse.setCustomerGatewayId(_ctx.stringValue("DescribeCustomerGatewayResponse.CustomerGatewayId"));
		describeCustomerGatewayResponse.setIpAddress(_ctx.stringValue("DescribeCustomerGatewayResponse.IpAddress"));
		describeCustomerGatewayResponse.setName(_ctx.stringValue("DescribeCustomerGatewayResponse.Name"));
		describeCustomerGatewayResponse.setDescription(_ctx.stringValue("DescribeCustomerGatewayResponse.Description"));
		describeCustomerGatewayResponse.setCreateTime(_ctx.longValue("DescribeCustomerGatewayResponse.CreateTime"));
		describeCustomerGatewayResponse.setAsn(_ctx.integerValue("DescribeCustomerGatewayResponse.Asn"));
	 
	 	return describeCustomerGatewayResponse;
	}
}