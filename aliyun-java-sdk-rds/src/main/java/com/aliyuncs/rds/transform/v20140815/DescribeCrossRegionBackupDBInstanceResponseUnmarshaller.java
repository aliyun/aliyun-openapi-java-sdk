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

import com.aliyuncs.rds.model.v20140815.DescribeCrossRegionBackupDBInstanceResponse;
import com.aliyuncs.rds.model.v20140815.DescribeCrossRegionBackupDBInstanceResponse.Item;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeCrossRegionBackupDBInstanceResponseUnmarshaller {

	public static DescribeCrossRegionBackupDBInstanceResponse unmarshall(DescribeCrossRegionBackupDBInstanceResponse describeCrossRegionBackupDBInstanceResponse, UnmarshallerContext context) {
		
		describeCrossRegionBackupDBInstanceResponse.setRequestId(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.RequestId"));
		describeCrossRegionBackupDBInstanceResponse.setRegionId(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.RegionId"));
		describeCrossRegionBackupDBInstanceResponse.setTotalRecords(context.integerValue("DescribeCrossRegionBackupDBInstanceResponse.TotalRecords"));
		describeCrossRegionBackupDBInstanceResponse.setPageSize(context.integerValue("DescribeCrossRegionBackupDBInstanceResponse.PageSize"));
		describeCrossRegionBackupDBInstanceResponse.setPageNumber(context.integerValue("DescribeCrossRegionBackupDBInstanceResponse.PageNumber"));
		describeCrossRegionBackupDBInstanceResponse.setItemsNumbers(context.integerValue("DescribeCrossRegionBackupDBInstanceResponse.ItemsNumbers"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeCrossRegionBackupDBInstanceResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setDBInstanceId(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].DBInstanceId"));
			item.setDBInstanceDescription(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].DBInstanceDescription"));
			item.setDBInstanceStatus(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].DBInstanceStatus"));
			item.setDBInstanceStatusDesc(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].DBInstanceStatusDesc"));
			item.setEngine(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].Engine"));
			item.setEngineVersion(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].EngineVersion"));
			item.setCrossBackupRegion(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].CrossBackupRegion"));
			item.setCrossBackupType(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].CrossBackupType"));
			item.setBackupEnabled(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].BackupEnabled"));
			item.setLogBackupEnabled(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].LogBackupEnabled"));
			item.setLogBackupEnabledTime(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].LogBackupEnabledTime"));
			item.setBackupEnabledTime(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].BackupEnabledTime"));
			item.setRetentType(context.integerValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].RetentType"));
			item.setRetention(context.integerValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].Retention"));
			item.setLockMode(context.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].LockMode"));

			items.add(item);
		}
		describeCrossRegionBackupDBInstanceResponse.setItems(items);
	 
	 	return describeCrossRegionBackupDBInstanceResponse;
	}
}