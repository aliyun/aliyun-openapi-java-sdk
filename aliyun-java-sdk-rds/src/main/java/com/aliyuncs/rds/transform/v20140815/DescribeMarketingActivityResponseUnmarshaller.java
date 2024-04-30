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
		describeMarketingActivityResponse.setRegionId(_ctx.stringValue("DescribeMarketingActivityResponse.RegionId"));
		describeMarketingActivityResponse.setBid(_ctx.stringValue("DescribeMarketingActivityResponse.Bid"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeMarketingActivityResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setInstanceId(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].InstanceId"));
			itemsItem.setInstanceName(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].InstanceName"));
			itemsItem.setClassCode(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].ClassCode"));
			itemsItem.setDiskSize(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].DiskSize"));
			itemsItem.setMemory(_ctx.longValue("DescribeMarketingActivityResponse.Items["+ i +"].Memory"));
			itemsItem.setCpu(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].Cpu"));
			itemsItem.setCategory(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].Category"));
			itemsItem.setStorageType(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].StorageType"));
			itemsItem.setClassGroup(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].ClassGroup"));
			itemsItem.setMaxIombps(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].MaxIombps"));
			itemsItem.setMaxIops(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].MaxIops"));
			itemsItem.setMaxConnections(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].MaxConnections"));
			itemsItem.setUpgradeClassCode(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeClassCode"));
			itemsItem.setUpgradeDiskSize(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeDiskSize"));
			itemsItem.setUpgradeMemory(_ctx.longValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeMemory"));
			itemsItem.setUpgradeCpu(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeCpu"));
			itemsItem.setUpgradeCategory(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeCategory"));
			itemsItem.setUpgradeStorageType(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeStorageType"));
			itemsItem.setUpgradeClassGroup(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeClassGroup"));
			itemsItem.setUpgradeMaxIombps(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeMaxIombps"));
			itemsItem.setUpgradeMaxIops(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeMaxIops"));
			itemsItem.setUpgradeMaxConnections(_ctx.integerValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeMaxConnections"));
			itemsItem.setUpgradeDescContent(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeDescContent"));
			itemsItem.setUpgradeReferencePrice(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].UpgradeReferencePrice"));
			itemsItem.setChargeType(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].ChargeType"));
			itemsItem.setEngine(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].Engine"));
			itemsItem.setEngineVersion(_ctx.stringValue("DescribeMarketingActivityResponse.Items["+ i +"].EngineVersion"));

			items.add(itemsItem);
		}
		describeMarketingActivityResponse.setItems(items);
	 
	 	return describeMarketingActivityResponse;
	}
}