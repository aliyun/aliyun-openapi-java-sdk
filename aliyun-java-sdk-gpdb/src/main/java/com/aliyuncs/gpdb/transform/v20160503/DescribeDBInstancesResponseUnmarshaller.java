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

import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstancesResponse;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstancesResponse.DBInstance;
import com.aliyuncs.gpdb.model.v20160503.DescribeDBInstancesResponse.DBInstance.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesResponseUnmarshaller {

	public static DescribeDBInstancesResponse unmarshall(DescribeDBInstancesResponse describeDBInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDBInstancesResponse.setRequestId(_ctx.stringValue("DescribeDBInstancesResponse.RequestId"));
		describeDBInstancesResponse.setTotalRecordCount(_ctx.integerValue("DescribeDBInstancesResponse.TotalRecordCount"));
		describeDBInstancesResponse.setPageRecordCount(_ctx.integerValue("DescribeDBInstancesResponse.PageRecordCount"));
		describeDBInstancesResponse.setPageNumber(_ctx.integerValue("DescribeDBInstancesResponse.PageNumber"));

		List<DBInstance> items = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancesResponse.Items.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setMasterNodeNum(_ctx.integerValue("DescribeDBInstancesResponse.Items["+ i +"].MasterNodeNum"));
			dBInstance.setEngineVersion(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].EngineVersion"));
			dBInstance.setStorageType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].StorageType"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ZoneId"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstance.setDBInstanceNetType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstance.setSegNodeNum(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].SegNodeNum"));
			dBInstance.setVSwitchId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VSwitchId"));
			dBInstance.setCreateTime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].CreateTime"));
			dBInstance.setStorageSize(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].StorageSize"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockMode"));
			dBInstance.setPayType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].PayType"));
			dBInstance.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstance.setVpcId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VpcId"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceId"));
			dBInstance.setConnectionMode(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ConnectionMode"));
			dBInstance.setInstanceDeployType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].InstanceDeployType"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].RegionId"));
			dBInstance.setLockReason(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockReason"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ExpireTime"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstance.setEngine(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Engine"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setValue(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Tags["+ j +"].Value"));
				tag.setKey(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Tags["+ j +"].Key"));

				tags.add(tag);
			}
			dBInstance.setTags(tags);

			items.add(dBInstance);
		}
		describeDBInstancesResponse.setItems(items);
	 
	 	return describeDBInstancesResponse;
	}
}