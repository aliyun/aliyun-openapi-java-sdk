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

	public static DescribeCrossRegionBackupDBInstanceResponse unmarshall(DescribeCrossRegionBackupDBInstanceResponse describeCrossRegionBackupDBInstanceResponse, UnmarshallerContext _ctx) {
		
		describeCrossRegionBackupDBInstanceResponse.setRequestId(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.RequestId"));
		describeCrossRegionBackupDBInstanceResponse.setTotalRecords(_ctx.integerValue("DescribeCrossRegionBackupDBInstanceResponse.TotalRecords"));
		describeCrossRegionBackupDBInstanceResponse.setItemsNumbers(_ctx.integerValue("DescribeCrossRegionBackupDBInstanceResponse.ItemsNumbers"));
		describeCrossRegionBackupDBInstanceResponse.setPageSize(_ctx.integerValue("DescribeCrossRegionBackupDBInstanceResponse.PageSize"));
		describeCrossRegionBackupDBInstanceResponse.setPageNumber(_ctx.integerValue("DescribeCrossRegionBackupDBInstanceResponse.PageNumber"));
		describeCrossRegionBackupDBInstanceResponse.setRegionId(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.RegionId"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCrossRegionBackupDBInstanceResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setRelServiceId(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].RelServiceId"));
			item.setLogBackupEnabledTime(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].LogBackupEnabledTime"));
			item.setDBInstanceStatusDesc(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].DBInstanceStatusDesc"));
			item.setRelService(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].RelService"));
			item.setBackupEnabled(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].BackupEnabled"));
			item.setDBInstanceStatus(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].DBInstanceStatus"));
			item.setLockMode(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].LockMode"));
			item.setEngineVersion(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].EngineVersion"));
			item.setLogBackupEnabled(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].LogBackupEnabled"));
			item.setRetentType(_ctx.integerValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].RetentType"));
			item.setRetention(_ctx.integerValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].Retention"));
			item.setCrossBackupType(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].CrossBackupType"));
			item.setCrossBackupRegion(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].CrossBackupRegion"));
			item.setDBInstanceId(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].DBInstanceId"));
			item.setEngine(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].Engine"));
			item.setBackupEnabledTime(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].BackupEnabledTime"));
			item.setDBInstanceDescription(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].DBInstanceDescription"));

			items.add(item);
		}
		describeCrossRegionBackupDBInstanceResponse.setItems(items);
	 
	 	return describeCrossRegionBackupDBInstanceResponse;
	}
}