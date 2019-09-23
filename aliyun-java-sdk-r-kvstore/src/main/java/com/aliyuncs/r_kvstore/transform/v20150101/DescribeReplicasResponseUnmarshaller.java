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

package com.aliyuncs.r_kvstore.transform.v20150101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.r_kvstore.model.v20150101.DescribeReplicasResponse;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeReplicasResponse.Items;
import com.aliyuncs.r_kvstore.model.v20150101.DescribeReplicasResponse.Items.Items1;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeReplicasResponseUnmarshaller {

	public static DescribeReplicasResponse unmarshall(DescribeReplicasResponse describeReplicasResponse, UnmarshallerContext _ctx) {
		
		describeReplicasResponse.setRequestId(_ctx.stringValue("DescribeReplicasResponse.RequestId"));
		describeReplicasResponse.setPageNumber(_ctx.stringValue("DescribeReplicasResponse.PageNumber"));
		describeReplicasResponse.setTotalRecordCount(_ctx.integerValue("DescribeReplicasResponse.TotalRecordCount"));
		describeReplicasResponse.setPageRecordCount(_ctx.integerValue("DescribeReplicasResponse.PageRecordCount"));

		List<Items> replicas = new ArrayList<Items>();
		for (int i = 0; i < _ctx.lengthValue("DescribeReplicasResponse.Replicas.Length"); i++) {
			Items items = new Items();
			items.setReplicaId(_ctx.stringValue("DescribeReplicasResponse.Replicas["+ i +"].ReplicaId"));
			items.setReplicaDescription(_ctx.stringValue("DescribeReplicasResponse.Replicas["+ i +"].ReplicaDescription"));
			items.setReplicaStatus(_ctx.stringValue("DescribeReplicasResponse.Replicas["+ i +"].ReplicaStatus"));
			items.setReplicaMode(_ctx.stringValue("DescribeReplicasResponse.Replicas["+ i +"].ReplicaMode"));
			items.setDomainMode(_ctx.stringValue("DescribeReplicasResponse.Replicas["+ i +"].DomainMode"));

			List<Items1> dBInstances = new ArrayList<Items1>();
			for (int j = 0; j < _ctx.lengthValue("DescribeReplicasResponse.Replicas["+ i +"].DBInstances.Length"); j++) {
				Items1 items1 = new Items1();
				items1.setDBInstanceId(_ctx.stringValue("DescribeReplicasResponse.Replicas["+ i +"].DBInstances["+ j +"].DBInstanceId"));
				items1.setRole(_ctx.stringValue("DescribeReplicasResponse.Replicas["+ i +"].DBInstances["+ j +"].Role"));
				items1.setReadWriteType(_ctx.stringValue("DescribeReplicasResponse.Replicas["+ i +"].DBInstances["+ j +"].ReadWriteType"));
				items1.setInstanceNetworkType(_ctx.stringValue("DescribeReplicasResponse.Replicas["+ i +"].DBInstances["+ j +"].InstanceNetworkType"));
				items1.setDBInstanceDescription(_ctx.stringValue("DescribeReplicasResponse.Replicas["+ i +"].DBInstances["+ j +"].DBInstanceDescription"));
				items1.setDBInstanceStatus(_ctx.stringValue("DescribeReplicasResponse.Replicas["+ i +"].DBInstances["+ j +"].DBInstanceStatus"));
				items1.setEngine(_ctx.stringValue("DescribeReplicasResponse.Replicas["+ i +"].DBInstances["+ j +"].Engine"));
				items1.setRegionId(_ctx.stringValue("DescribeReplicasResponse.Replicas["+ i +"].DBInstances["+ j +"].RegionId"));

				dBInstances.add(items1);
			}
			items.setDBInstances(dBInstances);

			replicas.add(items);
		}
		describeReplicasResponse.setReplicas(replicas);
	 
	 	return describeReplicasResponse;
	}
}