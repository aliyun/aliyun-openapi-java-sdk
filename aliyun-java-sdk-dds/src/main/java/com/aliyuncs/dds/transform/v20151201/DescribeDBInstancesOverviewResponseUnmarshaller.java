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

import com.aliyuncs.dds.model.v20151201.DescribeDBInstancesOverviewResponse;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstancesOverviewResponse.DBInstance;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstancesOverviewResponse.DBInstance.MongosAttribute;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstancesOverviewResponse.DBInstance.ShardAttribute;
import com.aliyuncs.dds.model.v20151201.DescribeDBInstancesOverviewResponse.DBInstance.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesOverviewResponseUnmarshaller {

	public static DescribeDBInstancesOverviewResponse unmarshall(DescribeDBInstancesOverviewResponse describeDBInstancesOverviewResponse, UnmarshallerContext _ctx) {
		
		describeDBInstancesOverviewResponse.setRequestId(_ctx.stringValue("DescribeDBInstancesOverviewResponse.RequestId"));
		describeDBInstancesOverviewResponse.setTotalCount(_ctx.stringValue("DescribeDBInstancesOverviewResponse.TotalCount"));

		List<DBInstance> dBInstances = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancesOverviewResponse.DBInstances.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].ResourceGroupId"));
			dBInstance.setCapacityUnit(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].CapacityUnit"));
			dBInstance.setDestroyTime(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].DestroyTime"));
			dBInstance.setDBInstanceType(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].DBInstanceType"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].DBInstanceId"));
			dBInstance.setNetworkType(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].NetworkType"));
			dBInstance.setLastDowngradeTime(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].LastDowngradeTime"));
			dBInstance.setDBInstanceStorage(_ctx.integerValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].DBInstanceStorage"));
			dBInstance.setEngine(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].Engine"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].DBInstanceDescription"));
			dBInstance.setEngineVersion(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].EngineVersion"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].DBInstanceStatus"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].ZoneId"));
			dBInstance.setReplicationFactor(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].ReplicationFactor"));
			dBInstance.setDBInstanceClass(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].DBInstanceClass"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].LockMode"));
			dBInstance.setChargeType(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].ChargeType"));
			dBInstance.setVpcAuthMode(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].VpcAuthMode"));
			dBInstance.setCreationTime(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].CreationTime"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].RegionId"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].ExpireTime"));
			dBInstance.setKindCode(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].KindCode"));

			List<MongosAttribute> mongosList = new ArrayList<MongosAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].MongosList.Length"); j++) {
				MongosAttribute mongosAttribute = new MongosAttribute();
				mongosAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeClass"));
				mongosAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeDescription"));
				mongosAttribute.setNodeId(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].MongosList["+ j +"].NodeId"));

				mongosList.add(mongosAttribute);
			}
			dBInstance.setMongosList(mongosList);

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setValue(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].Tags["+ j +"].Value"));
				tag.setKey(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].Tags["+ j +"].Key"));

				tags.add(tag);
			}
			dBInstance.setTags(tags);

			List<ShardAttribute> shardList = new ArrayList<ShardAttribute>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].ShardList.Length"); j++) {
				ShardAttribute shardAttribute = new ShardAttribute();
				shardAttribute.setNodeClass(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeClass"));
				shardAttribute.setNodeDescription(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeDescription"));
				shardAttribute.setReadonlyReplicas(_ctx.integerValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].ShardList["+ j +"].ReadonlyReplicas"));
				shardAttribute.setNodeStorage(_ctx.integerValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeStorage"));
				shardAttribute.setNodeId(_ctx.stringValue("DescribeDBInstancesOverviewResponse.DBInstances["+ i +"].ShardList["+ j +"].NodeId"));

				shardList.add(shardAttribute);
			}
			dBInstance.setShardList(shardList);

			dBInstances.add(dBInstance);
		}
		describeDBInstancesOverviewResponse.setDBInstances(dBInstances);
	 
	 	return describeDBInstancesOverviewResponse;
	}
}