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

package com.aliyuncs.hdr.transform.v20170925;

import com.aliyuncs.hdr.model.v20170925.DescribeReplicationResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicationResponseUnmarshaller {

	public static DescribeReplicationResponse unmarshall(DescribeReplicationResponse describeReplicationResponse, UnmarshallerContext _ctx) {
		
		describeReplicationResponse.setRequestId(_ctx.stringValue("DescribeReplicationResponse.RequestId"));
		describeReplicationResponse.setSuccess(_ctx.booleanValue("DescribeReplicationResponse.Success"));
		describeReplicationResponse.setCode(_ctx.stringValue("DescribeReplicationResponse.Code"));
		describeReplicationResponse.setMessage(_ctx.stringValue("DescribeReplicationResponse.Message"));
		describeReplicationResponse.setReplicationId(_ctx.stringValue("DescribeReplicationResponse.ReplicationId"));
		describeReplicationResponse.setGatewayId(_ctx.stringValue("DescribeReplicationResponse.GatewayId"));
		describeReplicationResponse.setGatewayName(_ctx.stringValue("DescribeReplicationResponse.GatewayName"));
		describeReplicationResponse.setInstanceIp(_ctx.stringValue("DescribeReplicationResponse.InstanceIp"));
		describeReplicationResponse.setInstanceName(_ctx.stringValue("DescribeReplicationResponse.InstanceName"));
		describeReplicationResponse.setOsType(_ctx.stringValue("DescribeReplicationResponse.OsType"));
		describeReplicationResponse.setBackupType(_ctx.stringValue("DescribeReplicationResponse.BackupType"));
		describeReplicationResponse.setApplications(_ctx.stringValue("DescribeReplicationResponse.Applications"));
		describeReplicationResponse.setProtectedTime(_ctx.longValue("DescribeReplicationResponse.ProtectedTime"));
		describeReplicationResponse.setStatus(_ctx.stringValue("DescribeReplicationResponse.Status"));
	 
	 	return describeReplicationResponse;
	}
}