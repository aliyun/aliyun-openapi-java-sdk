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

package com.aliyuncs.rds.transform.v20140815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.rds.model.v20140815.DescribeCrossRegionBackupsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeCrossRegionBackupsResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCrossRegionBackupsResponseUnmarshaller {

	public static DescribeCrossRegionBackupsResponse unmarshall(DescribeCrossRegionBackupsResponse describeCrossRegionBackupsResponse, UnmarshallerContext _ctx) {
		
		describeCrossRegionBackupsResponse.setRequestId(_ctx.stringValue("DescribeCrossRegionBackupsResponse.RequestId"));
		describeCrossRegionBackupsResponse.setRegionId(_ctx.stringValue("DescribeCrossRegionBackupsResponse.RegionId"));
		describeCrossRegionBackupsResponse.setStartTime(_ctx.stringValue("DescribeCrossRegionBackupsResponse.StartTime"));
		describeCrossRegionBackupsResponse.setEndTime(_ctx.stringValue("DescribeCrossRegionBackupsResponse.EndTime"));
		describeCrossRegionBackupsResponse.setTotalRecordCount(_ctx.integerValue("DescribeCrossRegionBackupsResponse.TotalRecordCount"));
		describeCrossRegionBackupsResponse.setPageRecordCount(_ctx.integerValue("DescribeCrossRegionBackupsResponse.PageRecordCount"));
		describeCrossRegionBackupsResponse.setPageNumber(_ctx.integerValue("DescribeCrossRegionBackupsResponse.PageNumber"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCrossRegionBackupsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setCrossBackupId(_ctx.integerValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupId"));
			item.setCrossBackupRegion(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupRegion"));
			item.setBackupSetStatus(_ctx.integerValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupSetStatus"));
			item.setBackupStartTime(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupStartTime"));
			item.setBackupEndTime(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupEndTime"));
			item.setBackupType(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupType"));
			item.setBackupMethod(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupMethod"));
			item.setCrossBackupSetSize(_ctx.longValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupSetSize"));
			item.setCrossBackupSetFile(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupSetFile"));
			item.setCrossBackupDownloadLink(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupDownloadLink"));
			item.setEngine(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].Engine"));
			item.setEngineVersion(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].EngineVersion"));
			item.setCrossBackupSetLocation(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupSetLocation"));
			item.setBackupSetScale(_ctx.integerValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupSetScale"));
			item.setInstanceId(_ctx.integerValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].InstanceId"));
			item.setDBInstanceStorageType(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].DBInstanceStorageType"));
			item.setCategory(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].Category"));
			item.setConsistentTime(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].ConsistentTime"));
			item.setHasBackupTableMeta(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].HasBackupTableMeta"));

			List<String> restoreRegions = new ArrayList<String>();
			for (int j = 0; j < _ctx.lengthValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].RestoreRegions.Length"); j++) {
				restoreRegions.add(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].RestoreRegions["+ j +"]"));
			}
			item.setRestoreRegions(restoreRegions);

			items.add(item);
		}
		describeCrossRegionBackupsResponse.setItems(items);
	 
	 	return describeCrossRegionBackupsResponse;
	}
}