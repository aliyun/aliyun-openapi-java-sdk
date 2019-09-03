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
		describeCrossRegionBackupDBInstanceResponse.setRegionId(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.RegionId"));
		describeCrossRegionBackupDBInstanceResponse.setTotalRecords(_ctx.integerValue("DescribeCrossRegionBackupDBInstanceResponse.TotalRecords"));
		describeCrossRegionBackupDBInstanceResponse.setPageSize(_ctx.integerValue("DescribeCrossRegionBackupDBInstanceResponse.PageSize"));
		describeCrossRegionBackupDBInstanceResponse.setPageNumber(_ctx.integerValue("DescribeCrossRegionBackupDBInstanceResponse.PageNumber"));
		describeCrossRegionBackupDBInstanceResponse.setItemsNumbers(_ctx.integerValue("DescribeCrossRegionBackupDBInstanceResponse.ItemsNumbers"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < _ctx.lengthValue("DescribeCrossRegionBackupDBInstanceResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setDBInstanceId(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].DBInstanceId"));
			item.setDBInstanceDescription(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].DBInstanceDescription"));
			item.setDBInstanceStatus(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].DBInstanceStatus"));
			item.setDBInstanceStatusDesc(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].DBInstanceStatusDesc"));
			item.setEngine(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].Engine"));
			item.setEngineVersion(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].EngineVersion"));
			item.setCrossBackupRegion(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].CrossBackupRegion"));
			item.setCrossBackupType(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].CrossBackupType"));
			item.setBackupEnabled(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].BackupEnabled"));
			item.setLogBackupEnabled(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].LogBackupEnabled"));
			item.setLogBackupEnabledTime(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].LogBackupEnabledTime"));
			item.setBackupEnabledTime(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].BackupEnabledTime"));
			item.setRetentType(_ctx.integerValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].RetentType"));
			item.setRetention(_ctx.integerValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].Retention"));
			item.setLockMode(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].LockMode"));
			item.setRelService(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].RelService"));
			item.setRelServiceId(_ctx.stringValue("DescribeCrossRegionBackupDBInstanceResponse.Items["+ i +"].RelServiceId"));

			items.add(item);
		}
		describeCrossRegionBackupDBInstanceResponse.setItems(items);
	 
	 	return describeCrossRegionBackupDBInstanceResponse;
	}
}