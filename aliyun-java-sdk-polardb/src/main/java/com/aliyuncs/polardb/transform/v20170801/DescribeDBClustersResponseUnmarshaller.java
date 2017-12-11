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

import com.aliyuncs.polardb.model.v20170801.DescribeDBClustersResponse;
import com.aliyuncs.polardb.model.v20170801.DescribeDBClustersResponse.DBCluster;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBClustersResponseUnmarshaller {

	public static DescribeDBClustersResponse unmarshall(DescribeDBClustersResponse describeDBClustersResponse, UnmarshallerContext context) {
		
		describeDBClustersResponse.setRequestId(context.stringValue("DescribeDBClustersResponse.RequestId"));
		describeDBClustersResponse.setPageNumber(context.integerValue("DescribeDBClustersResponse.PageNumber"));
		describeDBClustersResponse.setTotalRecordCount(context.integerValue("DescribeDBClustersResponse.TotalRecordCount"));
		describeDBClustersResponse.setPageRecordCount(context.integerValue("DescribeDBClustersResponse.PageRecordCount"));

		List<DBCluster> items = new ArrayList<DBCluster>();
		for (int i = 0; i < context.lengthValue("DescribeDBClustersResponse.Items.Length"); i++) {
			DBCluster dBCluster = new DBCluster();
			dBCluster.setDBClusterId(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterId"));
			dBCluster.setDBClusterDescription(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterDescription"));
			dBCluster.setPayType(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].PayType"));
			dBCluster.setDBClusterNetworkType(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterNetworkType"));
			dBCluster.setRegionId(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].RegionId"));
			dBCluster.setExpireTime(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].ExpireTime"));
			dBCluster.setDBClusterStatus(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBClusterStatus"));
			dBCluster.setEngine(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].Engine"));
			dBCluster.setDBType(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBType"));
			dBCluster.setDBVersion(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].DBVersion"));
			dBCluster.setLockMode(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].LockMode"));
			dBCluster.setLockReason(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].LockReason"));
			dBCluster.setCreateTime(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].CreateTime"));
			dBCluster.setVpcId(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].VpcId"));
			dBCluster.setVSwitchId(context.stringValue("DescribeDBClustersResponse.Items["+ i +"].VSwitchId"));

			items.add(dBCluster);
		}
		describeDBClustersResponse.setItems(items);
	 
	 	return describeDBClustersResponse;
	}
}