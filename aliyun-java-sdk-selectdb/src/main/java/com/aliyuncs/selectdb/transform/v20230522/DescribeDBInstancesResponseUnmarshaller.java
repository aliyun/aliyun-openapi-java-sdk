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

package com.aliyuncs.selectdb.transform.v20230522;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.selectdb.model.v20230522.DescribeDBInstancesResponse;
import com.aliyuncs.selectdb.model.v20230522.DescribeDBInstancesResponse.DBInstance;
import com.aliyuncs.selectdb.model.v20230522.DescribeDBInstancesResponse.DBInstance.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstancesResponseUnmarshaller {

	public static DescribeDBInstancesResponse unmarshall(DescribeDBInstancesResponse describeDBInstancesResponse, UnmarshallerContext _ctx) {
		
		describeDBInstancesResponse.setRequestId(_ctx.stringValue("DescribeDBInstancesResponse.RequestId"));
		describeDBInstancesResponse.setPageNumber(_ctx.longValue("DescribeDBInstancesResponse.PageNumber"));
		describeDBInstancesResponse.setPageSize(_ctx.longValue("DescribeDBInstancesResponse.PageSize"));
		describeDBInstancesResponse.setTotalRecordCount(_ctx.longValue("DescribeDBInstancesResponse.TotalRecordCount"));

		List<DBInstance> items = new ArrayList<DBInstance>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstancesResponse.Items.Length"); i++) {
			DBInstance dBInstance = new DBInstance();
			dBInstance.setConnectionString(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].connectionString"));
			dBInstance.setDBInstanceId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].DBInstanceId"));
			dBInstance.setDescription(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Description"));
			dBInstance.setEngine(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Engine"));
			dBInstance.setEngineVersion(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].EngineVersion"));
			dBInstance.setInstanceUsedType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].InstanceUsedType"));
			dBInstance.setRegionId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].RegionId"));
			dBInstance.setZoneId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ZoneId"));
			dBInstance.setChargeType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ChargeType"));
			dBInstance.setCategory(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Category"));
			dBInstance.setStatus(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Status"));
			dBInstance.setVpcId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VpcId"));
			dBInstance.setVswitchId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].VswitchId"));
			dBInstance.setResourceCpu(_ctx.longValue("DescribeDBInstancesResponse.Items["+ i +"].ResourceCpu"));
			dBInstance.setResourceMemory(_ctx.longValue("DescribeDBInstancesResponse.Items["+ i +"].ResourceMemory"));
			dBInstance.setScaleMin(_ctx.longValue("DescribeDBInstancesResponse.Items["+ i +"].ScaleMin"));
			dBInstance.setScaleMax(_ctx.longValue("DescribeDBInstancesResponse.Items["+ i +"].ScaleMax"));
			dBInstance.setScaleReplica(_ctx.longValue("DescribeDBInstancesResponse.Items["+ i +"].ScaleReplica"));
			dBInstance.setStorageSize(_ctx.longValue("DescribeDBInstancesResponse.Items["+ i +"].StorageSize"));
			dBInstance.setStorageType(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].StorageType"));
			dBInstance.setObjectStoreSize(_ctx.longValue("DescribeDBInstancesResponse.Items["+ i +"].ObjectStoreSize"));
			dBInstance.setExpireTime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ExpireTime"));
			dBInstance.setLockMode(_ctx.longValue("DescribeDBInstancesResponse.Items["+ i +"].LockMode"));
			dBInstance.setLockReason(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].LockReason"));
			dBInstance.setIsDeleted(_ctx.booleanValue("DescribeDBInstancesResponse.Items["+ i +"].IsDeleted"));
			dBInstance.setMaintainStarttime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].MaintainStarttime"));
			dBInstance.setMaintainEndtime(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].MaintainEndtime"));
			dBInstance.setGmtCreated(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].GmtCreated"));
			dBInstance.setGmtModified(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].GmtModified"));
			dBInstance.setParentInstance(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ParentInstance"));
			dBInstance.setResourceGroupId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].ResourceGroupId"));
			dBInstance.setMaintainStartTimeStr(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].MaintainStartTimeStr"));
			dBInstance.setMaintainEndTimeStr(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].MaintainEndTimeStr"));
			dBInstance.setTenantClusterId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].TenantClusterId"));
			dBInstance.setTenantToken(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].TenantToken"));
			dBInstance.setTenantUserId(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].TenantUserId"));
			dBInstance.setClusterCount(_ctx.integerValue("DescribeDBInstancesResponse.Items["+ i +"].ClusterCount"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeDBInstancesResponse.Items["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setTagKey(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Tags["+ j +"].TagKey"));
				tagsItem.setTagValue(_ctx.stringValue("DescribeDBInstancesResponse.Items["+ i +"].Tags["+ j +"].TagValue"));

				tags.add(tagsItem);
			}
			dBInstance.setTags(tags);

			items.add(dBInstance);
		}
		describeDBInstancesResponse.setItems(items);
	 
	 	return describeDBInstancesResponse;
	}
}