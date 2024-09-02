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

package com.aliyuncs.oceanbasepro.transform.v20190901;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.oceanbasepro.model.v20190901.DescribeRestorableTenantsResponse;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeRestorableTenantsResponse.Data;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeRestorableTenantsResponse.Data.BackupSetsItem;
import com.aliyuncs.oceanbasepro.model.v20190901.DescribeRestorableTenantsResponse.Data.TimeIntervalListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeRestorableTenantsResponseUnmarshaller {

	public static DescribeRestorableTenantsResponse unmarshall(DescribeRestorableTenantsResponse describeRestorableTenantsResponse, UnmarshallerContext _ctx) {
		
		describeRestorableTenantsResponse.setRequestId(_ctx.stringValue("DescribeRestorableTenantsResponse.RequestId"));
		describeRestorableTenantsResponse.setTotalCount(_ctx.integerValue("DescribeRestorableTenantsResponse.TotalCount"));

		List<Data> tenants = new ArrayList<Data>();
		for (int i = 0; i < _ctx.lengthValue("DescribeRestorableTenantsResponse.Tenants.Length"); i++) {
			Data data = new Data();
			data.setTenantName(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].TenantName"));
			data.setBizMethod(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].Method"));
			data.setTenantId(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].TenantId"));
			data.setClusterId(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].ClusterId"));
			data.setObRpmVersion(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].ObRpmVersion"));
			data.setObVersion(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].ObVersion"));
			data.setSourceRegion(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].SourceRegion"));
			data.setTenantAlias(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].TenantAlias"));
			data.setCpuNum(_ctx.longValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].CpuNum"));
			data.setMemoryNum(_ctx.longValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].MemoryNum"));
			data.setBackupBucketName(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].BackupBucketName"));
			data.setObTenantId(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].ObTenantId"));
			data.setClusterName(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].ClusterName"));
			data.setUsedDisk(_ctx.longValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].UsedDisk"));
			data.setUnitNum(_ctx.longValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].UnitNum"));
			data.setTenantMode(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].TenantMode"));
			data.setTenantDataBackupRemainDays(_ctx.integerValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].TenantDataBackupRemainDays"));

			List<TimeIntervalListItem> timeIntervalList = new ArrayList<TimeIntervalListItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].TimeIntervalList.Length"); j++) {
				TimeIntervalListItem timeIntervalListItem = new TimeIntervalListItem();
				timeIntervalListItem.setStartTime(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].TimeIntervalList["+ j +"].StartTime"));
				timeIntervalListItem.setEndTime(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].TimeIntervalList["+ j +"].EndTime"));
				timeIntervalListItem.setFromArchive(_ctx.booleanValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].TimeIntervalList["+ j +"].FromArchive"));
				timeIntervalListItem.setStorageType(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].TimeIntervalList["+ j +"].StorageType"));

				timeIntervalList.add(timeIntervalListItem);
			}
			data.setTimeIntervalList(timeIntervalList);

			List<BackupSetsItem> backupSets = new ArrayList<BackupSetsItem>();
			for (int j = 0; j < _ctx.lengthValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].BackupSets.Length"); j++) {
				BackupSetsItem backupSetsItem = new BackupSetsItem();
				backupSetsItem.setCheckpoint(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].BackupSets["+ j +"].Checkpoint"));
				backupSetsItem.setSetId(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].BackupSets["+ j +"].SetId"));
				backupSetsItem.setBackupSetId(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].BackupSets["+ j +"].BackupSetId"));
				backupSetsItem.setTenantId(_ctx.stringValue("DescribeRestorableTenantsResponse.Tenants["+ i +"].BackupSets["+ j +"].TenantId"));

				backupSets.add(backupSetsItem);
			}
			data.setBackupSets(backupSets);

			tenants.add(data);
		}
		describeRestorableTenantsResponse.setTenants(tenants);
	 
	 	return describeRestorableTenantsResponse;
	}
}