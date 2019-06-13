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

	public static DescribeCrossRegionBackupsResponse unmarshall(DescribeCrossRegionBackupsResponse describeCrossRegionBackupsResponse, UnmarshallerContext context) {
		
		describeCrossRegionBackupsResponse.setRequestId(context.stringValue("DescribeCrossRegionBackupsResponse.RequestId"));
		describeCrossRegionBackupsResponse.setRegionId(context.stringValue("DescribeCrossRegionBackupsResponse.RegionId"));
		describeCrossRegionBackupsResponse.setStartTime(context.stringValue("DescribeCrossRegionBackupsResponse.StartTime"));
		describeCrossRegionBackupsResponse.setEndTime(context.stringValue("DescribeCrossRegionBackupsResponse.EndTime"));
		describeCrossRegionBackupsResponse.setTotalRecordCount(context.integerValue("DescribeCrossRegionBackupsResponse.TotalRecordCount"));
		describeCrossRegionBackupsResponse.setPageRecordCount(context.integerValue("DescribeCrossRegionBackupsResponse.PageRecordCount"));
		describeCrossRegionBackupsResponse.setPageNumber(context.integerValue("DescribeCrossRegionBackupsResponse.PageNumber"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeCrossRegionBackupsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setCrossBackupId(context.integerValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupId"));
			item.setCrossBackupRegion(context.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupRegion"));
			item.setBackupSetStatus(context.integerValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupSetStatus"));
			item.setBackupStartTime(context.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupStartTime"));
			item.setBackupEndTime(context.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupEndTime"));
			item.setBackupType(context.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupType"));
			item.setBackupMethod(context.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupMethod"));
			item.setCrossBackupSetSize(context.longValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupSetSize"));
			item.setCrossBackupSetFile(context.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupSetFile"));
			item.setCrossBackupDownloadLink(context.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupDownloadLink"));
			item.setEngine(context.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].Engine"));
			item.setEngineVersion(context.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].EngineVersion"));
			item.setCrossBackupSetLocation(context.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].CrossBackupSetLocation"));
			item.setBackupSetScale(context.integerValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].BackupSetScale"));
			item.setInstanceId(context.integerValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].InstanceId"));
			item.setDBInstanceStorageType(context.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].DBInstanceStorageType"));
			item.setCategory(context.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].Category"));
			item.setConsistentTime(context.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].ConsistentTime"));

			List<String> restoreRegions = new ArrayList<String>();
			for (int j = 0; j < context.lengthValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].RestoreRegions.Length"); j++) {
				restoreRegions.add(context.stringValue("DescribeCrossRegionBackupsResponse.Items["+ i +"].RestoreRegions["+ j +"]"));
			}
			item.setRestoreRegions(restoreRegions);

			items.add(item);
		}
		describeCrossRegionBackupsResponse.setItems(items);
	 
	 	return describeCrossRegionBackupsResponse;
	}
}