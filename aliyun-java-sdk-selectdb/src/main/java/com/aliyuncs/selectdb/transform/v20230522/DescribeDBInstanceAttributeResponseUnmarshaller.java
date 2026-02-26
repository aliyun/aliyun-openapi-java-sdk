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

import com.aliyuncs.selectdb.model.v20230522.DescribeDBInstanceAttributeResponse;
import com.aliyuncs.selectdb.model.v20230522.DescribeDBInstanceAttributeResponse.DbClusterListItem;
import com.aliyuncs.selectdb.model.v20230522.DescribeDBInstanceAttributeResponse.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeDBInstanceAttributeResponseUnmarshaller {

	public static DescribeDBInstanceAttributeResponse unmarshall(DescribeDBInstanceAttributeResponse describeDBInstanceAttributeResponse, UnmarshallerContext _ctx) {
		
		describeDBInstanceAttributeResponse.setRequestId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.RequestId"));
		describeDBInstanceAttributeResponse.setStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Status"));
		describeDBInstanceAttributeResponse.setSubDomain(_ctx.stringValue("DescribeDBInstanceAttributeResponse.SubDomain"));
		describeDBInstanceAttributeResponse.setGmtModified(_ctx.stringValue("DescribeDBInstanceAttributeResponse.GmtModified"));
		describeDBInstanceAttributeResponse.setLockMode(_ctx.longValue("DescribeDBInstanceAttributeResponse.LockMode"));
		describeDBInstanceAttributeResponse.setLockReason(_ctx.stringValue("DescribeDBInstanceAttributeResponse.LockReason"));
		describeDBInstanceAttributeResponse.setResourceCpu(_ctx.longValue("DescribeDBInstanceAttributeResponse.ResourceCpu"));
		describeDBInstanceAttributeResponse.setStorageSize(_ctx.longValue("DescribeDBInstanceAttributeResponse.StorageSize"));
		describeDBInstanceAttributeResponse.setObjectStoreSize(_ctx.longValue("DescribeDBInstanceAttributeResponse.ObjectStoreSize"));
		describeDBInstanceAttributeResponse.setMaintainStarttime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.MaintainStarttime"));
		describeDBInstanceAttributeResponse.setMaintainEndtime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.MaintainEndtime"));
		describeDBInstanceAttributeResponse.setEngine(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Engine"));
		describeDBInstanceAttributeResponse.setEngineVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.EngineVersion"));
		describeDBInstanceAttributeResponse.setEngineMinorVersion(_ctx.stringValue("DescribeDBInstanceAttributeResponse.EngineMinorVersion"));
		describeDBInstanceAttributeResponse.setDBInstanceId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBInstanceId"));
		describeDBInstanceAttributeResponse.setDescription(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Description"));
		describeDBInstanceAttributeResponse.setCreateTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.CreateTime"));
		describeDBInstanceAttributeResponse.setChargeType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.ChargeType"));
		describeDBInstanceAttributeResponse.setExpireTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.ExpireTime"));
		describeDBInstanceAttributeResponse.setResourceGroupId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.ResourceGroupId"));
		describeDBInstanceAttributeResponse.setRegionId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.RegionId"));
		describeDBInstanceAttributeResponse.setZoneId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.ZoneId"));
		describeDBInstanceAttributeResponse.setVpcId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.VpcId"));

		List<String> canUpgradeVersions = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.CanUpgradeVersions.Length"); i++) {
			canUpgradeVersions.add(_ctx.stringValue("DescribeDBInstanceAttributeResponse.CanUpgradeVersions["+ i +"]"));
		}
		describeDBInstanceAttributeResponse.setCanUpgradeVersions(canUpgradeVersions);

		List<DbClusterListItem> dBClusterList = new ArrayList<DbClusterListItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.DBClusterList.Length"); i++) {
			DbClusterListItem dbClusterListItem = new DbClusterListItem();
			dbClusterListItem.setDbInstanceName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].DbInstanceName"));
			dbClusterListItem.setDbClusterId(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].DbClusterId"));
			dbClusterListItem.setDbClusterName(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].DbClusterName"));
			dbClusterListItem.setStatus(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].Status"));
			dbClusterListItem.setCreatedTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].CreatedTime"));
			dbClusterListItem.setDbClusterClass(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].DbClusterClass"));
			dbClusterListItem.setCpuCores(_ctx.longValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].CpuCores"));
			dbClusterListItem.setMemory(_ctx.longValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].Memory"));
			dbClusterListItem.setCacheStorageType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].CacheStorageType"));
			dbClusterListItem.setPerformanceLevel(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].PerformanceLevel"));
			dbClusterListItem.setCacheStorageSizeGB(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].CacheStorageSizeGB"));
			dbClusterListItem.setStartTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].StartTime"));
			dbClusterListItem.setChargeType(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].ChargeType"));
			dbClusterListItem.setModifiedTime(_ctx.stringValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].ModifiedTime"));
			dbClusterListItem.setScalingRulesEnable(_ctx.booleanValue("DescribeDBInstanceAttributeResponse.DBClusterList["+ i +"].ScalingRulesEnable"));

			dBClusterList.add(dbClusterListItem);
		}
		describeDBInstanceAttributeResponse.setDBClusterList(dBClusterList);

		List<TagsItem> tags = new ArrayList<TagsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeDBInstanceAttributeResponse.Tags.Length"); i++) {
			TagsItem tagsItem = new TagsItem();
			tagsItem.setTagKey(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Tags["+ i +"].TagKey"));
			tagsItem.setTagValue(_ctx.stringValue("DescribeDBInstanceAttributeResponse.Tags["+ i +"].TagValue"));

			tags.add(tagsItem);
		}
		describeDBInstanceAttributeResponse.setTags(tags);
	 
	 	return describeDBInstanceAttributeResponse;
	}
}