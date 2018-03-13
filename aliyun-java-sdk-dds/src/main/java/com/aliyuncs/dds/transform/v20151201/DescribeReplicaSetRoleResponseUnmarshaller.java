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
package com.aliyuncs.dds.transform.v20151201;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dds.model.v20151201.DescribeReplicaSetRoleResponse;
import com.aliyuncs.dds.model.v20151201.DescribeReplicaSetRoleResponse.ReplicaSet;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicaSetRoleResponseUnmarshaller {

	public static DescribeReplicaSetRoleResponse unmarshall(DescribeReplicaSetRoleResponse describeReplicaSetRoleResponse, UnmarshallerContext context) {
		
		describeReplicaSetRoleResponse.setRequestId(context.stringValue("DescribeReplicaSetRoleResponse.RequestId"));
		describeReplicaSetRoleResponse.setDBInstanceId(context.stringValue("DescribeReplicaSetRoleResponse.DBInstanceId"));

		List<ReplicaSet> replicaSets = new ArrayList<ReplicaSet>();
		for (int i = 0; i < context.lengthValue("DescribeReplicaSetRoleResponse.ReplicaSets.Length"); i++) {
			ReplicaSet replicaSet = new ReplicaSet();
			replicaSet.setReplicaSetRole(context.stringValue("DescribeReplicaSetRoleResponse.ReplicaSets["+ i +"].ReplicaSetRole"));
			replicaSet.setConnectionDomain(context.stringValue("DescribeReplicaSetRoleResponse.ReplicaSets["+ i +"].ConnectionDomain"));
			replicaSet.setConnectionPort(context.stringValue("DescribeReplicaSetRoleResponse.ReplicaSets["+ i +"].ConnectionPort"));
			replicaSet.setExpiredTime(context.stringValue("DescribeReplicaSetRoleResponse.ReplicaSets["+ i +"].ExpiredTime"));
			replicaSet.setNetworkType(context.stringValue("DescribeReplicaSetRoleResponse.ReplicaSets["+ i +"].NetworkType"));

			replicaSets.add(replicaSet);
		}
		describeReplicaSetRoleResponse.setReplicaSets(replicaSets);
	 
	 	return describeReplicaSetRoleResponse;
	}
}