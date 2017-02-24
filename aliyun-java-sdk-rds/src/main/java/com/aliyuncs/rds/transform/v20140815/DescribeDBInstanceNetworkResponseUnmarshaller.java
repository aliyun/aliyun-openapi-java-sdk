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

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetworkResponse;
import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceNetworkResponse.Topology;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceNetworkResponseUnmarshaller {

	public static DescribeDBInstanceNetworkResponse unmarshall(DescribeDBInstanceNetworkResponse describeDBInstanceNetworkResponse, UnmarshallerContext context) {
		
		describeDBInstanceNetworkResponse.setRequestId(context.stringValue("DescribeDBInstanceNetworkResponse.RequestId"));
		describeDBInstanceNetworkResponse.setDBInstanceId(context.stringValue("DescribeDBInstanceNetworkResponse.DBInstanceId"));
		describeDBInstanceNetworkResponse.setStartTime(context.stringValue("DescribeDBInstanceNetworkResponse.StartTime"));
		describeDBInstanceNetworkResponse.setEndTime(context.stringValue("DescribeDBInstanceNetworkResponse.EndTime"));

		List<Topology> topologys = new ArrayList<Topology>();
		for (int i = 0; i < context.lengthValue("DescribeDBInstanceNetworkResponse.Topology.Length"); i++) {
			Topology topology = new Topology();
			topology.setStartPoint(context.stringValue("DescribeDBInstanceNetworkResponse.Topology["+ i +"].StartPoint"));
			topology.setEndPoint(context.stringValue("DescribeDBInstanceNetworkResponse.Topology["+ i +"].EndPoint"));
			topology.setNetworkTrafficIn(context.stringValue("DescribeDBInstanceNetworkResponse.Topology["+ i +"].NetworkTrafficIn"));
			topology.setNetworkTrafficOut(context.stringValue("DescribeDBInstanceNetworkResponse.Topology["+ i +"].NetworkTrafficOut"));
			topology.setNetworkLatency(context.stringValue("DescribeDBInstanceNetworkResponse.Topology["+ i +"].NetworkLatency"));
			topology.setBackendLatency(context.stringValue("DescribeDBInstanceNetworkResponse.Topology["+ i +"].BackendLatency"));
			topology.setNetworkErrors(context.stringValue("DescribeDBInstanceNetworkResponse.Topology["+ i +"].NetworkErrors"));

			topologys.add(topology);
		}
		describeDBInstanceNetworkResponse.setTopology(topologys);
	 
	 	return describeDBInstanceNetworkResponse;
	}
}
