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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceOnECSAttributeResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceOnECSAttributeResponse.DBInstanceAttribute;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstanceOnECSAttributeResponse.DBInstanceAttribute.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceOnECSAttributeResponseUnmarshaller {

	public static DescribeDBInstanceOnECSAttributeResponse unmarshall(DescribeDBInstanceOnECSAttributeResponse describeDBInstanceOnECSAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceOnECSAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.RequestId"));

		List<DBInstanceAttribute> items = new ArrayList<DBInstanceAttribute>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceOnECSAttributeResponse.Items.Length"); i++) {
			DBInstanceAttribute dBInstanceAttribute = new DBInstanceAttribute();
			dBInstanceAttribute.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setPayType(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setRegionId(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setEngine(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].Engine"));
			dBInstanceAttribute.setEngineVersion(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].EngineVersion"));
			dBInstanceAttribute.setDBInstanceClass(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setLockMode(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setCreationTime(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setExpireTime(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setZoneId(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].ZoneId"));
			dBInstanceAttribute.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setVpcId(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setConnectionMode(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].ConnectionMode"));
			dBInstanceAttribute.setStorageType(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].StorageType"));
			dBInstanceAttribute.setInstanceDeployType(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].InstanceDeployType"));
			dBInstanceAttribute.setSegNodeNum(_ctx.integerValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].SegNodeNum"));
			dBInstanceAttribute.setMemorySize(_ctx.integerValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].MemorySize"));
			dBInstanceAttribute.setCpuCores(_ctx.integerValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].CpuCores"));
			dBInstanceAttribute.setStorageSize(_ctx.integerValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].StorageSize"));
			dBInstanceAttribute.setVSwitchId(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].VSwitchId"));
			dBInstanceAttribute.setConnectionString(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].ConnectionString"));
			dBInstanceAttribute.setPort(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setEncryptionType(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].EncryptionType"));
			dBInstanceAttribute.setEncryptionKey(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].EncryptionKey"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBInstanceAttribute.setTags(tags);

			items.add(dBInstanceAttribute);
		}
		describeDBInstanceOnECSAttributeResponse.setItems(items);
	 
	 	return describeDBInstanceOnECSAttributeResponse;
	}
}