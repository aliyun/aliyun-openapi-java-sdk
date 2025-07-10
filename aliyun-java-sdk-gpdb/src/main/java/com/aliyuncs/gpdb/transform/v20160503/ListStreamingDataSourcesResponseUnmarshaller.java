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

import com.aliyuncs.gpdb.model.v20160503.ListStreamingDataSourcesResponse;
import com.aliyuncs.gpdb.model.v20160503.ListStreamingDataSourcesResponse.DataSourceItemsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListStreamingDataSourcesResponseUnmarshaller {

	public static ListStreamingDataSourcesResponse unmarshall(ListStreamingDataSourcesResponse listStreamingDataSourcesResponse, UnmarshallerContext _ctx) {
		
		listStreamingDataSourcesResponse.setRequestId(_ctx.stringValue("ListStreamingDataSourcesResponse.RequestId"));
		listStreamingDataSourcesResponse.setTotalRecordCount(_ctx.integerValue("ListStreamingDataSourcesResponse.TotalRecordCount"));
		listStreamingDataSourcesResponse.setPageNumber(_ctx.integerValue("ListStreamingDataSourcesResponse.PageNumber"));

		List<DataSourceItemsItem> dataSourceItems = new ArrayList<DataSourceItemsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListStreamingDataSourcesResponse.DataSourceItems.Length"); i++) {
			DataSourceItemsItem dataSourceItemsItem = new DataSourceItemsItem();
			dataSourceItemsItem.setDataSourceId(_ctx.integerValue("ListStreamingDataSourcesResponse.DataSourceItems["+ i +"].DataSourceId"));
			dataSourceItemsItem.setDataSourceName(_ctx.stringValue("ListStreamingDataSourcesResponse.DataSourceItems["+ i +"].DataSourceName"));
			dataSourceItemsItem.setDataSourceType(_ctx.stringValue("ListStreamingDataSourcesResponse.DataSourceItems["+ i +"].DataSourceType"));
			dataSourceItemsItem.setDataSourceConfig(_ctx.stringValue("ListStreamingDataSourcesResponse.DataSourceItems["+ i +"].DataSourceConfig"));
			dataSourceItemsItem.setDataSourceDescription(_ctx.stringValue("ListStreamingDataSourcesResponse.DataSourceItems["+ i +"].DataSourceDescription"));
			dataSourceItemsItem.setCreateTime(_ctx.stringValue("ListStreamingDataSourcesResponse.DataSourceItems["+ i +"].CreateTime"));
			dataSourceItemsItem.setModifyTime(_ctx.stringValue("ListStreamingDataSourcesResponse.DataSourceItems["+ i +"].ModifyTime"));
			dataSourceItemsItem.setStatus(_ctx.stringValue("ListStreamingDataSourcesResponse.DataSourceItems["+ i +"].Status"));
			dataSourceItemsItem.setServiceId(_ctx.integerValue("ListStreamingDataSourcesResponse.DataSourceItems["+ i +"].ServiceId"));
			dataSourceItemsItem.setErrorMessage(_ctx.stringValue("ListStreamingDataSourcesResponse.DataSourceItems["+ i +"].ErrorMessage"));

			dataSourceItems.add(dataSourceItemsItem);
		}
		listStreamingDataSourcesResponse.setDataSourceItems(dataSourceItems);
	 
	 	return listStreamingDataSourcesResponse;
	}
}