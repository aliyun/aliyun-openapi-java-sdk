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
package com.aliyuncs.drds.transform.v20150413;

import com.aliyuncs.drds.model.v20150413.DescribeShardDbConnectionInfoResponse;
import com.aliyuncs.drds.model.v20150413.DescribeShardDbConnectionInfoResponse.ConnectionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeShardDbConnectionInfoResponseUnmarshaller {

	public static DescribeShardDbConnectionInfoResponse unmarshall(DescribeShardDbConnectionInfoResponse describeShardDbConnectionInfoResponse, UnmarshallerContext context) {
		
		describeShardDbConnectionInfoResponse.setRequestId(context.stringValue("DescribeShardDbConnectionInfoResponse.RequestId"));
		describeShardDbConnectionInfoResponse.setSuccess(context.booleanValue("DescribeShardDbConnectionInfoResponse.Success"));

		ConnectionInfo connectionInfo = new ConnectionInfo();
		connectionInfo.setInstanceName(context.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.InstanceName"));
		connectionInfo.setInstanceUrl(context.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.InstanceUrl"));
		connectionInfo.setsubDbName(context.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.subDbName"));
		connectionInfo.setdbStatus(context.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.dbStatus"));
		connectionInfo.setdbType(context.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.dbType"));
		connectionInfo.setminPoolSize(context.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.minPoolSize"));
		connectionInfo.setmaxPoolSize(context.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.maxPoolSize"));
		connectionInfo.setidleTimeOut(context.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.idleTimeOut"));
		connectionInfo.setblockingTimeout(context.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.blockingTimeout"));
		connectionInfo.setconnectionProperties(context.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.connectionProperties"));
		connectionInfo.setpreparedStatementCacheSize(context.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.preparedStatementCacheSize"));
		connectionInfo.setuserName(context.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.userName"));
		describeShardDbConnectionInfoResponse.setConnectionInfo(connectionInfo);
	 
	 	return describeShardDbConnectionInfoResponse;
	}
}