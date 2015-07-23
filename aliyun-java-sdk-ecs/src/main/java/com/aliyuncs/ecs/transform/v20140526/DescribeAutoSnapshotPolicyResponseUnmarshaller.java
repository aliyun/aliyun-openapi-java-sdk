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

import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyResponse;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicy;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyResponse.AutoSnapshotExcutionStatus;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyResponse.AutoSnapshotExcutionStatus.SystemDiskExcutionStatus;
import com.aliyuncs.ecs.model.v20140526.DescribeAutoSnapshotPolicyResponse.AutoSnapshotExcutionStatus.DataDiskExcutionStatus;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAutoSnapshotPolicyResponseUnmarshaller {

	public static DescribeAutoSnapshotPolicyResponse unmarshall(DescribeAutoSnapshotPolicyResponse describeAutoSnapshotPolicyResponse, UnmarshallerContext context) {
		
		describeAutoSnapshotPolicyResponse.setRequestId(context.stringValue("DescribeAutoSnapshotPolicyResponse.RequestId"));
		describeAutoSnapshotPolicyResponse.setAutoSnapshotOccupation(context.integerValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotOccupation"));

		AutoSnapshotPolicy  autoSnapshotPolicy = new AutoSnapshotPolicy();
		autoSnapshotPolicy.setSystemDiskPolicyEnabled(context.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicy.SystemDiskPolicyEnabled"));
		autoSnapshotPolicy.setSystemDiskPolicyTimePeriod(context.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicy.SystemDiskPolicyTimePeriod"));
		autoSnapshotPolicy.setSystemDiskPolicyRetentionDays(context.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicy.SystemDiskPolicyRetentionDays"));
		autoSnapshotPolicy.setSystemDiskPolicyRetentionLastWeek(context.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicy.SystemDiskPolicyRetentionLastWeek"));
		autoSnapshotPolicy.setDataDiskPolicyEnabled(context.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicy.DataDiskPolicyEnabled"));
		autoSnapshotPolicy.setDataDiskPolicyTimePeriod(context.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicy.DataDiskPolicyTimePeriod"));
		autoSnapshotPolicy.setDataDiskPolicyRetentionDays(context.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicy.DataDiskPolicyRetentionDays"));
		autoSnapshotPolicy.setDataDiskPolicyRetentionLastWeek(context.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotPolicy.DataDiskPolicyRetentionLastWeek"));
		describeAutoSnapshotPolicyResponse.setAutoSnapshotPolicy(autoSnapshotPolicy);

		AutoSnapshotExcutionStatus  autoSnapshotExcutionStatus = new AutoSnapshotExcutionStatus();
		autoSnapshotExcutionStatus.setSystemDiskExcutionStatus(SystemDiskExcutionStatus.getEnum(context.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotExcutionStatus.SystemDiskExcutionStatus")));
		autoSnapshotExcutionStatus.setDataDiskExcutionStatus(DataDiskExcutionStatus.getEnum(context.stringValue("DescribeAutoSnapshotPolicyResponse.AutoSnapshotExcutionStatus.DataDiskExcutionStatus")));
		describeAutoSnapshotPolicyResponse.setAutoSnapshotExcutionStatus(autoSnapshotExcutionStatus);
	 
	 	return describeAutoSnapshotPolicyResponse;
	}
}