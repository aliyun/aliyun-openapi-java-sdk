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
package com.aliyuncs.slb.transform.v20140515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancersResponse;
import com.aliyuncs.slb.model.v20140515.DescribeLoadBalancersResponse.LoadBalancer;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLoadBalancersResponseUnmarshaller {

	public static DescribeLoadBalancersResponse unmarshall(DescribeLoadBalancersResponse describeLoadBalancersResponse, UnmarshallerContext context) {
		
		describeLoadBalancersResponse.setRequestId(context.stringValue("DescribeLoadBalancersResponse.RequestId"));

		List<LoadBalancer> loadBalancers = new ArrayList<LoadBalancer>();
		for (int i = 0; i < context.lengthValue("DescribeLoadBalancersResponse.LoadBalancers.Length"); i++) {
			LoadBalancer loadBalancer = new LoadBalancer();
			loadBalancer.setLoadBalancerId(context.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerId"));
			loadBalancer.setLoadBalancerName(context.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerName"));
			loadBalancer.setLoadBalancerStatus(context.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].LoadBalancerStatus"));
			loadBalancer.setAddress(context.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].Address"));
			loadBalancer.setAddressType(context.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].AddressType"));
			loadBalancer.setRegionId(context.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].RegionId"));
			loadBalancer.setRegionIdAlias(context.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].RegionIdAlias"));
			loadBalancer.setVSwitchId(context.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].VSwitchId"));
			loadBalancer.setVpcId(context.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].VpcId"));
			loadBalancer.setNetworkType(context.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].NetworkType"));
			loadBalancer.setMasterZoneId(context.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].MasterZoneId"));
			loadBalancer.setSlaveZoneId(context.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].SlaveZoneId"));
			loadBalancer.setInternetChargeType(context.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].InternetChargeType"));
			loadBalancer.setCreateTime(context.stringValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].CreateTime"));
			loadBalancer.setCreateTimeStamp(context.longValue("DescribeLoadBalancersResponse.LoadBalancers["+ i +"].CreateTimeStamp"));

			loadBalancers.add(loadBalancer);
		}
		describeLoadBalancersResponse.setLoadBalancers(loadBalancers);
	 
	 	return describeLoadBalancersResponse;
	}
}