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

import com.aliyuncs.gdb.model.v20190903.DescribeDBInstanceAttributeResponse;
import com.aliyuncs.gdb.model.v20190903.DescribeDBInstanceAttributeResponse.DBInstance;
import com.aliyuncs.gdb.model.v20190903.DescribeDBInstanceAttributeResponse.DBInstance.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceAttributeResponseUnmarshaller {

	public static DescribeDBInstanceAttributeResponse unmarshall(DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));

		List<DBInstance> items = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Items.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].RegionId"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ZoneId"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceId"));
			dBInstance.setDBInstanceType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceType"));
			dBInstance.setDBInstanceDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceDescription"));
			dBInstance.setCategory(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Category"));
			dBInstance.setLockMode(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockMode"));
			dBInstance.setLockReason(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LockReason"));
			dBInstance.setPayType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].PayType"));
			dBInstance.setDBVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBVersion"));
			dBInstance.setDBInstanceStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStatus"));
			dBInstance.setVpcId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VpcId"));
			dBInstance.setVSwitchId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].VSwitchId"));
			dBInstance.setConnectionString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ConnectionString"));
			dBInstance.setPort(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Port"));
			dBInstance.setPublicConnectionString(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].PublicConnectionString"));
			dBInstance.setPublicPort(_ctx.integerValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].PublicPort"));
			dBInstance.setDBNodeStorage(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBNodeStorage"));
			dBInstance.setDBNodeClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBNodeClass"));
			dBInstance.setDBNodeCount(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBNodeCount"));
			dBInstance.setCreationTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CreationTime"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].ExpireTime"));
			dBInstance.setExpired(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Expired"));
			dBInstance.setMaintainTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].MaintainTime"));
			dBInstance.setDBInstanceCPU(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceCPU"));
			dBInstance.setDBInstanceMemory(_ctx.longValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceMemory"));
			dBInstance.setDBInstanceStorageType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceStorageType"));
			dBInstance.setDBInstanceNetworkType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].DBInstanceNetworkType"));
			dBInstance.setCurrentMinorVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].CurrentMinorVersion"));
			dBInstance.setLatestMinorVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].LatestMinorVersion"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Items["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			dBInstance.setTags(tags);

			items.add(dBInstance);
		}
		describeDBInstanceAttributeResponse.setItems(items);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}