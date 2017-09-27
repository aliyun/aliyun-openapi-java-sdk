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
package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeReplicaUsageResponse;
import com.aliyuncs.rds.model.v20140815.DescribeReplicaUsageResponse.PerformanceKeys;
import com.aliyuncs.rds.model.v20140815.DescribeReplicaUsageResponse.PerformanceKeys.PerformanceKeyItem;
import com.aliyuncs.rds.model.v20140815.DescribeReplicaUsageResponse.PerformanceKeys.PerformanceKeyItem.PerformanceValues;
import com.aliyuncs.rds.model.v20140815.DescribeReplicaUsageResponse.PerformanceKeys.PerformanceKeyItem.PerformanceValues.PerformanceValueItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicaUsageResponseUnmarshaller {

	public static DescribeReplicaUsageResponse unmarshall(DescribeReplicaUsageResponse describeReplicaUsageResponse, UnmarshallerContext context) {
		
		describeReplicaUsageResponse.setRequestId(context.stringValue("DescribeReplicaUsageResponse.RequestId"));
		describeReplicaUsageResponse.setStartTime(context.stringValue("DescribeReplicaUsageResponse.StartTime"));
		describeReplicaUsageResponse.setEndTime(context.stringValue("DescribeReplicaUsageResponse.EndTime"));
		describeReplicaUsageResponse.setReplicaId(context.stringValue("DescribeReplicaUsageResponse.ReplicaId"));

		PerformanceKeys performanceKeys = new PerformanceKeys();

		List<PerformanceKeyItem> performanceKey = new ArrayList<PerformanceKeyItem>();
		for (int i = 0; i < context.lengthValue("DescribeReplicaUsageResponse.PerformanceKeys.PerformanceKey.Length"); i++) {
			PerformanceKeyItem performanceKeyItem = new PerformanceKeyItem();
			performanceKeyItem.setKey(context.stringValue("DescribeReplicaUsageResponse.PerformanceKeys.PerformanceKey["+ i +"].Key"));
			performanceKeyItem.setUnit(context.stringValue("DescribeReplicaUsageResponse.PerformanceKeys.PerformanceKey["+ i +"].Unit"));
			performanceKeyItem.setValueFormat(context.stringValue("DescribeReplicaUsageResponse.PerformanceKeys.PerformanceKey["+ i +"].ValueFormat"));

			PerformanceValues performanceValues = new PerformanceValues();

			List<PerformanceValueItem> performanceValue = new ArrayList<PerformanceValueItem>();
			for (int j = 0; j < context.lengthValue("DescribeReplicaUsageResponse.PerformanceKeys.PerformanceKey["+ i +"].PerformanceValues.PerformanceValue.Length"); j++) {
				PerformanceValueItem performanceValueItem = new PerformanceValueItem();
				performanceValueItem.setValue(context.stringValue("DescribeReplicaUsageResponse.PerformanceKeys.PerformanceKey["+ i +"].PerformanceValues.PerformanceValue["+ j +"].Value"));
				performanceValueItem.setDate(context.stringValue("DescribeReplicaUsageResponse.PerformanceKeys.PerformanceKey["+ i +"].PerformanceValues.PerformanceValue["+ j +"].Date"));

				performanceValue.add(performanceValueItem);
			}
			performanceValues.setPerformanceValue(performanceValue);
			performanceKeyItem.setPerformanceValues(performanceValues);

			performanceKey.add(performanceKeyItem);
		}
		performanceKeys.setPerformanceKey(performanceKey);
		describeReplicaUsageResponse.setPerformanceKeys(performanceKeys);
	 
	 	return describeReplicaUsageResponse;
	}
}