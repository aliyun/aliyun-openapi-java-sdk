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
package com.aliyuncs.ecs.transform.v20140526;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecs.model.v20140526.DescribeImageSupportInstanceTypesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeImageSupportInstanceTypesResponse.InstanceType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeImageSupportInstanceTypesResponseUnmarshaller {

	public static DescribeImageSupportInstanceTypesResponse unmarshall(DescribeImageSupportInstanceTypesResponse describeImageSupportInstanceTypesResponse, UnmarshallerContext context) {
		
		describeImageSupportInstanceTypesResponse.setRequestId(context.stringValue("DescribeImageSupportInstanceTypesResponse.RequestId"));
		describeImageSupportInstanceTypesResponse.setRegionId(context.stringValue("DescribeImageSupportInstanceTypesResponse.RegionId"));
		describeImageSupportInstanceTypesResponse.setImageId(context.stringValue("DescribeImageSupportInstanceTypesResponse.ImageId"));

		List<InstanceType> instanceTypes = new ArrayList<InstanceType>();
		for (int i = 0; i < context.lengthValue("DescribeImageSupportInstanceTypesResponse.InstanceTypes.Length"); i++) {
			InstanceType instanceType = new InstanceType();
			instanceType.setInstanceTypeId(context.stringValue("DescribeImageSupportInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeId"));
			instanceType.setCpuCoreCount(context.integerValue("DescribeImageSupportInstanceTypesResponse.InstanceTypes["+ i +"].CpuCoreCount"));
			instanceType.setMemorySize(context.floatValue("DescribeImageSupportInstanceTypesResponse.InstanceTypes["+ i +"].MemorySize"));
			instanceType.setInstanceTypeFamily(context.stringValue("DescribeImageSupportInstanceTypesResponse.InstanceTypes["+ i +"].InstanceTypeFamily"));

			instanceTypes.add(instanceType);
		}
		describeImageSupportInstanceTypesResponse.setInstanceTypes(instanceTypes);
	 
	 	return describeImageSupportInstanceTypesResponse;
	}
}