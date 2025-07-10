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

import com.aliyuncs.gpdb.model.v20160503.ListExternalDataSourcesResponse;
import com.aliyuncs.gpdb.model.v20160503.ListExternalDataSourcesResponse.ItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListExternalDataSourcesResponseUnmarshaller {

	public static ListExternalDataSourcesResponse unmarshall(ListExternalDataSourcesResponse listExternalDataSourcesResponse, UnmarshallerContext _ctx) {
		
		listExternalDataSourcesResponse.setRequestId(_ctx.stringValue("ListExternalDataSourcesResponse.RequestId"));
		listExternalDataSourcesResponse.setTotalRecordCount(_ctx.integerValue("ListExternalDataSourcesResponse.TotalRecordCount"));
		listExternalDataSourcesResponse.setPageNumber(_ctx.integerValue("ListExternalDataSourcesResponse.PageNumber"));

		List<ItemsItem> items = new ArrayList<ItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListExternalDataSourcesResponse.Items.Length"); i++) {
			ItemsItem itemsItem = new ItemsItem();
			itemsItem.setDataSourceId(_ctx.integerValue("ListExternalDataSourcesResponse.Items["+ i +"].DataSourceId"));
			itemsItem.setDataSourceName(_ctx.stringValue("ListExternalDataSourcesResponse.Items["+ i +"].DataSourceName"));
			itemsItem.setDataSourceType(_ctx.stringValue("ListExternalDataSourcesResponse.Items["+ i +"].DataSourceType"));
			itemsItem.setDataSourceDescription(_ctx.stringValue("ListExternalDataSourcesResponse.Items["+ i +"].DataSourceDescription"));
			itemsItem.setCreateTime(_ctx.stringValue("ListExternalDataSourcesResponse.Items["+ i +"].CreateTime"));
			itemsItem.setModifyTime(_ctx.stringValue("ListExternalDataSourcesResponse.Items["+ i +"].ModifyTime"));
			itemsItem.setDataSourceStatus(_ctx.stringValue("ListExternalDataSourcesResponse.Items["+ i +"].DataSourceStatus"));
			itemsItem.setStatusMessage(_ctx.stringValue("ListExternalDataSourcesResponse.Items["+ i +"].StatusMessage"));
			itemsItem.setDataSourceDir(_ctx.stringValue("ListExternalDataSourcesResponse.Items["+ i +"].DataSourceDir"));
			itemsItem.setExternalDataServiceId(_ctx.integerValue("ListExternalDataSourcesResponse.Items["+ i +"].ExternalDataServiceId"));

			items.add(itemsItem);
		}
		listExternalDataSourcesResponse.setItems(items);
	 
	 	return listExternalDataSourcesResponse;
	}
}