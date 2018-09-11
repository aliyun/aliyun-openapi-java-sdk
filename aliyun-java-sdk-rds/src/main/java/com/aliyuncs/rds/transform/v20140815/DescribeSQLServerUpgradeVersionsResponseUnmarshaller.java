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

import com.aliyuncs.rds.model.v20140815.DescribeSQLServerUpgradeVersionsResponse;
import com.aliyuncs.rds.model.v20140815.DescribeSQLServerUpgradeVersionsResponse.Item;
import com.aliyuncs.rds.model.v20140815.DescribeSQLServerUpgradeVersionsResponse.Item.SQLServerUpgradeVersion;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeSQLServerUpgradeVersionsResponseUnmarshaller {

	public static DescribeSQLServerUpgradeVersionsResponse unmarshall(DescribeSQLServerUpgradeVersionsResponse describeSQLServerUpgradeVersionsResponse, UnmarshallerContext context) {
		
		describeSQLServerUpgradeVersionsResponse.setRequestId(context.stringValue("DescribeSQLServerUpgradeVersionsResponse.RequestId"));

		List<Item> items = new ArrayList<Item>();
		for (int i = 0; i < context.lengthValue("DescribeSQLServerUpgradeVersionsResponse.Items.Length"); i++) {
			Item item = new Item();
			item.setCurrentVersion(context.stringValue("DescribeSQLServerUpgradeVersionsResponse.Items["+ i +"].CurrentVersion"));

			List<SQLServerUpgradeVersion> sQLServerUpgradeVersions = new ArrayList<SQLServerUpgradeVersion>();
			for (int j = 0; j < context.lengthValue("DescribeSQLServerUpgradeVersionsResponse.Items["+ i +"].SQLServerUpgradeVersions.Length"); j++) {
				SQLServerUpgradeVersion sQLServerUpgradeVersion = new SQLServerUpgradeVersion();
				sQLServerUpgradeVersion.setVersion(context.stringValue("DescribeSQLServerUpgradeVersionsResponse.Items["+ i +"].SQLServerUpgradeVersions["+ j +"].Version"));
				sQLServerUpgradeVersion.setEnableUpgrade(context.stringValue("DescribeSQLServerUpgradeVersionsResponse.Items["+ i +"].SQLServerUpgradeVersions["+ j +"].EnableUpgrade"));

				sQLServerUpgradeVersions.add(sQLServerUpgradeVersion);
			}
			item.setSQLServerUpgradeVersions(sQLServerUpgradeVersions);

			items.add(item);
		}
		describeSQLServerUpgradeVersionsResponse.setItems(items);
	 
	 	return describeSQLServerUpgradeVersionsResponse;
	}
}