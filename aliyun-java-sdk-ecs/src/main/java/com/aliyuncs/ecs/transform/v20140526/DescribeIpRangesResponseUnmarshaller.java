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

import com.aliyuncs.ecs.model.v20140526.DescribeIpRangesResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeIpRangesResponse.IpRange;
import com.aliyuncs.ecs.model.v20140526.DescribeIpRangesResponse.IpRange.NicType;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeIpRangesResponseUnmarshaller {

	public static DescribeIpRangesResponse unmarshall(DescribeIpRangesResponse describeIpRangesResponse, UnmarshallerContext context) {
		
		describeIpRangesResponse.setRequestId(context.stringValue("DescribeIpRangesResponse.RequestId"));
		describeIpRangesResponse.setRegionId(context.stringValue("DescribeIpRangesResponse.RegionId"));
		describeIpRangesResponse.setClusterId(context.stringValue("DescribeIpRangesResponse.ClusterId"));
		describeIpRangesResponse.setTotalCount(context.integerValue("DescribeIpRangesResponse.TotalCount"));
		describeIpRangesResponse.setPageNumber(context.integerValue("DescribeIpRangesResponse.PageNumber"));
		describeIpRangesResponse.setPageSize(context.integerValue("DescribeIpRangesResponse.PageSize"));

		List<IpRange> ipRanges = new ArrayList<IpRange>();
		for (int i = 0; i < context.lengthValue("DescribeIpRangesResponse.IpRanges.Length"); i++) {
			IpRange ipRange = new IpRange();
			ipRange.setIpAddress(context.stringValue("DescribeIpRangesResponse.IpRanges["+ i +"].IpAddress"));
			ipRange.setNicType(NicType.getEnum(context.stringValue("DescribeIpRangesResponse.IpRanges["+ i +"].NicType")));

			ipRanges.add(ipRange);
		}
		describeIpRangesResponse.setIpRanges(ipRanges);
	 
	 	return describeIpRangesResponse;
	}
}