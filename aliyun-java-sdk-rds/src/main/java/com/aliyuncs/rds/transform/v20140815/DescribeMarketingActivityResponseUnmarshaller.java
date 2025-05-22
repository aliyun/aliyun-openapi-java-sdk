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

import com.aliyuncs.rds.model.v20140815.DescribeMarketingActivityResponse;
import com.aliyuncs.rds.model.v20140815.DescribeMarketingActivityResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeMarketingActivityResponseUnmarshaller {

	public static DescribeMarketingActivityResponse unmarshall(DescribeMarketingActivityResponse describeMarketingActivityResponse, UnmarshallerContext _ctx) {
		
		describeMarketingActivityResponse.setRequestId(_ctx.stringValue("DescribeMarketingActivityResponse.RequestId"));
		describeMarketingActivityResponse.setAliUid(_ctx.longValue("DescribeMarketingActivityResponse.AliUid"));
		describeMarketingActivityResponse.setBid(_ctx.stringValue("DescribeMarketingActivityResponse.Bid"));
		describeMarketingActivityResponse.setRegionId(_ctx.stringValue("DescribeMarketingActivityResponse.RegionId"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMarketingActivityResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setCategory(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].Category"));
			itemsItem.setChargeType(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].ChargeType"));
			itemsItem.setClassCode(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].ClassCode"));
			itemsItem.setClassGroup(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].ClassGroup"));
			itemsItem.setCpu(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].Cpu"));
			itemsItem.setDiskSize(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].DiskSize"));
			itemsItem.setEngine(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].Engine"));
			itemsItem.setEngineVersion(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].EngineVersion"));
			itemsItem.setInstanceId(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].InstanceId"));
			itemsItem.setInstanceName(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].InstanceName"));
			itemsItem.setMaxConnections(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].MaxConnections"));
			itemsItem.setMaxIombps(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].MaxIombps"));
			itemsItem.setMaxIops(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].MaxIops"));
			itemsItem.setMemory(_ctx.longValue("DescribeMarketingActivityResponse.Items["+ i +"].Memory"));
			itemsItem.setStorageType(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].StorageType"));
			itemsItem.setUpgradeCategory(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeCategory"));
			itemsItem.setUpgradeClassCode(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeClassCode"));
			itemsItem.setUpgradeClassGroup(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeClassGroup"));
			itemsItem.setUpgradeCpu(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeCpu"));
			itemsItem.setUpgradeDescContent(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeDescContent"));
			itemsItem.setUpgradeDiskSize(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeDiskSize"));
			itemsItem.setUpgradeMaxConnections(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeMaxConnections"));
			itemsItem.setUpgradeMaxIombps(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeMaxIombps"));
			itemsItem.setUpgradeMaxIops(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeMaxIops"));
			itemsItem.setUpgradeMemory(_ctx.longValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeMemory"));
			itemsItem.setUpgradeReferencePrice(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeReferencePrice"));
			itemsItem.setUpgradeStorageType(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeStorageType"));

			items.add(itemsItem);
		}
		describeMarketingActivityResponse.setItems(items);
	 
	 	return describeMarketingActivityResponse;
	}
}