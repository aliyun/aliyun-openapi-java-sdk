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

import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicy;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoSnapshotPolicyExResponseUnmarshaller {

	public static DescribeAutoSnapshotPolicyExResponse unmarshall(DescribeAutoSnapshotPolicyExResponse describeAutoSnapshotPolicyExResponse, UnmarshallerContext context) {
		
		describeAutoSnapshotPolicyExResponse.setRequestId(context.stringValue("DescribeAutoSnapshotPolicyExResponse.RequestId"));
		describeAutoSnapshotPolicyExResponse.setTotalCount(context.integerValue("DescribeAutoSnapshotPolicyExResponse.TotalCount"));
		describeAutoSnapshotPolicyExResponse.setPageNumber(context.integerValue("DescribeAutoSnapshotPolicyExResponse.PageNumber"));
		describeAutoSnapshotPolicyExResponse.setPageSize(context.integerValue("DescribeAutoSnapshotPolicyExResponse.PageSize"));

		List<AutoSnapshotPolicy> autoSnapshotPolicies = new ArrayList<AutoSnapshotPolicy>();
		for (int i = 0; i < context.lengthValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies.Length"); i++) {
			AutoSnapshotPolicy autoSnapshotPolicy = new AutoSnapshotPolicy();
			autoSnapshotPolicy.setAutoSnapshotPolicyId(context.integerValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].AutoSnapshotPolicyId"));
			autoSnapshotPolicy.setRegionId(context.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].RegionId"));
			autoSnapshotPolicy.setAutoSnapshotPolicyName(context.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].AutoSnapshotPolicyName"));
			autoSnapshotPolicy.setTimePoints(context.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].TimePoints"));
			autoSnapshotPolicy.setRepeatWeekdays(context.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].RepeatWeekdays"));
			autoSnapshotPolicy.setRetentionDays(context.integerValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].RetentionDays"));
			autoSnapshotPolicy.setDiskNums(context.integerValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].DiskNums"));
			autoSnapshotPolicy.setCreationTime(context.stringValue("DescribeAutoSnapshotPolicyExResponse.AutoSnapshotPolicies["+ i +"].CreationTime"));

			autoSnapshotPolicies.add(autoSnapshotPolicy);
		}
		describeAutoSnapshotPolicyExResponse.setAutoSnapshotPolicies(autoSnapshotPolicies);
	 
	 	return describeAutoSnapshotPolicyExResponse;
	}
}