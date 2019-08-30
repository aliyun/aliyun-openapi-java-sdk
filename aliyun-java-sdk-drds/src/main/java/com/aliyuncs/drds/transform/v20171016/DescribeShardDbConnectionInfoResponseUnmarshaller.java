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

	public static DescribeShardDbConnectionInfoResponse unmarshall(DescribeShardDbConnectionInfoResponse describeShardDbConnectionInfoResponse, UnmarshallerContext _ctx) {
		
		describeShardDbConnectionInfoResponse.setRequestId(_ctx.stringValue("DescribeShardDbConnectionInfoResponse.RequestId"));
		describeShardDbConnectionInfoResponse.setSuccess(_ctx.booleanValue("DescribeShardDbConnectionInfoResponse.Success"));

		ConnectionInfo connectionInfo = new ConnectionInfo();
		connectionInfo.setInstanceName(_ctx.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.InstanceName"));
		connectionInfo.setInstanceUrl(_ctx.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.InstanceUrl"));
		connectionInfo.setSubDbName(_ctx.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.subDbName"));
		connectionInfo.setDbStatus(_ctx.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.dbStatus"));
		connectionInfo.setDbType(_ctx.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.dbType"));
		connectionInfo.setMinPoolSize(_ctx.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.minPoolSize"));
		connectionInfo.setMaxPoolSize(_ctx.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.maxPoolSize"));
		connectionInfo.setIdleTimeOut(_ctx.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.idleTimeOut"));
		connectionInfo.setBlockingTimeout(_ctx.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.blockingTimeout"));
		connectionInfo.setConnectionProperties(_ctx.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.connectionProperties"));
		connectionInfo.setPreparedStatementCacheSize(_ctx.integerValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.preparedStatementCacheSize"));
		connectionInfo.setUserName(_ctx.stringValue("DescribeShardDbConnectionInfoResponse.ConnectionInfo.userName"));
		describeShardDbConnectionInfoResponse.setConnectionInfo(connectionInfo);
	 
	 	return describeShardDbConnectionInfoResponse;
	}
}