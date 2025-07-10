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
		describeDBInstancesResponse.setPageNumber(_ctx.integerValue("DescribeDBInstancesResponse.PageNumber"));
		describeDBInstancesResponse.setPageRecordCount(_ctx.integerValue("DescribeDBInstancesResponse.PageRecordCount"));
		describeDBInstancesResponse.setTotalRecordCount(_ctx.integerValue("DescribeDBInstancesResponse.TotalRecordCount"));

		List<DBInstance> items = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancesResponse.Items.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setConnectionMode(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ConnectionMode"));
			dBInstance.setCreateTime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].CreateTime"));
			dBInstance.setDBInstanceCategory(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceCategory"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceMode(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceMode"));
			dBInstance.setDBInstanceNetType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceNetType"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstance.setEngine(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Engine"));
			dBInstance.setEngineVersion(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].EngineVersion"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ExpireTime"));
			dBInstance.setInstanceDeployType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].InstanceDeployType"));
			dBInstance.setInstanceNetworkType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].InstanceNetworkType"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockMode"));
			dBInstance.setLockReason(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockReason"));
			dBInstance.setMasterNodeNum(_ctx.integerValue("DescribeDBInstancesResponse.Items["+ i +"].MasterNodeNum"));
			dBInstance.setPayType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].PayType"));
			dBInstance.setProdType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ProdType"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].RegionId"));
			dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ResourceGroupId"));
			dBInstance.setSegNodeNum(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].SegNodeNum"));
			dBInstance.setServerlessMode(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ServerlessMode"));
			dBInstance.setStorageSize(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].StorageSize"));
			dBInstance.setStorageType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].StorageType"));
			dBInstance.setVSwitchId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VSwitchId"));
			dBInstance.setVpcId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VpcId"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ZoneId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBInstance.setTags(tags);

			items.add(dBInstance);
		}
		describeDBInstancesResponse.setItems(items);
	 
	 	return describeDBInstancesResponse;
	}
}