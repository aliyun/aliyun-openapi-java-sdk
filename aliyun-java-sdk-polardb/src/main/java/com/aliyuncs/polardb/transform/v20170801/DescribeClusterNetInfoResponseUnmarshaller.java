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
package com.aliyuncs.polardb.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.polardb.model.v20170801.DescribeClusterNetInfoResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeClusterNetInfoResponse.DBInstanceNetInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeClusterNetInfoResponseUnmarshaller {

	public static DescribeClusterNetInfoResponse unmarshall(DescribeClusterNetInfoResponse describeClusterNetInfoResponse, UnmarshallerContext context) {
		
		describeClusterNetInfoResponse.setRequestId(context.stringValue("DescribeClusterNetInfoResponse.RequestId"));
		describeClusterNetInfoResponse.setDBClusterNetworkType(context.stringValue("DescribeClusterNetInfoResponse.DBClusterNetworkType"));

		List<DBInstanceNetInfo> dBInstanceNetInfos = new ArrayList<DBInstanceNetInfo>();
		for (int i = 0; i < context.lengthValue("DescribeClusterNetInfoResponse.DBInstanceNetInfos.Length"); i++) {
			DBInstanceNetInfo dBInstanceNetInfo = new DBInstanceNetInfo();
			dBInstanceNetInfo.setConnectionString(context.stringValue("DescribeClusterNetInfoResponse.DBInstanceNetInfos["+ i +"].ConnectionString"));
			dBInstanceNetInfo.setIPAddress(context.stringValue("DescribeClusterNetInfoResponse.DBInstanceNetInfos["+ i +"].IPAddress"));
			dBInstanceNetInfo.setIPType(context.stringValue("DescribeClusterNetInfoResponse.DBInstanceNetInfos["+ i +"].IPType"));
			dBInstanceNetInfo.setPort(context.stringValue("DescribeClusterNetInfoResponse.DBInstanceNetInfos["+ i +"].Port"));
			dBInstanceNetInfo.setVPCId(context.stringValue("DescribeClusterNetInfoResponse.DBInstanceNetInfos["+ i +"].VPCId"));
			dBInstanceNetInfo.setVSwitchId(context.stringValue("DescribeClusterNetInfoResponse.DBInstanceNetInfos["+ i +"].VSwitchId"));

			dBInstanceNetInfos.add(dBInstanceNetInfo);
		}
		describeClusterNetInfoResponse.setDBInstanceNetInfos(dBInstanceNetInfos);
	 
	 	return describeClusterNetInfoResponse;
	}
}