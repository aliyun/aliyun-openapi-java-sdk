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
package com.aliyuncs.ess.transform.v20140828;

import com.aliyuncs.ess.model.v20140828.DescribeAccountAttributesResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAccountAttributesResponseUnmarshaller {

	public static DescribeAccountAttributesResponse unmarshall(DescribeAccountAttributesResponse describeAccountAttributesResponse, UnmarshallerContext context) {
		
		describeAccountAttributesResponse.setMaxNumberOfScalingGroups(context.integerValue("DescribeAccountAttributesResponse.MaxNumberOfScalingGroups"));
		describeAccountAttributesResponse.setMaxNumberOfScalingConfigurations(context.integerValue("DescribeAccountAttributesResponse.MaxNumberOfScalingConfigurations"));
		describeAccountAttributesResponse.setMaxNumberOfScalingRules(context.integerValue("DescribeAccountAttributesResponse.MaxNumberOfScalingRules"));
		describeAccountAttributesResponse.setMaxNumberOfScheduledTasks(context.integerValue("DescribeAccountAttributesResponse.MaxNumberOfScheduledTasks"));
		describeAccountAttributesResponse.setMaxNumberOfScalingInstances(context.integerValue("DescribeAccountAttributesResponse.MaxNumberOfScalingInstances"));
		describeAccountAttributesResponse.setMaxNumberOfDBInstances(context.integerValue("DescribeAccountAttributesResponse.MaxNumberOfDBInstances"));
		describeAccountAttributesResponse.setMaxNumberOfLoadBalancers(context.integerValue("DescribeAccountAttributesResponse.MaxNumberOfLoadBalancers"));
		describeAccountAttributesResponse.setMaxNumberOfMinSize(context.integerValue("DescribeAccountAttributesResponse.MaxNumberOfMinSize"));
		describeAccountAttributesResponse.setMaxNumberOfMaxSize(context.integerValue("DescribeAccountAttributesResponse.MaxNumberOfMaxSize"));
	 
	 	return describeAccountAttributesResponse;
	}
}