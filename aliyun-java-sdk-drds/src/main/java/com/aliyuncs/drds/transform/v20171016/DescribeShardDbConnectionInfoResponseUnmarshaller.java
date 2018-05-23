/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.drds.transform.v20171016;

import com.aliyuncs.drds.model.v20171016.DescribeShardDbConnectionInfoResponse;
import com.aliyuncs.drds.model.v20171016.DescribeShardDbConnectionInfoResponse.ConnectionInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeShardDbConnectionInfoResponseUnmarshaller {

	public static DescribeShardDbConnectionInfoResponse unmarshall(DescribeShardDbConnectionInfoResponse describeShardDbConnectionInfoResponse, UnmarshallerContext context) {
		
		describeShardDbConnectionInfoResponse.setRequestId(context.stringValue("DescribeShardDbConnectionInfoResponse.RequestId"));
		describeShardDbConnectionInfoResponse.setSuccess(context.booleanValue("DescribeShardDbConnectionInfoResponse.Success"));

		ConnectionInfo connectionInfo = new ConnectionInfo();
		connectionInfo.setInstanceName(context.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.InstanceName"));
		connectionInfo.setInstanceUrl(context.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.InstanceUrl"));
		connectionInfo.setSubDbName(context.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.subDbName"));
		connectionInfo.setDbStatus(context.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.dbStatus"));
		connectionInfo.setDbType(context.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.dbType"));
		connectionInfo.setMinPoolSize(context.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.minPoolSize"));
		connectionInfo.setMaxPoolSize(context.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.maxPoolSize"));
		connectionInfo.setIdleTimeOut(context.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.idleTimeOut"));
		connectionInfo.setBlockingTimeout(context.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.blockingTimeout"));
		connectionInfo.setConnectionProperties(context.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.connectionProperties"));
		connectionInfo.setPreparedStatementCacheSize(context.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.preparedStatementCacheSize"));
		connectionInfo.setUserName(context.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.userName"));
		describeShardDbConnectionInfoResponse.setConnectionInfo(connectionInfo);
	 
	 	return describeShardDbConnectionInfoResponse;
	}
}