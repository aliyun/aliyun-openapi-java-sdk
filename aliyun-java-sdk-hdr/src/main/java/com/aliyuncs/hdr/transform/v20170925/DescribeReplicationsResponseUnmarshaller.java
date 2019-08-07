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

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.hdr.model.v20170925.DescribeReplicationsResponse;
import com.aliyuncs.hdr.model.v20170925.DescribeReplicationsResponse.Replication;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicationsResponseUnmarshaller {

	public static DescribeReplicationsResponse unmarshall(DescribeReplicationsResponse describeReplicationsResponse, UnmarshallerContext _ctx) {
		
		describeReplicationsResponse.setRequestId(_ctx.stringValue("DescribeReplicationsResponse.RequestId"));
		describeReplicationsResponse.setSuccess(_ctx.booleanValue("DescribeReplicationsResponse.Success"));
		describeReplicationsResponse.setCode(_ctx.stringValue("DescribeReplicationsResponse.Code"));
		describeReplicationsResponse.setMessage(_ctx.stringValue("DescribeReplicationsResponse.Message"));
		describeReplicationsResponse.setTotalCount(_ctx.integerValue("DescribeReplicationsResponse.TotalCount"));
		describeReplicationsResponse.setPageNumber(_ctx.integerValue("DescribeReplicationsResponse.PageNumber"));
		describeReplicationsResponse.setPageSize(_ctx.integerValue("DescribeReplicationsResponse.PageSize"));

		List<Replication> replications = new ArrayList<Replication>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReplicationsResponse.Replications.Length"); i++) {
			Replication replication = new Replication();
			replication.setReplicationId(_ctx.stringValue("DescribeReplicationsResponse.Replications["+ i +"].ReplicationId"));
			replication.setGatewayId(_ctx.stringValue("DescribeReplicationsResponse.Replications["+ i +"].GatewayId"));
			replication.setGatewayName(_ctx.stringValue("DescribeReplicationsResponse.Replications["+ i +"].GatewayName"));
			replication.setInstanceIp(_ctx.stringValue("DescribeReplicationsResponse.Replications["+ i +"].InstanceIp"));
			replication.setInstanceName(_ctx.stringValue("DescribeReplicationsResponse.Replications["+ i +"].InstanceName"));
			replication.setOsType(_ctx.stringValue("DescribeReplicationsResponse.Replications["+ i +"].OsType"));
			replication.setBackupType(_ctx.stringValue("DescribeReplicationsResponse.Replications["+ i +"].BackupType"));
			replication.setApplications(_ctx.stringValue("DescribeReplicationsResponse.Replications["+ i +"].Applications"));
			replication.setProtectedTime(_ctx.longValue("DescribeReplicationsResponse.Replications["+ i +"].ProtectedTime"));
			replication.setStatus(_ctx.stringValue("DescribeReplicationsResponse.Replications["+ i +"].Status"));

			replications.add(replication);
		}
		describeReplicationsResponse.setReplications(replications);
	 
	 	return describeReplicationsResponse;
	}
}