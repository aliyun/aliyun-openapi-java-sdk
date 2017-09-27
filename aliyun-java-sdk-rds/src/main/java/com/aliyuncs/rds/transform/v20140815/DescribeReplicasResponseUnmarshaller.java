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

import com.aliyuncs.rds.model.v20140815.DescribeReplicasResponse;
import com.aliyuncs.rds.model.v20140815.DescribeReplicasResponse.Items;
import com.aliyuncs.rds.model.v20140815.DescribeReplicasResponse.Items.Items1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicasResponseUnmarshaller {

	public static DescribeReplicasResponse unmarshall(DescribeReplicasResponse describeReplicasResponse, UnmarshallerContext context) {
		
		describeReplicasResponse.setRequestId(context.stringValue("DescribeReplicasResponse.RequestId"));
		describeReplicasResponse.setPageNumber(context.stringValue("DescribeReplicasResponse.PageNumber"));
		describeReplicasResponse.setTotalRecordCount(context.integerValue("DescribeReplicasResponse.TotalRecordCount"));
		describeReplicasResponse.setPageRecordCount(context.integerValue("DescribeReplicasResponse.PageRecordCount"));

		List<Items> replicas = new ArrayList<Items>();
		for (int i = 0; i < context.lengthValue("DescribeReplicasResponse.Replicas.Length"); i++) {
			Items items = new Items();
			items.setReplicaId(context.stringValue("DescribeReplicasResponse.Replicas["+ i +"].ReplicaId"));
			items.setReplicaDescription(context.stringValue("DescribeReplicasResponse.Replicas["+ i +"].ReplicaDescription"));
			items.setReplicaStatus(context.stringValue("DescribeReplicasResponse.Replicas["+ i +"].ReplicaStatus"));

			List<Items1> dBInstances = new ArrayList<Items1>();
			for (int j = 0; j < context.lengthValue("DescribeReplicasResponse.Replicas["+ i +"].DBInstances.Length"); j++) {
				Items1 items1 = new Items1();
				items1.setDBInstanceId(context.stringValue("DescribeReplicasResponse.Replicas["+ i +"].DBInstances["+ j +"].DBInstanceId"));
				items1.setRole(context.stringValue("DescribeReplicasResponse.Replicas["+ i +"].DBInstances["+ j +"].Role"));

				dBInstances.add(items1);
			}
			items.setDBInstances(dBInstances);

			replicas.add(items);
		}
		describeReplicasResponse.setReplicas(replicas);
	 
	 	return describeReplicasResponse;
	}
}