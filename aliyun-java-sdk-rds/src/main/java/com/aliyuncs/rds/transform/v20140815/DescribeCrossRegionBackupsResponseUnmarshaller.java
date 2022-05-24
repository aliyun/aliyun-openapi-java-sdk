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
		describeCrossRegionBackupsResponse.setEndTime(_ctx.stringValue("DescribeCrossRegionBackupsResponse.EndTime"));
		describeCrossRegionBackupsResponse.setStartTime(_ctx.stringValue("DescribeCrossRegionBackupsResponse.StartTime"));
		describeCrossRegionBackupsResponse.setPageRecordCount(_ctx.integerValue("DescribeCrossRegionBackupsResponse.PageRecordCount"));
		describeCrossRegionBackupsResponse.setTotalRecordCount(_ctx.integerValue("DescribeCrossRegionBackupsResponse.TotalRecordCount"));
		describeCrossRegionBackupsResponse.setPageNumber(_ctx.integerValue("DescribeCrossRegionBackupsResponse.PageNumber"));
		describeCrossRegionBackupsResponse.setRegionId(_ctx.stringValue("DescribeCrossRegionBackupsResponse.RegionId"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCrossRegionBackupsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setConsistentTime(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].ConsistentTime"));
			item.setDBInstanceStorageType(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].DBInstanceStorageType"));
			item.setCrossBackupId(_ctx.integerValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupId"));
			item.setBackupType(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupType"));
			item.setBackupStartTime(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupStartTime"));
			item.setCrossBackupSetLocation(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupSetLocation"));
			item.setInstanceId(_ctx.integerValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].InstanceId"));
			item.setCrossBackupDownloadLink(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupDownloadLink"));
			item.setBackupEndTime(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupEndTime"));
			item.setEngineVersion(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].EngineVersion"));
			item.setBackupSetStatus(_ctx.integerValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupSetStatus"));
			item.setCrossBackupSetFile(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupSetFile"));
			item.setBackupSetScale(_ctx.integerValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupSetScale"));
			item.setCrossBackupSetSize(_ctx.longValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupSetSize"));
			item.setHasBackupTableMeta(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].HasBackupTableMeta"));
			item.setCrossBackupRegion(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupRegion"));
			item.setCategory(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].Category"));
			item.setEngine(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].Engine"));
			item.setBackupMethod(_ctx.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupMethod"));

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