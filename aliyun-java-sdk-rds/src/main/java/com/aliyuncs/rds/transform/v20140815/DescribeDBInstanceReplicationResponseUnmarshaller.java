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

package com.aliyuncs.rds.transform.v20140815;

import com.aliyuncs.rds.model.v20140815.DescribeDBInstanceReplicationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceReplicationResponseUnmarshaller {

	public static DescribeDBInstanceReplicationResponse unmarshall(DescribeDBInstanceReplicationResponse describeDBInstanceReplicationResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceReplicationResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceReplicationResponse.RequestId"));
		describeDBInstanceReplicationResponse.setExternalReplication(_ctx.stringValue("DescribeDBInstanceReplicationResponse.ExternalReplication"));
		describeDBInstanceReplicationResponse.setReplicationSource(_ctx.stringValue("DescribeDBInstanceReplicationResponse.ReplicationSource"));
		describeDBInstanceReplicationResponse.setReplicationState(_ctx.stringValue("DescribeDBInstanceReplicationResponse.ReplicationState"));
		describeDBInstanceReplicationResponse.setReplicationDelay(_ctx.stringValue("DescribeDBInstanceReplicationResponse.ReplicationDelay"));
		describeDBInstanceReplicationResponse.setReplicationErrorMessage(_ctx.stringValue("DescribeDBInstanceReplicationResponse.ReplicationErrorMessage"));
		describeDBInstanceReplicationResponse.setReplicationIp(_ctx.stringValue("DescribeDBInstanceReplicationResponse.ReplicationIp"));
		describeDBInstanceReplicationResponse.setReplicationPort(_ctx.stringValue("DescribeDBInstanceReplicationResponse.ReplicationPort"));
	 
	 	return describeDBInstanceReplicationResponse;
	}
}