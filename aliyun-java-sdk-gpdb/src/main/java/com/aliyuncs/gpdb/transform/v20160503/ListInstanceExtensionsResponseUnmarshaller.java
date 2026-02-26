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

package com.aliyuncs.gpdb.transform.v20160503;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.gpdb.model.v20160503.ListInstanceExtensionsResponse;
import com.aliyuncs.gpdb.model.v20160503.ListInstanceExtensionsResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstanceExtensionsResponseUnmarshaller {

	public static ListInstanceExtensionsResponse unmarshall(ListInstanceExtensionsResponse listInstanceExtensionsResponse, UnmarshallerContext _ctx) {
		
		listInstanceExtensionsResponse.setRequestId(_ctx.stringValue("ListInstanceExtensionsResponse.RequestId"));
		listInstanceExtensionsResponse.setTotalRecordCount(_ctx.integerValue("ListInstanceExtensionsResponse.TotalRecordCount"));
		listInstanceExtensionsResponse.setPageNumber(_ctx.integerValue("ListInstanceExtensionsResponse.PageNumber"));
		listInstanceExtensionsResponse.setPageRecordCount(_ctx.integerValue("ListInstanceExtensionsResponse.PageRecordCount"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListInstanceExtensionsResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setExtensionId(_ctx.stringValue("ListInstanceExtensionsResponse.Items["+ i +"].ExtensionId"));
			itemsItem.setName(_ctx.stringValue("ListInstanceExtensionsResponse.Items["+ i +"].Name"));
			itemsItem.setInstalledDatabases(_ctx.stringValue("ListInstanceExtensionsResponse.Items["+ i +"].InstalledDatabases"));
			itemsItem.setCurrentVersion(_ctx.stringValue("ListInstanceExtensionsResponse.Items["+ i +"].CurrentVersion"));
			itemsItem.setLatestVersion(_ctx.stringValue("ListInstanceExtensionsResponse.Items["+ i +"].LatestVersion"));
			itemsItem.setStatus(_ctx.stringValue("ListInstanceExtensionsResponse.Items["+ i +"].Status"));
			itemsItem.setDescription(_ctx.stringValue("ListInstanceExtensionsResponse.Items["+ i +"].Description"));
			itemsItem.setIsInstallNeedRestart(_ctx.booleanValue("ListInstanceExtensionsResponse.Items["+ i +"].IsInstallNeedRestart"));

			items.add(itemsItem);
		}
		listInstanceExtensionsResponse.setItems(items);
	 
	 	return listInstanceExtensionsResponse;
	}
}