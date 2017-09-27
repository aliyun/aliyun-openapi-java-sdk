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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetworkDetailResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetworkDetailResponse.NetworkKey;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetworkDetailResponse.NetworkKey.NetworkValue;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceNetworkDetailResponseUnmarshaller {

	public static DescribeDBInstanceNetworkDetailResponse unmarshall(DescribeDBInstanceNetworkDetailResponse describeDBInstanceNetworkDetailResponse, UnmarshallerContext context) {
		
		describeDBInstanceNetworkDetailResponse.setRequestId(context.stringValue("DescribeDBInstanceNetworkDetailResponse.RequestId"));
		describeDBInstanceNetworkDetailResponse.setDBInstanceId(context.stringValue("DescribeDBInstanceNetworkDetailResponse.DBInstanceId"));
		describeDBInstanceNetworkDetailResponse.setStartTime(context.stringValue("DescribeDBInstanceNetworkDetailResponse.StartTime"));
		describeDBInstanceNetworkDetailResponse.setEndTime(context.stringValue("DescribeDBInstanceNetworkDetailResponse.EndTime"));
		describeDBInstanceNetworkDetailResponse.setNewConnection(context.stringValue("DescribeDBInstanceNetworkDetailResponse.NewConnection"));
		describeDBInstanceNetworkDetailResponse.setActiveConnection(context.stringValue("DescribeDBInstanceNetworkDetailResponse.ActiveConnection"));
		describeDBInstanceNetworkDetailResponse.setAbortedConnection(context.stringValue("DescribeDBInstanceNetworkDetailResponse.AbortedConnection"));
		describeDBInstanceNetworkDetailResponse.setNetworkRequest(context.stringValue("DescribeDBInstanceNetworkDetailResponse.NetworkRequest"));
		describeDBInstanceNetworkDetailResponse.setNetworkTrafficIn(context.stringValue("DescribeDBInstanceNetworkDetailResponse.NetworkTrafficIn"));
		describeDBInstanceNetworkDetailResponse.setNetworkTrafficOut(context.stringValue("DescribeDBInstanceNetworkDetailResponse.NetworkTrafficOut"));
		describeDBInstanceNetworkDetailResponse.setNetworkLatency(context.stringValue("DescribeDBInstanceNetworkDetailResponse.NetworkLatency"));
		describeDBInstanceNetworkDetailResponse.setBackendLatency(context.stringValue("DescribeDBInstanceNetworkDetailResponse.BackendLatency"));
		describeDBInstanceNetworkDetailResponse.setNetworkErrors(context.stringValue("DescribeDBInstanceNetworkDetailResponse.NetworkErrors"));

		List<NetworkKey> networkDetail = new ArrayList<NetworkKey>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceNetworkDetailResponse.NetworkDetail.Length"); i++) {
			NetworkKey networkKey = new NetworkKey();
			networkKey.setKey(context.stringValue("DescribeDBInstanceNetworkDetailResponse.NetworkDetail["+ i +"].Key"));
			networkKey.setUnit(context.stringValue("DescribeDBInstanceNetworkDetailResponse.NetworkDetail["+ i +"].Unit"));

			List<NetworkValue> values = new ArrayList<NetworkValue>();
			for (int j = 0; j < context.lengthValue("DescribeDBInstanceNetworkDetailResponse.NetworkDetail["+ i +"].Values.Length"); j++) {
				NetworkValue networkValue = new NetworkValue();
				networkValue.setValue(context.stringValue("DescribeDBInstanceNetworkDetailResponse.NetworkDetail["+ i +"].Values["+ j +"].Value"));
				networkValue.setDateTime(context.stringValue("DescribeDBInstanceNetworkDetailResponse.NetworkDetail["+ i +"].Values["+ j +"].DateTime"));

				values.add(networkValue);
			}
			networkKey.setValues(values);

			networkDetail.add(networkKey);
		}
		describeDBInstanceNetworkDetailResponse.setNetworkDetail(networkDetail);
	 
	 	return describeDBInstanceNetworkDetailResponse;
	}
}