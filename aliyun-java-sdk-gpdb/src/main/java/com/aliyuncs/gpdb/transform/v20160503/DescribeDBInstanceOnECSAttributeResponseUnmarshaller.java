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
			dBInstanceAttribute.setMasterNodeNum(_ctx.integerValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].MasterNodeNum"));
			dBInstanceAttribute.setSegNodeNum(_ctx.integerValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].SegNodeNum"));
			dBInstanceAttribute.setPort(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].Port"));
			dBInstanceAttribute.setEncryptionKey(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].EncryptionKey"));
			dBInstanceAttribute.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstanceAttribute.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].DBInstanceId"));
			dBInstanceAttribute.setEngine(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].Engine"));
			dBInstanceAttribute.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstanceAttribute.setMemorySize(_ctx.integerValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].MemorySize"));
			dBInstanceAttribute.setEncryptionType(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].EncryptionType"));
			dBInstanceAttribute.setEngineVersion(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].EngineVersion"));
			dBInstanceAttribute.setStorageType(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].StorageType"));
			dBInstanceAttribute.setZoneId(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].ZoneId"));
			dBInstanceAttribute.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstanceAttribute.setDBInstanceClass(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].DBInstanceClass"));
			dBInstanceAttribute.setVSwitchId(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].VSwitchId"));
			dBInstanceAttribute.setStorageSize(_ctx.integerValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].StorageSize"));
			dBInstanceAttribute.setLockMode(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].LockMode"));
			dBInstanceAttribute.setPayType(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].PayType"));
			dBInstanceAttribute.setVpcId(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].VpcId"));
			dBInstanceAttribute.setCpuCores(_ctx.integerValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].CpuCores"));
			dBInstanceAttribute.setConnectionMode(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].ConnectionMode"));
			dBInstanceAttribute.setInstanceDeployType(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].InstanceDeployType"));
			dBInstanceAttribute.setCreationTime(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].CreationTime"));
			dBInstanceAttribute.setRegionId(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].RegionId"));
			dBInstanceAttribute.setExpireTime(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].ExpireTime"));
			dBInstanceAttribute.setConnectionString(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].ConnectionString"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setValue(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].Tags["+ j +"].Value"));
				tag.setKey(_ctx.stringValue("DescribeDBInstanceOnECSAttributeResponse.Items["+ i +"].Tags["+ j +"].Key"));

				tags.add(tag);
			}
			dBInstanceAttribute.setTags(tags);

			items.add(dBInstanceAttribute);
		}
		describeDBInstanceOnECSAttributeResponse.setItems(items);
	 
	 	return describeDBInstanceOnECSAttributeResponse;
	}
}