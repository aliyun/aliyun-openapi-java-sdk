/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.vpc.transform.v20160428;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vpc.model.v20160428.DescribeCustomerGatewaysResponse;
import com.aliyuncs.vpc.model.v20160428.DescribeCustomerGatewaysResponse.CustomerGateway;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCustomerGatewaysResponseUnmarshaller {

	public static DescribeCustomerGatewaysResponse unmarshall(DescribeCustomerGatewaysResponse describeCustomerGatewaysResponse, UnmarshallerContext context) {
		
		describeCustomerGatewaysResponse.setRequestId(context.stringValue("DescribeCustomerGatewaysResponse.RequestId"));
		describeCustomerGatewaysResponse.setTotalCount(context.integerValue("DescribeCustomerGatewaysResponse.TotalCount"));
		describeCustomerGatewaysResponse.setPageNumber(context.integerValue("DescribeCustomerGatewaysResponse.PageNumber"));
		describeCustomerGatewaysResponse.setPageSize(context.integerValue("DescribeCustomerGatewaysResponse.PageSize"));

		List<CustomerGateway> customerGateways = new ArrayList<CustomerGateway>();
		for (int i = 0; i < context.lengthValue("DescribeCustomerGatewaysResponse.CustomerGateways.Length"); i++) {
			CustomerGateway customerGateway = new CustomerGateway();
			customerGateway.setCustomerGatewayId(context.stringValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].CustomerGatewayId"));
			customerGateway.setName(context.stringValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].Name"));
			customerGateway.setIpAddress(context.stringValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].IpAddress"));
			customerGateway.setDescription(context.stringValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].Description"));
			customerGateway.setCreateTime(context.longValue("DescribeCustomerGatewaysResponse.CustomerGateways["+ i +"].CreateTime"));

			customerGateways.add(customerGateway);
		}
		describeCustomerGatewaysResponse.setCustomerGateways(customerGateways);
	 
	 	return describeCustomerGatewaysResponse;
	}
}