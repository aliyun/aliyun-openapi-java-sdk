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

package com.aliyuncs.gdb.transform.v20190903;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gdb.model.v20190903.DescribeDBInstancesResponse;
import com.aliyuncs.gdb.model.v20190903.DescribeDBInstancesResponse.DBInstance;
import com.aliyuncs.gdb.model.v20190903.DescribeDBInstancesResponse.DBInstance.ReadOnlyDBInstanceId;
import com.aliyuncs.gdb.model.v20190903.DescribeDBInstancesResponse.DBInstance.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesResponseUnmarshaller {

	public static DescribeDBInstancesResponse unmarshall(DescribeDBInstancesResponse describeDBInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDBInstancesResponse.setRequestId(_ctx.stringValue("DescribeDBInstancesResponse.RequestId"));
		describeDBInstancesResponse.setPageSize(_ctx.integerValue("DescribeDBInstancesResponse.PageSize"));
		describeDBInstancesResponse.setPageNumber(_ctx.integerValue("DescribeDBInstancesResponse.PageNumber"));
		describeDBInstancesResponse.setTotalCount(_ctx.integerValue("DescribeDBInstancesResponse.TotalCount"));

		List<DBInstance> items = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancesResponse.Items.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setVpcId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VpcId"));
			dBInstance.setDBNodeCount(_ctx.longValue("DescribeDBInstancesResponse.Items["+ i +"].DBNodeCount"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ExpireTime"));
			dBInstance.setDBNodeStorage(_ctx.longValue("DescribeDBInstancesResponse.Items["+ i +"].DBNodeStorage"));
			dBInstance.setExpired(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Expired"));
			dBInstance.setCreateTime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].CreateTime"));
			dBInstance.setDBInstanceType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceType"));
			dBInstance.setDBNodeClass(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBNodeClass"));
			dBInstance.setPayType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].PayType"));
			dBInstance.setLockReason(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockReason"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockMode"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].RegionId"));
			dBInstance.setDBVersion(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBVersion"));
			dBInstance.setVSwitchId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VSwitchId"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ZoneId"));
			dBInstance.setMasterInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].MasterInstanceId"));
			dBInstance.setCategory(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Category"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ResourceGroupId"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBInstance.setTags(tags);

			List<ReadOnlyDBInstanceId> readOnlyDBInstanceIds = new ArrayList<ReadOnlyDBInstanceId>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.Items["+ i +"].ReadOnlyDBInstanceIds.Length"); j++) {
				ReadOnlyDBInstanceId readOnlyDBInstanceId = new ReadOnlyDBInstanceId();
				readOnlyDBInstanceId.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ReadOnlyDBInstanceIds["+ j +"].DBInstanceId"));

				readOnlyDBInstanceIds.add(readOnlyDBInstanceId);
			}
			dBInstance.setReadOnlyDBInstanceIds(readOnlyDBInstanceIds);

			items.add(dBInstance);
		}
		describeDBInstancesResponse.setItems(items);
	 
	 	return describeDBInstancesResponse;
	}
}